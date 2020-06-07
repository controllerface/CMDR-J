package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_8A extends AbstractFuelScoop
{
    public FuelScoop_8A()
    {
        super("8A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 180d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.12d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 1.68d)
                ));
    }

    @Override
    public long price()
    {
        return 289_042_540;
    }
}
