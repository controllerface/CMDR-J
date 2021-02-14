package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class LaunchDroneEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        gameState.adjustCargoCount(Commodity.DRONES, -1);
    }
}
