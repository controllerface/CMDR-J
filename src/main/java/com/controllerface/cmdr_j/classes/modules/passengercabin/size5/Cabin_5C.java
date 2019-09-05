package com.controllerface.cmdr_j.classes.modules.passengercabin.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Cabin_5C extends AbstractCabin
{
    public Cabin_5C()
    {
        super("5C First Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 6d),
                        new ItemEffectData(ItemEffect.CabinClass, "First")
                ));
    }
}
