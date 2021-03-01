package com.controllerface.cmdr_j.classes.modules.weapons.seekermissile;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SeekerMissileRack_Small extends AbstractSeekerMissileRack
{
    public SeekerMissileRack_Small()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "B"),
                new ItemEffectData(ItemEffect.Mass, 2.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                new ItemEffectData(ItemEffect.DamagePerSecond, 13.333),
                new ItemEffectData(ItemEffect.Damage, 40.0),
                new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                new ItemEffectData(ItemEffect.ThermalLoad, 3.6),
                new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                new ItemEffectData(ItemEffect.ShotSpeed, 625.0),
                new ItemEffectData(ItemEffect.RateOfFire, 0.3333),
                new ItemEffectData(ItemEffect.AmmoClipSize, 6.0),
                new ItemEffectData(ItemEffect.AmmoMaximum, 6.0),
                new ItemEffectData(ItemEffect.ReloadTime, 12.0),
                new ItemEffectData(ItemEffect.BreachDamage, 16.0),
                new ItemEffectData(ItemEffect.MinBreachChance, 0.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 0.0),
                new ItemEffectData(ItemEffect.DamageType, "Explosive"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed")
        ));
    }

    @Override
    public long price()
    {
        return 72_600;
    }
}