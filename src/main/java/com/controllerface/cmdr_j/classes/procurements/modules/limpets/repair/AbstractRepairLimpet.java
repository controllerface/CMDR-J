package com.controllerface.cmdr_j.classes.procurements.modules.limpets.repair;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractRepairLimpet extends AbstractModule
{
    public AbstractRepairLimpet(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }
}
