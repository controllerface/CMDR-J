package com.controllerface.cmdr_j.classes.modules.core.distributor.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_4C extends AbstractPowerDistributor
{
    public PowerDistributor_4C()
    {
        super("4C Power Distributor",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 10.0),
                  new ItemEffectData(ItemEffect.Integrity, 80.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.56),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 27.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 2.9),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 19.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 1.6),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 19.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 1.6)
            ));
    }

    @Override
    public long price()
    {
        return 70_930;
    }
}