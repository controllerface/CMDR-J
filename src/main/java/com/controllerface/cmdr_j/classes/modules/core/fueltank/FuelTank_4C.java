package com.controllerface.cmdr_j.classes.modules.core.fueltank;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.fueltank.AbstractFuelTank;

public class FuelTank_4C extends AbstractFuelTank
{
    public FuelTank_4C()
    {
        super("4C Standard Fuel Tank", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.FuelCapacity, 16.0)
            ));
    }
}