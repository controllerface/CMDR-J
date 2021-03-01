package com.controllerface.cmdr_j.classes.modules.optional.limpets.research;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractResearchLimpet extends AbstractModule
{
    public AbstractResearchLimpet(String displayText, ItemEffects itemEffects)
    {
        super("Research Limpet Controller", itemEffects);
    }
}
