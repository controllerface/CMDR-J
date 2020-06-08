package com.controllerface.cmdr_j.classes.modules.weapons.railgun;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedRailgun_Small extends AbstractRailGun
{
    public FixedRailgun_Small()
    {
        super("1D Fixed Railgun",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.15),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 37.05),
                        new ItemEffectData(ItemEffect.Damage, 23.34),
                        new ItemEffectData(ItemEffect.DistributorDraw, 2.69),
                        new ItemEffectData(ItemEffect.ThermalLoad, 12.0),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 100.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 1.5873),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 80.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 1.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 22.2),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.DamageType, "ThermoKinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
                ));
    }

    @Override
    public long price()
    {
        return 51_600;
    }
}