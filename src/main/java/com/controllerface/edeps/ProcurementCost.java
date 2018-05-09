package com.controllerface.edeps;

import com.controllerface.edeps.structures.equipment.ItemGrade;

import java.util.List;

/**
 * Created by Stephen on 4/11/2018.
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
