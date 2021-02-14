package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class BuyDronesEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
//        var capacity = gameState.getCargoCapacity();
//        var tonnage = gameState.getCurrentTonnage();
//
//        var adjustment = Math.min(capacity - tonnage, count);

        var count = ((Number) event.get("Count")).intValue();
        gameState.adjustCargoCount(Commodity.DRONES, count);

        var cost = ((Number) event.get("TotalCost")).intValue();
        gameState.adjustCreditBalance(-1 * cost);
    }
}
