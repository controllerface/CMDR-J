package com.controllerface.cmdr_j.classes.core;

import com.controllerface.cmdr_j.enums.journal.JournalEvent;
import com.controllerface.cmdr_j.utilities.JSONSupport;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.servlets.EventSource;
import org.eclipse.jetty.servlets.EventSourceServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.controllerface.cmdr_j.classes.core.JournalUI.*;

public class JournalServlet extends EventSourceServlet
{
    private final Set<JournalSource> sources = Collections.synchronizedSet(new HashSet<>());

    private final GameState gameState;

    private static final AtomicBoolean importing = new AtomicBoolean(false);

    private class JournalSource implements EventSource
    {
        private final String remoteHost;
        private Emitter emitter;

        private JournalSource(String remoteHost)
        {
            this.remoteHost = remoteHost;
        }


        @Override
        public void onOpen(Emitter emitter)
        {
            this.emitter = emitter;
            sources.add(this);
            System.out.println("Client Connected: " + remoteHost);
            BiConsumer<String, String> emitterUpdate = makeEmitterUpdate(this);
            gameState.emitCurrentState(emitterUpdate);
        }

        @Override
        public void onClose()
        {
            try
            {
                System.out.println("Client Disconnected: " + remoteHost);
                emitter.close();
            }
            catch (Exception e)
            {
                // ignore
            }
            finally
            {
                sources.remove(this);
            }
        }
    }

    private static class PoiRequest
    {
        private final long address;
        private final String poiData;

        private PoiRequest(long address, String poiData)
        {
            this.address = address;
            this.poiData = poiData;
        }
    }

    private enum EndPoint
    {
        /**
         * Default endpoint handler called when nothing matches.
         */
        NOT_FOUND(EndpointType.ANY, (x) -> false, (_r, response, _p) ->
        {
            writeErrorResponse(response, HttpStatus.Code.NOT_FOUND);
        }),

        /**
         * Returns the player's current loadout information.
         */
        LOADOUT(EndpointType.GET, "/loadout", (_r, response, playerState) ->
        {
            writeJsonResponse(response, playerState.writeLoadoutJson());
        }),

        /**
         * Returns the player's current extended stats information.
         */
        STATISTICS(EndpointType.GET, "/statistics", (_r, response, playerState) ->
        {
            writeJsonResponse(response, playerState.writeExtendedStatsJson());
        }),

        OUTFITTING(EndpointType.GET, "/outfitting", (_r, response, playerState) ->
        {
            writeJsonResponse(response, playerState.writeOutfittingData());
        }),

        SHIPYARD(EndpointType.GET, "/shipyard", (_r, response, playerState) ->
        {
            writeJsonResponse(response, playerState.writeShipyardData());
        }),

        /**
         * Returns the market data from the most recently visited market.
         */
        MARKET(EndpointType.GET, "/market", (request, response, playerState) ->
        {
            var id = request.getParameter("id");
            var type = request.getParameter("type");
            var price = request.getParameter("price");
            var comparison = request.getParameter("comparison");

            if (type != null && type.equalsIgnoreCase("listing"))
            {
                writeJsonResponse(response, playerState.writeItemListing());
            }
            if (type != null && type.equalsIgnoreCase("search"))
            {
                try
                {
                    var itemId = Long.parseLong(id);
                    writeJsonResponse(response, playerState.writeItemQueryData(itemId));
                }
                catch (Exception e)
                {
                    writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
                }
            }
            else if (id == null)
            {
                writeJsonResponse(response, playerState.writeMarketData());
            }
            else if (type == null || price == null || comparison == null)
            {
                writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
            }
            else
            {
                long itemid;
                long basePrice;
                boolean difference;
                try
                {
                    itemid = Long.parseLong(id);
                    basePrice = Long.parseLong(price);
                    difference = comparison.equalsIgnoreCase("difference");
                }
                catch (Exception e)
                {
                    writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
                    return;
                }

                boolean isExport = false;
                if (type.equalsIgnoreCase("export"))
                {
                    isExport = true;
                }

                writeJsonResponse(response, playerState.writeMarketQueryData(itemid, basePrice, isExport, difference));
            }
        }),

