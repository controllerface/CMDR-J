package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_7E extends AbstractFuelScoop
{
    public FuelScoop_7E()
    {
        super("7E Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 105d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.534d)
                ));
    }
}
