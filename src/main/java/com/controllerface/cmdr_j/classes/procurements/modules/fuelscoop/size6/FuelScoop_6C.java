package com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FuelScoop_6C extends AbstractFuelScoop
{
    public FuelScoop_6C()
    {
        super("6C Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 113d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.59d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.627d)
                ));
    }
}
