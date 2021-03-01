package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_3D extends AbstractShieldCellBank
{
    public ShieldCellBank_3D()
    {
        super("3D Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 38.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.82),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 23.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 340.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 2.3)
                ));
    }

    @Override
    public long price()
    {
        return 10_133;
    }
}