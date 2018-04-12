package com.controllerface.edeps.enums.procurements.experimentals;

import com.controllerface.edeps.ProcurementType;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ExperimentalType implements ProcurementType
{
    // weapons
    Beam_Laser(ExperimentalBlueprint.Concordant_Sequence,
            ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Regeneration_Sequence,
            ExperimentalBlueprint.Stripped_Down_Weapon,
            ExperimentalBlueprint.Thermal_Conduit,
            ExperimentalBlueprint.Thermal_Shock,
            ExperimentalBlueprint.Thermal_Vent),

    Burst_Laser(ExperimentalBlueprint.Concordant_Sequence,
            ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Inertial_Impact,
            ExperimentalBlueprint.Multi_Servos,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Phasing_Sequence,
            ExperimentalBlueprint.Scramble_Spectrum,
            ExperimentalBlueprint.Stripped_Down_Weapon,
            ExperimentalBlueprint.Thermal_Shock),

    Pulse_Laser(ExperimentalBlueprint.Concordant_Sequence,
            ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Emissive_Munitions,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Multi_Servos,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Phasing_Sequence,
            ExperimentalBlueprint.Scramble_Spectrum,
            ExperimentalBlueprint.Stripped_Down_Weapon,
            ExperimentalBlueprint.Thermal_Shock),

    Cannon(ExperimentalBlueprint.Auto_Loader,
            ExperimentalBlueprint.Dispersal_Field,
            ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Force_Shell,
            ExperimentalBlueprint.High_Yield_Shell,
            ExperimentalBlueprint.Multi_Servos,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Smart_Rounds,
            ExperimentalBlueprint.Stripped_Down_Weapon,
            ExperimentalBlueprint.Thermal_Cascade),

    Multi_Cannon(ExperimentalBlueprint.Auto_Loader,
            ExperimentalBlueprint.Corrosive_Shell,
            ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Emissive_Munitions,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Incendiary_Rounds,
            ExperimentalBlueprint.Multi_Servos,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Smart_Rounds,
            ExperimentalBlueprint.Stripped_Down_Weapon,
            ExperimentalBlueprint.Thermal_Shock),

    Fragment_Cannon(ExperimentalBlueprint.Corrosive_Shell,
            ExperimentalBlueprint.Dazzle_Shell,
            ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Drag_Munitions,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Incendiary_Rounds,
            ExperimentalBlueprint.Multi_Servos,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Screening_Shell,
            ExperimentalBlueprint.Stripped_Down_Weapon),

    Missile_Rack(ExperimentalBlueprint.Emissive_Munitions,
            ExperimentalBlueprint.FSD_Interrupt,
            ExperimentalBlueprint.Overload_Munitions,
            ExperimentalBlueprint.Penetrator_Munitions,
            ExperimentalBlueprint.Thermal_Cascade),

    Seeker_Missile_Rack(ExperimentalBlueprint.Drag_Munitions,
            ExperimentalBlueprint.Emissive_Munitions,
            ExperimentalBlueprint.Overload_Munitions,
            ExperimentalBlueprint.Thermal_Cascade),

    Torpedo_Pylon(ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Mass_Lock_Munition,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Penetrator_Payload,
            ExperimentalBlueprint.Reverberating_Cascade,
            ExperimentalBlueprint.Stripped_Down_Weapon),

    Mine_Launcher(ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Emissive_Munitions,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Ion_Disruption,
            ExperimentalBlueprint.Overload_Munitions,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Radiant_Canister,
            ExperimentalBlueprint.Reverberating_Cascade,
            ExperimentalBlueprint.Shift_lock_Canister,
            ExperimentalBlueprint.Stripped_Down_Weapon),

    Plasma_Accelerator(ExperimentalBlueprint.Dazzle_Shell,
            ExperimentalBlueprint.Dispersal_Field,
            ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Multi_Servos,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Phasing_Sequence,
            ExperimentalBlueprint.Plasma_Slug_Plasma_Accelerator,
            ExperimentalBlueprint.Stripped_Down_Weapon,
            ExperimentalBlueprint.Target_Lock_Breaker,
            ExperimentalBlueprint.Thermal_Conduit),

    Rail_Gun(ExperimentalBlueprint.Double_Braced_Weapon,
            ExperimentalBlueprint.Feedback_Cascade,
            ExperimentalBlueprint.Flow_Control_Weapon,
            ExperimentalBlueprint.Multi_Servos,
            ExperimentalBlueprint.Oversized,
            ExperimentalBlueprint.Plasma_Slug_Rail_Gun,
            ExperimentalBlueprint.Stripped_Down_Weapon,
            ExperimentalBlueprint.Super_Penetrator),

    // util
    Shield_Booster(ExperimentalBlueprint.Blast_Block,
            ExperimentalBlueprint.Double_Braced_Booster,
            ExperimentalBlueprint.Flow_Control_Booster,
            ExperimentalBlueprint.Force_Block_Booster,
            ExperimentalBlueprint.Super_Capacitors,
            ExperimentalBlueprint.Thermo_Block_Booster),

    // optional
    Hull_Reinforcement_Package(ExperimentalBlueprint.Angled_Plating_Hull,
            ExperimentalBlueprint.Deep_Plating_Hull,
            ExperimentalBlueprint.Layered_Plating_Hull,
            ExperimentalBlueprint.Reflective_Plating_Hull),

    Shield_Cell_Bank(ExperimentalBlueprint.Boss_Cells,
            ExperimentalBlueprint.Double_Braced_Shield_Cell,
            ExperimentalBlueprint.Flow_Control_Shield_Cell,
            ExperimentalBlueprint.Recycling_Cell,
            ExperimentalBlueprint.Stripped_Down_Shield_Cell),

    Shield_Generator(ExperimentalBlueprint.Double_Braced_Shield,
            ExperimentalBlueprint.Fast_Charge,
            ExperimentalBlueprint.Force_Block_Shield,
            ExperimentalBlueprint.Hi_Cap,
            ExperimentalBlueprint.Lo_Draw,
            ExperimentalBlueprint.Multi_weave,
            ExperimentalBlueprint.Stripped_Down_Shield,
            ExperimentalBlueprint.Thermo_Block_Shield),

    // core
    Frame_Shift_Drive(ExperimentalBlueprint.Deep_Charge,
            ExperimentalBlueprint.Double_Braced_FSD,
            ExperimentalBlueprint.Mass_Manager,
            ExperimentalBlueprint.Stripped_Down_FSD,
            ExperimentalBlueprint.Thermal_Spread_FSD),

    Power_Distributor(ExperimentalBlueprint.Cluster_Capacitors,
            ExperimentalBlueprint.Double_Braced_Distributor,
            ExperimentalBlueprint.Flow_Control_Distributor,
            ExperimentalBlueprint.Stripped_Down_Distributor,
            ExperimentalBlueprint.Super_Conduits),

    Power_Plant(ExperimentalBlueprint.Double_Braced_Power_Plant,
            ExperimentalBlueprint.Monstered,
            ExperimentalBlueprint.Stripped_Down_Power_Plant,
            ExperimentalBlueprint.Thermal_Spread_Power_Plant),

    Thrusters(ExperimentalBlueprint.Double_Braced_Thrusters,
            ExperimentalBlueprint.Drag_Drives,
            ExperimentalBlueprint.Drive_Distributors,
            ExperimentalBlueprint.Stripped_Down_Thrusters,
            ExperimentalBlueprint.Thermal_Spread_Thrusters),

    Bulkheads(ExperimentalBlueprint.Angled_Plating_Armor,
            ExperimentalBlueprint.Deep_Plating_Armor,
            ExperimentalBlueprint.Layered_Plating_Armor,
            ExperimentalBlueprint.Reflective_Plating_Armor);

    private final ExperimentalBlueprint[] blueprints;

    ExperimentalType(ExperimentalBlueprint... blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<ExperimentalBlueprint> bluePrintStream()
    {
        return Arrays.stream(blueprints);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
