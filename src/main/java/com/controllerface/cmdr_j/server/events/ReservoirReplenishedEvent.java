package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class ReservoirReplenishedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var fuelMain = ((Number) event.get("FuelMain")).doubleValue();
        var fuelReservoir = ((Number) event.get("FuelReservoir")).doubleValue();
        gameState.updateFuelLevels(fuelMain, fuelReservoir);
    }
}
