package com.controllerface.edeps.structures.equipment;

/**
 * ALl possible item effects, both modifiable/experimental and base stats are represented. In some cases, an effect IS
 * a base stat this can also be modified (ex: ammo clip size on Multi-cannons and the High Capacity mod) and in others,
 * the effect is only available via mod or experimental effect (ex: wing shield regen on Regeneration sequence effect).
 *
 * There are also a few "synthetic" effects in this list that are not actually found in the journal API, but are used
 * here to make integration with certain components easier. For example, the "rearm" effect is present on all synthesis
 * recipes that restore ammo for a weapon. This effect serves mainly as an indicator to the user of the effect of the
 * recipe when viewing it in the UI.
 *
 * Effects that are currently modifiable by a mod or experimental effect are marked with an asterisk (*)
 *
 * Created by Stephen on 4/6/2018.
 */
public enum ItemEffect
{
    // todo: ensure AFMU "more is good" flags are correct
    AFMRepairCapacity(true),                // base AFMU stat
    AFMRepairConsumption(false),            // base AFMU stat
    AFMRepairPerAmmo(true),                 // base AFMU stat
    AmmoClipSize(true),                     // (*) base Weapon stat (multiple)
    AmmoMaximum(true),                      // (*) base Weapon stat (multiple)
    ArmourPenetration(true),                // (*) base Weapon stat (multiple)

    BoostAugmenterPowerUse(false),          // todo: determine use, probably thrusters, moddable?
    BoostSpeedMultiplier(true),             // todo: determine use, probably thrusters, moddable?
    BootTime(false),                        // (*) base module stat (multiple)
    BreachDamage(true),                     // todo: determine use, probably some weapon, moddable?
    BrokenRegenRate(true),                  // (*) base shield stat
    BurstRateOfFire(true),                  // (*) base weapon stat (burst lasers)
    BurstSize(true),                        // (*) base weapon stat (burst lasers)

    CabinCapacity(true),                    // base passenger cabin stat
    CabinClass(true),                       // base passenger cabin stat
    CargoCapacity(true),                    // base cargo rack stat
    CausticResistance(true),                // (*) anti-xeno modifier
    ChaffJamDuration(true),                 // (*) base chaff stat
    Class(true),                            // base module stat (multiple)

    Damage(true),                           // (*) base weapon stat (multiple)
    DamageFalloffRange(true),               // base weapon stat (multiple)
    DamagePerSecond(true),                  // (*) base weapon stat (multiple)
    DamageType(true),                       // base weapon stat (multiple)
    DefenceModifierHealthAddition(true),    // (*) base hull reinforcement stat
    DefenceModifierHealthMultiplier(true),  // (*) base armour stat
    DefenceModifierShieldAddition(true),    // todo: determine use, probably some weapon, moddable?
    DefenceModifierShieldMultiplier(true),  // todo: determine use, probably some weapon, moddable?
    DiscoveryScannerPassiveRange(true),     // base discovery scanner stat
    DiscoveryScannerRange(true),            // base discovery scanner stat
    DisruptionBarrierActivePower(true),     // todo: determine use, probably ECM, moddable?
    DisruptionBarrierChargeDuration(true),  // todo: determine use, probably ECM, moddable?
    DisruptionBarrierCooldown(false),       // todo: determine use, probably ECM, moddable?
    DisruptionBarrierRange(true),           // todo: determine use, probably ECM, moddable?
    DistributorDraw(false),                 // (*) base module stat (multiple)
    DroneFuelCapacity(true),                // base limpet drone stat
    DroneHackingTime(false),                // base limpet drone stat
    DroneLifeTime(true),                    // base limpet drone stat
    DroneMaxJettisonedCargo(true),          // base limpet drone stat
    DroneMinJettisonedCargo(true),          // base limpet drone stat
    DroneMultiTargetSpeed(true),            // base limpet drone stat
    DroneRepairCapacity(true),              // base limpet drone stat
    DroneSpeed(true),                       // base limpet drone stat
    DroneTargetRange(true),                 // base limpet drone stat
    DSS_AngleMult(true),                    // (*) base detailed surface scanner stat
    DSS_RangeMult(true),                    // (*) base detailed surface scanner stat
    DSS_RateMult(true),                     // (*) base detailed surface scanner stat

