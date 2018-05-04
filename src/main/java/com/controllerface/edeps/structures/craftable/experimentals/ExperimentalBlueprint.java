package com.controllerface.edeps.structures.craftable.experimentals;

import com.controllerface.edeps.ProcurementBlueprint;
import com.controllerface.edeps.ProcurementRecipe;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/11/2018.
 */
public enum ExperimentalBlueprint implements ProcurementBlueprint
{
    // weapons
    Beam_Laser(ExperimentalRecipe.Concordant_Sequence,
            ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Regeneration_Sequence,
            ExperimentalRecipe.Stripped_Down_Weapon,
            ExperimentalRecipe.Thermal_Conduit,
            ExperimentalRecipe.Thermal_Shock,
            ExperimentalRecipe.Thermal_Vent),

    Burst_Laser(ExperimentalRecipe.Concordant_Sequence,
            ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Inertial_Impact,
            ExperimentalRecipe.Multi_Servos,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Phasing_Sequence,
            ExperimentalRecipe.Scramble_Spectrum,
            ExperimentalRecipe.Stripped_Down_Weapon,
            ExperimentalRecipe.Thermal_Shock),

    Pulse_Laser(ExperimentalRecipe.Concordant_Sequence,
            ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Emissive_Munitions,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Multi_Servos,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Phasing_Sequence,
            ExperimentalRecipe.Scramble_Spectrum,
            ExperimentalRecipe.Stripped_Down_Weapon,
            ExperimentalRecipe.Thermal_Shock),

    Cannon(ExperimentalRecipe.Auto_Loader,
            ExperimentalRecipe.Dispersal_Field,
            ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Force_Shell,
            ExperimentalRecipe.High_Yield_Shell,
            ExperimentalRecipe.Multi_Servos,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Smart_Rounds,
            ExperimentalRecipe.Stripped_Down_Weapon,
            ExperimentalRecipe.Thermal_Cascade),

    Multi_Cannon(ExperimentalRecipe.Auto_Loader,
            ExperimentalRecipe.Corrosive_Shell,
            ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Emissive_Munitions,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Incendiary_Rounds,
            ExperimentalRecipe.Multi_Servos,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Smart_Rounds,
            ExperimentalRecipe.Stripped_Down_Weapon,
            ExperimentalRecipe.Thermal_Shock),

    Fragment_Cannon(ExperimentalRecipe.Corrosive_Shell,
            ExperimentalRecipe.Dazzle_Shell,
            ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Drag_Munitions,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Incendiary_Rounds,
            ExperimentalRecipe.Multi_Servos,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Screening_Shell,
            ExperimentalRecipe.Stripped_Down_Weapon),

    Missile_Rack(ExperimentalRecipe.Emissive_Munitions,
            ExperimentalRecipe.FSD_Interrupt,
            ExperimentalRecipe.Overload_Munitions,
            ExperimentalRecipe.Penetrator_Munitions,
            ExperimentalRecipe.Thermal_Cascade),

    Seeker_Missile_Rack(ExperimentalRecipe.Drag_Munitions,
            ExperimentalRecipe.Emissive_Munitions,
            ExperimentalRecipe.Overload_Munitions,
            ExperimentalRecipe.Thermal_Cascade),

    Torpedo_Pylon(ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Mass_Lock_Munition,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Penetrator_Payload,
            ExperimentalRecipe.Reverberating_Cascade,
            ExperimentalRecipe.Stripped_Down_Weapon),

    Mine_Launcher(ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Emissive_Munitions,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Ion_Disruption,
            ExperimentalRecipe.Overload_Munitions,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Radiant_Canister,
            ExperimentalRecipe.Reverberating_Cascade,
            ExperimentalRecipe.Shift_lock_Canister,
            ExperimentalRecipe.Stripped_Down_Weapon),

    Plasma_Accelerator(ExperimentalRecipe.Dazzle_Shell,
            ExperimentalRecipe.Dispersal_Field,
            ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Multi_Servos,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Phasing_Sequence,
            ExperimentalRecipe.Plasma_Slug_Plasma_Accelerator,
            ExperimentalRecipe.Stripped_Down_Weapon,
            ExperimentalRecipe.Target_Lock_Breaker,
            ExperimentalRecipe.Thermal_Conduit),

