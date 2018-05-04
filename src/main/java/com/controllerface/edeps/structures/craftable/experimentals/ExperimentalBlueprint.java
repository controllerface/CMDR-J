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


//   Angled_Plating_Armor("Angled Plating", ExperimentalRecipe.Angled_Plating_Armor),
//    Angled_Plating_Hull("Angled Plating", ExperimentalRecipe.Angled_Plating_Hull),
//    Auto_Loader("Auto Loader", ExperimentalRecipe.Auto_Loader),
//    Blast_Block("Blast Block", ExperimentalRecipe.Blast_Block),
//    Boss_Cells("Boss Cells", ExperimentalRecipe.Boss_Cells),
//    Cluster_Capacitors("Cluster Capacitors", ExperimentalRecipe.Cluster_Capacitors),
//    Concordant_Sequence("Concordant Sequence", ExperimentalRecipe.Concordant_Sequence),
//    Corrosive_Shell("Corrosive Shell", ExperimentalRecipe.Corrosive_Shell),
//    Dazzle_Shell("Dazzle Shell", ExperimentalRecipe.Dazzle_Shell),
//    Deep_Charge("Deep Charge", ExperimentalRecipe.Deep_Charge),
//    Deep_Plating_Armor("Deep Plating", ExperimentalRecipe.Deep_Plating_Armor),
//    Deep_Plating_Hull("Deep Plating", ExperimentalRecipe.Deep_Plating_Hull),
//    Dispersal_Field("Dispersal Field", ExperimentalRecipe.Dispersal_Field),
//    Double_Braced_Shield("Double Braced", ExperimentalRecipe.Double_Braced_Shield),
//    Double_Braced_Thrusters("Double Braced", ExperimentalRecipe.Double_Braced_Thrusters),
//    Double_Braced_FSD("Double Braced", ExperimentalRecipe.Double_Braced_FSD),
//    Double_Braced_Power_Plant("Double Braced", ExperimentalRecipe.Double_Braced_Power_Plant),
//    Double_Braced_Distributor("Double Braced", ExperimentalRecipe.Double_Braced_Distributor),
//    Double_Braced_Shield_Cell("Double Braced", ExperimentalRecipe.Double_Braced_Shield_Cell),
//    Double_Braced_Weapon("Double Braced", ExperimentalRecipe.Double_Braced_Weapon),
//    Double_Braced_Booster("Double Braced", ExperimentalRecipe.Double_Braced_Booster),
//    Drag_Drives("Drag Drives", ExperimentalRecipe.Drag_Drives),
//    Drag_Munitions("Drag Munitions", ExperimentalRecipe.Drag_Munitions),
//    Drive_Distributors("Drive Distributors", ExperimentalRecipe.Drive_Distributors),
//    Emissive_Munitions("Emissive Munitions", ExperimentalRecipe.Emissive_Munitions),
//    Fast_Charge("Fast Charge", ExperimentalRecipe.Fast_Charge),
//    Feedback_Cascade("Feedback Cascade", ExperimentalRecipe.Feedback_Cascade),
//    Flow_Control_Distributor("Flow Control", ExperimentalRecipe.Flow_Control_Distributor),
//    Flow_Control_Shield_Cell("Flow Control", ExperimentalRecipe.Flow_Control_Shield_Cell),
//    Flow_Control_Weapon("Flow Control", ExperimentalRecipe.Flow_Control_Weapon),
//    Flow_Control_Booster("Flow Control", ExperimentalRecipe.Flow_Control_Booster),
//    Force_Block_Shield("Force Block", ExperimentalRecipe.Force_Block_Shield),
//    Force_Block_Booster("Force Block", ExperimentalRecipe.Force_Block_Booster),
//    Force_Shell("Force Shell", ExperimentalRecipe.Force_Shell),
//    FSD_Interrupt("FSD Interrupt", ExperimentalRecipe.FSD_Interrupt),
//    Hi_Cap("Hi Cap", ExperimentalRecipe.Hi_Cap),
//    High_Yield_Shell("High Yield Shell", ExperimentalRecipe.High_Yield_Shell),
//    Incendiary_Rounds("Incendiary Rounds", ExperimentalRecipe.Incendiary_Rounds),
//    Inertial_Impact("Inertial Impact", ExperimentalRecipe.Inertial_Impact),
//    Ion_Disruption("Ion Disruption", ExperimentalRecipe.Ion_Disruption),
//    Layered_Plating_Armor("Layered Plating", ExperimentalRecipe.Layered_Plating_Armor),
//    Layered_Plating_Hull("Layered Plating", ExperimentalRecipe.Layered_Plating_Hull),
//    Lo_Draw("Lo Draw", ExperimentalRecipe.Lo_Draw),
//    Mass_Lock_Munition("Mass Lock Munition", ExperimentalRecipe.Mass_Lock_Munition),
//    Mass_Manager("Mass Manager", ExperimentalRecipe.Mass_Manager),
//    Monstered("Monstered", ExperimentalRecipe.Monstered),
//    Multi_Servos("Multi Servos", ExperimentalRecipe.Multi_Servos),
//    Multi_weave("Multi weave", ExperimentalRecipe.Multi_weave),
//    Overload_Munitions("Overload Munitions", ExperimentalRecipe.Overload_Munitions),
//    Oversized("Oversized", ExperimentalRecipe.Oversized),
//    Penetrator_Munitions("Penetrator Munitions", ExperimentalRecipe.Penetrator_Munitions),
//    Penetrator_Payload("Penetrator Payload", ExperimentalRecipe.Penetrator_Payload),
//    Phasing_Sequence("Phasing Sequence", ExperimentalRecipe.Phasing_Sequence),
//    Plasma_Slug_Plasma_Accelerator("Plasma Slug", ExperimentalRecipe.Plasma_Slug_Plasma_Accelerator),
//    Plasma_Slug_Rail_Gun("Plasma Slug", ExperimentalRecipe.Plasma_Slug_Rail_Gun),
//    Radiant_Canister("Radiant Canister", ExperimentalRecipe.Radiant_Canister),
//    Recycling_Cell("Recycling Cell", ExperimentalRecipe.Recycling_Cell),
//    Reflective_Plating_Armor("Reflective Plating", ExperimentalRecipe.Reflective_Plating_Armor),
//    Reflective_Plating_Hull("Reflective Plating", ExperimentalRecipe.Reflective_Plating_Hull),
//    Regeneration_Sequence("Regeneration Sequence", ExperimentalRecipe.Regeneration_Sequence),
//    Reverberating_Cascade("Reverberating Cascade", ExperimentalRecipe.Reverberating_Cascade),
//    Scramble_Spectrum("Scramble Spectrum", ExperimentalRecipe.Scramble_Spectrum),
//    Screening_Shell("Screening Shell", ExperimentalRecipe.Screening_Shell),
//    Shift_lock_Canister("Shift lock Canister", ExperimentalRecipe.Shift_lock_Canister),
//    Smart_Rounds("Smart Rounds", ExperimentalRecipe.Smart_Rounds),
//    Stripped_Down_Shield("Stripped Down", ExperimentalRecipe.Stripped_Down_Shield),
//    Stripped_Down_Thrusters("Stripped Down", ExperimentalRecipe.Stripped_Down_Thrusters),
//    Stripped_Down_FSD("Stripped Down", ExperimentalRecipe.Stripped_Down_FSD),
//    Stripped_Down_Power_Plant("Stripped Down", ExperimentalRecipe.Stripped_Down_Power_Plant),
//    Stripped_Down_Distributor("Stripped Down", ExperimentalRecipe.Stripped_Down_Distributor),
//    Stripped_Down_Shield_Cell("Stripped Down", ExperimentalRecipe.Stripped_Down_Shield_Cell),
//    Stripped_Down_Weapon("Stripped Down", ExperimentalRecipe.Stripped_Down_Weapon),
//    Super_Capacitors("Super Capacitors", ExperimentalRecipe.Super_Capacitors),
//    Super_Conduits("Super Conduits", ExperimentalRecipe.Super_Conduits),
//    Super_Penetrator("Super Penetrator", ExperimentalRecipe.Super_Penetrator),
//    Target_Lock_Breaker("Target Lock Breaker", ExperimentalRecipe.Target_Lock_Breaker),
//    Thermal_Cascade("Thermal Cascade", ExperimentalRecipe.Thermal_Cascade),
//    Thermal_Conduit("Thermal Conduit", ExperimentalRecipe.Thermal_Conduit),
//    Thermal_Shock("Thermal Shock", ExperimentalRecipe.Thermal_Shock),
//    Thermal_Spread_Thrusters("Thermal Spread", ExperimentalRecipe.Thermal_Spread_Thrusters),
//    Thermal_Spread_FSD("Thermal Spread", ExperimentalRecipe.Thermal_Spread_FSD),
//    Thermal_Spread_Power_Plant("Thermal Spread", ExperimentalRecipe.Thermal_Spread_Power_Plant),
//    Thermal_Vent("Thermal Vent", ExperimentalRecipe.Thermal_Vent),
//    Thermo_Block_Shield("Thermo Block", ExperimentalRecipe.Thermo_Block_Shield),
//    Thermo_Block_Booster("Thermo Block", ExperimentalRecipe.Thermo_Block_Booster),



//    // weapons
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
