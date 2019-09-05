package com.controllerface.cmdr_j.classes.modules.passengercabin.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Cabin_2E extends AbstractCabin
{
    public Cabin_2E()
    {
        super("2E Economy Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2.5d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 2d),
                        new ItemEffectData(ItemEffect.CabinClass, "Economy")
                ));
    }
}
