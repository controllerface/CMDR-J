package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MaterialCollectedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var name = ((String) event.get("Name")).toUpperCase();
        var count = ((Number) event.get("Count")).intValue();
        var cost = Material.valueOf(name);
        gameState.adjustMaterialCount(cost, count);
    }
}
