package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_3A extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_3A()
    {
        super("3A Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.Integrity, 77d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.42d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 3780d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 7d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 5d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 10d)
                ));
    }

    @Override
    public long price()
    {
        return 86_400;
    }
}
