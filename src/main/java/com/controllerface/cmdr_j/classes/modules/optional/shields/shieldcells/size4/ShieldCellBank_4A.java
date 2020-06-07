package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_4A extends AbstractShieldCellBank
{
    public ShieldCellBank_4A()
    {
        super("4A Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 10.0),
                        new ItemEffectData(ItemEffect.Integrity, 96.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.72),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 46.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 410.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 3.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 3.4)
                ));
    }

    @Override
    public long price()
    {
        return 443_328;
    }
}