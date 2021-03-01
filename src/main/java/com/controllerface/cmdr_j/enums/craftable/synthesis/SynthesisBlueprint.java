package com.controllerface.cmdr_j.enums.craftable.synthesis;

import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum SynthesisBlueprint implements TaskBlueprint
{
    // Standard
    Small_Calibre_Munitions(EnumSet.of(SynthesisRecipe.Small_Calibre_Munitions_Basic,
        SynthesisRecipe.Small_Calibre_Munitions_Standard,
        SynthesisRecipe.Small_Calibre_Munitions_Premium)),

    Large_Calibre_Munitions(EnumSet.of(SynthesisRecipe.Large_Calibre_Munitions_Basic,
        SynthesisRecipe.Large_Calibre_Munitions_Standard,
        SynthesisRecipe.Large_Calibre_Munitions_Premium)),

    High_Velocity_Munitions(EnumSet.of(SynthesisRecipe.High_Velocity_Munitions_Basic,
        SynthesisRecipe.High_Velocity_Munitions_Standard,
        SynthesisRecipe.High_Velocity_Munitions_Premium)),

    Explosives_Munitions(EnumSet.of(SynthesisRecipe.Explosives_Munitions_Basic,
        SynthesisRecipe.Explosives_Munitions_Standard,
        SynthesisRecipe.Explosives_Munitions_Premium)),

    Plasma_Munitions(EnumSet.of(SynthesisRecipe.Plasma_Munitions_Basic,
        SynthesisRecipe.Plasma_Munitions_Standard,
        SynthesisRecipe.Plasma_Munitions_Premium)),

    // Human Tech
    Flechette_Launcher_Munitions(EnumSet.of(SynthesisRecipe.Flechette_Launcher_Munitions_Basic,
            SynthesisRecipe.Flechette_Launcher_Munitions_Standard,
            SynthesisRecipe.Flechette_Launcher_Munitions_Premium)),

    Enzyme_Missile_Munitions(EnumSet.of(SynthesisRecipe.Enzyme_Missile_Munitions_Basic,
            SynthesisRecipe.Enzyme_Missile_Munitions_Standard,
            SynthesisRecipe.Enzyme_Missile_Munitions_Premium)),

    // Anti-Xeno
    AX_Small_Calibre_Munitions(EnumSet.of(SynthesisRecipe.AX_Small_Calibre_Munitions_Basic,
            SynthesisRecipe.AX_Small_Calibre_Munitions_Standard,
            SynthesisRecipe.AX_Small_Calibre_Munitions_Premium)),

    AX_Remote_Flak_Munitions(EnumSet.of(SynthesisRecipe.AX_Remote_Flak_Munitions_Basic,
            SynthesisRecipe.AX_Remote_Flak_Munitions_Standard,
            SynthesisRecipe.AX_Remote_Flak_Munitions_Premium)),

    AX_Explosive_Munitions(EnumSet.of(SynthesisRecipe.AX_Explosive_Munitions_Basic,
            SynthesisRecipe.AX_Explosive_Munitions_Standard,
            SynthesisRecipe.AX_Explosive_Munitions_Premium)),

    // Guardian Tech
    Guardian_Gauss_Cannon_Munitions(EnumSet.of(SynthesisRecipe.Guardian_Gauss_Cannon_Munitions_Basic,
            SynthesisRecipe.Guardian_Gauss_Cannon_Munitions_Standard,
            SynthesisRecipe.Guardian_Gauss_Cannon_Munitions_Premium)),

    Guardian_Plasma_Charger_Munitions(EnumSet.of(SynthesisRecipe.Guardian_Plasma_Charger_Munitions_Basic,
            SynthesisRecipe.Guardian_Plasma_Charger_Munitions_Standard,
            SynthesisRecipe.Guardian_Plasma_Charger_Munitions_Premium)),

    Guardian_Shard_Cannon_Munitions(EnumSet.of(SynthesisRecipe.Guardian_Shard_Cannon_Munitions_Basic,
            SynthesisRecipe.Guardian_Shard_Cannon_Munitions_Standard,
            SynthesisRecipe.Guardian_Shard_Cannon_Munitions_Premium)),

    // SRV
    SRV_Refuel(EnumSet.of(SynthesisRecipe.SRV_Refuel_Basic,
            SynthesisRecipe.SRV_Refuel_Standard,
            SynthesisRecipe.SRV_Refuel_Premium)),

    SRV_Repair(EnumSet.of(SynthesisRecipe.SRV_Repair_Basic,
            SynthesisRecipe.SRV_Repair_Standard,
            SynthesisRecipe.SRV_Repair_Premium)),

    SRV_Ammo_Restock(EnumSet.of(SynthesisRecipe.SRV_Ammo_Restock_Basic,
            SynthesisRecipe.SRV_Ammo_Restock_Standard,
            SynthesisRecipe.SRV_Ammo_Restock_Premium)),

    // Ship
    Chaff(EnumSet.of(SynthesisRecipe.Chaff_Basic,
            SynthesisRecipe.Chaff_Standard,
            SynthesisRecipe.Chaff_Premium)),

    Limpets(EnumSet.of(SynthesisRecipe.Limpets)),

    Heat_Sink(EnumSet.of(SynthesisRecipe.Heat_Sink_Basic,
            SynthesisRecipe.Heat_Sink_Standard,
            SynthesisRecipe.Heat_Sink_Premium)),

    AFM_Refill(EnumSet.of(SynthesisRecipe.AFM_Refill_Basic,
            SynthesisRecipe.AFM_Refill_Standard,
            SynthesisRecipe.AFM_Refill_Premium)),

    Life_Support(EnumSet.of(SynthesisRecipe.Life_Support)),

    FSD_Injection(EnumSet.of(SynthesisRecipe.FSD_Injection_Basic,
            SynthesisRecipe.FSD_Injection_Standard,
            SynthesisRecipe.FSD_Injection_Premium)),

    ;

    private final EnumSet<SynthesisRecipe> recipes;

    SynthesisBlueprint(EnumSet<SynthesisRecipe> recipes)
    {
        this.recipes = recipes;
    }

    public Stream<SynthesisRecipe> recipeStream()
    {
        return recipes.stream();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }
}
