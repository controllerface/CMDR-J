package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFuelScoop extends AbstractModule
{
    public AbstractFuelScoop(String displayText, ItemEffects itemEffects)
    {
        super("Fuel Scoop", ModificationType.Fuel_Scoop, itemEffects);
    }
}
