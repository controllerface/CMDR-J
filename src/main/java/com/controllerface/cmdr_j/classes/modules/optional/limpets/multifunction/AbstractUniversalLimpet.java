package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractUniversalLimpet extends AbstractModule
{
    public AbstractUniversalLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Universal Limpet Controller", itemEffects);
    }
}
