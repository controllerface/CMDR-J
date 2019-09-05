package com.controllerface.cmdr_j.classes.procurements.modules.refinery.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Refinery_1C extends AbstractRefinery
{
    public Refinery_1C()
    {
        super("1C Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 40d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.23d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 2d)
                ));
    }
}
