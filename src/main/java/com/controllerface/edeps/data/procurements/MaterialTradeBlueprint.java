package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.ProcurementBlueprint;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.structures.costs.materials.Material;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public class MaterialTradeBlueprint implements ProcurementBlueprint
{
    private final List<ProcurementRecipe> recipes;
    private final Material material;

    public MaterialTradeBlueprint(Material material, List<ProcurementRecipe> recipes)
    {
        this.material = material;
        this.recipes = recipes;
    }

    @Override
    public Stream<ProcurementRecipe> recipeStream()
    {
        return recipes.stream();
    }

    @Override
    public String toString()
    {
        return material.getLocalizedName();
    }
}
