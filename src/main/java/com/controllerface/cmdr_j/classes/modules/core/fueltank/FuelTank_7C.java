package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTank_7C extends AbstractFuelTank
{
    public FuelTank_7C()
    {
        super("7C Standard Fuel Tank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.FuelCapacity, 128.0)
                ));
    }

    @Override
    public long price()
    {
        return 1_780_910;
    }
}