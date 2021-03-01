package com.controllerface.cmdr_j.classes.modules.optional.limpets.repair;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractRepairLimpet extends AbstractModule
{
    public AbstractRepairLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Repair Limpet Controller", itemEffects);
    }
}
