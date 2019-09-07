package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_7C extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_7C()
    {
        super("7C Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 80d),
                        new ItemEffectData(ItemEffect.Integrity, 131d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.7d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 15d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 4300d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 4d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
                ));
    }
}
