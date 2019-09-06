package com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractPlasmaAccelerator extends AbstractModule
{
    public AbstractPlasmaAccelerator(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator, itemEffects);
    }
}
