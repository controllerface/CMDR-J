package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_8E extends AbstractShieldCellBank
{
    public ShieldCellBank_8E()
    {
        super("8E Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 160.0),
                        new ItemEffectData(ItemEffect.Integrity, 120.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.44),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 28.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 800.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 17.1)
                ));
    }

    @Override
    public long price()
    {
        return 697_584;
    }
}