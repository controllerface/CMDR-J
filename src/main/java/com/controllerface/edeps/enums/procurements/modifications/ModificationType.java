package com.controllerface.edeps.enums.procurements.modifications;

import com.controllerface.edeps.ProcurementType;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ModificationType implements ProcurementType
{
    // weapons
    Beam_Laser(ModificationBlueprint.Efficient,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Long_Range_Small_Energy,
            ModificationBlueprint.Overcharged,
            ModificationBlueprint.Short_Range,
            ModificationBlueprint.Sturdy),

    Burst_Laser(ModificationBlueprint.Efficient,
            ModificationBlueprint.Focused,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Long_Range_Small_Energy,
            ModificationBlueprint.Overcharged,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Short_Range,
            ModificationBlueprint.Sturdy),

    Pulse_Laser(ModificationBlueprint.Efficient,
            ModificationBlueprint.Focused,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Long_Range_Small_Energy,
            ModificationBlueprint.Overcharged,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Short_Range,
            ModificationBlueprint.Sturdy),

    Cannon(ModificationBlueprint.Efficient,
            ModificationBlueprint.High_Capacity,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Long_Range_Large_Calibre,
            ModificationBlueprint.Overcharged,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Short_Range,
            ModificationBlueprint.Sturdy),

    Multi_Cannon(ModificationBlueprint.Efficient,
            ModificationBlueprint.High_Capacity,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Long_Range_Small_Energy,
            ModificationBlueprint.Overcharged_Multi_Cannon,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Short_Range,
            ModificationBlueprint.Sturdy),

    Fragment_Cannon(ModificationBlueprint.Double_Shot,
            ModificationBlueprint.Efficient,
            ModificationBlueprint.High_Capacity,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Overcharged,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Sturdy),

    Missile_Rack(ModificationBlueprint.High_Capacity,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Sturdy),

    Seeker_Missile_Rack(ModificationBlueprint.High_Capacity,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Sturdy),

    Torpedo_Pylon(ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Sturdy),

    Mine_Launcher(ModificationBlueprint.High_Capacity,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Sturdy),

    Plasma_Accelerator(ModificationBlueprint.Efficient,
            ModificationBlueprint.Focused,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Long_Range_Large_Calibre,
            ModificationBlueprint.Overcharged,
            ModificationBlueprint.Rapid_Fire,
            ModificationBlueprint.Short_Range,
            ModificationBlueprint.Sturdy),

    Rail_Gun(ModificationBlueprint.High_Capacity,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Long_Range_Small_Energy,
            ModificationBlueprint.Short_Range,
            ModificationBlueprint.Sturdy),

    // util
    Chaff_Launcher(ModificationBlueprint.Ammo_Capacity,
            ModificationBlueprint.Lightweight_Utility,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Heat_Sink_Launcher(ModificationBlueprint.Ammo_Capacity,
            ModificationBlueprint.Lightweight_Utility,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Point_Defense(ModificationBlueprint.Ammo_Capacity,
            ModificationBlueprint.Lightweight_Utility,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Electronic_Countermeasures(ModificationBlueprint.Lightweight_Utility,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Frame_Shift_Wake_Scanner(ModificationBlueprint.Fast_Scan,
            ModificationBlueprint.Lightweight_Utility,
            ModificationBlueprint.Long_Range_Scan,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded,
            ModificationBlueprint.Wide_Angle_Utility),

    Kill_Warrant_Scanner(ModificationBlueprint.Fast_Scan,
            ModificationBlueprint.Lightweight_Utility,
            ModificationBlueprint.Long_Range_Scan,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded,
            ModificationBlueprint.Wide_Angle_Utility),

    Manifest_Scanner(ModificationBlueprint.Fast_Scan,
            ModificationBlueprint.Lightweight_Utility,
            ModificationBlueprint.Long_Range_Scan,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded,
            ModificationBlueprint.Wide_Angle_Utility),

    Shield_Booster(ModificationBlueprint.Blast_Resistant_Shield_Booster,
            ModificationBlueprint.Heavy_Duty_Shield_Booster,
            ModificationBlueprint.Kinetic_Resistant_Booster,
            ModificationBlueprint.Resistance_Augmented,
            ModificationBlueprint.Thermal_Resistant_Booster),

    // optional
    Auto_Field_Maintenence_Unit(ModificationBlueprint.Shielded),

    Hull_Reinforcement_Package(ModificationBlueprint.Blast_Resistant_Hull_Reinforcement,
            ModificationBlueprint.Heavy_Duty_Hull_Reinforcement,
            ModificationBlueprint.Kinetic_Resistant_Hull,
            ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Thermal_Resistant_Hull),

    Detailed_Surface_Scanner(ModificationBlueprint.Fast_Surface_Scan,
            ModificationBlueprint.Long_Range_Surface_Scan,
            ModificationBlueprint.Wide_Angle_Surface_Scanner),

    Refinery(ModificationBlueprint.Shielded),

    Frame_Shift_Drive_Interdictor(ModificationBlueprint.Expanded_Capture_Arc,
            ModificationBlueprint.Long_Range_Interdictor),

    Fuel_Scoop(ModificationBlueprint.Shielded),

    Collector_Limpet_Controller(ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Prospector_Limpet_Controller(ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Fuel_Transfer_Limpet(ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Hatch_Breaker_Limpet(ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Shield_Cell_Bank(ModificationBlueprint.Rapid_Charge,
            ModificationBlueprint.Specialised),

    Shield_Generator(ModificationBlueprint.Enhanced_Low_Power,
            ModificationBlueprint.Kinetic_Resistant_Shield,
            ModificationBlueprint.Reinforced_Shield,
            ModificationBlueprint.Thermal_Resistant_Shield),

    // core
    Frame_Shift_Drive(ModificationBlueprint.Faster_Boot_Sequence,
            ModificationBlueprint.Increased_Range,
            ModificationBlueprint.Shielded_FSD),

    Life_Support(ModificationBlueprint.Lightweight_Weapon,
            ModificationBlueprint.Reinforced,
            ModificationBlueprint.Shielded),

    Power_Distributor(ModificationBlueprint.Charge_Enhanced,
            ModificationBlueprint.Engine_Focused,
            ModificationBlueprint.High_Charge_Capacity,
            ModificationBlueprint.Shielded_Distributor,
            ModificationBlueprint.System_Focused,
            ModificationBlueprint.Weapon_Focused),

    Power_Plant(ModificationBlueprint.Armoured,
            ModificationBlueprint.Low_Emissions,
            ModificationBlueprint.Overcharged_Power_Plant),

    Sensors(ModificationBlueprint.Lightweight_Sensors,
            ModificationBlueprint.Long_Range_Sensors,
            ModificationBlueprint.Wide_Angle_Sensors),

    Thrusters(ModificationBlueprint.Clean,
            ModificationBlueprint.Dirty,
            ModificationBlueprint.Reinforced_Thrusters),

    Bulkheads(ModificationBlueprint.Blast_Resistant_Armor,
            ModificationBlueprint.Heavy_Duty_Armor,
            ModificationBlueprint.Kinetic_Resistant_Armor,
            ModificationBlueprint.Lightweight_Bulkheads,
            ModificationBlueprint.Thermal_Resistant_Armor);

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
}
