package com.controllerface.cmdr_j.enums.craftable.modifications;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.armour.advanced.*;
import com.controllerface.cmdr_j.classes.recipes.armour.explosive.*;
import com.controllerface.cmdr_j.classes.recipes.armour.heavyduty.*;
import com.controllerface.cmdr_j.classes.recipes.armour.kinetic.*;
import com.controllerface.cmdr_j.classes.recipes.armour.thermic.*;
import com.controllerface.cmdr_j.classes.recipes.chafflauncher.capacity.ChaffLauncher_ChaffCapacity_1;
import com.controllerface.cmdr_j.classes.recipes.distributor.eng.*;
import com.controllerface.cmdr_j.classes.recipes.distributor.highcapacity.*;
import com.controllerface.cmdr_j.classes.recipes.distributor.highfrequency.*;
import com.controllerface.cmdr_j.classes.recipes.distributor.shielded.*;
import com.controllerface.cmdr_j.classes.recipes.distributor.sys.*;
import com.controllerface.cmdr_j.classes.recipes.distributor.wep.*;
import com.controllerface.cmdr_j.classes.recipes.fsd.fastboot.*;
import com.controllerface.cmdr_j.classes.recipes.fsd.longrange.*;
import com.controllerface.cmdr_j.classes.recipes.fsd.shielded.*;
import com.controllerface.cmdr_j.classes.recipes.heatsink.capacity.HeatSinkLauncher_HeatSinkCapacity_1;
import com.controllerface.cmdr_j.classes.recipes.hullreinforcement.advanced.*;
import com.controllerface.cmdr_j.classes.recipes.hullreinforcement.explosive.*;
import com.controllerface.cmdr_j.classes.recipes.hullreinforcement.heavyduty.*;
import com.controllerface.cmdr_j.classes.recipes.hullreinforcement.kinetic.*;
import com.controllerface.cmdr_j.classes.recipes.hullreinforcement.thermic.*;
import com.controllerface.cmdr_j.classes.recipes.interdictor.expanded.*;
import com.controllerface.cmdr_j.classes.recipes.interdictor.longrange.*;
import com.controllerface.cmdr_j.classes.recipes.misc.fastscan.*;
import com.controllerface.cmdr_j.classes.recipes.misc.lightweight.*;
import com.controllerface.cmdr_j.classes.recipes.misc.longrange.*;
import com.controllerface.cmdr_j.classes.recipes.misc.reinforced.*;
import com.controllerface.cmdr_j.classes.recipes.misc.shielded.*;
import com.controllerface.cmdr_j.classes.recipes.misc.wideangle.*;
import com.controllerface.cmdr_j.classes.recipes.personal.suit.*;
import com.controllerface.cmdr_j.classes.recipes.personal.weapons.*;
import com.controllerface.cmdr_j.classes.recipes.pointdefense.capacity.PointDefence_PointDefenseCapacity_1;
import com.controllerface.cmdr_j.classes.recipes.powerplant.armoured.*;
import com.controllerface.cmdr_j.classes.recipes.powerplant.boosted.*;
import com.controllerface.cmdr_j.classes.recipes.powerplant.stealth.*;
import com.controllerface.cmdr_j.classes.recipes.sensors.lightweight.*;
import com.controllerface.cmdr_j.classes.recipes.sensors.longrange.*;
import com.controllerface.cmdr_j.classes.recipes.sensors.wideangle.*;
import com.controllerface.cmdr_j.classes.recipes.shieldbooster.explosive.*;
import com.controllerface.cmdr_j.classes.recipes.shieldbooster.heavyduty.*;
import com.controllerface.cmdr_j.classes.recipes.shieldbooster.kinetic.*;
import com.controllerface.cmdr_j.classes.recipes.shieldbooster.resistive.*;
import com.controllerface.cmdr_j.classes.recipes.shieldbooster.thermic.*;
import com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid.ShieldCellBank_Rapid_1;
import com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid.ShieldCellBank_Rapid_2;
import com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid.ShieldCellBank_Rapid_3;
import com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid.ShieldCellBank_Rapid_4;
import com.controllerface.cmdr_j.classes.recipes.shieldcellbank.specialized.ShieldCellBank_Specialized_1;
import com.controllerface.cmdr_j.classes.recipes.shieldcellbank.specialized.ShieldCellBank_Specialized_2;
import com.controllerface.cmdr_j.classes.recipes.shieldcellbank.specialized.ShieldCellBank_Specialized_3;
import com.controllerface.cmdr_j.classes.recipes.shieldcellbank.specialized.ShieldCellBank_Specialized_4;
import com.controllerface.cmdr_j.classes.recipes.shieldgenerator.kinetic.*;
import com.controllerface.cmdr_j.classes.recipes.shieldgenerator.optimised.*;
import com.controllerface.cmdr_j.classes.recipes.shieldgenerator.reinforced.*;
import com.controllerface.cmdr_j.classes.recipes.shieldgenerator.thermic.*;
import com.controllerface.cmdr_j.classes.recipes.surfacescanner.expanded.*;
import com.controllerface.cmdr_j.classes.recipes.thrusters.clean.*;
import com.controllerface.cmdr_j.classes.recipes.thrusters.dirty.*;
import com.controllerface.cmdr_j.classes.recipes.thrusters.reinforced.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.doubleshot.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.efficient.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.focused.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.highcapacity.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.lightweight.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.longrange.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.overcharged.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.rapidfire.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.shortrange.*;
import com.controllerface.cmdr_j.classes.recipes.weapons.sturdy.*;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
public enum ModificationRecipe implements TaskRecipe
{
    /*
    Chaff Launcher
     */

