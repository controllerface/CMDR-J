package com.controllerface.cmdr_j.classes.modules.weapons.pulse;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

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

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.thermalIcon);
    }
}
