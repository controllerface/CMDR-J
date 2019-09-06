package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFuelTank extends AbstractModule
{
    public AbstractFuelTank(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }
}
