package com.controllerface.cmdr_j.classes.modules.utility.heatsinklauncher;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractHeatsinkLauncher extends AbstractModule
{
    public AbstractHeatsinkLauncher(String displayText, ItemEffects itemEffects)
    {
        super("Heat-Sink Launcher", ModificationType.Heat_Sink_Launcher, itemEffects);
    }
}
