package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.core.JournalSyncTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MarketEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var marketData = JournalSyncTask.readMarketData();
        if (marketData.isEmpty()) return;

        var marketId = ((Number) marketData.get("MarketID")).longValue();
        var timestamp = ((String) marketData.get("timestamp"));
        var name = ((String) marketData.get("StationName"));
        var type = ((String) marketData.get("StationType"));
        var system = ((String) marketData.get("StarSystem"));
        var items = ((List<Map<String, Object>>) marketData.get("Items"));
        var imports = new HashMap<String, Map<String, Object>>();
        var exports = new HashMap<String, Map<String, Object>>();
        var rares = new HashMap<String, Map<String, Object>>();

        items.stream()
            .filter(item -> !((Boolean) item.get("Rare")))
            .filter(item -> ((Boolean) item.get("Consumer")))
            .forEach(item ->
            {
                var category = ((String) item.get("Category_Localised"));
                var itemName = ((String) item.get("Name_Localised"));
                var remappedItem = remapItem(item, false);
                imports.computeIfAbsent(category, (_k) -> new HashMap<>())
                    .put(itemName, remappedItem);
            });

        items.stream()
            .filter(item -> !((Boolean) item.get("Rare")))
            .filter(item -> ((Boolean) item.get("Producer")))
            .forEach(item ->
            {
                var category = ((String) item.get("Category_Localised"));
                var itemName = ((String) item.get("Name_Localised"));
                var remappedItem = remapItem(item, true);
                exports.computeIfAbsent(category, (_k) -> new HashMap<>())
                    .put(itemName, remappedItem);
            });

        items.stream()
            .filter(item -> ((Boolean) item.get("Rare")))
            .forEach(item ->
            {
                var category = ((String) item.get("Category_Localised"));
                var itemName = ((String) item.get("Name_Localised"));
                var remappedItem = remapItem(item, true);
                rares.computeIfAbsent(category, (_k) -> new HashMap<>())
                    .put(itemName, remappedItem);
            });

        var remappedMarketData = new HashMap<String, Object>();
        remappedMarketData.put("marketId", marketId);
        remappedMarketData.put("timestamp", timestamp);
        remappedMarketData.put("name", name);
        remappedMarketData.put("type", type);
        remappedMarketData.put("system", system);
        remappedMarketData.put("imports", imports);
        remappedMarketData.put("exports", exports);
        remappedMarketData.put("rares", rares);

        gameState.setMarketData(remappedMarketData);
        gameState.emitMarketEvent();
    }

    private Map<String, Object> remapItem(Map<String, Object> item, boolean export)
    {
        var priceKey = export ? "BuyPrice" : "SellPrice";
        var quantityKey = export ? "Stock" : "Demand";

        var remappedItem = new HashMap<String, Object>();
        var price = ((Number) item.get(priceKey));
        var meanPrice = ((Number) item.get("MeanPrice"));
        var profit = export
            ? meanPrice.longValue() - price.longValue()
            : price.longValue() - meanPrice.longValue();

        remappedItem.put("itemId", item.get("id"));
        remappedItem.put("quantity", item.get(quantityKey));
        remappedItem.put("price", price); // NumberFormat.getInstance().format(price));
        remappedItem.put("mean", meanPrice); // NumberFormat.getInstance().format(meanPrice));
        remappedItem.put("profit", profit); // NumberFormat.getInstance().format(profit));
        remappedItem.put("rare", item.get("Rare"));
        return remappedItem;
    }

}
