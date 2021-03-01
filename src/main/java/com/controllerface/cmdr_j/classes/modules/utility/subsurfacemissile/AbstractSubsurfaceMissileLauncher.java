package com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractSubsurfaceMissileLauncher extends AbstractModule
{
    public AbstractSubsurfaceMissileLauncher(String displayText, ItemEffects itemEffects)
    {
        super("Sub-Surface Displacement Missile", itemEffects);
    }
}
