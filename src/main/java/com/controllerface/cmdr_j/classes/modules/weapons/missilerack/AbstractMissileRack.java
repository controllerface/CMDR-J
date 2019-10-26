package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

public abstract class AbstractMissileRack extends AbstractModule
{
    public AbstractMissileRack(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Missile_Rack, ExperimentalType.Missile_Rack, itemEffects);
    }

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.explosiveIcon);
    }
}
