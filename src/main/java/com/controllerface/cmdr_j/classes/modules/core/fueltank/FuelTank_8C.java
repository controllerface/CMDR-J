package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTank_8C extends AbstractFuelTank
{
    public FuelTank_8C()
    {
        super("8C Standard Fuel Tank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.FuelCapacity, 256.0)
                ));
    }

    @Override
    public long price()
    {
        return 5_428_400;
    }
}