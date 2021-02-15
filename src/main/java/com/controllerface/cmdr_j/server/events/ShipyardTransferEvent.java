package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class ShipyardTransferEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var amount = ((Number) event.get("TransferPrice")).intValue();
        gameState.adjustCreditBalance(amount);
    }
}
