package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_8B extends AbstractFuelScoop
{
    public FuelScoop_8B()
    {
        super("8B Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Integrity, 210d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.96d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 1.44d)
                ));
    }

    @Override
    public long price()
    {
        return 72_260_660;
    }
}
