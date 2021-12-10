package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractMiningLimpet extends AbstractModule
{
    public AbstractMiningLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Mining Limpet Controller", itemEffects);
    }
}
