package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_5A extends AbstractShieldCellBank
{
    public ShieldCellBank_5A()
    {
        super("5A Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 115.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.1),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 48.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 540.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 3.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 5.1)
                ));
    }

    @Override
    public long price()
    {
        return 1_210_285;
    }
}