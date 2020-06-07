package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_6B extends AbstractFuelScoop
{
    public FuelScoop_6B()
    {
        super("6B Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Integrity, 158d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.71d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.752d)
                ));
    }

    @Override
    public long price()
    {
        return 7_190_900;
    }
}
