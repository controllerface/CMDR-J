package com.controllerface.edeps.structures.craftable.modifications;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.equipment.ItemGrade;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
@SuppressWarnings("unchecked")
public enum WeaponModificationRecipe implements ProcurementRecipe
{

    Weapon_DoubleShot_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 6d),
                    new Pair<>(ItemEffect.AmmoClipSize, 0.34d),
                    new Pair<>(ItemEffect.Range, -0.02d)
            ),
            new CostData(Material.CARBON, 1)),

    Weapon_DoubleShot_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 8d),
                    new Pair<>(ItemEffect.AmmoClipSize, 0.34d),
                    new Pair<>(ItemEffect.Range, -0.04d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Weapon_DoubleShot_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 10d),
                    new Pair<>(ItemEffect.AmmoClipSize, 0.34d),
                    new Pair<>(ItemEffect.Range, -0.06d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Weapon_DoubleShot_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 12d),
                    new Pair<>(ItemEffect.AmmoClipSize, 0.34d),
                    new Pair<>(ItemEffect.Range, -0.08d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.SECURITYFIRMWARE, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_DoubleShot_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 14d),
                    new Pair<>(ItemEffect.AmmoClipSize, 1d),
                    new Pair<>(ItemEffect.Range, -0.1d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),

    Weapon_Efficient_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.08d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.38d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Weapon_Efficient_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.12d),
                    new Pair<>(ItemEffect.DistributorDraw, -0.15d),
                    new Pair<>(ItemEffect.PowerDraw, -0.12d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.43d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_Efficient_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.16d),
                    new Pair<>(ItemEffect.DistributorDraw, -0.24d),
                    new Pair<>(ItemEffect.PowerDraw, -0.24d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.48d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    Weapon_Efficient_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.2d),
                    new Pair<>(ItemEffect.DistributorDraw, -0.35d),
                    new Pair<>(ItemEffect.PowerDraw, -0.36d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.52d)
            ),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1),
            new CostData(Material.SELENIUM, 1)),

    Weapon_Efficient_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.24d),
                    new Pair<>(ItemEffect.DistributorDraw, -0.45d),
                    new Pair<>(ItemEffect.PowerDraw, -0.45d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.6d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Weapon_Focused_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 0.4d),
                    new Pair<>(ItemEffect.Range, 0.36d),
                    new Pair<>(ItemEffect.RateOfFire, 0.36d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.01d)
            ),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 0.6d),
                    new Pair<>(ItemEffect.Range, 0.52d),
                    new Pair<>(ItemEffect.RateOfFire, 0.52d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.02d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 0.8d),
                    new Pair<>(ItemEffect.Range, 0.68d),
                    new Pair<>(ItemEffect.RateOfFire, 0.68d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.03d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 1d),
                    new Pair<>(ItemEffect.Range, 0.84d),
                    new Pair<>(ItemEffect.RateOfFire, 0.84d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.04d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Weapon_Focused_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 1.2d),
                    new Pair<>(ItemEffect.Range, 1d),
                    new Pair<>(ItemEffect.RateOfFire, 1d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.05d)
            ),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Weapon_HighCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 0.36d),
                    new Pair<>(ItemEffect.AmmoClipSize, 0.36d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.04d),
                    new Pair<>(ItemEffect.RateOfFire, 0.02d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_HighCapacity_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 0.52d),
                    new Pair<>(ItemEffect.AmmoClipSize, 0.52d),
                    new Pair<>(ItemEffect.Mass, 0.3d),
                    new Pair<>(ItemEffect.PowerDraw, 0.08d),
                    new Pair<>(ItemEffect.RateOfFire, 0.04d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_HighCapacity_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 0.68d),
                    new Pair<>(ItemEffect.AmmoClipSize, 0.68d),
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.12d),
                    new Pair<>(ItemEffect.RateOfFire, 0.06d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_HighCapacity_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 0.84d),
                    new Pair<>(ItemEffect.AmmoClipSize, 0.84d),
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.PowerDraw, 0.16d),
                    new Pair<>(ItemEffect.RateOfFire, 0.08d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.TIN, 1)),

    Weapon_HighCapacity_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 1d),
                    new Pair<>(ItemEffect.AmmoClipSize, 1d),
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.RateOfFire, 0.1d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Weapon_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.3d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Weapon_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, -0.2d),
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.45d),
                    new Pair<>(ItemEffect.PowerDraw, -0.1d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Weapon_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, -0.25d),
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.6d),
                    new Pair<>(ItemEffect.PowerDraw, -0.2d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Weapon_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, -0.3d),
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.75d),
                    new Pair<>(ItemEffect.PowerDraw, -0.3d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Weapon_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, -0.35d),
                    new Pair<>(ItemEffect.Integrity, -0.6d),
                    new Pair<>(ItemEffect.Mass, -0.9d),
                    new Pair<>(ItemEffect.PowerDraw, -0.4d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    Weapon_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 0.2d),
                    new Pair<>(ItemEffect.Mass, 0.1d),
                    new Pair<>(ItemEffect.PowerDraw, 0.03d),
                    new Pair<>(ItemEffect.Range, 0.2d),
                    new Pair<>(ItemEffect.ShotSpeed, 0.2d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 0.4d),
                    new Pair<>(ItemEffect.Mass, 0.15d),
                    new Pair<>(ItemEffect.PowerDraw, 0.06d),
                    new Pair<>(ItemEffect.Range, 0.4d),
                    new Pair<>(ItemEffect.ShotSpeed, 0.4d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.09d),
                    new Pair<>(ItemEffect.Range, 0.6d),
                    new Pair<>(ItemEffect.ShotSpeed, 0.6d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 0.8d),
                    new Pair<>(ItemEffect.Mass, 0.25d),
                    new Pair<>(ItemEffect.PowerDraw, 0.12d),
                    new Pair<>(ItemEffect.Range, 0.8d),
                    new Pair<>(ItemEffect.ShotSpeed, 0.8d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Weapon_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 1d),
                    new Pair<>(ItemEffect.Mass, 0.3d),
                    new Pair<>(ItemEffect.PowerDraw, 0.15d),
                    new Pair<>(ItemEffect.Range, 1d),
                    new Pair<>(ItemEffect.ShotSpeed, 1d)
            ),
            new CostData(Material.BIOTECHCONDUCTORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    Weapon_Overcharged_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -0.03d),
                    new Pair<>(ItemEffect.Damage, 0.3d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.15d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.03d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -0.06d),
                    new Pair<>(ItemEffect.Damage, 0.4d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.2d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.06d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -0.09d),
                    new Pair<>(ItemEffect.Damage, 0.5d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.25d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.09d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -0.12d),
                    new Pair<>(ItemEffect.Damage, 0.6d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.3d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.12d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.ZINC, 1)),

    Weapon_Overcharged_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -0.15d),
                    new Pair<>(ItemEffect.Damage, 0.7d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.35d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.15d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    Weapon_RapidFire_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -0.01d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.ReloadTime, -0.25d),
                    new Pair<>(ItemEffect.RateOfFire, 0.08d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_RapidFire_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -0.02d),
                    new Pair<>(ItemEffect.DistributorDraw, -0.05d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.ReloadTime, -0.35d),
                    new Pair<>(ItemEffect.RateOfFire, 0.17d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_RapidFire_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -0.03d),
                    new Pair<>(ItemEffect.DistributorDraw, -0.15d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.ReloadTime, -0.45d),
                    new Pair<>(ItemEffect.RateOfFire, 0.26d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Weapon_RapidFire_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -0.04d),
                    new Pair<>(ItemEffect.DistributorDraw, -0.25d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.ReloadTime, -0.55d),
                    new Pair<>(ItemEffect.RateOfFire, 0.35d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    Weapon_RapidFire_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -0.05d),
                    new Pair<>(ItemEffect.DistributorDraw, -0.35d),
                    new Pair<>(ItemEffect.Jitter, 0.5d),
                    new Pair<>(ItemEffect.ReloadTime, -0.65d),
                    new Pair<>(ItemEffect.RateOfFire, 0.44d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.TECHNETIUM, 1)),

    Weapon_ShortRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.27d),
                    new Pair<>(ItemEffect.Range, -0.1d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.39d),
                    new Pair<>(ItemEffect.Range, -0.2d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.1d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.51d),
                    new Pair<>(ItemEffect.Range, -0.3d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.2d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.63d),
                    new Pair<>(ItemEffect.Range, -0.4d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.3d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Weapon_ShortRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 0.75d),
                    new Pair<>(ItemEffect.Range, -0.5d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.4d)
            ),
            new CostData(Material.BIOTECHCONDUCTORS, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1)),

    Weapon_Sturdy_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.ArmourPenetration, 0.2d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.1d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_Sturdy_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.5d),
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.ArmourPenetration, 0.3d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.15d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Weapon_Sturdy_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2d),
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.ArmourPenetration, 0.4d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.2d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Weapon_Sturdy_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.5d),
                    new Pair<>(ItemEffect.Mass, 0.8d),
                    new Pair<>(ItemEffect.ArmourPenetration, 0.5d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.25d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    Weapon_Sturdy_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.ArmourPenetration, 0.6d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.3d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),
    ;

    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffectData effects;

    WeaponModificationRecipe(ItemGrade grade, ItemEffectData effects, CostData... cost)
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
