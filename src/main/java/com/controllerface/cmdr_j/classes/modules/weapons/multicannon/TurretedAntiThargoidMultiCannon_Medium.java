package com.controllerface.cmdr_j.classes.modules.weapons.multicannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedAntiThargoidMultiCannon_Medium extends AbstractExperimentalModule
{
    public TurretedAntiThargoidMultiCannon_Medium()
    {
        super("2F Turreted Anti-Thargoid Multi-Cannon",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.experimental, 1.0),
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 10.813),
                  new ItemEffectData(ItemEffect.Damage, 1.73),
                  new ItemEffectData(ItemEffect.DistributorDraw, 0.06),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.09),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 17.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 4000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 1600.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 6.25),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 90.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 2100.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 4.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 0.4),
                  new ItemEffectData(ItemEffect.MinBreachChance, 50.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 50.0),
                  new ItemEffectData(ItemEffect.DamageType, "Anti-Xeno"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 2000.0)
            ));
    }

    @Override
    public long price()
    {
        return 1_826_500;
    }
}