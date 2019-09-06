package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size1;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ShieldCellBank_1A extends AbstractShieldCellBank
{
    public ShieldCellBank_1A()
    {
        super("1A Shield Cell Bank",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.3),
                  new ItemEffectData(ItemEffect.Integrity, 48.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.97),
                  new ItemEffectData(ItemEffect.BootTime, 25.0),
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 28.0),
                  new ItemEffectData(ItemEffect.ShieldBankHeat, 170.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 2.0),
                  new ItemEffectData(ItemEffect.ShieldBankDuration, 1.0)
            ));
    }
}