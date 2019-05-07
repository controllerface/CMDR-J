package com.controllerface.cmdr_j.data.procurements.recipes;

import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.Arrays;
import java.util.stream.Stream;

public abstract class AbstractModifcationRecipe implements ProcurementRecipe
{
    private String parentBlueprintName;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;
    private final String name;

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
        return ModificationRecipe.icon;
    }

    @Override
    public void setParentBlueprintName(String blueprintName)
    {
        this.parentBlueprintName = blueprintName;
    }
}
