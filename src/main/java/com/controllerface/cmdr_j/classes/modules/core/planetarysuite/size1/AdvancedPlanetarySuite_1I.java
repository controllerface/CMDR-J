package com.controllerface.cmdr_j.classes.modules.core.planetarysuite.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.planetarysuite.AbstractPlanetarySuite;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AdvancedPlanetarySuite_1I extends AbstractPlanetarySuite
{
    public AdvancedPlanetarySuite_1I()
    {
        super("1I Advanced Planetary Approach Suite",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.planetary_approach, "Installed"),
                        new ItemEffectData(ItemEffect.planetary_disembark, "Installed"),
                        new ItemEffectData(ItemEffect.Size, 1),
                        new ItemEffectData(ItemEffect.Class, "I")
                ));
    }

    @Override
    public long price()
    {
        return 438;
    }
}
