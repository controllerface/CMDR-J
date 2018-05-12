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
 * NOTE: DO NOT RENAME THESE ENUM VALUES*
 *
 * Created by Stephen on 4/6/2018.
 */
public enum ItemEffect
{
    /*
    Common Stats
     */
    Size("", "", true),                                 // base module stat (multiple)
    Class("", "", true),                                // base module stat (multiple)
    Mass("T","", false),                                // (*) base module stat (multiple)
    Integrity("", "", true),                            // (*) base module stat (multiple)
    Range("M", "", true),                                // (*) base module stat (multiple)
    BootTime("S", "Boot Time", false),               // (*) base module stat (multiple)
    DistributorDraw("MW", "Distributor Draw", false), // (*) base module stat (multiple)
    PowerDraw("MW", "Power Draw", false),             // (*) base module stat (multiple)
    ThermalLoad("", "Thermal Load", false),         // (*) base module stat (multiple)
    MaxAngle("°", "Max Angle", true),                // todo: determine use, probably scanners, moddable?
    MaximumRange("M", "Maximum Range", true),        // todo: determine use, probably sensors, moddable?
    MaxRange("M", "Max Range", true),                // todo: determine use, probably sensors, moddable? alias of above?



    /*
    Different stats with same display names are grouped together ensuring they display uniformly when sorted by
    enum ordinal
     */

    ShieldBankHeat("H/S", "Heat Generation", false),               // (*) base SCB stat
    EngineHeatRate("H/MW", "Heat Generation", false),           // base thruster stat
    FSDHeatRate("H/MW", "Heat Generation", false),  // base FSD stat


    EngineMinimumMass("T", "Minimum Mass", true),            // base thruster stat
    ShieldGenMinimumMass("T", "Minimum Mass", true),     // base shield stat
    MaximumMass("T", "Maximum Mass", true),          // (*) base module stat (multiple?) todo: determine which modules use this
    ShieldGenMaximumMass("T", "Maximum Mass", true),     // base shield stat
    ShieldGenOptimalMass("T", "Optimal Mass", true),     // base shield stat
    EngineOptimalMass("T", "Optimal Mass", true),            // (*) base thruster stat
    FSDOptimalMass("T", "Optimal Mass", true),   // (*) base FSD stat



    /*
    Offense
     */

    AmmoClipSize("", "Clip Size", true),                    // (*) base Weapon stat (multiple)
    AmmoMaximum("", "Ammo Max", true),                      // (*) base Weapon stat (multiple)
    ArmourPenetration("", "Piercing", true),                // (*) base Weapon stat (multiple)
    BreachDamage("", "Breach Damage", true),                // todo: determine exact use
    MaxBreachChance("%", "", true),                              // todo: determine exact use
    MinBreachChance("%", "", true),                              // todo: determine exact use
    BurstRateOfFire("/S","Burst Rate", true),                // (*) base weapon stat (burst lasers)
    BurstSize("", "Burst Size", true),                      // (*) base weapon stat (burst lasers)
    Damage("", "Damage", true),                             // (*) base weapon stat (multiple)
    DamageFalloffRange("M", "Damage Falloff Range", true),   // base weapon stat (multiple)
    DamagePerSecond("/S", "DPS", true),                       // (*) base weapon stat (multiple)
    DamageType("", "Damage Type", true),                    // base weapon stat (multiple)
    FalloffRange("M", "Falloff Range", true),                // (*) base weapon stat (multiple)
    Jitter("°","Jitter", false),                                      // (*) engineer weapon stat
    RateOfFire("/S", "Rate of Fire", true),                   // (*) base weapon stat (multiple)
    ReloadTime("S", "Reload Time", false),                   // base weapon stat (multiple)
    RoundsPerShot("", "Rounds per Shot", true),             // todo: determine use, probably weapons, moddable?
    ShotSpeed("M/S","Shot Speed", true),                      // (*) base weapon stat
    WeaponMode("", "Weapon Mode", true),                    // base weapon stat (multiple)


