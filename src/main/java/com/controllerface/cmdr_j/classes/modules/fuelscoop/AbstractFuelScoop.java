package com.controllerface.cmdr_j.classes.modules.fuelscoop;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFuelScoop extends AbstractModule
{
    public AbstractFuelScoop(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Fuel_Scoop, itemEffects);
    }
}
