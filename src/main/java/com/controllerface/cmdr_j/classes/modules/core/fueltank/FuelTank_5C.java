package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTank_5C extends AbstractFuelTank
{
    public FuelTank_5C()
    {
        super("5C Standard Fuel Tank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.FuelCapacity, 32.0)
                ));
    }

    @Override
    public long price()
    {
        return 97_750;
    }
}