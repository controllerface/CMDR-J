package com.controllerface.cmdr_j.classes.modules.weapons.seekermissile;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractSeekerMissileRack extends AbstractModule
{
    public AbstractSeekerMissileRack(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack, itemEffects);
    }
}
