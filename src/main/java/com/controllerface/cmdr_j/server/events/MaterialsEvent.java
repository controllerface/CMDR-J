package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.server.PlayerState;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MaterialsEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        ((List<Map<String, Object>>) event.get("Raw"))
            .forEach(item -> setMaterialCount(playerState, item));

        ((List<Map<String, Object>>) event.get("Manufactured"))
            .forEach(item -> setMaterialCount(playerState, item));

        ((List<Map<String, Object>>) event.get("Encoded"))
            .forEach(item -> setMaterialCount(playerState, item));
    }

    private void setMaterialCount(PlayerState playerState, Map<String, Object> item)
    {
        String name = ((String) item.get("Name"));
        Material material = Material.valueOf(name.toUpperCase());
        Integer count = ((Integer) item.get("Count"));
        playerState.setMaterialCount(material, count);
    }
}