    ChaffLauncher_ChaffCapacity_1(new ChaffLauncher_ChaffCapacity_1()),


    /*
    Heat Sink Launcher
     */

    HeatSinkLauncher_HeatSinkCapacity_1(new HeatSinkLauncher_HeatSinkCapacity_1()),


    /*
    Point Defense Turret
     */

    PointDefence_PointDefenseCapacity_1(new PointDefence_PointDefenseCapacity_1()),


    /*
    Miscellaneous/Common Effects: Used on several different modules
     */

    Misc_LightWeight_1(new Misc_LightWeight_1()),
    Misc_LightWeight_2(new Misc_LightWeight_2()),
    Misc_LightWeight_3(new Misc_LightWeight_3()),
    Misc_LightWeight_4(new Misc_LightWeight_4()),
    Misc_LightWeight_5(new Misc_LightWeight_5()),

    Misc_Reinforced_1(new Misc_Reinforced_1()),
    Misc_Reinforced_2(new Misc_Reinforced_2()),
    Misc_Reinforced_3(new Misc_Reinforced_3()),
    Misc_Reinforced_4(new Misc_Reinforced_4()),
    Misc_Reinforced_5(new Misc_Reinforced_5()),

    Misc_Shielded_1(new Misc_Shielded_1()),
    Misc_Shielded_2(new Misc_Shielded_2()),
    Misc_Shielded_3(new Misc_Shielded_3()),
    Misc_Shielded_4(new Misc_Shielded_4()),
    Misc_Shielded_5(new Misc_Shielded_5()),


    /*
    Miscellaneous Sensors/Scanners: Used on different sensor/scanner modules that are NOT ships sensors/radar
     */

    Sensor_Misc_FastScan_1(new Sensor_Misc_FastScan_1()),
    Sensor_Misc_FastScan_2(new Sensor_Misc_FastScan_2()),
    Sensor_Misc_FastScan_3(new Sensor_Misc_FastScan_3()),
    Sensor_Misc_FastScan_4(new Sensor_Misc_FastScan_4()),
    Sensor_Misc_FastScan_5(new Sensor_Misc_FastScan_5()),

    Sensor_Misc_LongRange_1(new Sensor_Misc_LongRange_1()),
    Sensor_Misc_LongRange_2(new Sensor_Misc_LongRange_2()),
    Sensor_Misc_LongRange_3(new Sensor_Misc_LongRange_3()),
    Sensor_Misc_LongRange_4(new Sensor_Misc_LongRange_4()),
    Sensor_Misc_LongRange_5(new Sensor_Misc_LongRange_5()),

    Sensor_Misc_WideAngle_1(new Sensor_Misc_WideAngle_1()),
    Sensor_Misc_WideAngle_2(new Sensor_Misc_WideAngle_2()),
    Sensor_Misc_WideAngle_3(new Sensor_Misc_WideAngle_3()),
    Sensor_Misc_WideAngle_4(new Sensor_Misc_WideAngle_4()),
    Sensor_Misc_WideAngle_5(new Sensor_Misc_WideAngle_5()),


