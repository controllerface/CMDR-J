package com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_8A extends AbstractFuelScoop
{
    public FuelScoop_8A()
    {
        super("8A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 180d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.12d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 1.68d)
                ));
    }
}
