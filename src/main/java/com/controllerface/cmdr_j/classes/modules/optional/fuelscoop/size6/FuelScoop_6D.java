package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_6D extends AbstractFuelScoop
{
    public FuelScoop_6D()
    {
        super("6D Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Integrity, 68d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.47d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.502d)
                ));
    }

    @Override
    public long price()
    {
        return 449_430;
    }
}
