package com.controllerface.cmdr_j.classes.modules.optional.refinery.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Refinery_2C extends AbstractRefinery
{
    public Refinery_2C()
    {
        super("2C Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 51d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.28d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 4d)
                ));
    }

    @Override
    public long price()
    {
        return 113_400;
    }
}
