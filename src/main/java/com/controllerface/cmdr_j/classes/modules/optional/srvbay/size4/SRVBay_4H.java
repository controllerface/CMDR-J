package com.controllerface.cmdr_j.classes.modules.optional.srvbay.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.AbstractSRVBay;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRVBay_4H extends AbstractSRVBay
{
    public SRVBay_4H()
    {
        super("4H Planetary Vehicle Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "H"),
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.Integrity, 30d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
                ));
    }

    @Override
    public long price()
    {
        return 72_000;
    }
}
