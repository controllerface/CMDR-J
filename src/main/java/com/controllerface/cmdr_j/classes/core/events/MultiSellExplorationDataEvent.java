package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MultiSellExplorationDataEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var earnings = ((Number) event.get("TotalEarnings")).intValue();
        gameState.adjustCreditBalance(earnings);
    }
}
