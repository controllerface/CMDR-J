package com.controllerface.cmdr_j.classes.modules.passengercabin.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Cabin_6D extends AbstractCabin
{
    public Cabin_6D()
    {
        super("6D Business Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 40d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 18d),
                        new ItemEffectData(ItemEffect.CabinClass, "Business")
                ));
    }
}
