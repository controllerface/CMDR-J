package com.controllerface.cmdr_j.classes.modules.weapons.burst;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

public abstract class AbstractBurstLaser extends AbstractModule
{
    public AbstractBurstLaser(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Burst_Laser, ExperimentalType.Burst_Laser, itemEffects);
    }

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.thermalIcon);
    }
}
