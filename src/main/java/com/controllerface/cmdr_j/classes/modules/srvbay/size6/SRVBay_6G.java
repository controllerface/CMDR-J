package com.controllerface.cmdr_j.classes.modules.srvbay.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.srvbay.AbstractSRVBay;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class SRVBay_6G extends AbstractSRVBay
{
    public SRVBay_6G()
    {
        super("6G Planetary Vehicle Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 17d),
                        new ItemEffectData(ItemEffect.Integrity, 30d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.8d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 4d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
                ));
    }
}
