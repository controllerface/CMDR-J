package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_2E extends AbstractShieldCellBank
{
    public ShieldCellBank_2E()
    {
        super("2E Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 41.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 14.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 240.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 4.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 1.5)
                ));
    }

    @Override
    public long price()
    {
        return 1_448;
    }
}