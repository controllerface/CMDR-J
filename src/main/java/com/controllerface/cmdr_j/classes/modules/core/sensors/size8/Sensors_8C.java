package com.controllerface.cmdr_j.classes.modules.core.sensors.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_8C extends AbstractSensors
{
    public Sensors_8C()
    {
        super("8C Standard Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 160.0),
                        new ItemEffectData(ItemEffect.Integrity, 150.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.69),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 6400.0)
                ));
    }

    @Override
    public long price()
    {
        return 4_359_900;
    }
}