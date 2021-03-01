package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MarketSellEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var type = ((String) event.get("Type")).toUpperCase();
        var count = ((Number) event.get("Count")).intValue();
        var item = Commodity.valueOf(type);
        gameState.adjustCargoCount(item, -1 * count);

        var sale = ((Number) event.get("TotalSale")).intValue();
        gameState.adjustCreditBalance(sale);
    }
}
