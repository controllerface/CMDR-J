package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_4D extends AbstractShieldCellBank
{
    public ShieldCellBank_4D()
    {
        super("4D Shield Cell Bank",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 48.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.98),
                        new ItemEffectData(ItemEffect.BootTime, 25.0),
                        new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                        new ItemEffectData(ItemEffect.ShieldBankReinforcement, 26.0),
                        new ItemEffectData(ItemEffect.ShieldBankHeat, 410.0),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2.0),
                        new ItemEffectData(ItemEffect.ShieldBankDuration, 3.4)
                ));
    }

    @Override
    public long price()
    {
        return 28_373;
    }
}