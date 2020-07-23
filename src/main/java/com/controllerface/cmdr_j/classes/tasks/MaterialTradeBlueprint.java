package com.controllerface.cmdr_j.classes.tasks;

import com.controllerface.cmdr_j.enums.costs.materials.Material;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public class MaterialTradeBlueprint implements TaskBlueprint
{
    private final List<TaskRecipe> recipes;
    private final Material material;

    public MaterialTradeBlueprint(Material material, List<TaskRecipe> recipes)
    {
        this.material = material;
        this.recipes = recipes;
    }

    @Override
    public Stream<TaskRecipe> recipeStream()
    {
        return recipes.stream();
    }

    @Override
    public String toString()
    {
        return material.getLocalizedName();
    }
}
