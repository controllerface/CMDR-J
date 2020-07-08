package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractHatchBreakerLimpet extends AbstractModule
{
    public AbstractHatchBreakerLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Hatch Breaker Limpet Controller", ModificationType.Hatch_Breaker_Limpet, itemEffects);
    }
}
