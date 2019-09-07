package com.controllerface.cmdr_j.classes.modules.utility.wakescanner;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDWakeScanner_0E extends AbstractWakeScanner
{
    public FSDWakeScanner_0E()
    {
        super("0E FSD Wake Scanner", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 32.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                  new ItemEffectData(ItemEffect.BootTime, 1.0),
                  new ItemEffectData(ItemEffect.ScannerRange, 2000.0),
                  new ItemEffectData(ItemEffect.MaxAngle, 15.0),
                  new ItemEffectData(ItemEffect.ScannerTimeToScan, 10.0)
            ));
    }
}