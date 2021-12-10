package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractRescueLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class RescueLimpet_3C extends AbstractRescueLimpet
{
    public RescueLimpet_3C()
    {
        super("3C Rescue Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 52.0d),
                new ItemEffectData(ItemEffect.Integrity, 68d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                new ItemEffectData(ItemEffect.BootTime, 6d),
                new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                new ItemEffectData(ItemEffect.DroneTargetRange, 2_600d),
                new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d),
                new ItemEffectData(ItemEffect.DroneRepairCapacity, 60d),
                new ItemEffectData(ItemEffect.DroneHackingTime, 16d),
                new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
            ));
    }

    @Override
    public long price()
    {
        return 43_875;
    }
}