    /*
    Armour
     */

    Armour_Advanced_1(new Armour_Advanced_1()),
    Armour_Advanced_2(new Armour_Advanced_2()),
    Armour_Advanced_3(new Armour_Advanced_3()),
    Armour_Advanced_4(new Armour_Advanced_4()),
    Armour_Advanced_5(new Armour_Advanced_5()),

    Armour_Explosive_1(new Armour_Explosive_1()),
    Armour_Explosive_2(new Armour_Explosive_2()),
    Armour_Explosive_3(new Armour_Explosive_3()),
    Armour_Explosive_4(new Armour_Explosive_4()),
    Armour_Explosive_5(new Armour_Explosive_5()),

    Armour_HeavyDuty_1(new Armour_HeavyDuty_1()),
    Armour_HeavyDuty_2(new Armour_HeavyDuty_2()),
    Armour_HeavyDuty_3(new Armour_HeavyDuty_3()),
    Armour_HeavyDuty_4(new Armour_HeavyDuty_4()),
    Armour_HeavyDuty_5(new Armour_HeavyDuty_5()),

    Armour_Kinetic_1(new Armour_Kinetic_1()),
    Armour_Kinetic_2(new Armour_Kinetic_2()),
    Armour_Kinetic_3(new Armour_Kinetic_3()),
    Armour_Kinetic_4(new Armour_Kinetic_4()),
    Armour_Kinetic_5(new Armour_Kinetic_5()),

    Armour_Thermic_1(new Armour_Thermic_1()),
    Armour_Thermic_2(new Armour_Thermic_2()),
    Armour_Thermic_3(new Armour_Thermic_3()),
    Armour_Thermic_4(new Armour_Thermic_4()),
    Armour_Thermic_5(new Armour_Thermic_5()),


    /*
    Shield Booster
     */

    ShieldBooster_Explosive_1(new ShieldBooster_Explosive_1()),
    ShieldBooster_Explosive_2(new ShieldBooster_Explosive_2()),
    ShieldBooster_Explosive_3(new ShieldBooster_Explosive_3()),
    ShieldBooster_Explosive_4(new ShieldBooster_Explosive_4()),
    ShieldBooster_Explosive_5(new ShieldBooster_Explosive_5()),

    ShieldBooster_HeavyDuty_1(new ShieldBooster_HeavyDuty_1()),
    ShieldBooster_HeavyDuty_2(new ShieldBooster_HeavyDuty_2()),
    ShieldBooster_HeavyDuty_3(new ShieldBooster_HeavyDuty_3()),
    ShieldBooster_HeavyDuty_4(new ShieldBooster_HeavyDuty_4()),
    ShieldBooster_HeavyDuty_5(new ShieldBooster_HeavyDuty_5()),

    ShieldBooster_Kinetic_1(new ShieldBooster_Kinetic_1()),
    ShieldBooster_Kinetic_2(new ShieldBooster_Kinetic_2()),
    ShieldBooster_Kinetic_3(new ShieldBooster_Kinetic_3()),
    ShieldBooster_Kinetic_4(new ShieldBooster_Kinetic_4()),
    ShieldBooster_Kinetic_5(new ShieldBooster_Kinetic_5()),

    ShieldBooster_Resistive_1(new ShieldBooster_Resistive_1()),
    ShieldBooster_Resistive_2(new ShieldBooster_Resistive_2()),
    ShieldBooster_Resistive_3(new ShieldBooster_Resistive_3()),
    ShieldBooster_Resistive_4(new ShieldBooster_Resistive_4()),
    ShieldBooster_Resistive_5(new ShieldBooster_Resistive_5()),

    ShieldBooster_Thermic_1(new ShieldBooster_Thermic_1()),
    ShieldBooster_Thermic_2(new ShieldBooster_Thermic_2()),
    ShieldBooster_Thermic_3(new ShieldBooster_Thermic_3()),
    ShieldBooster_Thermic_4(new ShieldBooster_Thermic_4()),
    ShieldBooster_Thermic_5(new ShieldBooster_Thermic_5()),


