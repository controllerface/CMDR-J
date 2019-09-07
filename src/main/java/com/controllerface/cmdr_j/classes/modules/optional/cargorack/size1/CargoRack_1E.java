package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_1E extends AbstractCargoRack
{
    public CargoRack_1E()
    {
        super("1E Cargo Rack", new ItemEffects(new ItemEffectData(ItemEffect.CargoCapacity, 2d)));
    }
}