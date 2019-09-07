package com.controllerface.cmdr_j.classes.modules.core.distributor.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_3D extends AbstractPowerDistributor
{
    public PowerDistributor_3D()
    {
        super("3D Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.45),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 18.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 2.1),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 14.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 1.0),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 14.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 1.0)
            ));
    }
}