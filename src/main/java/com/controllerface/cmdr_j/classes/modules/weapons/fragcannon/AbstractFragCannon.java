package com.controllerface.cmdr_j.classes.modules.weapons.fragcannon;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

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

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.kineticIcon);
    }
}
