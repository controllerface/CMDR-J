package com.controllerface.cmdr_j.classes.modules.utility.wakescanner;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractWakeScanner extends AbstractModule
{
    public AbstractWakeScanner(String displayText, ItemEffects itemEffects)
    {
        super("FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, itemEffects);
    }
}
