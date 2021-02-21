package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.ScannedBody;
import com.controllerface.cmdr_j.classes.StellarBody;
import com.controllerface.cmdr_j.server.GameState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class DockedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var stationName = ((String) event.get("StationName"));
        var address = ((Number) event.get("SystemAddress")).longValue();
        var bodyType = StellarBody.BodyType.Station;

        var stationData = new HashMap<String, Object>();
        stationData.put("MarketID", ((Number) event.get("MarketID")).longValue());
        stationData.put("StationType", event.get("StationType"));
        stationData.put("StationFaction", event.get("StationFaction"));
        stationData.put("StationGovernment", event.get("StationGovernment_Localised"));
        stationData.put("StationAllegiance", event.get("StationAllegiance"));
        stationData.put("StationServices", event.get("StationServices"));
        stationData.put("StationEconomy", event.get("StationEconomy_Localised"));
        stationData.put("DistFromStarLS", event.get("DistFromStarLS"));
        stationData.put("timestamp", event.get("timestamp"));

        Optional.ofNullable(event.get("StationEconomies"))
            .map(economies -> ((List<Map<String, Object>>) economies))
            .ifPresent(economies ->
            {
                var stationEconomies = economies.stream()
                    .map(economy ->
                    {
                        var remapped = new HashMap<String, Object>();
                        remapped.put("Name", economy.get("Name_Localised"));
                        remapped.put("Proportion", economy.get("Proportion"));
                        return remapped;
                    })
                    .collect(Collectors.toList());
                stationData.put("StationEconomies", stationEconomies);
            });

        var bodyID = gameState.findBodyId(stationName);
        if (bodyID != -1)
        {
            var scannedBody = new ScannedBody(bodyType, stationName, bodyID, address, stationData);
            gameState.discoverStellarBody(scannedBody);
        }
        else
        {
            var currentSettlement = gameState.getLocalSettlement(((Long) stationData.get("MarketID")));
            if (currentSettlement == null)
            {
                System.out.println("Ephemeral Market: " + stationData.get("MarketID"));
                return;
            }
            var updatedSettlement = currentSettlement.cloneWithDetails(stationData);
            gameState.discoverSettlement(updatedSettlement);
        }

        gameState.emitCartographyData();
    }
}
