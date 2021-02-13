package com.controllerface.cmdr_j.enums.craftable.technologies;

import com.controllerface.cmdr_j.classes.tasks.TaskBlueprint;

import java.util.EnumSet;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum TechnologyBlueprint implements TaskBlueprint
{
    // Human

    // todo: bobble head

    Corrosion_Resistant_Cargo_Rack("Corrosion Resistant Cargo Rack",
        EnumSet.of(TechnologyRecipe.Corrosion_Resistant_Cargo_Rack)),

    Enzyme_Missile_Rack("Enzyme Missile Rack",
        EnumSet.of(TechnologyRecipe.Enzyme_Missile_Rack_Fixed_Medium)),

    Meta_Alloy_Hull_Reinforcement("Meta Alloy Hull Reinforcement",
        EnumSet.of(TechnologyRecipe.Meta_Alloy_Hull_Reinforcement)),

    Remote_Release_Flechette_Launcher("Remote Release Flechette Launcher",
        EnumSet.of(TechnologyRecipe.Remote_Release_Flechette_Launcher_Fixed_Medium,
            TechnologyRecipe.Remote_Release_Flechette_Launcher_Turreted_Medium)),

    Shock_Cannon("Shock Cannon",
        EnumSet.of(TechnologyRecipe.Shock_Cannon_Fixed_Small,
            TechnologyRecipe.Shock_Cannon_Fixed_Medium,
            TechnologyRecipe.Shock_Cannon_Fixed_Large,
            TechnologyRecipe.Shock_Cannon_Gimballed_Small,
            TechnologyRecipe.Shock_Cannon_Gimballed_Medium,
            TechnologyRecipe.Shock_Cannon_Gimballed_Large,
            TechnologyRecipe.Shock_Cannon_Turreted_Small,
            TechnologyRecipe.Shock_Cannon_Turreted_Medium,
            TechnologyRecipe.Shock_Cannon_Turreted_Large)),


    // Guardian

    // todo: guardian fighters

    Guardian_FSD_Booster("Guardian FSD Booster", EnumSet.of(TechnologyRecipe.Guardian_FSD_Booster)),

    Guardian_Shield_Booster("Guardian Shield Booster", EnumSet.of(TechnologyRecipe.Guardian_Shield_Booster)),

    Guardian_Hull_Reinforcement("Guardian Hull Reinforcement", EnumSet.of(TechnologyRecipe.Guardian_Hull_Reinforcement)),

    Guardian_Module_Reinforcement("Guardian Module Reinforcement", EnumSet.of(TechnologyRecipe.Guardian_Module_Reinforcement)),

    Guardian_Gauss_Cannon("Guardian Gauss Cannon",
        EnumSet.of(TechnologyRecipe.Guardian_Gauss_Cannon_Fixed_Small,
            TechnologyRecipe.Guardian_Gauss_Cannon_Fixed_Medium)),

    Guardian_Hybrid_Power_Distributor("Guardian Hybrid Power Distributor",
        EnumSet.of(TechnologyRecipe.Guardian_Hybrid_Power_Distributor)),

    Guardian_Plasma_Charger("Guardian Plasma Charger",
        EnumSet.of(TechnologyRecipe.Guardian_Plasma_Charger_Fixed_Small,
            TechnologyRecipe.Guardian_Plasma_Charger_Fixed_Medium,
            TechnologyRecipe.Guardian_Plasma_Charger_Fixed_Large,
            TechnologyRecipe.Guardian_Plasma_Charger_Turreted_Small,
            TechnologyRecipe.Guardian_Plasma_Charger_Turreted_Medium,
            TechnologyRecipe.Guardian_Plasma_Charger_Turreted_Large)),

    Guardian_Power_Plant("Guardian Power Plant",
        EnumSet.of(TechnologyRecipe.Guardian_Hybrid_Power_Plant)),

    Guardian_Shard_Cannon("Guardian Shard Cannon",
        EnumSet.of(TechnologyRecipe.Guardian_Shard_Cannon_Fixed_Small,
            TechnologyRecipe.Guardian_Shard_Cannon_Fixed_Medium,
            TechnologyRecipe.Guardian_Shard_Cannon_Fixed_Large,
            TechnologyRecipe.Guardian_Shard_Cannon_Turreted_Small,
            TechnologyRecipe.Guardian_Shard_Cannon_Turreted_Medium,
            TechnologyRecipe.Guardian_Shard_Cannon_Turreted_Large)),

    ;

    private final EnumSet<TechnologyRecipe> recipes;
    private final String text;

    TechnologyBlueprint(String text, EnumSet<TechnologyRecipe> recipes)
    {
        this.text = text;
        this.recipes = recipes;
    }

    public static Optional<TechnologyBlueprint> findBluePrintByRecipe(TechnologyRecipe recipe)
    {
        return Stream.of(TechnologyBlueprint.values()).filter(bp -> bp.recipeStream().anyMatch(r -> r == recipe))
            .findAny();
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
