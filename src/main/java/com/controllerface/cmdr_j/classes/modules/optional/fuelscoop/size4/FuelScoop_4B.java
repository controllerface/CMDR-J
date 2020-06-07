package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_4B extends AbstractFuelScoop
{
    public FuelScoop_4B()
    {
        super("4B Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 112d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.49d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.294d)
                ));
    }

    @Override
    public long price()
    {
        return 715_590;
    }
}
