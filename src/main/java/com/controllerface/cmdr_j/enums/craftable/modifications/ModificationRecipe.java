package com.controllerface.cmdr_j.enums.craftable.modifications;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.advanced.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.explosive.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.heavyduty.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.kinetic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.thermic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.fastscan.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.longrange.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.wideangle.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.chafflauncher.capacity.ChaffLauncher_ChaffCapacity_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.distributor.eng.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.distributor.highcapacity.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.distributor.highfrequency.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.distributor.shielded.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.distributor.sys.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.distributor.wep.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.fsd.fastboot.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.fsd.longrange.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.fsd.shielded.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.heatsink.capacity.HeatSinkLauncher_HeatSinkCapacity_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.advanced.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.explosive.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.heavyduty.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.kinetic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.thermic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded.FSDinterdictor_Expanded_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded.FSDinterdictor_Expanded_2;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded.FSDinterdictor_Expanded_3;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded.FSDinterdictor_Expanded_4;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange.FSDinterdictor_LongRange_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange.FSDinterdictor_LongRange_2;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange.FSDinterdictor_LongRange_3;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange.FSDinterdictor_LongRange_4;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.lightweight.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.reinforced.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.shielded.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.pointdefense.capacity.PointDefence_PointDefenseCapacity_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.powerplant.armoured.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.powerplant.boosted.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.powerplant.stealth.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.sensors.lightweight.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.sensors.longrange.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.sensors.wideangle.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.explosive.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.heavyduty.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.kinetic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.resistive.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.thermic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.kinetic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.optimised.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.clean.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.dirty.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.reinforced.*;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
public enum ModificationRecipe implements ProcurementRecipe
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

    FSDinterdictor_LongRange_1(new FSDinterdictor_LongRange_1()),
    FSDinterdictor_LongRange_2(new FSDinterdictor_LongRange_2()),
    FSDinterdictor_LongRange_3(new FSDinterdictor_LongRange_3()),
    FSDinterdictor_LongRange_4(new FSDinterdictor_LongRange_4()),


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

    Sensor_Expanded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Expanded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 20d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Expanded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 30d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Expanded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 40d)
            ),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_Expanded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 50d)
            ),
            new CostData(Material.PROTORADIOLICALLOYS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),


    /*
    Shield Cell Bank
     */

    ShieldCellBank_Rapid_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration, -6d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement, 5d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp, -10d)
            ),
            new CostData(Material.SULPHUR, 1)),

    ShieldCellBank_Rapid_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, 15d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration, -12d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement, 10d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp, -20d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    ShieldCellBank_Rapid_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, 20d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration, -18d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement, 15d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp, -30d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.SULPHUR, 1)),

    ShieldCellBank_Specialised_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, -8d),
                    new ItemEffectData(ItemEffect.Integrity, -5d),
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement, 4d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -6d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    ShieldCellBank_Specialised_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, -16d),
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.PowerDraw, 15d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement, 6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -12d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    ShieldCellBank_Specialised_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, -24d),
                    new ItemEffectData(ItemEffect.Integrity, -15d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement, 8d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -18d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 1)),


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

    ShieldGenerator_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 4d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 22.5d),
                    new ItemEffectData(ItemEffect.KineticResistance, 2.7d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 14d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 5.4d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 6d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 37.5d),
                    new ItemEffectData(ItemEffect.KineticResistance, 4.5d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 20d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 9d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 8d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 52.5d),
                    new ItemEffectData(ItemEffect.KineticResistance, 6.3d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 26d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 12.6d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 10d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 67.5d),
                    new ItemEffectData(ItemEffect.KineticResistance, 8.1d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 32d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 16.2d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.MANGANESE, 1)),

    ShieldGenerator_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 12d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 82.5d),
                    new ItemEffectData(ItemEffect.KineticResistance, 9.9d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 38d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 19.8d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.IMPROVISEDCOMPONENTS, 1)),

    ShieldGenerator_Thermic_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 20d),
                    new ItemEffectData(ItemEffect.KineticResistance, -2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 12d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Thermic_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 25d),
                    new ItemEffectData(ItemEffect.KineticResistance, -5d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 24d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1)),

    ShieldGenerator_Thermic_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.KineticResistance, -7d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 36d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.SELENIUM, 1)),

    ShieldGenerator_Thermic_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 35d),
                    new ItemEffectData(ItemEffect.KineticResistance, -10d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 48d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.MERCURY, 1)),

    ShieldGenerator_Thermic_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.KineticResistance, -12d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 60d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.RUTHENIUM, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ;

    private final ProcurementRecipe delegate;

    private String parentBlueprintName;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;

    public static Icon icon = new Icon(UIFunctions.Icons.engineering, 25, 30);

    ModificationRecipe(@NotNull ProcurementRecipe delegate)
    {
        this.delegate = delegate;

        this.grade = null;
        this.cost = null;
        this.effects = null;
    }

    ModificationRecipe(ItemGrade grade, ItemEffects effects, CostData... cost)
    {
        this.delegate = null;

        this.grade = grade;
        this.effects = effects;
        this.cost = cost;
        Arrays.stream(cost).forEach(c->c.getCost().associate(this));
    }

    @Override
    public ItemGrade getGrade()
    {
        if (delegate == null) return grade;
        else return delegate.getGrade();
    }

    public Stream<CostData> costStream()
    {
        if (delegate ==null) return Arrays.stream(cost);
        else return delegate.costStream();
    }

    public ItemEffects effects()
    {
        if (delegate == null) return effects;
        else return delegate.effects();
    }

    @Override
    public void setParentBlueprintName(String parentBlueprintName)
    {
        if (delegate == null) this.parentBlueprintName = parentBlueprintName;
        else delegate.setParentBlueprintName(parentBlueprintName);
    }

    @Override
    public String toString()
    {
        if (delegate == null) return super.toString().replace("_"," ");
        else return delegate.toString();
    }

    @Override
    public String getShortLabel()
    {
        if (delegate == null) return grade.toString();
        else return delegate.getShortLabel();
    }

    @Override
    public String getDisplayLabel()
    {
        if (delegate == null) return getShortLabel() + " :: " +  parentBlueprintName;
        return delegate.getDisplayLabel();
    }

    @Override
    public String getName()
    {
        if (delegate == null) return name();
        else return delegate.getName();
    }

    @Override
    public Icon getIcon()
    {
        if (delegate == null) return icon;
        else return delegate.getIcon();
    }
}
