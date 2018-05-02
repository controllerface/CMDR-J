package com.controllerface.edeps.structures.craftable.modifications;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.structures.equipment.ItemGrade;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
@SuppressWarnings("unchecked")
public enum ModificationRecipe implements ProcurementRecipe
{
    /*
    Efficient
     */

    Efficient_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 8d),
                    new Pair<>(ItemEffect.ThermalLoad, -38d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Efficient_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 12d),
                    new Pair<>(ItemEffect.PowerDraw, -12d),
                    new Pair<>(ItemEffect.DistributorDraw, -15d),
                    new Pair<>(ItemEffect.ThermalLoad, -43d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    Efficient_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 16d),
                    new Pair<>(ItemEffect.PowerDraw, -24d),
                    new Pair<>(ItemEffect.DistributorDraw, -25d),
                    new Pair<>(ItemEffect.ThermalLoad, -48d)
            ),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    Efficient_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 20d),
                    new Pair<>(ItemEffect.PowerDraw, -36d),
                    new Pair<>(ItemEffect.DistributorDraw, -35d),
                    new Pair<>(ItemEffect.ThermalLoad, -53d)
            ),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.HEATVANES, 1)),

    Efficient_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 24d),
                    new Pair<>(ItemEffect.PowerDraw, -48d),
                    new Pair<>(ItemEffect.DistributorDraw, -45d),
                    new Pair<>(ItemEffect.ThermalLoad, -60d)
            ),
            new CostData(Material.EMISSIONDATA, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),


    /*
    Light Weight
     */
    Lightweight_Bulkheads_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 3d),
                    new Pair<>(ItemEffect.ThermicResistance, 3d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 3d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -1d),
                    new Pair<>(ItemEffect.Mass, -15d)
            ),
            new CostData(Material.IRON, 1)),

    Lightweight_Bulkheads_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 6d),
                    new Pair<>(ItemEffect.ThermicResistance, 6d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 6d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -2d),
                    new Pair<>(ItemEffect.Mass, -25d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Lightweight_Bulkheads_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 9d),
                    new Pair<>(ItemEffect.ThermicResistance, 9d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 9d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -3d),
                    new Pair<>(ItemEffect.Mass, -35d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Lightweight_Bulkheads_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 12d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 12d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -4d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Lightweight_Bulkheads_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 15d),
                    new Pair<>(ItemEffect.ThermicResistance, 15d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 15d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -5d),
                    new Pair<>(ItemEffect.Mass, -56d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1)),


    Lightweight_Sensors_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -5d),
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Lightweight_Sensors_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -10d),
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -35d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.MANGANESE, 1)),

    Lightweight_Sensors_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -15d),
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -50d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1)),

    Lightweight_Sensors_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -20d),
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Lightweight_Sensors_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -25d),
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -80d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),


    Lightweight_Utility_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Lightweight_Utility_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -56d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.MANGANESE, 1)),

    Lightweight_Utility_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1)),

    Lightweight_Utility_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Lightweight_Utility_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),


    Lightweight_Weapon_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -30d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Lightweight_Weapon_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -10d),
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.DistributorDraw, -20d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.MANGANESE, 1)),

    Lightweight_Weapon_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -20d),
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.DistributorDraw, -25d),
                    new Pair<>(ItemEffect.Mass, -60d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1)),

    Lightweight_Weapon_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -30d),
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.DistributorDraw, -30d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Lightweight_Weapon_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -40d),
                    new Pair<>(ItemEffect.Integrity, -60d),
                    new Pair<>(ItemEffect.DistributorDraw, -35d),
                    new Pair<>(ItemEffect.Mass, -90d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),


    /*
    Long Range
     */

    Long_Range_Weapon_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 3d),
                    new Pair<>(ItemEffect.MaximumRange, 20d),
                    new Pair<>(ItemEffect.FalloffRange, 20d),
                    new Pair<>(ItemEffect.Mass, 10d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Long_Range_Weapon_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 6d),
                    new Pair<>(ItemEffect.MaximumRange, 40d),
                    new Pair<>(ItemEffect.FalloffRange, 40d),
                    new Pair<>(ItemEffect.Mass, 15d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Long_Range_Weapon_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 9d),
                    new Pair<>(ItemEffect.MaximumRange, 60d),
                    new Pair<>(ItemEffect.FalloffRange, 60d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.FOCUSCRYSTALS, 1)),

    Long_Range_Weapon_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.MaximumRange, 80d),
                    new Pair<>(ItemEffect.FalloffRange, 80d),
                    new Pair<>(ItemEffect.Mass, 25d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Long_Range_Weapon_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.MaximumRange, 100d),
                    new Pair<>(ItemEffect.FalloffRange, 100d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.THERMICALLOYS, 1),
            new CostData(Material.BIOTECHCONDUCTORS, 1)),


    Long_Range_Large_Calibre_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 3d),
                    new Pair<>(ItemEffect.MaximumRange, 20d),
                    new Pair<>(ItemEffect.ShotSpeed, 20d),
                    new Pair<>(ItemEffect.FalloffRange, 20d),
                    new Pair<>(ItemEffect.Mass, 10d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Long_Range_Large_Calibre_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 6d),
                    new Pair<>(ItemEffect.MaximumRange, 40d),
                    new Pair<>(ItemEffect.ShotSpeed, 40d),
                    new Pair<>(ItemEffect.FalloffRange, 40d),
                    new Pair<>(ItemEffect.Mass, 15d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Long_Range_Large_Calibre_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 9d),
                    new Pair<>(ItemEffect.MaximumRange, 60d),
                    new Pair<>(ItemEffect.ShotSpeed, 60d),
                    new Pair<>(ItemEffect.FalloffRange, 60d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.FOCUSCRYSTALS, 1)),

    Long_Range_Large_Calibre_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.MaximumRange, 80d),
                    new Pair<>(ItemEffect.ShotSpeed, 80d),
                    new Pair<>(ItemEffect.FalloffRange, 80d),
                    new Pair<>(ItemEffect.Mass, 25d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Long_Range_Large_Calibre_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.MaximumRange, 100d),
                    new Pair<>(ItemEffect.ShotSpeed, 100d),
                    new Pair<>(ItemEffect.FalloffRange, 100d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.THERMICALLOYS, 1),
            new CostData(Material.BIOTECHCONDUCTORS, 1)),


    Long_Range_Scan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -10d),
                    new Pair<>(ItemEffect.scan_range, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 10d)
            ),
            new CostData(Material.IRON, 1)),

    Long_Range_Scan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -15d),
                    new Pair<>(ItemEffect.scan_range, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    Long_Range_Scan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -20d),
                    new Pair<>(ItemEffect.scan_range, 72d),
                    new Pair<>(ItemEffect.PowerDraw, 30d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Long_Range_Scan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -25d),
                    new Pair<>(ItemEffect.scan_range, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    Long_Range_Scan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -30d),
                    new Pair<>(ItemEffect.scan_range, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 50d)
            ),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.COMPACTEMISSIONSDATA, 1)),


    Long_Range_Sensors_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -10d),
                    new Pair<>(ItemEffect.Range, 15d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.IRON, 1)),

    Long_Range_Sensors_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -15d),
                    new Pair<>(ItemEffect.Range, 30d),
                    new Pair<>(ItemEffect.Mass, 40d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    Long_Range_Sensors_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -20d),
                    new Pair<>(ItemEffect.Range, 45d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Long_Range_Sensors_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -25d),
                    new Pair<>(ItemEffect.Range, 60d),
                    new Pair<>(ItemEffect.Mass, 80d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    Long_Range_Sensors_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, -30d),
                    new Pair<>(ItemEffect.Range, 75d),
                    new Pair<>(ItemEffect.Mass, 100d)
            ),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.COMPACTEMISSIONSDATA, 1)),


    Long_Range_Interdictor_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 20d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -10d),
                    new Pair<>(ItemEffect.Mass, 10d)
            ),
            new CostData(Material.ENCRYPTEDFILES, 1)),

    Long_Range_Interdictor_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 30d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -15d),
                    new Pair<>(ItemEffect.Mass, 15d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1),
            new CostData(Material.ENCRYPTIONCODES, 1)),

    Long_Range_Interdictor_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 40d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -20d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.FSDTELEMETRY, 1),
            new CostData(Material.SYMMETRICKEYS, 1)),

    Long_Range_Interdictor_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 50d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -25d),
                    new Pair<>(ItemEffect.Mass, 25d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.WAKESOLUTIONS, 1),
            new CostData(Material.ENCRYPTIONARCHIVES, 1)),

    Long_Range_Interdictor_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 50d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 60d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -30d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1)),


    Long_Range_Surface_Scan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RangeMult, 40d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.IRON, 1)),

    Long_Range_Surface_Scan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RangeMult, 80d),
                    new Pair<>(ItemEffect.Mass, 40d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    Long_Range_Surface_Scan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RangeMult, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Long_Range_Surface_Scan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RangeMult, 160d),
                    new Pair<>(ItemEffect.Mass, 80d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    Long_Range_Surface_Scan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RangeMult, 200d),
                    new Pair<>(ItemEffect.Mass, 100d)
            ),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.COMPACTEMISSIONSDATA, 1)),


    /*
    Overcharged
     */

    Overcharged_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 30d),
                    new Pair<>(ItemEffect.DistributorDraw, 15d),
                    new Pair<>(ItemEffect.ThermalLoad, 3d)
            ),
            new CostData(Material.NICKEL, 1)),

    Overcharged_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 40d),
                    new Pair<>(ItemEffect.DistributorDraw, 25d),
                    new Pair<>(ItemEffect.ThermalLoad, 9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Overcharged_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 50d),
                    new Pair<>(ItemEffect.DistributorDraw, 25d),
                    new Pair<>(ItemEffect.ThermalLoad, 9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    Overcharged_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 60d),
                    new Pair<>(ItemEffect.DistributorDraw, 30d),
                    new Pair<>(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.ZINC, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Overcharged_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 70d),
                    new Pair<>(ItemEffect.DistributorDraw, 35d),
                    new Pair<>(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.ZIRCONIUM, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),


    Overcharged_Multi_Cannon_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -3d),
                    new Pair<>(ItemEffect.Damage, 30d),
                    new Pair<>(ItemEffect.DistributorDraw, 15d),
                    new Pair<>(ItemEffect.ThermalLoad, 3d)
            ),
            new CostData(Material.NICKEL, 1)),

    Overcharged_Multi_Cannon_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -6d),
                    new Pair<>(ItemEffect.Damage, 40d),
                    new Pair<>(ItemEffect.DistributorDraw, 25d),
                    new Pair<>(ItemEffect.ThermalLoad, 9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Overcharged_Multi_Cannon_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -9d),
                    new Pair<>(ItemEffect.Damage, 50d),
                    new Pair<>(ItemEffect.DistributorDraw, 25d),
                    new Pair<>(ItemEffect.ThermalLoad, 9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    Overcharged_Multi_Cannon_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -12d),
                    new Pair<>(ItemEffect.Damage, 60d),
                    new Pair<>(ItemEffect.DistributorDraw, 30d),
                    new Pair<>(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.ZINC, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Overcharged_Multi_Cannon_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -15d),
                    new Pair<>(ItemEffect.Damage, 70d),
                    new Pair<>(ItemEffect.DistributorDraw, 35d),
                    new Pair<>(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.ZIRCONIUM, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),







    Overcharged_Power_Plant_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -5d),
                    new Pair<>(ItemEffect.HeatEfficiency, 5d),
                    new Pair<>(ItemEffect.PowerCapacity, 12d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Overcharged_Power_Plant_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.HeatEfficiency, 10d),
                    new Pair<>(ItemEffect.PowerCapacity, 19d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Overcharged_Power_Plant_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.HeatEfficiency, 15d),
                    new Pair<>(ItemEffect.PowerCapacity, 26d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SELENIUM, 1)),

    Overcharged_Power_Plant_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.HeatEfficiency, 20d),
                    new Pair<>(ItemEffect.PowerCapacity, 33d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.CADMIUM, 1)),

    Overcharged_Power_Plant_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -25d),
                    new Pair<>(ItemEffect.HeatEfficiency, 25d),
                    new Pair<>(ItemEffect.PowerCapacity, 40d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.TELLURIUM, 1)),







    /*
    Short Range
     */

    Short_Range_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 27d),
                    new Pair<>(ItemEffect.MaximumRange, -10d)
            ),
            new CostData(Material.NICKEL, 1)),

    Short_Range_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 39d),
                    new Pair<>(ItemEffect.MaximumRange, -20d),
                    new Pair<>(ItemEffect.ThermalLoad, 10d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Short_Range_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 51d),
                    new Pair<>(ItemEffect.MaximumRange, -30d),
                    new Pair<>(ItemEffect.ThermalLoad, 20d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    Short_Range_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 63d),
                    new Pair<>(ItemEffect.MaximumRange, -40d),
                    new Pair<>(ItemEffect.ThermalLoad, 30d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Short_Range_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 75d),
                    new Pair<>(ItemEffect.MaximumRange, -50d),
                    new Pair<>(ItemEffect.ThermalLoad, 40d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.BIOTECHCONDUCTORS, 1)),


    /*
    Sturdy
     */

    Sturdy_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 100d),
                    new Pair<>(ItemEffect.ThermalLoad, -10d),
                    new Pair<>(ItemEffect.ArmourPenetration, 20d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.NICKEL, 1)),

    Sturdy_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.ThermalLoad, -15d),
                    new Pair<>(ItemEffect.ArmourPenetration, 30d),
                    new Pair<>(ItemEffect.Mass, 40d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Sturdy_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 200d),
                    new Pair<>(ItemEffect.ThermalLoad, -20d),
                    new Pair<>(ItemEffect.ArmourPenetration, 40d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Sturdy_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 250d),
                    new Pair<>(ItemEffect.ThermalLoad, -25d),
                    new Pair<>(ItemEffect.ArmourPenetration, 50d),
                    new Pair<>(ItemEffect.Mass, 80d)
            ),
            new CostData(Material.ZINC, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.MOLYBDENUM, 1)),

    Sturdy_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.ThermalLoad, -30d),
                    new Pair<>(ItemEffect.ArmourPenetration, 60d),
                    new Pair<>(ItemEffect.Mass, 100d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),


    /*
    Focused
     */

    Focused_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.MaximumRange, 36d),
                    new Pair<>(ItemEffect.ArmourPenetration, 40d),
                    new Pair<>(ItemEffect.ThermalLoad, 1d)
            ),
            new CostData(Material.IRON, 1)),

    Focused_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.MaximumRange, 52d),
                    new Pair<>(ItemEffect.ArmourPenetration, 60d),
                    new Pair<>(ItemEffect.ThermalLoad, 2d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Focused_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.MaximumRange, 68d),
                    new Pair<>(ItemEffect.ArmourPenetration, 80d),
                    new Pair<>(ItemEffect.ThermalLoad, 3d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1)),

    Focused_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.MaximumRange, 84d),
                    new Pair<>(ItemEffect.ArmourPenetration, 100d),
                    new Pair<>(ItemEffect.ThermalLoad, 4d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Focused_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.MaximumRange, 100d),
                    new Pair<>(ItemEffect.ArmourPenetration, 120d),
                    new Pair<>(ItemEffect.ThermalLoad, 5d)
            ),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    Rapid Fire
     */

    Rapid_Fire_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -1d),
                    new Pair<>(ItemEffect.ReloadTime, -25d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.RateOfFire, 8d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Rapid_Fire_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -2d),
                    new Pair<>(ItemEffect.ReloadTime, -35d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.RateOfFire, 17d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    Rapid_Fire_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -3d),
                    new Pair<>(ItemEffect.ReloadTime, -45d),
                    new Pair<>(ItemEffect.DistributorDraw, -15d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.RateOfFire, 26d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1)),

    Rapid_Fire_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -4d),
                    new Pair<>(ItemEffect.ReloadTime, -56d),
                    new Pair<>(ItemEffect.DistributorDraw, -25d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.RateOfFire, 35d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    Rapid_Fire_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -5d),
                    new Pair<>(ItemEffect.ReloadTime, -65d),
                    new Pair<>(ItemEffect.DistributorDraw, -35d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.RateOfFire, 44d)
            ),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.TECHNETIUM, 1)),


    /*
    High Capacity
     */

    High_Capacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, 36d),
                    new Pair<>(ItemEffect.PowerDraw, 4d),
                    new Pair<>(ItemEffect.AmmoMaximum, 36d),
                    new Pair<>(ItemEffect.RateOfFire, 2d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    High_Capacity_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, 52d),
                    new Pair<>(ItemEffect.PowerDraw, 8d),
                    new Pair<>(ItemEffect.AmmoMaximum, 52d),
                    new Pair<>(ItemEffect.RateOfFire, 4d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.VANADIUM, 1)),

    High_Capacity_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, 68d),
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.AmmoMaximum, 68d),
                    new Pair<>(ItemEffect.RateOfFire, 6d),
                    new Pair<>(ItemEffect.Mass, 40d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.NIOBIUM, 1)),

    High_Capacity_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, 84d),
                    new Pair<>(ItemEffect.PowerDraw, 16d),
                    new Pair<>(ItemEffect.AmmoMaximum, 84d),
                    new Pair<>(ItemEffect.RateOfFire, 8d),
                    new Pair<>(ItemEffect.Mass, 50d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.TIN, 1)),

    High_Capacity_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, 100d),
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.AmmoMaximum, 100d),
                    new Pair<>(ItemEffect.RateOfFire, 10d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    Double Shot
     */

    Double_Shot_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstRateOfFire, 600d),
                    new Pair<>(ItemEffect.MaximumRange, -2d),
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 4d)
            ),
            new CostData(Material.CARBON, 1)),

    Double_Shot_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstRateOfFire, 800d),
                    new Pair<>(ItemEffect.MaximumRange, -4d),
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Double_Shot_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstRateOfFire, 1000d),
                    new Pair<>(ItemEffect.MaximumRange, -6d),
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1)),

    Double_Shot_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstRateOfFire, 1200d),
                    new Pair<>(ItemEffect.MaximumRange, -8d),
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 4d)
            ),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    Double_Shot_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstRateOfFire, 1400d),
                    new Pair<>(ItemEffect.MaximumRange, -10d),
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 6d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),

    /*
    Ammo Capacity
     */

    Ammo_Capacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ReloadTime, 10d),
                    new Pair<>(ItemEffect.AmmoMaximum, 50d),
                    new Pair<>(ItemEffect.Mass, 100d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),


    /*
    Reinforced
     */

    Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.ZINC, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.MOLYBDENUM, 1)),

    Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),


    Reinforced_Thrusters_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineHeatRate, -10d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.Mass, 5d)
            ),
            new CostData(Material.CARBON, 1)),

    Reinforced_Thrusters_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineHeatRate, -20d),
                    new Pair<>(ItemEffect.Integrity, 50d),
                    new Pair<>(ItemEffect.Mass, 10d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.VANADIUM, 1)),

    Reinforced_Thrusters_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineHeatRate, -30d),
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.Mass, 15d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.SHIELDINGSENSORS, 1)),

    Reinforced_Thrusters_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineHeatRate, -40d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.COMPOUNDSHIELDING, 1)),

    Reinforced_Thrusters_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineHeatRate, -50d),
                    new Pair<>(ItemEffect.Integrity, 110d),
                    new Pair<>(ItemEffect.Mass, 25d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.IMPERIALSHIELDING, 1)),


    Reinforced_Shield_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, 4d),
                    new Pair<>(ItemEffect.optimal_strength, 14d),
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 5d),
                    new Pair<>(ItemEffect.ThermicResistance, 5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 5d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Reinforced_Shield_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, 6d),
                    new Pair<>(ItemEffect.optimal_strength, 20d),
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 8d),
                    new Pair<>(ItemEffect.ThermicResistance, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 8d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Reinforced_Shield_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, 8d),
                    new Pair<>(ItemEffect.optimal_strength, 26d),
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 11d),
                    new Pair<>(ItemEffect.ThermicResistance, 11d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 11d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1)),

    Reinforced_Shield_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, 10d),
                    new Pair<>(ItemEffect.optimal_strength, 32d),
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 14d),
                    new Pair<>(ItemEffect.ThermicResistance, 14d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 14d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Reinforced_Shield_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, 12d),
                    new Pair<>(ItemEffect.optimal_strength, 38d),
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 17d),
                    new Pair<>(ItemEffect.ThermicResistance, 17d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 17d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.IMPROVISEDCOMPONENTS, 1)),


    /*
    Shielded
     */

    Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.Integrity, 60d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.Integrity, 120d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 60d),
                    new Pair<>(ItemEffect.Integrity, 180d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 80d),
                    new Pair<>(ItemEffect.Integrity, 240d)
            ),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 100d),
                    new Pair<>(ItemEffect.Integrity, 300d)
            ),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1)),


    Shielded_FSD_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 3d),
                    new Pair<>(ItemEffect.Integrity, 25d),
                    new Pair<>(ItemEffect.FSDHeatRate, -10d),
                    new Pair<>(ItemEffect.Mass, 4d)
            ),
            new CostData(Material.NICKEL, 1)),

    Shielded_FSD_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 6d),
                    new Pair<>(ItemEffect.Integrity, 50d),
                    new Pair<>(ItemEffect.FSDHeatRate, -15d),
                    new Pair<>(ItemEffect.Mass, 8d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Shielded_FSD_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 9d),
                    new Pair<>(ItemEffect.Integrity, 75d),
                    new Pair<>(ItemEffect.FSDHeatRate, -20d),
                    new Pair<>(ItemEffect.Mass, 12d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1),
            new CostData(Material.SHIELDINGSENSORS, 1)),

    Shielded_FSD_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 12d),
                    new Pair<>(ItemEffect.Integrity, 100d),
                    new Pair<>(ItemEffect.FSDHeatRate, -25d),
                    new Pair<>(ItemEffect.Mass, 16d)
            ),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.COMPOUNDSHIELDING, 1)),

    Shielded_FSD_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 15d),
                    new Pair<>(ItemEffect.Integrity, 125d),
                    new Pair<>(ItemEffect.FSDHeatRate, -30d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.IMPERIALSHIELDING, 1)),


    Shielded_Distributor_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -10d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.Mass, 3d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    Shielded_Distributor_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -15d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.Mass, 6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Shielded_Distributor_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -20d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 9d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Shielded_Distributor_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -25d),
                    new Pair<>(ItemEffect.Integrity, 160d),
                    new Pair<>(ItemEffect.Mass, 12d)
            ),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Shielded_Distributor_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -30d),
                    new Pair<>(ItemEffect.Integrity, 200d),
                    new Pair<>(ItemEffect.Mass, 15d)
            ),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1)),


    /*
    Fast Scan
     */

    Fast_Scan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.scan_range, -5d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Fast_Scan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity,  -20d),
                    new Pair<>(ItemEffect.scan_range,  -10d),
                    new Pair<>(ItemEffect.ScannerTimeToScan,  -35d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1)),

    Fast_Scan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.scan_range, -15d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -50d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1)),

    Fast_Scan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.scan_range, -20d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -65d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.ENCRYPTIONARCHIVES, 1)),

    Fast_Scan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.scan_range, -25d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -80d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1)),


    Fast_Surface_Scan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RateMult, 20d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Fast_Surface_Scan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RateMult, 35d),
                    new Pair<>(ItemEffect.Mass, 40d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1)),

    Fast_Surface_Scan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RateMult, 50d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1)),

    Fast_Surface_Scan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RateMult, 65d),
                    new Pair<>(ItemEffect.Mass, 80d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.ENCRYPTIONARCHIVES, 1)),

    Fast_Surface_Scan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_RateMult, 80d),
                    new Pair<>(ItemEffect.Mass, 100d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1)),


    /*
    Wide Angle
     */

    Wide_Angle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 40d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 10d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Wide_Angle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 80d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 20d),
                    new Pair<>(ItemEffect.Mass, 40d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.GERMANIUM, 1)),

    Wide_Angle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 120d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 30d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.CLASSIFIEDSCANDATA, 1)),

    Wide_Angle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 160d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 40d),
                    new Pair<>(ItemEffect.Mass, 80d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.ENCODEDSCANDATA, 1)),

    Wide_Angle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 200d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 50d),
                    new Pair<>(ItemEffect.Mass, 100d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.CLASSIFIEDSCANDATA, 1)),


    Wide_Angle_Surface_Scanner_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_AngleMult, 40d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Wide_Angle_Surface_Scanner_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_AngleMult, 80d),
                    new Pair<>(ItemEffect.Mass, 40d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.GERMANIUM, 1)),

    Wide_Angle_Surface_Scanner_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_AngleMult, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.CLASSIFIEDSCANDATA, 1)),

    Wide_Angle_Surface_Scanner_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_AngleMult, 160d),
                    new Pair<>(ItemEffect.Mass, 80d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.ENCODEDSCANDATA, 1)),

    Wide_Angle_Surface_Scanner_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DSS_AngleMult, 200d),
                    new Pair<>(ItemEffect.Mass, 100d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.CLASSIFIEDSCANDATA, 1)),


    Wide_Angle_Sensors_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.Range, -4d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Wide_Angle_Sensors_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.Range, -8d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.GERMANIUM, 1)),

    Wide_Angle_Sensors_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.Range, -12d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.CLASSIFIEDSCANDATA, 1)),

    Wide_Angle_Sensors_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 160d),
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.Range, -16d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.ENCODEDSCANDATA, 1)),

    Wide_Angle_Sensors_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.scan_angle, 200d),
                    new Pair<>(ItemEffect.PowerDraw, 50d),
                    new Pair<>(ItemEffect.Range, -20d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.CLASSIFIEDSCANDATA, 1)),


    /*
    Blast Resistant
     */

    Blast_Resistant_Hull_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 12d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 3d)
            ),
            new CostData(Material.NICKEL, 1)),

    Blast_Resistant_Hull_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 19d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d),
                    new Pair<>(ItemEffect.KineticResistance, -4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1)),

    Blast_Resistant_Hull_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 26d),
                    new Pair<>(ItemEffect.ThermicResistance, -6d),
                    new Pair<>(ItemEffect.KineticResistance, -6d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 9d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    Blast_Resistant_Hull_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 33d),
                    new Pair<>(ItemEffect.ThermicResistance, -8d),
                    new Pair<>(ItemEffect.KineticResistance, -8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 12d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.MERCURY, 1)),

    Blast_Resistant_Hull_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 40d),
                    new Pair<>(ItemEffect.ThermicResistance, -8d),
                    new Pair<>(ItemEffect.KineticResistance, -8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 15d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.RUTHENIUM, 1)),


    Blast_Resistant_Shield_Booster_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 8d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d),
                    new Pair<>(ItemEffect.KineticResistance, -1d)
            ),
            new CostData(Material.IRON, 1)),

    Blast_Resistant_Shield_Booster_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 12d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d),
                    new Pair<>(ItemEffect.KineticResistance, -1d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Blast_Resistant_Shield_Booster_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 17d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d),
                    new Pair<>(ItemEffect.KineticResistance, -2d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1)),

    Blast_Resistant_Shield_Booster_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 22d),
                    new Pair<>(ItemEffect.ThermicResistance, -3d),
                    new Pair<>(ItemEffect.KineticResistance, -3d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Blast_Resistant_Shield_Booster_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 27d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d),
                    new Pair<>(ItemEffect.KineticResistance, -4d)
            ),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),


    Blast_Resistant_Armor_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 8d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d),
                    new Pair<>(ItemEffect.KineticResistance, -1d)
            ),
            new CostData(Material.NICKEL, 1)),

    Blast_Resistant_Armor_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 12d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d),
                    new Pair<>(ItemEffect.KineticResistance, -1d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1)),

    Blast_Resistant_Armor_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 17d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d),
                    new Pair<>(ItemEffect.KineticResistance, -2d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    Blast_Resistant_Armor_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 22d),
                    new Pair<>(ItemEffect.ThermicResistance, -3d),
                    new Pair<>(ItemEffect.KineticResistance, -3d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.MERCURY, 1)),

    Blast_Resistant_Armor_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 27d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d),
                    new Pair<>(ItemEffect.KineticResistance, -4d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.RUTHENIUM, 1)),


    /*
    Heavy Duty
     */

    Heavy_Duty_Shield_Booster_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 5d),
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.shield_boost, 10d),
                    new Pair<>(ItemEffect.Mass, 100d)
            ),
            new CostData(Material.GRIDRESISTORS, 1)),

    Heavy_Duty_Shield_Booster_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.Integrity, 6d),
                    new Pair<>(ItemEffect.shield_boost, 17d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    Heavy_Duty_Shield_Booster_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.Integrity, 9d),
                    new Pair<>(ItemEffect.shield_boost, 24d),
                    new Pair<>(ItemEffect.Mass, 200d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.NIOBIUM, 1)),

    Heavy_Duty_Shield_Booster_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.Integrity, 12d),
                    new Pair<>(ItemEffect.shield_boost, 31d),
                    new Pair<>(ItemEffect.Mass, 250d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.TIN, 1)),

    Heavy_Duty_Shield_Booster_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 25d),
                    new Pair<>(ItemEffect.Integrity, 15d),
                    new Pair<>(ItemEffect.shield_boost, 38d),
                    new Pair<>(ItemEffect.Mass, 300d)
            ),
            new CostData(Material.SHIELDDENSITYREPORTS, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.ANTIMONY, 1)),


    Heavy_Duty_Hull_Reinforcement_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 24d),
                    new Pair<>(ItemEffect.KineticResistance, 3d),
                    new Pair<>(ItemEffect.ThermicResistance, 3d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 3d),
                    new Pair<>(ItemEffect.Mass, 8d)
            ),
            new CostData(Material.CARBON, 1)),

    Heavy_Duty_Hull_Reinforcement_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 36d),
                    new Pair<>(ItemEffect.KineticResistance, 6d),
                    new Pair<>(ItemEffect.ThermicResistance, 6d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 6d),
                    new Pair<>(ItemEffect.Mass, 16d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Heavy_Duty_Hull_Reinforcement_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 48d),
                    new Pair<>(ItemEffect.KineticResistance, 6d),
                    new Pair<>(ItemEffect.ThermicResistance, 6d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 6d),
                    new Pair<>(ItemEffect.Mass, 24d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Heavy_Duty_Hull_Reinforcement_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 60d),
                    new Pair<>(ItemEffect.KineticResistance, 12d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 12d),
                    new Pair<>(ItemEffect.Mass, 32d)
            ),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Heavy_Duty_Hull_Reinforcement_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 72d),
                    new Pair<>(ItemEffect.KineticResistance, 15d),
                    new Pair<>(ItemEffect.ThermicResistance, 15d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 15d),
                    new Pair<>(ItemEffect.Mass, 40d)
            ),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1)),


    Heavy_Duty_Armor_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 1d),
                    new Pair<>(ItemEffect.ThermicResistance, 1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 1d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 12d),
                    new Pair<>(ItemEffect.Mass, 10d)
            ),
                new CostData(Material.CARBON, 1)),

    Heavy_Duty_Armor_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 2d),
                    new Pair<>(ItemEffect.ThermicResistance, 2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 17d),
                    new Pair<>(ItemEffect.Mass, 15d)
            ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1)),

    Heavy_Duty_Armor_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 3d),
                    new Pair<>(ItemEffect.ThermicResistance, 3d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 3d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 22d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Heavy_Duty_Armor_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 4d),
                    new Pair<>(ItemEffect.ThermicResistance, 4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 27d),
                    new Pair<>(ItemEffect.Mass, 25d)
            ),
                new CostData(Material.VANADIUM, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Heavy_Duty_Armor_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 5d),
                    new Pair<>(ItemEffect.ThermicResistance, 5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 5d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 32d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
                new CostData(Material.TUNGSTEN, 1),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.FEDCORECOMPOSITES, 1)),


    /*
    Kinetic Resistant
     */

    Kinetic_Resistant_Hull_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d),
                    new Pair<>(ItemEffect.KineticResistance, 12d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 3d)
            ),
            new CostData(Material.NICKEL, 1)),

    Kinetic_Resistant_Hull_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d),
                    new Pair<>(ItemEffect.KineticResistance, 19d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.VANADIUM, 1)),

    Kinetic_Resistant_Hull_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -6d),
                    new Pair<>(ItemEffect.ThermicResistance, -6d),
                    new Pair<>(ItemEffect.KineticResistance, 26d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 9d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Kinetic_Resistant_Hull_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -8d),
                    new Pair<>(ItemEffect.ThermicResistance, -8d),
                    new Pair<>(ItemEffect.KineticResistance, 33d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 12d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Kinetic_Resistant_Hull_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 15d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1)),


    Kinetic_Resistant_Armor_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d),
                    new Pair<>(ItemEffect.KineticResistance, 12d)
            ),
            new CostData(Material.NICKEL, 1)),

    Kinetic_Resistant_Armor_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -6d),
                    new Pair<>(ItemEffect.ThermicResistance, -6d),
                    new Pair<>(ItemEffect.KineticResistance, 19d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.VANADIUM, 1)),

    Kinetic_Resistant_Armor_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -8d),
                    new Pair<>(ItemEffect.ThermicResistance, -8d),
                    new Pair<>(ItemEffect.KineticResistance, 26d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Kinetic_Resistant_Armor_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 33d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Kinetic_Resistant_Armor_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -12d),
                    new Pair<>(ItemEffect.ThermicResistance, -12d),
                    new Pair<>(ItemEffect.KineticResistance, 40d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1)),


    Kinetic_Resistant_Booster_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 8d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -1d)
            ),
            new CostData(Material.IRON, 1)),

    Kinetic_Resistant_Booster_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 12d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -1d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Kinetic_Resistant_Booster_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 17d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1)),

    Kinetic_Resistant_Booster_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 22d),
                    new Pair<>(ItemEffect.ThermicResistance, -3d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -3d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Kinetic_Resistant_Booster_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 27d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),


    Kinetic_Resistant_Shield_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 10d),
                    new Pair<>(ItemEffect.Integrity, 20d),
                    new Pair<>(ItemEffect.ThermicResistance, -3d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    Kinetic_Resistant_Shield_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 20d),
                    new Pair<>(ItemEffect.Integrity, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Kinetic_Resistant_Shield_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 30d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.ThermicResistance, -9d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1)),

    Kinetic_Resistant_Shield_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 40d),
                    new Pair<>(ItemEffect.Integrity, 35d),
                    new Pair<>(ItemEffect.ThermicResistance, -12d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MERCURY, 1)),

    Kinetic_Resistant_Shield_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, 50d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.ThermicResistance, -15d)
            ),
            new CostData(Material.SHIELDDENSITYREPORTS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.RUTHENIUM, 1)),


    /*
    Resistance Augmented
     */

    Resistance_Augmented_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 5d),
                    new Pair<>(ItemEffect.Integrity, -4d),
                    new Pair<>(ItemEffect.KineticResistance, 5d),
                    new Pair<>(ItemEffect.ThermicResistance, 5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 5d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Resistance_Augmented_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.Integrity, -6d),
                    new Pair<>(ItemEffect.KineticResistance, 8d),
                    new Pair<>(ItemEffect.ThermicResistance, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 8d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Resistance_Augmented_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.Integrity, -8d),
                    new Pair<>(ItemEffect.KineticResistance, 11d),
                    new Pair<>(ItemEffect.ThermicResistance, 11d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 11d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1)),

    Resistance_Augmented_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 15d),
                    new Pair<>(ItemEffect.ThermicResistance, 15d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 15d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Resistance_Augmented_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 25d),
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.KineticResistance, 17d),
                    new Pair<>(ItemEffect.ThermicResistance, 17d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 17d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.IMPERIALSHIELDING, 1)),


    /*
    Thermal Resistant
     */

    Thermal_Resistant_Hull_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 3d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    Thermal_Resistant_Hull_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, 19d),
                    new Pair<>(ItemEffect.KineticResistance, -4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    Thermal_Resistant_Hull_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -6d),
                    new Pair<>(ItemEffect.ThermicResistance, 26d),
                    new Pair<>(ItemEffect.KineticResistance, -6d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 9d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    Thermal_Resistant_Hull_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -8d),
                    new Pair<>(ItemEffect.ThermicResistance, 33d),
                    new Pair<>(ItemEffect.KineticResistance, -8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 12d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.HEATVANES, 1)),

    Thermal_Resistant_Hull_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, 40d),
                    new Pair<>(ItemEffect.KineticResistance, -10d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 15d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),


    Thermal_Resistant_Armor_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d),
                    new Pair<>(ItemEffect.KineticResistance, -4d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    Thermal_Resistant_Armor_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -6d),
                    new Pair<>(ItemEffect.ThermicResistance, 19d),
                    new Pair<>(ItemEffect.KineticResistance, -6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    Thermal_Resistant_Armor_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -8d),
                    new Pair<>(ItemEffect.ThermicResistance, 19d),
                    new Pair<>(ItemEffect.KineticResistance, -4d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    Thermal_Resistant_Armor_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, 33d),
                    new Pair<>(ItemEffect.KineticResistance, -10d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.HEATVANES, 1)),

    Thermal_Resistant_Armor_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -12d),
                    new Pair<>(ItemEffect.ThermicResistance, 40d),
                    new Pair<>(ItemEffect.KineticResistance, -12d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),


    Thermal_Resistant_Booster_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -1d),
                    new Pair<>(ItemEffect.ThermicResistance, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -1d)
            ),
            new CostData(Material.IRON, 1)),

    Thermal_Resistant_Booster_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -1d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -1d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.GERMANIUM, 1)),

    Thermal_Resistant_Booster_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, 17d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.FOCUSCRYSTALS, 1)),

    Thermal_Resistant_Booster_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -3d),
                    new Pair<>(ItemEffect.ThermicResistance, 22d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -3d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Thermal_Resistant_Booster_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, 27d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),


    Thermal_Resistant_Shield_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -4d),
                    new Pair<>(ItemEffect.Integrity, 20d),
                    new Pair<>(ItemEffect.ThermicResistance, 10d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    Thermal_Resistant_Shield_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -8d),
                    new Pair<>(ItemEffect.Integrity, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, 20d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Thermal_Resistant_Shield_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -12d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.ThermicResistance, 30d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.SELENIUM, 1)),

    Thermal_Resistant_Shield_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -16d),
                    new Pair<>(ItemEffect.Integrity, 35d),
                    new Pair<>(ItemEffect.ThermicResistance, 40d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MERCURY, 1)),

    Thermal_Resistant_Shield_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d)
            ),
            new CostData(Material.SHIELDDENSITYREPORTS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.RUTHENIUM, 1)),


    /*
    Expanded Capture Arc
     */

    Expanded_Capture_Arc_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 40d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, -10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Expanded_Capture_Arc_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 60d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, -15d)
            ),
            new CostData(Material.ENCRYPTEDFILES, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Expanded_Capture_Arc_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 80d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, -20d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.ENCRYPTIONCODES, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1)),

    Expanded_Capture_Arc_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 100d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, -25d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.WAKESOLUTIONS, 1),
            new CostData(Material.ENCODEDSCANDATA, 1)),

    Expanded_Capture_Arc_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 50d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 120d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, -30d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1),
            new CostData(Material.CLASSIFIEDSCANDATA, 1)),


    /*
    Rapid Charge
     */

    Rapid_Charge_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ShieldBankDuration, -6d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -10d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.Range, 5d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Rapid_Charge_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ShieldBankDuration, -12d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -20d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.Range, 10d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.CHROMIUM, 1)),

    Rapid_Charge_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ShieldBankDuration, -18d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -30d),
                    new Pair<>(ItemEffect.BootTime, 20d),
                    new Pair<>(ItemEffect.Range, 15d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1)),

    Rapid_Charge_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ShieldBankDuration, -24d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -40d),
                    new Pair<>(ItemEffect.BootTime, 25d),
                    new Pair<>(ItemEffect.Range, 20d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.THERMICALLOYS, 1)),


    /*
    Specialised
     */

    Specialised_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.Integrity, -5d),
                    new Pair<>(ItemEffect.BootTime, -8d),
                    new Pair<>(ItemEffect.ShieldBankHeat, -6d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 4d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Specialised_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.BootTime, -16d),
                    new Pair<>(ItemEffect.ShieldBankHeat, -12d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 6d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Specialised_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.BootTime, -24d),
                    new Pair<>(ItemEffect.ShieldBankHeat, -18d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 8d)
            ),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1)),

    Specialised_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 25d),
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.BootTime, -32d),
                    new Pair<>(ItemEffect.ShieldBankHeat, -24d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 10d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.YTTRIUM, 1)),


    /*
    Enhanced Low FACTION
     */

    Enhanced_Low_Power_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -20d),
                    new Pair<>(ItemEffect.optimal_strength, 3d),
                    new Pair<>(ItemEffect.Integrity, -5d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -2d),
                    new Pair<>(ItemEffect.Mass, -18d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    Enhanced_Low_Power_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -25d),
                    new Pair<>(ItemEffect.optimal_strength, 6d),
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -3d),
                    new Pair<>(ItemEffect.Mass, -26d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1)),

    Enhanced_Low_Power_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -30d),
                    new Pair<>(ItemEffect.optimal_strength, 9d),
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -4d),
                    new Pair<>(ItemEffect.Mass, -34d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1)),

    Enhanced_Low_Power_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -35d),
                    new Pair<>(ItemEffect.optimal_strength, 12d),
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -5d),
                    new Pair<>(ItemEffect.Mass, -42d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    Enhanced_Low_Power_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, -40d),
                    new Pair<>(ItemEffect.optimal_strength, 15d),
                    new Pair<>(ItemEffect.Integrity, -25d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -6d),
                    new Pair<>(ItemEffect.Mass, -50d)
            ),
            new CostData(Material.SHIELDDENSITYREPORTS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1)),

    /*
    Faster Boot Sequence
     */

    Faster_Boot_Sequence_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 3d),
                    new Pair<>(ItemEffect.Integrity, -3d),
                    new Pair<>(ItemEffect.BootTime, -20d),
                    new Pair<>(ItemEffect.ThermalLoad, 4d)
            ),
            new CostData(Material.GRIDRESISTORS, 1)),

    Faster_Boot_Sequence_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 6d),
                    new Pair<>(ItemEffect.Integrity, -6d),
                    new Pair<>(ItemEffect.BootTime, -35d),
                    new Pair<>(ItemEffect.ThermalLoad, 8d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.CHROMIUM, 1)),

    Faster_Boot_Sequence_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 9d),
                    new Pair<>(ItemEffect.Integrity, -9d),
                    new Pair<>(ItemEffect.BootTime, -50d),
                    new Pair<>(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.SELENIUM, 1)),

    Faster_Boot_Sequence_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 12d),
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.BootTime, -65d),
                    new Pair<>(ItemEffect.ThermalLoad, 16d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.CADMIUM, 1)),

    Faster_Boot_Sequence_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDOptimalMass, 15d),
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.BootTime, -80d),
                    new Pair<>(ItemEffect.ThermalLoad, 20d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TELLURIUM, 1)),


    /*
    Increased Range
     */

    Increased_Range_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 3d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 15d),
                    new Pair<>(ItemEffect.Integrity, -3d),
                    new Pair<>(ItemEffect.Mass, 10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1)),

    Increased_Range_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 6d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 25d),
                    new Pair<>(ItemEffect.Integrity, -6d),
                    new Pair<>(ItemEffect.Mass, 15d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1),
            new CostData(Material.CHEMICALPROCESSORS, 1)),

    Increased_Range_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 9d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 35d),
                    new Pair<>(ItemEffect.Integrity, -9d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.CHEMICALPROCESSORS, 1),
            new CostData(Material.WAKESOLUTIONS, 1)),

    Increased_Range_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 45d),
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.Mass, 25d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.CHEMICALDISTILLERY, 1),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1)),

    Increased_Range_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 55d),
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.DATAMINEDWAKE, 1)),


    /*
    Charge Enhanced
     */

    Charge_Enhanced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerCapacity, -1d),
                    new Pair<>(ItemEffect.power_recharge, 9d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Charge_Enhanced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerCapacity, -2d),
                    new Pair<>(ItemEffect.power_recharge, 18d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.CHEMICALPROCESSORS, 1)),

    Charge_Enhanced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerCapacity, -3d),
                    new Pair<>(ItemEffect.power_recharge, 27d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.CHEMICALDISTILLERY, 1)),

    Charge_Enhanced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerCapacity, -4d),
                    new Pair<>(ItemEffect.power_recharge, 36d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.CHEMICALMANIPULATORS, 1)),

    Charge_Enhanced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerCapacity, -5d),
                    new Pair<>(ItemEffect.power_recharge, 45d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),


    /*
    Engine Focused
     */

    Engine_Focused_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -3d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -3d),
                    new Pair<>(ItemEffect.SystemsCapacity, -3d),
                    new Pair<>(ItemEffect.EnginesCapacity, 20d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -1d),
                    new Pair<>(ItemEffect.EnginesRecharge, 16d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Engine_Focused_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -6d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -6d),
                    new Pair<>(ItemEffect.SystemsCapacity, -6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 30d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -2d),
                    new Pair<>(ItemEffect.EnginesRecharge, 23d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Engine_Focused_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -9d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -9d),
                    new Pair<>(ItemEffect.SystemsCapacity, -9d),
                    new Pair<>(ItemEffect.EnginesCapacity, 40d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -3d),
                    new Pair<>(ItemEffect.EnginesRecharge, 30d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    Engine_Focused_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -12d),
                    new Pair<>(ItemEffect.SystemsCapacity, -12d),
                    new Pair<>(ItemEffect.EnginesCapacity, 50d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -4d),
                    new Pair<>(ItemEffect.EnginesRecharge, 37d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Engine_Focused_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -15d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -15d),
                    new Pair<>(ItemEffect.SystemsCapacity, -15d),
                    new Pair<>(ItemEffect.EnginesCapacity, 60d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -5d),
                    new Pair<>(ItemEffect.EnginesRecharge, 44d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    High Charge Capacity
     */

    High_Charge_Capacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.power_recharge, -2d),
                    new Pair<>(ItemEffect.Integrity, 10d),
                    new Pair<>(ItemEffect.PowerCapacity, 10d)
            ),
            new CostData(Material.SULPHUR, 1)),

    High_Charge_Capacity_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.power_recharge, -6d),
                    new Pair<>(ItemEffect.Integrity, 15d),
                    new Pair<>(ItemEffect.PowerCapacity, 18d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.CHROMIUM, 1)),

    High_Charge_Capacity_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.power_recharge, -10d),
                    new Pair<>(ItemEffect.Integrity, 20d),
                    new Pair<>(ItemEffect.PowerCapacity, 26d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    High_Charge_Capacity_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.power_recharge, -15d),
                    new Pair<>(ItemEffect.Integrity, 25d),
                    new Pair<>(ItemEffect.PowerCapacity, 34d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    High_Charge_Capacity_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.power_recharge, -18d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.PowerCapacity, 42d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    System Focused
     */

    System_Focused_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -3d),
                    new Pair<>(ItemEffect.SystemsRecharge, 16d),
                    new Pair<>(ItemEffect.SystemsCapacity, 20d),
                    new Pair<>(ItemEffect.EnginesCapacity, -3d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -3d),
                    new Pair<>(ItemEffect.EnginesRecharge, -1d)
            ),
            new CostData(Material.SULPHUR, 1)),

    System_Focused_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -6d),
                    new Pair<>(ItemEffect.SystemsRecharge, 23d),
                    new Pair<>(ItemEffect.SystemsCapacity, 30d),
                    new Pair<>(ItemEffect.EnginesCapacity, -6d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -6d),
                    new Pair<>(ItemEffect.EnginesRecharge, -2d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    System_Focused_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -9d),
                    new Pair<>(ItemEffect.SystemsRecharge, 30d),
                    new Pair<>(ItemEffect.SystemsCapacity, 40d),
                    new Pair<>(ItemEffect.EnginesCapacity, -9d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -9d),
                    new Pair<>(ItemEffect.EnginesRecharge, -3d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    System_Focused_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -12d),
                    new Pair<>(ItemEffect.SystemsRecharge, 37d),
                    new Pair<>(ItemEffect.SystemsCapacity, 50d),
                    new Pair<>(ItemEffect.EnginesCapacity, -12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -12d),
                    new Pair<>(ItemEffect.EnginesRecharge, -4d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    System_Focused_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, -15d),
                    new Pair<>(ItemEffect.SystemsRecharge, 44d),
                    new Pair<>(ItemEffect.SystemsCapacity, 60d),
                    new Pair<>(ItemEffect.EnginesCapacity, -15d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -15d),
                    new Pair<>(ItemEffect.EnginesRecharge, -5d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    Weapon Focused
     */

    Weapon_Focused_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, 20d),
                    new Pair<>(ItemEffect.SystemsRecharge, -1d),
                    new Pair<>(ItemEffect.SystemsCapacity, -3d),
                    new Pair<>(ItemEffect.EnginesCapacity, -3d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 16d),
                    new Pair<>(ItemEffect.EnginesRecharge, -3d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Weapon_Focused_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, 30d),
                    new Pair<>(ItemEffect.SystemsRecharge, -2d),
                    new Pair<>(ItemEffect.SystemsCapacity, -6d),
                    new Pair<>(ItemEffect.EnginesCapacity, -6d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 23d),
                    new Pair<>(ItemEffect.EnginesRecharge, -6d)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Weapon_Focused_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, 40d),
                    new Pair<>(ItemEffect.SystemsRecharge, -3d),
                    new Pair<>(ItemEffect.SystemsCapacity, -9d),
                    new Pair<>(ItemEffect.EnginesCapacity, -9d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 30d),
                    new Pair<>(ItemEffect.EnginesRecharge, -9d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.SELENIUM, 1)),

    Weapon_Focused_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, 50d),
                    new Pair<>(ItemEffect.SystemsRecharge, -4d),
                    new Pair<>(ItemEffect.SystemsCapacity, -12d),
                    new Pair<>(ItemEffect.EnginesCapacity, -12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 37d),
                    new Pair<>(ItemEffect.EnginesRecharge, -12d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.CADMIUM, 1)),

    Weapon_Focused_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.WeaponsCapacity, 60d),
                    new Pair<>(ItemEffect.SystemsRecharge, -5d),
                    new Pair<>(ItemEffect.SystemsCapacity, -15d),
                    new Pair<>(ItemEffect.EnginesCapacity, -15d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 44d),
                    new Pair<>(ItemEffect.EnginesRecharge, -15d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.TELLURIUM, 1)),


    /*
    Armoured
     */

    Armoured_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.SystemsCapacity, 4d),
                    new Pair<>(ItemEffect.EnginesCapacity, 40d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -4d),
                    new Pair<>(ItemEffect.EnginesRecharge, 4d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    Armoured_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.SystemsCapacity, 6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 60d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -6d),
                    new Pair<>(ItemEffect.EnginesRecharge, 8d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Armoured_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.SystemsCapacity, 8d),
                    new Pair<>(ItemEffect.EnginesCapacity, 80d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -8d),
                    new Pair<>(ItemEffect.EnginesRecharge, 12d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Armoured_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.SystemsCapacity, 10d),
                    new Pair<>(ItemEffect.EnginesCapacity, 100d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -10d),
                    new Pair<>(ItemEffect.EnginesRecharge, 16d)
            ),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Armoured_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.SystemsCapacity, 12d),
                    new Pair<>(ItemEffect.EnginesCapacity, 120d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -12d),
                    new Pair<>(ItemEffect.EnginesRecharge, 20d)
            ),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1)),


    /*
    Low Emissions
     */

    Low_Emissions_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.HeatEfficiency, -25d),
                    new Pair<>(ItemEffect.PowerCapacity, -3d)
            ),
            new CostData(Material.IRON, 1)),

    Low_Emissions_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.HeatEfficiency, -35d),
                    new Pair<>(ItemEffect.PowerCapacity, -6d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1)),

    Low_Emissions_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 12d),
                    new Pair<>(ItemEffect.HeatEfficiency, -45d),
                    new Pair<>(ItemEffect.PowerCapacity, -9d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    Low_Emissions_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.HeatEfficiency, -56d),
                    new Pair<>(ItemEffect.PowerCapacity, -12d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.EMISSIONDATA, 1),
            new CostData(Material.HEATVANES, 1)),

    Low_Emissions_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.HeatEfficiency, -65d),
                    new Pair<>(ItemEffect.PowerCapacity, -15d)
            ),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),


    /*
    Clean
     */

    Clean_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineHeatRate, -20d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 8d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -2d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Clean_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 4d),
                    new Pair<>(ItemEffect.Integrity, -4d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -4d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 13d),
                    new Pair<>(ItemEffect.EngineHeatRate, -30d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Clean_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 8d),
                    new Pair<>(ItemEffect.Integrity, -8d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -6d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 18d),
                    new Pair<>(ItemEffect.EngineHeatRate, -40d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Clean_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -8d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 23d),
                    new Pair<>(ItemEffect.EngineHeatRate, -50d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    Clean_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 16d),
                    new Pair<>(ItemEffect.Integrity, -16d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -10d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 28d),
                    new Pair<>(ItemEffect.EngineHeatRate, -60d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.COMPACTEMISSIONSDATA, 1)),


    /*
    Dirty
     */

    Dirty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 4d),
                    new Pair<>(ItemEffect.Integrity, -3d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -3d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 12d),
                    new Pair<>(ItemEffect.EngineHeatRate, 20d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Dirty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 6d),
                    new Pair<>(ItemEffect.Integrity, -6d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -5d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 19d),
                    new Pair<>(ItemEffect.EngineHeatRate, 30d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Dirty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 8d),
                    new Pair<>(ItemEffect.Integrity, -9d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -8d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 26d),
                    new Pair<>(ItemEffect.EngineHeatRate, 40d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1)),

    Dirty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -10d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 33d),
                    new Pair<>(ItemEffect.EngineHeatRate, 50d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Dirty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -13d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 40d),
                    new Pair<>(ItemEffect.EngineHeatRate, 650d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.PHARMACEUTICALISOLATORS, 1));

    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffectData effects;

    ModificationRecipe(ItemGrade grade, ItemEffectData effects, CostData... cost)
    {
        this.grade = grade;
        this.effects = effects;
        this.cost = cost;
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
        return super.toString().replace("_"," ");
    }

    public String getLabel()
    {
        String name = name().replace("_"," ").substring(0,name().length()-1);
        String grade = Arrays.stream(name().split("_")).reduce((a, b) -> b).orElse("?");
        return  name + "Grade " + grade;
    }

    @Override
    public String getName()
    {
        return name();
    }
}
