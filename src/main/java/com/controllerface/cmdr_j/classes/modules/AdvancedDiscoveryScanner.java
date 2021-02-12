package com.controllerface.cmdr_j.classes.modules;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.ui.UIFunctions;

public class AdvancedDiscoveryScanner extends AbstractModule
{
    public AdvancedDiscoveryScanner()
    {
        super("Advanced Discovery Scanner",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 40d),
                        new ItemEffectData(ItemEffect.DiscoveryScannerRange, UIFunctions.Symbols.INFINITY),
                        new ItemEffectData(ItemEffect.DiscoveryScannerPassiveRange, 33.36d),
                        new ItemEffectData(ItemEffect.MaxAngle, 10d),
                        new ItemEffectData(ItemEffect.ScannerTimeToScan, 5d)
                ));
    }

    @Override
    public long price()
    {
        return 1_545_000;
    }
}
