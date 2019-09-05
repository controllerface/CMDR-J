package com.controllerface.cmdr_j.classes.modules.limpets.collectorlimpet.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.limpets.collectorlimpet.AbstractCollectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class CollectorLimpet_3E extends AbstractCollectorLimpet
{
    public CollectorLimpet_3E()
    {
        super("3E Collector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 38d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                        new ItemEffectData(ItemEffect.BootTime, 6d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 880d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
                ));
    }
}
