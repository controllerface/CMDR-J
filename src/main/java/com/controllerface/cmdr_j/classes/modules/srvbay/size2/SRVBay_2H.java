package com.controllerface.cmdr_j.classes.modules.srvbay.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.srvbay.AbstractSRVBay;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class SRVBay_2H extends AbstractSRVBay
{
    public SRVBay_2H()
    {
        super("2H Planetary Vehicle Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 12d),
                        new ItemEffectData(ItemEffect.Integrity, 30d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.25d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 1d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
                ));
    }
}
