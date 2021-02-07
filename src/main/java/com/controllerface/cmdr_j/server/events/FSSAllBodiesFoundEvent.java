package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class FSSAllBodiesFoundEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var bodies = ((Integer) event.get("Count"));
        var address = ((Number) event.get("SystemAddress")).longValue();
        gameState.updateSystemBodyCount(address, bodies);
    }
}
