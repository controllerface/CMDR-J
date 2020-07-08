package com.controllerface.cmdr_j.classes.modules.utility.abrasionblaster;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractAbrasionBlaster extends AbstractModule
{
    public AbstractAbrasionBlaster(String displayText, ItemEffects itemEffects)
    {
        super("Abrasion Blaster", itemEffects);
    }
}
