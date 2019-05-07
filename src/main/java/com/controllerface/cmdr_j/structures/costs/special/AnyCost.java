package com.controllerface.cmdr_j.structures.costs.special;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

import java.util.List;

public enum AnyCost implements ProcurementCost
{
    ANY_COST;

    private String localizedName = "Any";

    @Override
    public String getLocalizedName() { return localizedName; }

    @Override
    public void setLocalizedName(String localizedName) { this.localizedName = localizedName; }

    @Override
    public ItemGrade getGrade() { return ItemGrade.Any; }

    // Stubs
    @Override public List<ProcurementRecipe> getAssociated() { return null; }
    @Override public void associate(ProcurementRecipe recipe) { }
    @Override public String getLocationInformation() { return null; }
    @Override public void setLocationInformation(String locationInformation) { }
}
