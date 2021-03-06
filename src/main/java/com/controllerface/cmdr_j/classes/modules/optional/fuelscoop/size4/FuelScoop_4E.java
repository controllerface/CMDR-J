package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_4E extends AbstractFuelScoop
{
    public FuelScoop_4E()
    {
        super("4E Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Integrity, 64d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.25d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.147d)
                ));
    }

    @Override
    public long price()
    {
        return 10_730;
    }
}
