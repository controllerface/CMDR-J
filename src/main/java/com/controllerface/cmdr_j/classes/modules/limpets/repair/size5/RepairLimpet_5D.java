package com.controllerface.cmdr_j.classes.modules.limpets.repair.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.limpets.repair.AbstractRepairLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class RepairLimpet_5D extends AbstractRepairLimpet
{
    public RepairLimpet_5D()
    {
        super("5D Repair Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.Integrity, 77d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.DroneRepairCapacity, 310d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1040d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }
}
