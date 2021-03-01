package com.controllerface.cmdr_j.classes.modules.core.sensors.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_5B extends AbstractSensors
{
    public Sensors_5B()
    {
        super("5B Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 115.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.68),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 6380.0)
                ));
    }

    @Override
    public long price()
    {
        return 496_530;
    }
}