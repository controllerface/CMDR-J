package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.JournalSyncTaskEX;
import com.controllerface.cmdr_j.server.PlayerState;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MarketEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var marketData = JournalSyncTaskEX.readMarketData();
        var name = ((String) marketData.get("StationName"));
        var type = ((String) marketData.get("StationType"));
        var system = ((String) marketData.get("StarSystem"));
        var items = ((List<Map<String, Object>>) marketData.get("Items"));
        var imports = new HashMap<String, Map<String, Object>>();
        var exports = new HashMap<String, Map<String, Object>>();

        items.stream()
            .filter(item -> ((Boolean) item.get("Consumer")))
            .forEach(item ->
            {
                var category = ((String) item.get("Category_Localised"));
                var remappedItem = new HashMap<String, Object>();
                var itemName = ((String) item.get("Name_Localised"));
                var sellPrice = ((Number) item.get("SellPrice"));
                var meanPrice = ((Number) item.get("MeanPrice"));
                var profit = sellPrice.longValue() - meanPrice.longValue();
                remappedItem.put("quantity", item.get("Demand"));
                remappedItem.put("price", NumberFormat.getInstance().format(sellPrice));
                remappedItem.put("mean", NumberFormat.getInstance().format(meanPrice));
                remappedItem.put("profit", NumberFormat.getInstance().format(profit));
                remappedItem.put("rare", item.get("Rare"));
                imports.computeIfAbsent(category, (_k) -> new HashMap<>())
                    .put(itemName, remappedItem);
            });

        items.stream()
            .filter(item -> ((Boolean) item.get("Producer")))
            .forEach(item ->
            {
                var category = ((String) item.get("Category_Localised"));
                var remappedItem = new HashMap<String, Object>();
                var itemName = ((String) item.get("Name_Localised"));
                var buyPrice = ((Number) item.get("BuyPrice"));
                var meanPrice = ((Number) item.get("MeanPrice"));
                var profit = meanPrice.longValue() - buyPrice.longValue();
                remappedItem.put("quantity", item.get("Stock"));
                remappedItem.put("price", NumberFormat.getInstance().format(buyPrice));
                remappedItem.put("mean", NumberFormat.getInstance().format(meanPrice));
                remappedItem.put("profit", NumberFormat.getInstance().format(profit));
                remappedItem.put("rare", item.get("Rare"));
                exports.computeIfAbsent(category, (_k) -> new HashMap<>())
                    .put(itemName, remappedItem);
            });

        var remappedMarketData = new HashMap<String, Object>();
        remappedMarketData.put("name", name);
        remappedMarketData.put("type", type);
        remappedMarketData.put("system", system);
        remappedMarketData.put("imports", imports);
        remappedMarketData.put("exports", exports);

        playerState.setMarketData(remappedMarketData);
        playerState.emitMarketEvent();
    }
}
