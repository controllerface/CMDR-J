package com.controllerface.cmdr_j.classes.modules.optional.limpets.repair.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.repair.AbstractRepairLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class RepairLimpet_7B extends AbstractRepairLimpet
{
    public RepairLimpet_7B()
    {
        super("7B Repair Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 128d),
                        new ItemEffectData(ItemEffect.Integrity, 157d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.DroneRepairCapacity, 450d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2040d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }
}
