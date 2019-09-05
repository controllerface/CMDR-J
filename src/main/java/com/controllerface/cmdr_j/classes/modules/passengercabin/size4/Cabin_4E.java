package com.controllerface.cmdr_j.classes.modules.passengercabin.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class Cabin_4E extends AbstractCabin
{
    public Cabin_4E()
    {
        super("4E Economy Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 8d),
                        new ItemEffectData(ItemEffect.CabinClass, "Economy")
                ));
    }
}
