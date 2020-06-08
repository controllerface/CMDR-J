package com.controllerface.cmdr_j.classes.modules.core.sensors.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_8D extends AbstractSensors
{
    public Sensors_8D()
    {
        super("8D Standard Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Mass, 64.0),
                        new ItemEffectData(ItemEffect.Integrity, 120.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.62),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 5760.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_743_960;
    }
}