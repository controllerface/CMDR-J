package com.controllerface.cmdr_j.classes.modules.utility.mininglaser;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractMiningLaser extends AbstractModule
{
    public AbstractMiningLaser(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }

    public AbstractMiningLaser(ItemEffects itemEffects)
    {
        super("Mining Laser", itemEffects);
    }
}
