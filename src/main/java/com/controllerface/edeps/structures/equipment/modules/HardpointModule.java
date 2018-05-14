package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.data.ItemEffects;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.edeps.structures.craftable.modifications.ModificationType;
import com.controllerface.edeps.structures.equipment.ItemEffect;

import java.util.Arrays;

/**
 * Created by Stephen on 4/24/2018.
 */
@SuppressWarnings("unchecked")
public enum HardpointModule implements ShipModule
{
    /**
     * Beam Lasers
     */

    hpt_beamlaser_fixed_small("Small Fixed Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.62),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 9.82),
                    new ItemEffectData(ItemEffect.Damage, 9.82),
                    new ItemEffectData(ItemEffect.DistributorDraw, 1.94),
                    new ItemEffectData(ItemEffect.ThermalLoad, 3.53),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 18),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 7.9),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),

    hpt_beamlaser_gimbal_small("Small Gimballed Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 7.68),
                    new ItemEffectData(ItemEffect.Damage, 7.68),
                    new ItemEffectData(ItemEffect.DistributorDraw, 2.11),
                    new ItemEffectData(ItemEffect.ThermalLoad, 3.65),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 18),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 6.1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),

    hpt_beamlaser_turret_small("Small Turreted Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "NoMode"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.57),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 5.4),
                    new ItemEffectData(ItemEffect.Damage, 5.4),
                    new ItemEffectData(ItemEffect.DistributorDraw, 1.32),
                    new ItemEffectData(ItemEffect.ThermalLoad, 2.4),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 18),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 4.3),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),


    hpt_beamlaser_fixed_small_heat("Small Fixed Retributor (Beam Laser)",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.62),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 4.91),
                    new ItemEffectData(ItemEffect.Damage, 4.91),
                    new ItemEffectData(ItemEffect.DistributorDraw, 2.52),
                    new ItemEffectData(ItemEffect.ThermalLoad, 2.7),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 18),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 3.9),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),


    hpt_beamlaser_fixed_medium("Medium Fixed Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 51),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.01),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 15.96),
                    new ItemEffectData(ItemEffect.Damage, 15.96),
                    new ItemEffectData(ItemEffect.DistributorDraw, 3.16),
                    new ItemEffectData(ItemEffect.ThermalLoad, 5.11),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 35),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 12.6),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),

    hpt_beamlaser_gimbal_medium("Medium Gimballed Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 51),
                    new ItemEffectData(ItemEffect.PowerDraw, 1),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 12.52),
                    new ItemEffectData(ItemEffect.Damage, 12.52),
                    new ItemEffectData(ItemEffect.DistributorDraw, 3.44),
                    new ItemEffectData(ItemEffect.ThermalLoad, 5.32),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 35),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 10),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),

    hpt_beamlaser_turret_medium("Medium Turreted Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "NoMode"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 51),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.93),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 8.83),
                    new ItemEffectData(ItemEffect.Damage, 8383),
                    new ItemEffectData(ItemEffect.DistributorDraw, 2.16),
                    new ItemEffectData(ItemEffect.ThermalLoad, 3.53),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 35),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 7.1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),


    hpt_beamlaser_fixed_large("Large Fixed Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 8),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.62),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 25.78),
                    new ItemEffectData(ItemEffect.Damage, 25.78),
                    new ItemEffectData(ItemEffect.DistributorDraw, 5.1),
                    new ItemEffectData(ItemEffect.ThermalLoad, 7.22),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 50),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 20.6),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),

    hpt_beamlaser_gimbal_large("Large Gimballed Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 8),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.6),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 20.3),
                    new ItemEffectData(ItemEffect.Damage, 20.3),
                    new ItemEffectData(ItemEffect.DistributorDraw, 5.58),
                    new ItemEffectData(ItemEffect.ThermalLoad, 7.61),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 50),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 16.2),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),

    hpt_beamlaser_turret_large("Large Turreted Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "NoMode"),
                    new ItemEffectData(ItemEffect.Mass, 8),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.51),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 14.36),
                    new ItemEffectData(ItemEffect.Damage, 14.36),
                    new ItemEffectData(ItemEffect.DistributorDraw, 3.51),
                    new ItemEffectData(ItemEffect.ThermalLoad, 5.11),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 50),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 11.5),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),


    hpt_beamlaser_fixed_huge("Huge Fixed Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 16),
                    new ItemEffectData(ItemEffect.Integrity, 80),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.61),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 41.38),
                    new ItemEffectData(ItemEffect.Damage, 41.38),
                    new ItemEffectData(ItemEffect.DistributorDraw, 8.19),
                    new ItemEffectData(ItemEffect.ThermalLoad, 9.93),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 60),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 33.1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),

    hpt_beamlaser_gimbal_huge("Huge Gimballed Beam Laser",
            ModificationType.Beam_Laser,
            ExperimentalType.Beam_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 16),
                    new ItemEffectData(ItemEffect.Integrity, 80),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.57),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 32.68),
                    new ItemEffectData(ItemEffect.Damage, 32.68),
                    new ItemEffectData(ItemEffect.DistributorDraw, 8.99),
                    new ItemEffectData(ItemEffect.ThermalLoad, 10.62),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 60),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, Double.MAX_VALUE),
                    new ItemEffectData(ItemEffect.BreachDamage, 26.1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),



    /**
     * Burst Lasers
     */

    hpt_pulselaserburst_fixed_small("Small Fixed Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.65),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 8.147),
                    new ItemEffectData(ItemEffect.Damage, 1.72),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.25),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.38),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 20),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 4.737),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 15),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 1.5),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaserburst_gimbal_small("Small Gimballed Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 6.448),
                    new ItemEffectData(ItemEffect.Damage, 1.22),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.34),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 20),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 5.285),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 17),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaserburst_turret_small("Small Turreted Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "NoMode"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 4.174),
                    new ItemEffectData(ItemEffect.Damage, 0.87),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.139),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.19),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 20),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 4.798),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 19),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 0.4),
                    new ItemEffectData(ItemEffect.MinBreachChance, 60),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaserburst_fixed_small_scatter("Small Fixed Cytoscrambler (Burst Laser)",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.8),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 27.43),
                    new ItemEffectData(ItemEffect.Damage, 3.6),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.31),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.28),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 1),
                    new ItemEffectData(ItemEffect.MaximumRange, 1000),
                    new ItemEffectData(ItemEffect.RateOfFire, 7.619),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 20),
                    new ItemEffectData(ItemEffect.BurstSize, 8),
                    new ItemEffectData(ItemEffect.BreachDamage, 3.1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 0),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 0),
                    new ItemEffectData(ItemEffect.Jitter, 3.5),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 600)
            )),


    hpt_pulselaserburst_fixed_medium("Medium Fixed Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.05),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 13.045),
                    new ItemEffectData(ItemEffect.Damage, 3.53),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.5),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.78),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 35),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 3.695),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 11),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 3),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaserburst_gimbal_medium("Medium Gimballed Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.04),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 10.296),
                    new ItemEffectData(ItemEffect.Damage, 2.45),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.49),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.67),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 35),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 4.203),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 13),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 2.1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaserburst_turret_medium("Medium Turreted Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "NoMode"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.98),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 6.76),
                    new ItemEffectData(ItemEffect.Damage, 1.72),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.275),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.38),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 35),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 3.93),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 15),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 0.9),
                    new ItemEffectData(ItemEffect.MinBreachChance, 60),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),


    hpt_pulselaserburst_fixed_large("large Fixed Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 8),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.66),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 20.78),
                    new ItemEffectData(ItemEffect.Damage, 7.73),
                    new ItemEffectData(ItemEffect.DistributorDraw, 1.11),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.7),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 52),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 2.689),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 7),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 3.9),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaserburst_gimbal_large("Large Gimballed Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 8),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.65),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 16.61),
                    new ItemEffectData(ItemEffect.Damage, 5.16),
                    new ItemEffectData(ItemEffect.DistributorDraw, 1.03),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.42),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 52),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 3.218),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 9),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 4.4),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaserburst_turret_large("Large Turreted Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "NoMode"),
                    new ItemEffectData(ItemEffect.Mass, 8),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.57),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 11.01),
                    new ItemEffectData(ItemEffect.Damage, 3.53),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.56),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.78),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 52),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 3.119),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 11),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 1.8),
                    new ItemEffectData(ItemEffect.MinBreachChance, 60),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),


    hpt_pulselaserburst_fixed_huge("Huge Fixed Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 16),
                    new ItemEffectData(ItemEffect.Integrity, 80),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.58),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 32.26),
                    new ItemEffectData(ItemEffect.Damage, 20.61),
                    new ItemEffectData(ItemEffect.DistributorDraw, 2.98),
                    new ItemEffectData(ItemEffect.ThermalLoad, 4.53),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 65),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 1.5652),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 3),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 17.5),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaserburst_gimbal_huge("Huge Gimballed Burst Laser",
            ModificationType.Burst_Laser,
            ExperimentalType.Burst_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 16),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.59),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 25.91),
                    new ItemEffectData(ItemEffect.Damage, 12.09),
                    new ItemEffectData(ItemEffect.DistributorDraw, 2.41),
                    new ItemEffectData(ItemEffect.ThermalLoad, 3.33),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 65),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 2.143),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 5),
                    new ItemEffectData(ItemEffect.BurstSize, 3),
                    new ItemEffectData(ItemEffect.BreachDamage, 10.3),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),



    /**
     * Pulse Lasers
     */

    hpt_pulselaser_fixed_small("Small Fixed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Manual"),
                    new ItemEffectData(ItemEffect.Mass,2),
                    new ItemEffectData(ItemEffect.Integrity,40),
                    new ItemEffectData(ItemEffect.PowerDraw,0.39),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,7.885),
                    new ItemEffectData(ItemEffect.Damage,2.05),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.3),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.33),
                    new ItemEffectData(ItemEffect.ArmourPenetration,20),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,3.846),
                    new ItemEffectData(ItemEffect.BreachDamage,1.7),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),

    hpt_pulselaser_gimbal_small("Small Gimballed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Gimbal"),
                    new ItemEffectData(ItemEffect.Mass,2),
                    new ItemEffectData(ItemEffect.Integrity,40),
                    new ItemEffectData(ItemEffect.PowerDraw,0.39),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,6.24),
                    new ItemEffectData(ItemEffect.Damage,1.56),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.31),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.31),
                    new ItemEffectData(ItemEffect.ArmourPenetration,20),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,4),
                    new ItemEffectData(ItemEffect.BreachDamage,1.3),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),

    hpt_pulselaser_turret_small("Small Turreted Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"NoMode"),
                    new ItemEffectData(ItemEffect.Mass,2),
                    new ItemEffectData(ItemEffect.Integrity,40),
                    new ItemEffectData(ItemEffect.PowerDraw,0.38),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,3.967),
                    new ItemEffectData(ItemEffect.Damage,1.19),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.19),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.19),
                    new ItemEffectData(ItemEffect.ArmourPenetration,20),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,3.333),
                    new ItemEffectData(ItemEffect.BreachDamage,1),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),


    hpt_pulselaser_fixed_medium("Medium Fixed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Manual"),
                    new ItemEffectData(ItemEffect.Mass,4),
                    new ItemEffectData(ItemEffect.Integrity,51),
                    new ItemEffectData(ItemEffect.PowerDraw,0.6),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,12.069),
                    new ItemEffectData(ItemEffect.Damage,3.5),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.5),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.56),
                    new ItemEffectData(ItemEffect.ArmourPenetration,35),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,3.448),
                    new ItemEffectData(ItemEffect.BreachDamage,3),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),

    hpt_pulselaser_gimbal_medium("Medium Gimballed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Gimbal"),
                    new ItemEffectData(ItemEffect.Mass,4),
                    new ItemEffectData(ItemEffect.Integrity,51),
                    new ItemEffectData(ItemEffect.PowerDraw,0.6),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,9.571),
                    new ItemEffectData(ItemEffect.Damage,2.68),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.54),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.54),
                    new ItemEffectData(ItemEffect.ArmourPenetration,35),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,3.571),
                    new ItemEffectData(ItemEffect.BreachDamage,2.3),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),

    hpt_pulselaser_turret_medium("Medium Turreted Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"NoMode"),
                    new ItemEffectData(ItemEffect.Mass,4),
                    new ItemEffectData(ItemEffect.Integrity,51),
                    new ItemEffectData(ItemEffect.PowerDraw,0.58),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,6.212),
                    new ItemEffectData(ItemEffect.Damage,2.05),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.33),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.33),
                    new ItemEffectData(ItemEffect.ArmourPenetration,35),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,3.03),
                    new ItemEffectData(ItemEffect.BreachDamage,1.7),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),


    hpt_pulselaser_fixed_medium_disruptor("Medium Fixed Disruptor (Pulse Laser)", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Manual"),
                    new ItemEffectData(ItemEffect.Mass,4),
                    new ItemEffectData(ItemEffect.Integrity,51),
                    new ItemEffectData(ItemEffect.PowerDraw,0.7),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,4.667),
                    new ItemEffectData(ItemEffect.Damage,2.8),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.9),
                    new ItemEffectData(ItemEffect.ThermalLoad,1),
                    new ItemEffectData(ItemEffect.ArmourPenetration,35),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,1.667),
                    new ItemEffectData(ItemEffect.BreachDamage,2.4),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),


    hpt_pulselaser_fixed_large("Large Fixed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Manual"),
                    new ItemEffectData(ItemEffect.Mass,8),
                    new ItemEffectData(ItemEffect.Integrity,64),
                    new ItemEffectData(ItemEffect.PowerDraw,0.9),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,18.12),
                    new ItemEffectData(ItemEffect.Damage,5.98),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.86),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.96),
                    new ItemEffectData(ItemEffect.ArmourPenetration,52),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,3.03),
                    new ItemEffectData(ItemEffect.BreachDamage,5.1),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),

    hpt_pulselaser_gimbal_large("Large Gimballed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Gimbal"),
                    new ItemEffectData(ItemEffect.Mass,8),
                    new ItemEffectData(ItemEffect.Integrity,64),
                    new ItemEffectData(ItemEffect.PowerDraw,0.92),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,14.774),
                    new ItemEffectData(ItemEffect.Damage,4.58),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.92),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.92),
                    new ItemEffectData(ItemEffect.ArmourPenetration,52),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,3.226),
                    new ItemEffectData(ItemEffect.BreachDamage,3.9),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),

    hpt_pulselaser_turret_large("Large Turreted Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"NoMode"),
                    new ItemEffectData(ItemEffect.Mass,8),
                    new ItemEffectData(ItemEffect.Integrity,64),
                    new ItemEffectData(ItemEffect.PowerDraw,0.89),
                    new ItemEffectData(ItemEffect.BootTime,0),
                    new ItemEffectData(ItemEffect.DamagePerSecond,9.459),
                    new ItemEffectData(ItemEffect.Damage,3.5),
                    new ItemEffectData(ItemEffect.DistributorDraw,0.56),
                    new ItemEffectData(ItemEffect.ThermalLoad,0.56),
                    new ItemEffectData(ItemEffect.ArmourPenetration,52),
                    new ItemEffectData(ItemEffect.MaximumRange,3000),
                    new ItemEffectData(ItemEffect.RateOfFire,2.703),
                    new ItemEffectData(ItemEffect.BreachDamage,3),
                    new ItemEffectData(ItemEffect.MinBreachChance,40),
                    new ItemEffectData(ItemEffect.MaxBreachChance,80),
                    new ItemEffectData(ItemEffect.Jitter,0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange,500)
            )),


    hpt_pulselaser_fixed_huge("Huge Fixed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Manual"),
                    new ItemEffectData(ItemEffect.Mass, 16),
                    new ItemEffectData(ItemEffect.Integrity, 80),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.33),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 26.95),
                    new ItemEffectData(ItemEffect.Damage, 10.24),
                    new ItemEffectData(ItemEffect.DistributorDraw, 1.48),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.64),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 65),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 2.632),
                    new ItemEffectData(ItemEffect.BreachDamage, 8.7),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),

    hpt_pulselaser_gimbal_huge("Huge Gimballed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode,"Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 16),
                    new ItemEffectData(ItemEffect.Integrity, 80),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.37),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 21.72),
                    new ItemEffectData(ItemEffect.Damage, 7.82),
                    new ItemEffectData(ItemEffect.DistributorDraw, 1.56),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.56),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 65),
                    new ItemEffectData(ItemEffect.MaximumRange, 3000),
                    new ItemEffectData(ItemEffect.RateOfFire, 2.778),
                    new ItemEffectData(ItemEffect.BreachDamage, 6.6),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType,"Thermal"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 500)
            )),



    /**
     * Multi-Cannons
     */

    hpt_multicannon_fixed_small("Small Fixed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.28),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 8.615),
                    new ItemEffectData(ItemEffect.Damage, 1.12),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.06),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.09),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 22),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 7.692),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 100),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.ReloadTime, 4),
                    new ItemEffectData(ItemEffect.BreachDamage, 1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),

    hpt_multicannon_gimbal_small("Small Gimballed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.37),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 6.833),
                    new ItemEffectData(ItemEffect.Damage, 0.82),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.07),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.1),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 22),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 8.333),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 90),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.ReloadTime, 5),
                    new ItemEffectData(ItemEffect.BreachDamage, 0.7),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),

    hpt_multicannon_turret_small("Small Turreted Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "NoMode"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.26),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 4),
                    new ItemEffectData(ItemEffect.Damage, 0.56),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.03),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.04),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 22),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 7.143),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 90),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.ReloadTime, 4),
                    new ItemEffectData(ItemEffect.BreachDamage, 0.5),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),


    hpt_multicannon_fixed_small_strong("Small Fixed Enforcer (Multi-Cannon)", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 2),
                    new ItemEffectData(ItemEffect.Integrity, 40),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.28),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 12.391),
                    new ItemEffectData(ItemEffect.Damage, 2.85),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.12),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.18),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 30),
                    new ItemEffectData(ItemEffect.MaximumRange, 4500),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1800),
                    new ItemEffectData(ItemEffect.RateOfFire, 4.348),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 60),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 1000),
                    new ItemEffectData(ItemEffect.ReloadTime, 4),
                    new ItemEffectData(ItemEffect.BreachDamage, 2.6),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),


    hpt_multicannon_fixed_medium("Medium Fixed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 51),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.46),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 15.643),
                    new ItemEffectData(ItemEffect.Damage, 2.19),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.11),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.18),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 37),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 7.143),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 100),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.ReloadTime, 4),
                    new ItemEffectData(ItemEffect.BreachDamage, 2),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),

    hpt_multicannon_gimbal_medium("Medium Gimballed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 51),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 12.615),
                    new ItemEffectData(ItemEffect.Damage, 1.64),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.14),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.2),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 37),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 7.692),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 90),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.ReloadTime, 5),
                    new ItemEffectData(ItemEffect.BreachDamage, 1.5),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),

    hpt_multicannon_turret_medium("Medium Turreted Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "NoMode"),
                    new ItemEffectData(ItemEffect.Mass, 4),
                    new ItemEffectData(ItemEffect.Integrity, 51),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 7.313),
                    new ItemEffectData(ItemEffect.Damage, 1.17),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.06),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.09),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 37),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 6.25),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 90),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.ReloadTime, 4),
                    new ItemEffectData(ItemEffect.BreachDamage, 1.1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),


    hpt_multicannon_fixed_large("Large Fixed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 8),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.64),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 23.09),
                    new ItemEffectData(ItemEffect.Damage, 3.925),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.18),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.28),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 54),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 5.882),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 100),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.ReloadTime, 4),
                    new ItemEffectData(ItemEffect.BreachDamage, 3.5),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),

    hpt_multicannon_gimbal_large("Large Gimballed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 8),
                    new ItemEffectData(ItemEffect.Integrity, 64),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 18.93),
                    new ItemEffectData(ItemEffect.Damage, 2.84),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.25),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.34),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 54),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 6.667),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 90),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.ReloadTime, 5),
                    new ItemEffectData(ItemEffect.BreachDamage, 2.6),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),


    hpt_multicannon_fixed_huge("Huge Fixed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Manual"),
                    new ItemEffectData(ItemEffect.Mass, 16),
                    new ItemEffectData(ItemEffect.Integrity, 80),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.73),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 28.03),
                    new ItemEffectData(ItemEffect.Damage, 4.625),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.24),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.39),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 68),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 3.03),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 90),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.RoundsPerShot, 2),
                    new ItemEffectData(ItemEffect.ReloadTime, 4),
                    new ItemEffectData(ItemEffect.BreachDamage, 4.2),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),

    hpt_multicannon_gimbal_huge("Huge Gimballed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.WeaponMode, "Gimbal"),
                    new ItemEffectData(ItemEffect.Mass, 16),
                    new ItemEffectData(ItemEffect.Integrity, 80),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.22),
                    new ItemEffectData(ItemEffect.BootTime, 0),
                    new ItemEffectData(ItemEffect.DamagePerSecond, 23.3),
                    new ItemEffectData(ItemEffect.Damage, 3.46),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.37),
                    new ItemEffectData(ItemEffect.ThermalLoad, 0.51),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 68),
                    new ItemEffectData(ItemEffect.MaximumRange, 4000),
                    new ItemEffectData(ItemEffect.ShotSpeed, 1600),
                    new ItemEffectData(ItemEffect.RateOfFire, 3.367),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 90),
                    new ItemEffectData(ItemEffect.AmmoMaximum, 2100),
                    new ItemEffectData(ItemEffect.RoundsPerShot, 2),
                    new ItemEffectData(ItemEffect.ReloadTime, 5),
                    new ItemEffectData(ItemEffect.BreachDamage, 3.1),
                    new ItemEffectData(ItemEffect.MinBreachChance, 40),
                    new ItemEffectData(ItemEffect.MaxBreachChance, 80),
                    new ItemEffectData(ItemEffect.Jitter, 0),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.DamageFalloffRange, 2000)
            )),


    /**
     * Cannons
     */

    hpt_cannon_fixed_small("Small Fixed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_gimbal_small("Small Gimballed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_turret_small("Small Turreted Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),

    hpt_cannon_fixed_medium("Medium Fixed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_gimbal_medium("Medium Gimballed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_turret_medium("Medium Turreted Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),

    hpt_cannon_fixed_large("Large Fixed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_gimbal_large("Large Gimballed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_turret_large("Large Turreted Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),

    hpt_cannon_fixed_huge("Huge Fixed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_gimbal_huge("Huge Gimballed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),


    /**
     * Fragment Cannons
     */
    hpt_slugshot_fixed_small("Small Fixed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_gimbal_small("Small Gimballed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_turret_small("Small Turreted Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),

    hpt_slugshot_fixed_medium("Medium Fixed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_gimbal_medium("Medium Gimballed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_turret_medium("Medium Turreted Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),

    hpt_slugshot_fixed_large("Large Fixed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_gimbal_large("Large Gimballed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_turret_large("Large Turreted Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),

    hpt_slugshot_fixed_large_range("Large Fixed Pacifier (Fragment Cannon)", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),


    /**
     * Plasma Accelerators
     */

    hpt_plasmaaccelerator_fixed_medium("Medium Fixed Plasma Accelerator", ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            new ItemEffects()),
    hpt_plasmaaccelerator_fixed_large_advanced("Large Fixed Plasma Accelerator (Advanced)", ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            new ItemEffects()),
    hpt_plasmaaccelerator_fixed_large("Large Fixed Plasma Accelerator", ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            new ItemEffects()),
    hpt_plasmaaccelerator_fixed_huge("Huge Fixed Plasma Accelerator", ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            new ItemEffects()),


    /**
     * Railguns
     */

    hpt_railgun_fixed_small("Small Fixed Railgun", ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            new ItemEffects()),

    hpt_railgun_fixed_medium_burst("Medium Fixed Imperial Hammer (Rail Gun)", ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            new ItemEffects()),

    hpt_railgun_fixed_medium("Medium Fixed Railgun", ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            new ItemEffects()),


    /**
     * Shield Boosters
     */

    hpt_shieldbooster_size0_class1("0E Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),
    hpt_shieldbooster_size0_class2("0D Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),
    hpt_shieldbooster_size0_class3("0C Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),
    hpt_shieldbooster_size0_class4("0B Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),
    hpt_shieldbooster_size0_class5("0A Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),

    /**
     * Dumbfire Missile racks
     */

    hpt_dumbfiremissilerack_fixed_small("Small Fixed Missile Rack", ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            new ItemEffects()),

    hpt_dumbfiremissilerack_fixed_medium_lasso("Medium Fixed Containment Missile (Missile Rack)", ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            new ItemEffects()),

    hpt_dumbfiremissilerack_fixed_medium("Medium Fixed Missile Rack", ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            new ItemEffects()),



    /**
     * Seeker Missile Racks
     */

    hpt_basicmissilerack_fixed_small("Small Fixed Seeker Missile Rack", ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            new ItemEffects()),

    hpt_drunkmissilerack_fixed_medium("Medium Pixed Pack-Hound (Seeker Missile Rack)", ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            new ItemEffects()),

    hpt_basicmissilerack_fixed_medium("Medium Fixed Seeker Missile Rack", ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            new ItemEffects()),


    /**
     * Mine Launchers
     */

    hpt_minelauncher_fixed_small("Small Fixed Mine Launcher", ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            new ItemEffects()),
    hpt_minelauncher_fixed_small_impulse("Small Fixed Shock Mine Launcher", ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            new ItemEffects()),
    hpt_minelauncher_fixed_medium("Medium Fixed Mine Launcher", ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            new ItemEffects()),

    /**
     * Torpedo Pylons
     */

    hpt_advancedtorppylon_fixed_small("Small Fixed Torpedo Pylon", ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon,
            new ItemEffects()),
    hpt_advancedtorppylon_fixed_medium("Medium Fixed Torpedo Pylon", ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon,
            new ItemEffects()),


    /**
     * Mining Lasers
     */
    hpt_mininglaser_fixed_small("Small Fixed Mining Laser", null, null,
            new ItemEffects()),
    hpt_mininglaser_turret_small("Small Turreted Mining Laser", null, null,
            new ItemEffects()),

    hpt_mininglaser_fixed_small_advanced("Small Fixed Mining Lance", null, null,
            new ItemEffects()),

    hpt_mininglaser_fixed_medium("Medium Fixed Mining Laser", null, null,
            new ItemEffects()),
    hpt_mininglaser_turret_medium("Medium Turreted Mining Laser", null, null,
            new ItemEffects()),


    /**
     * Wake Scanners
     */

    hpt_cloudscanner_size0_class1("0E FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),
    hpt_cloudscanner_size0_class2("0D FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),
    hpt_cloudscanner_size0_class3("0C FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),
    hpt_cloudscanner_size0_class4("0B FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),
    hpt_cloudscanner_size0_class5("0A FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),


    /**
     * Kill Warrant Scanners
     */

    hpt_crimescanner_size0_class1("0E Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),
    hpt_crimescanner_size0_class2("0D Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),
    hpt_crimescanner_size0_class3("0C Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),
    hpt_crimescanner_size0_class4("0B Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),
    hpt_crimescanner_size0_class5("0A Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),


    /**
     * Manifest Scanners
     */

    hpt_cargoscanner_size0_class1("0E Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),
    hpt_cargoscanner_size0_class2("0D Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),
    hpt_cargoscanner_size0_class3("0C Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),
    hpt_cargoscanner_size0_class4("0B Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),
    hpt_cargoscanner_size0_class5("0A Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),


    /**
     * Chaff Launcher, Heat-Sink Launcher, Point Defense, Electronic Countermeasures
     */

    hpt_chafflauncher_tiny("Chaff Launcher", ModificationType.Chaff_Launcher, null,
            new ItemEffects()),
    hpt_heatsinklauncher_turret_tiny("Heat-Sink Launcher", ModificationType.Heat_Sink_Launcher, null,
            new ItemEffects()),
    hpt_plasmapointdefence_turret_tiny("Point Defense Turret", ModificationType.Point_Defense, null,
            new ItemEffects()),
    hpt_electroniccountermeasure_tiny("Electronic Counter-Measures", ModificationType.Electronic_Countermeasures, null,
            new ItemEffects()),


    /**
     * Experimental (AEGIS, Anti-Thargoid) Weapons and Items
     */

    hpt_atmulticannon_fixed_large("Large Fixed Anti-Thargoid Multi-Cannon", null, null,
            new ItemEffects()),
    hpt_atmulticannon_fixed_medium("Medium Fixed Anti-Thargoid Multi-Cannon", null, null,
            new ItemEffects()),
    hpt_atmulticannon_turret_large("Large Turreted Anti-Thargoid Multi-Cannon", null, null,
            new ItemEffects()),
    hpt_atmulticannon_turret_medium("Medium Turreted Anti-Thargoid Multi-Cannon", null, null,
            new ItemEffects()),

    hpt_atdumbfiremissile_fixed_large("Large Fixed Anti-Thargoid Missile Rack", null, null,
            new ItemEffects()),
    hpt_atdumbfiremissile_fixed_medium("Medium Fixed Anti-Thargoid Missile Rack", null, null,
            new ItemEffects()),
    hpt_atdumbfiremissile_turret_large("Large Turreted Anti-Thargoid Missile Rack", null, null,
            new ItemEffects()),
    hpt_atdumbfiremissile_turret_medium("Medium Turreted Anti-Thargoid Missile Rack", null, null,
            new ItemEffects()),

    hpt_flakmortar_fixed_medium("Medium Fixed Remote Release Flak Launcher", null, null,
            new ItemEffects()),
    hpt_flakmortar_turret_medium("Medium Turreted Remote Release Flak Launcher", null, null,
            new ItemEffects()),

    /**
     * Guardian Weapons
     */

    // todo: find ENUM values for these
    // Guardian Shard Cannon/Fixed
    // Guardian Shard Cannon/Turreted

    hpt_guardian_gausscannon_fixed_medium("Medium Fixed Guardian Gauss Cannon", null, null,
            new ItemEffects()),

    hpt_guardian_plasmalauncher_fixed_medium("Medium Fixed Guardian Plasma Launcher", null, null,
            new ItemEffects()),

    hpt_guardian_plasmalauncher_turret_medium("Medium Turreted Guardian Plasma Launcher", null, null,
            new ItemEffects()),


    /**
     * Human Tech Broker Weapons
     */

    // todo: verify ENUM values for these, they may be guessed

    hpt_causticmissile_fixed_medium("Medium Fixed Enzyme Missile Rack", null, null,
            new ItemEffects()),

    hpt_flechettelauncher_fixed_medium("Medium Fixed Remote Release Flechette Launcher", null, null,
            new ItemEffects()),
    hpt_flechettelauncher_turret_medium("Medium Turreted Remote Release Flechette Launcher", null, null,
            new ItemEffects()),

    hpt_plasmashockcannon_fixed_medium("Medium Fixed Shock Cannon", null, null,
            new ItemEffects()),
    hpt_plasmashockcannon_gimbal_medium("Medium Gimballed Shock Cannon", null, null,
            new ItemEffects()),
    hpt_plasmashockcannon_turret_medium("Medium Turreted Shock Cannon", null, null,
            new ItemEffects()),

    ;

    private final String displayText;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;
    private final ItemEffects itemEffects;

    HardpointModule(String displayText, ProcurementType modificationType, ProcurementType experimentalType, ItemEffects itemEffects)
    {
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.displayText = displayText;
        this.itemEffects = itemEffects;
    }

    @Override
    public ProcurementType modificationType()
    {
        return modificationType;
    }

    @Override
    public ProcurementType experimentalType()
    {
        return experimentalType;
    }

    @Override
    public String displayText()
    {
        return displayText;
    }

    @Override
    public ItemEffects itemEffects()
    {
        return itemEffects;
    }

    public static ShipModule findModule(String moduleName) throws Exception
    {
        final Exception exception;
        try
        {
            return valueOf(moduleName);
        }
        catch (Exception e)
        {
            exception = e;
            if (moduleName == null || moduleName.isEmpty()) throw e;
        }

        return Arrays.stream(HardpointModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(() -> exception);
    }
}
