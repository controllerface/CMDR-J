package com.controllerface.cmdr_j.classes.modules.core.sensors.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Sensors_3E extends AbstractSensors
{
    public Sensors_3E()
    {
        super("3E Sensors",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 5.0),
                        new ItemEffectData(ItemEffect.Integrity, 58.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.22),
                        new ItemEffectData(ItemEffect.BootTime, 5.0),
                        new ItemEffectData(ItemEffect.SensorTargetScanAngle, 30.0),
                        new ItemEffectData(ItemEffect.MaxRange, 8000.0),
                        new ItemEffectData(ItemEffect.Range, 4320.0)
                ));
    }

    @Override
    public long price()
    {
        return 4_050;
    }
}