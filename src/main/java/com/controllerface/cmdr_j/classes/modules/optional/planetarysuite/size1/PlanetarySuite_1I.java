package com.controllerface.cmdr_j.classes.modules.optional.planetarysuite.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.planetarysuite.AbstractPlanetarySuite;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PlanetarySuite_1I extends AbstractPlanetarySuite
{
    public PlanetarySuite_1I()
    {
        super("1I Planetary Approach Suite",
                new ItemEffects(new ItemEffectData(ItemEffect.planetary_approach, "Installed")));
    }
}
