package com.controllerface.cmdr_j.enums.craftable.modifications;

import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Implementation Note:
 *
 * The enum values in this class must match a defined Blueprint name in the game
 *
 * Created by Controllerface on 3/31/2018.
 */
public enum ModificationBlueprint implements TaskBlueprint
{
    Armour_Advanced("Lightweight",
            ModificationRecipe.Armour_Advanced_1,
            ModificationRecipe.Armour_Advanced_2,
            ModificationRecipe.Armour_Advanced_3,
            ModificationRecipe.Armour_Advanced_4,
            ModificationRecipe.Armour_Advanced_5),

    Armour_Explosive("Blast Resistant",
            ModificationRecipe.Armour_Explosive_1,
            ModificationRecipe.Armour_Explosive_2,
            ModificationRecipe.Armour_Explosive_3,
            ModificationRecipe.Armour_Explosive_4,
            ModificationRecipe.Armour_Explosive_5),

    Armour_HeavyDuty("Heavy Duty",
            ModificationRecipe.Armour_HeavyDuty_1,
            ModificationRecipe.Armour_HeavyDuty_2,
            ModificationRecipe.Armour_HeavyDuty_3,
            ModificationRecipe.Armour_HeavyDuty_4,
            ModificationRecipe.Armour_HeavyDuty_5),

    Armour_Kinetic("Kinetic Resistant",
            ModificationRecipe.Armour_Kinetic_1,
            ModificationRecipe.Armour_Kinetic_2,
            ModificationRecipe.Armour_Kinetic_3,
            ModificationRecipe.Armour_Kinetic_4,
            ModificationRecipe.Armour_Kinetic_5),

    Armour_Thermic("Thermal Resistant",
            ModificationRecipe.Armour_Thermic_1,
            ModificationRecipe.Armour_Thermic_2,
            ModificationRecipe.Armour_Thermic_3,
            ModificationRecipe.Armour_Thermic_4,
            ModificationRecipe.Armour_Thermic_5),

    ChaffLauncher_ChaffCapacity("Ammo Capacity",
            ModificationRecipe.ChaffLauncher_ChaffCapacity_1),

    Engine_Dirty("Dirty",
            ModificationRecipe.Engine_Dirty_1,
            ModificationRecipe.Engine_Dirty_2,
            ModificationRecipe.Engine_Dirty_3,
            ModificationRecipe.Engine_Dirty_4,
            ModificationRecipe.Engine_Dirty_5),

    Engine_Reinforced("Reinforced",
            ModificationRecipe.Engine_Reinforced_1,
            ModificationRecipe.Engine_Reinforced_2,
            ModificationRecipe.Engine_Reinforced_3,
            ModificationRecipe.Engine_Reinforced_4,
            ModificationRecipe.Engine_Reinforced_5),

    Engine_Tuned("Clean",
            ModificationRecipe.Engine_Tuned_1,
            ModificationRecipe.Engine_Tuned_2,
            ModificationRecipe.Engine_Tuned_3,
            ModificationRecipe.Engine_Tuned_4,
            ModificationRecipe.Engine_Tuned_5),

    FSD_FastBoot("Faster Boot Sequence",
            ModificationRecipe.FSD_FastBoot_1,
            ModificationRecipe.FSD_FastBoot_2,
            ModificationRecipe.FSD_FastBoot_3,
            ModificationRecipe.FSD_FastBoot_4,
            ModificationRecipe.FSD_FastBoot_5),

    FSD_LongRange("Increased Range",
            ModificationRecipe.FSD_LongRange_1,
            ModificationRecipe.FSD_LongRange_2,
            ModificationRecipe.FSD_LongRange_3,
            ModificationRecipe.FSD_LongRange_4,
            ModificationRecipe.FSD_LongRange_5),

    FSD_Shielded("Shielded",
            ModificationRecipe.FSD_Shielded_1,
            ModificationRecipe.FSD_Shielded_2,
            ModificationRecipe.FSD_Shielded_3,
            ModificationRecipe.FSD_Shielded_4,
            ModificationRecipe.FSD_Shielded_5),

