package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.utilities.UIFunctions;

public class FixedBeamLaser_Large extends AbstractBeamLaser
{
    public FixedBeamLaser_Large()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 3.0),
                new ItemEffectData(ItemEffect.Class, "C"),
                new ItemEffectData(ItemEffect.Mass, 8.0),
                new ItemEffectData(ItemEffect.Integrity, 64.0),
                new ItemEffectData(ItemEffect.PowerDraw, 1.62),
                new ItemEffectData(ItemEffect.DamagePerSecond, 25.78),
                new ItemEffectData(ItemEffect.Damage, 25.78),
                new ItemEffectData(ItemEffect.DistributorDraw, 5.1),
                new ItemEffectData(ItemEffect.ThermalLoad, 7.22),
                new ItemEffectData(ItemEffect.ArmourPenetration, 50.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, UIFunctions.Symbols.INFINITY),
                new ItemEffectData(ItemEffect.BreachDamage, 20.6),
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
        return 1_177_600;
    }
}