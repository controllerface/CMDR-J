package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_8E extends AbstractFuelScoop
{
    public FuelScoop_8E()
    {
        super("8E Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 120d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.48d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.72d)
                ));
    }
}
