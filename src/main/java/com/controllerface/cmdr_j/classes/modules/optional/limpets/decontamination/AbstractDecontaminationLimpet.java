package com.controllerface.cmdr_j.classes.modules.optional.limpets.decontamination;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractDecontaminationLimpet extends AbstractModule
{
    public AbstractDecontaminationLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Decontamination Limpet Controller", itemEffects);
    }
}
