package com.controllerface.cmdr_j.classes.modules.core.sensors.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_7C extends AbstractSensors
{
    public Sensors_7C()
    {
        super("7C Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 131.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.59),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 6200.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_557_110;
    }
}