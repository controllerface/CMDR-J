package com.controllerface.cmdr_j.classes.modules.refinery.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Refinery_4B extends AbstractRefinery
{
    public Refinery_4B()
    {
        super("4B Refinery",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 112d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.49d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.RefineryBins, 9d)
                ));
    }
}
