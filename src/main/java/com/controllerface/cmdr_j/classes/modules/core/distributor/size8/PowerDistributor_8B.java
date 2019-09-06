package com.controllerface.cmdr_j.classes.modules.core.distributor.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class PowerDistributor_8B extends AbstractPowerDistributor
{
    public PowerDistributor_8B()
    {
        super("8B Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 256.0),
                  new ItemEffectData(ItemEffect.Integrity, 180.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.88),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 66.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 6.6),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 44.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 4.4),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 44.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 4.4)
            ));
    }
}