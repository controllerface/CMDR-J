package com.controllerface.edeps.structures.craftable.experimentals;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.equipment.ItemGrade;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/10/2018.
 */
@SuppressWarnings("unchecked")
public enum ExperimentalRecipe implements ProcurementRecipe
{
    Angled_Plating_Armor(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -3d),
                    new Pair<>(ItemEffect.KineticResistance, 8d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.ZIRCONIUM,3)),

    Angled_Plating_Hull(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -5d),
                    new Pair<>(ItemEffect.KineticResistance, 2d)
            ),
            new CostData(Material.TEMPEREDALLOYS, 5),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.CARBON, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3)),

    Auto_Loader(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.auto_reload_while_firing, 0d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 4),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 4)),

    Blast_Block(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.optimal_strength, -1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 2d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.SELENIUM, 2)),

    Boss_Cells(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ShieldBankSpinUp, 20d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 5d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Cluster_Capacitors(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, 8d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -2d),
                    new Pair<>(ItemEffect.EnginesCapacity, 8d),
                    new Pair<>(ItemEffect.EnginesRecharge, -2d),
                    new Pair<>(ItemEffect.SystemsCapacity, 8d),
                    new Pair<>(ItemEffect.SystemsRecharge, -2d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CADMIUM, 1)),

    Concordant_Sequence(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.wing_shield_regeneration_increased, 0d),
                    new Pair<>(ItemEffect.ThermalLoad, 50d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.EMBEDDEDFIRMWARE, 3),
            new CostData(Material.ZIRCONIUM, 1)),

    Corrosive_Shell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_armor_hardness_reduced, 0d),
                    new Pair<>(ItemEffect.AmmoMaximum, -20d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.PRECIPITATEDALLOYS, 4),
            new CostData(Material.ARSENIC, 3)),

    Dazzle_Shell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_sensor_acuity_reduced, 0d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.MANGANESE, 4),
            new CostData(Material.HYBRIDCAPACITORS, 5)),

    Deep_Charge(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 5d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1)),

    Deep_Plating_Armor(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 8d),
                    new Pair<>(ItemEffect.KineticResistance, -3d),
                    new Pair<>(ItemEffect.ThermicResistance, -3d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -3d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.MECHANICALEQUIPMENT, 3),
            new CostData(Material.MOLYBDENUM, 2)),

    Deep_Plating_Hull(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 10d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.MOLYBDENUM, 3),
            new CostData(Material.RUTHENIUM, 2)),

    Dispersal_Field(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_tracking_reduced, 0d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 5),
            new CostData(Material.HYBRIDCAPACITORS, 5),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 5),
            new CostData(Material.WORNSHIELDEMITTERS, 5)),

    Double_Braced_Shield(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Double_Braced_Thrusters(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Double_Braced_FSD(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 25d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Double_Braced_Power_Plant(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),


    Double_Braced_Distributor(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Double_Braced_Shield_Cell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.YTTRIUM, 1)),

    Double_Braced_Weapon(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.COMPACTCOMPOSITES, 3),
            new CostData(Material.VANADIUM, 1)),

    Double_Braced_Booster(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.SHIELDEMITTERS, 1)),


    Drag_Drives(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineOptPerformance, 4d),
                    new Pair<>(ItemEffect.EngineHeatRate, 10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    Drag_Munitions(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_speed_reduced, 0d)
            ),
            new CostData(Material.CARBON, 5),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.MOLYBDENUM, 2)),

    Drive_Distributors(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineOptimalMass, 10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    Emissive_Munitions(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_signature_increased, 0d),
                    new Pair<>(ItemEffect.ThermalLoad, 100d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.EMISSIONDATA, 3),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.MANGANESE, 1)),

    Fast_Charge(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.RegenRate, 15d),
                    new Pair<>(ItemEffect.BrokenRegenRate, 15d),
                    new Pair<>(ItemEffect.KineticResistance, -1d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -1d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.COMPOUNDSHIELDING, 1)),

    Feedback_Cascade(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_shield_cell_disrupted, 0d),
                    new Pair<>(ItemEffect.Damage, -20d),
                    new Pair<>(ItemEffect.ThermalLoad, -40d)
            ),
            new CostData(Material.SYMMETRICKEYS, 5),
            new CostData(Material.SHIELDEMITTERS, 5),
            new CostData(Material.FILAMENTCOMPOSITES, 5)),

    Flow_Control_Distributor(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Flow_Control_Shield_Cell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Flow_Control_Weapon(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),

    Flow_Control_Booster(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.FOCUSCRYSTALS, 3),
            new CostData(Material.NIOBIUM, 3)),

    Force_Block_Shield(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.optimal_multiplier, -3d),
                    new Pair<>(ItemEffect.KineticResistance, 8d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    Force_Block_Booster(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.optimal_strength, -1d),
                    new Pair<>(ItemEffect.KineticResistance, 2d)
            ),
            new CostData(Material.SCANARCHIVES, 5),
            new CostData(Material.SHIELDINGSENSORS, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 2)),

    Force_Shell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_pushed_off_course, 0d),
                    new Pair<>(ItemEffect.ShotSpeed, -17d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.ZINC, 5),
            new CostData(Material.PHASEALLOYS, 3),
            new CostData(Material.HEATCONDUCTIONWIRING, 3)),

    FSD_Interrupt(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_fsd_reboot, 0d),
                    new Pair<>(ItemEffect.Damage, -30d),
                    new Pair<>(ItemEffect.RateOfFire, -50d)
            ),
            new CostData(Material.WAKESOLUTIONS, 3),
            new CostData(Material.FSDTELEMETRY, 5),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.CONFIGURABLECOMPONENTS, 3)),

    Hi_Cap(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.optimal_multiplier, 6d),
                    new Pair<>(ItemEffect.DistributorDraw, 25d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    High_Yield_Shell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.damage_partially_explosive, 0d),
                    new Pair<>(ItemEffect.RateOfFire, -10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.CHEMICALMANIPULATORS, 3),
            new CostData(Material.NICKEL, 5)),

    Incendiary_Rounds(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.damage_partially_thermal, 0d),
                    new Pair<>(ItemEffect.RateOfFire, -5d),
                    new Pair<>(ItemEffect.ThermalLoad, 200d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.PHASEALLOYS, 3)),

    Inertial_Impact(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.damage_partially_kinetic, 0d),
                    new Pair<>(ItemEffect.Damage, 50d),
                    new Pair<>(ItemEffect.Jitter, 3d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5)),

    Ion_Disruption(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_thrusters_reboot, 0d)
            ),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.CHEMICALDISTILLERY, 3),
            new CostData(Material.ELECTROCHEMICALARRAYS, 3)),

    Layered_Plating_Armor(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -3d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 8d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.NIOBIUM, 1)),

    Layered_Plating_Hull(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 2d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.SHIELDINGSENSORS, 3),
            new CostData(Material.TUNGSTEN, 3)),

    Lo_Draw(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -20d),
                    new Pair<>(ItemEffect.optimal_multiplier, -2d),
                    new Pair<>(ItemEffect.DistributorDraw, -20d),
                    new Pair<>(ItemEffect.KineticResistance, -1d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -1d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Mass_Lock_Munition(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_fsd_inhibited, 0d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 3)),

    Mass_Manager(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -8d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 4d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1)),

    Monstered(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.PowerCapacity, 5d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Multi_Servos(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 5d),
                    new Pair<>(ItemEffect.RateOfFire, 3d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.FOCUSCRYSTALS, 4),
            new CostData(Material.CONDUCTIVEPOLYMERS, 2),
            new CostData(Material.CONFIGURABLECOMPONENTS, 2)),

    Multi_weave(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.DistributorDraw, 25d),
                    new Pair<>(ItemEffect.KineticResistance, 3d),
                    new Pair<>(ItemEffect.ThermicResistance, 3d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 3d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1)),

    Overload_Munitions(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.damage_partially_thermal, 0d)
            ),
            new CostData(Material.FILAMENTCOMPOSITES, 5),
            new CostData(Material.ENCRYPTIONCODES, 4),
            new CostData(Material.SHIELDPATTERNANALYSIS, 2),
            new CostData(Material.GERMANIUM, 3)),

    Oversized(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 5d),
                    new Pair<>(ItemEffect.Damage, 3d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.RUTHENIUM, 1)),

    Penetrator_Munitions(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_module_damage, 0d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 5),
            new CostData(Material.ELECTROCHEMICALARRAYS, 3),
            new CostData(Material.ZIRCONIUM, 3)),

    Penetrator_Payload(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_module_damage, 0d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.TUNGSTEN, 3),
            new CostData(Material.BULKSCANDATA, 5),
            new CostData(Material.SELENIUM, 3)),

    Phasing_Sequence(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.part_of_damage_through_shields, 0d),
                    new Pair<>(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.SHIELDPATTERNANALYSIS, 3),
            new CostData(Material.NIOBIUM, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 3)),

    Plasma_Slug_Plasma_Accelerator(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.reload_from_ship_fuel, 0d),
                    new Pair<>(ItemEffect.Damage, -10d),
                    new Pair<>(ItemEffect.AmmoMaximum, -100d)
            ),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 2),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new CostData(Material.MERCURY, 4)),

    Plasma_Slug_Rail_Gun(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.reload_from_ship_fuel, 0d),
                    new Pair<>(ItemEffect.Damage, -10d),
                    new Pair<>(ItemEffect.ThermalLoad, -40d),
                    new Pair<>(ItemEffect.AmmoMaximum, -100d)
            ),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 2),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new CostData(Material.MERCURY, 4)),

    Radiant_Canister(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.area_heat_increased_sensors_disrupted, 0d)
            ),
            new CostData(Material.POLONIUM, 1),
            new CostData(Material.PHASEALLOYS, 3),
            new CostData(Material.HEATDISPERSIONPLATE, 4)),

    Recycling_Cell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ShieldBankDuration, 10d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, -5d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Reflective_Plating_Armor(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -3d),
                    new Pair<>(ItemEffect.ThermicResistance, 8d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.THERMICALLOYS, 2)),

    Reflective_Plating_Hull(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -5d),
                    new Pair<>(ItemEffect.ThermicResistance, 2d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.ZINC, 4)),

    Regeneration_Sequence(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_wing_shield_regeneration, 0d),
                    new Pair<>(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.SHIELDINGSENSORS, 4),
            new CostData(Material.SHIELDFREQUENCYDATA, 1)),

    Reverberating_Cascade(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_shield_generator_damaged, 0d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 2),
            new CostData(Material.SCANDATABANKS, 3),
            new CostData(Material.FILAMENTCOMPOSITES, 4),
            new CostData(Material.CHROMIUM, 4)),

    Scramble_Spectrum(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_module_malfunction, 0d),
                    new Pair<>(ItemEffect.RateOfFire, -10d)
            ),
            new CostData(Material.CRYSTALSHARDS, 5),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 5)),

    Screening_Shell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.effectiveness_increase_against_munitions, 0d),
                    new Pair<>(ItemEffect.ReloadTime, -50d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.CONSUMERFIRMWARE, 5),
            new CostData(Material.NIOBIUM, 3)),

    Shift_lock_Canister(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.area_fsd_reboot, 0d)
            ),
            new CostData(Material.TEMPEREDALLOYS, 5),
            new CostData(Material.WAKESOLUTIONS, 3),
            new CostData(Material.SALVAGEDALLOYS, 5)),

    Smart_Rounds(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.no_damage_to_untargeted_ships, 0d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.DECODEDEMISSIONDATA, 3),
            new CostData(Material.SCANDATABANKS, 3)),

    Stripped_Down_Shield(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Thrusters(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_FSD(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Power_Plant(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Distributor(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Shield_Cell(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Stripped_Down_Weapon(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 5),
            new CostData(Material.CARBON, 5),
            new CostData(Material.TIN, 1)),

    Super_Capacitors(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.optimal_strength, 5d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d)
            ),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.CADMIUM, 2)),

    Super_Conduits(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -4d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 4d),
                    new Pair<>(ItemEffect.EnginesCapacity, -4d),
                    new Pair<>(ItemEffect.EnginesRecharge, 4d),
                    new Pair<>(ItemEffect.SystemsCapacity, -4d),
                    new Pair<>(ItemEffect.SystemsRecharge, 4d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    Super_Penetrator(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_module_damage, 0d),
                    new Pair<>(ItemEffect.ThermalLoad, -40d),
                    new Pair<>(ItemEffect.ReloadTime, 50d)
            ),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.SHIELDDENSITYREPORTS, 5)),

    Target_Lock_Breaker(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_loses_target_lock, 0d)
            ),
            new CostData(Material.SELENIUM, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1)),

    Thermal_Cascade(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.shielded_target_heat_increased, 0d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HYBRIDCAPACITORS, 4),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.PHOSPHORUS, 5)),

    Thermal_Conduit(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.damage_increases_with_heat_level, 0d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 5),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.TEMPEREDALLOYS, 5)),

    Thermal_Shock(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.target_heat_increased, 0d),
                    new Pair<>(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CONDUCTIVECOMPONENTS, 3),
            new CostData(Material.TUNGSTEN, 3)),

    Thermal_Spread_Thrusters(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 15d),
                    new Pair<>(ItemEffect.EngineHeatRate, -10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.HEATVANES, 1)),

    Thermal_Spread_FSD(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDHeatRate, -10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.GRIDRESISTORS, 3)),

    Thermal_Spread_Power_Plant(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ThermalLoad, -10d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.HEATVANES, 1)),

    Thermal_Vent(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.heat_reduced_when_striking_target, 0d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.CONDUCTIVEPOLYMERS, 3),
            new CostData(Material.PRECIPITATEDALLOYS, 3)),


    Thermo_Block_Shield(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.optimal_multiplier, -3d),
                    new Pair<>(ItemEffect.ThermicResistance, 8d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.HEATVANES, 1)),

    Thermo_Block_Booster(ItemGrade.Experimental, new ItemEffectData
            (
                    new Pair<>(ItemEffect.optimal_strength, -1d),
                    new Pair<>(ItemEffect.ThermicResistance, 2d)
            ),
            new CostData(Material.BULKSCANDATA, 5),
            new CostData(Material.CONDUCTIVECERAMICS, 3),
            new CostData(Material.HEATVANES, 3));

    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffectData effects;

    ExperimentalRecipe(ItemGrade grade, ItemEffectData effects, CostData... cost)
    {
        this.grade = grade;
        this.cost = cost;
        this.effects = effects;
    }

    @Override
    public ItemGrade getGrade()
    {
        return grade;
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
    public String getShortLabel()
    {
        return name().replace("_"," ");
    }

    @Override
    public String getDisplayLabel()
    {
        return getShortLabel();
    }

    @Override
    public String getName()
    {
        return name();
    }
}
