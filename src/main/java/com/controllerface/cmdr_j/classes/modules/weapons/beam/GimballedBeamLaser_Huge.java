package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.ui.UIFunctions;

public class GimballedBeamLaser_Huge extends AbstractBeamLaser
{
    public GimballedBeamLaser_Huge()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 4.0),
                new ItemEffectData(ItemEffect.Class, "A"),
                new ItemEffectData(ItemEffect.Mass, 16.0),
                new ItemEffectData(ItemEffect.Integrity, 80.0),
                new ItemEffectData(ItemEffect.PowerDraw, 2.57),
                new ItemEffectData(ItemEffect.DamagePerSecond, 32.68),
                new ItemEffectData(ItemEffect.Damage, 32.68),
                new ItemEffectData(ItemEffect.DistributorDraw, 8.99),
                new ItemEffectData(ItemEffect.ThermalLoad, 10.62),
                new ItemEffectData(ItemEffect.ArmourPenetration, 60.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, UIFunctions.Symbols.INFINITY),
                new ItemEffectData(ItemEffect.BreachDamage, 26.1),
                new ItemEffectData(ItemEffect.MinBreachChance, 40.0),
                new ItemEffectData(ItemEffect.MaxBreachChance, 80.0),
                new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                new ItemEffectData(ItemEffect.DamageFalloffRange, 600.0)
        ));
    }

    @Override
    public long price()
    {
        return 8_746_160;
    }
}