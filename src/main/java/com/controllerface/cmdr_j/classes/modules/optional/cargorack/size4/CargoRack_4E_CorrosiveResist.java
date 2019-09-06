package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class CargoRack_4E_CorrosiveResist extends AbstractCargoRack
{
    public CargoRack_4E_CorrosiveResist()
    {
        super("4E Corrosion Resistant Cargo Rack",
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.experimental, 1d),
                                new ItemEffectData(ItemEffect.CargoCapacity, 16d)
                        ));
    }
}
