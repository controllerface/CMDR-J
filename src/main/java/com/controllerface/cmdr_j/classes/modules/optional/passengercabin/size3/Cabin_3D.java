package com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Cabin_3D extends AbstractCabin
{
    public Cabin_3D()
    {
        super("Business Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 3d),
                        new ItemEffectData(ItemEffect.CabinClass, "Business")
                ));
    }

    @Override
    public long price()
    {
        return 26_720;
    }
}
