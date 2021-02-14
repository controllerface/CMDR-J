package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class CargoDepotEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var updateType = ((String) event.get("UpdateType"));
        var type = ((String) event.get("CargoType"));
        var count = ((Number) event.get("Count")).intValue();
        var item = Commodity.valueOf(type);

        switch (updateType)
        {
            case "Deliver":
                gameState.adjustCargoCount(item, -1 * count);
                break;

            case "Collect":
                gameState.adjustCargoCount(item, count);
                break;
        }
    }
}
