package com.controllerface.cmdr_j.classes.modules.optional.limpets.decontamination.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.decontamination.AbstractDecontaminationLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DecontaminationLimpet_3E extends AbstractDecontaminationLimpet
{
    public DecontaminationLimpet_3E()
    {
        super("3E Decontamination Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 51d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                        new ItemEffectData(ItemEffect.BootTime, 10d),
                        new ItemEffectData(ItemEffect.DroneRepairCapacity, 70d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 880d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }

    @Override
    public long price()
    {
        return 16_200;
    }
}
