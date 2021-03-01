package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_5B extends AbstractFuelScoop
{
    public FuelScoop_5B()
    {
        super("5B Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Integrity, 134d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.494d)
                ));
    }

    @Override
    public long price()
    {
        return 2_268_420;
    }
}