        /**
         * Returns the list of cataloged star systems the player has visited.
         */
        CATALOG(EndpointType.GET, "/catalog", (_r, response, playerState) ->
        {
            writeJsonResponse(response, playerState.writeCatalogList());
        }),

        /**
         * Returns cartographic data for the requested star system.
         */
        CARTOGRAPHY(EndpointType.GET, "/cartography", (request, response, playerState) ->
        {
            var id = request.getParameter("id");
            var systemAddress = Long.parseLong(id);
            writeJsonResponse(response, playerState.writeCartographicData(systemAddress));
        }),

        /**
         * Initiates an import of exploration data from the player's journal files
         */
        IMPORT(EndpointType.GET, "/import", (_r, response, playerState) ->
        {
            importExplorationData(playerState);
            writeCreatedResponse(response,"Import Complete");
        }),

        /**
         * Creates a waypoint at the player's current location.
         */
        WAYPOINT(EndpointType.GET, "/waypoint", (request, response, playerState) ->
        {
            var toRemove = request.getParameter("remove");
            var toRename = request.getParameter("rename");
            var newName = request.getParameter("name");

            if (toRemove == null && toRename == null)
            {
                if (playerState.createWaypoint())
                {
                    writeCreatedResponse(response,"Waypoint created");
                }
                else
                {
                    writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
                }
            }
            else if (toRemove != null)
            {
                if (playerState.deleteWaypoint(toRemove))
                {
                    writeCreatedResponse(response,"Waypoint deleted");
                }
                else
                {
                    writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
                }
            }
            else
            {
                if (playerState.renameWaypoint(toRename, newName))
                {
                    writeCreatedResponse(response,"Waypoint renamed");
                }
                else
                {
                    writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
                }
            }
        }),

        /**
         * Sets or clears a local (on-planet) waypoint for tracking
         */
        TRACK(EndpointType.GET, "/track", (request, response, playerState) ->
        {
            var target = request.getParameter("target");

            if (target == null)
            {
                writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
                return;
            }

            if (target.equalsIgnoreCase("clear"))
            {
                playerState.clearTrackedLocation();
            }
            else
            {
                playerState.setTrackedLocation(target);
            }

            writeCreatedResponse(response, "Tracking updated");
        }),

        /**
         * Handles requests related to POI notes
         */
        POI(EndpointType.POST, "/poi", (request, response, playerState) ->
        {
            var action = request.getParameter("action");
            long address = -1L;
            switch (action)
            {
                case "add":
                    address = addPoi(request, playerState);
                    break;

                case "delete":
                    address = deletePoi(request, playerState);
                    break;
            }

            if (address != -1)
            {
                writeCreatedResponse(response, "POI Data Updated");
                playerState.emitCartographyIfCurrent(address);
            }
            else
            {
                writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
            }
        }),

        /**
         * Initiates an import of exploration data from the player's journal files
         */
        TASKS(EndpointType.GET, "/tasks", (request, response, playerState) ->
        {
            var key = request.getParameter("key");
            var type = request.getParameter("type");

            if (type == null)
            {
                writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
            }
            else
            {
                if (key == null)
                {
                    if (type.equalsIgnoreCase("catalog"))
                    {
                        writeJsonResponse(response, playerState.writeTaskCatalog());
                    }
                    else if (type.equalsIgnoreCase("materials"))
                    {
                        writeJsonResponse(response, playerState.writeTaskMaterials());
                    }
                    else
                    {
                        writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
                    }
                }
                else
                {
                    var result = playerState.adjustTask(key, type);
                    if (result)
                    {
                        writeCreatedResponse(response, "Task Adjusted");
                    }
                    else
                    {
                        writeErrorResponse(response, HttpStatus.Code.BAD_REQUEST);
                    }
                }
            }
        }),

        /**
         * Serves static assets defined in the asset map.
         */
        STATIC_ASSET(EndpointType.GET, staticAssets::containsKey, (request, response, _p) ->
        {
            writeResourceResponse(response, staticAssets.get(request.getRequestURI()));
        });

        private final EndpointType type;
        private final Predicate<String> checkUri;
        private final EndpointHandler endpoint;

        EndPoint(EndpointType type,
                 String uri,
                 EndpointHandler endpoint)
        {
            this(type, (requestUri) -> requestUri.equals(uri), endpoint);
        }

