package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class CargoRack_1E_CorrosiveResist extends AbstractCargoRack
{
    public CargoRack_1E_CorrosiveResist()
    {
        super("1E Corrosion Resistant Cargo Rack",
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.experimental, 1d),
                                new ItemEffectData(ItemEffect.CargoCapacity, 1d)
                        ));
    }
}
