package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MiningRefinedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var type = ((String) event.get("Type"))
            .replace("$","")
            .replace("_name;","")
            .toUpperCase();
        var item = Commodity.valueOf(type);
        gameState.adjustCargoCount(item, 1);
    }
}
