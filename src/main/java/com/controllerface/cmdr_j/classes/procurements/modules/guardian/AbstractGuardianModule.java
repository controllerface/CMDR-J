package com.controllerface.cmdr_j.classes.procurements.modules.guardian;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.AbstractModule;

public abstract class AbstractGuardianModule extends AbstractModule
{
    public AbstractGuardianModule(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }
}
