package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.threads.JournalSyncTask;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Stephen on 7/18/2018.
 */
public class NavRouteHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        Map<String, Object> navData = JournalSyncTask.readNavRouteData();
        List<StarSystem> route = Optional.ofNullable(navData.get("Route"))
                .map(o -> (List<Map<String, Object>>) o)
                .orElse(Collections.emptyList())
                .stream()
                .map(r->
                {
                    String s = ((String) r.get("StarSystem"));
                    Number a = ((Number) r.get("SystemAddress"));
                    List<Number> p = ((List<Number>) r.get("StarPos"));
                    StarSystem starSystem = new StarSystem(s,
                            p.get(0).doubleValue(), p.get(2).doubleValue(), p.get(1).doubleValue(),
                            a.longValue());
                    return starSystem;
                })
                .collect(Collectors.toList());
        context.getCommander().setRoute(route);
    }
}
