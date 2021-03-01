package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_3A extends AbstractFuelScoop
{
    public FuelScoop_3A()
    {
        super("3A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Integrity, 77d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.48d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.176d)
                ));
    }

    @Override
    public long price()
    {
        return 902_950;
    }
}
