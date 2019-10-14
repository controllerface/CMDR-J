package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_7E extends AbstractCargoRack
{
    public CargoRack_7E()
    {
        super("7E Cargo Rack", new ItemEffects(new ItemEffectData(ItemEffect.CargoCapacity, 128d)));
    }

    @Override
    public long price()
    {
        return 1_178_420;
    }
}
