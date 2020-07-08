package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractModulePackage extends AbstractModule
{
    public AbstractModulePackage(String displayText, ItemEffects itemEffects)
    {
        super("Module Reinforcement Package", itemEffects);
    }
}
