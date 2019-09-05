package com.controllerface.cmdr_j.classes.modules.fuelscoop.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_5A extends AbstractFuelScoop
{
    public FuelScoop_5A()
    {
        super("5A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 115d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.7d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.577d)
                ));
    }
}
