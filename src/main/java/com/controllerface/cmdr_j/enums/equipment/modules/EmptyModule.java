package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.Collections;
import java.util.List;

/**
 * Created by Stephen on 5/27/2018.
 */
public enum EmptyModule implements ShipModule
{
    EMPTY_MODULE;

    private final ItemEffects emptyEffects = new ItemEffects(new ItemEffectData(ItemEffect.empty,"-"));

    @Override
    public String displayText()
    {
        return "Empty";
    }

    @Override
    public ProcurementType modificationType()
    {
        return null;
    }

    @Override
    public ProcurementType experimentalType()
    {
        return null;
    }

    @Override
    public ItemEffects itemEffects()
    {
        return emptyEffects;
    }

    @Override
    public List<ProcurementRecipe> getAssociated()
    {
        return null;
    }

    @Override
    public void associate(ProcurementRecipe recipe)
    {

    }

    @Override
    public String getLocationInformation()
    {
        return null;
    }

    @Override
    public void setLocationInformation(String locationInformation)
    {

    }

    @Override
    public String getLocalizedName()
    {
        return displayText();
    }

    @Override
    public void setLocalizedName(String localizedName)
    {

    }

    @Override
    public ItemGrade getGrade()
    {
        return null;
    }

    @Override
    public List<Icon> icons()
    {
        return Collections.emptyList();
    }

    @Override
    public long price()
    {
        return 0;
    }
}
