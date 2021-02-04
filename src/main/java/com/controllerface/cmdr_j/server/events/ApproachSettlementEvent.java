package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;
import com.controllerface.cmdr_j.server.SettlementLocation;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class ApproachSettlementEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        System.out.println(event);
        var latitude = ((Number) event.get("Latitude")).doubleValue();
        var longitude = ((Number) event.get("Longitude")).doubleValue();
        var name = ((String) event.get("Name"));
        var settlementLocation = new SettlementLocation(latitude, longitude, name);
        playerState.setClosestSettlement(settlementLocation);
    }
}
