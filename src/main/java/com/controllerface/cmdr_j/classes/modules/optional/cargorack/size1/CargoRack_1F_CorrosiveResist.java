package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.AbstractCargoRack;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_1F_CorrosiveResist extends AbstractCargoRack
{
    public CargoRack_1F_CorrosiveResist()
    {
        super("1F Corrosion Resistant Cargo Rack",
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.human, 1d),
                                new ItemEffectData(ItemEffect.CargoCapacity, 2d)
                        ));
    }

    @Override
    public long price()
    {
        return 12_563;
    }
}
