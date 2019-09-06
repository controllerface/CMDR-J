package com.controllerface.cmdr_j.classes.modules.utility.ecm;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractECM extends AbstractModule
{
    public AbstractECM(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Electronic_Countermeasures, itemEffects);
    }
}
