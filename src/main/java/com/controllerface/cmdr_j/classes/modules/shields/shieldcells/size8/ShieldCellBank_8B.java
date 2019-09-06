package com.controllerface.cmdr_j.classes.modules.shields.shieldcells.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.shields.shieldcells.AbstractShieldCellBank;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldCellBank_8B extends AbstractShieldCellBank
{
    public ShieldCellBank_8B()
    {
        super("8B Shield Cell Bank",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 256.0),
                  new ItemEffectData(ItemEffect.Integrity, 210.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.88),
                  new ItemEffectData(ItemEffect.BootTime, 25.0),
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 56.0),
                  new ItemEffectData(ItemEffect.ShieldBankHeat, 800.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankDuration, 17.1)
            ));
    }
}