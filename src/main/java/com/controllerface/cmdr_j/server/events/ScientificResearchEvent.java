package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.JournalEventEX;

import java.util.List;
import java.util.Map;
import java.util.Objects;
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
