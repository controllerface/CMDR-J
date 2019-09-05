package com.controllerface.cmdr_j.classes.procurements.modules.limpets.hatchbreaker.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HatchBreakerLimpet_5E extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_5E()
    {
        super("5E Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.Integrity, 77d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 9d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1980d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 11d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 1d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 6d)
                ));
    }
}
