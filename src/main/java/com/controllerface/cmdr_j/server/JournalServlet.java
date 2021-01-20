package com.controllerface.cmdr_j.server;

import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.servlets.EventSource;
import org.eclipse.jetty.servlets.EventSourceServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

class JournalServlet extends EventSourceServlet
{
    private final Set<JournalSource> sources = ConcurrentHashMap.newKeySet();

    private final PlayerState playerState;

    @FunctionalInterface
    private interface EndpointHandler
    {
        void respond(HttpServletRequest request, HttpServletResponse response, PlayerState playerState);
    }

    private static final Map<String, StaticAsset> staticAssets = Map.ofEntries
        (
            /* HTML */
            Map.entry("/", StaticAsset.make("/ui/html/ui.html")),
            Map.entry("/ui.html", StaticAsset.make("/ui/html/ui.html")),

            /* Fonts */

            Map.entry("/EUROCAPS.ttf", StaticAsset.make("/ui/font/EUROCAPS.ttf")),

            /* CSS */

            Map.entry("/cargo.css", StaticAsset.make("/ui/css/cargo.css")),
            Map.entry("/common.css", StaticAsset.make("/ui/css/common.css")),
            Map.entry("/market.css", StaticAsset.make("/ui/css/market.css")),
            Map.entry("/material.css", StaticAsset.make("/ui/css/material.css")),
            Map.entry("/module.css", StaticAsset.make("/ui/css/module.css")),
            Map.entry("/statistics.css", StaticAsset.make("/ui/css/statistics.css")),
            Map.entry("/ui.css", StaticAsset.make("/ui/css/ui.css")),

            /* Javascript */

            Map.entry("/cargo.js", StaticAsset.make("/ui/js/cargo.js")),
            Map.entry("/commanderStat.js", StaticAsset.make("/ui/js/commanderStat.js")),
            Map.entry("/defenseResistance.js", StaticAsset.make("/ui/js/defenseResistance.js")),
            Map.entry("/defenseStats.js", StaticAsset.make("/ui/js/defenseStats.js")),
            Map.entry("/defenseValue.js", StaticAsset.make("/ui/js/defenseValue.js")),
            Map.entry("/market.js", StaticAsset.make("/ui/js/market.js")),
            Map.entry("/marketEntry.js", StaticAsset.make("/ui/js/marketEntry.js")),
            Map.entry("/material.js", StaticAsset.make("/ui/js/material.js")),
            Map.entry("/moduleBay.js", StaticAsset.make("/ui/js/moduleBay.js")),
            Map.entry("/powerModule.js", StaticAsset.make("/ui/js/powerModule.js")),
            Map.entry("/powerStats.js", StaticAsset.make("/ui/js/powerStats.js")),
            Map.entry("/shipModule.js", StaticAsset.make("/ui/js/shipModule.js")),
            Map.entry("/shipStats.js", StaticAsset.make("/ui/js/shipStats.js")),
            Map.entry("/statCategory.js", StaticAsset.make("/ui/js/statCategory.js")),
            Map.entry("/ui.js", StaticAsset.make("/ui/js/ui.js")),

            /* Images */

            Map.entry("/grade-1.svg", StaticAsset.make("/ui/img/grade-1.svg")),
            Map.entry("/grade-2.svg", StaticAsset.make("/ui/img/grade-2.svg")),
            Map.entry("/grade-3.svg", StaticAsset.make("/ui/img/grade-3.svg")),
            Map.entry("/grade-4.svg", StaticAsset.make("/ui/img/grade-4.svg")),
            Map.entry("/grade-5.svg", StaticAsset.make("/ui/img/grade-5.svg")),
            Map.entry("/planet.svg", StaticAsset.make("/ui/img/planet.svg"))
        );

    private enum EndpointType
    {
        GET,
        //POST, not needed yet
        ANY
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

        /**
         * Returns the market data from the most recently visited market.
         */
        MARKET(EndpointType.GET, "/market", (_r, response, playerState) ->
        {
            writeJsonResponse(response, playerState.writeMarketData());
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

        public void accept(HttpServletRequest request, HttpServletResponse response, PlayerState playerState)
        {
            this.endpoint.respond(request, response, playerState);
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

    private class JournalSource implements EventSource
    {
        private Emitter emitter;

        @Override
        public void onOpen(Emitter emitter)
        {
            this.emitter = emitter;
            sources.add(this);
            BiConsumer<String, String> emitterUpdate = makeEmitterUpdate(this);
            playerState.emitCurrentState(emitterUpdate);
        }

        @Override
        public void onClose()
        {
            emitter.close();
            sources.remove(this);
        }
    }

    JournalServlet()
    {
        playerState = new PlayerState(this::sendEvent);
    }

    public PlayerState getPlayerState()
    {
        return playerState;
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
        try
        {
            response.getWriter().print(json);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void sendEvent(String name, String data)
    {
        Set<JournalSource> toRemove = new HashSet<>();
        sources.forEach(s ->
        {
            try
            {
                s.emitter.event(name, data);
            }
            catch (IOException e)
            {
                e.printStackTrace();
                toRemove.add(s);
            }
        });
        toRemove.forEach(JournalSource::onClose);
    }

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
            endpoint.accept(request, response, playerState);
        }
        else
        {
            writeErrorResponse(response, HttpStatus.Code.METHOD_NOT_ALLOWED);
        }
    }

    @Override
    protected EventSource newEventSource(HttpServletRequest request)
    {
        return new JournalSource();
    }


}
