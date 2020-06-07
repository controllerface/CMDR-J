package com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.AbstractHatchBreakerLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HatchBreakerLimpet_7D extends AbstractHatchBreakerLimpet
{
    public HatchBreakerLimpet_7D()
    {
        super("7D Hatch Breaker Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.Integrity, 79d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.56d),
                        new ItemEffectData(ItemEffect.BootTime, 3d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 12d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 3440d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 5d),
                        new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                        new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
                ));
    }

    @Override
    public long price()
    {
        return 874_800;
    }
}
