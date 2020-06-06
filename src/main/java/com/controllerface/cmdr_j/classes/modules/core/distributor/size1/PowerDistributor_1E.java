package com.controllerface.cmdr_j.classes.modules.core.distributor.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class PowerDistributor_1E extends AbstractPowerDistributor
{
    public PowerDistributor_1E()
    {
        super("1E Power Distributor",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 36.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.32),
                  new ItemEffectData(ItemEffect.BootTime, 5.0),
                  new ItemEffectData(ItemEffect.WeaponsCapacity, 10.0),
                  new ItemEffectData(ItemEffect.WeaponsRecharge, 1.2),
                  new ItemEffectData(ItemEffect.EnginesCapacity, 8.0),
                  new ItemEffectData(ItemEffect.EnginesRecharge, 0.4),
                  new ItemEffectData(ItemEffect.SystemsCapacity, 8.0),
                  new ItemEffectData(ItemEffect.SystemsRecharge, 0.4)
            ));
    }

    @Override
    public long price()
    {
        return 520;
    }
}