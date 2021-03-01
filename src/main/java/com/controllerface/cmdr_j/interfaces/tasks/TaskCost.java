package com.controllerface.cmdr_j.interfaces.tasks;

import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.List;

/**
 * Created by Controllerface on 4/11/2018.
 */
public interface TaskCost
{
    List<TaskRecipe> getAssociated();
    void associate(TaskRecipe recipe);
    String getLocationInformation();
    void setLocationInformation(String locationInformation);
    String getLocalizedName();
    void setLocalizedName(String localizedName);
    ItemGrade getGrade();
}
