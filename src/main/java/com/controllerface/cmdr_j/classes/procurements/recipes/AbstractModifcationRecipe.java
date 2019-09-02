package com.controllerface.cmdr_j.classes.procurements.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Arrays;
import java.util.stream.Stream;

public abstract class AbstractModifcationRecipe implements ProcurementRecipe
{
    private String parentBlueprintName;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;
    private final String name;

    private static Icon defaultIcon = new Icon(UIFunctions.Icons.engineering, 25, 30);

    public AbstractModifcationRecipe(String name, ItemGrade grade, ItemEffects effects, CostData ... cost)
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
    public Icon getIcon()
    {
        return defaultIcon;
    }

    @Override
    public void setParentBlueprintName(String blueprintName)
    {
        this.parentBlueprintName = blueprintName;
    }
}
