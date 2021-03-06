package com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.AbstractCabin;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Cabin_6E extends AbstractCabin
{
    public Cabin_6E()
    {
        super("Economy Class Passenger Cabin",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 40d),
                        new ItemEffectData(ItemEffect.CabinCapacity, 32d),
                        new ItemEffectData(ItemEffect.CabinClass, "Economy")
                ));
    }

    @Override
    public long price()
    {
        return 61_420;
    }
}
