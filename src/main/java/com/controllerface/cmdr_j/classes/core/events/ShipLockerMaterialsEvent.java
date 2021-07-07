package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.core.JournalSyncTask;
import com.controllerface.cmdr_j.enums.costs.consumables.Consumable;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.utilities.JSONSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class ShipLockerMaterialsEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var lockerData = event;

        if (event.get("Components") == null
            && event.get("Data") == null
            && event.get("Items") == null
            && event.get("Consumables") == null)
        {
            lockerData = JournalSyncTask.readLockerData();
        }

        Map<String, Integer> cumulativeTotals = new HashMap<>();

        Optional.ofNullable(lockerData.get("Components"))
            .map(rawComponents -> (List<Map<String, Object>>)rawComponents)
            .ifPresent(components -> components
                .forEach(component ->
                {
                    var name = ((String) component.get("Name")).toUpperCase();
                    var count = ((Integer) component.get("Count"));
                    var total = cumulativeTotals.computeIfAbsent(name, _k -> 0);
                    cumulativeTotals.put(name, total + count);
                    //setMaterialCount(gameState, component);
                }));

        Optional.ofNullable(lockerData.get("Data"))
            .map(rawData -> (List<Map<String, Object>>)rawData)
            .ifPresent(data -> data
                .forEach(dataItem ->
                {
                    var name = ((String) dataItem.get("Name")).toUpperCase();
                    var count = ((Integer) dataItem.get("Count"));
                    var total = cumulativeTotals.computeIfAbsent(name, _k -> 0);
                    cumulativeTotals.put(name, total + count);
                    //setMaterialCount(gameState, dataItem);
                }));

        Optional.ofNullable(lockerData.get("Items"))
            .map(rawItems -> (List<Map<String, Object>>)rawItems)
            .ifPresent(items -> items
                .forEach(item ->
                {
                    var name = ((String) item.get("Name")).toUpperCase();
                    var count = ((Integer) item.get("Count"));
                    var total = cumulativeTotals.computeIfAbsent(name, _k -> 0);
                    cumulativeTotals.put(name, total + count);
                    //setMaterialCount(gameState, item);
                }));

        cumulativeTotals.forEach((k, v) ->
        {
            var x = new HashMap<String, Object>();
            x.put("Name", k);
            x.put("Count", v);
            setMaterialCount(gameState, x);
        });

        Optional.ofNullable(lockerData.get("Consumables"))
            .map(rawConsumables -> (List<Map<String, Object>>)rawConsumables)
            .ifPresent(consumables -> consumables
                .forEach(consumable -> setConsumableCount(gameState, consumable)));
    }

    private void setMaterialCount(GameState gameState, Map<String, Object> item)
    {
        var name = ((String) item.get("Name")).toUpperCase();
        var count = ((Integer) item.get("Count"));
        var material = Material.valueOf(name);
        gameState.setMaterialCount(material, count);
    }

    private void setConsumableCount(GameState gameState, Map<String, Object> item)
    {
        var name = ((String) item.get("Name")).toUpperCase();
        var count = ((Integer) item.get("Count"));
        var consumable = Consumable.valueOf(name);
        gameState.setConsumableCount(consumable, count);
    }
}
