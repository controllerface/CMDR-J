package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_4C extends AbstractFuelScoop
{
    public FuelScoop_4C()
    {
        super("4C Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 80d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.245d)
                ));
    }

    @Override
    public long price()
    {
        return 178_900;
    }
}