    ECMActivePowerConsumption(false),       // base ECM stat
    ECMCooldown(false),                     // base ECM stat
    ECMHeat(false),                         // base ECM stat
    ECMRange(true),                         // base ECM stat
    ECMTimeToCharge(false),                 // base ECM stat
    EnergyPerRegen(true),                   // todo: determine use, probably SCB, moddable?
    EngineHeatRate(false),                  // base thruster stat
    EngineMaxPerformance(true),             // base thruster stat
    EngineMinimumMass(true),                // base thruster stat
    EngineMinPerformance(true),             // base thruster stat
    EngineOptimalMass(true),                // (*) base thruster stat
    EngineOptPerformance(true),             // (*) base thruster stat
    EnginesCapacity(true),                  // (*) base power distributor stat
    EnginesRecharge(true),                  // (*) base power distributor stat
    ExplosiveResistance(true),              // (*) base module stat (multiple)

    FalloffRange(true),                     // (*) base weapon stat (multiple)
    FighterBoostSpeed(true),                // base SLF stat
    FighterDPS(true),                       // base SLF stat
    FighterMaxSpeed(true),                  // base SLF stat
    FighterPitchRate(true),                 // base SLF stat
    FighterRollRate(true),                  // base SLF stat
    FighterYawRate(true),                   // base SLF stat
    FSDFuelUseIncrease(true),               // todo: determine exact use, maybe guardian fsd booster?
    FSDHeatRate(false),                     // base FSD stat
    FSDInterdictorFacingLimit(true),        // (*) base FSD interdictor stat
    FSDInterdictorRange(true),              // (*) base FSD interdictor stat
    FSDJumpRangeBoost(true),                // (*) "jumponium" range boost stat
    FSDOptimalMass(true),                   // (*) base FSD stat
    FuelCapacity(true),                     // base fuel tank stat
    FuelScoopRate(true),                    // base fuel scoop rate

    HeatEfficiency(false),                  // (*) base power plant stat
    HeatSinkDuration(true),                 // base heat sink launcher stat

    Integrity(true),                        // (*) base module stat (multiple)

    Jitter(false),                          // (*) engineer weapon stat

    KineticResistance(true),                // (*) base module stat (multiple)

    Mass(false),                            // (*) base module stat (multiple)
    MaxActiveDrones(true),                  // base limpet controller stat
    MaxAngle(true),                         // todo: determine use, probably scanners, moddable?
    MaxBreachChance(true),                  // todo: determine use, probably hatch breaker, moddable?
    MaxFuelPerJump(true),                   // (*) base FSD stat
    MaximumMass(true),                      // (*) base module stat (multiple?) todo: determine which modules use this
    MaximumRange(true),                     // todo: determine use, probably sensors, moddable?
    MaxRange(true),                         // todo: determine use, probably sensors, moddable? alias of above?
    MinBreachChance(true),                  // todo: determine use, probably hatch breaker, moddable?
    ModuleDefenceAbsorption(true),          // made module reinforcement stat

    NumBuggySlots(true),                    // base SRV hangar stat

    OxygenTimeCapacity(true),               // base life support stat

    PowerCapacity(true),                    // (*) base module stat (power plant)
    PowerDraw(false),                       // (*) base module stat (multiple)

    Range(true),                            // (*) base module stat (multiple?) todo: determine which modules use this
    RateOfFire(true),                       // (*) base weapon stat (multiple)
    RefineryBins(true),                     // base refinery stat
    RegenRate(true),                        // base shield stat
    ReloadTime(false),                      // base weapon stat (multiple)
    RoundsPerShot(true),                    // todo: determine use, probably weapons, moddable?

