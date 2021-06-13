package com.controllerface.cmdr_j.classes.modules;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.List;

public abstract class AbstractModule implements OwnableModule
{
    private final String displayText;
    private final TaskType modificationType;
    private final TaskType experimentalType;
    private final ItemEffects itemEffects;

    public AbstractModule(String displayText, ItemEffects itemEffects)
    {
        this(displayText, null, null, itemEffects);
    }

    public AbstractModule(String displayText, TaskType modificationType, ItemEffects itemEffects)
    {
        this(displayText, modificationType, null, itemEffects);
    }

    public AbstractModule(String displayText,
                          TaskType modificationType,
                          TaskType experimentalType,
                          ItemEffects itemEffects)
    {
        this.displayText = displayText;
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.itemEffects = itemEffects;
    }

    @Override
    public String displayText()
    {
        return displayText;
    }

    @Override
    public TaskType experimentalType()
    {
        return experimentalType;
    }

    @Override
    public TaskType modificationType()
    {
        return modificationType;
    }

    @Override
    public ItemEffects itemEffects()
    {
        return itemEffects;
    }

    @Override
    public List<TaskRecipe> getAssociated()
    {
        return null;
    }

    @Override
    public void associate(TaskRecipe recipe)
    {

    }

    @Override
    public String getLocationInformation()
    {
        return null;
    }

    @Override
    public void setLocationInformation(String locationInformation)
    {

    }

    @Override
    public String getLocalizedName()
    {
        return displayText;
    }

    @Override
    public void setLocalizedName(String localizedName)
    {

    }

    /*
    this "grade" value is not intended to be used for modules grades, it is for materials which also are classes
    as TaskCost objects, as are modules. While it is somewhat confusing, these items must all use a common
    interface so they can all be used with the "task" system. As such, this should always be null for modules.
    */
    @Override
    public ItemGrade getGrade()
    {
        return null;
    }

    @Override
    public long price()
    {
        return 1;
    }
}
