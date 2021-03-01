package com.controllerface.cmdr_j.classes.modules.utility.pulsewave;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;

public abstract class AbstractPulseWaveScanner extends AbstractModule
{
    public AbstractPulseWaveScanner(String displayText, ItemEffects itemEffects)
    {
        super("Pulse Wave Analyzer", itemEffects);
    }
}
