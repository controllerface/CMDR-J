package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.costs.consumables.Consumable;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.utilities.JSONSupport;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ShipLockerMaterialsEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        System.out.println(JSONSupport.Write.jsonToString.apply(event));
        ((List<Map<String, Object>>) event.get("Components"))
            .forEach(item -> setMaterialCount(gameState, item));
//
        ((List<Map<String, Object>>) event.get("Data"))
            .forEach(item -> setMaterialCount(gameState, item));
//
        ((List<Map<String, Object>>) event.get("Items"))
            .forEach(item -> setMaterialCount(gameState, item));

        ((List<Map<String, Object>>) event.get("Consumables"))
            .forEach(item -> setConsumableCount(gameState, item));
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