    FSDinterdictor_Expanded("Expanded Capture Arc",
            ModificationRecipe.FSDinterdictor_Expanded_1,
            ModificationRecipe.FSDinterdictor_Expanded_2,
            ModificationRecipe.FSDinterdictor_Expanded_3,
            ModificationRecipe.FSDinterdictor_Expanded_4,
            ModificationRecipe.FSDinterdictor_Expanded_5),

    FSDinterdictor_LongRange("Long Range",
            ModificationRecipe.FSDinterdictor_LongRange_1,
            ModificationRecipe.FSDinterdictor_LongRange_2,
            ModificationRecipe.FSDinterdictor_LongRange_3,
            ModificationRecipe.FSDinterdictor_LongRange_4,
            ModificationRecipe.FSDinterdictor_LongRange_5),

    HeatSinkLauncher_HeatSinkCapacity("Ammo Capacity",
            ModificationRecipe.HeatSinkLauncher_HeatSinkCapacity_1),

    HullReinforcement_Advanced("Lightweight",
            ModificationRecipe.HullReinforcement_Advanced_1,
            ModificationRecipe.HullReinforcement_Advanced_2,
            ModificationRecipe.HullReinforcement_Advanced_3,
            ModificationRecipe.HullReinforcement_Advanced_4,
            ModificationRecipe.HullReinforcement_Advanced_5),

    HullReinforcement_Explosive("Blast Resistant",
            ModificationRecipe.HullReinforcement_Explosive_1,
            ModificationRecipe.HullReinforcement_Explosive_2,
            ModificationRecipe.HullReinforcement_Explosive_3,
            ModificationRecipe.HullReinforcement_Explosive_4,
            ModificationRecipe.HullReinforcement_Explosive_5),

    HullReinforcement_HeavyDuty("Heavy Duty",
            ModificationRecipe.HullReinforcement_HeavyDuty_1,
            ModificationRecipe.HullReinforcement_HeavyDuty_2,
            ModificationRecipe.HullReinforcement_HeavyDuty_3,
            ModificationRecipe.HullReinforcement_HeavyDuty_4,
            ModificationRecipe.HullReinforcement_HeavyDuty_5),

    HullReinforcement_Kinetic("Kinetic Resistant",
            ModificationRecipe.HullReinforcement_Kinetic_1,
            ModificationRecipe.HullReinforcement_Kinetic_2,
            ModificationRecipe.HullReinforcement_Kinetic_3,
            ModificationRecipe.HullReinforcement_Kinetic_4,
            ModificationRecipe.HullReinforcement_Kinetic_5),

    HullReinforcement_Thermic("Thermal Resistant",
            ModificationRecipe.HullReinforcement_Thermic_1,
            ModificationRecipe.HullReinforcement_Thermic_2,
            ModificationRecipe.HullReinforcement_Thermic_3,
            ModificationRecipe.HullReinforcement_Thermic_4,
            ModificationRecipe.HullReinforcement_Thermic_5),

    KillWarrantScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_Misc_LongRange_1,
            ModificationRecipe.Sensor_Misc_LongRange_2,
            ModificationRecipe.Sensor_Misc_LongRange_3,
            ModificationRecipe.Sensor_Misc_LongRange_4,
            ModificationRecipe.Sensor_Misc_LongRange_5),

    Misc_PointDefenseCapacity("Ammo Capacity",
            ModificationRecipe.PointDefence_PointDefenseCapacity_1),

    PowerDistributor_HighCapacity("High Charge Capacity",
            ModificationRecipe.PowerDistributor_HighCapacity_1,
            ModificationRecipe.PowerDistributor_HighCapacity_2,
            ModificationRecipe.PowerDistributor_HighCapacity_3,
            ModificationRecipe.PowerDistributor_HighCapacity_4,
            ModificationRecipe.PowerDistributor_HighCapacity_5),

    PowerDistributor_HighFrequency("Charge Enhanced",
            ModificationRecipe.PowerDistributor_HighFrequency_1,
            ModificationRecipe.PowerDistributor_HighFrequency_2,
            ModificationRecipe.PowerDistributor_HighFrequency_3,
            ModificationRecipe.PowerDistributor_HighFrequency_4,
            ModificationRecipe.PowerDistributor_HighFrequency_5),

    PowerDistributor_PriorityEngines("Engine Focused",
            ModificationRecipe.PowerDistributor_PriorityEngines_1,
            ModificationRecipe.PowerDistributor_PriorityEngines_2,
            ModificationRecipe.PowerDistributor_PriorityEngines_3,
            ModificationRecipe.PowerDistributor_PriorityEngines_4,
            ModificationRecipe.PowerDistributor_PriorityEngines_5),

    PowerDistributor_PrioritySystems("System Focused",
            ModificationRecipe.PowerDistributor_PrioritySystems_1,
            ModificationRecipe.PowerDistributor_PrioritySystems_2,
            ModificationRecipe.PowerDistributor_PrioritySystems_3,
            ModificationRecipe.PowerDistributor_PrioritySystems_4,
            ModificationRecipe.PowerDistributor_PrioritySystems_5),

    PowerDistributor_PriorityWeapons("Weapon Focused",
            ModificationRecipe.PowerDistributor_PriorityWeapons_1,
            ModificationRecipe.PowerDistributor_PriorityWeapons_2,
            ModificationRecipe.PowerDistributor_PriorityWeapons_3,
            ModificationRecipe.PowerDistributor_PriorityWeapons_4,
            ModificationRecipe.PowerDistributor_PriorityWeapons_5),

    PowerDistributor_Shielded("Shielded",
            ModificationRecipe.PowerDistributor_Shielded_1,
            ModificationRecipe.PowerDistributor_Shielded_2,
            ModificationRecipe.PowerDistributor_Shielded_3,
            ModificationRecipe.PowerDistributor_Shielded_4,
            ModificationRecipe.PowerDistributor_Shielded_5),

    PowerPlant_Armoured("Armoured",
            ModificationRecipe.PowerPlant_Armoured_1,
            ModificationRecipe.PowerPlant_Armoured_2,
            ModificationRecipe.PowerPlant_Armoured_3,
            ModificationRecipe.PowerPlant_Armoured_4,
            ModificationRecipe.PowerPlant_Armoured_5),

    PowerPlant_Boosted("Overcharged",
            ModificationRecipe.PowerPlant_Boosted_1,
            ModificationRecipe.PowerPlant_Boosted_2,
            ModificationRecipe.PowerPlant_Boosted_3,
            ModificationRecipe.PowerPlant_Boosted_4,
            ModificationRecipe.PowerPlant_Boosted_5),

    PowerPlant_Stealth("Low Emissions",
            ModificationRecipe.PowerPlant_Stealth_1,
            ModificationRecipe.PowerPlant_Stealth_2,
            ModificationRecipe.PowerPlant_Stealth_3,
            ModificationRecipe.PowerPlant_Stealth_4,
            ModificationRecipe.PowerPlant_Stealth_5),

    Sensor_CargoScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_Misc_FastScan_1,
            ModificationRecipe.Sensor_Misc_FastScan_2,
            ModificationRecipe.Sensor_Misc_FastScan_3,
            ModificationRecipe.Sensor_Misc_FastScan_4,
            ModificationRecipe.Sensor_Misc_FastScan_5),

    Sensor_CargoScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_Misc_LongRange_1,
            ModificationRecipe.Sensor_Misc_LongRange_2,
            ModificationRecipe.Sensor_Misc_LongRange_3,
            ModificationRecipe.Sensor_Misc_LongRange_4,
            ModificationRecipe.Sensor_Misc_LongRange_5),

    Sensor_CargoScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_Misc_WideAngle_1,
            ModificationRecipe.Sensor_Misc_WideAngle_2,
            ModificationRecipe.Sensor_Misc_WideAngle_3,
            ModificationRecipe.Sensor_Misc_WideAngle_4,
            ModificationRecipe.Sensor_Misc_WideAngle_5),

    Sensor_KillWarrantScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_Misc_FastScan_1,
            ModificationRecipe.Sensor_Misc_FastScan_2,
            ModificationRecipe.Sensor_Misc_FastScan_3,
            ModificationRecipe.Sensor_Misc_FastScan_4,
            ModificationRecipe.Sensor_Misc_FastScan_5),

    Sensor_KillWarrantScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_Misc_WideAngle_1,
            ModificationRecipe.Sensor_Misc_WideAngle_2,
            ModificationRecipe.Sensor_Misc_WideAngle_3,
            ModificationRecipe.Sensor_Misc_WideAngle_4,
            ModificationRecipe.Sensor_Misc_WideAngle_5),

    Sensor_LightWeight("Lightweight",
            ModificationRecipe.Sensor_LightWeight_1,
            ModificationRecipe.Sensor_LightWeight_2,
            ModificationRecipe.Sensor_LightWeight_3,
            ModificationRecipe.Sensor_LightWeight_4,
            ModificationRecipe.Sensor_LightWeight_5),

    Sensor_LongRange("Long Range",
            ModificationRecipe.Sensor_LongRange_1,
            ModificationRecipe.Sensor_LongRange_2,
            ModificationRecipe.Sensor_LongRange_3,
            ModificationRecipe.Sensor_LongRange_4,
            ModificationRecipe.Sensor_LongRange_5),

    Sensor_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_WideAngle_1,
            ModificationRecipe.Sensor_WideAngle_2,
            ModificationRecipe.Sensor_WideAngle_3,
            ModificationRecipe.Sensor_WideAngle_4,
            ModificationRecipe.Sensor_WideAngle_5),

    Sensor_Expanded("Expanded Probe Radius",
            ModificationRecipe.Sensor_Expanded_1,
            ModificationRecipe.Sensor_Expanded_2,
            ModificationRecipe.Sensor_Expanded_3,
            ModificationRecipe.Sensor_Expanded_4,
            ModificationRecipe.Sensor_Expanded_5),

    Sensor_WakeScanner_FastScan("Fast Scan",
            ModificationRecipe.Sensor_Misc_FastScan_1,
            ModificationRecipe.Sensor_Misc_FastScan_2,
            ModificationRecipe.Sensor_Misc_FastScan_3,
            ModificationRecipe.Sensor_Misc_FastScan_4,
            ModificationRecipe.Sensor_Misc_FastScan_5),

    Sensor_WakeScanner_LongRange("Long Range",
            ModificationRecipe.Sensor_Misc_LongRange_1,
            ModificationRecipe.Sensor_Misc_LongRange_2,
            ModificationRecipe.Sensor_Misc_LongRange_3,
            ModificationRecipe.Sensor_Misc_LongRange_4,
            ModificationRecipe.Sensor_Misc_LongRange_5),

    Sensor_WakeScanner_WideAngle("Wide Angle",
            ModificationRecipe.Sensor_Misc_WideAngle_1,
            ModificationRecipe.Sensor_Misc_WideAngle_2,
            ModificationRecipe.Sensor_Misc_WideAngle_3,
            ModificationRecipe.Sensor_Misc_WideAngle_4,
            ModificationRecipe.Sensor_Misc_WideAngle_5),

    ShieldBooster_Explosive("Blast Resistant",
            ModificationRecipe.ShieldBooster_Explosive_1,
            ModificationRecipe.ShieldBooster_Explosive_2,
            ModificationRecipe.ShieldBooster_Explosive_3,
            ModificationRecipe.ShieldBooster_Explosive_4,
            ModificationRecipe.ShieldBooster_Explosive_5),

    ShieldBooster_HeavyDuty("Heavy Duty",
            ModificationRecipe.ShieldBooster_HeavyDuty_1,
            ModificationRecipe.ShieldBooster_HeavyDuty_2,
            ModificationRecipe.ShieldBooster_HeavyDuty_3,
            ModificationRecipe.ShieldBooster_HeavyDuty_4,
            ModificationRecipe.ShieldBooster_HeavyDuty_5),

    ShieldBooster_Kinetic("Kinetic Resistant",
            ModificationRecipe.ShieldBooster_Kinetic_1,
            ModificationRecipe.ShieldBooster_Kinetic_2,
            ModificationRecipe.ShieldBooster_Kinetic_3,
            ModificationRecipe.ShieldBooster_Kinetic_4,
            ModificationRecipe.ShieldBooster_Kinetic_5),

    ShieldBooster_Resistive("Resistance Augmented",
            ModificationRecipe.ShieldBooster_Resistive_1,
            ModificationRecipe.ShieldBooster_Resistive_2,
            ModificationRecipe.ShieldBooster_Resistive_3,
            ModificationRecipe.ShieldBooster_Resistive_4,
            ModificationRecipe.ShieldBooster_Resistive_5),

    ShieldBooster_Thermic("Thermal Resistant",
            ModificationRecipe.ShieldBooster_Thermic_1,
            ModificationRecipe.ShieldBooster_Thermic_2,
            ModificationRecipe.ShieldBooster_Thermic_3,
            ModificationRecipe.ShieldBooster_Thermic_4,
            ModificationRecipe.ShieldBooster_Thermic_5),

    ShieldCellBank_Rapid("Rapid Charge",
            ModificationRecipe.ShieldCellBank_Rapid_1,
            ModificationRecipe.ShieldCellBank_Rapid_2,
            ModificationRecipe.ShieldCellBank_Rapid_3,
            ModificationRecipe.ShieldCellBank_Rapid_4),

    ShieldCellBank_Specialised("Specialised",
            ModificationRecipe.ShieldCellBank_Specialised_1,
            ModificationRecipe.ShieldCellBank_Specialised_2,
            ModificationRecipe.ShieldCellBank_Specialised_3,
            ModificationRecipe.ShieldCellBank_Specialised_4),

    ShieldGenerator_Kinetic("Kinetic Resistant",
            ModificationRecipe.ShieldGenerator_Kinetic_1,
            ModificationRecipe.ShieldGenerator_Kinetic_2,
            ModificationRecipe.ShieldGenerator_Kinetic_3,
            ModificationRecipe.ShieldGenerator_Kinetic_4,
            ModificationRecipe.ShieldGenerator_Kinetic_5),

    ShieldGenerator_Optimised("Enhanced Low Power",
            ModificationRecipe.ShieldGenerator_Optimised_1,
            ModificationRecipe.ShieldGenerator_Optimised_2,
            ModificationRecipe.ShieldGenerator_Optimised_3,
            ModificationRecipe.ShieldGenerator_Optimised_4,
            ModificationRecipe.ShieldGenerator_Optimised_5),

    ShieldGenerator_Reinforced("Reinforced",
            ModificationRecipe.ShieldGenerator_Reinforced_1,
            ModificationRecipe.ShieldGenerator_Reinforced_2,
            ModificationRecipe.ShieldGenerator_Reinforced_3,
            ModificationRecipe.ShieldGenerator_Reinforced_4,
            ModificationRecipe.ShieldGenerator_Reinforced_5),

    ShieldGenerator_Thermic("Thermal Resistant",
            ModificationRecipe.ShieldGenerator_Thermic_1,
            ModificationRecipe.ShieldGenerator_Thermic_2,
            ModificationRecipe.ShieldGenerator_Thermic_3,
            ModificationRecipe.ShieldGenerator_Thermic_4,
            ModificationRecipe.ShieldGenerator_Thermic_5),

    Misc_LightWeight("Lightweight",
            ModificationRecipe.Misc_LightWeight_1,
            ModificationRecipe.Misc_LightWeight_2,
            ModificationRecipe.Misc_LightWeight_3,
            ModificationRecipe.Misc_LightWeight_4,
            ModificationRecipe.Misc_LightWeight_5),

    Misc_Reinforced("Reinforced",
            ModificationRecipe.Misc_Reinforced_1,
            ModificationRecipe.Misc_Reinforced_2,
            ModificationRecipe.Misc_Reinforced_3,
            ModificationRecipe.Misc_Reinforced_4,
            ModificationRecipe.Misc_Reinforced_5),

    Misc_Shielded("Shielded",
            ModificationRecipe.Misc_Shielded_1,
            ModificationRecipe.Misc_Shielded_2,
            ModificationRecipe.Misc_Shielded_3,
            ModificationRecipe.Misc_Shielded_4,
            ModificationRecipe.Misc_Shielded_5),

    Weapon_DoubleShot("Double Shot",
            ModificationRecipe.Weapon_DoubleShot_1,
            ModificationRecipe.Weapon_DoubleShot_2,
            ModificationRecipe.Weapon_DoubleShot_3,
            ModificationRecipe.Weapon_DoubleShot_4,
            ModificationRecipe.Weapon_DoubleShot_5),

    Weapon_Efficient("Efficient",
            ModificationRecipe.Weapon_Efficient_1,
            ModificationRecipe.Weapon_Efficient_2,
            ModificationRecipe.Weapon_Efficient_3,
            ModificationRecipe.Weapon_Efficient_4,
            ModificationRecipe.Weapon_Efficient_5),

    Weapon_Focused("Focused",
            ModificationRecipe.Weapon_Focused_1,
            ModificationRecipe.Weapon_Focused_2,
            ModificationRecipe.Weapon_Focused_3,
            ModificationRecipe.Weapon_Focused_4,
            ModificationRecipe.Weapon_Focused_5),

    Weapon_HighCapacity("High Capacity",
            ModificationRecipe.Weapon_HighCapacity_1,
            ModificationRecipe.Weapon_HighCapacity_2,
            ModificationRecipe.Weapon_HighCapacity_3,
            ModificationRecipe.Weapon_HighCapacity_4,
            ModificationRecipe.Weapon_HighCapacity_5),

    Weapon_LightWeight("Lightweight",
            ModificationRecipe.Weapon_LightWeight_1,
            ModificationRecipe.Weapon_LightWeight_2,
            ModificationRecipe.Weapon_LightWeight_3,
            ModificationRecipe.Weapon_LightWeight_4,
            ModificationRecipe.Weapon_LightWeight_5),

    Weapon_LongRange("Long Range",
            ModificationRecipe.Weapon_LongRange_1,
            ModificationRecipe.Weapon_LongRange_2,
            ModificationRecipe.Weapon_LongRange_3,
            ModificationRecipe.Weapon_LongRange_4,
            ModificationRecipe.Weapon_LongRange_5),

    Weapon_Overcharged("Overcharged",
            ModificationRecipe.Weapon_Overcharged_1,
            ModificationRecipe.Weapon_Overcharged_2,
            ModificationRecipe.Weapon_Overcharged_3,
            ModificationRecipe.Weapon_Overcharged_4,
            ModificationRecipe.Weapon_Overcharged_5),

    Weapon_RapidFire("Rapid Fire",
            ModificationRecipe.Weapon_RapidFire_1,
            ModificationRecipe.Weapon_RapidFire_2,
            ModificationRecipe.Weapon_RapidFire_3,
            ModificationRecipe.Weapon_RapidFire_4,
            ModificationRecipe.Weapon_RapidFire_5),

    Weapon_ShortRange("Short Range",
            ModificationRecipe.Weapon_ShortRange_1,
            ModificationRecipe.Weapon_ShortRange_2,
            ModificationRecipe.Weapon_ShortRange_3,
            ModificationRecipe.Weapon_ShortRange_4,
            ModificationRecipe.Weapon_ShortRange_5),

    Weapon_Sturdy("Sturdy",
            ModificationRecipe.Weapon_Sturdy_1,
            ModificationRecipe.Weapon_Sturdy_2,
            ModificationRecipe.Weapon_Sturdy_3,
            ModificationRecipe.Weapon_Sturdy_4,
            ModificationRecipe.Weapon_Sturdy_5),


    /*
    Suits
    */
    Added_Melee_Damage("Added Melee Damage", ModificationRecipe.Added_Melee_Damage),
    Combat_Movement_Speed("Combat Movement Speed", ModificationRecipe.Combat_Movement_Speed),
    Damage_Resistance("Damage Resistance", ModificationRecipe.Damage_Resistance),
    Enhanced_Tracking("Enhanced Tracking", ModificationRecipe.Enhanced_Tracking),
    Quieter_Footsteps("Quieter Footsteps", ModificationRecipe.Quieter_Footsteps),

    Extra_Ammo_Capacity("Extra Ammo Capacity", ModificationRecipe.Extra_Ammo_Capacity),
    Extra_Backpack_Capacity("Extra Backpack Capacity", ModificationRecipe.suit_backpackcapacity),
    Faster_Shield_Regen("Faster Shield Regen", ModificationRecipe.Faster_Shield_Regen),
    Improved_Battery_Capacity("Improved Battery Capacity", ModificationRecipe.Improved_Battery_Capacity),
    Improved_Jump_Assist("Improved Jump Assist", ModificationRecipe.suit_improvedjumpassist),
    Increased_Air_Reserves("Increased Air Reserves", ModificationRecipe.suit_increasedo2capacity),
    Increased_Sprint_Duration("Increased Sprint Duration", ModificationRecipe.Increased_Sprint_Duration),
    Night_Vision("Night Vision", ModificationRecipe.Night_Vision),
    Reduced_Tool_Battery_Consumption("Reduced Tool Battery Consumption", ModificationRecipe.Reduced_Tool_Battery_Consumption),


    /*
    Personal Weapons
    */
    Faster_Handling("Faster Handling", ModificationRecipe.Faster_Handling),

    Greater_Range_Kinematic("Greater Range", ModificationRecipe.Greater_Range_Kinematic),
    Greater_Range_Manticore("Greater Range", ModificationRecipe.Greater_Range_Manticore),
    Greater_Range_Takada("Greater Range", ModificationRecipe.Greater_Range_Takada),

    Head_Shot_Damage_Kinematic("Head Shot Damage", ModificationRecipe.Head_Shot_Damage_Kinematic),
    Head_Shot_Damage_Manticore("Head Shot Damage", ModificationRecipe.Head_Shot_Damage_Manticore),
    Head_Shot_Damage_Takada("Head Shot Damage", ModificationRecipe.Head_Shot_Damage_Takada),

    Improved_Hip_Fire_Accuracy_Kinematic("Improved Hip Fire Accuracy",
        ModificationRecipe.Improved_Hip_Fire_Accuracy_Kinematic),
    Improved_Hip_Fire_Accuracy_Manticore("Improved Hip Fire Accuracy",
        ModificationRecipe.Improved_Hip_Fire_Accuracy_Manticore),
    Improved_Hip_Fire_Accuracy_Takada("Improved Hip Fire Accuracy",
        ModificationRecipe.Improved_Hip_Fire_Accuracy_Takada),

    Magazine_Size("Magazine Size", ModificationRecipe.Magazine_Size),
    Noise_Suppressor("Noise Suppressor", ModificationRecipe.Noise_Suppressor),
    Audio_Masking("Audio Masking", ModificationRecipe.weapon_suppression_unpressurised),
    Reload_Speed("Reload Speed", ModificationRecipe.Reload_Speed),
    Scope("Scope", ModificationRecipe.Scope),
    Stability("Stability", ModificationRecipe.Stability),
    Stowed_Reloading("Stowed Reloading", ModificationRecipe.Stowed_Reloading),

    Unknown("Unknown")

    ;

    private final TaskRecipe[] recipes;
    private final String text;
    private TaskType taskType = null;

    ModificationBlueprint(String text, TaskRecipe... recipes)
    {
        this.text = text;
        this.recipes = recipes;
        recipeStream().forEach(recipe -> recipe.setParentBlueprintName(this));
    }

    public Stream<TaskRecipe> recipeStream()
    {
        return Arrays.stream(recipes);
    }

    @Override
    public void setParentType(TaskType type)
    {
        taskType = type;
    }

    @Override
    public TaskType getParentType()
    {
        return taskType;
    }

    public Optional<TaskRecipe> byLevel(int level)
    {
        if (level > recipes.length) return Optional.empty();
        return Optional.of(recipes[level-1]);
    }

    @Override
    public String toString()
    {
        return text;
    }
}
