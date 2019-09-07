package com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.AbstractFuelTransferLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTransferLimpet_3C extends AbstractFuelTransferLimpet
{
    public FuelTransferLimpet_3C()
    {
        super("3C Fuel Transfer Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.Integrity, 64d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1100d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
                ));
    }
}