    /*
    General Defense
     */

    DefenceModifierHealthAddition("", "Hull Reinforcement", true),      // (*) base hull reinforcement stat
    DefenceModifierHealthMultiplier("%", "Hull Boost", true),            // (*) base armour stat
    DefenceModifierShieldAddition("", "Optimal Strength", true),        // (*) base shield booster stat
    DefenceModifierShieldMultiplier("%", "Optimal Multiplier", true),    // (*) base shield stat
    ModuleDefenceAbsorption("", "", true),                                  // made module reinforcement stat

    /*
    Shield Generator
     */

    BrokenRegenRate("MJ/S", "Broken Regen rate", true),     // (*) base shield stat
    RegenRate("MJ/S", "Regen Rate", true),                  // base shield stat
    ShieldGenMaxStrength("MJ", "Maximum Strength", true), // base shield stat
    ShieldGenMinStrength("MJ", "Minimum Strength", true), // base shield stat
    ShieldGenStrength("MJ", "Strength", true),            // base shield stat


    /*
    Shield Cell Bank
     */

    ShieldBankDuration("S", "Duration", true),                   // (*) base SCB stat
    ShieldBankReinforcement("MJ/S", "Shield Reinforcement", true),  // (*) base SCB stat
    ShieldBankSpinUp("S", "Spin-up Time", false),                // (*) base SCB stat

    /*
    Resistances
     */

    CausticResistance("%", "Caustic Resistance", true),      // (*) anti-xeno modifier
    ExplosiveResistance("%", "Explosive Resistance", true),  // (*) base module stat (multiple)
    KineticResistance("%", "Kinetic Resistance", true),      // (*) base module stat (multiple)
    ThermicResistance("%", "Thermal Resistance", true),      // (*) base module stat (multiple)


    /*
    Power Plant
     */

    PowerCapacity("MW", "Power Capacity", true),  // (*) base module stat (power plant)
    HeatEfficiency("H/MW", "Efficiency", false),    // (*) base power plant stat


    /*
    Thrusters
     */

    EngineMinPerformance("%", "Min Performance", true),      // base thruster stat
    EngineMaxPerformance("%", "Max Performance", true),      // base thruster stat
    EngineOptPerformance("%", "Optimal Performance", true),  // (*) base thruster stat


    /*
    Frame Shift Drive
     */

    FSDFuelUseIncrease("", "", true),               // todo: determine exact use, maybe guardian fsd booster?
    FSDJumpRangeBoost("", "", true),                // (*) "jumponium" range boost stat
    MaxFuelPerJump("T", "" ,true),                   // (*) base FSD stat


    /*
    Power Distributor
     */

    EnginesCapacity("MW", "Engines Capacity", true), // (*) base power distributor stat
    EnginesRecharge("MW/S", "Engines Recharge", true), // (*) base power distributor stat
    SystemsCapacity("MW", "Systems Capacity", true), // (*) base power distributor stat
    SystemsRecharge("MW/S", "Systems Recharge", true), // (*) base power distributor stat
    WeaponsCapacity("MW", "Weapons Capacity", true), // (*) base power distributor stat
    WeaponsRecharge("MW/S", "Weapons Recharge", true), // (*) base power distributor stat


    /*
    SRV
     */

    NumBuggySlots("", "SRV Bays", true),    // SRV hangar
    VehicleArmourHealth("", "", true),          // SRV?
    VehicleCargoCapacity("", "", true),         // SRV?
    VehicleFuelCapacity("", "", true),          // SRV?
    VehicleHullMass("", "", true),              // SRV?
    VehicleShieldHealth("", "", true),          // SRV?


    /*
    SLF
     */

    FighterBoostSpeed("", "", true),    // base SLF stat
    FighterDPS("", "", true),           // base SLF stat
    FighterMaxSpeed("", "", true),      // base SLF stat
    FighterPitchRate("", "", true),     // base SLF stat
    FighterRollRate("", "", true),      // base SLF stat
    FighterYawRate("", "", true),       // base SLF stat


