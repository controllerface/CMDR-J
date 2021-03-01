package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_3B extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_3B()
    {
        super("3B Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.Integrity, 90d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.36d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 3240d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 10d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 4d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 9d)
                ));
    }

    @Override
    public long price()
    {
        return 43_200;
    }
}
