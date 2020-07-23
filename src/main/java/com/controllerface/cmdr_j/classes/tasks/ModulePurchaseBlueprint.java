package com.controllerface.cmdr_j.classes.tasks;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.recipes.ModulePurchaseRecipe;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public class ModulePurchaseBlueprint implements TaskBlueprint
{
    private final List<TaskRecipe> recipes;
    private final String ss;

    public ModulePurchaseBlueprint(String ss, EnumSet<? extends ShipModule> x)
    {
        this.ss = ss;
        recipes = x.stream()
                .map(ModulePurchaseRecipe::new)
                .collect(Collectors.toList());
    }

    @Override
    public Stream<TaskRecipe> recipeStream()
    {
        return recipes.stream();
    }

    @Override
    public String toString()
    {
        return ss;
    }
}
