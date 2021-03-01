package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_5B extends AbstractShieldCellBank
{
    public ShieldCellBank_5B()
    {
        super("5B Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 134.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.8),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 41.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 540.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 4.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 5.1)
                ));
    }

    @Override
    public long price()
    {
        return 496_527;
    }
}