    ScannerRange(true),                     // (*) base scanner stat (multiple?) todo: determine which modules use this
    ScannerTimeToScan(false),               // (*) base scanner stat
    SensorTargetScanAngle(true),            // todo: determine use, probably sensors, moddable?
    ShieldBankDuration(true),               // (*) base SCB stat
    ShieldBankHeat(false),                  // (*) base SCB stat
    ShieldBankReinforcement(true),          // (*) base SCB stat
    ShieldBankSpinUp(false),                // (*) base SCB stat
    ShieldGenMaximumMass(true),             // base shield stat
    ShieldGenMaxStrength(true),             // base shield stat
    ShieldGenMinimumMass(true),             // base shield stat
    ShieldGenMinStrength(true),             // base shield stat
    ShieldGenOptimalMass(true),             // base shield stat
    ShieldGenStrength(true),                // base shield stat
    ShieldSacrificeAmountGiven(true),       // todo: determine use, probably shields, moddable?
    ShieldSacrificeAmountRemoved(true),     // todo: determine use, probably shields, moddable?
    ShotSpeed(true),                        // (*) base weapon stat
    Size(true),                             // base module stat (multiple)
    SystemsCapacity(true),                  // (*) base module stat (distributor)
    SystemsRecharge(true),                  // (*) base module stat (distributor)

    ThermalDrain(false),                    // todo: determine use, moddable?
    ThermalLoad(false),                     // (*) base module stat (multiple)
    ThermicResistance(true),                // (*) base module stat (multiple)

    VehicleArmourHealth(true),              // todo: determine use, probably SRV, moddable?
    VehicleCargoCapacity(true),             // todo: determine use, probably SRV, moddable?
    VehicleFuelCapacity(true),              // todo: determine use, probably SRV, moddable?
    VehicleHullMass(true),                  // todo: determine use, probably SRV, moddable?
    VehicleShieldHealth(true),              // todo: determine use, probably SRV, moddable?

    WeaponMode(true),                       // base weapon stat (multiple)
    WeaponsCapacity(true),                  // (*) base module stat (distributor)
    WeaponsRecharge(true),                  // (*) base module stat (distributor)
    WingDamageReduction(true),              // todo: determine use, moddable?
    WingMaxDuration(true),                  // todo: determine use, moddable?
    WingMinDuration(true),                  // todo: determine use, moddable?



    // synthetic effects, used for synthesis recipes
    rearm(true),                // ammunition replenishment
    refuel(true),               // fuel replenishment
    repair(true),               // srv repair
    refill(true),               // non-damage ammunition replenishment
    repair_speed(true),         // afmu speed
    damage_boost(true),         // ammo damage boost
    fuel_efficiency(true),      // srv fuel
    hull_strength(true),        // srv hull
    heat_dissipation(false),    // heat sink refill


    // synthetic effects, used for tech broker weapons effects
    enzyme_munitions(true),
    meta_alloy_reinforcement(true),
    remote_release_shell(true),
    shock_shell(true),
    fsd_boost(true),
    gauss_shell(true),
    hybrid_power(true),
    plasma_weapon(true),
    shard_shell(true),


    // synthetic effects, used for experimental engineer effects
    area_fsd_reboot(true),
    area_heat_increased_sensors_disrupted(true),
    auto_reload_while_firing(true),
    damage_increases_with_heat_level(true),
    damage_partially_explosive(true),
    damage_partially_kinetic(true),
    damage_partially_thermal(true),
    effectiveness_increase_against_munitions(true),
    heat_reduced_when_striking_target(true),
    no_damage_to_untargeted_ships(true),
    part_of_damage_through_shields(true),
    reload_from_ship_fuel(true),
    shielded_target_heat_increased(true),
    target_armor_hardness_reduced(true),
    target_fsd_inhibited(true),
    target_fsd_reboot(true),
    target_heat_increased(true),
    target_loses_target_lock(true),
    target_module_damage(true),
    target_module_malfunction(true),
    target_pushed_off_course(true),
    target_sensor_acuity_reduced(true),
    target_shield_cell_disrupted(true),
    target_shield_generator_damaged(true),
    target_signature_increased(true),
    target_speed_reduced(true),
    target_thrusters_reboot(true),
    target_tracking_reduced(true),
    target_wing_shield_regeneration(true),
    wing_shield_regeneration_increased(true);

    private final boolean moreIsGood;

    ItemEffect(boolean moreIsGood)
    {
        this.moreIsGood = moreIsGood;
    }

    public boolean isMoreGood()
    {
        return moreIsGood;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