    /*
    Thrusters
     */

    Engine_Dirty_1(new Engine_Dirty_1()),
    Engine_Dirty_2(new Engine_Dirty_2()),
    Engine_Dirty_3(new Engine_Dirty_3()),
    Engine_Dirty_4(new Engine_Dirty_4()),
    Engine_Dirty_5(new Engine_Dirty_5()),

    Engine_Reinforced_1(new Engine_Reinforced_1()),
    Engine_Reinforced_2(new Engine_Reinforced_2()),
    Engine_Reinforced_3(new Engine_Reinforced_3()),
    Engine_Reinforced_4(new Engine_Reinforced_4()),
    Engine_Reinforced_5(new Engine_Reinforced_5()),

    Engine_Tuned_1(new Engine_Tuned_1()),
    Engine_Tuned_2(new Engine_Tuned_2()),
    Engine_Tuned_3(new Engine_Tuned_3()),
    Engine_Tuned_4(new Engine_Tuned_4()),
    Engine_Tuned_5(new Engine_Tuned_5()),


    /*
    Frame Shift Drive
     */

    FSD_FastBoot_1(new FSD_FastBoot_1()),
    FSD_FastBoot_2(new FSD_FastBoot_2()),
    FSD_FastBoot_3(new FSD_FastBoot_3()),
    FSD_FastBoot_4(new FSD_FastBoot_4()),
    FSD_FastBoot_5(new FSD_FastBoot_5()),

    FSD_LongRange_1(new FSD_LongRange_1()),
    FSD_LongRange_2(new FSD_LongRange_2()),
    FSD_LongRange_3(new FSD_LongRange_3()),
    FSD_LongRange_4(new FSD_LongRange_4()),
    FSD_LongRange_5(new FSD_LongRange_5()),

    FSD_Shielded_1(new FSD_Shielded_1()),
    FSD_Shielded_2(new FSD_Shielded_2()),
    FSD_Shielded_3(new FSD_Shielded_3()),
    FSD_Shielded_4(new FSD_Shielded_4()),
    FSD_Shielded_5(new FSD_Shielded_5()),


    /*
    FSD Interdictor
     */

    FSDinterdictor_Expanded_1(new FSDinterdictor_Expanded_1()),
    FSDinterdictor_Expanded_2(new FSDinterdictor_Expanded_2()),
    FSDinterdictor_Expanded_3(new FSDinterdictor_Expanded_3()),
    FSDinterdictor_Expanded_4(new FSDinterdictor_Expanded_4()),
    FSDinterdictor_Expanded_5(new FSDinterdictor_Expanded_5()),

    FSDinterdictor_LongRange_1(new FSDinterdictor_LongRange_1()),
    FSDinterdictor_LongRange_2(new FSDinterdictor_LongRange_2()),
    FSDinterdictor_LongRange_3(new FSDinterdictor_LongRange_3()),
    FSDinterdictor_LongRange_4(new FSDinterdictor_LongRange_4()),
    FSDinterdictor_LongRange_5(new FSDinterdictor_LongRange_5()),


    /*
    Hull Reinforcements
     */

    HullReinforcement_Advanced_1(new HullReinforcement_Advanced_1()),
    HullReinforcement_Advanced_2(new HullReinforcement_Advanced_2()),
    HullReinforcement_Advanced_3(new HullReinforcement_Advanced_3()),
    HullReinforcement_Advanced_4(new HullReinforcement_Advanced_4()),
    HullReinforcement_Advanced_5(new HullReinforcement_Advanced_5()),

    HullReinforcement_Explosive_1(new HullReinforcement_Explosive_1()),
    HullReinforcement_Explosive_2(new HullReinforcement_Explosive_2()),
    HullReinforcement_Explosive_3(new HullReinforcement_Explosive_3()),
    HullReinforcement_Explosive_4(new HullReinforcement_Explosive_4()),
    HullReinforcement_Explosive_5(new HullReinforcement_Explosive_5()),

    HullReinforcement_HeavyDuty_1(new HullReinforcement_HeavyDuty_1()),
    HullReinforcement_HeavyDuty_2(new HullReinforcement_HeavyDuty_2()),
    HullReinforcement_HeavyDuty_3(new HullReinforcement_HeavyDuty_3()),
    HullReinforcement_HeavyDuty_4(new HullReinforcement_HeavyDuty_4()),
    HullReinforcement_HeavyDuty_5(new HullReinforcement_HeavyDuty_5()),

