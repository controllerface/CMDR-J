package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.server.PlayerState;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustMaterialCount;

public class MaterialsEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        ((List<Map<String, Object>>) event.get("Raw"))
            .forEach(item ->
            {
                String name = ((String) item.get("Name"));
                Material material = Material.valueOf(name.toUpperCase());
                Integer count = ((Integer) item.get("Count"));
                playerState.setMaterialCount(material, count);
            });

        ((List<Map<String, Object>>) event.get("Manufactured"))
            .forEach(item ->
            {
                String name = ((String) item.get("Name"));
                Material material = Material.valueOf(name.toUpperCase());
                Integer count = ((Integer) item.get("Count"));
                playerState.setMaterialCount(material, count);
            });

        ((List<Map<String, Object>>) event.get("Encoded"))
            .forEach(item ->
            {
                String name = ((String) item.get("Name"));
                Material material = Material.valueOf(name.toUpperCase());
                Integer count = ((Integer) item.get("Count"));
                playerState.setMaterialCount(material, count);
            });

        System.out.println("done");
    }
}
