package com.controllerface.cmdr_j.classes.modules.optional.fsdbooster.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class GuardianFSDBooster_3H extends AbstractGuardianModule
{
    public GuardianFSDBooster_3H()
    {
        super("3H Guardian FSD Booster",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1d),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.27d),
                        new ItemEffectData(ItemEffect.Integrity, 32d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 7.75d)
                ));
    }
}