    HullReinforcement_Kinetic_1(new HullReinforcement_Kinetic_1()),
    HullReinforcement_Kinetic_2(new HullReinforcement_Kinetic_2()),
    HullReinforcement_Kinetic_3(new HullReinforcement_Kinetic_3()),
    HullReinforcement_Kinetic_4(new HullReinforcement_Kinetic_4()),
    HullReinforcement_Kinetic_5(new HullReinforcement_Kinetic_5()),

    HullReinforcement_Thermic_1(new HullReinforcement_Thermic_1()),
    HullReinforcement_Thermic_2(new HullReinforcement_Thermic_2()),
    HullReinforcement_Thermic_3(new HullReinforcement_Thermic_3()),
    HullReinforcement_Thermic_4(new HullReinforcement_Thermic_4()),
    HullReinforcement_Thermic_5(new HullReinforcement_Thermic_5()),


    /*
    Power Distributor
     */

    PowerDistributor_HighCapacity_1(new PowerDistributor_HighCapacity_1()),
    PowerDistributor_HighCapacity_2(new PowerDistributor_HighCapacity_2()),
    PowerDistributor_HighCapacity_3(new PowerDistributor_HighCapacity_3()),
    PowerDistributor_HighCapacity_4(new PowerDistributor_HighCapacity_4()),
    PowerDistributor_HighCapacity_5(new PowerDistributor_HighCapacity_5()),

    PowerDistributor_HighFrequency_1(new PowerDistributor_HighFrequency_1()),
    PowerDistributor_HighFrequency_2(new PowerDistributor_HighFrequency_2()),
    PowerDistributor_HighFrequency_3(new PowerDistributor_HighFrequency_3()),
    PowerDistributor_HighFrequency_4(new PowerDistributor_HighFrequency_4()),
    PowerDistributor_HighFrequency_5(new PowerDistributor_HighFrequency_5()),

    PowerDistributor_PriorityEngines_1(new PowerDistributor_PriorityEngines_1()),
    PowerDistributor_PriorityEngines_2(new PowerDistributor_PriorityEngines_2()),
    PowerDistributor_PriorityEngines_3(new PowerDistributor_PriorityEngines_3()),
    PowerDistributor_PriorityEngines_4(new PowerDistributor_PriorityEngines_4()),
    PowerDistributor_PriorityEngines_5(new PowerDistributor_PriorityEngines_5()),

    PowerDistributor_PrioritySystems_1(new PowerDistributor_PrioritySystems_1()),
    PowerDistributor_PrioritySystems_2(new PowerDistributor_PrioritySystems_2()),
    PowerDistributor_PrioritySystems_3(new PowerDistributor_PrioritySystems_3()),
    PowerDistributor_PrioritySystems_4(new PowerDistributor_PrioritySystems_4()),
    PowerDistributor_PrioritySystems_5(new PowerDistributor_PrioritySystems_5()),

    PowerDistributor_PriorityWeapons_1(new PowerDistributor_PriorityWeapons_1()),
    PowerDistributor_PriorityWeapons_2(new PowerDistributor_PriorityWeapons_2()),
    PowerDistributor_PriorityWeapons_3(new PowerDistributor_PriorityWeapons_3()),
    PowerDistributor_PriorityWeapons_4(new PowerDistributor_PriorityWeapons_4()),
    PowerDistributor_PriorityWeapons_5(new PowerDistributor_PriorityWeapons_5()),

    PowerDistributor_Shielded_1(new PowerDistributor_Shielded_1()),
    PowerDistributor_Shielded_2(new PowerDistributor_Shielded_2()),
    PowerDistributor_Shielded_3(new PowerDistributor_Shielded_3()),
    PowerDistributor_Shielded_4(new PowerDistributor_Shielded_4()),
    PowerDistributor_Shielded_5(new PowerDistributor_Shielded_5()),


    /*
    Power Plant
     */

