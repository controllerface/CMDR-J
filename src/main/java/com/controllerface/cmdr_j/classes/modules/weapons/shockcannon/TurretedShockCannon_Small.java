package com.controllerface.cmdr_j.classes.modules.weapons.shockcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedShockCannon_Small extends AbstractHumanModule
{
    public TurretedShockCannon_Small()
    {
        super("1F Turreted Shock Cannon",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1.0),
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40),
                        new ItemEffectData(ItemEffect.PowerDraw, .54),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 44.7),
                        new ItemEffectData(ItemEffect.Damage, 4.47),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.21),
                        new ItemEffectData(ItemEffect.ThermalLoad, 0.69),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 25),
                        new ItemEffectData(ItemEffect.MaxRange, 3_000),
                        new ItemEffectData(ItemEffect.ShotSpeed, 1_200),
                        new ItemEffectData(ItemEffect.RateOfFire, 10),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 16),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 240),
                        new ItemEffectData(ItemEffect.ReloadTime, 6),
                        new ItemEffectData(ItemEffect.BreachDamage, 3.1),
                        new ItemEffectData(ItemEffect.MinBreachChance, 40),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 60),
                        new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret"),
                        new ItemEffectData(ItemEffect.FalloffRange, 2_500)
                ));
    }

    @Override
    public long price()
    {
        return 364_000;
    }
}