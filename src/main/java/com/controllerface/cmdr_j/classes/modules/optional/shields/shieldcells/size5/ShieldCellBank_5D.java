package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_5D extends AbstractShieldCellBank
{
    public ShieldCellBank_5D()
    {
        super("5D Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 58.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 28.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 540.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 5.1)
                ));
    }

    @Override
    public long price()
    {
        return 79_444;
    }
}