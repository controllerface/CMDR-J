package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.SettlementLocation;

import java.util.Map;
import java.util.function.BiConsumer;

public class ApproachSettlementEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        if (event.get("Latitude") == null)
        {
            return;
        }
        var latitude = ((Number) event.get("Latitude")).doubleValue();
        var longitude = ((Number) event.get("Longitude")).doubleValue();
        var name = ((String) event.get("Name"));
        var bodyName = ((String) event.get("BodyName"));
        var marketId = ((Number) event.get("MarketID")).longValue();
        var systemAddress = ((Number) event.get("SystemAddress")).longValue();
        var settlementLocation =
            new SettlementLocation(latitude, longitude, marketId, systemAddress, name, bodyName);
        gameState.discoverSettlement(settlementLocation);
        gameState.setClosestSettlement(settlementLocation);
        gameState.emitCartographyData();
    }
}
