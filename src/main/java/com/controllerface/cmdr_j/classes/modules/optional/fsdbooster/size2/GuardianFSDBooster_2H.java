package com.controllerface.cmdr_j.classes.modules.optional.fsdbooster.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GuardianFSDBooster_2H extends AbstractGuardianModule
{
    public GuardianFSDBooster_2H()
    {
        super("FSD Booster",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "H"),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.98d),
                        new ItemEffectData(ItemEffect.Integrity, 32d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 6d)
                ));
    }

    @Override
    public long price()
    {
        return 810_521;
    }
}
