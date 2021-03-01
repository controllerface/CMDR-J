package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractPulseLaser extends AbstractModule
{
    public AbstractPulseLaser(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser, itemEffects);
    }

    public AbstractPulseLaser(ItemEffects itemEffects)
    {
        super("Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser, itemEffects);
    }
}
