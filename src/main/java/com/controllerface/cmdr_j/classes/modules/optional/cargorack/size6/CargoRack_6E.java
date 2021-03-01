package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_6E extends AbstractCargoRack
{
    public CargoRack_6E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 6.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.CargoCapacity, 64d)
        ));
    }

    @Override
    public long price()
    {
        return 362_590;
    }
}
