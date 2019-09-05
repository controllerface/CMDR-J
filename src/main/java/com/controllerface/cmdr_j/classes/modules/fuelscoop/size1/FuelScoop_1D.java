package com.controllerface.cmdr_j.classes.modules.fuelscoop.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_1D extends AbstractFuelScoop
{
    public FuelScoop_1D()
    {
        super("1D Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 24d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.024d)
                ));
    }
}
