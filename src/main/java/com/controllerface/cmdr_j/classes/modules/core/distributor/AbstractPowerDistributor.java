package com.controllerface.cmdr_j.classes.modules.core.distributor;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractPowerDistributor extends AbstractModule
{
    public AbstractPowerDistributor(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Power_Distributor, ExperimentalType.Power_Distributor, itemEffects);
    }
}
