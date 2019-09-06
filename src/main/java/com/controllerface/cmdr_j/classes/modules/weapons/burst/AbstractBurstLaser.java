package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractBurstLaser extends AbstractModule
{
    public AbstractBurstLaser(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Burst_Laser, ExperimentalType.Burst_Laser, itemEffects);
    }
}
