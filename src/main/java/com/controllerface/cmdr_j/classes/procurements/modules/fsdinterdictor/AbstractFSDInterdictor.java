package com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFSDInterdictor extends AbstractModule
{
    public AbstractFSDInterdictor(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Frame_Shift_Drive_Interdictor, itemEffects);
    }
}
