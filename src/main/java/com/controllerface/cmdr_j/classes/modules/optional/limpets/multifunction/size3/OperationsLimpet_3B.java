package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractOperationsLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class OperationsLimpet_3B extends AbstractOperationsLimpet
{
    public OperationsLimpet_3B()
    {
        super("3B Operations Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 66.0d),
                new ItemEffectData(ItemEffect.Integrity, 80d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.30d),
                new ItemEffectData(ItemEffect.BootTime, 6d),
                new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                new ItemEffectData(ItemEffect.DroneTargetRange, 3_100d),
                new ItemEffectData(ItemEffect.DroneLifeTime, 420d),
                new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d),
                new ItemEffectData(ItemEffect.DroneHackingTime, 22d),
                new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 4d),
                new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 9d)
            ));
    }

    @Override
    public long price()
    {
        return 70_200;
    }
}
