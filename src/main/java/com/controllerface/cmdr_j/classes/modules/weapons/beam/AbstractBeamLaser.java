package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

public abstract class AbstractBeamLaser extends AbstractModule
{
    public AbstractBeamLaser(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Beam_Laser, ExperimentalType.Beam_Laser, itemEffects);
    }

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.thermalIcon);
    }
}
