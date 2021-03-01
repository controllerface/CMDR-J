package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_2E extends AbstractFuelScoop
{
    public FuelScoop_2E()
    {
        super("2E Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Integrity, 41d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.17d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.032d)
                ));
    }

    @Override
    public long price()
    {
        return 1_070;
    }
}
