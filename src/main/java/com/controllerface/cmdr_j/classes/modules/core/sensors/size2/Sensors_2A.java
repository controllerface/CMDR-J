package com.controllerface.cmdr_j.classes.modules.core.sensors.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_2A extends AbstractSensors
{
    public Sensors_2A()
    {
        super("2A Sensors",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.5),
                  new ItemEffectData(ItemEffect.Integrity, 56.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.69),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 6240.0)
            ));
    }

    @Override
    public long price()
    {
        return 56_550;
    }
}