package com.controllerface.cmdr_j.structures.craftable.modifications;

import com.controllerface.cmdr_j.ProcurementBlueprint;
import com.controllerface.cmdr_j.ProcurementType;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
public enum ModificationType implements ProcurementType
{
    // weapons
    Beam_Laser(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Burst_Laser(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Pulse_Laser(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Cannon(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Multi_Cannon(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Fragment_Cannon(EnumSet.of(ModificationBlueprint.Weapon_DoubleShot,
            ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy)),

    Missile_Rack(EnumSet.of(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy)),

    Seeker_Missile_Rack(EnumSet.of(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy)),

    Torpedo_Pylon(EnumSet.of(ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_Sturdy)),

    Mine_Launcher(EnumSet.of(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_Sturdy)),

    Plasma_Accelerator(EnumSet.of(ModificationBlueprint.Weapon_Efficient,
            ModificationBlueprint.Weapon_Focused,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_Overcharged,
            ModificationBlueprint.Weapon_RapidFire,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    Rail_Gun(EnumSet.of(ModificationBlueprint.Weapon_HighCapacity,
            ModificationBlueprint.Weapon_LightWeight,
            ModificationBlueprint.Weapon_LongRange,
            ModificationBlueprint.Weapon_ShortRange,
            ModificationBlueprint.Weapon_Sturdy)),

    // util
    Chaff_Launcher(EnumSet.of(ModificationBlueprint.ChaffLauncher_ChaffCapacity,
            ModificationBlueprint.ChaffLauncher_LightWeight,
            ModificationBlueprint.ChaffLauncher_Reinforced,
            ModificationBlueprint.ChaffLauncher_Shielded)),

    Heat_Sink_Launcher(EnumSet.of(ModificationBlueprint.HeatSinkLauncher_HeatSinkCapacity,
            ModificationBlueprint.HeatSinkLauncher_LightWeight,
            ModificationBlueprint.HeatSinkLauncher_Reinforced,
            ModificationBlueprint.HeatSinkLauncher_Shielded)),

    Point_Defense(EnumSet.of(ModificationBlueprint.PointDefence_PointDefenseCapacity,
            ModificationBlueprint.PointDefence_LightWeight,
            ModificationBlueprint.PointDefence_Reinforced,
            ModificationBlueprint.PointDefence_Shielded)),

    Electronic_Countermeasures(EnumSet.of(ModificationBlueprint.ECM_LightWeight,
            ModificationBlueprint.ECM_Reinforced,
            ModificationBlueprint.ECM_Shielded)),

    Frame_Shift_Wake_Scanner(EnumSet.of(ModificationBlueprint.Sensor_WakeScanner_FastScan,
            ModificationBlueprint.WakeScanner_LightWeight,
            ModificationBlueprint.Sensor_WakeScanner_LongRange,
            ModificationBlueprint.WakeScanner_Reinforced,
            ModificationBlueprint.WakeScanner_Shielded,
            ModificationBlueprint.Sensor_WakeScanner_WideAngle)),

    Kill_Warrant_Scanner(EnumSet.of(ModificationBlueprint.Sensor_KillWarrantScanner_FastScan,
            ModificationBlueprint.KillWarrantScanner_LightWeight,
            ModificationBlueprint.KillWarrantScanner_LongRange,
            ModificationBlueprint.KillWarrantScanner_Reinforced,
            ModificationBlueprint.KillWarrantScanner_Shielded,
            ModificationBlueprint.Sensor_KillWarrantScanner_WideAngle)),

    Manifest_Scanner(EnumSet.of(ModificationBlueprint.Sensor_CargoScanner_FastScan,
            ModificationBlueprint.CargoScanner_LightWeight,
            ModificationBlueprint.Sensor_CargoScanner_LongRange,
            ModificationBlueprint.CargoScanner_Reinforced,
            ModificationBlueprint.CargoScanner_Shielded,
            ModificationBlueprint.Sensor_CargoScanner_WideAngle)),

    Shield_Booster(EnumSet.of(ModificationBlueprint.ShieldBooster_Explosive,
            ModificationBlueprint.ShieldBooster_HeavyDuty,
            ModificationBlueprint.ShieldBooster_Kinetic,
            ModificationBlueprint.ShieldBooster_Resistive,
            ModificationBlueprint.ShieldBooster_Thermic)),

    // optional
    Auto_Field_Maintenence_Unit(EnumSet.of(ModificationBlueprint.AFM_Shielded)),

    Hull_Reinforcement_Package(EnumSet.of(ModificationBlueprint.HullReinforcement_Explosive,
            ModificationBlueprint.HullReinforcement_Kinetic,
            ModificationBlueprint.HullReinforcement_Thermic,
            ModificationBlueprint.HullReinforcement_Advanced,
            ModificationBlueprint.HullReinforcement_HeavyDuty)),

    Detailed_Surface_Scanner(EnumSet.of(ModificationBlueprint.Sensor_FastScan,
            ModificationBlueprint.Sensor_SurfaceScanner_LongRange,
            ModificationBlueprint.Sensor_SurfaceScanner_WideAngle)),

    Refinery(EnumSet.of(ModificationBlueprint.Refineries_Shielded)),

    Frame_Shift_Drive_Interdictor(EnumSet.of(ModificationBlueprint.FSDinterdictor_Expanded,
            ModificationBlueprint.FSDinterdictor_LongRange)),

    Fuel_Scoop(EnumSet.of(ModificationBlueprint.FuelScoop_Shielded)),

    Collector_Limpet_Controller(EnumSet.of(ModificationBlueprint.CollectionLimpet_LightWeight,
            ModificationBlueprint.CollectionLimpet_Reinforced,
            ModificationBlueprint.CollectionLimpet_Shielded)),

    Prospector_Limpet_Controller(EnumSet.of(ModificationBlueprint.ProspectingLimpet_LightWeight,
            ModificationBlueprint.ProspectingLimpet_Reinforced,
            ModificationBlueprint.ProspectingLimpet_Shielded)),

    Fuel_Transfer_Limpet(EnumSet.of(ModificationBlueprint.FuelTransferLimpet_LightWeight,
            ModificationBlueprint.FuelTransferLimpet_Reinforced,
            ModificationBlueprint.FuelTransferLimpet_Shielded)),

    Hatch_Breaker_Limpet(EnumSet.of(ModificationBlueprint.HatchBreakerLimpet_LightWeight,
            ModificationBlueprint.HatchBreakerLimpet_Reinforced,
            ModificationBlueprint.HatchBreakerLimpet_Shielded)),

    Shield_Cell_Bank(EnumSet.of(ModificationBlueprint.ShieldCellBank_Rapid,
            ModificationBlueprint.ShieldCellBank_Specialised)),

    Shield_Generator(EnumSet.of(ModificationBlueprint.ShieldGenerator_Optimised,
            ModificationBlueprint.ShieldGenerator_Kinetic,
            ModificationBlueprint.ShieldGenerator_Reinforced,
            ModificationBlueprint.ShieldGenerator_Thermic)),

    // core
    Frame_Shift_Drive(EnumSet.of(ModificationBlueprint.FSD_FastBoot,
            ModificationBlueprint.FSD_LongRange,
            ModificationBlueprint.FSD_Shielded)),

    Life_Support(EnumSet.of(ModificationBlueprint.LifeSupport_LightWeight,
            ModificationBlueprint.LifeSupport_Reinforced,
            ModificationBlueprint.LifeSupport_Shielded)),

    Power_Distributor(EnumSet.of(ModificationBlueprint.PowerDistributor_HighFrequency,
            ModificationBlueprint.PowerDistributor_HighCapacity,
            ModificationBlueprint.PowerDistributor_Shielded,
            ModificationBlueprint.PowerDistributor_PriorityEngines,
            ModificationBlueprint.PowerDistributor_PrioritySystems,
            ModificationBlueprint.PowerDistributor_PriorityWeapons)),

    Power_Plant(EnumSet.of(ModificationBlueprint.PowerPlant_Armoured,
            ModificationBlueprint.PowerPlant_Stealth,
            ModificationBlueprint.PowerPlant_Boosted)),

    Sensors(EnumSet.of(ModificationBlueprint.Sensor_LightWeight,
            ModificationBlueprint.Sensor_LongRange,
            ModificationBlueprint.Sensor_WideAngle)),

    Thrusters(EnumSet.of(ModificationBlueprint.Engine_Tuned,
            ModificationBlueprint.Engine_Dirty,
            ModificationBlueprint.Engine_Reinforced)),

    Bulkheads(EnumSet.of(ModificationBlueprint.Armour_Advanced,
            ModificationBlueprint.Armour_HeavyDuty,
            ModificationBlueprint.Armour_Explosive,
            ModificationBlueprint.Armour_Kinetic,
            ModificationBlueprint.Armour_Thermic)),

    ;

    private final EnumSet<ModificationBlueprint> blueprints;

    ModificationType(EnumSet<ModificationBlueprint> blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<ModificationBlueprint> blueprintStream()
    {
        return blueprints.stream();
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

    @Override
    public List<ProcurementBlueprint> getBluePrints()
    {
        return new ArrayList<>(blueprints) ;
    }
}
