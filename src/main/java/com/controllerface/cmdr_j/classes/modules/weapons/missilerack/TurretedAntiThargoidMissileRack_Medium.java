package com.controllerface.cmdr_j.classes.modules.weapons.missilerack;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedAntiThargoidMissileRack_Medium extends AbstractExperimentalModule
{
    public TurretedAntiThargoidMissileRack_Medium()
    {
        super("Anti-Thargoid Missile Rack",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1.0),
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                        new ItemEffectData(ItemEffect.DamagePerSecond, 25.0),
                        new ItemEffectData(ItemEffect.Damage, 50.0),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.08),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.5),
                        new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                        new ItemEffectData(ItemEffect.MaximumRange, 5000.0),
                        new ItemEffectData(ItemEffect.ShotSpeed, 750.0),
                        new ItemEffectData(ItemEffect.RateOfFire, 0.5),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 8.0),
                        new ItemEffectData(ItemEffect.AmmoMaximum, 64.0),
                        new ItemEffectData(ItemEffect.ReloadTime, 5.0),
                        new ItemEffectData(ItemEffect.BreachDamage, 0.1),
                        new ItemEffectData(ItemEffect.MinBreachChance, 80.0),
                        new ItemEffectData(ItemEffect.MaxBreachChance, 100.0),
                        new ItemEffectData(ItemEffect.DamageType, "Explosive/AX"),
                        new ItemEffectData(ItemEffect.WeaponMode, "Turret")
                ));
    }

    @Override
    public long price()
    {
        return 2_022_700;
    }
}