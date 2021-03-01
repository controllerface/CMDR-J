package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_6E extends AbstractFuelScoop
{
    public FuelScoop_6E()
    {
        super("6E Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Integrity, 90d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.376d)
                ));
    }

    @Override
    public long price()
    {
        return 107_860;
    }
}