    /*
    Sensors and Scanners
     */

    DiscoveryScannerPassiveRange("LS", "Passive Range", true),// base discovery scanner stat
    DiscoveryScannerRange("LS", "Range", true),               // base discovery scanner stat
    DSS_AngleMult("%", "", true),                                // (*) base detailed surface scanner stat
    DSS_RangeMult("%", "", true),                                // (*) base detailed surface scanner stat
    DSS_RateMult("%", "", true),                                 // (*) base detailed surface scanner stat
    FSDInterdictorFacingLimit("°", "Facing Limit", true),    // (*) base FSD interdictor stat
    FSDInterdictorRange("S", "Range", true),                 // (*) base FSD interdictor stat
    ScannerRange("M", "Range", true),                        // (*) base scanner stat (multiple?)
    ScannerTimeToScan("S", "Time to Scan", false),           // (*) base scanner stat
    SensorTargetScanAngle("°", "Max Angle", true),           // (*) base scanner stat (multiple?)


    /*
    Drones/Limpets
     */

    DroneFuelCapacity("", "", true),        // base limpet drone stat
    DroneHackingTime("", "", false),        // base limpet drone stat
    DroneLifeTime("", "", true),            // base limpet drone stat
    DroneMaxJettisonedCargo("", "", true),  // base limpet drone stat
    DroneMinJettisonedCargo("", "", true),  // base limpet drone stat
    DroneMultiTargetSpeed("", "", true),    // base limpet drone stat
    DroneRepairCapacity("", "", true),      // base limpet drone stat
    DroneSpeed("", "", true),               // base limpet drone stat
    DroneTargetRange("", "", true),         // base limpet drone stat
    MaxActiveDrones("", "", true),          // base limpet controller stat


    /*
    Automated Field Repair Unit
     */

    // todo: ensure AFMU "more is good" flags are correct
    AFMRepairCapacity("", "Repair Capacity", true),         // base AFMU stat
    AFMRepairConsumption("", "Repair Consumption", false),  // base AFMU stat
    AFMRepairPerAmmo("", "Repair per Ammo", true),          // base AFMU stat

    /*
    Electronic Counter Measures
     */
    ECMActivePowerConsumption("", "", false),   // base ECM stat
    ECMCooldown("", "", false),                 // base ECM stat
    ECMHeat("", "", false),                     // base ECM stat
    ECMRange("", "", true),                     // base ECM stat
    ECMTimeToCharge("", "", false),             // base ECM stat

    /*
    Passenger Cabins
     */

    CabinCapacity("", "Cabin Capacity", true),  // base passenger cabin stat
    CabinClass("", "Cabin Class", true),        // base passenger cabin stat

    /*
    Various Module Specific Stats
     */
    CargoCapacity("T", "Cargo Capacity", true),          // cargo rack
    ChaffJamDuration("S", "Chaff Duration", true),       // chaff launcher
    FuelCapacity("T", "Fuel Capacity", true),            // fuel tank
    FuelScoopRate("T/S","Scoop Rate", true),              // fuel scoop rate
    HeatSinkDuration("S","Duration", true),             // heat sink launcher
    OxygenTimeCapacity("S","Emergency Oxygen", true),   // life support
    RefineryBins("", "Refinery Bins", true),            // refinery



    /*
    As-yet-unknown stats
    todo: find out what these are for
     */

