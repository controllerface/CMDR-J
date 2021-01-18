package com.controllerface.cmdr_j.classes.modules.core.cockpit;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractCockpit extends AbstractModule
{
    public AbstractCockpit(String displayText, ItemEffects itemEffects)
    {
        super(displayText + " Cockpit", itemEffects);
    }
}
