package com.controllerface.cmdr_j.classes.modules.weapons.cannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractCannon extends AbstractModule
{
    public AbstractCannon(String displayText, ItemEffects itemEffects)
    {
        super("Cannon", ModificationType.Cannon, ExperimentalType.Cannon, itemEffects);
    }
}
