package com.controllerface.cmdr_j.classes.modules.core.sensors.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_1E extends AbstractSensors
{
    public Sensors_1E()
    {
        super("1E Sensors",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 36.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.16),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 4000.0)
            ));
    }

    @Override
    public long price()
    {
        return 520;
    }
}