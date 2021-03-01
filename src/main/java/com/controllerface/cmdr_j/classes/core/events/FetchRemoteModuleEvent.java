package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class FetchRemoteModuleEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var transferCost = ((int) event.get("TransferCost"));
        gameState.adjustCreditBalance(-1 * transferCost);
    }
}
