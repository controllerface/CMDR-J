package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class PowerPlayDefectEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var name = ((String) event.get("ToPower"));
        gameState.joinPower(name);
    }
}
