package com.controllerface.cmdr_j.classes.modules.optional.refinery.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Refinery_4B extends AbstractRefinery
{
    public Refinery_4B()
    {
        super("4B Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 112d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.49d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 9d)
                ));
    }

    @Override
    public long price()
    {
        return 1_500_280;
    }
}
