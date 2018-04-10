package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.modifications.ModificationRecipe;
import com.controllerface.edeps.enums.modifications.ModificationType;
import javafx.util.Pair;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by Stephen on 4/2/2018.
 */
public class ModRecipeItem
{
    private final ModificationType type;
    private final ModificationRecipe recipe;
    private final AtomicInteger count;

    public ModRecipeItem(ModificationType type, ModificationRecipe recipe, int count)
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
                        .map(c-> " - " + c.getMaterial().getLocalizedName())
                        .collect(Collectors.joining("\n"));
    }

    public void setCount(int amount)
    {
        count.set(amount);
    }

    public Pair<ModificationType, ModificationRecipe> asPair()
    {
        return new Pair<>(type, recipe);
    }

    public int getCount()
    {
        return count.get();
    }

    public boolean matches(Pair<ModificationType,ModificationRecipe> pair)
    {
        return recipe == pair.getValue() && type == pair.getKey();
    }
}
