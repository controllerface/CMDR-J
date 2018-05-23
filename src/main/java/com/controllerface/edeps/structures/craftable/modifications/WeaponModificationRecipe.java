package com.controllerface.edeps.structures.craftable.modifications;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.data.ItemEffects;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.equipment.ItemGrade;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
@SuppressWarnings("unchecked")
public enum WeaponModificationRecipe implements ProcurementRecipe
{

    Weapon_DoubleShot_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BurstSize, 2d),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 600d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 4d),
                    new ItemEffectData(ItemEffect.Range, -2d)
            ),
            new CostData(Material.CARBON, 1)),

    Weapon_DoubleShot_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BurstSize, 2d),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 800d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 4d),
                    new ItemEffectData(ItemEffect.Range, -4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Weapon_DoubleShot_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BurstSize, 2d),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 1000d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 4d),
                    new ItemEffectData(ItemEffect.Range, -6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Weapon_DoubleShot_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BurstSize, 2d),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 1200d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 4d),
                    new ItemEffectData(ItemEffect.Range, -8d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.SECURITYFIRMWARE, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_DoubleShot_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BurstSize, 2d),
                    new ItemEffectData(ItemEffect.BurstRateOfFire, 1400d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 6d),
                    new ItemEffectData(ItemEffect.Range, -10d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),

    Weapon_Efficient_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DamagePerSecond, 8d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -38d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Weapon_Efficient_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DamagePerSecond, 12d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -15d),
                    new ItemEffectData(ItemEffect.PowerDraw, -12d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -43d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_Efficient_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DamagePerSecond, 16d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -24d),
                    new ItemEffectData(ItemEffect.PowerDraw, -24d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -48d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    Weapon_Efficient_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DamagePerSecond, 20d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -35d),
                    new ItemEffectData(ItemEffect.PowerDraw, -36d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -52d)
            ),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1),
            new CostData(Material.SELENIUM, 1)),

    Weapon_Efficient_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DamagePerSecond, 24d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -45d),
                    new ItemEffectData(ItemEffect.PowerDraw, -45d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -60d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Weapon_Focused_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ArmourPenetration, 40d),
                    new ItemEffectData(ItemEffect.Range, 36d),
                    new ItemEffectData(ItemEffect.RateOfFire, 36d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1d)
            ),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ArmourPenetration, 60d),
                    new ItemEffectData(ItemEffect.Range, 52d),
                    new ItemEffectData(ItemEffect.RateOfFire, 52d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 2d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ArmourPenetration, 80d),
                    new ItemEffectData(ItemEffect.Range, 68d),
                    new ItemEffectData(ItemEffect.RateOfFire, 68d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 3d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ArmourPenetration, 100d),
                    new ItemEffectData(ItemEffect.Range, 84d),
                    new ItemEffectData(ItemEffect.RateOfFire, 84d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 4d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Weapon_Focused_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ArmourPenetration, 120d),
                    new ItemEffectData(ItemEffect.Range, 100d),
                    new ItemEffectData(ItemEffect.RateOfFire, 100d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 5d)
            ),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Weapon_HighCapacity_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 36d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 36d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4d),
                    new ItemEffectData(ItemEffect.RateOfFire, 2d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_HighCapacity_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 52d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 52d),
                    new ItemEffectData(ItemEffect.Mass, 30d),
                    new ItemEffectData(ItemEffect.PowerDraw, 8d),
                    new ItemEffectData(ItemEffect.RateOfFire, 4d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_HighCapacity_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 68d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 68d),
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.PowerDraw, 12d),
                    new ItemEffectData(ItemEffect.RateOfFire, 6d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_HighCapacity_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 84d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 84d),
                    new ItemEffectData(ItemEffect.Mass, 50d),
                    new ItemEffectData(ItemEffect.PowerDraw, 16d),
                    new ItemEffectData(ItemEffect.RateOfFire, 8d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.TIN, 1)),

    Weapon_HighCapacity_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 100d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 100d),
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.RateOfFire, 10d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Weapon_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -30d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Weapon_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DistributorDraw, -20d),
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -45d),
                    new ItemEffectData(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Weapon_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DistributorDraw, -25d),
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -60d),
                    new ItemEffectData(ItemEffect.PowerDraw, -20d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Weapon_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DistributorDraw, -30d),
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -75d),
                    new ItemEffectData(ItemEffect.PowerDraw, -30d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Weapon_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DistributorDraw, -35d),
                    new ItemEffectData(ItemEffect.Integrity, -60d),
                    new ItemEffectData(ItemEffect.Mass, -90d),
                    new ItemEffectData(ItemEffect.PowerDraw, -40d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    Weapon_LongRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FalloffRange, 20d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3d),
                    new ItemEffectData(ItemEffect.Range, 20d),
                    new ItemEffectData(ItemEffect.ShotSpeed, 20d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FalloffRange, 40d),
                    new ItemEffectData(ItemEffect.Mass, 15d),
                    new ItemEffectData(ItemEffect.PowerDraw, 6d),
                    new ItemEffectData(ItemEffect.Range, 40d),
                    new ItemEffectData(ItemEffect.ShotSpeed, 40d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FalloffRange, 60d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.PowerDraw, 9d),
                    new ItemEffectData(ItemEffect.Range, 60d),
                    new ItemEffectData(ItemEffect.ShotSpeed, 60d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FalloffRange, 80d),
                    new ItemEffectData(ItemEffect.Mass, 25d),
                    new ItemEffectData(ItemEffect.PowerDraw, 12d),
                    new ItemEffectData(ItemEffect.Range, 80d),
                    new ItemEffectData(ItemEffect.ShotSpeed, 80d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Weapon_LongRange_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FalloffRange, 100d),
                    new ItemEffectData(ItemEffect.Mass, 30d),
                    new ItemEffectData(ItemEffect.PowerDraw, 15d),
                    new ItemEffectData(ItemEffect.Range, 100d),
                    new ItemEffectData(ItemEffect.ShotSpeed, 100d)
            ),
            new CostData(Material.BIOTECHCONDUCTORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    Weapon_Overcharged_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoClipSize, -3d),
                    new ItemEffectData(ItemEffect.Damage, 30d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 15d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 3d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoClipSize, -6d),
                    new ItemEffectData(ItemEffect.Damage, 40d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 20d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 6d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoClipSize, -9d),
                    new ItemEffectData(ItemEffect.Damage, 50d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 25d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 9d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoClipSize, -12d),
                    new ItemEffectData(ItemEffect.Damage, 60d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 30d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.ZINC, 1)),

    Weapon_Overcharged_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoClipSize, -15d),
                    new ItemEffectData(ItemEffect.Damage, 70d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 35d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 15d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    Weapon_RapidFire_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, -1d),
                    new ItemEffectData(ItemEffect.Jitter, 50d),
                    new ItemEffectData(ItemEffect.ReloadTime, -25d),
                    new ItemEffectData(ItemEffect.RateOfFire, 8d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_RapidFire_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, -2d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -5d),
                    new ItemEffectData(ItemEffect.Jitter, 50d),
                    new ItemEffectData(ItemEffect.ReloadTime, -35d),
                    new ItemEffectData(ItemEffect.RateOfFire, 17d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_RapidFire_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, -3d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -15d),
                    new ItemEffectData(ItemEffect.Jitter, 50d),
                    new ItemEffectData(ItemEffect.ReloadTime, -45d),
                    new ItemEffectData(ItemEffect.RateOfFire, 26d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Weapon_RapidFire_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, -4d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -25d),
                    new ItemEffectData(ItemEffect.Jitter, 50d),
                    new ItemEffectData(ItemEffect.ReloadTime, -55d),
                    new ItemEffectData(ItemEffect.RateOfFire, 35d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    Weapon_RapidFire_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, -5d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -05d),
                    new ItemEffectData(ItemEffect.Jitter, 50d),
                    new ItemEffectData(ItemEffect.ReloadTime, -65d),
                    new ItemEffectData(ItemEffect.RateOfFire, 44d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.TECHNETIUM, 1)),

    Weapon_ShortRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, 27d),
                    new ItemEffectData(ItemEffect.Range, -10d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, 39d),
                    new ItemEffectData(ItemEffect.Range, -20d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 10d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, 51d),
                    new ItemEffectData(ItemEffect.Range, -30d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 20d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, 63d),
                    new ItemEffectData(ItemEffect.Range, -40d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 30d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Weapon_ShortRange_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage, 75d),
                    new ItemEffectData(ItemEffect.Range, -50d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 40d)
            ),
            new CostData(Material.BIOTECHCONDUCTORS, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1)),

    Weapon_Sturdy_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 100d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 20d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -10d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_Sturdy_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 150d),
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 30d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -15d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Weapon_Sturdy_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 200d),
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 40d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -20d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Weapon_Sturdy_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 250d),
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 50d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -25d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    Weapon_Sturdy_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.ArmourPenetration, 60d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -30d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),
    ;

    private String parentBlueprintName;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;

    WeaponModificationRecipe(ItemGrade grade, ItemEffects effects, CostData... cost)
    {
        this.grade = grade;
        this.effects = effects;
        this.cost = cost;
        Arrays.stream(cost).forEach(c->c.getCost().associate(this));
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

    public ItemEffects effects()
    {
        return effects;
    }

    @Override
    public void setParentBlueprintName(String parentBlueprintName)
    {
        this.parentBlueprintName = parentBlueprintName;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }

    @Override
    public String getShortLabel()
    {
        return grade.toString();
    }

    @Override
    public String getDisplayLabel()
    {
        return getShortLabel() + " :: " +  parentBlueprintName;
    }

    @Override
    public String getName()
    {
        return name();
    }
}
