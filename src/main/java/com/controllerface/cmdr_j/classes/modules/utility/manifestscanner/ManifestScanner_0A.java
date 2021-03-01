package com.controllerface.cmdr_j.classes.modules.utility.manifestscanner;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ManifestScanner_0A extends AbstractManifestScanner
{
    public ManifestScanner_0A()
    {
        super("0A Manifest Scanner",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 48.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 3.2),
                        new ItemEffectData(ItemEffect.BootTime, 3.0),
                        new ItemEffectData(ItemEffect.ScannerRange, 4000.0),
                        new ItemEffectData(ItemEffect.MaxAngle, 15.0),
                        new ItemEffectData(ItemEffect.ScannerTimeToScan, 10.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_097_100;
    }
}