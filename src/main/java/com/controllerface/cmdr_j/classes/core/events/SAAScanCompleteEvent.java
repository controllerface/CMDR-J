package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class SAAScanCompleteEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var systemAddress = ((Number) event.get("SystemAddress")).longValue();
        var bodyID = ((Number) event.get("BodyID")).intValue();
        gameState.updateBodyMapped(systemAddress, bodyID);
    }
}
