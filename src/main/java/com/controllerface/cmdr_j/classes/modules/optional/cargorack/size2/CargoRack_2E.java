package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_2E extends AbstractCargoRack
{
    public CargoRack_2E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.CargoCapacity, 4d)
        ));
    }

    @Override
    public long price()
    {
        return 3_250;
    }
}
