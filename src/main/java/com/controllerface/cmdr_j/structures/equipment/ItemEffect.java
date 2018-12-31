package com.controllerface.cmdr_j.structures.equipment;

import com.controllerface.cmdr_j.ui.UIFunctions;

/**
 * ALl possible item effects, both modifiable/experimental and base stats are represented. In some cases, an effect IS
 * a base stat this can also be modified (ex: ammo clip size on Multi-cannons and the High Capacity mod) and in others,
 * the effect is only available via mod or experimental effect (ex: wing shield regen on Regeneration sequence effect).
 *
 * There are also a few "synthetic" effects in this list that are not actually found in the journal API, but are used
 * here to make integration with certain components easier. For example, the "Rearm" effect is present on all synthesis
 * recipes that restore ammo for a weapon. This effect serves mainly as an indicator to the user of the effect of the
 * recipe when viewing it in the UI.
 *
 * NOTE: DO NOT RENAME THESE ENUM VALUES*
 *
 * Created by Controllerface on 4/6/2018.
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
    MaxAngle(UIFunctions.Symbols.DEGREES, "Max Angle", true),
    MaximumRange("M", "Maximum Range", true),
    MaxRange("M", "Max Range", true), // todo: determine use, probably sensors, moddable? alias of above?

    /*
    Different stats with same display names are grouped together ensuring they display uniformly when sorted by
    enum ordinal
     */

    ShieldBankHeat("H/S", "Thermal Load", false),
    EngineHeatRate("H/MW", "Thermal Load", false),
    FSDHeatRate("H/MW", "Thermal Load", false),

    EngineMinimumMass("T", "Minimum Mass", true),
    ShieldGenMinimumMass("T", "Minimum Mass", true),

    ShieldGenOptimalMass("T", "Optimal Mass", true),
    EngineOptimalMass("T", "Optimal Mass", true),
    FSDOptimalMass("T", "Optimised Mass", true),

    MaximumMass("T", "Maximum Mass", true),
    ShieldGenMaximumMass("T", "Maximum Mass", true),


    /*
    Offense
     */

    WeaponMode("", "Weapon Mode", true),
    DamageType("", "Damage Type", true),
    Damage("", "Damage", true),
    DamageFalloffRange("M", "Damage Falloff Range", true),

    AmmoClipSize("", "Clip Size", true),
    AmmoMaximum("", "Ammo Max", true),
    ArmourPenetration("", "Piercing", true),
    BreachDamage("", "Breach Damage", true),
    MaxBreachChance("%", "Maximum Beach Chance", true),
    MinBreachChance("%", "Minimum Beach Chance", true),
    RateOfFire("/S", "Rate of Fire", true),
    BurstRateOfFire("","Burst Rate of Fire", true),
    BurstSize("", "Burst Size", true),
    DamagePerSecond("/S", "Damage per Second", true),
    FalloffRange("M", "Falloff Range", true),
    Jitter(UIFunctions.Symbols.DEGREES,"Jitter", false),
    ReloadTime("S", "Reload Time", false),
    RoundsPerShot("", "Rounds per Shot", true),
    ShotSpeed("M/S","Shot Speed", true),


    /*
    General Defense
     */

    DefenceModifierHealthAddition("", "Hull Reinforcement", true),
    DefenceModifierHealthMultiplier("%", "Hull Boost", true),
    DefenceModifierShieldAddition("MJ", "Shield Reinforcement", true),
    DefenceModifierShieldMultiplier("%", "Shield Boost", true),
    ModuleDefenceAbsorption("%", "Damage Protection", true),

    /*
    Shield Generator
     */

    RegenRate("MJ/S", "Regen Rate", true),
    BrokenRegenRate("MJ/S", "Broken Regen rate", true),
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
    HeatEfficiency("H/MW/S", "Heat Efficiency", false),


    /*
    Thrusters
     */

    EngineMinPerformance("%", "Minimum Multiplier", true),
    EngineOptPerformance("%", "Optimal Multiplier", true),
    EngineMaxPerformance("%", "Maximum Multiplier", true),


    /*
    Frame Shift Drive
     */

    FSDFuelUseIncrease("", "", true),
    FSDJumpRangeBoost("LY", "Jump Range Increase", true),
    MaxFuelPerJump("T", "Maximum Fuel per Jump" ,true),


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

    NumBuggySlots("", "Hangar Bays", true),
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
    DSS_AngleMult("%", "Scan Angle Increase", true),
    DSS_RangeMult("%", "Scan Range Increase", true),
    DSS_RateMult("%", "Scan Rate Increase", true),
    DSS_PatchRadius("%", "Probe Radius", true),
    FSDInterdictorFacingLimit(UIFunctions.Symbols.DEGREES, "Facing Limit", true),
    FSDInterdictorRange("S", "Range", true),
    ScannerRange("M", "Range", true),
    ScannerTimeToScan("S", "Time to Scan", false),
    SensorTargetScanAngle(UIFunctions.Symbols.DEGREES, "Max Angle", true),


    /*
    Drones/Limpets
     */

    MaxActiveDrones("", "Maximum Active Drones", true),
    DroneLifeTime("S", "Drone Lifespan", true),
    DroneTargetRange("M", "Drone Target Range", true),
    DroneSpeed("M/S", "Speed", true),
    DroneMultiTargetSpeed("M/S", "Multi-Target Speed", true),
    DroneFuelCapacity("T", "Fuel Capacity", true),
    DroneHackingTime("S", "Hacking Time", false),
    DroneMinJettisonedCargo("T", "Minimum Dropped Cargo", true),
    DroneMaxJettisonedCargo("T", "Maximum Dropped Cargo", true),
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
    ThermalDrain("H/S", "Thermal Drain", true),


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

    WingDamageReduction("", "", true),              // todo: determine use, moddable?
    WingMaxDuration("", "", true),                  // todo: determine use, moddable?
    WingMinDuration("", "", true),                  // todo: determine use, moddable?


    /*
    The enum values below can be renamed, they are "synthetic" in the sense that there is no "Frontier provided" value
    that they map to. They are simply present in this class to facilitate adding displayable effect labels other than
    those that Frontier does provide. This is useful for a few cases where an item has no effect on any of the above
    enumerated stats, for example basic ammo synthesis.
     */

    // placeholder effects for certain modules that don't have intrinsic effects, but need something to display
    empty("-","Empty Compartment", true), // used for the "empty" module so it doesn't look odd
    planetary_approach("","Planetary Approach and Landing Capabilities", true), // planetary approach suite
    guardian("", "", true),              //is a guardian module

    // synthetic effects, used for synthesis recipes
    Rearm("", "", true),                // ammunition replenishment
    Refuel("", "", true),               // fuel replenishment
    Repair("", "", true),               // srv Repair
    Refill("", "", true),               // non-damage ammunition replenishment
    Repair_Speed("", "", true),         // afmu speed
    Damage_Boost("", "", true),         // ammo damage boost
    Fuel_Efficiency("", "", true),      // srv fuel
    Hull_Strength("", "", true),        // srv hull
    Heat_Dissipation("", "", false),    // heat sink refill

    // synthetic effects, used for tech broker weapons effects
    Enzyme_Munitions("", "", true),
    Meta_Alloy_Reinforcement("", "", true),
    Remote_Release_Shell("", "", true),
    Shock_Shell("", "", true),
    FSD_Boost("", "", true),
    Gauss_Shell("", "", true),
    Hybrid_Power("", "", true),
    Plasma_Weapon("", "", true),
    Shard_Shell("", "", true),
    Damage_Multiplier_at_Full_Charge("", "", true),

    // synthetic effects, used for experimental engineer effects
    Area_FSD_Reboot("", "", true),
    Area_Heat_Increased_Sensors_Disrupted("", "", true),
    Auto_Reload_While_Firing("", "", true),
    Damage_Increases_with_Heat_Level("", "", true),
    Damage_Partially_Explosive("", "", true),
    Damage_Partially_Kinetic("", "", true),
    Damage_Partially_Thermal("", "", true),
    Effectiveness_Increase_Against_Munitions("", "", true),
    Heat_Reduced_when_Striking_Target("", "", true),
    No_Damage_to_Untargeted_Ships("", "", true),
    Part_of_Damage_Through_Shields("", "", true),
    Reload_from_Ship_Fuel("", "", true),
    Shielded_Target_Heat_Increased("", "", true),
    Target_Armor_Hardness_Reduced("", "", true),
    Target_FSD_Inhibited("", "", true),
    Target_FSD_Reboot("", "", true),
    Target_Heat_Increased("", "", true),
    Target_Loses_Target_Lock("", "", true),
    Target_Module_Damage("", "", true),
    Target_Module_Malfunction("", "", true),
    Target_Pushed_Off_Course("", "", true),
    Target_Sensor_Acuity_Reduced("", "", true),
    Target_Shield_Cell_Disrupted("", "", true),
    Target_Shield_Generator_Damaged("", "", true),
    Target_Signature_Increased("", "", true),
    Target_Speed_Reduced("", "", true),
    Target_Thrusters_Reboot("", "", true),
    Target_Tracking_Reduced("", "", true),
    Target_Wing_Shield_Regeneration("", "", true),
    Wing_Shield_Regeneration_Increased("", "", true),

    ;

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
