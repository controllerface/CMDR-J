package com.controllerface.edeps;

import com.controllerface.edeps.enums.materials.MaterialGrade;

/**
 * Created by Stephen on 4/11/2018.
 */
public interface ProcurementCost
{
    String getLocalizedName();
    void setLocalizedName(String localizedName);
    MaterialGrade getGrade();
}
