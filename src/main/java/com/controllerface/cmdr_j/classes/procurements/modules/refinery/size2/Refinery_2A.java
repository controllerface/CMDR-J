package com.controllerface.cmdr_j.classes.procurements.modules.refinery.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Refinery_2A extends AbstractRefinery
{
    public Refinery_2A()
    {
        super("2A Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 61d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.39d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 6d)
                ));
    }
}
