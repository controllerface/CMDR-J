package com.controllerface.cmdr_j.classes.modules.core.distributor.size5;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;

public class PowerDistributor_5C extends AbstractPowerDistributor
{
    public PowerDistributor_5C()
    {
        super("5C Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 20.0),
                  new ItemEffectData(ItemEffect.Integrity, 96.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.62),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 34.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 3.6),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 24.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 2.1),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 24.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 2.1)
            ));
    }
}