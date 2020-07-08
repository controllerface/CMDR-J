package com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFSDInterdictor extends AbstractModule
{
    public AbstractFSDInterdictor(String displayText, ItemEffects itemEffects)
    {
        super("Frame Shift Drive Interdictor", ModificationType.Frame_Shift_Drive_Interdictor, itemEffects);
    }
}
