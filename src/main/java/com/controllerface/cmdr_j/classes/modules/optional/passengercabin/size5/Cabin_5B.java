package com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Cabin_5B extends AbstractCabin
{
    public Cabin_5B()
    {
        super("5B Luxury Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 4d),
                        new ItemEffectData(ItemEffect.CabinClass, "Luxury")
                ));
    }
}
