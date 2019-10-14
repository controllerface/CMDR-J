package com.controllerface.cmdr_j.classes.modules.utility.manifestscanner;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ManifestScanner_0E extends AbstractManifestScanner
{
    public ManifestScanner_0E()
    {
        super("0E Manifest Scanner", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 32.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                  new ItemEffectData(ItemEffect.BootTime, 3.0),
                  new ItemEffectData(ItemEffect.ScannerRange, 2000.0),
                  new ItemEffectData(ItemEffect.MaxAngle, 15.0),
                  new ItemEffectData(ItemEffect.ScannerTimeToScan, 10.0)
            ));
    }

    @Override
    public long price()
    {
        return 13_540;
    }
}