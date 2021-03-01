package com.controllerface.cmdr_j.classes.modules.utility.seismiccharge;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractSeismicChargeLauncher extends AbstractModule
{
    public AbstractSeismicChargeLauncher(String displayText, ItemEffects itemEffects)
    {
        super("Seismic Charge Launcher", itemEffects);
    }
}
