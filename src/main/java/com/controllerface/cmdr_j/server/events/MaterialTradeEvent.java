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

        // If this trade was a tracked task, the appropriate material trade task must be determined
        // to mark as completed. In addition, since trades can occur in bulk, the appropriate number
        // of possible tracked trade tasks must be marked completed. This makes the logic somewhat
        // complex, but basically the trade type is determined first, and then the actual quantity
        // paid is divided by the unit cost for the trade to determine how many individual trade tasks
        // this would account for.

        // First, the trade recipe for this yielded material that requires the material paid is located, this
        // will be the correct trade recipe for this trade. Then the individual unit cost of one trade is
        // determined. The full quantity paid is then divided by this unit cost to get the numbrr of trade
        // tasks that this trade event equates to. Once determined, the task recipes is marked completed
        // the appropriate number of times in a loop.
        yieldMaterial.getTradeBlueprint()
            .flatMap(blueprint -> blueprint.recipeStream()
                .filter(recipe -> recipe.costStream()
                    .filter(price -> price.quantity > 0)
                    .anyMatch(price -> price.cost.equals(priceMaterial)))
                .findFirst())
            .ifPresent(recipe -> recipe.costStream().map(costData -> costData.quantity)
                .filter(quantity -> quantity > 0)
                .map(unitCost -> ((Number) paid.get("Quantity")).intValue() / unitCost)
                .mapToInt(Long::intValue)
                .findFirst()
                .ifPresent(count -> IntStream.range(0, count)
                    .forEach(_i -> gameState.completeTask(recipe))));

    }

    private void adjustMaterial(GameState gameState, Map<String, Object> item, int multiplier)
    {
        var name = ((String) item.get("Material")).toUpperCase();
        var count = ((Number) item.get("Quantity")).intValue();
        var cost = Material.valueOf(name);
        gameState.adjustMaterialCount(cost, multiplier * count);
    }
}
