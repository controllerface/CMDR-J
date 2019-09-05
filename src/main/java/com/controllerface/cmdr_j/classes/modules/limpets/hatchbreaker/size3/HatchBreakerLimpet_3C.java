package com.controllerface.cmdr_j.classes.modules.limpets.hatchbreaker.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HatchBreakerLimpet_3C extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_3C()
    {
        super("3C Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.Integrity, 64d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2700d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 12d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
                ));
    }
}
