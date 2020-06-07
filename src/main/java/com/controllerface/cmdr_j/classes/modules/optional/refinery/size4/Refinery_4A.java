package com.controllerface.cmdr_j.classes.modules.optional.refinery.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Refinery_4A extends AbstractRefinery
{
    public Refinery_4A()
    {
        super("4A Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 96d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.57d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 10d)
                ));
    }

    @Override
    public long price()
    {
        return 4_500_850;
    }
}
