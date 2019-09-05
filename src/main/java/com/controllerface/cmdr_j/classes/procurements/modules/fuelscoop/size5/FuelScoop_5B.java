package com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_5B extends AbstractFuelScoop
{
    public FuelScoop_5B()
    {
        super("5B Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 134d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.494d)
                ));
    }
}
