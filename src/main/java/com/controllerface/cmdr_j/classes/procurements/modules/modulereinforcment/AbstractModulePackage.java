package com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractModulePackage extends AbstractModule
{
    public AbstractModulePackage(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }
}
