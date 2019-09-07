package com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Cabin_5E extends AbstractCabin
{
    public Cabin_5E()
    {
        super("5E Economy Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 16d),
                        new ItemEffectData(ItemEffect.CabinClass, "Economy")
                ));
    }
}
