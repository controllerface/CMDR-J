package com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.AbstractFuelScoop;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelScoop_4D extends AbstractFuelScoop
{
    public FuelScoop_4D()
    {
        super("4D Fuel Scoop",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Integrity, 48d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.33d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.FuelScoopRate, 0.196d)
                ));
    }

    @Override
    public long price()
    {
        return 44_720;
    }
}
