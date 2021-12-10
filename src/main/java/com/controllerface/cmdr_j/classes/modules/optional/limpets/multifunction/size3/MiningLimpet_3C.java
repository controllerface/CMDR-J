package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractMiningLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.utilities.UIFunctions;

public class MiningLimpet_3C extends AbstractMiningLimpet
{
    public MiningLimpet_3C()
    {
        super("3C Mining Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 52.0d),
                new ItemEffectData(ItemEffect.Integrity, 68d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                new ItemEffectData(ItemEffect.BootTime, 6d),
                new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                new ItemEffectData(ItemEffect.DroneTargetRange, 5_000d),
                new ItemEffectData(ItemEffect.DroneLifeTime, UIFunctions.Symbols.INFINITY),
                new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            ));
    }

    @Override
    public long price()
    {
        return 43_875;
    }
}
