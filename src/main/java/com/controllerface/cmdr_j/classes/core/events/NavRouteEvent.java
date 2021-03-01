package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.data.RouteEntry;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.core.JournalSyncTask;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class NavRouteEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var navData = JournalSyncTask.readNavRouteData();
        if (navData.isEmpty()) return;

        var route = Optional.ofNullable(navData.get("Route"))
            .map(routeData -> (List<Map<String, Object>>) routeData)
            .orElse(Collections.emptyList()).stream()
            .map(routeEntry->
            {
                var systemName = ((String) routeEntry.get("StarSystem"));
                var systemAddress = ((Number) routeEntry.get("SystemAddress"));
                var coordinates = ((List<Number>) routeEntry.get("StarPos"));
                var starClass = ((String) routeEntry.get("StarClass"));
                var system = new StarSystem(systemName,
                    coordinates.get(0).doubleValue(),
                    coordinates.get(2).doubleValue(),
                    coordinates.get(1).doubleValue(),
                    systemAddress.longValue());
                return new RouteEntry(system, starClass);
            })
            .collect(Collectors.toList());

        gameState.setCurrentRoute(route);
    }
}
