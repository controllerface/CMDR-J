package com.controllerface.cmdr_j.classes.modules.core.sensors.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_7A extends AbstractSensors
{
    public Sensors_7A()
    {
        super("7A Standard Sensors", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 80.0),
                  new ItemEffectData(ItemEffect.Integrity, 144.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.77),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 7440.0)
            ));
    }
}