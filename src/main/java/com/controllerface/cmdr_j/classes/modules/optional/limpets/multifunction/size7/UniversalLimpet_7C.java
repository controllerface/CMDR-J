package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractUniversalLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.utilities.UIFunctions;

public class UniversalLimpet_7C extends AbstractUniversalLimpet
{
    public UniversalLimpet_7C()
    {
        super("7C Universal Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 7.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 130.0d),
                new ItemEffectData(ItemEffect.Integrity, 150d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.80d),
                new ItemEffectData(ItemEffect.BootTime, 6d),
                new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                new ItemEffectData(ItemEffect.DroneTargetRange, 6_500d),
                new ItemEffectData(ItemEffect.DroneLifeTime, UIFunctions.Symbols.INFINITY),
                new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d),
                new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d),
                new ItemEffectData(ItemEffect.DroneRepairCapacity, 310d),
                new ItemEffectData(ItemEffect.DroneHackingTime, 8d),
                new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
            ));
    }

    @Override
    public long price()
    {
        return 3_510_000;
    }
}
