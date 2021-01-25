package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class FSSDiscoveryScanEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var bodies = ((Integer) event.get("BodyCount"));
        var address = ((Number) event.get("SystemAddress")).longValue();
        playerState.updateSystemBodyCount(address, bodies);
    }
}
