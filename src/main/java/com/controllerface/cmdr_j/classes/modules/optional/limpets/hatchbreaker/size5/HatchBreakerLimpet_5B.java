package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_5B extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_5B()
    {
        super("5B Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.Integrity, 134d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 9d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 3960d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 6d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 4d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 9d)
                ));
    }
}
