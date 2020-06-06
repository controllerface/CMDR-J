package com.controllerface.cmdr_j.classes.modules.core.sensors.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_4D extends AbstractSensors
{
    public Sensors_4D()
    {
        super("4D Sensors", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 64.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.31),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 5040.0)
            ));
    }

    @Override
    public long price()
    {
        return 28_370;
    }
}