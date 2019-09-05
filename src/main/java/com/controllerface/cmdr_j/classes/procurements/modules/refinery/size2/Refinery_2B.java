package com.controllerface.cmdr_j.classes.procurements.modules.refinery.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Refinery_2B extends AbstractRefinery
{
    public Refinery_2B()
    {
        super("2B Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 71d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 5d)
                ));
    }
}
