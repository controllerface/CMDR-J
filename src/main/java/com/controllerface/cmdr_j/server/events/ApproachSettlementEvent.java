package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.SettlementLocation;

import java.util.Map;
import java.util.function.BiConsumer;

public class ApproachSettlementEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        if (event.get("Latitude") == null)
        {
            System.out.println("DEBUG: " + event);
            return;
        }
        var latitude = ((Number) event.get("Latitude")).doubleValue();
        var longitude = ((Number) event.get("Longitude")).doubleValue();
        var name = ((String) event.get("Name"));
        var settlementLocation = new SettlementLocation(latitude, longitude, name);
        gameState.setClosestSettlement(settlementLocation);
    }
}
