package com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.AbstractFuelTransferLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTransferLimpet_1E extends AbstractFuelTransferLimpet
{
    public FuelTransferLimpet_1E()
    {
        super("1E Fuel Transfer Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 24d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 600d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
                ));
    }

    @Override
    public long price()
    {
        return 600;
    }
}
