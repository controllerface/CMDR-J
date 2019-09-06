package com.controllerface.cmdr_j.classes.modules.core.distributor.size6;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;

public class PowerDistributor_6C extends AbstractPowerDistributor
{
    public PowerDistributor_6C()
    {
        super("6C Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 113.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.68),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 42.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 4.3),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 29.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 2.7),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 29.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 2.7)
            ));
    }
}