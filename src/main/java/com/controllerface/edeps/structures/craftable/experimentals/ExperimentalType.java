package com.controllerface.edeps.structures.craftable.experimentals;

import com.controllerface.edeps.ProcurementType;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ExperimentalType implements ProcurementType
{
    // weapons
    Beam_Laser(ExperimentalBlueprint.Beam_Laser),
    Burst_Laser(ExperimentalBlueprint.Burst_Laser),
    Pulse_Laser(ExperimentalBlueprint.Pulse_Laser),
    Cannon(ExperimentalBlueprint.Cannon),
    Multi_Cannon(ExperimentalBlueprint.Multi_Cannon),
    Fragment_Cannon(ExperimentalBlueprint.Fragment_Cannon),
    Missile_Rack(ExperimentalBlueprint.Missile_Rack),
    Seeker_Missile_Rack(ExperimentalBlueprint.Seeker_Missile_Rack),
    Torpedo_Pylon(ExperimentalBlueprint.Torpedo_Pylon),
    Mine_Launcher(ExperimentalBlueprint.Mine_Launcher),
    Plasma_Accelerator(ExperimentalBlueprint.Plasma_Accelerator),
    Rail_Gun(ExperimentalBlueprint.Rail_Gun),

    // util
    Shield_Booster(ExperimentalBlueprint.Shield_Booster),

    // optional
    Hull_Reinforcement_Package(ExperimentalBlueprint.Hull_Reinforcement_Package),
    Shield_Cell_Bank(ExperimentalBlueprint.Shield_Cell_Bank),
    Shield_Generator(ExperimentalBlueprint.Shield_Generator),

    // core
    Frame_Shift_Drive(ExperimentalBlueprint.Frame_Shift_Drive),
    Power_Distributor(ExperimentalBlueprint.Power_Distributor),
    Power_Plant(ExperimentalBlueprint.Power_Plant),
    Thrusters(ExperimentalBlueprint.Thrusters),
    Bulkheads(ExperimentalBlueprint.Bulkheads);

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

    @Override
    public String getName()
    {
        return name();
    }
}