        EndPoint(EndpointType type,
                 Predicate<String> checkUri,
                 EndpointHandler endpoint)
        {
            this.type = type;
            this.checkUri = checkUri;
            this.endpoint = endpoint;
        }

        public void accept(HttpServletRequest request, HttpServletResponse response, GameState gameState)
        {
            this.endpoint.respond(request, response, gameState);
        }

        public EndpointType getType()
        {
            return type;
        }

        public static EndPoint fromUri(String uri)
        {
            return Arrays.stream(EndPoint.values())
                .filter(endpoint -> endpoint.checkUri.test(uri))
                .findFirst().orElse(NOT_FOUND);
        }
    }

    public JournalServlet()
    {
        gameState = new GameState(this::sendEvent);
    }

    public GameState getGameState()
    {
        return gameState;
    }

    private static PoiRequest readPoiRequest(HttpServletRequest request)
    {
        var poiText = "";
        var systemAddress = 0L;
        try
        {
            var parts = request.getParts();
            for (Part part : parts)
            {
                var name = part.getName();
                var streamReader = new InputStreamReader(part.getInputStream());
                var buffer = new BufferedReader(streamReader);
                var input = buffer.lines().collect(Collectors.joining("\n"));
                if (name.equals("id"))
                {
                    systemAddress = Long.parseLong(input);
                }
                else if (name.equals("poi"))
                {
                    poiText = input;
                }
            }
        }
        catch (Exception e)
        {
            return null;
        }
        return new PoiRequest(systemAddress, poiText);
    }

