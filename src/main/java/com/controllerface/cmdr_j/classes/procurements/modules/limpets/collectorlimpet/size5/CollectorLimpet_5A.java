package com.controllerface.cmdr_j.classes.procurements.modules.limpets.collectorlimpet.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.limpets.collectorlimpet.AbstractCollectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class CollectorLimpet_5A extends AbstractCollectorLimpet
{
    public CollectorLimpet_5A()
    {
        super("5A Collector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.Integrity, 134d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.7d),
                        new ItemEffectData(ItemEffect.BootTime, 6d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1560d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 720d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
                ));
    }
}
