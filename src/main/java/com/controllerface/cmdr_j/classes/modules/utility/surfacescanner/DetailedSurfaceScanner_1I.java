package com.controllerface.cmdr_j.classes.modules.utility.surfacescanner;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DetailedSurfaceScanner_1I extends AbstractRefinery
{
    public DetailedSurfaceScanner_1I()
    {
        super("1I Detailed Surface Scanner",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0d),
                        new ItemEffectData(ItemEffect.BootTime, 0d),
                        new ItemEffectData(ItemEffect.DSS_PatchRadius, 0d)
                ));
    }

    @Override
    public long price()
    {
        return 250_000;
    }
}
