package com.controllerface.cmdr_j.classes.modules.utility.pointdefense;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractPointDefense extends AbstractModule
{
    public AbstractPointDefense(String displayText, ItemEffects itemEffects)
    {
        super("Point Defense Turret", ModificationType.Point_Defense, itemEffects);
    }
}
