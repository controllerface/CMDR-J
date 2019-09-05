package com.controllerface.cmdr_j.classes.modules.surfacescanner;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractSurfaceScanner extends AbstractModule
{
    public AbstractSurfaceScanner(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Detailed_Surface_Scanner, itemEffects);
    }
}
