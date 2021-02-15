package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class BuyDronesEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        // it seems the cargo event is written immediately after this, so it's not
        // necessary to update any more.
//        var count = ((Number) event.get("Count")).intValue();
//        gameState.adjustCargoCount(Commodity.DRONES, count);

        var cost = ((Number) event.get("TotalCost")).intValue();
        gameState.adjustCreditBalance(-1 * cost);
    }
}
