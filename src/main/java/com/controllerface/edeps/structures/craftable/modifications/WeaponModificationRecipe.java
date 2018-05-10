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
                    new Pair<>(ItemEffect.BurstRateOfFire, 600d),
                    new Pair<>(ItemEffect.AmmoClipSize, 4d),
                    new Pair<>(ItemEffect.Range, -2d)
            ),
            new CostData(Material.CARBON, 1)),

    Weapon_DoubleShot_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 800d),
                    new Pair<>(ItemEffect.AmmoClipSize, 4d),
                    new Pair<>(ItemEffect.Range, -4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Weapon_DoubleShot_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 1000d),
                    new Pair<>(ItemEffect.AmmoClipSize, 4d),
                    new Pair<>(ItemEffect.Range, -6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1)),

    Weapon_DoubleShot_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 1200d),
                    new Pair<>(ItemEffect.AmmoClipSize, 4d),
                    new Pair<>(ItemEffect.Range, -8d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.SECURITYFIRMWARE, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_DoubleShot_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BurstSize, 2d),
                    new Pair<>(ItemEffect.BurstRateOfFire, 1400d),
                    new Pair<>(ItemEffect.AmmoClipSize, 6d),
                    new Pair<>(ItemEffect.Range, -10d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),

    Weapon_Efficient_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 8d),
                    new Pair<>(ItemEffect.ThermalLoad, -38d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Weapon_Efficient_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 12d),
                    new Pair<>(ItemEffect.DistributorDraw, -15d),
                    new Pair<>(ItemEffect.PowerDraw, -12d),
                    new Pair<>(ItemEffect.ThermalLoad, -43d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_Efficient_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 16d),
                    new Pair<>(ItemEffect.DistributorDraw, -24d),
                    new Pair<>(ItemEffect.PowerDraw, -24d),
                    new Pair<>(ItemEffect.ThermalLoad, -48d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    Weapon_Efficient_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 20d),
                    new Pair<>(ItemEffect.DistributorDraw, -35d),
                    new Pair<>(ItemEffect.PowerDraw, -36d),
                    new Pair<>(ItemEffect.ThermalLoad, -52d)
            ),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1),
            new CostData(Material.SELENIUM, 1)),

    Weapon_Efficient_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 24d),
                    new Pair<>(ItemEffect.DistributorDraw, -45d),
                    new Pair<>(ItemEffect.PowerDraw, -45d),
                    new Pair<>(ItemEffect.ThermalLoad, -60d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Weapon_Focused_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 40d),
                    new Pair<>(ItemEffect.Range, 36d),
                    new Pair<>(ItemEffect.RateOfFire, 36d),
                    new Pair<>(ItemEffect.ThermalLoad, 1d)
            ),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 60d),
                    new Pair<>(ItemEffect.Range, 52d),
                    new Pair<>(ItemEffect.RateOfFire, 52d),
                    new Pair<>(ItemEffect.ThermalLoad, 2d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 80d),
                    new Pair<>(ItemEffect.Range, 68d),
                    new Pair<>(ItemEffect.RateOfFire, 68d),
                    new Pair<>(ItemEffect.ThermalLoad, 3d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.IRON, 1)),

    Weapon_Focused_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 100d),
                    new Pair<>(ItemEffect.Range, 84d),
                    new Pair<>(ItemEffect.RateOfFire, 84d),
                    new Pair<>(ItemEffect.ThermalLoad, 4d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Weapon_Focused_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ArmourPenetration, 120d),
                    new Pair<>(ItemEffect.Range, 100d),
                    new Pair<>(ItemEffect.RateOfFire, 100d),
                    new Pair<>(ItemEffect.ThermalLoad, 5d)
            ),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Weapon_HighCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 36d),
                    new Pair<>(ItemEffect.AmmoClipSize, 36d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.PowerDraw, 4d),
                    new Pair<>(ItemEffect.RateOfFire, 2d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_HighCapacity_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 52d),
                    new Pair<>(ItemEffect.AmmoClipSize, 52d),
                    new Pair<>(ItemEffect.Mass, 30d),
                    new Pair<>(ItemEffect.PowerDraw, 8d),
                    new Pair<>(ItemEffect.RateOfFire, 4d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_HighCapacity_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 68d),
                    new Pair<>(ItemEffect.AmmoClipSize, 68d),
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.RateOfFire, 6d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    Weapon_HighCapacity_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 84d),
                    new Pair<>(ItemEffect.AmmoClipSize, 84d),
                    new Pair<>(ItemEffect.Mass, 50d),
                    new Pair<>(ItemEffect.PowerDraw, 16d),
                    new Pair<>(ItemEffect.RateOfFire, 8d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.TIN, 1)),

    Weapon_HighCapacity_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 100d),
                    new Pair<>(ItemEffect.AmmoClipSize, 100d),
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.RateOfFire, 10d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Weapon_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -30d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Weapon_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, -20d),
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -45d),
                    new Pair<>(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Weapon_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, -25d),
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -60d),
                    new Pair<>(ItemEffect.PowerDraw, -20d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Weapon_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, -30d),
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -75d),
                    new Pair<>(ItemEffect.PowerDraw, -30d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Weapon_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DistributorDraw, -35d),
                    new Pair<>(ItemEffect.Integrity, -60d),
                    new Pair<>(ItemEffect.Mass, -90d),
                    new Pair<>(ItemEffect.PowerDraw, -40d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    Weapon_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 20d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.PowerDraw, 3d),
                    new Pair<>(ItemEffect.Range, 20d),
                    new Pair<>(ItemEffect.ShotSpeed, 20d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 40d),
                    new Pair<>(ItemEffect.Mass, 15d),
                    new Pair<>(ItemEffect.PowerDraw, 6d),
                    new Pair<>(ItemEffect.Range, 40d),
                    new Pair<>(ItemEffect.ShotSpeed, 40d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 60d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.PowerDraw, 9d),
                    new Pair<>(ItemEffect.Range, 60d),
                    new Pair<>(ItemEffect.ShotSpeed, 60d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SULPHUR, 1)),

    Weapon_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 80d),
                    new Pair<>(ItemEffect.Mass, 25d),
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.Range, 80d),
                    new Pair<>(ItemEffect.ShotSpeed, 80d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Weapon_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FalloffRange, 100d),
                    new Pair<>(ItemEffect.Mass, 30d),
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.Range, 100d),
                    new Pair<>(ItemEffect.ShotSpeed, 100d)
            ),
            new CostData(Material.BIOTECHCONDUCTORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    Weapon_Overcharged_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -3d),
                    new Pair<>(ItemEffect.Damage, 30d),
                    new Pair<>(ItemEffect.DistributorDraw, 15d),
                    new Pair<>(ItemEffect.ThermalLoad, 3d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -6d),
                    new Pair<>(ItemEffect.Damage, 40d),
                    new Pair<>(ItemEffect.DistributorDraw, 20d),
                    new Pair<>(ItemEffect.ThermalLoad, 6d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -9d),
                    new Pair<>(ItemEffect.Damage, 50d),
                    new Pair<>(ItemEffect.DistributorDraw, 25d),
                    new Pair<>(ItemEffect.ThermalLoad, 9d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_Overcharged_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -12d),
                    new Pair<>(ItemEffect.Damage, 60d),
                    new Pair<>(ItemEffect.DistributorDraw, 30d),
                    new Pair<>(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.ZINC, 1)),

    Weapon_Overcharged_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoClipSize, -15d),
                    new Pair<>(ItemEffect.Damage, 70d),
                    new Pair<>(ItemEffect.DistributorDraw, 35d),
                    new Pair<>(ItemEffect.ThermalLoad, 15d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.EMBEDDEDFIRMWARE, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    Weapon_RapidFire_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -1d),
                    new Pair<>(ItemEffect.Jitter, 50d),
                    new Pair<>(ItemEffect.ReloadTime, -25d),
                    new Pair<>(ItemEffect.RateOfFire, 8d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_RapidFire_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -2d),
                    new Pair<>(ItemEffect.DistributorDraw, -5d),
                    new Pair<>(ItemEffect.Jitter, 50d),
                    new Pair<>(ItemEffect.ReloadTime, -35d),
                    new Pair<>(ItemEffect.RateOfFire, 17d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Weapon_RapidFire_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -3d),
                    new Pair<>(ItemEffect.DistributorDraw, -15d),
                    new Pair<>(ItemEffect.Jitter, 50d),
                    new Pair<>(ItemEffect.ReloadTime, -45d),
                    new Pair<>(ItemEffect.RateOfFire, 26d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Weapon_RapidFire_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -4d),
                    new Pair<>(ItemEffect.DistributorDraw, -25d),
                    new Pair<>(ItemEffect.Jitter, 50d),
                    new Pair<>(ItemEffect.ReloadTime, -55d),
                    new Pair<>(ItemEffect.RateOfFire, 35d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    Weapon_RapidFire_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, -5d),
                    new Pair<>(ItemEffect.DistributorDraw, -05d),
                    new Pair<>(ItemEffect.Jitter, 50d),
                    new Pair<>(ItemEffect.ReloadTime, -65d),
                    new Pair<>(ItemEffect.RateOfFire, 44d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.TECHNETIUM, 1)),

    Weapon_ShortRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 27d),
                    new Pair<>(ItemEffect.Range, -10d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 39d),
                    new Pair<>(ItemEffect.Range, -20d),
                    new Pair<>(ItemEffect.ThermalLoad, 10d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 51d),
                    new Pair<>(ItemEffect.Range, -30d),
                    new Pair<>(ItemEffect.ThermalLoad, 20d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.NICKEL, 1)),

    Weapon_ShortRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 63d),
                    new Pair<>(ItemEffect.Range, -40d),
                    new Pair<>(ItemEffect.ThermalLoad, 30d)
            ),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Weapon_ShortRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Damage, 75d),
                    new Pair<>(ItemEffect.Range, -50d),
                    new Pair<>(ItemEffect.ThermalLoad, 40d)
            ),
            new CostData(Material.BIOTECHCONDUCTORS, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1)),

    Weapon_Sturdy_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 100d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.ArmourPenetration, 20d),
                    new Pair<>(ItemEffect.ThermalLoad, -10d)
            ),
            new CostData(Material.NICKEL, 1)),

    Weapon_Sturdy_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.ArmourPenetration, 30d),
                    new Pair<>(ItemEffect.ThermalLoad, -15d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Weapon_Sturdy_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 200d),
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ArmourPenetration, 40d),
                    new Pair<>(ItemEffect.ThermalLoad, -20d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Weapon_Sturdy_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 250d),
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.ArmourPenetration, 50d),
                    new Pair<>(ItemEffect.ThermalLoad, -25d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    Weapon_Sturdy_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.ArmourPenetration, 60d),
                    new Pair<>(ItemEffect.ThermalLoad, -30d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),
    ;

    private String parentBlueprintName;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffectData effects;

    WeaponModificationRecipe(ItemGrade grade, ItemEffectData effects, CostData... cost)
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

    public ItemEffectData effects()
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
        return parentBlueprintName + " :: " + getShortLabel();
    }

    @Override
    public String getName()
    {
        return name();
    }
}
