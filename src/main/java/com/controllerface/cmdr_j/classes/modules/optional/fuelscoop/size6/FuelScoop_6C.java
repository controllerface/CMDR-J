package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_6C extends AbstractFuelScoop
{
    public FuelScoop_6C()
    {
        super("6C Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Integrity, 113d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.59d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.627d)
                ));
    }

    @Override
    public long price()
    {
        return 1_797_730;
    }
}
