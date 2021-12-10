package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractRescueLimpet extends AbstractModule
{
    public AbstractRescueLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Rescue Limpet Controller", itemEffects);
    }
}
