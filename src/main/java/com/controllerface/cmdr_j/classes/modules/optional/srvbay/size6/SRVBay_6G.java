package com.controllerface.cmdr_j.classes.modules.optional.srvbay.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.AbstractSRVBay;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRVBay_6G extends AbstractSRVBay
{
    public SRVBay_6G()
    {
        super("6G Planetary Vehicle Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "G"),
                        new ItemEffectData(ItemEffect.Mass, 17d),
                        new ItemEffectData(ItemEffect.Integrity, 30d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.8d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 4d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
                ));
    }

    @Override
    public long price()
    {
        return 691_200;
    }
}
