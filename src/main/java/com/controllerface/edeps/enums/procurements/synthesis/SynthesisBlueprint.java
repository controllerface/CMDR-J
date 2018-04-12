package com.controllerface.edeps.enums.procurements.synthesis;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/12/2018.
 */
public enum SynthesisBlueprint
{
    // Standard
    Small_Calibre_Munitions(SynthesisRecipe.Small_Calibre_Munitions_Basic,
        SynthesisRecipe.Small_Calibre_Munitions_Standard,
        SynthesisRecipe.Small_Calibre_Munitions_Premium),
    Large_Calibre_Munitions(SynthesisRecipe.Large_Calibre_Munitions_Basic,
        SynthesisRecipe.Large_Calibre_Munitions_Standard,
        SynthesisRecipe.Large_Calibre_Munitions_Premium),
    High_Velocity_Munitions(SynthesisRecipe.High_Velocity_Munitions_Basic,
        SynthesisRecipe.High_Velocity_Munitions_Standard,
        SynthesisRecipe.High_Velocity_Munitions_Premium),
    Explosives_Munitions(SynthesisRecipe.Explosives_Munitions_Basic,
        SynthesisRecipe.Explosives_Munitions_Standard,
        SynthesisRecipe.Explosives_Munitions_Premium),
    Plasma_Munitions(SynthesisRecipe.Plasma_Munitions_Basic,
        SynthesisRecipe.Plasma_Munitions_Standard,
        SynthesisRecipe.Plasma_Munitions_Premium),

    // Human Tech
    Flechette_Launcher_Munitions(SynthesisRecipe.Flechette_Launcher_Munitions_Basic,
            SynthesisRecipe.Flechette_Launcher_Munitions_Standard,
            SynthesisRecipe.Flechette_Launcher_Munitions_Premium),
    Enzyme_Missile_Munitions(SynthesisRecipe.Enzyme_Missile_Munitions_Basic,
            SynthesisRecipe.Enzyme_Missile_Munitions_Standard,
            SynthesisRecipe.Enzyme_Missile_Munitions_Premium),

    // Anti-Xeno
    AX_Small_Calibre_Munitions(SynthesisRecipe.AX_Small_Calibre_Munitions_Basic,
            SynthesisRecipe.AX_Small_Calibre_Munitions_Standard,
            SynthesisRecipe.AX_Small_Calibre_Munitions_Premium),
    AX_Remote_Flak_Munitions(SynthesisRecipe.AX_Remote_Flak_Munitions_Basic,
            SynthesisRecipe.AX_Remote_Flak_Munitions_Standard,
            SynthesisRecipe.AX_Remote_Flak_Munitions_Premium),
    AX_Explosive_Munitions(SynthesisRecipe.AX_Explosive_Munitions_Basic,
            SynthesisRecipe.AX_Explosive_Munitions_Standard,
            SynthesisRecipe.AX_Explosive_Munitions_Premium),

    // Guardian Tech
    Guardian_Gauss_Cannon_Munitions(SynthesisRecipe.Guardian_Gauss_Cannon_Munitions_Basic,
            SynthesisRecipe.Guardian_Gauss_Cannon_Munitions_Standard,
            SynthesisRecipe.Guardian_Gauss_Cannon_Munitions_Premium),
    Guardian_Plasma_Charger_Munitions(SynthesisRecipe.Guardian_Plasma_Charger_Munitions_Basic,
            SynthesisRecipe.Guardian_Plasma_Charger_Munitions_Standard,
            SynthesisRecipe.Guardian_Plasma_Charger_Munitions_Premium),
    Guardian_Shard_Cannon_Munitions(SynthesisRecipe.Guardian_Shard_Cannon_Munitions_Basic,
            SynthesisRecipe.Guardian_Shard_Cannon_Munitions_Standard,
            SynthesisRecipe.Guardian_Shard_Cannon_Munitions_Premium),

    // SRV
    SRV_Refuel(SynthesisRecipe.SRV_Refuel_Basic,
            SynthesisRecipe.SRV_Refuel_Standard,
            SynthesisRecipe.SRV_Refuel_Premium),
    SRV_Repair(SynthesisRecipe.SRV_Repair_Basic,
            SynthesisRecipe.SRV_Repair_Standard,
            SynthesisRecipe.SRV_Repair_Premium),
    SRV_Ammo_Restock(SynthesisRecipe.SRV_Ammo_Restock_Basic,
            SynthesisRecipe.SRV_Ammo_Restock_Standard,
            SynthesisRecipe.SRV_Ammo_Restock_Premium),

    // Ship
    Chaff(SynthesisRecipe.Chaff_Basic,
            SynthesisRecipe.Chaff_Standard,
            SynthesisRecipe.Chaff_Premium),
    Limpets(SynthesisRecipe.Limpets),
    Heat_Sink(SynthesisRecipe.Heat_Sink_Basic,
            SynthesisRecipe.Heat_Sink_Standard,
            SynthesisRecipe.Heat_Sink_Premium),
    AFM_Refill(SynthesisRecipe.AFM_Refill_Basic,
            SynthesisRecipe.AFM_Refill_Standard,
            SynthesisRecipe.AFM_Refill_Premium),
    Life_Support(SynthesisRecipe.Life_Support),
    FSD_Injection(SynthesisRecipe.FSD_Injection_Basic,
            SynthesisRecipe.FSD_Injection_Standard,
            SynthesisRecipe.FSD_Injection_Premium),

    ;

    private final SynthesisRecipe[] recipes;

    SynthesisBlueprint(SynthesisRecipe ... recipes)
    {
        this.recipes = recipes;
    }

    public Stream<SynthesisRecipe> recipeStream()
    {
        return Arrays.stream(recipes);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }
}
