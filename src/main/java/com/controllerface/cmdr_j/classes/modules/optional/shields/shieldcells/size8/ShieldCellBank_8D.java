package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ShieldCellBank_8D extends AbstractShieldCellBank
{
    public ShieldCellBank_8D()
    {
        super("8D Shield Cell Bank",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 64.0),
                  new ItemEffectData(ItemEffect.Integrity, 90.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.92),
                  new ItemEffectData(ItemEffect.BootTime, 25.0),
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 37.0),
                  new ItemEffectData(ItemEffect.ShieldBankHeat, 800.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 3.0),
                  new ItemEffectData(ItemEffect.ShieldBankDuration, 17.1)
            ));
    }
}