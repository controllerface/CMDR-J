package com.controllerface.cmdr_j.enums.equipment.modules.stats;

import com.controllerface.cmdr_j.utilities.UIFunctions;

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
    Percentage value versions of stats used for modifications and experimental effects where the modification
    change is a percentage instead of a flat value.
     */
    Mass_Percent("%","Mass", false),
    Integrity_Percent("%", "Integrity", true),
    Range_Percent("%", "Range", true),
    BootTime_Percent("%", "Boot Time", false),
    DistributorDraw_Percent("%", "Distributor Draw", false),
    PowerDraw_Percent("%", "Power Draw", false),
    ThermalLoad_Percent("%", "Thermal Load", false),
    EngineHeatRate_Percent("%", "Thermal Load", false),
    FSDHeatRate_Percent("%", "Thermal Load", false),
    ShieldGenOptimalMass_Percent("%", "Optimal Mass", true),
    EngineOptimalMass_Percent("%", "Optimal Mass", true),
    FSDOptimalMass_Percent("%", "Optimised Mass", true),
    Damage_Percent("%", "Damage", true),
    DamageFalloffRange_Percent("%", "Damage Falloff Range", true),
    AmmoClipSize_Percent("%", "Clip Size", true),
    AmmoMaximum_Percent("%", "Ammo Max", true),
    ArmourPenetration_Percent("%", "Piercing", true),
    RateOfFire_Percent("%", "Rate of Fire", true),
    BurstRateOfFire_Percent("%","Burst Rate of Fire", true),
    DamagePerSecond_Percent("%", "Damage per Second", true),
    ReloadTime_Percent("%", "Reload Time", false),
    ShotSpeed_Percent("%","Shot Speed", true),
    DefenceModifierHealthAddition_Percent("%", "Hull Reinforcement", true),
    RegenRate_Percent("%", "Regen Rate", true),
    BrokenRegenRate_Percent("%", "Broken Regen Rate", true),
    ShieldGenStrength_Percent("%", "Optimal Strength", true),
    ShieldBankDuration_Percent("%", "Duration", true),
    ShieldBankReinforcement_Percent("%", "Shield Reinforcement", true),
    ShieldBankSpinUp_Percent("%", "Spin-up Time", false),
    PowerCapacity_Percent("%", "Power Capacity", true),
    HeatEfficiency_Percent("%", "Heat Efficiency", false),
    MaxFuelPerJump_Percent("%", "Maximum Fuel per Jump" ,true),
    EnginesCapacity_Percent("%", "Engines Capacity", true),
    EnginesRecharge_Percent("%", "Engines Recharge", true),
    SystemsCapacity_Percent("%", "Systems Capacity", true),
    SystemsRecharge_Percent("%", "Systems Recharge", true),
    WeaponsCapacity_Percent("%", "Weapons Capacity", true),
    WeaponsRecharge_Percent("%", "Weapons Recharge", true),
    FSDInterdictorFacingLimit_Percent("%", "Facing Limit", true),
    ScannerTimeToScan_Percent("%", "Time to Scan", false),
    SensorTargetScanAngle_Percent("%", "Max Angle", true),

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

    WeaponMode("", "Weapon Mount", true),
    DamageType("", "Damage Type", true),
    Damage("", "Damage", true),
    MaximumRange("M", "Maximum Range", true),
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
    DefenceModifierShieldMultiplier("%", "Shield Boost", true),
    ModuleDefenceAbsorption("%", "Damage Protection", true),

    // guardian
    DefenceModifierShieldAddition("MJ", "Shield Reinforcement", true, EffectType.GUARDIAN),

    /*
    Shield Generator
     */

    RegenRate("MJ/S", "Regen Rate", true),
    BrokenRegenRate("MJ/S", "Broken Regen Rate", true),
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

    ExplosiveResistance("%", "Explosive Resistance", true),
    KineticResistance("%", "Kinetic Resistance", true),
    ThermicResistance("%", "Thermal Resistance", true),

    // ax
    CausticResistance("%", "Caustic Resistance", true, EffectType.ANTI_XENO),


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
    MaxFuelPerJump("T", "Maximum Fuel per Jump" ,true),

    // guardian
    FSDJumpRangeBoost("LY", "Jump Range Increase", true, EffectType.GUARDIAN),


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
    ECMTimeToCharge("S", "Charge Time", false),


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
    Thargoid Shutdown Field Neutralizer
     */
    Disruption_Barrier_Active_Power("", "Barrier Active Power Draw", true, EffectType.ANTI_XENO),
    Disruption_Barrier_Charge_Duration("", "Barrier Charge Time", true, EffectType.ANTI_XENO),
    Disruption_Barrier_Cooldown("", "Barrier Cool Down", false, EffectType.ANTI_XENO),
    Disruption_Barrier_Range("", "Barrier Range", true, EffectType.ANTI_XENO),


    /*
    Ground Gear
     */

    Weapon_Mod_Slots("", "Modification Slots", true, EffectType.STANDARD),
    Weapon_Headshot_Damage("x", "Headshot Damage", true, EffectType.STANDARD),
    Weapon_Effective_Range("M", "Effective Range", true, EffectType.STANDARD),
    Weapon_Fire_Mode("", "Firing Mode", true, EffectType.STANDARD),

    Suit_Shield_Regen("MJ/S", "Shield Regeneration Rate", true, EffectType.STANDARD),
    Suit_Shield_Capacity("MJ", "Shield Capacity", true, EffectType.STANDARD),
    Suit_Mod_Slots("", "Modification Slots", true, EffectType.STANDARD),


    Suit_Dual_Primary_Slots("", "Dual Primary Weapons", true, EffectType.EXPERIMENTAL),
    Suit_Exobiology_Scanner("", "Exobiology Scanner", true, EffectType.EXPERIMENTAL),
    Suit_Arc_Cutter("", "Arc Cutter", true, EffectType.EXPERIMENTAL),



    Air_Capacity("%", "Air Capacity", true, EffectType.MODIFICATION),
    Ammo_Capacity("%", "Ammo Capacity", true, EffectType.MODIFICATION),

    Weapon_Stability("%", "Weapon Stability", true, EffectType.MODIFICATION),
    Improved_Weapon_Handling("", "Improved Weapon Handling", true, EffectType.MODIFICATION),
    Improved_Weapon_Reload("", "Improved Weapon Reload", true, EffectType.MODIFICATION),
    Improved_Weapon_Range("", "Improved Weapon Range", true, EffectType.MODIFICATION),
    Improved_Weapon_Magazine("", "Improved Weapon Magazine", true, EffectType.MODIFICATION),
    Improved_Headshot_Damage("", "Improved Headshot Damage", true, EffectType.MODIFICATION),
    Improved_Hip_Fire_Accuracy("%", "Improved Hip Fire Accuracy", true, EffectType.MODIFICATION),

    Noise_Suppressor("", "Sound Suppressor (Pressurized)", true, EffectType.MODIFICATION),
    Audio_Mask("", "Sound Suppressor (Unpressurized)", true, EffectType.MODIFICATION),
    Quieter_Footsteps("", "Environmental Sound Dampening", true, EffectType.MODIFICATION),

    Stowed_Reloading("", "Stowed Reloading", true, EffectType.MODIFICATION),

    Negate_Movement_Penalty("", "Combat Movement Speed", true, EffectType.MODIFICATION),

    Enhanced_Scope("", "Enhanced Scope", true, EffectType.MODIFICATION),
    Night_Vision("", "Night Vision", true, EffectType.MODIFICATION),
    Jump_Assist("", "Jump Assist", true, EffectType.MODIFICATION),
    Sprint_Assist("", "Sprint Assist", true, EffectType.MODIFICATION),

    Shield_Health_Regen("%", "Shield Health Regen", true, EffectType.MODIFICATION),

    Backpack_Data_Capacity("%", "Backpack Data Capacity", true, EffectType.MODIFICATION),
    Backpack_Component_Capacity("%", "Backpack Component Capacity", true, EffectType.MODIFICATION),
    Backpack_Item_Capacity("%", "Backpack Item Capacity", true, EffectType.MODIFICATION),

    Backpack_Capacity("%", "Backpack Data Capacity", true, EffectType.MODIFICATION),

    Battery_Energy_Capacity("%", "Battery Energy Capacity", true, EffectType.MODIFICATION),
    Battery_Efficiency("%", "Increased Battery Efficiency", true, EffectType.MODIFICATION),

    Increased_Tracking_Range("%", "Analysis Range", true, EffectType.MODIFICATION),
    Increased_Tracking_Time("%", "Analysis Time", true, EffectType.MODIFICATION),

    Weapon_Melee_Damage_Multiplier("%", "Weapon Melee Damage", true, EffectType.MODIFICATION),
    Fists_Melee_Damage_Multiplier("%", "Fists Melee Damage", true, EffectType.MODIFICATION),

    Explosive_Damage_Resistance("%", "Explosive Resistance", true, EffectType.MODIFICATION),
    Plasma_Damage_Resistance("%", "Plasma Resistance", true, EffectType.MODIFICATION),
    Thermic_Damage_Resistance("%", "Thermic Resistance", true, EffectType.MODIFICATION),
    Kinetic_Damage_Resistance("%", "Kinetic Resistance", true, EffectType.MODIFICATION),




    /*
    As-yet-unknown stats
    todo: find out what these are for
     */

    BoostAugmenterPowerUse("", "", false),          // todo: determine use, probably thrusters, moddable?
    BoostSpeedMultiplier("", "", true),             // todo: determine use, probably thrusters, moddable?

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
    cockpit("","Starship Canopy", true),          // cockpit
    cargo_door("","Cargo Scoop", true),     // cargo bay door
    planetary_approach("","Landing Capability", true), // planetary approach suite
    planetary_disembark("","Disembark Capability", true), // planetary approach suite
    guardian("", "", true),              // is a guardian module
    human("", "", true),                 // is a experimental human tech broker module
    experimental("", "", true),          // is a experimental human (Aegis) module
    power_play("", "", true),            // is a power play unlocked module
    tech_unlock("", "Unlock Technology", true),           // used for tech broker unlock recipes
    engineer_unlock("", "Engineer Unlock", true),           // used for engineer progress

    // synthetic effects, used for synthesis recipes
    Rearm("", "", true),                       // ammunition replenishment
    Refuel("", "", true),                      // fuel replenishment
    Repair("", "", true),                      // srv Repair
    Refill("", "", true),                      // non-damage ammunition replenishment
    Limpet_Restock("max", "", true),                  // limpets restock
    Repair_Speed("%", "", true),               // afmu speed
    Damage_Boost("%", "", true),               // ammo damage boost
    Fuel_Efficiency("%", "", true),            // srv fuel
    Hull_Strength("%", "", true),              // srv hull
    Heat_Dissipation_Increase("%", "", false), // heat sink refill
    Chaff_Duration_Increase("S", "", true),    // chaff duration increase
    Jump_Range_Increase("%", "", true),        // jump range incerase


    // synthetic effects, used for tech broker items
    Anti_Xeno_Ammo_Compatible("", "", true, EffectType.ANTI_XENO),
    Hybrid_Power("", "", true, EffectType.GUARDIAN),
    Thargoid_Disruption_Protection("", "", true, EffectType.ANTI_XENO),
    Damage_Multiplier_at_Full_Charge("", "", true),
    Damage_Multiplier_guardian("", "Damage Multiplier at Full Charge", true, EffectType.GUARDIAN),

    // synthetic effect used for displaying mod progress as a stat in the stat table
    Modification_Progress("%","",true, EffectType.MODIFICATION),

    // synthetic effects, used for experimental engineer effects
    Area_FSD_Reboot("", "", true, EffectType.EXPERIMENTAL),
    Area_Heat_Increased_Sensors_Disrupted("", "", true, EffectType.EXPERIMENTAL),
    Auto_Reload_While_Firing("", "", true, EffectType.EXPERIMENTAL),
    Damage_Increases_with_Heat_Level("", "", true, EffectType.EXPERIMENTAL),
    Damage_Partially_Explosive("%", "", true, EffectType.EXPERIMENTAL),
    Damage_Partially_Kinetic("%", "", true, EffectType.EXPERIMENTAL),
    Damage_Partially_Thermal("%", "", true, EffectType.EXPERIMENTAL),
    Effectiveness_Increase_Against_Munitions("", "", true, EffectType.EXPERIMENTAL),
    Heat_Reduced_when_Striking_Target("", "", true, EffectType.EXPERIMENTAL),
    No_Damage_to_Untargeted_Ships("", "", true, EffectType.EXPERIMENTAL),
    Part_of_Damage_Through_Shields("%", "Bleed Damage", true, EffectType.EXPERIMENTAL),
    Reload_from_Ship_Fuel("", "", true, EffectType.EXPERIMENTAL),
    Shielded_Target_Heat_Increased("", "", true, EffectType.EXPERIMENTAL),
    Target_Armor_Hardness_Reduced("", "", true, EffectType.EXPERIMENTAL),
    Target_FSD_Inhibited("", "", true, EffectType.EXPERIMENTAL),
    Target_FSD_Reboot("", "", true, EffectType.EXPERIMENTAL),
    Target_Heat_Increased("", "", true, EffectType.EXPERIMENTAL),
    Target_Loses_Target_Lock("", "", true, EffectType.EXPERIMENTAL),
    Target_Module_Damage("", "", true, EffectType.EXPERIMENTAL),
    Target_Module_Malfunction("", "", true, EffectType.EXPERIMENTAL),
    Target_Pushed_Off_Course("", "", true, EffectType.EXPERIMENTAL),
    Target_Sensor_Acuity_Reduced("", "", true, EffectType.EXPERIMENTAL),
    Target_Shield_Cell_Disrupted("", "", true, EffectType.EXPERIMENTAL),
    Target_Shield_Generator_Damaged("", "", true, EffectType.EXPERIMENTAL),
    Target_Signature_Increased("", "", true, EffectType.EXPERIMENTAL),
    Target_Speed_Reduced("", "", true, EffectType.EXPERIMENTAL),
    Target_Thrusters_Reboot("", "", true, EffectType.EXPERIMENTAL),
    Target_Tracking_Reduced("", "", true, EffectType.EXPERIMENTAL),
    Target_Wing_Shield_Regeneration("", "", true, EffectType.EXPERIMENTAL),
    Wing_Shield_Regeneration_Increased("", "", true, EffectType.EXPERIMENTAL),

    ;

    /**
     * When an effect is defined, it can be of one of these types. The default constructor will use "standard"
     * and other types will be specified as needed. When the UI displays information about a given effect, it
     * will often use this type info to modify the color of text or graphics associated with the effect.
     */
    public enum EffectType
    {
        STANDARD,
        MODIFICATION,
        EXPERIMENTAL,
        ANTI_XENO,
        GUARDIAN
    }

    private final String text;

    public final boolean moreIsGood;
    public final String unit;
    public final EffectType effectType;

    ItemEffect(String unit, String text, boolean moreIsGood, EffectType effectType)
    {
        this.text = text.isEmpty()
                ? name().replace("_"," ")
                : text;

        this.unit = unit;
        this.moreIsGood = moreIsGood;
        this.effectType = effectType;
    }

    ItemEffect(String unit, String text, boolean moreIsGood)
    {
        this(unit, text, moreIsGood, EffectType.STANDARD);
    }

    @Override
    public String toString()
    {
        return text;
    }
}
