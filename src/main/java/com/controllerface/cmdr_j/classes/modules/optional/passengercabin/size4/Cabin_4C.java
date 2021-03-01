package com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Cabin_4C extends AbstractCabin
{
    public Cabin_4C()
    {
        super("First Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 3d),
                        new ItemEffectData(ItemEffect.CabinClass, "First")
                ));
    }

    @Override
    public long price()
    {
        return 170_600;
    }
}
