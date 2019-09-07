package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_6B extends AbstractShieldCellBank
{
    public ShieldCellBank_6B()
    {
        super("6B Shield Cell Bank",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 64.0),
                  new ItemEffectData(ItemEffect.Integrity, 158.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.12),
                  new ItemEffectData(ItemEffect.BootTime, 25.0),
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 39.0),
                  new ItemEffectData(ItemEffect.ShieldBankHeat, 640.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankDuration, 7.6)
            ));
    }
}