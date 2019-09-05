package com.controllerface.cmdr_j.classes.modules.fuelscoop.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_3A extends AbstractFuelScoop
{
    public FuelScoop_3A()
    {
        super("3A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 77d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.48d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.176d)
                ));
    }
}
