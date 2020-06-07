package com.controllerface.cmdr_j.classes.modules.optional.limpets.repair.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.repair.AbstractRepairLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class RepairLimpet_3E extends AbstractRepairLimpet
{
    public RepairLimpet_3E()
    {
        super("3E Repair Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.Integrity, 38d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.27d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.DroneRepairCapacity, 180d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 660d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }

    @Override
    public long price()
    {
        return 5_400;
    }
}
