package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedAntiThargoidMultiCannon_Large extends AbstractExperimentalModule
{
    public TurretedAntiThargoidMultiCannon_Large()
    {
        super("3E Turreted Anti-Thargoid Multi-Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1.0),
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 8.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 20.69),
                        new ItemEffectData(ItemEffect.Damage, 3.31),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.06),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.09),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 33.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 6.25),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.8),
                        new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 50.0),
                        new ItemEffectData(ItemEffect.DamageType, "Anti-Xeno"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }

    @Override
    public long price()
    {
        return 3_726_060;
    }
}