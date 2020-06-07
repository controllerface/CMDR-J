package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_3E extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_3E()
    {
        super("3E Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 5d),
                        new ItemEffectData(ItemEffect.Integrity, 51d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1620d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 17d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 1d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 6d)
                ));
    }

    @Override
    public long price()
    {
        return 5_400;
    }
}
