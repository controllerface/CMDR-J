package com.controllerface.cmdr_j.classes.modules.core.sensors.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_4B extends AbstractSensors
{
    public Sensors_4B()
    {
        super("4B Sensors",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 96.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.56),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 6160.0)
            ));
    }

    @Override
    public long price()
    {
        return 177_330;
    }
}