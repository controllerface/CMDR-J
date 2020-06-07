package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_8E extends AbstractCargoRack
{
    public CargoRack_8E()
    {
        super("8E Cargo Rack",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.CargoCapacity, 256d)
                ));
    }

    @Override
    public long price()
    {
        return 3_829_870;
    }
}
