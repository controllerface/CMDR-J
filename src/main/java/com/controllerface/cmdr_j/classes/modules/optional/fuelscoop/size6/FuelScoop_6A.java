package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_6A extends AbstractFuelScoop
{
    public FuelScoop_6A()
    {
        super("6A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Integrity, 136d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.83d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.878d)
                ));
    }

    @Override
    public long price()
    {
        return 28_763_610;
    }
}
