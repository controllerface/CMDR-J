package com.controllerface.cmdr_j.classes.modules.optional.cargorack;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractCargoRack extends AbstractModule
{
    public AbstractCargoRack(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }

    public AbstractCargoRack(ItemEffects itemEffects)
    {
        super("Cargo Rack", itemEffects);
    }
}
