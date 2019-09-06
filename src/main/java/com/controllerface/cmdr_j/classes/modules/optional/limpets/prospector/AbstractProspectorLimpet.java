package com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractProspectorLimpet extends AbstractModule
{
    public AbstractProspectorLimpet(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Prospector_Limpet_Controller, itemEffects);
    }
}
