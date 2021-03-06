package com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.AbstractFuelTransferLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FuelTransferLimpet_7C extends AbstractFuelTransferLimpet
{
    public FuelTransferLimpet_7C()
    {
        super("7C Fuel Transfer Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 80d),
                        new ItemEffectData(ItemEffect.Integrity, 131d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.69d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1700d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
                ));
    }

    @Override
    public long price()
    {
        return 1_749_600;
    }
}
