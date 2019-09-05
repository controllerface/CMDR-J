package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractBeamLaser extends AbstractModule
{
    public AbstractBeamLaser(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Beam_Laser, ExperimentalType.Beam_Laser, itemEffects);
    }
}