    private static void importExplorationData(GameState gameState)
    {
        importing.set(true);
        try
        {
            Arrays.stream(JournalSyncTask.listJournalFiles())
                .sorted(JournalSyncTask.oldestJournalFile)
                .flatMap(JournalSyncTask::readLines)
                .map(JSONSupport.Parse.jsonString)
                .filter(event ->
                {
                    var eventName = ((String) event.get("event"));
                    if (eventName == null) return false;
                    return eventName.equalsIgnoreCase("Scan")
                        || eventName.equalsIgnoreCase("FSSAllBodiesFound")
                        || eventName.equalsIgnoreCase("FSSDiscoveryScan")
                        || eventName.equalsIgnoreCase("FSDJump")
                        || eventName.equalsIgnoreCase("SAAScanComplete")
                        || eventName.equalsIgnoreCase("Location");
                })
                .filter(event -> event.get("SystemAddress") != null)
                .forEach(event ->
                {
                    var eventName = ((String) event.get("event"));
                    if (eventName.equalsIgnoreCase("Location"))
                    {
                        if (event.get("BodyID") == null) return;
                        JournalEvent.Location.process(gameState, event);
                    }
                    else if (eventName.equalsIgnoreCase("FSDJump"))
                    {
                        if (event.get("BodyID") == null) return;
                        JournalEvent.FSDJump.process(gameState, event);
                    }
                    else if (eventName.equalsIgnoreCase("Scan"))
                    {
                        if (event.get("BodyID") == null) return;
                        JournalEvent.Scan.process(gameState, event);
                    }
                    else if (eventName.equalsIgnoreCase("SAAScanComplete"))
                    {
                        if (event.get("BodyID") == null) return;
                        JournalEvent.SAAScanComplete.process(gameState, event);
                    }
                    else if (eventName.equalsIgnoreCase("SAASignalsFound"))
                    {
                        if (event.get("BodyID") == null) return;
                        JournalEvent.SAASignalsFound.process(gameState, event);
                    }
                    else if (eventName.equalsIgnoreCase("FSSAllBodiesFound"))
                    {
                        JournalEvent.FSSAllBodiesFound.process(gameState, event);
                    }
                    else if (eventName.equalsIgnoreCase("FSSDiscoveryScan"))
                    {
                        JournalEvent.FSSDiscoveryScan.process(gameState, event);
                    }
                });
        }
        catch (Exception e)
        {
            System.out.println("Error during import: " + e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            importing.set(false);
            gameState.emitCartographyData();
            gameState.emitSystemCatalog();
        }
    }

    private static long addPoi(HttpServletRequest request, GameState gameState)
    {
        var poiRequest = readPoiRequest(request);

        if (poiRequest == null)
        {
            return -1L;
        }

        if (poiRequest.address == 0L || poiRequest.poiData.isBlank())
        {
            return -1L;
        }

        if (gameState.savePoiData(poiRequest.address, poiRequest.poiData))
        {
            return poiRequest.address;
        }
        else
        {
            return -1L;
        }
    }

    private static long deletePoi(HttpServletRequest request, GameState gameState)
    {
        var poiRequest = readPoiRequest(request);

        if (poiRequest == null)
        {
            return -1L;
        }

        if (poiRequest.address == 0L || poiRequest.poiData.isBlank())
        {
            return -1L;
        }

        if (gameState.deletePoiData(poiRequest.address, poiRequest.poiData))
        {
            return poiRequest.address;
        }
        else
        {
            return -1L;
        }
    }

    /**
     * Generic error handler
     */
    private static void writeErrorResponse(HttpServletResponse response, HttpStatus.Code reason)
    {
        response.setStatus(reason.getCode());
        try (Writer writer = response.getWriter())
        {
            writer.write(reason.getMessage());
        }
        catch (IOException e)
        {
            response.setStatus(500);
        }
    }

    private static void writeResourceResponse(HttpServletResponse response, StaticAsset staticAsset)
    {
        response.setStatus(200);
        response.setHeader("Content-Type", staticAsset.mimetype);
        try (InputStream data = JournalServlet.class.getResourceAsStream(staticAsset.location);
             OutputStream outputStream = response.getOutputStream())
        {
            data.transferTo(outputStream);
        }
        catch (IOException e)
        {
            response.setStatus(500);
        }
    }

    private static void writeJsonResponse(HttpServletResponse response, String json)
    {
        response.setStatus(200);
        response.setHeader("Content-Type", "application/json");
        try (PrintWriter writer = response.getWriter())
        {
            writer.print(json);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void writeCreatedResponse(HttpServletResponse response, String message)
    {
        response.setStatus(201);
        response.setHeader("Content-Type", "text/plain");
        try (OutputStream out = response.getOutputStream())
        {
            out.write(message.getBytes(StandardCharsets.UTF_8));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private BiConsumer<String, String> makeEmitterUpdate(JournalSource source)
    {
        return (name, data) ->
        {
            try
            {
                source.emitter.event(name, data);
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
                source.onClose();
            }
        };
    }

    private void sendEvent(String name, String data)
    {
        if (importing.get()) return;

        Set<JournalSource> toRemove = new HashSet<>();
        synchronized (sources)
        {
            sources.forEach(s ->
            {
                try
                {
                    s.emitter.event(name, data);
                }
                catch (IllegalStateException ise)
                {
                    // this is benign issue, Jetty throws this after
                    // sending event data sometimes, but the connection
                    // still works fine. It appears to be a somewhat
                    // common issue for many other users of the library
                    // I found when googling.
                }
                catch (Exception e)
                {
                    toRemove.add(s);
                }
            });
            toRemove.forEach(JournalSource::onClose);
        }
    }

    //region Public API

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        Enumeration<String> acceptValues = request.getHeaders("Accept");
        while (acceptValues.hasMoreElements())
        {
            if (acceptValues.nextElement().equals("text/event-stream"))
            {
                super.doGet(request, response);
                return;
            }
        }

        EndPoint endpoint = EndPoint.fromUri(request.getRequestURI());
        if (endpoint.getType() == EndpointType.GET || endpoint.getType() == EndpointType.ANY)
        {
            endpoint.accept(request, response, gameState);
        }
        else
        {
            writeErrorResponse(response, HttpStatus.Code.METHOD_NOT_ALLOWED);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        EndPoint endpoint = EndPoint.fromUri(request.getRequestURI());
        if (endpoint.getType() == EndpointType.POST || endpoint.getType() == EndpointType.ANY)
        {
            endpoint.accept(request, response, gameState);
        }
        else
        {
            writeErrorResponse(response, HttpStatus.Code.METHOD_NOT_ALLOWED);
        }
    }

    @Override
    protected EventSource newEventSource(HttpServletRequest request)
    {
        return new JournalSource(request.getRemoteHost());
    }

    //endregion
}
