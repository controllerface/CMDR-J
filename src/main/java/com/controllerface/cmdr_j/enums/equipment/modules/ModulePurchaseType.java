package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.interfaces.commander.ShipModule;
import com.controllerface.cmdr_j.classes.tasks.ModulePurchaseBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCategory;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCostCategory;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public enum ModulePurchaseType implements TaskType
{
    Core_Internal(EnumSet.allOf(CoreInternalModule.class)),
    Optional_Internal(EnumSet.allOf(OptionalInternalModule.class)),
    Utility_Mounts(EnumSet.allOf(UtilityModule.class)),
    Weapon_Hardpoints(EnumSet.allOf(HardpointModule.class)),

    ;

    private final EnumSet<? extends ShipModule> shipModules;

    List<TaskBlueprint> blueprints;

    ModulePurchaseType(EnumSet<? extends ShipModule> shipModules)
    {
        this.shipModules = shipModules;
        blueprints = Collections.singletonList(new ModulePurchaseBlueprint(name(), shipModules));
        blueprints.forEach(bp -> bp.setParentType(this));
    }

    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public List<TaskBlueprint> getBluePrints()
    {
        return blueprints;
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
