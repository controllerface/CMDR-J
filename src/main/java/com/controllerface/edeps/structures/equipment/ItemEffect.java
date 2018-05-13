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
 * NOTE: DO NOT RENAME THESE ENUM VALUES*
 *
 * Created by Stephen on 4/6/2018.
 */
public enum ItemEffect
{
    /*
    Common Stats
     */
    Size("", "", true),
    Class("", "", true),
    Mass("T","", false),
    Integrity("", "", true),
    Range("M", "", true),
    BootTime("S", "Boot Time", false),
    DistributorDraw("MW", "Distributor Draw", false),
    PowerDraw("MW", "Power Draw", false),
    ThermalLoad("", "Thermal Load", false),
    MaxAngle("°", "Max Angle", true),
    MaximumRange("M", "Maximum Range", true),
    MaxRange("M", "Max Range", true), // todo: determine use, probably sensors, moddable? alias of above?



    /*
    Different stats with same display names are grouped together ensuring they display uniformly when sorted by
    enum ordinal
     */

    ShieldBankHeat("H/S", "Heat Generation", false),
    EngineHeatRate("H/MW", "Heat Generation", false),
    FSDHeatRate("H/MW", "Heat Generation", false),


    EngineMinimumMass("T", "Minimum Mass", true),
    ShieldGenMinimumMass("T", "Minimum Mass", true),

    ShieldGenOptimalMass("T", "Optimal Mass", true),
    EngineOptimalMass("T", "Optimal Mass", true),
    FSDOptimalMass("T", "Optimal Mass", true),

    MaximumMass("T", "Maximum Mass", true),
    ShieldGenMaximumMass("T", "Maximum Mass", true),




    /*
    Offense
     */

    DamageType("", "Damage Type", true),
    Damage("", "Damage", true),
    DamageFalloffRange("M", "Damage Falloff Range", true),

    AmmoClipSize("", "Clip Size", true),
    AmmoMaximum("", "Ammo Max", true),
    ArmourPenetration("", "Piercing", true),
    BreachDamage("", "Breach Damage", true),
    MaxBreachChance("%", "", true),
    MinBreachChance("%", "", true),
    BurstRateOfFire("/S","Burst Rate", true),
    BurstSize("", "Burst Size", true),
    DamagePerSecond("/S", "DPS", true),
    FalloffRange("M", "Falloff Range", true),
    Jitter("°","Jitter", false),
    RateOfFire("/S", "Rate of Fire", true),
    ReloadTime("S", "Reload Time", false),
    RoundsPerShot("", "Rounds per Shot", true),
    ShotSpeed("M/S","Shot Speed", true),
    WeaponMode("", "Weapon Mode", true),


    /*
    General Defense
     */

    DefenceModifierHealthAddition("", "Hull Reinforcement", true),
    DefenceModifierHealthMultiplier("%", "Hull Boost", true),
    DefenceModifierShieldAddition("", "Optimal Strength", true),
    DefenceModifierShieldMultiplier("%", "Optimal Multiplier", true),
    ModuleDefenceAbsorption("%", "Damage Protection", true),

    /*
    Shield Generator
     */

    BrokenRegenRate("MJ/S", "Broken Regen rate", true),
    RegenRate("MJ/S", "Regen Rate", true),

    ShieldGenMinStrength("MJ", "Minimum Strength", true),
    ShieldGenStrength("MJ", "Optimal Strength", true),
    ShieldGenMaxStrength("MJ", "Maximum Strength", true),


    /*
    Shield Cell Bank
     */

    ShieldBankDuration("S", "Duration", true),
    ShieldBankReinforcement("MJ/S", "Shield Reinforcement", true),
    ShieldBankSpinUp("S", "Spin-up Time", false),

    /*
    Resistances
     */

    CausticResistance("%", "Caustic Resistance", true),
    ExplosiveResistance("%", "Explosive Resistance", true),
    KineticResistance("%", "Kinetic Resistance", true),
    ThermicResistance("%", "Thermal Resistance", true),


