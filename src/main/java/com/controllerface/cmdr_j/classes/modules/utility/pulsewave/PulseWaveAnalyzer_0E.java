package com.controllerface.cmdr_j.classes.modules.utility.pulsewave;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PulseWaveAnalyzer_0E extends AbstractPulseWaveScanner
{
    public PulseWaveAnalyzer_0E()
    {
        // todo: get actual stats, copied from 0B model
        super("0E Pulse Wave Analyzer",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 56.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.6),
                  new ItemEffectData(ItemEffect.BootTime, 3.0),
                  new ItemEffectData(ItemEffect.ScannerRange, 21000.0),
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