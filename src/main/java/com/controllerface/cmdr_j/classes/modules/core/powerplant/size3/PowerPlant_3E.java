package com.controllerface.cmdr_j.classes.modules.core.powerplant.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerPlant_3E extends AbstractPowerPlant
{
    public PowerPlant_3E()
    {
        super("3E Power Plant",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 5.0),
                        new ItemEffectData(ItemEffect.Integrity, 58.0),
                        new ItemEffectData(ItemEffect.PowerCapacity, 8.0),
                        new ItemEffectData(ItemEffect.HeatEfficiency, 1.0)
                ));
    }

    @Override
    public long price()
    {
        return 6_270;
    }
}