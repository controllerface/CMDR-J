package com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldCellBank_7E extends AbstractShieldCellBank
{
    public ShieldCellBank_7E()
    {
        super("7E Shield Cell Bank",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 80.0),
                  new ItemEffectData(ItemEffect.Integrity, 105.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.24),
                  new ItemEffectData(ItemEffect.BootTime, 25.0),
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 24.0),
                  new ItemEffectData(ItemEffect.ShieldBankHeat, 720.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankDuration, 11.4)
            ));
    }

    @Override
    public long price()
    {
        return 249_137;
    }
}