package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_8C extends AbstractFuelScoop
{
    public FuelScoop_8C()
    {
        super("8C Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Integrity, 150d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.8d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 1.2d)
                ));
    }

    @Override
    public long price()
    {
        return 18_065_160;
    }
}
