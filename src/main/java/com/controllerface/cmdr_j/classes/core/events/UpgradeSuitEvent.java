package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.consumables.Consumable;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.SpaceSuit;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;

import java.util.Map;
import java.util.function.BiConsumer;

public class UpgradeSuitEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        System.out.println(event);

        var name = ((String) event.get("Name"));
        int grade = ((Number) event.get("Class")).intValue();
        int cost = ((Number) event.get("Cost")).intValue();
        gameState.adjustCreditBalance(cost * -1);

        OwnableModule suit;
        try
        {
            suit = SpaceSuit.findModule(name).orElse(null);
        }
        catch (Exception e)
        {
            System.err.println("Unknown weapon: " + name);
            return;
        }

        if (suit == null)
        {
            System.err.println("Unknown weapon: " + name);
            return;
        }

        var upgradeRecipe = ((SpaceSuit) suit).upgradeBlueprint.recipeStream()
            .filter(recipe -> recipe.getGrade().getNumericalValue() == grade)
            .findFirst().orElse(null);

        if (upgradeRecipe == null)
        {
            System.err.println("Unknown upgrade: " + grade + " : " + name);
            return;
        }

        upgradeRecipe.costStream().forEach(costData ->
        {
            var c = costData.cost;
            if (c instanceof Material)
            {
                gameState.adjustMaterialCount(((Material) c), (int) (costData.quantity * -1));
            }
            if (c instanceof Commodity)
            { // commodities aren't expected, but added here to be defensive
                gameState.adjustCargoCount(((Commodity) c), (int) (costData.quantity * -1));
            }
            if (c instanceof Consumable)
            {
                gameState.adjustConsumableCount(((Consumable) c), (int) (costData.quantity * -1));
            }
        });

        ((SpaceSuit) suit).upgradeBlueprint.recipeStream()
            .filter(r -> r.getGrade().getNumericalValue() == grade)
            .findFirst().ifPresent(gameState::completeTask);
    }
}
