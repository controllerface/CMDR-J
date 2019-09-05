package com.controllerface.cmdr_j.classes.modules.limpets.hatchbreaker.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HatchBreakerLimpet_3D extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_3D()
    {
        super("3D Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 38d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.24d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2160d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 14d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
                ));
    }
}
