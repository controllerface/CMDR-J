package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

public class TechnologyBrokerEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        if (event.get("Materials") != null)
        {
            ((List<Map<String, Object>>) event.get("Materials"))
                .forEach(materialCost -> adjustMaterial(gameState, materialCost));
        }

        if (event.get("Commodities") != null)
        {
            ((List<Map<String, Object>>) event.get("Commodities"))
                .forEach(commodityCost -> adjustCargoCount(gameState, commodityCost));
        }

        if (event.get("ItemsUnlocked") != null)
        {
            ((List<Map<String, Object>>) event.get("ItemsUnlocked")).stream()
                .map(unlockedItem ->
                {
                    String name = ((String) unlockedItem.get("Name")).toLowerCase();
                    OwnableModule module = JournalEvent.determineModuleType(name);
                    if (module != null)
                    {
                        return TechnologyRecipe.findRecipeForModule(module).orElse(null);
                    }
                    return null;
                })
                .filter(Objects::nonNull).findAny()
                .ifPresent(gameState::completeTask);
        }
    }

    private void adjustMaterial(GameState gameState, Map<String, Object> ingredient)
    {
        var name = ((String) ingredient.get("Name")).toUpperCase();
        var count = ((Number) ingredient.get("Count")).intValue();
        var cost = Material.valueOf(name);
        gameState.adjustMaterialCount(cost, -1 * count);
    }

    private void adjustCargoCount(GameState gameState, Map<String, Object> item)
    {
        var name = ((String) item.get("Name")).toUpperCase();
        var count = ((Number) item.get("Count")).intValue();
        var cost = Commodity.valueOf(name);
        gameState.adjustCargoCount(cost, -1 * count);
    }
}
