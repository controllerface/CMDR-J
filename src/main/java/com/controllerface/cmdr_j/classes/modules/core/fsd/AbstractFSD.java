package com.controllerface.cmdr_j.classes.modules.core.fsd;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFSD extends AbstractModule
{
    public AbstractFSD(String displayText, ItemEffects itemEffects)
    {
        super("Frame Shift Drive", ModificationType.Frame_Shift_Drive, ExperimentalType.Frame_Shift_Drive, itemEffects);
    }
}
