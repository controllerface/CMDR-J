package com.controllerface.cmdr_j.classes.modules.optional.cargorack.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CargoRack_1E_CorrosiveResist extends AbstractHumanModule
{
    public CargoRack_1E_CorrosiveResist()
    {
        super("Corrosion Resistant Cargo Rack",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1d),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.CargoCapacity, 1d)
                ));
    }

    @Override
    public long price()
    {
        return 6_250;
    }
}
