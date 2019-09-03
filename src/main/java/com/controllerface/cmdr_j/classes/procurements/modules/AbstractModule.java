package com.controllerface.cmdr_j.classes.procurements.modules;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;

public class AbstractModule implements ShipModule
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
}
