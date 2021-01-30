package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.server.JournalSyncTaskEX;
import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class NavRouteEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var navData = JournalSyncTaskEX.readNavRouteData();
        if (navData.isEmpty()) return;

        var route = Optional.ofNullable(navData.get("Route"))
            .map(routeData -> (List<Map<String, Object>>) routeData)
            .orElse(Collections.emptyList()).stream()
            .map(routeEntry->
            {
                var systemName = ((String) routeEntry.get("StarSystem"));
                var systemAddress = ((Number) routeEntry.get("SystemAddress"));
                var coordinates = ((List<Number>) routeEntry.get("StarPos"));
                return new StarSystem(systemName,
                    coordinates.get(0).doubleValue(),
                    coordinates.get(2).doubleValue(),
                    coordinates.get(1).doubleValue(),
                    systemAddress.longValue());
            })
            .collect(Collectors.toList());

        playerState.setCurrentRoute(route);
    }
}