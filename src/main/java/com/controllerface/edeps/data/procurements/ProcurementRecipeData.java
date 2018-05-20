package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import javafx.util.Pair;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Represents a single "recipe" also referred to as a "procurement task" or just "task", that the user has selected for
 * completion. A user selects these tasks from the "procurement tree" adding them to a type of "to-do" list. Entries in
 * this list themselves have a count, representing completion of the same task multiple times. As such, the count value
 * of this object is mutable, to allow for a given instance of this recipe to be requested multiple times, and allows
 * any constituent costs of the recipe itself to be calculated bu multiplying their individual costs by the total count
 * of the desired task/recipe.
 *
 * Created by Stephen on 4/2/2018.
 */
public class ProcurementRecipeData
{
    private final ProcurementType type;
    private final ProcurementRecipe recipe;
    private final AtomicInteger count;

    public ProcurementRecipeData(ProcurementType type, ProcurementRecipe recipe, int count)
    {
        this.type = type;
        this.recipe = recipe;
        this.count = new AtomicInteger(count);
    }

    @Override
    public String toString()
    {
        return type.toString() + " : " + recipe.toString() + "\n" +
                recipe.costStream()
                        .map(c-> " - " + c.getCost().getLocalizedName())
                        .collect(Collectors.joining("\n"));
    }

    public void setCount(int amount)
    {
        count.set(amount);
    }

    public Pair<ProcurementType, ProcurementRecipe> asPair()
    {
        return new Pair<>(type, recipe);
    }

    public int getCount()
    {
        return count.get();
    }

    public boolean matches(Pair<ProcurementType, ProcurementRecipe> pair)
    {
        // todo: need logic for trade recipes, check costs/products to determine match

        return recipe == pair.getValue() && type == pair.getKey();
    }
}