    Rail_Gun(ExperimentalRecipe.Double_Braced_Weapon,
            ExperimentalRecipe.Feedback_Cascade,
            ExperimentalRecipe.Flow_Control_Weapon,
            ExperimentalRecipe.Multi_Servos,
            ExperimentalRecipe.Oversized,
            ExperimentalRecipe.Plasma_Slug_Rail_Gun,
            ExperimentalRecipe.Stripped_Down_Weapon,
            ExperimentalRecipe.Super_Penetrator),

    // util
    Shield_Booster(ExperimentalRecipe.Blast_Block,
            ExperimentalRecipe.Double_Braced_Booster,
            ExperimentalRecipe.Flow_Control_Booster,
            ExperimentalRecipe.Force_Block_Booster,
            ExperimentalRecipe.Super_Capacitors,
            ExperimentalRecipe.Thermo_Block_Booster),

    // optional
    Hull_Reinforcement_Package(ExperimentalRecipe.Angled_Plating_Hull,
            ExperimentalRecipe.Deep_Plating_Hull,
            ExperimentalRecipe.Layered_Plating_Hull,
            ExperimentalRecipe.Reflective_Plating_Hull),

    Shield_Cell_Bank(ExperimentalRecipe.Boss_Cells,
            ExperimentalRecipe.Double_Braced_Shield_Cell,
            ExperimentalRecipe.Flow_Control_Shield_Cell,
            ExperimentalRecipe.Recycling_Cell,
            ExperimentalRecipe.Stripped_Down_Shield_Cell),

    Shield_Generator(ExperimentalRecipe.Double_Braced_Shield,
            ExperimentalRecipe.Fast_Charge,
            ExperimentalRecipe.Force_Block_Shield,
            ExperimentalRecipe.Hi_Cap,
            ExperimentalRecipe.Lo_Draw,
            ExperimentalRecipe.Multi_weave,
            ExperimentalRecipe.Stripped_Down_Shield,
            ExperimentalRecipe.Thermo_Block_Shield),

    // core
    Frame_Shift_Drive(ExperimentalRecipe.Deep_Charge,
            ExperimentalRecipe.Double_Braced_FSD,
            ExperimentalRecipe.Mass_Manager,
            ExperimentalRecipe.Stripped_Down_FSD,
            ExperimentalRecipe.Thermal_Spread_FSD),

    Power_Distributor(ExperimentalRecipe.Cluster_Capacitors,
            ExperimentalRecipe.Double_Braced_Distributor,
            ExperimentalRecipe.Flow_Control_Distributor,
            ExperimentalRecipe.Stripped_Down_Distributor,
            ExperimentalRecipe.Super_Conduits),

    Power_Plant(ExperimentalRecipe.Double_Braced_Power_Plant,
            ExperimentalRecipe.Monstered,
            ExperimentalRecipe.Stripped_Down_Power_Plant,
            ExperimentalRecipe.Thermal_Spread_Power_Plant),

    Thrusters(ExperimentalRecipe.Double_Braced_Thrusters,
            ExperimentalRecipe.Drag_Drives,
            ExperimentalRecipe.Drive_Distributors,
            ExperimentalRecipe.Stripped_Down_Thrusters,
            ExperimentalRecipe.Thermal_Spread_Thrusters),

    Bulkheads(ExperimentalRecipe.Angled_Plating_Armor,
            ExperimentalRecipe.Deep_Plating_Armor,
            ExperimentalRecipe.Layered_Plating_Armor,
            ExperimentalRecipe.Reflective_Plating_Armor),
    ;

    private final ExperimentalRecipe[] recipes;
    private final String text;

    ExperimentalBlueprint( ExperimentalRecipe... recipes)
    {
        this.text = name().replace("_"," ");
        this.recipes = recipes;
    }

    public Stream<ProcurementRecipe> recipeStream()
    {
        return Arrays.stream(recipes);
    }

    @Override
    public String toString()
    {
        return text;
    }
}
