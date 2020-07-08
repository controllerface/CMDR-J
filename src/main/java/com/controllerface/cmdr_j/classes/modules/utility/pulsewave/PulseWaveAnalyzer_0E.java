package com.controllerface.cmdr_j.classes.modules.utility.pulsewave;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PulseWaveAnalyzer_0E extends AbstractPulseWaveScanner
{
    public PulseWaveAnalyzer_0E()
    {
        super("0E Pulse Wave Analyzer",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 32.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                        new ItemEffectData(ItemEffect.BootTime, 3.0),
                        new ItemEffectData(ItemEffect.ScannerRange, 12_000.0),
                        new ItemEffectData(ItemEffect.MaxAngle, 15.0),
                        new ItemEffectData(ItemEffect.ScannerTimeToScan, 3.0)
                ));
    }

    @Override
    public long price()
    {
        return 13_540;
    }
}