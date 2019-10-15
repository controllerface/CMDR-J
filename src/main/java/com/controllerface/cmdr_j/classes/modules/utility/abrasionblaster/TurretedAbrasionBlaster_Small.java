package com.controllerface.cmdr_j.classes.modules.utility.abrasionblaster;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedAbrasionBlaster_Small extends AbstractAbrasionBlaster
{
    public TurretedAbrasionBlaster_Small()
    {
        // todo: update with correct stats, these are from fixed
        super("Small Turreted Abrasion Blaster",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 40.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.34),
                  new ItemEffectData(ItemEffect.DamagePerSecond, 20.0),
                  new ItemEffectData(ItemEffect.Damage, 4.0),
                  new ItemEffectData(ItemEffect.DistributorDraw, 2.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 2.0),
                  new ItemEffectData(ItemEffect.ArmourPenetration, 18.0),
                  new ItemEffectData(ItemEffect.MaximumRange, 1000.0),
                  new ItemEffectData(ItemEffect.ShotSpeed, 667.0),
                  new ItemEffectData(ItemEffect.RateOfFire, 5.0),
                  new ItemEffectData(ItemEffect.BurstRateOfFire, -1.0),
                  new ItemEffectData(ItemEffect.BurstSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoClipSize, 1.0),
                  new ItemEffectData(ItemEffect.AmmoMaximum, 1.7976931348623157E308),
                  new ItemEffectData(ItemEffect.RoundsPerShot, 1.0),
                  new ItemEffectData(ItemEffect.ReloadTime, 0.0),
                  new ItemEffectData(ItemEffect.BreachDamage, 0.6),
                  new ItemEffectData(ItemEffect.MinBreachChance, 10.0),
                  new ItemEffectData(ItemEffect.MaxBreachChance, 20.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
            ));
    }

    @Override
    public long price()
    {
        return 27_480;
    }
}