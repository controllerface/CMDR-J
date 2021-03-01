package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_2C extends AbstractFuelScoop
{
    public FuelScoop_2C()
    {
        super("2C Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Integrity, 51d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.28d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.054d)
                ));
    }

    @Override
    public long price()
    {
        return 17_800;
    }
}
