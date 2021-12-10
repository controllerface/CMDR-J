package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractXenoLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class XenoLimpet_3C extends AbstractXenoLimpet
{
    public XenoLimpet_3C()
    {
        super("3C Xeno Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 52.0d),
                new ItemEffectData(ItemEffect.Integrity, 68d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
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
        return 43_875;
    }
}
