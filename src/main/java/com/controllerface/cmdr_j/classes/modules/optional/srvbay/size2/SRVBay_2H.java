package com.controllerface.cmdr_j.classes.modules.optional.srvbay.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.AbstractSRVBay;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRVBay_2H extends AbstractSRVBay
{
    public SRVBay_2H()
    {
        super("2H Planetary Vehicle Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "H"),
                        new ItemEffectData(ItemEffect.Mass, 12d),
                        new ItemEffectData(ItemEffect.Integrity, 30d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.25d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 1d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
                ));
    }

    @Override
    public long price()
    {
        return 18_000;
    }
}
