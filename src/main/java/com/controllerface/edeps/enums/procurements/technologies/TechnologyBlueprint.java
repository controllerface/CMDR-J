package com.controllerface.edeps.enums.procurements.technologies;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/12/2018.
 */
public enum  TechnologyBlueprint
{
    // Human

    Corrosion_Resistant_Cargo_Rack("Corrosion Resistant Cargo Rack",
            TechnologyRecipe.Corrosion_Resistant_Cargo_Rack),

    Enzyme_Missile_Rack_Fixed("Enzyme Missile Rack",
            TechnologyRecipe.Enzyme_Missile_Rack_Fixed),

    Meta_Alloy_Hull_Reinforcement("Meta Alloy Hull Reinforcement",
            TechnologyRecipe.Meta_Alloy_Hull_Reinforcement),

    Remote_Release_Flechette_Launcher_Turreted("Remote Release Flechette Launcher",
            TechnologyRecipe.Remote_Release_Flechette_Launcher_Fixed,
            TechnologyRecipe.Remote_Release_Flechette_Launcher_Turreted),

    Shock_Cannon("Shock Cannon",
            TechnologyRecipe.Shock_Cannon_Fixed,
            TechnologyRecipe.Shock_Cannon_Gimballed,
            TechnologyRecipe.Shock_Cannon_Turreted),


    // Guardian

    Guardian_FSD_Booster("Guardian FSD Booster",
            TechnologyRecipe.Guardian_FSD_Booster),

    Guardian_Gauss_Cannon("Guardian Gauss Cannon",
            TechnologyRecipe.Guardian_Gauss_Cannon_Fixed),

    Guardian_Hybrid_Power_Distributor("Guardian Hybrid Power Distributor",
            TechnologyRecipe.Guardian_Hybrid_Power_Distributor),

    Guardian_Plasma_Charger("Guardian Plasma Charger",
            TechnologyRecipe.Guardian_Plasma_Charger_Fixed,
            TechnologyRecipe.Guardian_Plasma_Charger_Turreted),

    Guardian_Power_Plant("Guardian Power Plant",
            TechnologyRecipe.Guardian_Hybrid_Power_Plant),

    Guardian_Shard_Cannon("Guardian Shard Cannon",
            TechnologyRecipe.Guardian_Shard_Cannon_Fixed,
            TechnologyRecipe.Guardian_Shard_Cannon_Turreted);

    private final TechnologyRecipe[] recipes;
    private final String text;

    TechnologyBlueprint(String text, TechnologyRecipe ... recipes)
    {
        this.text = text;
        this.recipes = recipes;
    }

    public Stream<TechnologyRecipe> recipeStream()
    {
        return Arrays.stream(recipes);
    }

    @Override
    public String toString()
    {
        return text;
    }
}
