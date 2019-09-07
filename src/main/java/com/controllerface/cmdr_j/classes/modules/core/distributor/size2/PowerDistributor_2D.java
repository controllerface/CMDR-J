package com.controllerface.cmdr_j.classes.modules.core.distributor.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_2D extends AbstractPowerDistributor
{
    public PowerDistributor_2D()
    {
        super("2D Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.0),
                  new ItemEffectData(ItemEffect.Integrity, 41.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.41),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 14.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 1.6),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 11.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 0.6),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 11.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 0.6)
            ));
    }
}