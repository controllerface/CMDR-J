package com.controllerface.cmdr_j.classes.modules.weapons.minelauncher;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedMineLauncher_Small extends AbstractMineLauncher
{
    public FixedMineLauncher_Small()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "I"),
                new ItemEffectData(ItemEffect.Mass, 2.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.4),
                new ItemEffectData(ItemEffect.DamagePerSecond, 44.0),
                new ItemEffectData(ItemEffect.Damage, 44.0),
                new ItemEffectData(ItemEffect.ThermalLoad, 5.0),
                new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                new ItemEffectData(ItemEffect.RateOfFire, 1.0),
                new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 36.0),
                new ItemEffectData(ItemEffect.ReloadTime, 2.0),
                new ItemEffectData(ItemEffect.MinBreachChance, 0.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 0.0),
                new ItemEffectData(ItemEffect.DamageType, "Explosive"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed")
        ));
    }

    @Override
    public long price()
    {
        return 24_260;
    }
}