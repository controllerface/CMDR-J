package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_6E extends AbstractShieldCellBank
{
    public ShieldCellBank_6E()
    {
        super("6E Shield Cell Bank",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 90.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.06),
                  new ItemEffectData(ItemEffect.BootTime, 25.0),
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 20.0),
                  new ItemEffectData(ItemEffect.ShieldBankHeat, 640.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankDuration, 7.6)
            ));
    }
}