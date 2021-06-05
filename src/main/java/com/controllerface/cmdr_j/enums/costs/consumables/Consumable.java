package com.controllerface.cmdr_j.enums.costs.consumables;

import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCost;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum Consumable implements TaskCost
{
    HEALTHPACK(ItemGrade.MicroMaterial),
    ENERGYCELL(ItemGrade.MicroMaterial),
    AMM_GRENADE_FRAG(ItemGrade.MicroMaterial),
    AMM_GRENADE_EMP(ItemGrade.MicroMaterial),
    AMM_GRENADE_SHIELD(ItemGrade.MicroMaterial),
    ;

    public final long id;
    public final long homeMarket;
    private final ItemGrade grade;
    private String localizedName = name();
    private String locationInformation = "";
    private final List<TaskRecipe> associated = new ArrayList<>();

    Consumable(ItemGrade grade)
    {
        this.id = -1L;
        this.homeMarket = -1L;
        this.grade = grade;
    }

    @Override
    public String getLocationInformation()
    {
        return grade.getLocationDescription() + "\n" + locationInformation;
    }

    @Override
    public List<TaskRecipe> getAssociated()
    {
        return associated;
    }

    @Override
    public void associate(TaskRecipe recipe)
    {
        associated.add(recipe);
    }

    @Override
    public void setLocationInformation(String locationInformation)
    {
        this.locationInformation = locationInformation;
    }

    @Override
    public String getLocalizedName()
    {
        return localizedName;
    }

    @Override
    public void setLocalizedName(String localizedName)
    {
        this.localizedName = localizedName;
    }

    @Override
    public ItemGrade getGrade()
    {
        return ItemGrade.MicroMaterial;
    }
}
