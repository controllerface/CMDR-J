package com.controllerface.cmdr_j.classes.procurements.modules.refinery.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Refinery_1E extends AbstractRefinery
{
    public Refinery_1E()
    {
        super("1E Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 32d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.14d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 1d)
                ));
    }
}
