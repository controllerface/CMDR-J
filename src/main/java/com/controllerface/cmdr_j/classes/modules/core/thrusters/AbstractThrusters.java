package com.controllerface.cmdr_j.classes.modules.core.thrusters;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractThrusters extends AbstractModule
{
    public AbstractThrusters(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Thrusters, ExperimentalType.Thrusters, itemEffects);
    }
}
