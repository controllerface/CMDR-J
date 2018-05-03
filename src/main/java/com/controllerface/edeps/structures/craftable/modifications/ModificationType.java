package com.controllerface.edeps.structures.craftable.modifications;

import com.controllerface.edeps.ProcurementType;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ModificationType implements ProcurementType
{
    // weapons
    Beam_Laser(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy),

    Burst_Laser(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy),

    Pulse_Laser(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy),

    Cannon(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy),

    Multi_Cannon(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy),

    Fragment_Cannon(ModificationBlueprint.Weapon_DoubleShot,
            ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy),

    Missile_Rack(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy),

    Seeker_Missile_Rack(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy),

    Torpedo_Pylon(ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_Sturdy),

    Mine_Launcher(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy),

    Plasma_Accelerator(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy),

    Rail_Gun(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy),

    // util
    Chaff_Launcher(ModificationBlueprint.ChaffLauncher_ChaffCapacity,
            ModificationBlueprint.ChaffLauncher_LightWeight,
            ModificationBlueprint.ChaffLauncher_Reinforced,
            ModificationBlueprint.ChaffLauncher_Shielded),

    Heat_Sink_Launcher(ModificationBlueprint.HeatSinkLauncher_HeatSinkCapacity,
            ModificationBlueprint.HeatSinkLauncher_LightWeight,
            ModificationBlueprint.HeatSinkLauncher_Reinforced,
            ModificationBlueprint.HeatSinkLauncher_Shielded),

    Point_Defense(ModificationBlueprint.PointDefence_PointDefenseCapacity,
            ModificationBlueprint.PointDefence_LightWeight,
            ModificationBlueprint.PointDefence_Reinforced,
            ModificationBlueprint.PointDefence_Shielded),

    Electronic_Countermeasures(ModificationBlueprint.ECM_LightWeight,
            ModificationBlueprint.ECM_Reinforced,
            ModificationBlueprint.ECM_Shielded),

    Frame_Shift_Wake_Scanner(ModificationBlueprint.Sensor_WakeScanner_FastScan,
            ModificationBlueprint.WakeScanner_LightWeight,
            ModificationBlueprint.Sensor_WakeScanner_LongRange,
            ModificationBlueprint.WakeScanner_Reinforced,
            ModificationBlueprint.WakeScanner_Shielded,
            ModificationBlueprint.Sensor_WakeScanner_WideSensorTargetScanAngle),

    Kill_Warrant_Scanner(ModificationBlueprint.Sensor_KillWarrantScanner_FastScan,
            ModificationBlueprint.KillWarrantScanner_LightWeight,
            ModificationBlueprint.KillWarrantScanner_LongRange,
            ModificationBlueprint.KillWarrantScanner_Reinforced,
            ModificationBlueprint.KillWarrantScanner_Shielded,
            ModificationBlueprint.Sensor_KillWarrantScanner_WideSensorTargetScanAngle),

    Manifest_Scanner(ModificationBlueprint.Sensor_CargoScanner_FastScan,
            ModificationBlueprint.CargoScanner_LightWeight,
            ModificationBlueprint.Sensor_CargoScanner_LongRange,
            ModificationBlueprint.CargoScanner_Reinforced,
            ModificationBlueprint.CargoScanner_Shielded,
            ModificationBlueprint.Sensor_CargoScanner_WideSensorTargetScanAngle),

    Shield_Booster(ModificationBlueprint.DefenceModifierShieldAdditioner_Explosive,
            ModificationBlueprint.DefenceModifierShieldAdditioner_HeavyDuty,
            ModificationBlueprint.DefenceModifierShieldAdditioner_Kinetic,
            ModificationBlueprint.DefenceModifierShieldAdditioner_Resistive,
            ModificationBlueprint.DefenceModifierShieldAdditioner_Thermic),

    // optional
    Auto_Field_Maintenence_Unit(ModificationBlueprint.AFM_Shielded),

    Hull_Reinforcement_Package(ModificationBlueprint.HullReinforcement_Explosive,
            ModificationBlueprint.HullReinforcement_Kinetic,
            ModificationBlueprint.HullReinforcement_Thermic,
            ModificationBlueprint.HullReinforcement_Advanced,
            ModificationBlueprint.HullReinforcement_HeavyDuty),

    Detailed_Surface_Scanner(ModificationBlueprint.Sensor_SurfaceScanner_FastScan,
            ModificationBlueprint.Sensor_SurfaceScanner_LongRange,
            ModificationBlueprint.Sensor_SurfaceScanner_WideSensorTargetScanAngle),

    Refinery(ModificationBlueprint.Refineries_Shielded),

    Frame_Shift_Drive_Interdictor(ModificationBlueprint.FSDinterdictor_Expanded,
            ModificationBlueprint.FSDinterdictor_LongRange),

    Fuel_Scoop(ModificationBlueprint.FuelScoop_Shielded),

    Collector_Limpet_Controller(ModificationBlueprint.CollectionLimpet_LightWeight,
            ModificationBlueprint.CollectionLimpet_Reinforced,
            ModificationBlueprint.CollectionLimpet_Shielded),

    Prospector_Limpet_Controller(ModificationBlueprint.ProspectingLimpet_LightWeight,
            ModificationBlueprint.ProspectingLimpet_Reinforced,
            ModificationBlueprint.ProspectingLimpet_Shielded),

    Fuel_Transfer_Limpet(ModificationBlueprint.FuelTransferLimpet_LightWeight,
            ModificationBlueprint.FuelTransferLimpet_Reinforced,
            ModificationBlueprint.FuelTransferLimpet_Shielded),

    Hatch_Breaker_Limpet(ModificationBlueprint.HatchBreakerLimpet_LightWeight,
            ModificationBlueprint.HatchBreakerLimpet_Reinforced,
            ModificationBlueprint.HatchBreakerLimpet_Shielded),

    Shield_Cell_Bank(ModificationBlueprint.ShieldCellBank_Rapid,
            ModificationBlueprint.ShieldCellBank_Specialised),

    Shield_Generator(ModificationBlueprint.ShieldGenerator_Optimised,
            ModificationBlueprint.ShieldGenerator_Kinetic,
            ModificationBlueprint.ShieldGenerator_Reinforced,
            ModificationBlueprint.ShieldGenerator_Thermic),

    // core
    Frame_Shift_Drive(ModificationBlueprint.FSD_FastBoot,
            ModificationBlueprint.FSD_LongRange,
            ModificationBlueprint.FSD_Shielded),

    Life_Support(ModificationBlueprint.LifeSupport_LightWeight,
            ModificationBlueprint.LifeSupport_Reinforced,
            ModificationBlueprint.LifeSupport_Shielded),

    Power_Distributor(ModificationBlueprint.PowerDistributor_HighFrequency,
            ModificationBlueprint.PowerDistributor_HighCapacity,
            ModificationBlueprint.PowerDistributor_Shielded,
            ModificationBlueprint.PowerDistributor_PriorityEngines,
            ModificationBlueprint.PowerDistributor_PrioritySystems,
            ModificationBlueprint.PowerDistributor_PriorityWeapons),

    Power_Plant(ModificationBlueprint.PowerPlant_Armoured,
            ModificationBlueprint.PowerPlant_Stealth,
            ModificationBlueprint.PowerPlant_Boosted),

    Sensors(ModificationBlueprint.Sensor_Sensor_LightWeight,
            ModificationBlueprint.Sensor_Sensor_LongRange,
            ModificationBlueprint.Sensor_Sensor_WideSensorTargetScanAngle),

    Thrusters(ModificationBlueprint.Engine_Tuned,
            ModificationBlueprint.Engine_Dirty,
            ModificationBlueprint.Engine_Reinforced),

    Bulkheads(ModificationBlueprint.Armour_Advanced,
            ModificationBlueprint.Armour_HeavyDuty,
            ModificationBlueprint.Armour_Explosive,
            ModificationBlueprint.Armour_Kinetic,
            ModificationBlueprint.Armour_Thermic);

    private final ModificationBlueprint[] blueprints;

    ModificationType(ModificationBlueprint ... blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<ModificationBlueprint> blueprintStream()
    {
        return Arrays.stream(blueprints);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }

    @Override
    public String getName()
    {
        return name();
    }
}
