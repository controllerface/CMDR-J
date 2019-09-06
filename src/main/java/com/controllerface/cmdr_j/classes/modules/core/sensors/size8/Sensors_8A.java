package com.controllerface.cmdr_j.classes.modules.core.sensors.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;

public class Sensors_8A extends AbstractSensors
{
    public Sensors_8A()
    {
        super("8A Standard Sensors", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 165.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.07),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 7680.0)
            ));
    }
}