package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractRescueLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class RescueLimpet_3D extends AbstractRescueLimpet
{
    public RescueLimpet_3D()
    {
        super("3D Rescue Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "D"),
                new ItemEffectData(ItemEffect.Mass, 40.0d),
                new ItemEffectData(ItemEffect.Integrity, 58d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.40d),
                new ItemEffectData(ItemEffect.BootTime, 6d),
                new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                new ItemEffectData(ItemEffect.DroneTargetRange, 2_100d),
                new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d),
                new ItemEffectData(ItemEffect.DroneRepairCapacity, 60d),
                new ItemEffectData(ItemEffect.DroneHackingTime, 19d),
                new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
            ));
    }

    @Override
    public long price()
    {
        return 26_325;
    }
}
