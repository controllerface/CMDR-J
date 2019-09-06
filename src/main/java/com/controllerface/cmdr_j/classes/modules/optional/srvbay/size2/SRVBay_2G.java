package com.controllerface.cmdr_j.classes.modules.optional.srvbay.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.AbstractSRVBay;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class SRVBay_2G extends AbstractSRVBay
{
    public SRVBay_2G()
    {
        super("2G Planetary Vehicle Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 6d),
                        new ItemEffectData(ItemEffect.Integrity, 30d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.75d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 1d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
                ));
    }
}
