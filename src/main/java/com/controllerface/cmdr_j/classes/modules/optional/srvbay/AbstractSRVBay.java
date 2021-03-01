package com.controllerface.cmdr_j.classes.modules.optional.srvbay;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractSRVBay extends AbstractModule
{
    public AbstractSRVBay(String displayText, ItemEffects itemEffects)
    {
        super("Planetary Vehicle Hangar", itemEffects);
    }
}
