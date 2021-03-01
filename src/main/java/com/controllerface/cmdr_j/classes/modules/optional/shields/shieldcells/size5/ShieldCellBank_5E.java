package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_5E extends AbstractShieldCellBank
{
    public ShieldCellBank_5E()
    {
        super("5E Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 77.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.9),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 21.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 540.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 4.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 5.1)
                ));
    }

    @Override
    public long price()
    {
        return 31_778;
    }
}