package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class SellDronesEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        // todo: adjust cargo count
        //var count = ((Number) event.get("Count")).intValue();

        var sale = ((Number) event.get("TotalSale")).intValue();
        gameState.adjustCreditBalance(sale);
    }
}
