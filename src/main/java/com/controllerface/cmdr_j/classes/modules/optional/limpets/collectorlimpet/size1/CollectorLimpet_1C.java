package com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.AbstractCollectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class CollectorLimpet_1C extends AbstractCollectorLimpet
{
    public CollectorLimpet_1C()
    {
        super("1C Collector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 40d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.23d),
                        new ItemEffectData(ItemEffect.BootTime, 6d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1000d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 510d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                        new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
                ));
    }

    @Override
    public long price()
    {
        return 2_400;
    }
}
