package com.controllerface.cmdr_j.classes.modules.utility.ecm;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CounterMeasures_Electronic extends AbstractECM
{
    public CounterMeasures_Electronic()
    {
        super("0F Electronic Counter-Measures",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "F"),
                        new ItemEffectData(ItemEffect.Mass, 1.3),
                        new ItemEffectData(ItemEffect.Integrity, 20.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                        new ItemEffectData(ItemEffect.ECMRange, 3000.0),
                        new ItemEffectData(ItemEffect.ECMActivePowerConsumption, 4.0),
                        new ItemEffectData(ItemEffect.ECMHeat, 4.0),
                        new ItemEffectData(ItemEffect.ECMCooldown, 10.0),
                        new ItemEffectData(ItemEffect.ECMTimeToCharge, 3.0)
                ));
    }

    @Override
    public long price()
    {
        return 12_500;
    }
}