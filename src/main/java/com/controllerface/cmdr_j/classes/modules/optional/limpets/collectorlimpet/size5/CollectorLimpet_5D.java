package com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.AbstractCollectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CollectorLimpet_5D extends AbstractCollectorLimpet
{
    public CollectorLimpet_5D()
    {
        super("5D Collector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.Integrity, 77d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                        new ItemEffectData(ItemEffect.BootTime, 6d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 780d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
                ));
    }

    @Override
    public long price()
    {
        return 97_200;
    }
}
