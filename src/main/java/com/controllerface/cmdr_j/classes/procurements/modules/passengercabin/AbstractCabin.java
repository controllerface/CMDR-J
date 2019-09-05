package com.controllerface.cmdr_j.classes.procurements.modules.passengercabin;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractCabin extends AbstractModule
{
    public AbstractCabin(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }
}
