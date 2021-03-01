package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class FSSDiscoveryScanEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var bodies = ((Integer) event.get("BodyCount"));
        var address = ((Number) event.get("SystemAddress")).longValue();
        gameState.updateSystemBodyCount(address, bodies);
    }
}
