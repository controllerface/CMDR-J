package com.controllerface.cmdr_j.classes.modules.core.distributor.size4;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;

public class PowerDistributor_4A extends AbstractPowerDistributor
{
    public PowerDistributor_4A()
    {
        super("4A Standard Power Distributor", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 10.0),
                  new ItemEffectData(ItemEffect.Integrity, 88.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.67),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 32.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 3.5),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 23.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 1.9),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 23.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 1.9)
            ));
    }
}