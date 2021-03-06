package com.controllerface.cmdr_j.classes.modules.core.sensors.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_8B extends AbstractSensors
{
    public Sensors_8B()
    {
        super("8B Standard Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 256.0),
                        new ItemEffectData(ItemEffect.Integrity, 180.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.14),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 7040.0)
                ));
    }

    @Override
    public long price()
    {
        return 10_899_760;
    }
}