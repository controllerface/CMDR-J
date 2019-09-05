package com.controllerface.cmdr_j.classes.modules.fuelscoop.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_8D extends AbstractFuelScoop
{
    public FuelScoop_8D()
    {
        super("8D Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 90d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.64d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.96d)
                ));
    }
}
