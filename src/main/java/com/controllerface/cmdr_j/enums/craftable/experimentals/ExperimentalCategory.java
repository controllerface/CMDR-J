package com.controllerface.cmdr_j.enums.craftable.experimentals;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
public enum ExperimentalCategory
{
    Core_Internal(EnumSet.of(ExperimentalType.Frame_Shift_Drive,
        ExperimentalType.Power_Distributor,
        ExperimentalType.Power_Plant,
        ExperimentalType.Thrusters,
        ExperimentalType.Bulkheads)),

    Optional_Internal(EnumSet.of(ExperimentalType.Hull_Reinforcement_Package,
        ExperimentalType.Shield_Cell_Bank,
        ExperimentalType.Shield_Generator)),

    Utility_Mounts(EnumSet.of(ExperimentalType.Shield_Booster)),

    Weapon_Hardpoints(EnumSet.of(ExperimentalType.Beam_Laser,
            ExperimentalType.Burst_Laser,
            ExperimentalType.Pulse_Laser,
            ExperimentalType.Cannon,
            ExperimentalType.Multi_Cannon,
            ExperimentalType.Fragment_Cannon,
            ExperimentalType.Missile_Rack,
            ExperimentalType.Seeker_Missile_Rack,
            ExperimentalType.Torpedo_Pylon,
            ExperimentalType.Mine_Launcher,
            ExperimentalType.Plasma_Accelerator,
            ExperimentalType.Rail_Gun)),

    ;

    private final EnumSet<ExperimentalType> experimentalTypes;

    ExperimentalCategory(EnumSet<ExperimentalType> experimentalTypes)
    {
        this.experimentalTypes = experimentalTypes;
    }

    public Stream<ExperimentalType> typeStream()
    {
        return experimentalTypes.stream();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
