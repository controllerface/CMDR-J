package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_2D extends AbstractFuelScoop
{
    public FuelScoop_2D()
    {
        super("2D Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 31d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.22d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.043d)
                ));
    }

    @Override
    public long price()
    {
        return 4_450;
    }
}
