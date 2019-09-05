package com.controllerface.cmdr_j.classes.modules.passengercabin.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Cabin_3E extends AbstractCabin
{
    public Cabin_3E()
    {
        super("3E Economy Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 4d),
                        new ItemEffectData(ItemEffect.CabinClass, "Economy")
                ));
    }
}
