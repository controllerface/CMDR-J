package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldCellBank_8C extends AbstractModule
{
    public ShieldCellBank_8C()
    {
        super("8C Shield Cell Bank", ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 160.0),
                  new ItemEffectData(ItemEffect.Integrity, 150.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.4),
                  new ItemEffectData(ItemEffect.BootTime, 25.0),
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 47.0),
                  new ItemEffectData(ItemEffect.ShieldBankHeat, 800.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 4.0),
                  new ItemEffectData(ItemEffect.ShieldBankDuration, 17.1)
            ));
    }
}