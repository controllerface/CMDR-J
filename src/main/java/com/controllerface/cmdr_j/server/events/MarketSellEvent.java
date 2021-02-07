package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MarketSellEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        // todo: actually adjust cargo counts

        var sale = ((Number) event.get("TotalSale")).intValue();
        gameState.adjustCreditBalance(sale);
    }
}
