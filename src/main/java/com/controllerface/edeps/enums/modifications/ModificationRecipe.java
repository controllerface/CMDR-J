package com.controllerface.edeps.enums.modifications;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.MaterialCostData;
import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.data.MaterialCostData;
import com.controllerface.edeps.data.ModificationEffectData;
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

    Efficient_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 8d),
                    new Pair<>(ModificationEffect.Thermal_Load, -38d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    Efficient_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 12d),
                    new Pair<>(ModificationEffect.Power_Draw, -12d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -15d),
                    new Pair<>(ModificationEffect.Thermal_Load, -43d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1)),

    Efficient_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 16d),
                    new Pair<>(ModificationEffect.Power_Draw, -24d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -25d),
                    new Pair<>(ModificationEffect.Thermal_Load, -48d)
            ),
            new MaterialCostData(Material.SCRAMBLEDEMISSIONDATA, 1),
            new MaterialCostData(Material.CHROMIUM, 1),
            new MaterialCostData(Material.HEATEXCHANGERS, 1)),

    Efficient_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 20d),
                    new Pair<>(ModificationEffect.Power_Draw, -36d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -35d),
                    new Pair<>(ModificationEffect.Thermal_Load, -53d)
            ),
            new MaterialCostData(Material.ARCHIVEDEMISSIONDATA, 1),
            new MaterialCostData(Material.SELENIUM, 1),
            new MaterialCostData(Material.HEATVANES, 1)),

    Efficient_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 24d),
                    new Pair<>(ModificationEffect.Power_Draw, -48d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -45d),
                    new Pair<>(ModificationEffect.Thermal_Load, -60d)
            ),
            new MaterialCostData(Material.EMISSIONDATA, 1),
            new MaterialCostData(Material.CADMIUM, 1),
            new MaterialCostData(Material.PROTOHEATRADIATORS, 1)),


    /*
    Light Weight
     */
    Lightweight_Bulkheads_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 3d),
                    new Pair<>(ModificationEffect.Hull_Boost, -1d),
                    new Pair<>(ModificationEffect.Mass, -15d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Lightweight_Bulkheads_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 6d),
                    new Pair<>(ModificationEffect.Hull_Boost, -2d),
                    new Pair<>(ModificationEffect.Mass, -25d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Lightweight_Bulkheads_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 9d),
                    new Pair<>(ModificationEffect.Hull_Boost, -3d),
                    new Pair<>(ModificationEffect.Mass, -35d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Lightweight_Bulkheads_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 12d),
                    new Pair<>(ModificationEffect.Hull_Boost, -4d),
                    new Pair<>(ModificationEffect.Mass, -45d)
            ),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Lightweight_Bulkheads_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 15d),
                    new Pair<>(ModificationEffect.Hull_Boost, -5d),
                    new Pair<>(ModificationEffect.Mass, -56d)
            ),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.TIN, 1),
            new MaterialCostData(Material.MILITARYGRADEALLOYS, 1)),


    Lightweight_Sensors_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -5d),
                    new Pair<>(ModificationEffect.Integrity, -10d),
                    new Pair<>(ModificationEffect.Mass, -20d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1)),

    Lightweight_Sensors_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -10d),
                    new Pair<>(ModificationEffect.Integrity, -20d),
                    new Pair<>(ModificationEffect.Mass, -35d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.MANGANESE, 1)),

    Lightweight_Sensors_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -15d),
                    new Pair<>(ModificationEffect.Integrity, -30d),
                    new Pair<>(ModificationEffect.Mass, -50d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.MANGANESE, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1)),

    Lightweight_Sensors_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -20d),
                    new Pair<>(ModificationEffect.Integrity, -40d),
                    new Pair<>(ModificationEffect.Mass, -65d)
            ),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Lightweight_Sensors_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -25d),
                    new Pair<>(ModificationEffect.Integrity, -50d),
                    new Pair<>(ModificationEffect.Mass, -80d)
            ),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1),
            new MaterialCostData(Material.PROTORADIOLICALLOYS, 1)),


    Lightweight_Utility_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -10d),
                    new Pair<>(ModificationEffect.Mass, -45d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1)),

    Lightweight_Utility_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -20d),
                    new Pair<>(ModificationEffect.Mass, -56d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.MANGANESE, 1)),

    Lightweight_Utility_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -30d),
                    new Pair<>(ModificationEffect.Mass, -65d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.MANGANESE, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1)),

    Lightweight_Utility_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -40d),
                    new Pair<>(ModificationEffect.Mass, -75d)
            ),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Lightweight_Utility_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -50d),
                    new Pair<>(ModificationEffect.Mass, -85d)
            ),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1),
            new MaterialCostData(Material.PROTORADIOLICALLOYS, 1)),


    Lightweight_Weapon_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -20d),
                    new Pair<>(ModificationEffect.Mass, -30d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1)),

    Lightweight_Weapon_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -10d),
                    new Pair<>(ModificationEffect.Integrity, -30d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -20d),
                    new Pair<>(ModificationEffect.Mass, -45d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.MANGANESE, 1)),

    Lightweight_Weapon_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -20d),
                    new Pair<>(ModificationEffect.Integrity, -40d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -25d),
                    new Pair<>(ModificationEffect.Mass, -60d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.MANGANESE, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1)),

    Lightweight_Weapon_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -30d),
                    new Pair<>(ModificationEffect.Integrity, -50d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -30d),
                    new Pair<>(ModificationEffect.Mass, -75d)
            ),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1)),

    Lightweight_Weapon_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -40d),
                    new Pair<>(ModificationEffect.Integrity, -60d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -35d),
                    new Pair<>(ModificationEffect.Mass, -90d)
            ),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.PROTOLIGHTALLOYS, 1),
            new MaterialCostData(Material.PROTORADIOLICALLOYS, 1)),


    /*
    Long Range
     */

    Long_Range_Weapon_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 3d),
                    new Pair<>(ModificationEffect.Maximum_Range, 20d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 20d),
                    new Pair<>(ModificationEffect.Mass, 10d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    Long_Range_Weapon_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 6d),
                    new Pair<>(ModificationEffect.Maximum_Range, 40d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 40d),
                    new Pair<>(ModificationEffect.Mass, 15d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1)),

    Long_Range_Weapon_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 9d),
                    new Pair<>(ModificationEffect.Maximum_Range, 60d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 60d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1)),

    Long_Range_Weapon_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 12d),
                    new Pair<>(ModificationEffect.Maximum_Range, 80d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 80d),
                    new Pair<>(ModificationEffect.Mass, 25d)
            ),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Long_Range_Weapon_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 15d),
                    new Pair<>(ModificationEffect.Maximum_Range, 100d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 100d),
                    new Pair<>(ModificationEffect.Mass, 30d)
            ),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1),
            new MaterialCostData(Material.THERMICALLOYS, 1),
            new MaterialCostData(Material.BIOTECHCONDUCTORS, 1)),


    Long_Range_Large_Calibre_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 3d),
                    new Pair<>(ModificationEffect.Maximum_Range, 20d),
                    new Pair<>(ModificationEffect.Shot_Speed, 20d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 20d),
                    new Pair<>(ModificationEffect.Mass, 10d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    Long_Range_Large_Calibre_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 6d),
                    new Pair<>(ModificationEffect.Maximum_Range, 40d),
                    new Pair<>(ModificationEffect.Shot_Speed, 40d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 40d),
                    new Pair<>(ModificationEffect.Mass, 15d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1)),

    Long_Range_Large_Calibre_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 9d),
                    new Pair<>(ModificationEffect.Maximum_Range, 60d),
                    new Pair<>(ModificationEffect.Shot_Speed, 60d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 60d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1)),

    Long_Range_Large_Calibre_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 12d),
                    new Pair<>(ModificationEffect.Maximum_Range, 80d),
                    new Pair<>(ModificationEffect.Shot_Speed, 80d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 80d),
                    new Pair<>(ModificationEffect.Mass, 25d)
            ),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Long_Range_Large_Calibre_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 15d),
                    new Pair<>(ModificationEffect.Maximum_Range, 100d),
                    new Pair<>(ModificationEffect.Shot_Speed, 100d),
                    new Pair<>(ModificationEffect.Damage_Falloff_Start, 100d),
                    new Pair<>(ModificationEffect.Mass, 30d)
            ),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1),
            new MaterialCostData(Material.THERMICALLOYS, 1),
            new MaterialCostData(Material.BIOTECHCONDUCTORS, 1)),


    Long_Range_Scan_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -10d),
                    new Pair<>(ModificationEffect.Scan_Range, 24d),
                    new Pair<>(ModificationEffect.Power_Draw, 10d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Long_Range_Scan_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -15d),
                    new Pair<>(ModificationEffect.Scan_Range, 48d),
                    new Pair<>(ModificationEffect.Power_Draw, 20d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1)),

    Long_Range_Scan_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -20d),
                    new Pair<>(ModificationEffect.Scan_Range, 72d),
                    new Pair<>(ModificationEffect.Power_Draw, 30d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.EMISSIONDATA, 1)),

    Long_Range_Scan_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -25d),
                    new Pair<>(ModificationEffect.Scan_Range, 96d),
                    new Pair<>(ModificationEffect.Power_Draw, 40d)
            ),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1),
            new MaterialCostData(Material.DECODEDEMISSIONDATA, 1)),

    Long_Range_Scan_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -30d),
                    new Pair<>(ModificationEffect.Scan_Range, 120d),
                    new Pair<>(ModificationEffect.Power_Draw, 50d)
            ),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1),
            new MaterialCostData(Material.COMPACTEMISSIONSDATA, 1)),


    Long_Range_Sensors_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -10d),
                    new Pair<>(ModificationEffect.Range, 15d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Long_Range_Sensors_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -15d),
                    new Pair<>(ModificationEffect.Range, 30d),
                    new Pair<>(ModificationEffect.Mass, 40d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1)),

    Long_Range_Sensors_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -20d),
                    new Pair<>(ModificationEffect.Range, 45d),
                    new Pair<>(ModificationEffect.Mass, 60d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.EMISSIONDATA, 1)),

    Long_Range_Sensors_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -25d),
                    new Pair<>(ModificationEffect.Range, 60d),
                    new Pair<>(ModificationEffect.Mass, 80d)
            ),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1),
            new MaterialCostData(Material.DECODEDEMISSIONDATA, 1)),

    Long_Range_Sensors_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, -30d),
                    new Pair<>(ModificationEffect.Range, 75d),
                    new Pair<>(ModificationEffect.Mass, 100d)
            ),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1),
            new MaterialCostData(Material.COMPACTEMISSIONSDATA, 1)),


    Long_Range_Interdictor_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Range, 20d),
                    new Pair<>(ModificationEffect.Facing_Limit, -10d),
                    new Pair<>(ModificationEffect.Mass, 10d)
            ),
            new MaterialCostData(Material.ENCRYPTEDFILES, 1)),

    Long_Range_Interdictor_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 20d),
                    new Pair<>(ModificationEffect.Range, 30d),
                    new Pair<>(ModificationEffect.Facing_Limit, -15d),
                    new Pair<>(ModificationEffect.Mass, 15d)
            ),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 1),
            new MaterialCostData(Material.ENCRYPTIONCODES, 1)),

    Long_Range_Interdictor_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 30d),
                    new Pair<>(ModificationEffect.Range, 40d),
                    new Pair<>(ModificationEffect.Facing_Limit, -20d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.BULKSCANDATA, 1),
            new MaterialCostData(Material.FSDTELEMETRY, 1),
            new MaterialCostData(Material.SYMMETRICKEYS, 1)),

    Long_Range_Interdictor_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 40d),
                    new Pair<>(ModificationEffect.Range, 50d),
                    new Pair<>(ModificationEffect.Facing_Limit, -25d),
                    new Pair<>(ModificationEffect.Mass, 25d)
            ),
            new MaterialCostData(Material.SCANARCHIVES, 1),
            new MaterialCostData(Material.WAKESOLUTIONS, 1),
            new MaterialCostData(Material.ENCRYPTIONARCHIVES, 1)),

    Long_Range_Interdictor_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 50d),
                    new Pair<>(ModificationEffect.Range, 60d),
                    new Pair<>(ModificationEffect.Facing_Limit, -30d),
                    new Pair<>(ModificationEffect.Mass, 30d)
            ),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1),
            new MaterialCostData(Material.HYPERSPACETRAJECTORIES, 1),
            new MaterialCostData(Material.ADAPTIVEENCRYPTORS, 1)),


    Long_Range_Surface_Scan_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Range, 40d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Long_Range_Surface_Scan_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Range, 80d),
                    new Pair<>(ModificationEffect.Mass, 40d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1)),

    Long_Range_Surface_Scan_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Range, 120d),
                    new Pair<>(ModificationEffect.Mass, 60d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.EMISSIONDATA, 1)),

    Long_Range_Surface_Scan_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Range, 160d),
                    new Pair<>(ModificationEffect.Mass, 80d)
            ),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1),
            new MaterialCostData(Material.DECODEDEMISSIONDATA, 1)),

    Long_Range_Surface_Scan_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Range, 200d),
                    new Pair<>(ModificationEffect.Mass, 100d)
            ),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1),
            new MaterialCostData(Material.COMPACTEMISSIONSDATA, 1)),


    /*
    Overcharged
     */

    Overcharged_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 30d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 15d),
                    new Pair<>(ModificationEffect.Thermal_Load, 3d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Overcharged_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 40d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 25d),
                    new Pair<>(ModificationEffect.Thermal_Load, 9d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Overcharged_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 50d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 25d),
                    new Pair<>(ModificationEffect.Thermal_Load, 9d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1)),

    Overcharged_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 60d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 30d),
                    new Pair<>(ModificationEffect.Thermal_Load, 12d)
            ),
            new MaterialCostData(Material.ZINC, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1)),

    Overcharged_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 70d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 35d),
                    new Pair<>(ModificationEffect.Thermal_Load, 12d)
            ),
            new MaterialCostData(Material.ZIRCONIUM, 1),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1),
            new MaterialCostData(Material.EMBEDDEDFIRMWARE, 1)),


    Overcharged_Multi_Cannon_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, -3d),
                    new Pair<>(ModificationEffect.Damage, 30d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 15d),
                    new Pair<>(ModificationEffect.Thermal_Load, 3d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Overcharged_Multi_Cannon_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, -6d),
                    new Pair<>(ModificationEffect.Damage, 40d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 25d),
                    new Pair<>(ModificationEffect.Thermal_Load, 9d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Overcharged_Multi_Cannon_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, -9d),
                    new Pair<>(ModificationEffect.Damage, 50d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 25d),
                    new Pair<>(ModificationEffect.Thermal_Load, 9d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1)),

    Overcharged_Multi_Cannon_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, -12d),
                    new Pair<>(ModificationEffect.Damage, 60d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 30d),
                    new Pair<>(ModificationEffect.Thermal_Load, 12d)
            ),
            new MaterialCostData(Material.ZINC, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1)),

    Overcharged_Multi_Cannon_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, -15d),
                    new Pair<>(ModificationEffect.Damage, 70d),
                    new Pair<>(ModificationEffect.Distributor_Draw, 35d),
                    new Pair<>(ModificationEffect.Thermal_Load, 12d)
            ),
            new MaterialCostData(Material.ZIRCONIUM, 1),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1),
            new MaterialCostData(Material.EMBEDDEDFIRMWARE, 1)),







    Overcharged_Power_Plant_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -5d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, 5d),
                    new Pair<>(ModificationEffect.Power_Generation, 12d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    Overcharged_Power_Plant_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -10d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, 10d),
                    new Pair<>(ModificationEffect.Power_Generation, 19d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Overcharged_Power_Plant_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -15d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, 15d),
                    new Pair<>(ModificationEffect.Power_Generation, 26d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.SELENIUM, 1)),

    Overcharged_Power_Plant_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -20d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, 20d),
                    new Pair<>(ModificationEffect.Power_Generation, 33d)
            ),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.CADMIUM, 1)),

    Overcharged_Power_Plant_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -25d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, 25d),
                    new Pair<>(ModificationEffect.Power_Generation, 40d)
            ),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.CHEMICALMANIPULATORS, 1),
            new MaterialCostData(Material.TELLURIUM, 1)),







    /*
    Short Range
     */

    Short_Range_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 27d),
                    new Pair<>(ModificationEffect.Maximum_Range, -10d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Short_Range_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 39d),
                    new Pair<>(ModificationEffect.Maximum_Range, -20d),
                    new Pair<>(ModificationEffect.Thermal_Load, 10d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1)),

    Short_Range_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 51d),
                    new Pair<>(ModificationEffect.Maximum_Range, -30d),
                    new Pair<>(ModificationEffect.Thermal_Load, 20d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1)),

    Short_Range_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 63d),
                    new Pair<>(ModificationEffect.Maximum_Range, -40d),
                    new Pair<>(ModificationEffect.Thermal_Load, 30d)
            ),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1)),

    Short_Range_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, 75d),
                    new Pair<>(ModificationEffect.Maximum_Range, -50d),
                    new Pair<>(ModificationEffect.Thermal_Load, 40d)
            ),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 1),
            new MaterialCostData(Material.BIOTECHCONDUCTORS, 1)),


    /*
    Sturdy
     */

    Sturdy_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 100d),
                    new Pair<>(ModificationEffect.Thermal_Load, -10d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 20d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Sturdy_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 150d),
                    new Pair<>(ModificationEffect.Thermal_Load, -15d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 30d),
                    new Pair<>(ModificationEffect.Mass, 40d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1)),

    Sturdy_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 200d),
                    new Pair<>(ModificationEffect.Thermal_Load, -20d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 40d),
                    new Pair<>(ModificationEffect.Mass, 60d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1),
            new MaterialCostData(Material.TUNGSTEN, 1)),

    Sturdy_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 250d),
                    new Pair<>(ModificationEffect.Thermal_Load, -25d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 50d),
                    new Pair<>(ModificationEffect.Mass, 80d)
            ),
            new MaterialCostData(Material.ZINC, 1),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1)),

    Sturdy_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 300d),
                    new Pair<>(ModificationEffect.Thermal_Load, -30d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 60d),
                    new Pair<>(ModificationEffect.Mass, 100d)
            ),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1),
            new MaterialCostData(Material.TECHNETIUM, 1)),


    /*
    Focused
     */

    Focused_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Maximum_Range, 36d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 40d),
                    new Pair<>(ModificationEffect.Thermal_Load, 1d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Focused_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Maximum_Range, 52d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 60d),
                    new Pair<>(ModificationEffect.Thermal_Load, 2d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Focused_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Maximum_Range, 68d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 80d),
                    new Pair<>(ModificationEffect.Thermal_Load, 3d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.CHROMIUM, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1)),

    Focused_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Maximum_Range, 84d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 100d),
                    new Pair<>(ModificationEffect.Thermal_Load, 4d)
            ),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1)),

    Focused_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Maximum_Range, 100d),
                    new Pair<>(ModificationEffect.Armour_Piercing, 120d),
                    new Pair<>(ModificationEffect.Thermal_Load, 5d)
            ),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new MaterialCostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    Rapid Fire
     */

    Rapid_Fire_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, -1d),
                    new Pair<>(ModificationEffect.Reload_Time, -25d),
                    new Pair<>(ModificationEffect.Jitter, 0.5d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 8d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1)),

    Rapid_Fire_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, -2d),
                    new Pair<>(ModificationEffect.Reload_Time, -35d),
                    new Pair<>(ModificationEffect.Jitter, 0.5d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 17d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1)),

    Rapid_Fire_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, -3d),
                    new Pair<>(ModificationEffect.Reload_Time, -45d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -15d),
                    new Pair<>(ModificationEffect.Jitter, 0.5d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 26d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1),
            new MaterialCostData(Material.PRECIPITATEDALLOYS, 1)),

    Rapid_Fire_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, -4d),
                    new Pair<>(ModificationEffect.Reload_Time, -56d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -25d),
                    new Pair<>(ModificationEffect.Jitter, 0.5d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 35d)
            ),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1),
            new MaterialCostData(Material.THERMICALLOYS, 1)),

    Rapid_Fire_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Damage, -5d),
                    new Pair<>(ModificationEffect.Reload_Time, -65d),
                    new Pair<>(ModificationEffect.Distributor_Draw, -35d),
                    new Pair<>(ModificationEffect.Jitter, 0.5d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 44d)
            ),
            new MaterialCostData(Material.PRECIPITATEDALLOYS, 1),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 1),
            new MaterialCostData(Material.TECHNETIUM, 1)),


    /*
    High Capacity
     */

    High_Capacity_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, 36d),
                    new Pair<>(ModificationEffect.Power_Draw, 4d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, 36d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 2d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1)),

    High_Capacity_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, 52d),
                    new Pair<>(ModificationEffect.Power_Draw, 8d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, 52d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 4d),
                    new Pair<>(ModificationEffect.Mass, 30d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.VANADIUM, 1)),

    High_Capacity_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, 68d),
                    new Pair<>(ModificationEffect.Power_Draw, 12d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, 68d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 6d),
                    new Pair<>(ModificationEffect.Mass, 40d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.NIOBIUM, 1)),

    High_Capacity_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, 84d),
                    new Pair<>(ModificationEffect.Power_Draw, 16d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, 84d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 8d),
                    new Pair<>(ModificationEffect.Mass, 50d)
            ),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new MaterialCostData(Material.TIN, 1)),

    High_Capacity_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Clip_Size, 100d),
                    new Pair<>(ModificationEffect.Power_Draw, 20d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, 100d),
                    new Pair<>(ModificationEffect.Rate_Of_Fire, 10d),
                    new Pair<>(ModificationEffect.Mass, 60d)
            ),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new MaterialCostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    Double Shot
     */

    Double_Shot_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Burst_Rate_Of_Fire, 600d),
                    new Pair<>(ModificationEffect.Maximum_Range, -2d),
                    new Pair<>(ModificationEffect.Burst_Size, 2d),
                    new Pair<>(ModificationEffect.Clip_Size, 4d)
            ),
            new MaterialCostData(Material.CARBON, 1)),

    Double_Shot_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Burst_Rate_Of_Fire, 800d),
                    new Pair<>(ModificationEffect.Maximum_Range, -4d),
                    new Pair<>(ModificationEffect.Burst_Size, 2d),
                    new Pair<>(ModificationEffect.Clip_Size, 4d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1)),

    Double_Shot_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Burst_Rate_Of_Fire, 1000d),
                    new Pair<>(ModificationEffect.Maximum_Range, -6d),
                    new Pair<>(ModificationEffect.Burst_Size, 2d),
                    new Pair<>(ModificationEffect.Clip_Size, 4d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1)),

    Double_Shot_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Burst_Rate_Of_Fire, 1200d),
                    new Pair<>(ModificationEffect.Maximum_Range, -8d),
                    new Pair<>(ModificationEffect.Burst_Size, 2d),
                    new Pair<>(ModificationEffect.Clip_Size, 4d)
            ),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1),
            new MaterialCostData(Material.SECURITYFIRMWARE, 1)),

    Double_Shot_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Burst_Rate_Of_Fire, 1400d),
                    new Pair<>(ModificationEffect.Maximum_Range, -10d),
                    new Pair<>(ModificationEffect.Burst_Size, 2d),
                    new Pair<>(ModificationEffect.Clip_Size, 6d)
            ),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 1),
            new MaterialCostData(Material.EMBEDDEDFIRMWARE, 1)),

    /*
    Ammo Capacity
     */

    Ammo_Capacity_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Reload_Time, 10d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, 50d),
                    new Pair<>(ModificationEffect.Mass, 100d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1)),


    /*
    Reinforced
     */

    Reinforced_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 60d),
                    new Pair<>(ModificationEffect.Mass, 30d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Reinforced_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 120d),
                    new Pair<>(ModificationEffect.Mass, 60d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1)),

    Reinforced_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 180d),
                    new Pair<>(ModificationEffect.Mass, 90d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1),
            new MaterialCostData(Material.TUNGSTEN, 1)),

    Reinforced_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 240d),
                    new Pair<>(ModificationEffect.Mass, 120d)
            ),
            new MaterialCostData(Material.ZINC, 1),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1)),

    Reinforced_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 300d),
                    new Pair<>(ModificationEffect.Mass, 150d)
            ),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1),
            new MaterialCostData(Material.TECHNETIUM, 1)),


    Reinforced_Thrusters_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Thermal_Load, -10d),
                    new Pair<>(ModificationEffect.Integrity, 30d),
                    new Pair<>(ModificationEffect.Mass, 5d)
            ),
            new MaterialCostData(Material.CARBON, 1)),

    Reinforced_Thrusters_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Thermal_Load, -20d),
                    new Pair<>(ModificationEffect.Integrity, 50d),
                    new Pair<>(ModificationEffect.Mass, 10d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 1),
            new MaterialCostData(Material.VANADIUM, 1)),

    Reinforced_Thrusters_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Thermal_Load, -30d),
                    new Pair<>(ModificationEffect.Integrity, 70d),
                    new Pair<>(ModificationEffect.Mass, 15d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 1),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.SHIELDINGSENSORS, 1)),

    Reinforced_Thrusters_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Thermal_Load, -40d),
                    new Pair<>(ModificationEffect.Integrity, 90d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new MaterialCostData(Material.COMPOUNDSHIELDING, 1)),

    Reinforced_Thrusters_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Thermal_Load, -50d),
                    new Pair<>(ModificationEffect.Integrity, 110d),
                    new Pair<>(ModificationEffect.Mass, 25d)
            ),
            new MaterialCostData(Material.HEATEXCHANGERS, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new MaterialCostData(Material.IMPERIALSHIELDING, 1)),


    Reinforced_Shield_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Distributor_Draw, 4d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 14d),
                    new Pair<>(ModificationEffect.Broken_Regen_Rate, -10d),
                    new Pair<>(ModificationEffect.All_Resistances, 5d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1)),

    Reinforced_Shield_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Distributor_Draw, 6d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 20d),
                    new Pair<>(ModificationEffect.Broken_Regen_Rate, -10d),
                    new Pair<>(ModificationEffect.All_Resistances, 8d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Reinforced_Shield_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Distributor_Draw, 8d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 26d),
                    new Pair<>(ModificationEffect.Broken_Regen_Rate, -10d),
                    new Pair<>(ModificationEffect.All_Resistances, 11d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -4d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1)),

    Reinforced_Shield_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Distributor_Draw, 10d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 32d),
                    new Pair<>(ModificationEffect.Broken_Regen_Rate, -10d),
                    new Pair<>(ModificationEffect.All_Resistances, 14d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -7d)
            ),
            new MaterialCostData(Material.MANGANESE, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Reinforced_Shield_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Distributor_Draw, 12d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 38d),
                    new Pair<>(ModificationEffect.Broken_Regen_Rate, -10d),
                    new Pair<>(ModificationEffect.All_Resistances, 17d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -9d)
            ),
            new MaterialCostData(Material.ARSENIC, 1),
            new MaterialCostData(Material.CONDUCTIVEPOLYMERS, 1),
            new MaterialCostData(Material.IMPROVISEDCOMPONENTS, 1)),


    /*
    Shielded
     */

    Shielded_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 20d),
                    new Pair<>(ModificationEffect.Integrity, 60d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 1)),

    Shielded_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 40d),
                    new Pair<>(ModificationEffect.Integrity, 120d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1)),

    Shielded_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 60d),
                    new Pair<>(ModificationEffect.Integrity, 180d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Shielded_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 80d),
                    new Pair<>(ModificationEffect.Integrity, 240d)
            ),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.SHIELDINGSENSORS, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Shielded_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 100d),
                    new Pair<>(ModificationEffect.Integrity, 300d)
            ),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.COMPOUNDSHIELDING, 1),
            new MaterialCostData(Material.FEDCORECOMPOSITES, 1)),


    Shielded_FSD_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 3d),
                    new Pair<>(ModificationEffect.Integrity, 25d),
                    new Pair<>(ModificationEffect.Thermal_Load, -10d),
                    new Pair<>(ModificationEffect.Mass, 4d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Shielded_FSD_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 6d),
                    new Pair<>(ModificationEffect.Integrity, 50d),
                    new Pair<>(ModificationEffect.Thermal_Load, -15d),
                    new Pair<>(ModificationEffect.Mass, 8d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1)),

    Shielded_FSD_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 9d),
                    new Pair<>(ModificationEffect.Integrity, 75d),
                    new Pair<>(ModificationEffect.Thermal_Load, -20d),
                    new Pair<>(ModificationEffect.Mass, 12d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.ZINC, 1),
            new MaterialCostData(Material.SHIELDINGSENSORS, 1)),

    Shielded_FSD_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 12d),
                    new Pair<>(ModificationEffect.Integrity, 100d),
                    new Pair<>(ModificationEffect.Thermal_Load, -25d),
                    new Pair<>(ModificationEffect.Mass, 16d)
            ),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new MaterialCostData(Material.COMPOUNDSHIELDING, 1)),

    Shielded_FSD_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 15d),
                    new Pair<>(ModificationEffect.Integrity, 125d),
                    new Pair<>(ModificationEffect.Thermal_Load, -30d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new MaterialCostData(Material.IMPERIALSHIELDING, 1)),


    Shielded_Distributor_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -10d),
                    new Pair<>(ModificationEffect.Integrity, 40d),
                    new Pair<>(ModificationEffect.Mass, 3d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 1)),

    Shielded_Distributor_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -15d),
                    new Pair<>(ModificationEffect.Integrity, 80d),
                    new Pair<>(ModificationEffect.Mass, 6d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1)),

    Shielded_Distributor_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -20d),
                    new Pair<>(ModificationEffect.Integrity, 120d),
                    new Pair<>(ModificationEffect.Mass, 9d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Shielded_Distributor_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -25d),
                    new Pair<>(ModificationEffect.Integrity, 160d),
                    new Pair<>(ModificationEffect.Mass, 12d)
            ),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.SHIELDINGSENSORS, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Shielded_Distributor_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -30d),
                    new Pair<>(ModificationEffect.Integrity, 200d),
                    new Pair<>(ModificationEffect.Mass, 15d)
            ),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.COMPOUNDSHIELDING, 1),
            new MaterialCostData(Material.FEDCORECOMPOSITES, 1)),


    /*
    Fast Scan
     */

    Fast_Scan_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -10d),
                    new Pair<>(ModificationEffect.Scan_Range, -5d),
                    new Pair<>(ModificationEffect.Scan_Time, -20d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1)),

    Fast_Scan_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity,  -20d),
                    new Pair<>(ModificationEffect.Scan_Range,  -10d),
                    new Pair<>(ModificationEffect.Scan_Time,  -35d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 1)),

    Fast_Scan_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -30d),
                    new Pair<>(ModificationEffect.Scan_Range, -15d),
                    new Pair<>(ModificationEffect.Scan_Time, -50d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new MaterialCostData(Material.SYMMETRICKEYS, 1)),

    Fast_Scan_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -40d),
                    new Pair<>(ModificationEffect.Scan_Range, -20d),
                    new Pair<>(ModificationEffect.Scan_Time, -65d)
            ),
            new MaterialCostData(Material.MANGANESE, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1),
            new MaterialCostData(Material.ENCRYPTIONARCHIVES, 1)),

    Fast_Scan_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, -50d),
                    new Pair<>(ModificationEffect.Scan_Range, -25d),
                    new Pair<>(ModificationEffect.Scan_Time, -80d)
            ),
            new MaterialCostData(Material.ARSENIC, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new MaterialCostData(Material.ADAPTIVEENCRYPTORS, 1)),


    Fast_Surface_Scan_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Rate, 20d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1)),

    Fast_Surface_Scan_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Rate, 35d),
                    new Pair<>(ModificationEffect.Mass, 40d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 1)),

    Fast_Surface_Scan_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Rate, 50d),
                    new Pair<>(ModificationEffect.Mass, 60d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new MaterialCostData(Material.SYMMETRICKEYS, 1)),

    Fast_Surface_Scan_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Rate, 65d),
                    new Pair<>(ModificationEffect.Mass, 80d)
            ),
            new MaterialCostData(Material.MANGANESE, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1),
            new MaterialCostData(Material.ENCRYPTIONARCHIVES, 1)),

    Fast_Surface_Scan_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Rate, 80d),
                    new Pair<>(ModificationEffect.Mass, 100d)
            ),
            new MaterialCostData(Material.ARSENIC, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new MaterialCostData(Material.ADAPTIVEENCRYPTORS, 1)),


    /*
    Wide Angle
     */

    Wide_Angle_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 40d),
                    new Pair<>(ModificationEffect.Scan_Time, 10d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1)),

    Wide_Angle_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 80d),
                    new Pair<>(ModificationEffect.Scan_Time, 20d),
                    new Pair<>(ModificationEffect.Mass, 40d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.GERMANIUM, 1)),

    Wide_Angle_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 120d),
                    new Pair<>(ModificationEffect.Scan_Time, 30d),
                    new Pair<>(ModificationEffect.Mass, 60d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1)),

    Wide_Angle_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 160d),
                    new Pair<>(ModificationEffect.Scan_Time, 40d),
                    new Pair<>(ModificationEffect.Mass, 80d)
            ),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.ENCODEDSCANDATA, 1)),

    Wide_Angle_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 200d),
                    new Pair<>(ModificationEffect.Scan_Time, 50d),
                    new Pair<>(ModificationEffect.Mass, 100d)
            ),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1),
            new MaterialCostData(Material.TIN, 1),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1)),


    Wide_Angle_Surface_Scanner_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 40d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1)),

    Wide_Angle_Surface_Scanner_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 80d),
                    new Pair<>(ModificationEffect.Mass, 40d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.GERMANIUM, 1)),

    Wide_Angle_Surface_Scanner_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 120d),
                    new Pair<>(ModificationEffect.Mass, 60d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1)),

    Wide_Angle_Surface_Scanner_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 160d),
                    new Pair<>(ModificationEffect.Mass, 80d)
            ),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.ENCODEDSCANDATA, 1)),

    Wide_Angle_Surface_Scanner_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 200d),
                    new Pair<>(ModificationEffect.Mass, 100d)
            ),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1),
            new MaterialCostData(Material.TIN, 1),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1)),


    Wide_Angle_Sensors_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 40d),
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Range, -4d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1)),

    Wide_Angle_Sensors_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 80d),
                    new Pair<>(ModificationEffect.Power_Draw, 20d),
                    new Pair<>(ModificationEffect.Range, -8d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.GERMANIUM, 1)),

    Wide_Angle_Sensors_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 120d),
                    new Pair<>(ModificationEffect.Power_Draw, 30d),
                    new Pair<>(ModificationEffect.Range, -12d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1)),

    Wide_Angle_Sensors_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 160d),
                    new Pair<>(ModificationEffect.Power_Draw, 40d),
                    new Pair<>(ModificationEffect.Range, -16d)
            ),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.ENCODEDSCANDATA, 1)),

    Wide_Angle_Sensors_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Scan_Angle, 200d),
                    new Pair<>(ModificationEffect.Power_Draw, 50d),
                    new Pair<>(ModificationEffect.Range, -20d)
            ),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1),
            new MaterialCostData(Material.TIN, 1),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1)),


    /*
    Blast Resistant
     */

    Blast_Resistant_Hull_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 12d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -2d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -2d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 3d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Blast_Resistant_Hull_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 19d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -4d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -4d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 6d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.ZINC, 1)),

    Blast_Resistant_Hull_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 26d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -6d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -6d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 9d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.ZIRCONIUM, 1)),

    Blast_Resistant_Hull_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 33d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -8d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -8d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 12d)
            ),
            new MaterialCostData(Material.GALVANISINGALLOYS, 1),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.MERCURY, 1)),

    Blast_Resistant_Hull_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 40d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -8d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -8d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 15d)
            ),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1),
            new MaterialCostData(Material.RUTHENIUM, 1)),


    Blast_Resistant_Shield_Booster_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 8d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -1d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -1d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Blast_Resistant_Shield_Booster_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 12d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -1d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -1d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Blast_Resistant_Shield_Booster_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 17d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -2d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -2d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1)),

    Blast_Resistant_Shield_Booster_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 22d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -3d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -3d)
            ),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Blast_Resistant_Shield_Booster_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 27d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -4d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -4d)
            ),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.SHIELDPATTERNANALYSIS, 1),
            new MaterialCostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),


    Blast_Resistant_Armor_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 8d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -1d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -1d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Blast_Resistant_Armor_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 12d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -1d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -1d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.ZINC, 1)),

    Blast_Resistant_Armor_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 17d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -2d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -2d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.ZIRCONIUM, 1)),

    Blast_Resistant_Armor_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 22d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -3d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -3d)
            ),
            new MaterialCostData(Material.GALVANISINGALLOYS, 1),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.MERCURY, 1)),

    Blast_Resistant_Armor_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, 27d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -4d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -4d)
            ),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1),
            new MaterialCostData(Material.RUTHENIUM, 1)),


    /*
    Heavy Duty
     */

    Heavy_Duty_Shield_Booster_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 5d),
                    new Pair<>(ModificationEffect.Integrity, 3d),
                    new Pair<>(ModificationEffect.Shield_Boost, 10d),
                    new Pair<>(ModificationEffect.Mass, 100d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 1)),

    Heavy_Duty_Shield_Booster_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Integrity, 6d),
                    new Pair<>(ModificationEffect.Shield_Boost, 17d),
                    new Pair<>(ModificationEffect.Mass, 150d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1)),

    Heavy_Duty_Shield_Booster_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 15d),
                    new Pair<>(ModificationEffect.Integrity, 9d),
                    new Pair<>(ModificationEffect.Shield_Boost, 24d),
                    new Pair<>(ModificationEffect.Mass, 200d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.NIOBIUM, 1)),

    Heavy_Duty_Shield_Booster_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 20d),
                    new Pair<>(ModificationEffect.Integrity, 12d),
                    new Pair<>(ModificationEffect.Shield_Boost, 31d),
                    new Pair<>(ModificationEffect.Mass, 250d)
            ),
            new MaterialCostData(Material.SHIELDSOAKANALYSIS, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1),
            new MaterialCostData(Material.TIN, 1)),

    Heavy_Duty_Shield_Booster_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 25d),
                    new Pair<>(ModificationEffect.Integrity, 15d),
                    new Pair<>(ModificationEffect.Shield_Boost, 38d),
                    new Pair<>(ModificationEffect.Mass, 300d)
            ),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1),
            new MaterialCostData(Material.ANTIMONY, 1)),


    Heavy_Duty_Hull_Reinforcement_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 24d),
                    new Pair<>(ModificationEffect.All_Resistances, 3d),
                    new Pair<>(ModificationEffect.Mass, 8d)
            ),
            new MaterialCostData(Material.CARBON, 1)),

    Heavy_Duty_Hull_Reinforcement_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 36d),
                    new Pair<>(ModificationEffect.All_Resistances, 6d),
                    new Pair<>(ModificationEffect.Mass, 16d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1)),

    Heavy_Duty_Hull_Reinforcement_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 48d),
                    new Pair<>(ModificationEffect.All_Resistances, 9d),
                    new Pair<>(ModificationEffect.Mass, 24d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Heavy_Duty_Hull_Reinforcement_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 60d),
                    new Pair<>(ModificationEffect.All_Resistances, 12d),
                    new Pair<>(ModificationEffect.Mass, 32d)
            ),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.SHIELDINGSENSORS, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Heavy_Duty_Hull_Reinforcement_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 72d),
                    new Pair<>(ModificationEffect.All_Resistances, 15d),
                    new Pair<>(ModificationEffect.Mass, 40d)
            ),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.COMPOUNDSHIELDING, 1),
            new MaterialCostData(Material.FEDCORECOMPOSITES, 1)),


    Heavy_Duty_Armor_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 1d),
                    new Pair<>(ModificationEffect.Hull_Boost, 12d),
                    new Pair<>(ModificationEffect.Mass, 10d)
            ),
                new MaterialCostData(Material.CARBON, 1)),

    Heavy_Duty_Armor_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 2d),
                    new Pair<>(ModificationEffect.Hull_Boost, 17d),
                    new Pair<>(ModificationEffect.Mass, 15d)
            ),
                new MaterialCostData(Material.CARBON, 1),
                new MaterialCostData(Material.SHIELDEMITTERS, 1)),

    Heavy_Duty_Armor_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 3d),
                    new Pair<>(ModificationEffect.Hull_Boost, 22d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
                new MaterialCostData(Material.CARBON, 1),
                new MaterialCostData(Material.SHIELDEMITTERS, 1),
                new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Heavy_Duty_Armor_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 4d),
                    new Pair<>(ModificationEffect.Hull_Boost, 27d),
                    new Pair<>(ModificationEffect.Mass, 25d)
            ),
                new MaterialCostData(Material.VANADIUM, 1),
                new MaterialCostData(Material.SHIELDINGSENSORS, 1),
                new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Heavy_Duty_Armor_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.All_Resistances, 5d),
                    new Pair<>(ModificationEffect.Hull_Boost, 32d),
                    new Pair<>(ModificationEffect.Mass, 30d)
            ),
                new MaterialCostData(Material.TUNGSTEN, 1),
                new MaterialCostData(Material.COMPOUNDSHIELDING, 1),
                new MaterialCostData(Material.FEDCORECOMPOSITES, 1)),


    /*
    Kinetic Resistant
     */

    Kinetic_Resistant_Hull_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -2d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -2d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 12d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 3d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Kinetic_Resistant_Hull_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -4d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -4d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 19d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 6d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.VANADIUM, 1)),

    Kinetic_Resistant_Hull_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -6d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -6d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 26d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 9d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Kinetic_Resistant_Hull_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -8d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -8d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 33d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 12d)
            ),
            new MaterialCostData(Material.GALVANISINGALLOYS, 1),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Kinetic_Resistant_Hull_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -10d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -10d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 40d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 15d)
            ),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1),
            new MaterialCostData(Material.FEDCORECOMPOSITES, 1)),


    Kinetic_Resistant_Armor_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -4d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -4d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 12d)
            ),
            new MaterialCostData(Material.NICKEL, 1)),

    Kinetic_Resistant_Armor_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -6d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -6d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 19d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.VANADIUM, 1)),

    Kinetic_Resistant_Armor_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -8d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -8d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 26d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Kinetic_Resistant_Armor_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -10d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -10d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 33d)
            ),
            new MaterialCostData(Material.GALVANISINGALLOYS, 1),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Kinetic_Resistant_Armor_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -12d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -12d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 40d)
            ),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1),
            new MaterialCostData(Material.FEDCORECOMPOSITES, 1)),


    Kinetic_Resistant_Booster_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 8d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -1d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -1d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Kinetic_Resistant_Booster_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 12d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -1d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -1d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 1),
            new MaterialCostData(Material.GERMANIUM, 1)),

    Kinetic_Resistant_Booster_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 17d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -2d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -2d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1)),

    Kinetic_Resistant_Booster_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 22d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -3d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -3d)
            ),
            new MaterialCostData(Material.GALVANISINGALLOYS, 1),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Kinetic_Resistant_Booster_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 27d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -4d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -4d)
            ),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.SHIELDPATTERNANALYSIS, 1),
            new MaterialCostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),


    Kinetic_Resistant_Shield_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 10d),
                    new Pair<>(ModificationEffect.Integrity, 20d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -3d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1)),

    Kinetic_Resistant_Shield_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 20d),
                    new Pair<>(ModificationEffect.Integrity, 25d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -6d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1)),

    Kinetic_Resistant_Shield_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 30d),
                    new Pair<>(ModificationEffect.Integrity, 30d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -9d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.SELENIUM, 1)),

    Kinetic_Resistant_Shield_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 40d),
                    new Pair<>(ModificationEffect.Integrity, 35d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -12d)
            ),
            new MaterialCostData(Material.SHIELDSOAKANALYSIS, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1),
            new MaterialCostData(Material.MERCURY, 1)),

    Kinetic_Resistant_Shield_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 50d),
                    new Pair<>(ModificationEffect.Integrity, 40d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -15d)
            ),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new MaterialCostData(Material.RUTHENIUM, 1)),


    /*
    Resistance Augmented
     */

    Resistance_Augmented_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 5d),
                    new Pair<>(ModificationEffect.Integrity, -4d),
                    new Pair<>(ModificationEffect.All_Resistances, 5d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1)),

    Resistance_Augmented_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Integrity, -6d),
                    new Pair<>(ModificationEffect.All_Resistances, 8d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Resistance_Augmented_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 15d),
                    new Pair<>(ModificationEffect.Integrity, -8d),
                    new Pair<>(ModificationEffect.All_Resistances, 11d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1)),

    Resistance_Augmented_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 20d),
                    new Pair<>(ModificationEffect.Integrity, -10d),
                    new Pair<>(ModificationEffect.All_Resistances, 15d)
            ),
            new MaterialCostData(Material.MANGANESE, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Resistance_Augmented_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 25d),
                    new Pair<>(ModificationEffect.Integrity, -12d),
                    new Pair<>(ModificationEffect.All_Resistances, 17d)
            ),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new MaterialCostData(Material.IMPERIALSHIELDING, 1)),


    /*
    Thermal Resistant
     */

    Thermal_Resistant_Hull_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -2d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 12d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -2d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 3d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 1)),

    Thermal_Resistant_Hull_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -4d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 19d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -4d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 6d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1)),

    Thermal_Resistant_Hull_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -6d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 26d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -6d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 9d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.HEATEXCHANGERS, 1)),

    Thermal_Resistant_Hull_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -8d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 33d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -8d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 12d)
            ),
            new MaterialCostData(Material.GALVANISINGALLOYS, 1),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.HEATVANES, 1)),

    Thermal_Resistant_Hull_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -10d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 40d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -10d),
                    new Pair<>(ModificationEffect.Hull_Reinforcement, 15d)
            ),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1),
            new MaterialCostData(Material.PROTOHEATRADIATORS, 1)),


    Thermal_Resistant_Armor_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -4d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 12d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -4d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 1)),

    Thermal_Resistant_Armor_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -6d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 19d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -6d)
            ),
            new MaterialCostData(Material.NICKEL, 1),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1)),

    Thermal_Resistant_Armor_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -8d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 19d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -4d)
            ),
            new MaterialCostData(Material.SALVAGEDALLOYS, 1),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.HEATEXCHANGERS, 1)),

    Thermal_Resistant_Armor_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -10d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 33d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -10d)
            ),
            new MaterialCostData(Material.GALVANISINGALLOYS, 1),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.HEATVANES, 1)),

    Thermal_Resistant_Armor_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Explosive_Resitance, -12d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 40d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -12d)
            ),
            new MaterialCostData(Material.PHASEALLOYS, 1),
            new MaterialCostData(Material.MOLYBDENUM, 1),
            new MaterialCostData(Material.PROTOHEATRADIATORS, 1)),


    Thermal_Resistant_Booster_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -1d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 8d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -1d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Thermal_Resistant_Booster_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -1d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 12d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -1d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 1),
            new MaterialCostData(Material.GERMANIUM, 1)),

    Thermal_Resistant_Booster_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -2d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 17d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -2d)
            ),
            new MaterialCostData(Material.HEATCONDUCTIONWIRING, 1),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1)),

    Thermal_Resistant_Booster_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -3d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 22d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -3d)
            ),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Thermal_Resistant_Booster_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -4d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 27d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -4d)
            ),
            new MaterialCostData(Material.HEATEXCHANGERS, 1),
            new MaterialCostData(Material.SHIELDPATTERNANALYSIS, 1),
            new MaterialCostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),


    Thermal_Resistant_Shield_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -4d),
                    new Pair<>(ModificationEffect.Integrity, 20d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 10d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1)),

    Thermal_Resistant_Shield_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -8d),
                    new Pair<>(ModificationEffect.Integrity, 25d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 20d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1),
            new MaterialCostData(Material.GERMANIUM, 1)),

    Thermal_Resistant_Shield_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -12d),
                    new Pair<>(ModificationEffect.Integrity, 30d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 30d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.SELENIUM, 1)),

    Thermal_Resistant_Shield_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -16d),
                    new Pair<>(ModificationEffect.Integrity, 35d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 40d)
            ),
            new MaterialCostData(Material.SHIELDSOAKANALYSIS, 1),
            new MaterialCostData(Material.FOCUSCRYSTALS, 1),
            new MaterialCostData(Material.MERCURY, 1)),

    Thermal_Resistant_Shield_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -20d),
                    new Pair<>(ModificationEffect.Integrity, 40d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, 50d)
            ),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 1),
            new MaterialCostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new MaterialCostData(Material.RUTHENIUM, 1)),


    /*
    Expanded Capture Arc
     */

    Expanded_Capture_Arc_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Facing_Limit, 40d),
                    new Pair<>(ModificationEffect.Range, -10d)
            ),
            new MaterialCostData(Material.MECHANICALSCRAP, 1)),

    Expanded_Capture_Arc_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 20d),
                    new Pair<>(ModificationEffect.Facing_Limit, 60d),
                    new Pair<>(ModificationEffect.Range, -15d)
            ),
            new MaterialCostData(Material.ENCRYPTEDFILES, 1),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1)),

    Expanded_Capture_Arc_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 30d),
                    new Pair<>(ModificationEffect.Facing_Limit, 80d),
                    new Pair<>(ModificationEffect.Range, -20d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 1),
            new MaterialCostData(Material.ENCRYPTIONCODES, 1),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1)),

    Expanded_Capture_Arc_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 40d),
                    new Pair<>(ModificationEffect.Facing_Limit, 100d),
                    new Pair<>(ModificationEffect.Range, -25d)
            ),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1),
            new MaterialCostData(Material.WAKESOLUTIONS, 1),
            new MaterialCostData(Material.ENCODEDSCANDATA, 1)),

    Expanded_Capture_Arc_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 50d),
                    new Pair<>(ModificationEffect.Facing_Limit, 120d),
                    new Pair<>(ModificationEffect.Range, -30d)
            ),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1),
            new MaterialCostData(Material.HYPERSPACETRAJECTORIES, 1),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1)),


    /*
    Rapid Charge
     */

    Rapid_Charge_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Duration, -6d),
                    new Pair<>(ModificationEffect.Spin_Up_Time, -10d),
                    new Pair<>(ModificationEffect.Boot_Time, 10d),
                    new Pair<>(ModificationEffect.Range, 5d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    Rapid_Charge_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Duration, -12d),
                    new Pair<>(ModificationEffect.Spin_Up_Time, -20d),
                    new Pair<>(ModificationEffect.Boot_Time, 15d),
                    new Pair<>(ModificationEffect.Range, 10d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 1),
            new MaterialCostData(Material.CHROMIUM, 1)),

    Rapid_Charge_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Duration, -18d),
                    new Pair<>(ModificationEffect.Spin_Up_Time, -30d),
                    new Pair<>(ModificationEffect.Boot_Time, 20d),
                    new Pair<>(ModificationEffect.Range, 15d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.PRECIPITATEDALLOYS, 1)),

    Rapid_Charge_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Duration, -24d),
                    new Pair<>(ModificationEffect.Spin_Up_Time, -40d),
                    new Pair<>(ModificationEffect.Boot_Time, 25d),
                    new Pair<>(ModificationEffect.Range, 20d)
            ),
            new MaterialCostData(Material.CHROMIUM, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1),
            new MaterialCostData(Material.THERMICALLOYS, 1)),


    /*
    Specialised
     */

    Specialised_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Integrity, -5d),
                    new Pair<>(ModificationEffect.Boot_Time, -8d),
                    new Pair<>(ModificationEffect.Thermal_Load, -6d),
                    new Pair<>(ModificationEffect.Shield_Reinforcement, 4d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1)),

    Specialised_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 15d),
                    new Pair<>(ModificationEffect.Integrity, -10d),
                    new Pair<>(ModificationEffect.Boot_Time, -16d),
                    new Pair<>(ModificationEffect.Thermal_Load, -12d),
                    new Pair<>(ModificationEffect.Shield_Reinforcement, 6d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Specialised_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 20d),
                    new Pair<>(ModificationEffect.Integrity, -15d),
                    new Pair<>(ModificationEffect.Boot_Time, -24d),
                    new Pair<>(ModificationEffect.Thermal_Load, -18d),
                    new Pair<>(ModificationEffect.Shield_Reinforcement, 8d)
            ),
            new MaterialCostData(Material.SCRAMBLEDEMISSIONDATA, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1)),

    Specialised_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 25d),
                    new Pair<>(ModificationEffect.Integrity, -20d),
                    new Pair<>(ModificationEffect.Boot_Time, -32d),
                    new Pair<>(ModificationEffect.Thermal_Load, -24d),
                    new Pair<>(ModificationEffect.Shield_Reinforcement, 10d)
            ),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1),
            new MaterialCostData(Material.YTTRIUM, 1)),


    /*
    Enhanced Low Power
     */

    Enhanced_Low_Power_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -20d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 3d),
                    new Pair<>(ModificationEffect.Integrity, -5d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -2d),
                    new Pair<>(ModificationEffect.Mass, -18d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1)),

    Enhanced_Low_Power_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -25d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 6d),
                    new Pair<>(ModificationEffect.Integrity, -10d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -3d),
                    new Pair<>(ModificationEffect.Mass, -26d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.PRECIPITATEDALLOYS, 1)),

    Enhanced_Low_Power_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -30d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 9d),
                    new Pair<>(ModificationEffect.Integrity, -15d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -4d),
                    new Pair<>(ModificationEffect.Mass, -34d)
            ),
            new MaterialCostData(Material.SHIELDCYCLERECORDINGS, 1),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.PRECIPITATEDALLOYS, 1)),

    Enhanced_Low_Power_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -35d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 12d),
                    new Pair<>(ModificationEffect.Integrity, -20d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -5d),
                    new Pair<>(ModificationEffect.Mass, -42d)
            ),
            new MaterialCostData(Material.SHIELDSOAKANALYSIS, 1),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.THERMICALLOYS, 1)),

    Enhanced_Low_Power_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, -40d),
                    new Pair<>(ModificationEffect.Optimal_Strength, 15d),
                    new Pair<>(ModificationEffect.Integrity, -25d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -6d),
                    new Pair<>(ModificationEffect.Mass, -50d)
            ),
            new MaterialCostData(Material.SHIELDDENSITYREPORTS, 1),
            new MaterialCostData(Material.TIN, 1),
            new MaterialCostData(Material.MILITARYGRADEALLOYS, 1)),

    /*
    Faster Boot Sequence
     */

    Faster_Boot_Sequence_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 3d),
                    new Pair<>(ModificationEffect.Integrity, -3d),
                    new Pair<>(ModificationEffect.Boot_Time, -20d),
                    new Pair<>(ModificationEffect.Thermal_Load, 4d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 1)),

    Faster_Boot_Sequence_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 6d),
                    new Pair<>(ModificationEffect.Integrity, -6d),
                    new Pair<>(ModificationEffect.Boot_Time, -35d),
                    new Pair<>(ModificationEffect.Thermal_Load, 8d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 1),
            new MaterialCostData(Material.CHROMIUM, 1)),

    Faster_Boot_Sequence_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 9d),
                    new Pair<>(ModificationEffect.Integrity, -9d),
                    new Pair<>(ModificationEffect.Boot_Time, -50d),
                    new Pair<>(ModificationEffect.Thermal_Load, 12d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 1),
            new MaterialCostData(Material.HEATDISPERSIONPLATE, 1),
            new MaterialCostData(Material.SELENIUM, 1)),

    Faster_Boot_Sequence_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 12d),
                    new Pair<>(ModificationEffect.Integrity, -12d),
                    new Pair<>(ModificationEffect.Boot_Time, -65d),
                    new Pair<>(ModificationEffect.Thermal_Load, 16d)
            ),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.HEATEXCHANGERS, 1),
            new MaterialCostData(Material.CADMIUM, 1)),

    Faster_Boot_Sequence_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 15d),
                    new Pair<>(ModificationEffect.Integrity, -15d),
                    new Pair<>(ModificationEffect.Boot_Time, -80d),
                    new Pair<>(ModificationEffect.Thermal_Load, 20d)
            ),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1),
            new MaterialCostData(Material.HEATVANES, 1),
            new MaterialCostData(Material.TELLURIUM, 1)),


    /*
    Increased Range
     */

    Increased_Range_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 3d),
                    new Pair<>(ModificationEffect.Optimal_Mass, 15d),
                    new Pair<>(ModificationEffect.Integrity, -3d),
                    new Pair<>(ModificationEffect.Mass, 10d)
            ),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 1)),

    Increased_Range_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 6d),
                    new Pair<>(ModificationEffect.Optimal_Mass, 25d),
                    new Pair<>(ModificationEffect.Integrity, -6d),
                    new Pair<>(ModificationEffect.Mass, 15d)
            ),
            new MaterialCostData(Material.DISRUPTEDWAKEECHOES, 1),
            new MaterialCostData(Material.CHEMICALPROCESSORS, 1)),

    Increased_Range_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 9d),
                    new Pair<>(ModificationEffect.Optimal_Mass, 35d),
                    new Pair<>(ModificationEffect.Integrity, -9d),
                    new Pair<>(ModificationEffect.Mass, 20d)
            ),
            new MaterialCostData(Material.PHOSPHORUS, 1),
            new MaterialCostData(Material.CHEMICALPROCESSORS, 1),
            new MaterialCostData(Material.WAKESOLUTIONS, 1)),

    Increased_Range_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 12d),
                    new Pair<>(ModificationEffect.Optimal_Mass, 45d),
                    new Pair<>(ModificationEffect.Integrity, -12d),
                    new Pair<>(ModificationEffect.Mass, 25d)
            ),
            new MaterialCostData(Material.MANGANESE, 1),
            new MaterialCostData(Material.CHEMICALDISTILLERY, 1),
            new MaterialCostData(Material.HYPERSPACETRAJECTORIES, 1)),

    Increased_Range_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 15d),
                    new Pair<>(ModificationEffect.Optimal_Mass, 55d),
                    new Pair<>(ModificationEffect.Integrity, -15d),
                    new Pair<>(ModificationEffect.Mass, 30d)
            ),
            new MaterialCostData(Material.ARSENIC, 1),
            new MaterialCostData(Material.CHEMICALMANIPULATORS, 1),
            new MaterialCostData(Material.DATAMINEDWAKE, 1)),


    /*
    Charge Enhanced
     */

    Charge_Enhanced_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Capacity, -1d),
                    new Pair<>(ModificationEffect.Power_Recharge, 9d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1)),

    Charge_Enhanced_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Capacity, -2d),
                    new Pair<>(ModificationEffect.Power_Recharge, 18d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.CHEMICALPROCESSORS, 1)),

    Charge_Enhanced_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Capacity, -3d),
                    new Pair<>(ModificationEffect.Power_Recharge, 27d)
            ),
            new MaterialCostData(Material.GRIDRESISTORS, 1),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.CHEMICALDISTILLERY, 1)),

    Charge_Enhanced_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Capacity, -4d),
                    new Pair<>(ModificationEffect.Power_Recharge, 36d)
            ),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1),
            new MaterialCostData(Material.CHEMICALMANIPULATORS, 1)),

    Charge_Enhanced_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Capacity, -5d),
                    new Pair<>(ModificationEffect.Power_Recharge, 45d)
            ),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1),
            new MaterialCostData(Material.CHEMICALMANIPULATORS, 1),
            new MaterialCostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),


    /*
    Engine Focused
     */

    Engine_Focused_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -3d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -3d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -3d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 20d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -1d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 16d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    Engine_Focused_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -6d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -6d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -6d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 30d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -2d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 23d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Engine_Focused_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -9d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -9d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -9d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 40d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -3d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 30d)
            ),
            new MaterialCostData(Material.BULKSCANDATA, 1),
            new MaterialCostData(Material.CHROMIUM, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1)),

    Engine_Focused_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -12d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -12d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -12d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 50d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -4d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 37d)
            ),
            new MaterialCostData(Material.SCANARCHIVES, 1),
            new MaterialCostData(Material.SELENIUM, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1)),

    Engine_Focused_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -15d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -15d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -15d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 60d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -5d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 44d)
            ),
            new MaterialCostData(Material.SCANDATABANKS, 1),
            new MaterialCostData(Material.CADMIUM, 1),
            new MaterialCostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    High Charge Capacity
     */

    High_Charge_Capacity_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Recharge, -2d),
                    new Pair<>(ModificationEffect.Integrity, 10d),
                    new Pair<>(ModificationEffect.Power_Capacity, 10d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    High_Charge_Capacity_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Recharge, -6d),
                    new Pair<>(ModificationEffect.Integrity, 15d),
                    new Pair<>(ModificationEffect.Power_Capacity, 18d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.CHROMIUM, 1)),

    High_Charge_Capacity_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Recharge, -10d),
                    new Pair<>(ModificationEffect.Integrity, 20d),
                    new Pair<>(ModificationEffect.Power_Capacity, 26d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.CHROMIUM, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    High_Charge_Capacity_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Recharge, -15d),
                    new Pair<>(ModificationEffect.Integrity, 25d),
                    new Pair<>(ModificationEffect.Power_Capacity, 34d)
            ),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.SELENIUM, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    High_Charge_Capacity_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Recharge, -18d),
                    new Pair<>(ModificationEffect.Integrity, 30d),
                    new Pair<>(ModificationEffect.Power_Capacity, 42d)
            ),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new MaterialCostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    System Focused
     */

    System_Focused_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -3d),
                    new Pair<>(ModificationEffect.Systems_Recharge, 16d),
                    new Pair<>(ModificationEffect.Systems_Capacity, 20d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -3d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -3d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -1d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    System_Focused_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -6d),
                    new Pair<>(ModificationEffect.Systems_Recharge, 23d),
                    new Pair<>(ModificationEffect.Systems_Capacity, 30d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -6d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -6d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -2d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    System_Focused_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -9d),
                    new Pair<>(ModificationEffect.Systems_Recharge, 30d),
                    new Pair<>(ModificationEffect.Systems_Capacity, 40d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -9d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -9d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -3d)
            ),
            new MaterialCostData(Material.BULKSCANDATA, 1),
            new MaterialCostData(Material.CHROMIUM, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1)),

    System_Focused_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -12d),
                    new Pair<>(ModificationEffect.Systems_Recharge, 37d),
                    new Pair<>(ModificationEffect.Systems_Capacity, 50d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -12d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -12d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -4d)
            ),
            new MaterialCostData(Material.SCANARCHIVES, 1),
            new MaterialCostData(Material.SELENIUM, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1)),

    System_Focused_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, -15d),
                    new Pair<>(ModificationEffect.Systems_Recharge, 44d),
                    new Pair<>(ModificationEffect.Systems_Capacity, 60d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -15d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -15d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -5d)
            ),
            new MaterialCostData(Material.CLASSIFIEDSCANDATA, 1),
            new MaterialCostData(Material.CADMIUM, 1),
            new MaterialCostData(Material.MILITARYSUPERCAPACITORS, 1)),


    /*
    Weapon Focused
     */

    Weapon_Focused_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, 20d),
                    new Pair<>(ModificationEffect.Systems_Recharge, -1d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -3d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -3d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, 16d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -3d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    Weapon_Focused_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, 30d),
                    new Pair<>(ModificationEffect.Systems_Recharge, -2d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -6d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -6d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, 23d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -6d)
            ),
            new MaterialCostData(Material.SULPHUR, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Weapon_Focused_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, 40d),
                    new Pair<>(ModificationEffect.Systems_Recharge, -3d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -9d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -9d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, 30d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -9d)
            ),
            new MaterialCostData(Material.BULKSCANDATA, 1),
            new MaterialCostData(Material.HYBRIDCAPACITORS, 1),
            new MaterialCostData(Material.SELENIUM, 1)),

    Weapon_Focused_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, 50d),
                    new Pair<>(ModificationEffect.Systems_Recharge, -4d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -12d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -12d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, 37d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -12d)
            ),
            new MaterialCostData(Material.SCANARCHIVES, 1),
            new MaterialCostData(Material.ELECTROCHEMICALARRAYS, 1),
            new MaterialCostData(Material.CADMIUM, 1)),

    Weapon_Focused_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, 60d),
                    new Pair<>(ModificationEffect.Systems_Recharge, -5d),
                    new Pair<>(ModificationEffect.Systems_Capacity, -15d),
                    new Pair<>(ModificationEffect.Engines_Capacity, -15d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, 44d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -15d)
            ),
            new MaterialCostData(Material.SCANDATABANKS, 1),
            new MaterialCostData(Material.POLYMERCAPACITORS, 1),
            new MaterialCostData(Material.TELLURIUM, 1)),


    /*
    Armoured
     */

    Armoured_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Systems_Capacity, 4d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 40d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -4d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 4d)
            ),
            new MaterialCostData(Material.WORNSHIELDEMITTERS, 1)),

    Armoured_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Systems_Capacity, 6d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 60d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -6d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 8d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1)),

    Armoured_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Systems_Capacity, 8d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 80d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -8d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 12d)
            ),
            new MaterialCostData(Material.CARBON, 1),
            new MaterialCostData(Material.SHIELDEMITTERS, 1),
            new MaterialCostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Armoured_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Systems_Capacity, 10d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 100d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -10d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 16d)
            ),
            new MaterialCostData(Material.VANADIUM, 1),
            new MaterialCostData(Material.SHIELDINGSENSORS, 1),
            new MaterialCostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Armoured_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Systems_Capacity, 12d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 120d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -12d),
                    new Pair<>(ModificationEffect.Engines_Recharge, 20d)
            ),
            new MaterialCostData(Material.TUNGSTEN, 1),
            new MaterialCostData(Material.COMPOUNDSHIELDING, 1),
            new MaterialCostData(Material.FEDCORECOMPOSITES, 1)),


    /*
    Low Emissions
     */

    Low_Emissions_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, 4d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, -25d),
                    new Pair<>(ModificationEffect.Power_Generation, -3d)
            ),
            new MaterialCostData(Material.IRON, 1)),

    Low_Emissions_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, 8d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, -35d),
                    new Pair<>(ModificationEffect.Power_Generation, -6d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.ARCHIVEDEMISSIONDATA, 1)),

    Low_Emissions_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, 12d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, -45d),
                    new Pair<>(ModificationEffect.Power_Generation, -9d)
            ),
            new MaterialCostData(Material.IRON, 1),
            new MaterialCostData(Material.ARCHIVEDEMISSIONDATA, 1),
            new MaterialCostData(Material.HEATEXCHANGERS, 1)),

    Low_Emissions_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, 16d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, -56d),
                    new Pair<>(ModificationEffect.Power_Generation, -12d)
            ),
            new MaterialCostData(Material.GERMANIUM, 1),
            new MaterialCostData(Material.EMISSIONDATA, 1),
            new MaterialCostData(Material.HEATVANES, 1)),

    Low_Emissions_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Mass, 20d),
                    new Pair<>(ModificationEffect.Heat_Efficiency, -65d),
                    new Pair<>(ModificationEffect.Power_Generation, -15d)
            ),
            new MaterialCostData(Material.NIOBIUM, 1),
            new MaterialCostData(Material.DECODEDEMISSIONDATA, 1),
            new MaterialCostData(Material.PROTOHEATRADIATORS, 1)),


    /*
    Clean
     */

    Clean_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Thermal_Load, -20d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 8d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -2d)
            ),
            new MaterialCostData(Material.SULPHUR, 1)),

    Clean_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 4d),
                    new Pair<>(ModificationEffect.Integrity, -4d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -4d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 13d),
                    new Pair<>(ModificationEffect.Thermal_Load, -30d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1)),

    Clean_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 8d),
                    new Pair<>(ModificationEffect.Integrity, -8d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -6d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 18d),
                    new Pair<>(ModificationEffect.Thermal_Load, -40d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.CONDUCTIVECOMPONENTS, 1),
            new MaterialCostData(Material.EMISSIONDATA, 1)),

    Clean_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 12d),
                    new Pair<>(ModificationEffect.Integrity, -12d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -8d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 23d),
                    new Pair<>(ModificationEffect.Thermal_Load, -50d)
            ),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.DECODEDEMISSIONDATA, 1)),

    Clean_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 16d),
                    new Pair<>(ModificationEffect.Integrity, -16d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -10d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 28d),
                    new Pair<>(ModificationEffect.Thermal_Load, -60d)
            ),
            new MaterialCostData(Material.CONDUCTIVECERAMICS, 1),
            new MaterialCostData(Material.TIN, 1),
            new MaterialCostData(Material.COMPACTEMISSIONSDATA, 1)),


    /*
    Dirty
     */

    Dirty_1(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 4d),
                    new Pair<>(ModificationEffect.Integrity, -3d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -3d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 12d),
                    new Pair<>(ModificationEffect.Thermal_Load, 20d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1)),

    Dirty_2(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 6d),
                    new Pair<>(ModificationEffect.Integrity, -6d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -5d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 19d),
                    new Pair<>(ModificationEffect.Thermal_Load, 30d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.MECHANICALEQUIPMENT, 1)),

    Dirty_3(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 8d),
                    new Pair<>(ModificationEffect.Integrity, -9d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -8d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 26d),
                    new Pair<>(ModificationEffect.Thermal_Load, 40d)
            ),
            new MaterialCostData(Material.LEGACYFIRMWARE, 1),
            new MaterialCostData(Material.CHROMIUM, 1),
            new MaterialCostData(Material.MECHANICALCOMPONENTS, 1)),

    Dirty_4(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 10d),
                    new Pair<>(ModificationEffect.Integrity, -12d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -10d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 33d),
                    new Pair<>(ModificationEffect.Thermal_Load, 50d)
            ),
            new MaterialCostData(Material.CONSUMERFIRMWARE, 1),
            new MaterialCostData(Material.SELENIUM, 1),
            new MaterialCostData(Material.CONFIGURABLECOMPONENTS, 1)),

    Dirty_5(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 12d),
                    new Pair<>(ModificationEffect.Integrity, -15d),
                    new Pair<>(ModificationEffect.Optimal_Mass, -13d),
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 40d),
                    new Pair<>(ModificationEffect.Thermal_Load, 650d)
            ),
            new MaterialCostData(Material.INDUSTRIALFIRMWARE, 1),
            new MaterialCostData(Material.CADMIUM, 1),
            new MaterialCostData(Material.PHARMACEUTICALISOLATORS, 1));

    private final MaterialCostData[] cost;
    private final ModificationEffectData effects;

    ModificationRecipe(ModificationEffectData effects, MaterialCostData... cost)
    {
        this.effects = effects;
        this.cost = cost;
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
        return super.toString().replace("_"," ");
    }

    public String getGrade()
    {
        String g = Arrays.stream(name().split("_")).reduce((a, b) -> b).orElse("?");
        return "Grade " + g;
    }
}
