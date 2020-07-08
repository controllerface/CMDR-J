package com.controllerface.cmdr_j.classes.modules.utility.shieldbooster;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractShieldBooster extends AbstractModule
{
    public AbstractShieldBooster(String displayText, ItemEffects itemEffects)
    {
        super("Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster, itemEffects);
    }
}
