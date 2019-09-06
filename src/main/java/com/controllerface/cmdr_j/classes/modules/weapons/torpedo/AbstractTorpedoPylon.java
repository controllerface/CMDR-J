package com.controllerface.cmdr_j.classes.modules.weapons.torpedo;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractTorpedoPylon extends AbstractModule
{
    public AbstractTorpedoPylon(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon, itemEffects);
    }
}
