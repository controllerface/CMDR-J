package com.controllerface.cmdr_j.classes.modules.core.sensors;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractSensors extends AbstractModule
{
    public AbstractSensors(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Sensors, itemEffects);
    }
}
