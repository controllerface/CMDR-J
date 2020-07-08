package com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractCollectorLimpet extends AbstractModule
{
    public AbstractCollectorLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Collector Limpet Controller", ModificationType.Collector_Limpet_Controller, itemEffects);
    }
}
