package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.JournalEventEX;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;

public class MaterialTradeEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var paid = ((Map<String, Object>) event.get("Paid"));
        var received = ((Map<String, Object>) event.get("Received"));
        adjustMaterial(gameState, paid, -1);
        adjustMaterial(gameState, received, 1);

        var priceMaterial = Material.valueOf(((String) paid.get("Material")).toUpperCase());
        var yieldMaterial = Material.valueOf(((String) received.get("Material")).toUpperCase());

        yieldMaterial.getTradeBlueprint()
            .flatMap(blueprint -> blueprint.recipeStream()
            .filter(recipe -> recipe.costStream()
                .filter(price -> price.quantity > 0)
                .anyMatch(price -> price.cost.equals(priceMaterial)))
            .findFirst())
            .ifPresent(recipe -> MaterialTradeType.findMatchingTradeType(priceMaterial)
                .flatMap(tradeType -> recipe.costStream().map(costData -> costData.quantity)
                .filter(quantity -> quantity > 0)
                .findFirst()).ifPresent(unitCost ->
                {
                    long count = ((Number) paid.get("Quantity")).intValue() / unitCost;
                    for (int i = 0; i < count; i++)
                    {
                        gameState.completeTask(recipe);
                    }
                }));

    }

    private void adjustMaterial(GameState gameState, Map<String, Object> item, int multiplier)
    {
        var name = ((String) item.get("Material")).toUpperCase();
        var count = ((Number) item.get("Quantity")).intValue();
        var cost = Material.valueOf(name);
        gameState.adjustMaterialCount(cost, multiplier * count);
    }
}
