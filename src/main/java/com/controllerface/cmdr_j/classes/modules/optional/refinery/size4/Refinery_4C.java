package com.controllerface.cmdr_j.classes.modules.optional.refinery.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Refinery_4C extends AbstractRefinery
{
    public Refinery_4C()
    {
        super("4C Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 80d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 7d)
                ));
    }
}
