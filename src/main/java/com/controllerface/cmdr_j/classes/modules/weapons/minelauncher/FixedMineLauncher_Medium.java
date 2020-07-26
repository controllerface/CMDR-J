package com.controllerface.cmdr_j.classes.modules.weapons.minelauncher;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedMineLauncher_Medium extends AbstractMineLauncher
{
    public FixedMineLauncher_Medium()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 2.0),
                new ItemEffectData(ItemEffect.Class, "I"),
                new ItemEffectData(ItemEffect.Mass, 4.0),
                new ItemEffectData(ItemEffect.Integrity, 51.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.4),
                new ItemEffectData(ItemEffect.DamagePerSecond, 44.0),
                new ItemEffectData(ItemEffect.Damage, 44.0),
                new ItemEffectData(ItemEffect.ThermalLoad, 7.5),
                new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                new ItemEffectData(ItemEffect.RateOfFire, 1.0),
                new ItemEffectData(ItemEffect.AmmoClipSize, 3.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 72.0),
                new ItemEffectData(ItemEffect.ReloadTime, 6.6),
                new ItemEffectData(ItemEffect.BreachDamage, 13.2),
                new ItemEffectData(ItemEffect.MinBreachChance, 0.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 0.0),
                new ItemEffectData(ItemEffect.DamageType, "Explosive"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed")
        ));
    }

    @Override
    public long price()
    {
        return 294_080;
    }
}