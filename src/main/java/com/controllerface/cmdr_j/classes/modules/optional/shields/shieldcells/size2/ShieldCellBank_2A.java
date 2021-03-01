package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_2A extends AbstractShieldCellBank
{
    public ShieldCellBank_2A()
    {
        super("2A Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 61.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.18),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 32.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 240.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 3.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 1.5)
                ));
    }

    @Override
    public long price()
    {
        return 56_547;
    }
}