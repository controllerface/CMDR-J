package com.controllerface.cmdr_j.classes.modules.core.sensors.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_1C extends AbstractSensors
{
    public Sensors_1C()
    {
        super("1C Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 5000.0)
                ));
    }

    @Override
    public long price()
    {
        return 3_230;
    }
}