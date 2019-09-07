package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTank_3C extends AbstractFuelTank
{
    public FuelTank_3C()
    {
        super("3C Standard Fuel Tank", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.FuelCapacity, 8.0)
            ));
    }
}