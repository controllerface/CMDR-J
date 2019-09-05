package com.controllerface.cmdr_j.classes.modules.limpets.collectorlimpet.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.limpets.collectorlimpet.AbstractCollectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class CollectorLimpet_7A extends AbstractCollectorLimpet
{
    public CollectorLimpet_7A()
    {
        super("7A Collector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 128d),
                        new ItemEffectData(ItemEffect.Integrity, 183d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                        new ItemEffectData(ItemEffect.BootTime, 6d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2040d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 720d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
                ));
    }
}
