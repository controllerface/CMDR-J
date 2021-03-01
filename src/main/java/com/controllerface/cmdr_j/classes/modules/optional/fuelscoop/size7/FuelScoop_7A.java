package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_7A extends AbstractFuelScoop
{
    public FuelScoop_7A()
    {
        super("7A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Integrity, 157d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 1.245d)
                ));
    }

    @Override
    public long price()
    {
        return 91_180_640;
    }
}
