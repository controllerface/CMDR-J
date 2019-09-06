package com.controllerface.cmdr_j.classes.modules.core.sensors.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;

public class Sensors_8B extends AbstractSensors
{
    public Sensors_8B()
    {
        super("8B Standard Sensors", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 256.0),
                  new ItemEffectData(ItemEffect.Integrity, 180.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.14),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 7040.0)
            ));
    }
}