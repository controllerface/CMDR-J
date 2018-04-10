package com.controllerface.edeps.enums.experimentals;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ExperimentalType
{
    // weapons
    Beam_Laser(),

    Burst_Laser(),

    Pulse_Laser(),

    Cannon(),

    Multi_Cannon(),

    Fragment_Cannon(),

    Missile_Rack(),

    Seeker_Missile_Rack(),

    Torpedo_Pylon(),

    Mine_Launcher(),

    Plasma_Accelerator(),

    Rail_Gun(),

    // util
    Chaff_Launcher(),

    Heat_Sink_Launcher(),

    Point_Defense(),

    Electronic_Countermeasures(),

    Frame_Shift_Wake_Scanner(),

    Kill_Warrant_Scanner(),

    Manifest_Scanner(),

    Shield_Booster(),

    // optional
    Auto_Field_Maintenence_Unit(),

    Hull_Reinforcement_Package(),

    Detailed_Surface_Scanner(),

    Refinery(),

    Frame_Shift_Drive_Interdictor(),

    Fuel_Scoop(),

    Collector_Limpet_Controller(),

    Prospector_Limpet_Controller(),

    Fuel_Transfer_Limpet(),

    Hatch_Breaker_Limpet(),

    Shield_Cell_Bank(),

    Shield_Generator(),

    // core
    Frame_Shift_Drive(),

    Life_Support(),

    Power_Distributor(),

    Power_Plant(),

    Sensors(),

    Thrusters(),

    Bulkheads();

    private final ExperimentalBlueprint[] blueprints;

    ExperimentalType(ExperimentalBlueprint... blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<ExperimentalBlueprint> blueprintStream()
    {
        return Arrays.stream(blueprints);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
