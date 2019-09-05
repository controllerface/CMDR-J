package com.controllerface.cmdr_j.classes.procurements.modules.limpets.collectorlimpet;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractCollectorLimpet extends AbstractModule
{
    public AbstractCollectorLimpet(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Collector_Limpet_Controller, itemEffects);
    }
}