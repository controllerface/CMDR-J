package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_2A extends AbstractFuelScoop
{
    public FuelScoop_2A()
    {
        super("2A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 61d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.39d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.075d)
                ));
    }
}
