package com.controllerface.cmdr_j.classes.modules.afmu;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractAFMU extends AbstractModule
{
    public AbstractAFMU(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Auto_Field_Maintenence_Unit, itemEffects);
    }
}
