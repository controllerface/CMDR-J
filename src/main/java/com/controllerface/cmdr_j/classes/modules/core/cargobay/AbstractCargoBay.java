package com.controllerface.cmdr_j.classes.modules.core.cargobay;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractCargoBay extends AbstractModule
{
    public AbstractCargoBay(String displayText, ItemEffects itemEffects)
    {
        super("Modular Cargo Bay Door", itemEffects);
    }
}
