package com.controllerface.cmdr_j.classes.modules.core.sensors.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_4A extends AbstractSensors
{
    public Sensors_4A()
    {
        super("4A Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 10.0),
                        new ItemEffectData(ItemEffect.Integrity, 88.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.02),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 6720.0)
                ));
    }

    @Override
    public long price()
    {
        return 443_330;
    }
}