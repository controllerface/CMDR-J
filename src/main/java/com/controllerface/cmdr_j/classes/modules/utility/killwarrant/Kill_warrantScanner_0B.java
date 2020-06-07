package com.controllerface.cmdr_j.classes.modules.utility.killwarrant;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Kill_warrantScanner_0B extends AbstractKillWarrantScanner
{
    public Kill_warrantScanner_0B()
    {
        super("0B Kill_warrant Scanner",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 56.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.6),
                        new ItemEffectData(ItemEffect.BootTime, 2.0),
                        new ItemEffectData(ItemEffect.ScannerRange, 3500.0),
                        new ItemEffectData(ItemEffect.MaxAngle, 15.0),
                        new ItemEffectData(ItemEffect.ScannerTimeToScan, 10.0)
                ));
    }

    @Override
    public long price()
    {
        return 365_700;
    }
}