package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractShieldCellBank extends AbstractModule
{
    public AbstractShieldCellBank(String displayText, ItemEffects itemEffects)
    {
        super("Shield Cell Bank", ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank, itemEffects);
    }
}