    PowerPlant_Armoured_1(new PowerPlant_Armoured_1()),
    PowerPlant_Armoured_2(new PowerPlant_Armoured_2()),
    PowerPlant_Armoured_3(new PowerPlant_Armoured_3()),
    PowerPlant_Armoured_4(new PowerPlant_Armoured_4()),
    PowerPlant_Armoured_5(new PowerPlant_Armoured_5()),

    PowerPlant_Boosted_1(new PowerPlant_Boosted_1()),
    PowerPlant_Boosted_2(new PowerPlant_Boosted_2()),
    PowerPlant_Boosted_3(new PowerPlant_Boosted_3()),
    PowerPlant_Boosted_4(new PowerPlant_Boosted_4()),
    PowerPlant_Boosted_5(new PowerPlant_Boosted_5()),

    PowerPlant_Stealth_1(new PowerPlant_Stealth_1()),
    PowerPlant_Stealth_2(new PowerPlant_Stealth_2()),
    PowerPlant_Stealth_3(new PowerPlant_Stealth_3()),
    PowerPlant_Stealth_4(new PowerPlant_Stealth_4()),
    PowerPlant_Stealth_5(new PowerPlant_Stealth_5()),


    /*
    Ship Sensors
     */

    Sensor_LightWeight_1(new Sensor_LightWeight_1()),
    Sensor_LightWeight_2(new Sensor_LightWeight_2()),
    Sensor_LightWeight_3(new Sensor_LightWeight_3()),
    Sensor_LightWeight_4(new Sensor_LightWeight_4()),
    Sensor_LightWeight_5(new Sensor_LightWeight_5()),

    Sensor_LongRange_1(new Sensor_LongRange_1()),
    Sensor_LongRange_2(new Sensor_LongRange_2()),
    Sensor_LongRange_3(new Sensor_LongRange_3()),
    Sensor_LongRange_4(new Sensor_LongRange_4()),
    Sensor_LongRange_5(new Sensor_LongRange_5()),

    Sensor_WideAngle_1(new Sensor_WideAngle_1()),
    Sensor_WideAngle_2(new Sensor_WideAngle_2()),
    Sensor_WideAngle_3(new Sensor_WideAngle_3()),
    Sensor_WideAngle_4(new Sensor_WideAngle_4()),
    Sensor_WideAngle_5(new Sensor_WideAngle_5()),


    /*
    Detailed Surface Scanner
     */

    Sensor_Expanded_1(new Sensor_Misc_Expanded_1()),
    Sensor_Expanded_2(new Sensor_Misc_Expanded_2()),
    Sensor_Expanded_3(new Sensor_Misc_Expanded_3()),
    Sensor_Expanded_4(new Sensor_Misc_Expanded_4()),
    Sensor_Expanded_5(new Sensor_Misc_Expanded_5()),



    /*
    Shield Cell Bank
     */

    ShieldCellBank_Rapid_1(new ShieldCellBank_Rapid_1()),
    ShieldCellBank_Rapid_2(new ShieldCellBank_Rapid_2()),
    ShieldCellBank_Rapid_3(new ShieldCellBank_Rapid_3()),
    ShieldCellBank_Rapid_4(new ShieldCellBank_Rapid_4()),

    ShieldCellBank_Specialised_1(new ShieldCellBank_Specialized_1()),
    ShieldCellBank_Specialised_2(new ShieldCellBank_Specialized_2()),
    ShieldCellBank_Specialised_3(new ShieldCellBank_Specialized_3()),
    ShieldCellBank_Specialised_4(new ShieldCellBank_Specialized_4()),


    /*
    Shield Generator
     */

    ShieldGenerator_Kinetic_1(new ShieldGenerator_Kinetic_1()),
    ShieldGenerator_Kinetic_2(new ShieldGenerator_Kinetic_2()),
    ShieldGenerator_Kinetic_3(new ShieldGenerator_Kinetic_3()),
    ShieldGenerator_Kinetic_4(new ShieldGenerator_Kinetic_4()),
    ShieldGenerator_Kinetic_5(new ShieldGenerator_Kinetic_5()),

    ShieldGenerator_Optimised_1(new ShieldGenerator_Optimised_1()),
    ShieldGenerator_Optimised_2(new ShieldGenerator_Optimised_2()),
    ShieldGenerator_Optimised_3(new ShieldGenerator_Optimised_3()),
    ShieldGenerator_Optimised_4(new ShieldGenerator_Optimised_4()),
    ShieldGenerator_Optimised_5(new ShieldGenerator_Optimised_5()),

