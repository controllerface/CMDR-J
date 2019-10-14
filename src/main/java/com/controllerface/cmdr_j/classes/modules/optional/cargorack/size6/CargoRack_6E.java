package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_6E extends AbstractCargoRack
{
    public CargoRack_6E()
    {
        super("6E Cargo Rack", new ItemEffects(new ItemEffectData(ItemEffect.CargoCapacity, 64d)));
    }

    @Override
    public long price()
    {
        return 362_590;
    }
}
