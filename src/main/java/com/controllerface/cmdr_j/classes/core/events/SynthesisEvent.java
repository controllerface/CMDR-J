package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class SynthesisEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        // todo: need way to properly detect and complete synthesis tasks
        var name = ((String) event.get("Name"));
        if (name.contains("Limpet"))
        {
            var capacity = gameState.getCargoCapacity();
            var tonnage = gameState.getCurrentTonnage();
            var adjustment = Math.min(capacity - tonnage, 4);
            gameState.adjustCargoCount(Commodity.DRONES, adjustment);
        }
        ((List<Map<String, Object>>) event.get("Materials"))
            .forEach(material -> adjustMaterial(gameState, material));
    }

    private void adjustMaterial(GameState gameState, Map<String, Object> ingredient)
    {
        var name = ((String) ingredient.get("Name")).toUpperCase();
        var count = ((Number) ingredient.get("Count")).intValue();
        var cost = Material.valueOf(name);
        gameState.adjustMaterialCount(cost, -1 * count);
    }
}
