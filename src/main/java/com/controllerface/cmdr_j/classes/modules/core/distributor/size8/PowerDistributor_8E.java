package com.controllerface.cmdr_j.classes.modules.core.distributor.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;

public class PowerDistributor_8E extends AbstractPowerDistributor
{
    public PowerDistributor_8E()
    {
        super("8E Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 135.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 48.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 4.8),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 32.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 3.2),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 32.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 3.2)
            ));
    }
}