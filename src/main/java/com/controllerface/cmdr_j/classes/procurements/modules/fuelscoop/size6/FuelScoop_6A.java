package com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_6A extends AbstractFuelScoop
{
    public FuelScoop_6A()
    {
        super("6A Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 136d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.83d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.878d)
                ));
    }
}
