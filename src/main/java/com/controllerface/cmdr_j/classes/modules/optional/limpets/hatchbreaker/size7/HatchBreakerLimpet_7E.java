package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HatchBreakerLimpet_7E extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_7E()
    {
        super("7E Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 80d),
                        new ItemEffectData(ItemEffect.Integrity, 105d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.42d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 18d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2580d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 6d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 1d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 6d)
                ));
    }
}
