package com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.AbstractFuelTransferLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTransferLimpet_5C extends AbstractFuelTransferLimpet
{
    public FuelTransferLimpet_5C()
    {
        super("5C Fuel Transfer Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.Integrity, 96d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1300d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
                ));
    }
}