    BoostAugmenterPowerUse("", "", false),          // todo: determine use, probably thrusters, moddable?
    BoostSpeedMultiplier("", "", true),             // todo: determine use, probably thrusters, moddable?
    DisruptionBarrierActivePower("", "", true),     // todo: determine use, probably ECM, moddable?
    DisruptionBarrierChargeDuration("", "", true),  // todo: determine use, probably ECM, moddable?
    DisruptionBarrierCooldown("", "", false),       // todo: determine use, probably ECM, moddable?
    DisruptionBarrierRange("", "", true),           // todo: determine use, probably ECM, moddable?
    EnergyPerRegen("", "", true),                   // todo: determine use, probably SCB, moddable?
    ShieldSacrificeAmountGiven("", "", true),       // todo: determine use, probably shields, moddable?
    ShieldSacrificeAmountRemoved("", "", true),     // todo: determine use, probably shields, moddable?
    ThermalDrain("", "", false),                    // todo: determine use, moddable?
    WingDamageReduction("", "", true),              // todo: determine use, moddable?
    WingMaxDuration("", "", true),                  // todo: determine use, moddable?
    WingMinDuration("", "", true),                  // todo: determine use, moddable?


    /*
    The enum values below can be renamed, they are "synthetic" in the sense that there is no "Frontier provided" value
    that they map to. They are simply present in this class to facilitate adding displayable effect labels other than
    those that Frontier does provide. This is useful for a few cases where an item has no effect on any of the above
    enumerated stats, for example basic ammo synthesis.
     */

    // synthetic effects, used for synthesis recipes
    rearm("", "", true),                // ammunition replenishment
    refuel("", "", true),               // fuel replenishment
    repair("", "", true),               // srv repair
    refill("", "", true),               // non-damage ammunition replenishment
    repair_speed("", "", true),         // afmu speed
    damage_boost("", "", true),         // ammo damage boost
    fuel_efficiency("", "", true),      // srv fuel
    hull_strength("", "", true),        // srv hull
    heat_dissipation("", "", false),    // heat sink refill


    // synthetic effects, used for tech broker weapons effects
    enzyme_munitions("", "", true),
    meta_alloy_reinforcement("", "", true),
    remote_release_shell("", "", true),
    shock_shell("", "", true),
    fsd_boost("", "", true),
    gauss_shell("", "", true),
    hybrid_power("", "", true),
    plasma_weapon("", "", true),
    shard_shell("", "", true),


    // synthetic effects, used for experimental engineer effects
    area_fsd_reboot("", "", true),
    area_heat_increased_sensors_disrupted("", "", true),
    auto_reload_while_firing("", "", true),
    damage_increases_with_heat_level("", "", true),
    damage_partially_explosive("", "", true),
    damage_partially_kinetic("", "", true),
    damage_partially_thermal("", "", true),
    effectiveness_increase_against_munitions("", "", true),
    heat_reduced_when_striking_target("", "", true),
    no_damage_to_untargeted_ships("", "", true),
    part_of_damage_through_shields("", "", true),
    reload_from_ship_fuel("", "", true),
    shielded_target_heat_increased("", "", true),
    target_armor_hardness_reduced("", "", true),
    target_fsd_inhibited("", "", true),
    target_fsd_reboot("", "", true),
    target_heat_increased("", "", true),
    target_loses_target_lock("", "", true),
    target_module_damage("", "", true),
    target_module_malfunction("", "", true),
    target_pushed_off_course("", "", true),
    target_sensor_acuity_reduced("", "", true),
    target_shield_cell_disrupted("", "", true),
    target_shield_generator_damaged("", "", true),
    target_signature_increased("", "", true),
    target_speed_reduced("", "", true),
    target_thrusters_reboot("", "", true),
    target_tracking_reduced("", "", true),
    target_wing_shield_regeneration("", "", true),
    wing_shield_regeneration_increased("", "", true);

    private final boolean moreIsGood;
    private final String text;
    private final String unit;

    ItemEffect(String unit, String text, boolean moreIsGood)
    {
        this.unit = unit;
        this.text = text.isEmpty() ? name().replace("_"," ") : text;
        this.moreIsGood = moreIsGood;
    }

    public String getUnit()
    {
        return unit;
    }

    public boolean isMoreGood()
    {
        return moreIsGood;
    }

    @Override
    public String toString()
    {
        return text;
    }
}
