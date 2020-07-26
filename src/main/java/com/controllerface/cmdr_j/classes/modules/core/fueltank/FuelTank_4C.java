package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTank_4C extends AbstractFuelTank
{
    public FuelTank_4C()
    {
        super("4C Standard Fuel Tank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.FuelCapacity, 16.0)
                ));
    }

    @Override
    public long price()
    {
        return 24_730;
    }
}