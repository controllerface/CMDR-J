package com.controllerface.cmdr_j.classes.modules.generated;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public class ShieldCellBank_6A extends AbstractModule
{
    public ShieldCellBank_6A()
    {
        super("6A Shield Cell Bank", ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank, 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 136.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 2.48),
                  new ItemEffectData(ItemEffect.BootTime, 25.0),
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 5.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 46.0),
                  new ItemEffectData(ItemEffect.ShieldBankHeat, 640.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 4.0),
                  new ItemEffectData(ItemEffect.ShieldBankDuration, 7.6)
            ));
    }
}