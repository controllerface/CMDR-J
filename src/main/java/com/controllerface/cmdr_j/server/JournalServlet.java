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
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

class JournalServlet extends EventSourceServlet
{
    private final Set<JournalSource> sources = ConcurrentHashMap.newKeySet();

    private final CommanderState commanderState;

    private static final Map<String, StaticAsset> staticAssets = Map.ofEntries
        (
            Map.entry("/", StaticAsset.make("/ui/index.html", "text/html")),
            Map.entry("/ui.html", StaticAsset.make("/ui/ui.html", "text/html")),
            Map.entry("/ui.css", StaticAsset.make("/ui/ui.css", "text/css")),
            Map.entry("/ui.js", StaticAsset.make("/ui/ui.js", "text/javascript"))
        );

    JournalServlet()
    {
        commanderState = new CommanderState(this::sendEvent);
    }

    public CommanderState getCommanderState()
    {
        return commanderState;
    }

    private enum EndpointType
    {
        GET,
        POST,
        ANY
    }

    private enum EndPoint
    {
        /**
         * Default endpoint handler called when nothing matches
         */
        NOT_FOUND(EndpointType.ANY, (x) -> false, (request, response) ->
        {
            writeErrorResponse(response, HttpStatus.Code.NOT_FOUND);
        }),

        /**
         * Serves static assets defined in the asset map.
         */
        STATIC_ASSET(EndpointType.GET, staticAssets::containsKey, (request, response) ->
        {
            writeResourceResponse(response, staticAssets.get(request.getRequestURI()));
        });

        private final EndpointType type;
        private final Predicate<String> checkUri;
        private final BiConsumer<HttpServletRequest, HttpServletResponse> endpoint;

        EndPoint(EndpointType type,
                 Predicate<String> checkUri,
                 BiConsumer<HttpServletRequest, HttpServletResponse> endpoint)
        {
            this.type = type;
            this.checkUri = checkUri;
            this.endpoint = endpoint;
        }

        public void accept(HttpServletRequest request, HttpServletResponse response)
        {
            this.endpoint.accept(request, response);
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

    private final BiConsumer<String, String> makeEmitterUpdate(JournalSource source)
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

    private class JournalSource implements EventSource
    {
        private Emitter emitter;

        @Override
        public void onOpen(Emitter emitter) throws IOException
        {
            this.emitter = emitter;
            sources.add(this);
            commanderState.emitCurrentState(makeEmitterUpdate(this));
        }

        @Override
        public void onClose()
        {
            emitter.close();
            sources.remove(this);
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
            endpoint.accept(request, response);
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

    public void sendEvent(String name, String data)
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
}
