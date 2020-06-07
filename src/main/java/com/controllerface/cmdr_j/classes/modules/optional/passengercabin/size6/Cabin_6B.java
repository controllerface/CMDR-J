package com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Cabin_6B extends AbstractCabin
{
    public Cabin_6B()
    {
        super("6B Luxury Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Mass, 40d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 8d),
                        new ItemEffectData(ItemEffect.CabinClass, "Luxury")
                ));
    }

    @Override
    public long price()
    {
        return 4_974_300;
    }
}
