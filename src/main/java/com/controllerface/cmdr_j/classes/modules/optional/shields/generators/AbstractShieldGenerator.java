package com.controllerface.cmdr_j.classes.modules.optional.shields.generators;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractShieldGenerator extends AbstractModule
{
    public AbstractShieldGenerator(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, itemEffects);
    }

    public AbstractShieldGenerator(ItemEffects itemEffects)
    {
        super("Shield Generator", ModificationType.Shield_Generator, ExperimentalType.Shield_Generator, itemEffects);
    }
}
