package com.controllerface.cmdr_j.classes.modules.optional.refinery.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Refinery_1A extends AbstractRefinery
{
    public Refinery_1A()
    {
        super("1A Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Integrity, 48d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.32d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 4d)
                ));
    }

    @Override
    public long price()
    {
        return 486_000;
    }
}
