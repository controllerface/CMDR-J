package com.controllerface.cmdr_j.classes.procurements.modules.limpets.hatchbreaker.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HatchBreakerLimpet_1B extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_1B()
    {
        super("1B Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 56d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.24d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 3000d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 13d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 4d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 9d)
                ));
    }
}
