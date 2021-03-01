package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_5D extends AbstractFuelScoop
{
    public FuelScoop_5D()
    {
        super("5D Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Integrity, 58d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.33d)
                ));
    }

    @Override
    public long price()
    {
        return 141_780;
    }
}
