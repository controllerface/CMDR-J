package com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.multifunction.AbstractMiningLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.utilities.UIFunctions;

public class MiningLimpet_3E extends AbstractMiningLimpet
{
    public MiningLimpet_3E()
    {
        super("3E Mining Limpet Controller",
            new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 80.0d),
                new ItemEffectData(ItemEffect.Integrity, 45d),
                new ItemEffectData(ItemEffect.PowerDraw, 0.50d),
                new ItemEffectData(ItemEffect.BootTime, 6d),
                new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                new ItemEffectData(ItemEffect.DroneTargetRange, 3_300d),
                new ItemEffectData(ItemEffect.DroneLifeTime, UIFunctions.Symbols.INFINITY),
                new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            ));
    }

    @Override
    public long price()
    {
        return 13_163;
    }
}
