package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_1D extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_1D()
    {
        super("1D Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 0.5d),
                        new ItemEffectData(ItemEffect.Integrity, 24d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.16d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2000d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 19d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
                ));
    }

    @Override
    public long price()
    {
        return 1_200;
    }
}
