package com.controllerface.cmdr_j.classes.modules.refinery;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractRefinery extends AbstractModule
{
    public AbstractRefinery(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Refinery, itemEffects);
    }
}
