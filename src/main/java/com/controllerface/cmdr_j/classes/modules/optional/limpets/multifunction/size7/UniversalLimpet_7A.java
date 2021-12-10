package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractUniversalLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.utilities.UIFunctions;

public class UniversalLimpet_7A extends AbstractUniversalLimpet
{
    public UniversalLimpet_7A()
    {
        super("7A Universal Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 7.0),
                new ItemEffectData(ItemEffect.Class, "A"),
                new ItemEffectData(ItemEffect.Mass, 150.0d),
                new ItemEffectData(ItemEffect.Integrity, 200d),
                new ItemEffectData(ItemEffect.PowerDraw, 1.10d),
                new ItemEffectData(ItemEffect.BootTime, 6d),
                new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                new ItemEffectData(ItemEffect.DroneTargetRange, 9_100d),
                new ItemEffectData(ItemEffect.DroneLifeTime, UIFunctions.Symbols.INFINITY),
                new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d),
                new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d),
                new ItemEffectData(ItemEffect.DroneRepairCapacity, 310d),
                new ItemEffectData(ItemEffect.DroneHackingTime, 5d),
                new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 5d),
                new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 10d)
            ));
    }

    @Override
    public long price()
    {
        return 7_020_000;
    }
}
