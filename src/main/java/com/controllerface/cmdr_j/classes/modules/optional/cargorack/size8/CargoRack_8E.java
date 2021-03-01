package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_8E extends AbstractCargoRack
{
    public CargoRack_8E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 8.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.CargoCapacity, 256d)
        ));
    }

    @Override
    public long price()
    {
        return 3_829_870;
    }
}
