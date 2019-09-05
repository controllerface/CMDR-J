package com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_3C extends AbstractFuelScoop
{
    public FuelScoop_3C()
    {
        super("3C Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 64d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.126d)
                ));
    }
}