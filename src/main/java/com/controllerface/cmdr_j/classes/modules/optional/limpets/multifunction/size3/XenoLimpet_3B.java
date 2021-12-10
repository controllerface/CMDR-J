package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractXenoLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class XenoLimpet_3B extends AbstractXenoLimpet
{
    public XenoLimpet_3B()
    {
        super("3B Operations Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 66.0d),
                new ItemEffectData(ItemEffect.Integrity, 80d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.30d),
                new ItemEffectData(ItemEffect.BootTime, 6d),
                new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                new ItemEffectData(ItemEffect.DroneTargetRange, 5_000d),
                new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                new ItemEffectData(ItemEffect.DroneRepairCapacity, 70d)
            ));
    }

    @Override
    public long price()
    {
        return 70_200;
    }
}
