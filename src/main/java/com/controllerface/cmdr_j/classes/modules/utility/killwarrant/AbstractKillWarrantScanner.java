package com.controllerface.cmdr_j.classes.modules.utility.killwarrant;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractKillWarrantScanner extends AbstractModule
{
    public AbstractKillWarrantScanner(String displayText, ItemEffects itemEffects)
    {
        super("Kill Warrant Scanner", ModificationType.Kill_Warrant_Scanner, itemEffects);
    }
}
