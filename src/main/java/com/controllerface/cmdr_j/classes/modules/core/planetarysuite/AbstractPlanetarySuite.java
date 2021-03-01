package com.controllerface.cmdr_j.classes.modules.core.planetarysuite;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractPlanetarySuite extends AbstractModule
{
    public AbstractPlanetarySuite(String displayText, ItemEffects itemEffects)
    {
        super("Planetary Approach Suite", itemEffects);
    }
}