    /*
    Power Plant
     */

    PowerCapacity("MW", "Power Capacity", true),
    HeatEfficiency("H/MW/S", "Efficiency", false),


    /*
    Thrusters
     */

    EngineMinPerformance("%", "Min Performance", true),
    EngineOptPerformance("%", "Optimal Performance", true),
    EngineMaxPerformance("%", "Max Performance", true),


    /*
    Frame Shift Drive
     */

    FSDFuelUseIncrease("", "", true),
    FSDJumpRangeBoost("", "", true),
    MaxFuelPerJump("T", "" ,true),


    /*
    Power Distributor
     */

    EnginesCapacity("MW", "Engines Capacity", true),
    EnginesRecharge("MW/S", "Engines Recharge", true),
    SystemsCapacity("MW", "Systems Capacity", true),
    SystemsRecharge("MW/S", "Systems Recharge", true),
    WeaponsCapacity("MW", "Weapons Capacity", true),
    WeaponsRecharge("MW/S", "Weapons Recharge", true),


    /*
    SRV
     */

    NumBuggySlots("", "SRV Bays", true),
    VehicleArmourHealth("", "", true),
    VehicleCargoCapacity("", "", true),
    VehicleFuelCapacity("", "", true),
    VehicleHullMass("", "", true),
    VehicleShieldHealth("", "", true),


    /*
    SLF
     */

    FighterBoostSpeed("", "", true),
    FighterDPS("", "", true),
    FighterMaxSpeed("", "", true),
    FighterPitchRate("", "", true),
    FighterRollRate("", "", true),
    FighterYawRate("", "", true),


    /*
    Sensors and Scanners
     */

    DiscoveryScannerPassiveRange("LS", "Passive Range", true),
    DiscoveryScannerRange("LS", "Range", true),
    DSS_AngleMult("%", "", true),
    DSS_RangeMult("%", "", true),
    DSS_RateMult("%", "", true),
    FSDInterdictorFacingLimit("°", "Facing Limit", true),
    FSDInterdictorRange("S", "Range", true),
    ScannerRange("M", "Range", true),
    ScannerTimeToScan("S", "Time to Scan", false),
    SensorTargetScanAngle("°", "Max Angle", true),


    /*
    Drones/Limpets
     */

    MaxActiveDrones("", "Max. Active Drones", true),
    DroneLifeTime("S", "Drone Lifespan", true),
    DroneTargetRange("M", "Drone Target Range", true),
    DroneSpeed("M/S", "Speed", true),
    DroneMultiTargetSpeed("M/S", "Multi-Target Speed", true),
    DroneFuelCapacity("", "", true),
    DroneHackingTime("", "", false),
    DroneMaxJettisonedCargo("", "", true),
    DroneMinJettisonedCargo("", "", true),
    DroneRepairCapacity("", "Repair Capacity", true),



    /*
    Automated Field Repair Unit
     */


    AFMRepairCapacity("", "Repair Capacity", true),
    AFMRepairConsumption("A/S", "Repair Consumption", false),
    AFMRepairPerAmmo("R/A", "Repair Rating", true),

    /*
    Electronic Counter Measures
     */
    ECMActivePowerConsumption("", "", false),
    ECMCooldown("", "", false),
    ECMHeat("", "", false),
    ECMRange("", "", true),
    ECMTimeToCharge("", "", false),

    /*
    Passenger Cabins
     */

    CabinCapacity("", "Cabin Capacity", true),
    CabinClass("", "Cabin Class", true),

    /*
    Various Module Specific Stats
     */
    CargoCapacity("T", "Cargo Capacity", true),
    ChaffJamDuration("S", "Chaff Duration", true),
    FuelCapacity("T", "Fuel Capacity", true),
    FuelScoopRate("T/S","Scoop Rate", true),
    HeatSinkDuration("S","Duration", true),
    OxygenTimeCapacity("S","Emergency Oxygen", true),
    RefineryBins("Bins", "Refinery Bins", true),



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
