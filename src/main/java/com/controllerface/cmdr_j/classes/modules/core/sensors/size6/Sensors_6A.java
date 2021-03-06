package com.controllerface.cmdr_j.classes.modules.core.sensors.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_6A extends AbstractSensors
{
    public Sensors_6A()
    {
        super("6A Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 124.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.5),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 7200.0)
                ));
    }

    @Override
    public long price()
    {
        return 3_475_690;
    }
}