package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.equipment.ships.ShipType;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.core.JournalSyncTask;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ShipyardEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var shipyardData = JournalSyncTask.readShipyardData();
        if (shipyardData.isEmpty()) return;

        var marketId = ((Number) shipyardData.get("MarketID")).longValue();
        var timestamp = ((String) shipyardData.get("timestamp"));
        var name = ((String) shipyardData.get("StationName"));
        var system = ((String) shipyardData.get("StarSystem"));
        var priceList = ((List<Map<String, Object>>) shipyardData.get("PriceList"));
        var ships = new HashMap<String, Object>();

        priceList.forEach(item ->
        {
            var shipType = ((String) item.get("ShipType"));
            var remappedItem = remapItem(item, shipType);
            ships.put(shipType, remappedItem);
        });

        var remappedShipyardData = new HashMap<String, Object>();
        remappedShipyardData.put("marketId", marketId);
        remappedShipyardData.put("timestamp", timestamp);
        remappedShipyardData.put("name", name);
        remappedShipyardData.put("system", system);
        remappedShipyardData.put("ships", ships);

        gameState.setShipyardData(remappedShipyardData);
        gameState.emitShipyardEvent();
    }

    private Map<String, Object> remapItem(Map<String, Object> item, String shipName)
    {
        var price = ((Number) item.get("ShipPrice"));
        var ship = ShipType.findShip(shipName).orElse(null);
        if (ship == null)
        {
            System.err.println("Could not find ship: " + shipName);
            return Collections.emptyMap();
        }
        var remappedItem = new HashMap<String, Object>();
        remappedItem.put("name", ship.getBaseShipStats().displayName);
        remappedItem.put("itemId", item.get("id"));
        remappedItem.put("price", price);
        return remappedItem;
    }
}
