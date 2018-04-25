package com.controllerface.edeps.structures.procurements.experimentals;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/10/2018.
 */
@SuppressWarnings("unchecked")
public enum ExperimentalRecipe implements ProcurementRecipe
{
    Angled_Plating_Armor(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Hull_Boost, -3d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, 8d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.ZIRCONIUM,3)),

    Angled_Plating_Hull(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Hull_Reinforcement, -5d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, 2d)
            ),
            new CostData(Material.TEMPEREDALLOYS, 5),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.CARBON, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3)),

    Auto_Loader(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Auto_Reload_While_Firing, 0d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 4),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 4)),

    Blast_Block(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Optimal_Strength, -1d),
                    new Pair<>(ItemEffect.Explosive_Resitance, 2d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.SELENIUM, 2)),

    Boss_Cells(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Spin_Up_Time, 20d),
                    new Pair<>(ItemEffect.Shield_Reinforcement, 5d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Cluster_Capacitors(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Weapons_Capacity, 8d),
                    new Pair<>(ItemEffect.Weapons_Recharge, -2d),
                    new Pair<>(ItemEffect.Engines_Capacity, 8d),
                    new Pair<>(ItemEffect.Engines_Recharge, -2d),
                    new Pair<>(ItemEffect.Systems_Capacity, 8d),
                    new Pair<>(ItemEffect.Systems_Recharge, -2d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CADMIUM, 1)),

    Concordant_Sequence(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Wing_Shield_Regeneration_Increased, 0d),
                    new Pair<>(ItemEffect.Thermal_Load, 50d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.EMBEDDEDFIRMWARE, 3),
            new CostData(Material.ZIRCONIUM, 1)),

    Corrosive_Shell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Armor_Hardness_Reduced, 0d),
                    new Pair<>(ItemEffect.Ammo_Capacity, -20d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.PRECIPITATEDALLOYS, 4),
            new CostData(Material.ARSENIC, 3)),

    Dazzle_Shell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Sensor_Acuity_Reduced, 0d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.MANGANESE, 4),
            new CostData(Material.HYBRIDCAPACITORS, 5)),

    Deep_Charge(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, 5d),
                    new Pair<>(ItemEffect.Maximum_Fuel_Per_Jump, 10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1)),

    Deep_Plating_Armor(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Hull_Boost, 8d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, -3d),
                    new Pair<>(ItemEffect.Thermal_Resistance, -3d),
                    new Pair<>(ItemEffect.Explosive_Resitance, -3d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.MECHANICALEQUIPMENT, 3),
            new CostData(Material.MOLYBDENUM, 2)),

    Deep_Plating_Hull(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Hull_Boost, 10d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, -2d),
                    new Pair<>(ItemEffect.Thermal_Resistance, -2d),
                    new Pair<>(ItemEffect.Explosive_Resitance, -2d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.MOLYBDENUM, 3),
            new CostData(Material.RUTHENIUM, 2)),

    Dispersal_Field(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Tracking_Reduced, 0d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 5),
            new CostData(Material.HYBRIDCAPACITORS, 5),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 5),
            new CostData(Material.WORNSHIELDEMITTERS, 5)),

    Double_Braced_Shield(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Double_Braced_Thrusters(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Double_Braced_FSD(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 25d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Double_Braced_Power_Plant(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),


    Double_Braced_Distributor(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Double_Braced_Shield_Cell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.YTTRIUM, 1)),

    Double_Braced_Weapon(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.COMPACTCOMPOSITES, 3),
            new CostData(Material.VANADIUM, 1)),

    Double_Braced_Booster(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.SHIELDEMITTERS, 1)),


    Drag_Drives(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Optimal_Multiplier, 4d),
                    new Pair<>(ItemEffect.Thermal_Load, 10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    Drag_Munitions(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Speed_Reduced, 0d)
            ),
            new CostData(Material.CARBON, 5),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.MOLYBDENUM, 2)),

    Drive_Distributors(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Optimal_Mass, 10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    Emissive_Munitions(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Signature_Increased, 0d),
                    new Pair<>(ItemEffect.Thermal_Load, 100d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.EMISSIONDATA, 3),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.MANGANESE, 1)),

    Fast_Charge(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Regen_Rate, 15d),
                    new Pair<>(ItemEffect.Broken_Regen_Rate, 15d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, -1d),
                    new Pair<>(ItemEffect.Thermal_Resistance, -1d),
                    new Pair<>(ItemEffect.Explosive_Resitance, -1d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.COMPOUNDSHIELDING, 1)),

    Feedback_Cascade(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Shield_Cell_Disrupted, 0d),
                    new Pair<>(ItemEffect.Damage, -20d),
                    new Pair<>(ItemEffect.Thermal_Load, -40d)
            ),
            new CostData(Material.SYMMETRICKEYS, 5),
            new CostData(Material.SHIELDEMITTERS, 5),
            new CostData(Material.FILAMENTCOMPOSITES, 5)),

    Flow_Control_Distributor(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, -10d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Flow_Control_Shield_Cell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, -10d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Flow_Control_Weapon(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, -10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),

    Flow_Control_Booster(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, -10d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.FOCUSCRYSTALS, 3),
            new CostData(Material.NIOBIUM, 3)),

    Force_Block_Shield(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Optimal_Multiplier, -3d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, 8d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    Force_Block_Booster(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Optimal_Strength, -1d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, 2d)
            ),
            new CostData(Material.SCANARCHIVES, 5),
            new CostData(Material.SHIELDINGSENSORS, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 2)),

    Force_Shell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Pushed_Off_Course, 0d),
                    new Pair<>(ItemEffect.Shot_Speed, -17d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.ZINC, 5),
            new CostData(Material.PHASEALLOYS, 3),
            new CostData(Material.HEATCONDUCTIONWIRING, 3)),

    FSD_Interrupt(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_FSD_Reboot, 0d),
                    new Pair<>(ItemEffect.Damage, -30d),
                    new Pair<>(ItemEffect.Rate_Of_Fire, -50d)
            ),
            new CostData(Material.WAKESOLUTIONS, 3),
            new CostData(Material.FSDTELEMETRY, 5),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.CONFIGURABLECOMPONENTS, 3)),

    Hi_Cap(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, 10d),
                    new Pair<>(ItemEffect.Optimal_Multiplier, 6d),
                    new Pair<>(ItemEffect.Distributor_Draw, 25d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    High_Yield_Shell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage_Partially_Explosive, 0d),
                    new Pair<>(ItemEffect.Rate_Of_Fire, -10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.CHEMICALMANIPULATORS, 3),
            new CostData(Material.NICKEL, 5)),

    Incendiary_Rounds(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage_Partially_Thermal, 0d),
                    new Pair<>(ItemEffect.Rate_Of_Fire, -5d),
                    new Pair<>(ItemEffect.Thermal_Load, 200d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.PHASEALLOYS, 3)),

    Inertial_Impact(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage_Partially_Kinetic, 0d),
                    new Pair<>(ItemEffect.Damage, 50d),
                    new Pair<>(ItemEffect.Jitter, 3d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5)),

    Ion_Disruption(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Thrusters_Reboot, 0d)
            ),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.CHEMICALDISTILLERY, 3),
            new CostData(Material.ELECTROCHEMICALARRAYS, 3)),

    Layered_Plating_Armor(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Hull_Boost, -3d),
                    new Pair<>(ItemEffect.Explosive_Resitance, 8d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.NIOBIUM, 1)),

    Layered_Plating_Hull(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Hull_Reinforcement, -5d),
                    new Pair<>(ItemEffect.Explosive_Resitance, 2d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.SHIELDINGSENSORS, 3),
            new CostData(Material.TUNGSTEN, 3)),

    Lo_Draw(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, -20d),
                    new Pair<>(ItemEffect.Optimal_Multiplier, -2d),
                    new Pair<>(ItemEffect.Distributor_Draw, -20d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, -1d),
                    new Pair<>(ItemEffect.Thermal_Resistance, -1d),
                    new Pair<>(ItemEffect.Explosive_Resitance, -1d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Mass_Lock_Munition(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_FSD_Inhibited, 0d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 3)),

    Mass_Manager(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -8d),
                    new Pair<>(ItemEffect.Optimal_Mass, 4d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1)),

    Monstered(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Power_Generation, 5d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Multi_Servos(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, 5d),
                    new Pair<>(ItemEffect.Rate_Of_Fire, 3d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.FOCUSCRYSTALS, 4),
            new CostData(Material.CONDUCTIVEPOLYMERS, 2),
            new CostData(Material.CONFIGURABLECOMPONENTS, 2)),

    Multi_weave(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, 10d),
                    new Pair<>(ItemEffect.Distributor_Draw, 25d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, 3d),
                    new Pair<>(ItemEffect.Thermal_Resistance, 3d),
                    new Pair<>(ItemEffect.Explosive_Resitance, 3d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1)),

    Overload_Munitions(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage_Partially_Thermal, 0d)
            ),
            new CostData(Material.FILAMENTCOMPOSITES, 5),
            new CostData(Material.ENCRYPTIONCODES, 4),
            new CostData(Material.SHIELDPATTERNANALYSIS, 2),
            new CostData(Material.GERMANIUM, 3)),

    Oversized(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Power_Draw, 5d),
                    new Pair<>(ItemEffect.Damage, 3d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.RUTHENIUM, 1)),

    Penetrator_Munitions(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Module_Damage, 0d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 5),
            new CostData(Material.ELECTROCHEMICALARRAYS, 3),
            new CostData(Material.ZIRCONIUM, 3)),

    Penetrator_Payload(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Module_Damage, 0d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.TUNGSTEN, 3),
            new CostData(Material.BULKSCANDATA, 5),
            new CostData(Material.SELENIUM, 3)),

    Phasing_Sequence(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Part_Of_Damage_Through_Shields, 0d),
                    new Pair<>(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.SHIELDPATTERNANALYSIS, 3),
            new CostData(Material.NIOBIUM, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 3)),

    Plasma_Slug_Plasma_Accelerator(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Reload_From_Ship_Fuel, 0d),
                    new Pair<>(ItemEffect.Damage, -10d),
                    new Pair<>(ItemEffect.Ammo_Capacity, -100d)
            ),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 2),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new CostData(Material.MERCURY, 4)),

    Plasma_Slug_Rail_Gun(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Reload_From_Ship_Fuel, 0d),
                    new Pair<>(ItemEffect.Damage, -10d),
                    new Pair<>(ItemEffect.Thermal_Load, -40d),
                    new Pair<>(ItemEffect.Ammo_Capacity, -100d)
            ),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 2),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new CostData(Material.MERCURY, 4)),

    Radiant_Canister(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Area_Heat_Increased_Sensors_Disrupted, 0d)
            ),
            new CostData(Material.POLONIUM, 1),
            new CostData(Material.PHASEALLOYS, 3),
            new CostData(Material.HEATDISPERSIONPLATE, 4)),

    Recycling_Cell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Duration, 10d),
                    new Pair<>(ItemEffect.Shield_Reinforcement, -5d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Reflective_Plating_Armor(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Hull_Boost, -3d),
                    new Pair<>(ItemEffect.Thermal_Resistance, 8d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.THERMICALLOYS, 2)),

    Reflective_Plating_Hull(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Hull_Reinforcement, -5d),
                    new Pair<>(ItemEffect.Thermal_Resistance, 2d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.ZINC, 4)),

    Regeneration_Sequence(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Wing_Shield_Regeneration, 0d),
                    new Pair<>(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.SHIELDINGSENSORS, 4),
            new CostData(Material.SHIELDFREQUENCYDATA, 1)),

    Reverberating_Cascade(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Shield_Generator_Damaged, 0d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 2),
            new CostData(Material.SCANDATABANKS, 3),
            new CostData(Material.FILAMENTCOMPOSITES, 4),
            new CostData(Material.CHROMIUM, 4)),

    Scramble_Spectrum(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Module_Malfunction, 0d),
                    new Pair<>(ItemEffect.Rate_Of_Fire, -10d)
            ),
            new CostData(Material.CRYSTALSHARDS, 5),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 5)),

    Screening_Shell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Effectiveness_Increase_Against_Munitions, 0d),
                    new Pair<>(ItemEffect.Reload_Time, -50d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.CONSUMERFIRMWARE, 5),
            new CostData(Material.NIOBIUM, 3)),

    Shift_lock_Canister(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Area_FSD_Reboot, 0d)
            ),
            new CostData(Material.TEMPEREDALLOYS, 5),
            new CostData(Material.WAKESOLUTIONS, 3),
            new CostData(Material.SALVAGEDALLOYS, 5)),

    Smart_Rounds(new ItemEffectData
            (
                    new Pair<>(ItemEffect.No_Damage_To_Untargeted_Ships, 0d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.DECODEDEMISSIONDATA, 3),
            new CostData(Material.SCANDATABANKS, 3)),

    Stripped_Down_Shield(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Thrusters(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_FSD(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Power_Plant(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Distributor(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Shield_Cell(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Weapon(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 5),
            new CostData(Material.CARBON, 5),
            new CostData(Material.TIN, 1)),

    Super_Capacitors(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Optimal_Strength, 5d),
                    new Pair<>(ItemEffect.Kinetic_Resistance, -2d),
                    new Pair<>(ItemEffect.Thermal_Resistance, -2d),
                    new Pair<>(ItemEffect.Explosive_Resitance, -2d)
            ),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.CADMIUM, 2)),

    Super_Conduits(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Weapons_Capacity, -4d),
                    new Pair<>(ItemEffect.Weapons_Recharge, 4d),
                    new Pair<>(ItemEffect.Engines_Capacity, -4d),
                    new Pair<>(ItemEffect.Engines_Recharge, 4d),
                    new Pair<>(ItemEffect.Systems_Capacity, -4d),
                    new Pair<>(ItemEffect.Systems_Recharge, 4d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    Super_Penetrator(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Module_Damage, 0d),
                    new Pair<>(ItemEffect.Thermal_Load, -40d),
                    new Pair<>(ItemEffect.Reload_Time, 50d)
            ),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.SHIELDDENSITYREPORTS, 5)),

    Target_Lock_Breaker(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Loses_Target_Lock, 0d)
            ),
            new CostData(Material.SELENIUM, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1)),

    Thermal_Cascade(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Shielded_Target_Heat_Increased, 0d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HYBRIDCAPACITORS, 4),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.PHOSPHORUS, 5)),

    Thermal_Conduit(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage_Increases_With_Heat_Level, 0d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 5),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.TEMPEREDALLOYS, 5)),

    Thermal_Shock(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Target_Heat_Increased, 0d),
                    new Pair<>(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CONDUCTIVECOMPONENTS, 3),
            new CostData(Material.TUNGSTEN, 3)),

    Thermal_Spread_Thrusters(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 15d),
                    new Pair<>(ItemEffect.Thermal_Load, -10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.HEATVANES, 1)),

    Thermal_Spread_FSD(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Thermal_Load, -10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.GRIDRESISTORS, 3)),

    Thermal_Spread_Power_Plant(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Thermal_Load, -10d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.HEATVANES, 1)),

    Thermal_Vent(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Heat_Reduced_When_Striking_Target, 0d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.CONDUCTIVEPOLYMERS, 3),
            new CostData(Material.PRECIPITATEDALLOYS, 3)),


    Thermo_Block_Shield(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Optimal_Multiplier, -3d),
                    new Pair<>(ItemEffect.Thermal_Resistance, 8d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.HEATVANES, 1)),

    Thermo_Block_Booster(new ItemEffectData
            (
                    new Pair<>(ItemEffect.Optimal_Strength, -1d),
                    new Pair<>(ItemEffect.Thermal_Resistance, 2d)
            ),
            new CostData(Material.BULKSCANDATA, 5),
            new CostData(Material.CONDUCTIVECERAMICS, 3),
            new CostData(Material.HEATVANES, 3));

    private final CostData[] cost;
    private final ItemEffectData effects;

    ExperimentalRecipe(ItemEffectData effects, CostData... cost)
    {
        this.cost = cost;
        this.effects = effects;
    }

    public Stream<CostData> costStream()
    {
        return Arrays.stream(cost);
    }

    public ItemEffectData effects()
    {
        return effects;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }

    @Override
    public String getLabel()
    {
        return Arrays.stream(ExperimentalBlueprint.values())
                .filter(blueprint -> blueprint.recipeStream()
                        .anyMatch(recipe -> recipe.name().equals(name())))
                .map(ExperimentalBlueprint::toString)
                .findFirst().orElse("unknown");
    }

    @Override
    public String getName()
    {
        return name();
    }
}
