package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_2D extends AbstractShieldCellBank
{
    public ShieldCellBank_2D()
    {
        super("2D Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 1.0),
                        new ItemEffectData(ItemEffect.Integrity, 31.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.67),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 18.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 240.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 1.5)
                ));
    }

    @Override
    public long price()
    {
        return 3_619;
    }
}