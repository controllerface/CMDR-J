package com.controllerface.edeps.enums.experimentals;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ExperimentalCategory
{
    Weapon_Hardpoints(ExperimentalType.Beam_Laser,
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
            ExperimentalType.Rail_Gun),

    Utility_Mounts(ExperimentalType.Chaff_Launcher,
            ExperimentalType.Heat_Sink_Launcher,
            ExperimentalType.Point_Defense,
            ExperimentalType.Electronic_Countermeasures,
            ExperimentalType.Frame_Shift_Wake_Scanner,
            ExperimentalType.Kill_Warrant_Scanner,
            ExperimentalType.Manifest_Scanner,
            ExperimentalType.Shield_Booster),

    Optional_Internal(ExperimentalType.Auto_Field_Maintenence_Unit,
            ExperimentalType.Hull_Reinforcement_Package,
            ExperimentalType.Detailed_Surface_Scanner,
            ExperimentalType.Refinery,
            ExperimentalType.Frame_Shift_Drive_Interdictor,
            ExperimentalType.Fuel_Scoop,
            ExperimentalType.Collector_Limpet_Controller,
            ExperimentalType.Prospector_Limpet_Controller,
            ExperimentalType.Fuel_Transfer_Limpet,
            ExperimentalType.Hatch_Breaker_Limpet,
            ExperimentalType.Shield_Cell_Bank,
            ExperimentalType.Shield_Generator),

    Core_Internal(ExperimentalType.Frame_Shift_Drive,
            ExperimentalType.Life_Support,
            ExperimentalType.Power_Distributor,
            ExperimentalType.Power_Plant,
            ExperimentalType.Sensors,
            ExperimentalType.Thrusters,
            ExperimentalType.Bulkheads);

    private final ExperimentalType[] experimentalTypes;

    ExperimentalCategory(ExperimentalType ... experimentalTypes)
    {
        this.experimentalTypes = experimentalTypes;
    }

    public Stream<ExperimentalType> experimentStream()
    {
        return Arrays.stream(experimentalTypes);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
