package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_4E extends AbstractCargoRack
{
    public CargoRack_4E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 4.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.CargoCapacity, 16d)
        ));
    }

    @Override
    public long price()
    {
        return 34_330;
    }
}
