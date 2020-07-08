package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

public abstract class AbstractMultiCannon extends AbstractModule
{
    public AbstractMultiCannon(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon, itemEffects);
    }

    public AbstractMultiCannon(ItemEffects itemEffects)
    {
        super("Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon, itemEffects);
    }

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.kineticIcon);
    }
}
