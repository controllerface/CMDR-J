package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_5C extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_5C()
    {
        super("5C Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.Integrity, 96d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 7d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 3300d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 8d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
                ));
    }

    @Override
    public long price()
    {
        return 194_400;
    }
}
