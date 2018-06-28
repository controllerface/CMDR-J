package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

import java.util.List;

/**
 * Created by Controllerface on 4/11/2018.
 */
public interface ProcurementCost
{
    List<ProcurementRecipe> getAssociated();
    void associate(ProcurementRecipe recipe);
    String getLocationInformation();
    void setLocationInformation(String locationInformation);
    String getLocalizedName();
    void setLocalizedName(String localizedName);
    ItemGrade getGrade();
}
