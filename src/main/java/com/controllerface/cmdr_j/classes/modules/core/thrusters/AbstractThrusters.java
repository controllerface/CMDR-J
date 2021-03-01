package com.controllerface.cmdr_j.classes.modules.core.thrusters;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractThrusters extends AbstractModule
{
    public AbstractThrusters(ItemEffects itemEffects)
    {
        super("Thrusters", ModificationType.Thrusters, ExperimentalType.Thrusters, itemEffects);
    }

    public AbstractThrusters(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Thrusters, ExperimentalType.Thrusters, itemEffects);
    }
}
