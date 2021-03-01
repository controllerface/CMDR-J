package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_1F_CorrosiveResist extends AbstractHumanModule
{
    public CargoRack_1F_CorrosiveResist()
    {
        super("Corrosion Resistant Cargo Rack",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1d),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "F"),
                        new ItemEffectData(ItemEffect.CargoCapacity, 2d)
                ));
    }

    @Override
    public long price()
    {
        return 12_563;
    }
}
