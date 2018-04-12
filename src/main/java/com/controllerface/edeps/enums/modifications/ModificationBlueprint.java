package com.controllerface.edeps.enums.modifications;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ModificationBlueprint
{
    // All weapons with the Efficient mod
    Efficient("Efficient",
            ModificationRecipe.Efficient_1,
            ModificationRecipe.Efficient_2,
            ModificationRecipe.Efficient_3,
            ModificationRecipe.Efficient_4,
            ModificationRecipe.Efficient_5),

    // All weapons with the lightweight mod
    Lightweight_Weapon("Lightweight",
            ModificationRecipe.Lightweight_Weapon_1,
            ModificationRecipe.Lightweight_Weapon_2,
            ModificationRecipe.Lightweight_Weapon_3,
            ModificationRecipe.Lightweight_Weapon_4,
            ModificationRecipe.Lightweight_Weapon_5),

    // All utilities with the lightweight mod
    Lightweight_Utility("Lightweight",
            ModificationRecipe.Lightweight_Utility_1,
            ModificationRecipe.Lightweight_Utility_2,
            ModificationRecipe.Lightweight_Utility_3,
            ModificationRecipe.Lightweight_Utility_4,
            ModificationRecipe.Lightweight_Utility_5),

    // Core internal sensors
    Lightweight_Sensors("Lightweight",
            ModificationRecipe.Lightweight_Sensors_1,
            ModificationRecipe.Lightweight_Sensors_2,
            ModificationRecipe.Lightweight_Sensors_3,
            ModificationRecipe.Lightweight_Sensors_4,
            ModificationRecipe.Lightweight_Sensors_5),

    // Internal bulkheads
    Lightweight_Bulkheads("Lightweight",
            ModificationRecipe.Lightweight_Bulkheads_1,
            ModificationRecipe.Lightweight_Bulkheads_2,
            ModificationRecipe.Lightweight_Bulkheads_3,
            ModificationRecipe.Lightweight_Bulkheads_4,
            ModificationRecipe.Lightweight_Bulkheads_5),

    // Pulse, Beam, Multi-Cannon, Rail Gun
    Long_Range_Small_Energy("Long Range",
            ModificationRecipe.Long_Range_Weapon_1,
            ModificationRecipe.Long_Range_Weapon_2,
            ModificationRecipe.Long_Range_Weapon_3,
            ModificationRecipe.Long_Range_Weapon_4,
            ModificationRecipe.Long_Range_Weapon_5),

    // Plasma Accelerator, Cannon
    Long_Range_Large_Calibre("Long Range",
            ModificationRecipe.Long_Range_Large_Calibre_1,
            ModificationRecipe.Long_Range_Large_Calibre_2,
            ModificationRecipe.Long_Range_Large_Calibre_3,
            ModificationRecipe.Long_Range_Large_Calibre_4,
            ModificationRecipe.Long_Range_Large_Calibre_5),

    // Manifest Scanner, Kill Warrant Scanner, Frame Shift Wake Scanner
    Long_Range_Scan("Long Range",
            ModificationRecipe.Long_Range_Scan_1,
            ModificationRecipe.Long_Range_Scan_2,
            ModificationRecipe.Long_Range_Scan_3,
            ModificationRecipe.Long_Range_Scan_4,
            ModificationRecipe.Long_Range_Scan_5),

    // detailed surface scanner
    Long_Range_Surface_Scan("Long Range",
            ModificationRecipe.Long_Range_Surface_Scan_1,
            ModificationRecipe.Long_Range_Surface_Scan_2,
            ModificationRecipe.Long_Range_Surface_Scan_3,
            ModificationRecipe.Long_Range_Surface_Scan_4,
            ModificationRecipe.Long_Range_Surface_Scan_5),

    // Sensors
    Long_Range_Sensors("Long Range",
            ModificationRecipe.Long_Range_Sensors_1,
            ModificationRecipe.Long_Range_Sensors_2,
            ModificationRecipe.Long_Range_Sensors_3,
            ModificationRecipe.Long_Range_Sensors_4,
            ModificationRecipe.Long_Range_Sensors_5),

    // Interdictor
    Long_Range_Interdictor("Long Range",
            ModificationRecipe.Long_Range_Interdictor_1,
            ModificationRecipe.Long_Range_Interdictor_2,
            ModificationRecipe.Long_Range_Interdictor_3,
            ModificationRecipe.Long_Range_Interdictor_4,
            ModificationRecipe.Long_Range_Interdictor_5),

    // Most weapons with the Overcharged mod
    Overcharged("Overcharged",
            ModificationRecipe.Overcharged_1,
            ModificationRecipe.Overcharged_2,
            ModificationRecipe.Overcharged_3,
            ModificationRecipe.Overcharged_4,
            ModificationRecipe.Overcharged_5),

    // Multi-Cannon
    Overcharged_Multi_Cannon("Overcharged",
            ModificationRecipe.Overcharged_Multi_Cannon_1,
            ModificationRecipe.Overcharged_Multi_Cannon_2,
            ModificationRecipe.Overcharged_Multi_Cannon_3,
            ModificationRecipe.Overcharged_Multi_Cannon_4,
            ModificationRecipe.Overcharged_Multi_Cannon_5),


    // power plant
    Overcharged_Power_Plant("Overcharged",
            ModificationRecipe.Overcharged_Power_Plant_1,
            ModificationRecipe.Overcharged_Power_Plant_2,
            ModificationRecipe.Overcharged_Power_Plant_3,
            ModificationRecipe.Overcharged_Power_Plant_4,
            ModificationRecipe.Overcharged_Power_Plant_5),

    // All weapons with the Short Range mod
    Short_Range("Short Range",
            ModificationRecipe.Short_Range_1,
            ModificationRecipe.Short_Range_2,
            ModificationRecipe.Short_Range_3,
            ModificationRecipe.Short_Range_4,
            ModificationRecipe.Short_Range_5),

    // All weapons with the Sturdy mod
    Sturdy("Sturdy",
            ModificationRecipe.Sturdy_1,
            ModificationRecipe.Sturdy_2,
            ModificationRecipe.Sturdy_3,
            ModificationRecipe.Sturdy_4,
            ModificationRecipe.Sturdy_5),

    // All weapons with the Focused mod
    Focused("Focused",
            ModificationRecipe.Focused_1,
            ModificationRecipe.Focused_2,
            ModificationRecipe.Focused_3,
            ModificationRecipe.Focused_4,
            ModificationRecipe.Focused_5),

    // All weapons with the Rapid Fire mod
    Rapid_Fire("Rapid Fire",
            ModificationRecipe.Rapid_Fire_1,
            ModificationRecipe.Rapid_Fire_2,
            ModificationRecipe.Rapid_Fire_3,
            ModificationRecipe.Rapid_Fire_4,
            ModificationRecipe.Rapid_Fire_5),

    // All weapons with the High Capacity mod
    High_Capacity("High Capacity",
            ModificationRecipe.High_Capacity_1,
            ModificationRecipe.High_Capacity_2,
            ModificationRecipe.High_Capacity_3,
            ModificationRecipe.High_Capacity_4,
            ModificationRecipe.High_Capacity_5),

    // fragment cannon
    Double_Shot("Double Shot",
            ModificationRecipe.Double_Shot_1,
            ModificationRecipe.Double_Shot_2,
            ModificationRecipe.Double_Shot_3,
            ModificationRecipe.Double_Shot_4,
            ModificationRecipe.Double_Shot_5),

    // chaff launcher only
    Ammo_Capacity("Ammo Capacity",
            ModificationRecipe.Ammo_Capacity_1),

    // Most modules with the Reinforced mod
    Reinforced("Reinforced",
            ModificationRecipe.Reinforced_1,
            ModificationRecipe.Reinforced_2,
            ModificationRecipe.Reinforced_3,
            ModificationRecipe.Reinforced_4,
            ModificationRecipe.Reinforced_5),

    // thrusters only
    Reinforced_Thrusters("Reinforced",
            ModificationRecipe.Reinforced_Thrusters_1,
            ModificationRecipe.Reinforced_Thrusters_2,
            ModificationRecipe.Reinforced_Thrusters_3,
            ModificationRecipe.Reinforced_Thrusters_4,
            ModificationRecipe.Reinforced_Thrusters_5),

    // shield only
    Reinforced_Shield("Reinforced",
            ModificationRecipe.Reinforced_Shield_1,
            ModificationRecipe.Reinforced_Shield_2,
            ModificationRecipe.Reinforced_Shield_3,
            ModificationRecipe.Reinforced_Shield_4,
            ModificationRecipe.Reinforced_Shield_5),

    // Most modules with the Shielded mod
    Shielded("Shielded",
            ModificationRecipe.Shielded_1,
            ModificationRecipe.Shielded_2,
            ModificationRecipe.Shielded_3,
            ModificationRecipe.Shielded_4,
            ModificationRecipe.Shielded_5),

    // frame shift drive only
    Shielded_FSD("Shielded",
            ModificationRecipe.Shielded_FSD_1,
            ModificationRecipe.Shielded_FSD_2,
            ModificationRecipe.Shielded_FSD_3,
            ModificationRecipe.Shielded_FSD_4,
            ModificationRecipe.Shielded_FSD_5),

    // power distributor only
    Shielded_Distributor("Shielded",
            ModificationRecipe.Shielded_Distributor_1,
            ModificationRecipe.Shielded_Distributor_2,
            ModificationRecipe.Shielded_Distributor_3,
            ModificationRecipe.Shielded_Distributor_4,
            ModificationRecipe.Shielded_Distributor_5),

    // Most modules with the Fast Scan mod
    Fast_Scan("Fast Scan",
            ModificationRecipe.Fast_Scan_1,
            ModificationRecipe.Fast_Scan_2,
            ModificationRecipe.Fast_Scan_3,
            ModificationRecipe.Fast_Scan_4,
            ModificationRecipe.Fast_Scan_5),

    // detailed surface scanner only
    Fast_Surface_Scan("Fast Scan",
            ModificationRecipe.Fast_Surface_Scan_1,
            ModificationRecipe.Fast_Surface_Scan_2,
            ModificationRecipe.Fast_Surface_Scan_3,
            ModificationRecipe.Fast_Surface_Scan_4,
            ModificationRecipe.Fast_Surface_Scan_5),

    // Most modules with the Wide Angle mod
    Wide_Angle_Utility("Wide Angle",
            ModificationRecipe.Wide_Angle_1,
            ModificationRecipe.Wide_Angle_2,
            ModificationRecipe.Wide_Angle_3,
            ModificationRecipe.Wide_Angle_4,
            ModificationRecipe.Wide_Angle_5),

    // detailed surface scanner only
    Wide_Angle_Surface_Scanner("Wide Angle",
            ModificationRecipe.Wide_Angle_Surface_Scanner_1,
            ModificationRecipe.Wide_Angle_Surface_Scanner_2,
            ModificationRecipe.Wide_Angle_Surface_Scanner_3,
            ModificationRecipe.Wide_Angle_Surface_Scanner_4,
            ModificationRecipe.Wide_Angle_Surface_Scanner_5),

    // internal sensors only
    Wide_Angle_Sensors("Wide Angle",
            ModificationRecipe.Wide_Angle_Sensors_1,
            ModificationRecipe.Wide_Angle_Sensors_2,
            ModificationRecipe.Wide_Angle_Sensors_3,
            ModificationRecipe.Wide_Angle_Sensors_4,
            ModificationRecipe.Wide_Angle_Sensors_5),

    // hull reinforcement package
    Blast_Resistant_Hull_Reinforcement("Blast Resistant",
            ModificationRecipe.Blast_Resistant_Hull_1,
            ModificationRecipe.Blast_Resistant_Hull_2,
            ModificationRecipe.Blast_Resistant_Hull_3,
            ModificationRecipe.Blast_Resistant_Hull_4,
            ModificationRecipe.Blast_Resistant_Hull_5),

    // shield booster
    Blast_Resistant_Shield_Booster("Blast Resistant",
            ModificationRecipe.Blast_Resistant_Shield_Booster_1,
            ModificationRecipe.Blast_Resistant_Shield_Booster_2,
            ModificationRecipe.Blast_Resistant_Shield_Booster_3,
            ModificationRecipe.Blast_Resistant_Shield_Booster_4,
            ModificationRecipe.Blast_Resistant_Shield_Booster_5),

    // armor/bulkheads
    Blast_Resistant_Armor("Blast Resistant",
            ModificationRecipe.Blast_Resistant_Armor_1,
            ModificationRecipe.Blast_Resistant_Armor_2,
            ModificationRecipe.Blast_Resistant_Armor_3,
            ModificationRecipe.Blast_Resistant_Armor_4,
            ModificationRecipe.Blast_Resistant_Armor_5),

    // shield booster
    Heavy_Duty_Shield_Booster("Heavy Duty",
            ModificationRecipe.Heavy_Duty_Shield_Booster_1,
            ModificationRecipe.Heavy_Duty_Shield_Booster_2,
            ModificationRecipe.Heavy_Duty_Shield_Booster_3,
            ModificationRecipe.Heavy_Duty_Shield_Booster_4,
            ModificationRecipe.Heavy_Duty_Shield_Booster_5),

    // hull reinforcment package
    Heavy_Duty_Hull_Reinforcement("Heavy Duty",
            ModificationRecipe.Heavy_Duty_Hull_Reinforcement_1,
            ModificationRecipe.Heavy_Duty_Hull_Reinforcement_2,
            ModificationRecipe.Heavy_Duty_Hull_Reinforcement_3,
            ModificationRecipe.Heavy_Duty_Hull_Reinforcement_4,
            ModificationRecipe.Heavy_Duty_Hull_Reinforcement_5),

    // armor/bulkheads
    Heavy_Duty_Armor("Heavy Duty",
            ModificationRecipe.Heavy_Duty_Armor_1,
            ModificationRecipe.Heavy_Duty_Armor_2,
            ModificationRecipe.Heavy_Duty_Armor_3,
            ModificationRecipe.Heavy_Duty_Armor_4,
            ModificationRecipe.Heavy_Duty_Armor_5),

    // hull reinforcement package only
    Kinetic_Resistant_Hull("Kinetic Resistant",
            ModificationRecipe.Kinetic_Resistant_Hull_1,
            ModificationRecipe.Kinetic_Resistant_Hull_2,
            ModificationRecipe.Kinetic_Resistant_Hull_3,
            ModificationRecipe.Kinetic_Resistant_Hull_4,
            ModificationRecipe.Kinetic_Resistant_Hull_5),

    // armor/bulkheads only
    Kinetic_Resistant_Armor("Kinetic Resistant",
            ModificationRecipe.Kinetic_Resistant_Armor_1,
            ModificationRecipe.Kinetic_Resistant_Armor_2,
            ModificationRecipe.Kinetic_Resistant_Armor_3,
            ModificationRecipe.Kinetic_Resistant_Armor_4,
            ModificationRecipe.Kinetic_Resistant_Armor_5),

    // shield booster only
    Kinetic_Resistant_Booster("Kinetic Resistant",
            ModificationRecipe.Kinetic_Resistant_Booster_1,
            ModificationRecipe.Kinetic_Resistant_Booster_2,
            ModificationRecipe.Kinetic_Resistant_Booster_3,
            ModificationRecipe.Kinetic_Resistant_Booster_4,
            ModificationRecipe.Kinetic_Resistant_Booster_5),

    // shield generator only
    Kinetic_Resistant_Shield("Kinetic Resistant",
            ModificationRecipe.Kinetic_Resistant_Shield_1,
            ModificationRecipe.Kinetic_Resistant_Shield_2,
            ModificationRecipe.Kinetic_Resistant_Shield_3,
            ModificationRecipe.Kinetic_Resistant_Shield_4,
            ModificationRecipe.Kinetic_Resistant_Shield_5),

    // shield booster
    Resistance_Augmented("Resistance Augmented",
            ModificationRecipe.Resistance_Augmented_1,
            ModificationRecipe.Resistance_Augmented_2,
            ModificationRecipe.Resistance_Augmented_3,
            ModificationRecipe.Resistance_Augmented_4,
            ModificationRecipe.Resistance_Augmented_5),

    // hull reinforcement package
    Thermal_Resistant_Hull("Thermal Resistant",
            ModificationRecipe.Thermal_Resistant_Hull_1,
            ModificationRecipe.Thermal_Resistant_Hull_2,
            ModificationRecipe.Thermal_Resistant_Hull_3,
            ModificationRecipe.Thermal_Resistant_Hull_4,
            ModificationRecipe.Thermal_Resistant_Hull_5),

    // armor/bulkheads
    Thermal_Resistant_Armor("Thermal Resistant",
            ModificationRecipe.Thermal_Resistant_Armor_1,
            ModificationRecipe.Thermal_Resistant_Armor_2,
            ModificationRecipe.Thermal_Resistant_Armor_3,
            ModificationRecipe.Thermal_Resistant_Armor_4,
            ModificationRecipe.Thermal_Resistant_Armor_5),

    // shield booster
    Thermal_Resistant_Booster("Thermal Resistant",
            ModificationRecipe.Thermal_Resistant_Booster_1,
            ModificationRecipe.Thermal_Resistant_Booster_2,
            ModificationRecipe.Thermal_Resistant_Booster_3,
            ModificationRecipe.Thermal_Resistant_Booster_4,
            ModificationRecipe.Thermal_Resistant_Booster_5),

    // shield generator
    Thermal_Resistant_Shield("Thermal Resistant",
            ModificationRecipe.Thermal_Resistant_Shield_1,
            ModificationRecipe.Thermal_Resistant_Shield_2,
            ModificationRecipe.Thermal_Resistant_Shield_3,
            ModificationRecipe.Thermal_Resistant_Shield_4,
            ModificationRecipe.Thermal_Resistant_Shield_5),

    // Interdictor
    Expanded_Capture_Arc("Expanded Capture Arc",
            ModificationRecipe.Expanded_Capture_Arc_1,
            ModificationRecipe.Expanded_Capture_Arc_2,
            ModificationRecipe.Expanded_Capture_Arc_3,
            ModificationRecipe.Expanded_Capture_Arc_4,
            ModificationRecipe.Expanded_Capture_Arc_5),

    // Shield Cell Bank
    Rapid_Charge("Rapid Charge",
            ModificationRecipe.Rapid_Charge_1,
            ModificationRecipe.Rapid_Charge_2,
            ModificationRecipe.Rapid_Charge_3,
            ModificationRecipe.Rapid_Charge_4),

    // Shield Cell Bank
    Specialised("Specialised",
            ModificationRecipe.Specialised_1,
            ModificationRecipe.Specialised_2,
            ModificationRecipe.Specialised_3,
            ModificationRecipe.Specialised_4),

    // shield generator
    Enhanced_Low_Power("Enhanced Low FACTION",
            ModificationRecipe.Enhanced_Low_Power_1,
            ModificationRecipe.Enhanced_Low_Power_2,
            ModificationRecipe.Enhanced_Low_Power_3,
            ModificationRecipe.Enhanced_Low_Power_4,
            ModificationRecipe.Enhanced_Low_Power_5),

    // frame shift drive
    Faster_Boot_Sequence("Faster Boot Sequence",
            ModificationRecipe.Faster_Boot_Sequence_1,
            ModificationRecipe.Faster_Boot_Sequence_2,
            ModificationRecipe.Faster_Boot_Sequence_3,
            ModificationRecipe.Faster_Boot_Sequence_4,
            ModificationRecipe.Faster_Boot_Sequence_5),

    // frame shift drive
    Increased_Range("Increased Range",
            ModificationRecipe.Increased_Range_1,
            ModificationRecipe.Increased_Range_2,
            ModificationRecipe.Increased_Range_3,
            ModificationRecipe.Increased_Range_4,
            ModificationRecipe.Increased_Range_5),

    // power distributor
    High_Charge_Capacity("High Charge Capacity",
            ModificationRecipe.High_Charge_Capacity_1,
            ModificationRecipe.High_Charge_Capacity_2,
            ModificationRecipe.High_Charge_Capacity_3,
            ModificationRecipe.High_Charge_Capacity_4,
            ModificationRecipe.High_Charge_Capacity_5),

    // power distributor
    Charge_Enhanced("Charge Enhanced",
            ModificationRecipe.Charge_Enhanced_1,
            ModificationRecipe.Charge_Enhanced_2,
            ModificationRecipe.Charge_Enhanced_3,
            ModificationRecipe.Charge_Enhanced_4,
            ModificationRecipe.Charge_Enhanced_5),

    // power distributor
    Engine_Focused("Engine Focused",
            ModificationRecipe.Engine_Focused_1,
            ModificationRecipe.Engine_Focused_2,
            ModificationRecipe.Engine_Focused_3,
            ModificationRecipe.Engine_Focused_4,
            ModificationRecipe.Engine_Focused_5),

    // power distributor
    System_Focused("System Focused",
            ModificationRecipe.System_Focused_1,
            ModificationRecipe.System_Focused_2,
            ModificationRecipe.System_Focused_3,
            ModificationRecipe.System_Focused_4,
            ModificationRecipe.System_Focused_5),

    // power distributor
    Weapon_Focused("Weapon Focused",
            ModificationRecipe.Weapon_Focused_1,
            ModificationRecipe.Weapon_Focused_2,
            ModificationRecipe.Weapon_Focused_3,
            ModificationRecipe.Weapon_Focused_4,
            ModificationRecipe.Weapon_Focused_5),

    // power plant
    Armoured("Armoured",
            ModificationRecipe.Armoured_1,
            ModificationRecipe.Armoured_2,
            ModificationRecipe.Armoured_3,
            ModificationRecipe.Armoured_4,
            ModificationRecipe.Armoured_5),

    // power plant
    Low_Emissions("Low Emissions",
            ModificationRecipe.Low_Emissions_1,
            ModificationRecipe.Low_Emissions_2,
            ModificationRecipe.Low_Emissions_3,
            ModificationRecipe.Low_Emissions_4,
            ModificationRecipe.Low_Emissions_5),

    // thrusters
    Clean("Clean",
            ModificationRecipe.Clean_1,
            ModificationRecipe.Clean_2,
            ModificationRecipe.Clean_3,
            ModificationRecipe.Clean_4,
            ModificationRecipe.Clean_5),

    // thrusters
    Dirty("Dirty",
            ModificationRecipe.Dirty_1,
            ModificationRecipe.Dirty_2,
            ModificationRecipe.Dirty_3,
            ModificationRecipe.Dirty_4,
            ModificationRecipe.Dirty_5);

    private final ModificationRecipe[] recipes;
    private final String text;

    ModificationBlueprint(String text, ModificationRecipe ... recipes)
    {
        this.text = text;
        this.recipes = recipes;
    }

    public Stream<ModificationRecipe> recipeStream()
    {
        return Arrays.stream(recipes);
    }

    @Override
    public String toString()
    {
        return text;
    }
}
