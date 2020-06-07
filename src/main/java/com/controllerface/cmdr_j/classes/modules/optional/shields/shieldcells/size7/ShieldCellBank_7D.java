package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_7D extends AbstractShieldCellBank
{
    public ShieldCellBank_7D()
    {
        super("7D Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 79.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.66),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 32.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 720.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 3.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 11.4)
                ));
    }

    @Override
    public long price()
    {
        return 622_843;
    }
}