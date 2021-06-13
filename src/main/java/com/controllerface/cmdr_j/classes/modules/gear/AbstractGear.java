package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractGear extends AbstractModule
{
    public AbstractGear(String displayText, ItemEffects itemEffects)
    {
        // todo: set mod types for upgrades, not actual mods
        super(displayText, null, null, itemEffects);
    }
}
