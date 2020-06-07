package com.controllerface.cmdr_j.classes.modules.optional.refinery.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Refinery_4D extends AbstractRefinery
{
    public Refinery_4D()
    {
        super("4D Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 48d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.33d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 5d)
                ));
    }

    @Override
    public long price()
    {
        return 166_700;
    }
}
