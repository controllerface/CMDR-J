package com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_2B extends AbstractFuelScoop
{
    public FuelScoop_2B()
    {
        super("2B Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 70d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.065d)
                ));
    }
}
