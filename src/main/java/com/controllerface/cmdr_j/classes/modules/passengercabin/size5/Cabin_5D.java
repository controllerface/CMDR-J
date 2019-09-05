package com.controllerface.cmdr_j.classes.modules.passengercabin.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Cabin_5D extends AbstractCabin
{
    public Cabin_5D()
    {
        super("5D Business Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 10d),
                        new ItemEffectData(ItemEffect.CabinClass, "Business")
                ));
    }
}
