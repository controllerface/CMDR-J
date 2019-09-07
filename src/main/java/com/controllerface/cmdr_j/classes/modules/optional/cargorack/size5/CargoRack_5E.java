package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_5E extends AbstractCargoRack
{
    public CargoRack_5E()
    {
        super("5E Cargo Rack", new ItemEffects(new ItemEffectData(ItemEffect.CargoCapacity, 32d)));
    }
}
