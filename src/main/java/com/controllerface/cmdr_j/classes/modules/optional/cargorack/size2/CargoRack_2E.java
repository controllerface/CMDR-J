package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class CargoRack_2E extends AbstractCargoRack
{
    public CargoRack_2E()
    {
        super("2E Cargo Rack", new ItemEffects(new ItemEffectData(ItemEffect.CargoCapacity, 4d)));
    }
}
