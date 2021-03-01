package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class PowerplayDeliverEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var name = ((String) event.get("Type")).toUpperCase();
        var count = ((Number) event.get("Count")).intValue();
        var cost = Commodity.valueOf(name);
        gameState.adjustCargoCount(cost, -1 * count);
    }
}
