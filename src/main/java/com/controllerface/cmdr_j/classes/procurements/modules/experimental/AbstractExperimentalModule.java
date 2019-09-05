package com.controllerface.cmdr_j.classes.procurements.modules.experimental;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.AbstractModule;

public abstract class AbstractExperimentalModule extends AbstractModule
{
    public AbstractExperimentalModule(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }
}
