package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractMissileRack extends AbstractModule
{
    public AbstractMissileRack(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Missile_Rack, ExperimentalType.Missile_Rack, itemEffects);
    }
}
