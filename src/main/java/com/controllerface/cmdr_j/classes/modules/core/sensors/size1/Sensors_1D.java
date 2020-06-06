package com.controllerface.cmdr_j.classes.modules.core.sensors.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_1D extends AbstractSensors
{
    public Sensors_1D()
    {
        super("1D Sensors",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 0.5),
                  new ItemEffectData(ItemEffect.Integrity, 32.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.18),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 4500.0)
            ));
    }

    @Override
    public long price()
    {
        return 1_290;
    }
}