package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class SellDronesEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        // it seems the cargo event is written immediately after this, so it's not
        // necessary to update any more.
//        var count = ((Number) event.get("Count")).intValue();
//        gameState.adjustCargoCount(Commodity.DRONES, -1 * count);

        var sale = ((Number) event.get("TotalSale")).intValue();
        gameState.adjustCreditBalance(sale);
    }
}
