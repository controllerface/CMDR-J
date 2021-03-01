package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractFuelTank extends AbstractModule
{
    public AbstractFuelTank(String displayText, ItemEffects itemEffects)
    {
        super("Fuel Tank", itemEffects);
    }
}
