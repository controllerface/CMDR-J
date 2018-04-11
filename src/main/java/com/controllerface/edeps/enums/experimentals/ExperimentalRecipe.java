package com.controllerface.edeps.enums.experimentals;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.MaterialCostData;
import com.controllerface.edeps.data.ModificationEffectData;
import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.effects.ModificationEffect;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/10/2018.
 */
@SuppressWarnings("unchecked")
public enum ExperimentalRecipe implements ProcurementRecipe
{
    Angled_Plating_Armor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Boost, -3d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 8d)
            ),
            new MaterialCostData(Material.COMPACTCOMPOSITES, 5),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new MaterialCostData(Material.ZIRCONIUM,3)),

    Angled_Plating_Hull(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, -5d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 2d)
            ),
            new MaterialCostData(Material.TEMPEREDALLOYS, 5),
            new MaterialCostData(Material.ZIRCONIUM, 3),
            new MaterialCostData(Material.CARBON, 5),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 3)),

    Auto_Loader(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Auto_Reload_While_Firing, 0d)
            ),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 4),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 3),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 4)),

    Blast_Block(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Strength, -1d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, 2d)
            ),
            new MaterialCostData(Material.SHIELDSOAKANALYSIS, 5),
            new MaterialCostData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 3),
            new MaterialCostData(Material.SELENIUM, 2)),

    Boss_Cells(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Spin_Up_Time, 20d),
                    new Pair<>(ModificationEffect.Shield_Reinforcement, 5d)
            ),
            new MaterialCostData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialCostData(Material.CHROMIUM, 3),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1)),

    Cluster_Capacitors(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, 8d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -2d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 8d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -2d),
                    new Pair<>(ModificationEffect.Systems_Capacity, 8d),
                    new Pair<>(ModificationEffect.Systems_Recharge, -2d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 5),
            new MaterialCostData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialCostData(Material.CADMIUM, 1)),

    Concordant_Sequence(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Wing_Shield_Regeneration_Increased, 0d),
                    new Pair<>(ModificationEffect.Thermal_Load, 50d)
            ),
            new MaterialCostData(Material.FOCUSCRYSTALS, 5),
            new MaterialCostData(Material.EMBEDDEDFIRMWARE, 3),
            new MaterialCostData(Material.ZIRCONIUM, 1)),

    Corrosive_Shell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Armor_Hardness_Reduced, 0d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, -20d)
            ),
            new MaterialCostData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialCostData(Material.PRECIPITATEDALLOYS, 4),
            new MaterialCostData(Material.ARSENIC, 3)),

    Dazzle_Shell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Sensor_Acuity_Reduced, 0d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.MANGANESE, 4),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 5)),

    Deep_Charge(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 5d),
                    new Pair<>(ModificationEffect.Maximum_Fuel_Per_Jump, 10d)
            ),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 5),
            new MaterialCostData(Material.GALVANISINGALLOYS, 3),
            new MaterialCostData(Material.HYPERSPACETRAJECTORIES, 1)),

    Deep_Plating_Armor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Boost, 8d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -3d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -3d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -3d)
            ),
            new MaterialCostData(Material.COMPACTCOMPOSITES, 5),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 3),
            new MaterialCostData(Material.MOLYBDENUM, 2)),

    Deep_Plating_Hull(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Boost, 10d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -2d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -2d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -2d)
            ),
            new MaterialCostData(Material.COMPACTCOMPOSITES, 5),
            new MaterialCostData(Material.MOLYBDENUM, 3),
            new MaterialCostData(Material.RUTHENIUM, 2)),

    Dispersal_Field(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Tracking_Reduced, 0d)
            ),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 5),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 5),
            new MaterialCostData(Material.ARCHIVEDEMISSIONDATA, 5),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5)),

    Double_Braced_Shield(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Double_Braced_Thrusters(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialCostData(Material.IRON, 5),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 3),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Double_Braced_FSD(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 25d)
            ),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 5),
            new MaterialCostData(Material.GALVANISINGALLOYS, 3),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Double_Braced_Power_Plant(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 5),
            new MaterialCostData(Material.VANADIUM, 3),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),


    Double_Braced_Distributor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 5),
            new MaterialCostData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Double_Braced_Shield_Cell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialCostData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialCostData(Material.CHROMIUM, 3),
            new MaterialCostData(Material.YTTRIUM, 1)),

    Double_Braced_Weapon(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.COMPACTCOMPOSITES, 3),
            new MaterialCostData(Material.VANADIUM, 1)),

    Double_Braced_Booster(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 5),
            new MaterialCostData(Material.GALVANISINGALLOYS, 3),
            new MaterialCostData(Material.SHIELDEMITTERS, 1)),


    Drag_Drives(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 4d),
                    new Pair<>(ModificationEffect.Thermal_Load, 10d)
            ),
            new MaterialCostData(Material.IRON, 5),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 3),
            new MaterialCostData(Material.SECURITYFIRMWARE, 1)),

    Drag_Munitions(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Speed_Reduced, 0d)
            ),
            new MaterialCostData(Material.CARBON, 5),
            new MaterialCostData(Material.GRIDRESISTORS, 5),
            new MaterialCostData(Material.MOLYBDENUM, 2)),

    Drive_Distributors(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 10d)
            ),
            new MaterialCostData(Material.IRON, 5),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 3),
            new MaterialCostData(Material.SECURITYFIRMWARE, 1)),

    Emissive_Munitions(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Signature_Increased, 0d),
                    new Pair<>(ModificationEffect.Thermal_Load, 100d)
            ),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 5),
            new MaterialCostData(Material.EMISSIONDATA, 3),
            new MaterialCostData(Material.HEATEXCHANGERS, 3),
            new MaterialCostData(Material.MANGANESE, 1)),

    Fast_Charge(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Regen_Rate, 15d),
                    new Pair<>(ModificationEffect.Broken_Regen_Rate, 15d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -1d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -1d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -1d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.COMPOUNDSHIELDING, 1)),

    Feedback_Cascade(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Shield_Cell_Disrupted, 0d),
                    new Pair<>(ModificationEffect.Damage, -20d),
                    new Pair<>(ModificationEffect.Thermal_Load, -40d)
            ),
            new MaterialCostData(Material.SYMMETRICKEYS, 5),
            new MaterialCostData(Material.SHIELDEMITTERS, 5),
            new MaterialCostData(Material.FILAMENTCOMPOSITES, 5)),

    Flow_Control_Distributor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -10d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 5),
            new MaterialCostData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Flow_Control_Shield_Cell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -10d)
            ),
            new MaterialCostData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialCostData(Material.CHROMIUM, 3),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Flow_Control_Weapon(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -10d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 3),
            new MaterialCostData(Material.EMBEDDEDFIRMWARE, 1)),

    Flow_Control_Booster(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -10d)
            ),
            new MaterialCostData(Material.SHIELDSOAKANALYSIS, 5),
            new MaterialCostData(Material.SECURITYFIRMWARE, 3),
            new MaterialCostData(Material.FOCUSCRYSTALS, 3),
            new MaterialCostData(Material.NIOBIUM, 3)),

    Force_Block_Shield(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Multiplier, -3d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 8d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.DECODEDEMISSIONDATA, 1)),

    Force_Block_Booster(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Strength, -1d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 2d)
            ),
            new MaterialCostData(Material.SCANARCHIVES, 5),
            new MaterialCostData(Material.SHIELDINGSENSORS, 3),
            new MaterialCostData(Material.SHIELDPATTERNANALYSIS, 2)),

    Force_Shell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Pushed_Off_Course, 0d),
                    new Pair<>(ModificationEffect.Shot_Speed, -17d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.ZINC, 5),
            new MaterialCostData(Material.PHASEALLOYS, 3),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 3)),

    FSD_Interrupt(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_FSD_Reboot, 0d),
                    new Pair<>(ModificationEffect.Damage, -30d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, -50d)
            ),
            new MaterialCostData(Material.WAKESOLUTIONS, 3),
            new MaterialCostData(Material.FSDTELEMETRY, 5),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 5),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 3)),

    Hi_Cap(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 6d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 25d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1)),

    High_Yield_Shell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage_Partially_Explosive, 0d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, -10d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 3),
            new MaterialCostData(Material.CHEMICALMANIPULATORS, 3),
            new MaterialCostData(Material.NICKEL, 5)),

    Incendiary_Rounds(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage_Partially_Thermal, 0d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, -5d),
                    new Pair<>(ModificationEffect.Thermal_Load, 200d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 5),
            new MaterialCostData(Material.PHOSPHORUS, 5),
            new MaterialCostData(Material.SULPHUR, 5),
            new MaterialCostData(Material.PHASEALLOYS, 3)),

    Inertial_Impact(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage_Partially_Kinetic, 0d),
                    new Pair<>(ModificationEffect.Damage, 50d),
                    new Pair<>(ModificationEffect.Jitter, 3d)
            ),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 5),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 5)),

    Ion_Disruption(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Thrusters_Reboot, 0d)
            ),
            new MaterialCostData(Material.SULPHUR, 5),
            new MaterialCostData(Material.PHOSPHORUS, 5),
            new MaterialCostData(Material.CHEMICALDISTILLERY, 3),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 3)),

    Layered_Plating_Armor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Boost, -3d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, 8d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 5),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new MaterialCostData(Material.NIOBIUM, 1)),

    Layered_Plating_Hull(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, -5d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, 2d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 5),
            new MaterialCostData(Material.SHIELDINGSENSORS, 3),
            new MaterialCostData(Material.TUNGSTEN, 3)),

    Lo_Draw(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -20d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, -2d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -20d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -1d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -1d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -1d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Mass_Lock_Munition(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_FSD_Inhibited, 0d)
            ),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 5),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new MaterialCostData(Material.SHIELDPATTERNANALYSIS, 3)),

    Mass_Manager(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -8d),
                    new Pair<>(ModificationEffect.Optimal_Mass, 4d)
            ),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 5),
            new MaterialCostData(Material.GALVANISINGALLOYS, 3),
            new MaterialCostData(Material.HYPERSPACETRAJECTORIES, 1)),

    Monstered(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, 10d),
                    new Pair<>(ModificationEffect.Power_Generation, 5d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 5),
            new MaterialCostData(Material.VANADIUM, 3),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1)),

    Multi_Servos(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 5d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 3d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.FOCUSCRYSTALS, 4),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 2),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 2)),

    Multi_weave(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 25d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 3d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 3d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, 3d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.SHIELDPATTERNANALYSIS, 1)),

    Overload_Munitions(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage_Partially_Thermal, 0d)
            ),
            new MaterialCostData(Material.FILAMENTCOMPOSITES, 5),
            new MaterialCostData(Material.ENCRYPTIONCODES, 4),
            new MaterialCostData(Material.SHIELDPATTERNANALYSIS, 2),
            new MaterialCostData(Material.GERMANIUM, 3)),

    Oversized(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 5d),
                    new Pair<>(ModificationEffect.Damage, 3d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 3),
            new MaterialCostData(Material.RUTHENIUM, 1)),

    Penetrator_Munitions(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Module_Damage, 0d)
            ),
            new MaterialCostData(Material.GALVANISINGALLOYS, 5),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 3),
            new MaterialCostData(Material.ZIRCONIUM, 3)),

    Penetrator_Payload(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Module_Damage, 0d)
            ),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 3),
            new MaterialCostData(Material.TUNGSTEN, 3),
            new MaterialCostData(Material.BULKSCANDATA, 5),
            new MaterialCostData(Material.SELENIUM, 3)),

    Phasing_Sequence(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Part_Of_Damage_Through_Shields, 0d),
                    new Pair<>(ModificationEffect.Damage, -10d)
            ),
            new MaterialCostData(Material.FOCUSCRYSTALS, 5),
            new MaterialCostData(Material.SHIELDPATTERNANALYSIS, 3),
            new MaterialCostData(Material.NIOBIUM, 3),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 3)),

    Plasma_Slug_Plasma_Accelerator(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Reload_From_Ship_Fuel, 0d),
                    new Pair<>(ModificationEffect.Damage, -10d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, -100d)
            ),
            new MaterialCostData(Material.HEATEXCHANGERS, 3),
            new MaterialCostData(Material.EMBEDDEDFIRMWARE, 2),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new MaterialCostData(Material.MERCURY, 4)),

    Plasma_Slug_Rail_Gun(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Reload_From_Ship_Fuel, 0d),
                    new Pair<>(ModificationEffect.Damage, -10d),
                    new Pair<>(ModificationEffect.Thermal_Load, -40d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, -100d)
            ),
            new MaterialCostData(Material.HEATEXCHANGERS, 3),
            new MaterialCostData(Material.EMBEDDEDFIRMWARE, 2),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new MaterialCostData(Material.MERCURY, 4)),

    Radiant_Canister(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Area_Heat_Increased_Sensors_Disrupted, 0d)
            ),
            new MaterialCostData(Material.POLONIUM, 1),
            new MaterialCostData(Material.PHASEALLOYS, 3),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 4)),

    Recycling_Cell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Duration, 10d),
                    new Pair<>(ModificationEffect.Shield_Reinforcement, -5d)
            ),
            new MaterialCostData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialCostData(Material.CHROMIUM, 3),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Reflective_Plating_Armor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Boost, -3d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 8d)
            ),
            new MaterialCostData(Material.COMPACTCOMPOSITES, 5),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 3),
            new MaterialCostData(Material.THERMICALLOYS, 2)),

    Reflective_Plating_Hull(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, -5d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 2d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 5),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 3),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1),
            new MaterialCostData(Material.ZINC, 4)),

    Regeneration_Sequence(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Wing_Shield_Regeneration, 0d),
                    new Pair<>(ModificationEffect.Damage, -10d)
            ),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.SHIELDINGSENSORS, 4),
            new MaterialCostData(Material.SHIELDFREQUENCYDATA, 1)),

    Reverberating_Cascade(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Shield_Generator_Damaged, 0d)
            ),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 2),
            new MaterialCostData(Material.SCANDATABANKS, 3),
            new MaterialCostData(Material.FILAMENTCOMPOSITES, 4),
            new MaterialCostData(Material.CHROMIUM, 4)),

    Scramble_Spectrum(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Module_Malfunction, 0d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, -10d)
            ),
            new MaterialCostData(Material.CRYSTALSHARDS, 5),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 3),
            new MaterialCostData(Material.SCRAMBLEDEMISSIONDATA, 5)),

    Screening_Shell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Effectiveness_Increase_Against_Munitions, 0d),
                    new Pair<>(ModificationEffect.Reload_Time, -50d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 5),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 5),
            new MaterialCostData(Material.NIOBIUM, 3)),

    Shift_lock_Canister(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Area_FSD_Reboot, 0d)
            ),
            new MaterialCostData(Material.TEMPEREDALLOYS, 5),
            new MaterialCostData(Material.WAKESOLUTIONS, 3),
            new MaterialCostData(Material.SALVAGEDALLOYS, 5)),

    Smart_Rounds(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.No_Damage_To_Untargeted_Ships, 0d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 5),
            new MaterialCostData(Material.SECURITYFIRMWARE, 3),
            new MaterialCostData(Material.DECODEDEMISSIONDATA, 3),
            new MaterialCostData(Material.SCANDATABANKS, 3)),

    Stripped_Down_Shield(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, -10d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Thrusters(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, -10d)
            ),
            new MaterialCostData(Material.IRON, 5),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 3),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_FSD(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, -10d)
            ),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 5),
            new MaterialCostData(Material.GALVANISINGALLOYS, 3),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Power_Plant(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, -10d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 5),
            new MaterialCostData(Material.VANADIUM, 3),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Distributor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, -10d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 5),
            new MaterialCostData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Shield_Cell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, -10d)
            ),
            new MaterialCostData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialCostData(Material.CHROMIUM, 3),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Weapon(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, -10d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 5),
            new MaterialCostData(Material.CARBON, 5),
            new MaterialCostData(Material.TIN, 1)),

    Super_Capacitors(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Strength, 5d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -2d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -2d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -2d)
            ),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 3),
            new MaterialCostData(Material.COMPACTCOMPOSITES, 5),
            new MaterialCostData(Material.CADMIUM, 2)),

    Super_Conduits(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -4d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, 4d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -4d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 4d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -4d),
                    new Pair<>(ModificationEffect.Systems_Recharge, 4d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 5),
            new MaterialCostData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialCostData(Material.SECURITYFIRMWARE, 1)),

    Super_Penetrator(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Module_Damage, 0d),
                    new Pair<>(ModificationEffect.Thermal_Load, -40d),
                    new Pair<>(ModificationEffect.Reload_Time, 50d)
            ),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 3),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.ZIRCONIUM, 3),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 5)),

    Target_Lock_Breaker(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Loses_Target_Lock, 0d)
            ),
            new MaterialCostData(Material.SELENIUM, 5),
            new MaterialCostData(Material.SECURITYFIRMWARE, 3),
            new MaterialCostData(Material.ADAPTIVEENCRYPTORS, 1)),

    Thermal_Cascade(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Shielded_Target_Heat_Increased, 0d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 5),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 4),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new MaterialCostData(Material.PHOSPHORUS, 5)),

    Thermal_Conduit(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage_Increases_With_Heat_Level, 0d)
            ),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 5),
            new MaterialCostData(Material.SULPHUR, 5),
            new MaterialCostData(Material.TEMPEREDALLOYS, 5)),

    Thermal_Shock(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Heat_Increased, 0d),
                    new Pair<>(ModificationEffect.Damage, -10d)
            ),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new MaterialCostData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 3),
            new MaterialCostData(Material.TUNGSTEN, 3)),

    Thermal_Spread_Thrusters(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, 15d),
                    new Pair<>(ModificationEffect.Thermal_Load, -10d)
            ),
            new MaterialCostData(Material.IRON, 5),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 3),
            new MaterialCostData(Material.HEATVANES, 1)),

    Thermal_Spread_FSD(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Thermal_Load, -10d)
            ),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 5),
            new MaterialCostData(Material.GALVANISINGALLOYS, 3),
            new MaterialCostData(Material.HEATVANES, 1),
            new MaterialCostData(Material.GRIDRESISTORS, 3)),

    Thermal_Spread_Power_Plant(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Thermal_Load, -10d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 5),
            new MaterialCostData(Material.VANADIUM, 3),
            new MaterialCostData(Material.HEATVANES, 1)),

    Thermal_Vent(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Heat_Reduced_When_Striking_Target, 0d)
            ),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 3),
            new MaterialCostData(Material.PRECIPITATEDALLOYS, 3)),


    Thermo_Block_Shield(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Multiplier, -3d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 8d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialCostData(Material.HEATVANES, 1)),

    Thermo_Block_Booster(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Strength, -1d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 2d)
            ),
            new MaterialCostData(Material.BULKSCANDATA, 5),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 3),
            new MaterialCostData(Material.HEATVANES, 3));

    private final MaterialCostData[] cost;
    private final ModificationEffectData effects;

    ExperimentalRecipe(ModificationEffectData effects, MaterialCostData ... cost)
    {
        this.cost = cost;
        this.effects = effects;
    }

    public Stream<MaterialCostData> costStream()
    {
        return Arrays.stream(cost);
    }

    public ModificationEffectData effects()
    {
        return effects;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }

    @Override
    public String getGrade()
    {
        return toString();
    }
}
