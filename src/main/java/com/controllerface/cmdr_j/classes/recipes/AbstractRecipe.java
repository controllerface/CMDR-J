package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.Arrays;
import java.util.stream.Stream;

public abstract class AbstractRecipe implements TaskRecipe
{
    private TaskBlueprint parentBlueprintName = null;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;
    private final String name;

    AbstractRecipe(String name, ItemGrade grade, ItemEffects effects, CostData... cost)
    {
        this.name = name;
        this.grade = grade;
        this.effects = effects;
        this.cost = cost;
    }

    @Override
    public Stream<CostData> costStream()
    {
        return Arrays.stream(cost);
    }

    @Override
    public String getShortLabel()
    {
        return grade.toString();
    }

    @Override
    public String getDisplayLabel()
    {
        return getShortLabel() + " :: " +  parentBlueprintName;
    }

    @Override
    public ItemEffects effects()
    {
        return effects;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public ItemGrade getGrade()
    {
        return grade;
    }

    @Override
    public void setParentBlueprintName(TaskBlueprint blueprintName)
    {
        this.parentBlueprintName = blueprintName;
    }

    @Override
    public TaskBlueprint getParentBlueprint()
    {
        return parentBlueprintName;
    }
}
