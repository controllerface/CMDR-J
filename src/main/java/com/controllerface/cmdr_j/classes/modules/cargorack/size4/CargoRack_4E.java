package com.controllerface.cmdr_j.classes.modules.cargorack.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class CargoRack_4E extends AbstractCargoRack
{
    public CargoRack_4E()
    {
        super("4E Cargo Rack", new ItemEffects(new ItemEffectData(ItemEffect.CargoCapacity, 16d)));
    }
}
