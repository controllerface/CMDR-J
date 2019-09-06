package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractMultiCannon extends AbstractModule
{
    public AbstractMultiCannon(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon, itemEffects);
    }
}
