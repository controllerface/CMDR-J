package com.controllerface.cmdr_j.classes.modules.optional.afmu;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractAFMU extends AbstractModule
{
    public AbstractAFMU(String displayText, ItemEffects itemEffects)
    {
        super("Automated Field Maintenance Unit", ModificationType.Auto_Field_Maintenence_Unit, itemEffects);
    }
}
