package com.controllerface.cmdr_j.classes.modules;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

public abstract class AbstractModule implements ShipModule
{
    private final String displayText;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;
    private final ItemEffects itemEffects;

    public AbstractModule(String displayText, ProcurementType modificationType, ProcurementType experimentalType, ItemEffects itemEffects)
    {
        this.displayText = displayText;
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.itemEffects = itemEffects;
    }

    public AbstractModule(String displayText, ProcurementType modificationType, ItemEffects itemEffects)
    {
        this(displayText, modificationType, null, itemEffects);
    }

    public AbstractModule(String displayText, ItemEffects itemEffects)
    {
        this(displayText, null, null, itemEffects);
    }

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.cargoIcon);
    }

    @Override
    public String displayText()
    {
        return displayText;
    }

    @Override
    public ProcurementType experimentalType()
    {
        return experimentalType;
    }

    @Override
    public ProcurementType modificationType()
    {
        return modificationType;
    }

    @Override
    public ItemEffects itemEffects()
    {
        return itemEffects;
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
        return displayText;
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
    public long price()
    {
        return 1;
    }
}
