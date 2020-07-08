package com.controllerface.cmdr_j.classes.modules.utility.chafflauncher;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractChaffLauncher extends AbstractModule
{
    public AbstractChaffLauncher(String displayText, ItemEffects itemEffects)
    {
        super("Chaff Launcher", ModificationType.Chaff_Launcher, itemEffects);
    }
}
