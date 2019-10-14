package com.controllerface.cmdr_j.enums.costs.special;

import com.controllerface.cmdr_j.classes.procurements.ProcurementCost;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.List;

public enum CreditCost implements ProcurementCost
{
    CREDIT_COST;

    private String localizedName = "CR";

    @Override
    public String getLocalizedName() { return localizedName; }

    @Override
    public void setLocalizedName(String localizedName) { this.localizedName = localizedName; }

    @Override
    public ItemGrade getGrade() { return ItemGrade.Credits; }

    // Stubs
    @Override public List<ProcurementRecipe> getAssociated() { return null; }
    @Override public void associate(ProcurementRecipe recipe) { }
    @Override public String getLocationInformation() { return null; }
    @Override public void setLocationInformation(String locationInformation) { }
}
