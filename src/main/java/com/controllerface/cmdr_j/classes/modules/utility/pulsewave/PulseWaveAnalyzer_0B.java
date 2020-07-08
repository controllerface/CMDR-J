package com.controllerface.cmdr_j.classes.modules.utility.pulsewave;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PulseWaveAnalyzer_0B extends AbstractPulseWaveScanner
{
    public PulseWaveAnalyzer_0B()
    {
        super("0B Pulse Wave Analyzer",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 56.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.6),
                        new ItemEffectData(ItemEffect.BootTime, 3.0),
                        new ItemEffectData(ItemEffect.ScannerRange, 21_000.0),
                        new ItemEffectData(ItemEffect.MaxAngle, 15.0),
                        new ItemEffectData(ItemEffect.ScannerTimeToScan, 3.0)
                ));
    }

    @Override
    public long price()
    {
        return 365_700;
    }
}