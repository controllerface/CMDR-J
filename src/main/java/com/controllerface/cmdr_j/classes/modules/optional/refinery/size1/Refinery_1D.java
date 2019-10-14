package com.controllerface.cmdr_j.classes.modules.optional.refinery.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Refinery_1D extends AbstractRefinery
{
    public Refinery_1D()
    {
        super("1D Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 24d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 1d)
                ));
    }

    @Override
    public long price()
    {
        return 18_000;
    }
}
