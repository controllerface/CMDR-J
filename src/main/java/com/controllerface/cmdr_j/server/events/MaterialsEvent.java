package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.server.GameState;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MaterialsEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        ((List<Map<String, Object>>) event.get("Raw"))
            .forEach(item -> setMaterialCount(gameState, item));

        ((List<Map<String, Object>>) event.get("Manufactured"))
            .forEach(item -> setMaterialCount(gameState, item));

        ((List<Map<String, Object>>) event.get("Encoded"))
            .forEach(item -> setMaterialCount(gameState, item));
    }

    private void setMaterialCount(GameState gameState, Map<String, Object> item)
    {
        String name = ((String) item.get("Name"));
        Material material = Material.valueOf(name.toUpperCase());
        Integer count = ((Integer) item.get("Count"));
        gameState.setMaterialCount(material, count);
    }
}
