package com.controllerface.cmdr_j.enums.craftable.upgrades;

import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCategory;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum UpgradeType implements TaskType
{
    Suits(EnumSet.of(UpgradeBlueprint.Dominator_Suit,
        UpgradeBlueprint.Maverick_Suit,
        UpgradeBlueprint.Artemis_Suit)),

    Kinetic_Weapons(EnumSet.of(UpgradeBlueprint.Karma_AR_50,
        UpgradeBlueprint.Karma_C_44,
        UpgradeBlueprint.Karma_L_6,
        UpgradeBlueprint.Karma_P_15)),

    Laser_Weapons(EnumSet.of(UpgradeBlueprint.TK_Aphelion,
        UpgradeBlueprint.TK_Eclipse,
        UpgradeBlueprint.TK_Zenith)),

    Plasma_Weapons(EnumSet.of(UpgradeBlueprint.Manticore_Executioner,
        UpgradeBlueprint.Manticore_Intimidator,
        UpgradeBlueprint.Manticore_Oppressor,
        UpgradeBlueprint.Manticore_Tormentor)),

    ;

    private final EnumSet<UpgradeBlueprint> blueprints;

    UpgradeType(EnumSet<UpgradeBlueprint> blueprints)
    {
        this.blueprints = blueprints;
        this.blueprints.forEach(bp -> bp.setParentType(this));
    }

    public Stream<UpgradeBlueprint> blueprintStream()
    {
        return blueprints.stream();
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
        return new ArrayList<>(blueprints);
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
}
