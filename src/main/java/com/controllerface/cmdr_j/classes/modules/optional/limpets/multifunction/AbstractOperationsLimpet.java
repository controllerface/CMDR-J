package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractOperationsLimpet extends AbstractModule
{
    public AbstractOperationsLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Operations Limpet Controller", itemEffects);
    }
}
