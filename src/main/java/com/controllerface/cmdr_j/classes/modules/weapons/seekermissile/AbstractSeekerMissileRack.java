package com.controllerface.cmdr_j.classes.modules.weapons.seekermissile;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

public abstract class AbstractSeekerMissileRack extends AbstractModule
{
    public AbstractSeekerMissileRack(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack, itemEffects);
    }

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.explosiveIcon);
    }
}
