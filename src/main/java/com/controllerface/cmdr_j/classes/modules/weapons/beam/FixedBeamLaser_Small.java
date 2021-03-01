package com.controllerface.cmdr_j.classes.modules.weapons.beam;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.utilities.UIFunctions;

public class FixedBeamLaser_Small extends AbstractBeamLaser
{
    public FixedBeamLaser_Small()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "E"),
                new ItemEffectData(ItemEffect.Mass, 2.0),
                new ItemEffectData(ItemEffect.Integrity, 40.0),
                new ItemEffectData(ItemEffect.PowerDraw, 0.62),
                new ItemEffectData(ItemEffect.DamagePerSecond, 9.82),
                new ItemEffectData(ItemEffect.Damage, 9.82),
                new ItemEffectData(ItemEffect.DistributorDraw, 1.94),
                new ItemEffectData(ItemEffect.ThermalLoad, 3.53),
                new ItemEffectData(ItemEffect.ArmourPenetration, 18.0),
                new ItemEffectData(ItemEffect.MaximumRange, 3000.0),
                new ItemEffectData(ItemEffect.RateOfFire, UIFunctions.Symbols.INFINITY),
                new ItemEffectData(ItemEffect.BreachDamage, 7.9),
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
        return 37_430;
    }
}