    ShieldGenerator_Reinforced_1(new ShieldGenerator_Reinforced_1()),
    ShieldGenerator_Reinforced_2(new ShieldGenerator_Reinforced_2()),
    ShieldGenerator_Reinforced_3(new ShieldGenerator_Reinforced_3()),
    ShieldGenerator_Reinforced_4(new ShieldGenerator_Reinforced_4()),
    ShieldGenerator_Reinforced_5(new ShieldGenerator_Reinforced_5()),

    ShieldGenerator_Thermic_1(new ShieldGenerator_Thermic_1()),
    ShieldGenerator_Thermic_2(new ShieldGenerator_Thermic_2()),
    ShieldGenerator_Thermic_3(new ShieldGenerator_Thermic_3()),
    ShieldGenerator_Thermic_4(new ShieldGenerator_Thermic_4()),
    ShieldGenerator_Thermic_5(new ShieldGenerator_Thermic_5()),



    /*
    Ship Weapons
     */

    Weapon_DoubleShot_1(new Weapon_DoubleShot_1()),
    Weapon_DoubleShot_2(new Weapon_DoubleShot_2()),
    Weapon_DoubleShot_3(new Weapon_DoubleShot_3()),
    Weapon_DoubleShot_4(new Weapon_DoubleShot_4()),
    Weapon_DoubleShot_5(new Weapon_DoubleShot_5()),

    Weapon_Efficient_1(new Weapon_Efficient_1()),
    Weapon_Efficient_2(new Weapon_Efficient_2()),
    Weapon_Efficient_3(new Weapon_Efficient_3()),
    Weapon_Efficient_4(new Weapon_Efficient_4()),
    Weapon_Efficient_5(new Weapon_Efficient_5()),

    Weapon_Focused_1(new Weapon_Focused_1()),
    Weapon_Focused_2(new Weapon_Focused_2()),
    Weapon_Focused_3(new Weapon_Focused_3()),
    Weapon_Focused_4(new Weapon_Focused_4()),
    Weapon_Focused_5(new Weapon_Focused_5()),

    Weapon_HighCapacity_1(new Weapon_HighCapacity_1()),
    Weapon_HighCapacity_2(new Weapon_HighCapacity_2()),
    Weapon_HighCapacity_3(new Weapon_HighCapacity_3()),
    Weapon_HighCapacity_4(new Weapon_HighCapacity_4()),
    Weapon_HighCapacity_5(new Weapon_HighCapacity_5()),

    Weapon_LightWeight_1(new Weapon_LightWeight_1()),
    Weapon_LightWeight_2(new Weapon_LightWeight_2()),
    Weapon_LightWeight_3(new Weapon_LightWeight_3()),
    Weapon_LightWeight_4(new Weapon_LightWeight_4()),
    Weapon_LightWeight_5(new Weapon_LightWeight_5()),

    Weapon_LongRange_1(new Weapon_LongRange_1()),
    Weapon_LongRange_2(new Weapon_LongRange_2()),
    Weapon_LongRange_3(new Weapon_LongRange_3()),
    Weapon_LongRange_4(new Weapon_LongRange_4()),
    Weapon_LongRange_5(new Weapon_LongRange_5()),

    Weapon_Overcharged_1(new Weapon_Overcharged_1()),
    Weapon_Overcharged_2(new Weapon_Overcharged_2()),
    Weapon_Overcharged_3(new Weapon_Overcharged_3()),
    Weapon_Overcharged_4(new Weapon_Overcharged_4()),
    Weapon_Overcharged_5(new Weapon_Overcharged_5()),

    Weapon_RapidFire_1(new Weapon_RapidFire_1()),
    Weapon_RapidFire_2(new Weapon_RapidFire_2()),
    Weapon_RapidFire_3(new Weapon_RapidFire_3()),
    Weapon_RapidFire_4(new Weapon_RapidFire_4()),
    Weapon_RapidFire_5(new Weapon_RapidFire_5()),

    Weapon_ShortRange_1(new Weapon_ShortRange_1()),
    Weapon_ShortRange_2(new Weapon_ShortRange_2()),
    Weapon_ShortRange_3(new Weapon_ShortRange_3()),
    Weapon_ShortRange_4(new Weapon_ShortRange_4()),
    Weapon_ShortRange_5(new Weapon_ShortRange_5()),

