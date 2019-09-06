package com.controllerface.cmdr_j.classes.modules.weapons.railgun;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractRailGun extends AbstractModule
{
    public AbstractRailGun(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Rail_Gun, ExperimentalType.Rail_Gun, itemEffects);
    }
}
