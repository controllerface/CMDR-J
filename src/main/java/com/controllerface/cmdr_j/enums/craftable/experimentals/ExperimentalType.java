package com.controllerface.cmdr_j.enums.craftable.experimentals;

import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCategory;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCostCategory;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
public enum ExperimentalType implements TaskType
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

    private final ExperimentalBlueprint blueprint;

    ExperimentalType(ExperimentalBlueprint blueprint)
    {
        this.blueprint = blueprint;
        blueprint.setParentType(this);
    }

    public Stream<ExperimentalBlueprint> blueprintStream()
    {
        return Stream.of(blueprint);
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

    @Override
    public List<TaskBlueprint> getBluePrints()
    {
        return Collections.singletonList(blueprint);
    }

    private TaskCategory taskCategory = null;

    @Override
    public void setParentCategory(TaskCategory taskCategory)
    {
        this.taskCategory = taskCategory;
    }

    @Override
    public TaskCategory getParentCategory()
    {
        return taskCategory;
    }

    public static List<ExperimentalType> associatedTypes(ExperimentalRecipe recipe)
    {
        return Arrays.stream(values())
            .filter(experimentalType -> experimentalType.blueprintStream()
                .anyMatch(experimentalBlueprint -> experimentalBlueprint.recipeStream()
                    .anyMatch(experimentalRecipe -> experimentalRecipe.equals(recipe))))
            .collect(Collectors.toList());
    }
}
