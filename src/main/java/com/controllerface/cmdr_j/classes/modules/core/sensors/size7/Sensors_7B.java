package com.controllerface.cmdr_j.classes.modules.core.sensors.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_7B extends AbstractSensors
{
    public Sensors_7B()
    {
        super("7B Sensors",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 128.0),
                  new ItemEffectData(ItemEffect.Integrity, 157.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.97),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                  new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                  new ItemEffectData(ItemEffect.Range, 6820.0)
            ));
    }

    @Override
    public long price()
    {
        return 3_892_770;
    }
}