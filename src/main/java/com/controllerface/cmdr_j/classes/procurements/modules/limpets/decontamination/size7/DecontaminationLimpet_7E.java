package com.controllerface.cmdr_j.classes.procurements.modules.limpets.decontamination.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.limpets.decontamination.AbstractDecontaminationLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class DecontaminationLimpet_7E extends AbstractDecontaminationLimpet
{
    public DecontaminationLimpet_7E()
    {
        super("7E Decontamination Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 128d),
                        new ItemEffectData(ItemEffect.Integrity, 157d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.DroneRepairCapacity, 180d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2040d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }
}
