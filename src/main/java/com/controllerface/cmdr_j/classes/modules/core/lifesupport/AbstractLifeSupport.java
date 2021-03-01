package com.controllerface.cmdr_j.classes.modules.core.lifesupport;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractLifeSupport extends AbstractModule
{
    public AbstractLifeSupport(String displayText, ItemEffects itemEffects)
    {
        super("Life Support", ModificationType.Life_Support, itemEffects);
    }
}