    Weapon_Sturdy_1(new Weapon_Sturdy_1()),
    Weapon_Sturdy_2(new Weapon_Sturdy_2()),
    Weapon_Sturdy_3(new Weapon_Sturdy_3()),
    Weapon_Sturdy_4(new Weapon_Sturdy_4()),
    Weapon_Sturdy_5(new Weapon_Sturdy_5()),


    /*
    Suits
     */

    // todo: below enum names do not all match the journal item names
    //  this will need to be fixed over time as the journal name for
    //  each mod is learned.

    // offense
    Added_Melee_Damage(new AddedMeleeDamage()),
    Combat_Movement_Speed(new CombatMovementSpeed()),
    Extra_Ammo_Capacity(new ExtraAmmoCapacity()),

    // defense
    Damage_Resistance(new DamageResistance()),
    Faster_Shield_Regen(new FasterShieldRegen()),

    // movement
    suit_improvedjumpassist(new ImprovedJumpAssist()),
    Increased_Sprint_Duration(new IncreasedSprintDuration()),

    // battery
    Improved_Battery_Capacity(new ImprovedBatteryCapacity()),
    Reduced_Tool_Battery_Consumption(new ReducedToolBatteryConsumption()),

    // tactical
    Enhanced_Tracking(new EnhancedTracking()),
    Night_Vision(new NightVision()),
    Quieter_Footsteps(new QuieterFootsteps()),

    // storage
    suit_backpackcapacity(new ExtraBackpackCapacity()),
    suit_increasedo2capacity(new IncreasedAirReserves()),


    /*
    Personal Weapons
     */

    // handling
    Faster_Handling(new FasterHandling()),
    Stability(new Stability()),
    Reload_Speed(new ReloadSpeed()),

    // distance
    Scope(new Scope()),

    Greater_Range_Kinematic(new GreaterRange_Kinematic()),
    Greater_Range_Manticore(new GreaterRange_Manticore()),
    Greater_Range_Takada(new GreaterRange_Takada()),

    // ammunition
    Magazine_Size(new MagazineSize()),
    Stowed_Reloading(new StowedReloading()),

    // precision
    Head_Shot_Damage_Kinematic(new HeadShotDamage_Kinematic()),
    Head_Shot_Damage_Manticore(new HeadShotDamage_Manticore()),
    Head_Shot_Damage_Takada(new HeadShotDamage_Takada()),

    Improved_Hip_Fire_Accuracy_Kinematic(new ImprovedHipFireAccuracy_Kinematic()),
    Improved_Hip_Fire_Accuracy_Manticore(new ImprovedHipFireAccuracy_Manticore()),
    Improved_Hip_Fire_Accuracy_Takada(new ImprovedHipFireAccuracy_Takada()),

    Noise_Suppressor(new NoiseSuppressor()),
    weapon_suppression_unpressurised(new AudioMasking()),


    ;

    private final TaskRecipe delegate;

    ModificationRecipe(TaskRecipe delegate)
    {
        this.delegate = delegate;
        delegate.costStream().forEach(c->c.cost.associate(this));
    }

    @Override
    public ItemGrade getGrade()
    {
        return delegate.getGrade();
    }

    public Stream<CostData> costStream()
    {
        return delegate.costStream();
    }

    public ItemEffects effects()
    {
        return delegate.effects();
    }

    @Override
    public void setParentBlueprintName(TaskBlueprint blueprint)
    {
        delegate.setParentBlueprintName(blueprint);
    }

    @Override
    public TaskBlueprint getParentBlueprint()
    {
        return delegate.getParentBlueprint();
    }

    @Override
    public String toString()
    {
        return delegate.toString();
    }

    @Override
    public String getShortLabel()
    {
        return delegate.getShortLabel();
    }

    @Override
    public String getDisplayLabel()
    {
        return delegate.getDisplayLabel();
    }

    @Override
    public String getName()
    {
        return delegate.getName();
    }

    public static Optional<ModificationRecipe> byName(String name)
    {
        return Arrays.stream(values())
            .filter(v->v.name().equals(name))
            .findFirst();
    }
}
