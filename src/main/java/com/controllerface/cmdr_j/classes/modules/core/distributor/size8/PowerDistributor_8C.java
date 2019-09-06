package com.controllerface.cmdr_j.classes.modules.core.distributor.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class PowerDistributor_8C extends AbstractPowerDistributor
{
    public PowerDistributor_8C()
    {
        super("8C Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 150.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.8),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 60.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 6.0),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 40.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 4.0),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 40.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 4.0)
            ));
    }
}