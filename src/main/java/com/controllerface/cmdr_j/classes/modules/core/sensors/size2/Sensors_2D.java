package com.controllerface.cmdr_j.classes.modules.core.sensors.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_2D extends AbstractSensors
{
    public Sensors_2D()
    {
        super("2D Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 1.0),
                        new ItemEffectData(ItemEffect.Integrity, 41.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.21),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 4680.0)
                ));
    }

    @Override
    public long price()
    {
        return 3_620;
    }
}