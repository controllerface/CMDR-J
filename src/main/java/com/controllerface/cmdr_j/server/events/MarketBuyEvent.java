package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MarketBuyEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        // todo: actually adjust cargo counts

        var cost = ((Number) event.get("TotalCost")).intValue();
        gameState.adjustCreditBalance(-1 * cost);
    }
}
