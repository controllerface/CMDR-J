package com.controllerface.cmdr_j.classes.modules.core.powerplant;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractPowerPlant extends AbstractModule
{
    public AbstractPowerPlant(String displayText, ItemEffects itemEffects)
    {
        super("Power Plant", ModificationType.Power_Plant, ExperimentalType.Power_Plant, itemEffects);
    }
}
