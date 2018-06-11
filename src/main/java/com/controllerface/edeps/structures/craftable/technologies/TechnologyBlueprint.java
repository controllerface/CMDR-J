package com.controllerface.edeps.structures.craftable.technologies;

import com.controllerface.edeps.ProcurementBlueprint;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum  TechnologyBlueprint implements ProcurementBlueprint
{
    // Human

    Corrosion_Resistant_Cargo_Rack("Corrosion Resistant Cargo Rack",
            EnumSet.of(TechnologyRecipe.Corrosion_Resistant_Cargo_Rack)),

    Enzyme_Missile_Rack_Fixed("Enzyme Missile Rack",
            EnumSet.of(TechnologyRecipe.Enzyme_Missile_Rack_Fixed)),

    Meta_Alloy_Hull_Reinforcement("Meta Alloy Hull Reinforcement",
            EnumSet.of(TechnologyRecipe.Meta_Alloy_Hull_Reinforcement)),

    Remote_Release_Flechette_Launcher_Turreted("Remote Release Flechette Launcher",
            EnumSet.of(TechnologyRecipe.Remote_Release_Flechette_Launcher_Fixed,
            TechnologyRecipe.Remote_Release_Flechette_Launcher_Turreted)),

    Shock_Cannon("Shock Cannon",
            EnumSet.of(TechnologyRecipe.Shock_Cannon_Fixed,
            TechnologyRecipe.Shock_Cannon_Gimballed,
            TechnologyRecipe.Shock_Cannon_Turreted)),


    // Guardian

    Guardian_FSD_Booster("Guardian FSD Booster",
            EnumSet.of(TechnologyRecipe.Guardian_FSD_Booster)),

    Guardian_Gauss_Cannon("Guardian Gauss Cannon",
            EnumSet.of(TechnologyRecipe.Guardian_Gauss_Cannon_Fixed)),

    Guardian_Hybrid_Power_Distributor("Guardian Hybrid Power Distributor",
            EnumSet.of(TechnologyRecipe.Guardian_Hybrid_Power_Distributor)),

    Guardian_Plasma_Charger("Guardian Plasma Charger",
            EnumSet.of(TechnologyRecipe.Guardian_Plasma_Charger_Fixed,
            TechnologyRecipe.Guardian_Plasma_Charger_Turreted)),

    Guardian_Power_Plant("Guardian Power Plant",
            EnumSet.of(TechnologyRecipe.Guardian_Hybrid_Power_Plant)),

    Guardian_Shard_Cannon("Guardian Shard Cannon",
            EnumSet.of(TechnologyRecipe.Guardian_Shard_Cannon_Fixed,
            TechnologyRecipe.Guardian_Shard_Cannon_Turreted)),

    ;

    private final EnumSet<TechnologyRecipe> recipes;
    private final String text;

    TechnologyBlueprint(String text, EnumSet<TechnologyRecipe> recipes)
    {
        this.text = text;
        this.recipes = recipes;
    }

    public Stream<TechnologyRecipe> recipeStream()
    {
        return recipes.stream();
    }

    @Override
    public String toString()
    {
        return text;
    }
}
