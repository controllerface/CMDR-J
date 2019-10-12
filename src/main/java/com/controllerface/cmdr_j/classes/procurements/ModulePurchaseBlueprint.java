package com.controllerface.cmdr_j.classes.procurements;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.recipes.ModulePurchaseRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public class ModulePurchaseBlueprint implements ProcurementBlueprint
{
    private final List<ProcurementRecipe> recipes;
    private final String ss;

    public ModulePurchaseBlueprint(String ss, EnumSet<? extends ShipModule> x)
    {
        this.ss = ss;
        recipes = x.stream()
                .map(v->new ModulePurchaseRecipe(1, v))
                .collect(Collectors.toList());
    }

    @Override
    public Stream<ProcurementRecipe> recipeStream()
    {
        return recipes.stream();
    }

    @Override
    public String toString()
    {
        return ss;
    }
}
