package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFragCannon extends AbstractModule
{
    public AbstractFragCannon(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon, itemEffects);
    }

    public AbstractFragCannon(ItemEffects itemEffects)
    {
        super("Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon, itemEffects);
    }
}
