package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_5A extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_5A()
    {
        super("5A Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.Integrity, 115d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.7d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 6d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 4620d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 5d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 5d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 10d)
                ));
    }
}
