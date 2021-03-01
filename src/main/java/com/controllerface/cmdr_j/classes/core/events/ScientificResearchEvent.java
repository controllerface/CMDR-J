package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class ScientificResearchEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var name = ((String) event.get("Name")).toUpperCase();
        var count = ((Number) event.get("Count")).intValue();
        var cost = Material.valueOf(name);
        gameState.adjustMaterialCount(cost, -1 * count);
    }
}
