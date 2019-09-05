package com.controllerface.cmdr_j.classes.procurements.modules.srvbay.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.srvbay.AbstractSRVBay;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class SRVBay_4G extends AbstractSRVBay
{
    public SRVBay_4G()
    {
        super("4G Planetary Vehicle Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.Integrity, 30d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
                ));
    }
}
