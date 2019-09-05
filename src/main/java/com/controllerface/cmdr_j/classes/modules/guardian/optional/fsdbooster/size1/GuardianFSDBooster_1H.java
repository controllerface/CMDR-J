package com.controllerface.cmdr_j.classes.modules.guardian.optional.fsdbooster.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.guardian.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class GuardianFSDBooster_1H extends AbstractGuardianModule
{
    public GuardianFSDBooster_1H()
    {
        super("1H Guardian FSD Booster",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.75d),
                        new ItemEffectData(ItemEffect.Integrity, 32d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 4d)
                ));
    }
}
