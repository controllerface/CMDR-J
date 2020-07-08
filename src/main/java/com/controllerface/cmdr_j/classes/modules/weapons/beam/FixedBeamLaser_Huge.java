package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedBeamLaser_Huge extends AbstractBeamLaser
{
    public FixedBeamLaser_Huge()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 4.0),
                new ItemEffectData(ItemEffect.Class, "A"),
                new ItemEffectData(ItemEffect.Mass, 16.0),
                new ItemEffectData(ItemEffect.Integrity, 80.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.61),
                new ItemEffectData(ItemEffect.DamagePerSecond, 41.38),
                new ItemEffectData(ItemEffect.Damage, 41.38),
                new ItemEffectData(ItemEffect.DistributorDraw, 8.19),
                new ItemEffectData(ItemEffect.ThermalLoad, 9.93),
                new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                new ItemEffectData(ItemEffect.BreachDamage, 33.1),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                new ItemEffectData(ItemEffect.WeaponMode, "Fixed"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
        ));
    }

    @Override
    public long price()
    {
        return 2_396_160;
    }
}