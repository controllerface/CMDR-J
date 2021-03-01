package com.controllerface.cmdr_j.classes.modules.weapons.minelauncher;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractMineLauncher extends AbstractModule
{
    public AbstractMineLauncher(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher, itemEffects);
    }

    public AbstractMineLauncher(ItemEffects itemEffects)
    {
        super("Mine Launcher", ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher, itemEffects);
    }
}
