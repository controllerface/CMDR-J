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
    AFM_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    AFM_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    AFM_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    AFM_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Advanced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 4.2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -1d),
                    new Pair<>(ItemEffect.KineticResistance, 3.6d),
                    new Pair<>(ItemEffect.Mass, -15d),
                    new Pair<>(ItemEffect.ThermicResistance, 3d)
            ),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 8.4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -2d),
                    new Pair<>(ItemEffect.KineticResistance, 7.2d),
                    new Pair<>(ItemEffect.Mass, -25d),
                    new Pair<>(ItemEffect.ThermicResistance, 6d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 12.6d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -3d),
                    new Pair<>(ItemEffect.KineticResistance, 10.8d),
                    new Pair<>(ItemEffect.Mass, -35d),
                    new Pair<>(ItemEffect.ThermicResistance, 9d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 16.8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -4d),
                    new Pair<>(ItemEffect.KineticResistance, 14.4d),
                    new Pair<>(ItemEffect.Mass, -45d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Armour_Advanced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 21d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -5d),
                    new Pair<>(ItemEffect.KineticResistance, 18d),
                    new Pair<>(ItemEffect.Mass, -55d),
                    new Pair<>(ItemEffect.ThermicResistance, 15d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1)),

    Armour_Explosive_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 16.8d),
                    new Pair<>(ItemEffect.KineticResistance, -5d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.NICKEL, 1)),

    Armour_Explosive_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 26.6d),
                    new Pair<>(ItemEffect.KineticResistance, -7d),
                    new Pair<>(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1)),

    Armour_Explosive_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 36.4d),
                    new Pair<>(ItemEffect.KineticResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, -8d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Explosive_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 46.2d),
                    new Pair<>(ItemEffect.KineticResistance, -12d),
                    new Pair<>(ItemEffect.ThermicResistance, -10d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.MERCURY, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Explosive_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 56d),
                    new Pair<>(ItemEffect.KineticResistance, -14d),
                    new Pair<>(ItemEffect.ThermicResistance, -12d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.RUTHENIUM, 1)),

    Armour_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 1.4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 12d),
                    new Pair<>(ItemEffect.KineticResistance, 1.2d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.ThermicResistance, 1d)
            ),
            new CostData(Material.CARBON, 1)),

    Armour_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 2.8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 17d),
                    new Pair<>(ItemEffect.KineticResistance, 2.4d),
                    new Pair<>(ItemEffect.Mass, 15d),
                    new Pair<>(ItemEffect.ThermicResistance, 2d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Armour_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 4.2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 22d),
                    new Pair<>(ItemEffect.KineticResistance, 3.6d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.ThermicResistance, 3d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Armour_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 5.6d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 27d),
                    new Pair<>(ItemEffect.KineticResistance, 4.8d),
                    new Pair<>(ItemEffect.Mass, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, 4d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 7d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 32d),
                    new Pair<>(ItemEffect.KineticResistance, 6d),
                    new Pair<>(ItemEffect.Mass, 30d),
                    new Pair<>(ItemEffect.ThermicResistance, 5d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Kinetic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -6d),
                    new Pair<>(ItemEffect.KineticResistance, 14.4d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.NICKEL, 1)),

    Armour_Kinetic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -8d),
                    new Pair<>(ItemEffect.KineticResistance, 22.8d),
                    new Pair<>(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Kinetic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -11d),
                    new Pair<>(ItemEffect.KineticResistance, 31.2d),
                    new Pair<>(ItemEffect.ThermicResistance, -8d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Kinetic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -14d),
                    new Pair<>(ItemEffect.KineticResistance, 39.6d),
                    new Pair<>(ItemEffect.ThermicResistance, -10d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Kinetic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -17d),
                    new Pair<>(ItemEffect.KineticResistance, 48d),
                    new Pair<>(ItemEffect.ThermicResistance, -12d)
            ),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    Armour_Thermic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -6d),
                    new Pair<>(ItemEffect.KineticResistance, -5d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    Armour_Thermic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -8d),
                    new Pair<>(ItemEffect.KineticResistance, -7d),
                    new Pair<>(ItemEffect.ThermicResistance, 19d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.NICKEL, 1)),

    Armour_Thermic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -11d),
                    new Pair<>(ItemEffect.KineticResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, 26d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Thermic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -14d),
                    new Pair<>(ItemEffect.KineticResistance, -12d),
                    new Pair<>(ItemEffect.ThermicResistance, 33d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Thermic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -17d),
                    new Pair<>(ItemEffect.KineticResistance, -14d),
                    new Pair<>(ItemEffect.ThermicResistance, 40d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),

    CargoScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    CargoScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CargoScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CargoScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    CargoScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    CargoScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    CargoScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CargoScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    CargoScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    CargoScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    CargoScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    CargoScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ChaffLauncher_ChaffCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 50d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.ReloadTime, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    ChaffLauncher_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ChaffLauncher_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ChaffLauncher_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ChaffLauncher_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ChaffLauncher_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ChaffLauncher_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    ChaffLauncher_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ChaffLauncher_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ChaffLauncher_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ChaffLauncher_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ChaffLauncher_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CollectionLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    CollectionLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CollectionLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CollectionLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    CollectionLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    CollectionLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    CollectionLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CollectionLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    CollectionLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    CollectionLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    CollectionLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ShieldBooster_Explosive_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 7d),
                    new Pair<>(ItemEffect.KineticResistance, -1d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d)
            ),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Explosive_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 12d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Explosive_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 17d),
                    new Pair<>(ItemEffect.KineticResistance, -3d),
                    new Pair<>(ItemEffect.ThermicResistance, -3d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Explosive_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 22d),
                    new Pair<>(ItemEffect.KineticResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldBooster_Explosive_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 27d),
                    new Pair<>(ItemEffect.KineticResistance, -5d),
                    new Pair<>(ItemEffect.ThermicResistance, -5d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.NIOBIUM, 1)),

    ShieldBooster_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.PowerDraw, 5d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 12d)
            ),
            new CostData(Material.GRIDRESISTORS, 1)),

    ShieldBooster_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 6d),
                    new Pair<>(ItemEffect.Mass, 150d),
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 20.4d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    ShieldBooster_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 9d),
                    new Pair<>(ItemEffect.Mass, 200d),
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 28.8d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.NIOBIUM, 1)),

    ShieldBooster_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 12d),
                    new Pair<>(ItemEffect.Mass, 250d),
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 37.2d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.TIN, 1)),

    ShieldBooster_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 15d),
                    new Pair<>(ItemEffect.Mass, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 25d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 45.6d)
            ),
            new CostData(Material.ANTIMONY, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldBooster_Kinetic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -1d),
                    new Pair<>(ItemEffect.KineticResistance, 7d),
                    new Pair<>(ItemEffect.ThermicResistance, -1d)
            ),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Kinetic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d),
                    new Pair<>(ItemEffect.KineticResistance, 12d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    ShieldBooster_Kinetic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -3d),
                    new Pair<>(ItemEffect.KineticResistance, 17d),
                    new Pair<>(ItemEffect.ThermicResistance, -3d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ShieldBooster_Kinetic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d),
                    new Pair<>(ItemEffect.KineticResistance, 22d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldBooster_Kinetic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -5d),
                    new Pair<>(ItemEffect.KineticResistance, 27d),
                    new Pair<>(ItemEffect.ThermicResistance, -5d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    ShieldBooster_Resistive_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 5d),
                    new Pair<>(ItemEffect.Integrity, -4d),
                    new Pair<>(ItemEffect.KineticResistance, 5d),
                    new Pair<>(ItemEffect.PowerDraw, 5d),
                    new Pair<>(ItemEffect.ThermicResistance, 5d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldBooster_Resistive_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 8d),
                    new Pair<>(ItemEffect.Integrity, -6d),
                    new Pair<>(ItemEffect.KineticResistance, 8d),
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.ThermicResistance, 8d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldBooster_Resistive_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 11d),
                    new Pair<>(ItemEffect.Integrity, -8d),
                    new Pair<>(ItemEffect.KineticResistance, 11d),
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.ThermicResistance, 11d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldBooster_Resistive_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 14d),
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.KineticResistance, 14d),
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.ThermicResistance, 14d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    ShieldBooster_Resistive_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 17d),
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.KineticResistance, 17d),
                    new Pair<>(ItemEffect.PowerDraw, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, 17d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    ShieldBooster_Thermic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -1d),
                    new Pair<>(ItemEffect.KineticResistance, -1d),
                    new Pair<>(ItemEffect.ThermicResistance, 7d)
            ),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Thermic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    ShieldBooster_Thermic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -3d),
                    new Pair<>(ItemEffect.KineticResistance, -3d),
                    new Pair<>(ItemEffect.ThermicResistance, 17d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    ShieldBooster_Thermic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d),
                    new Pair<>(ItemEffect.KineticResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, 22d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldBooster_Thermic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -5d),
                    new Pair<>(ItemEffect.KineticResistance, -5d),
                    new Pair<>(ItemEffect.ThermicResistance, 27d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    ECM_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ECM_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ECM_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ECM_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ECM_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ECM_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    ECM_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ECM_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ECM_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ECM_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ECM_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ECM_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Engine_Dirty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -3d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -3d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 12d),
                    new Pair<>(ItemEffect.PowerDraw, 4d),
                    new Pair<>(ItemEffect.ThermalLoad, 20d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -6d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -5d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 19d),
                    new Pair<>(ItemEffect.PowerDraw, 6d),
                    new Pair<>(ItemEffect.ThermalLoad, 30d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -9d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -8d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 26d),
                    new Pair<>(ItemEffect.PowerDraw, 8d),
                    new Pair<>(ItemEffect.ThermalLoad, 40d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -10d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 33d),
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.ThermalLoad, 50d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1)),

    Engine_Dirty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -13d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.ThermalLoad, 60d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.PHARMACEUTICALISOLATORS, 1)),

    Engine_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.ThermalLoad, -10d)
            ),
            new CostData(Material.CARBON, 1)),

    Engine_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 50d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.ThermalLoad, -20d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.VANADIUM, 1)),

    Engine_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.Mass, 15d),
                    new Pair<>(ItemEffect.ThermalLoad, -30d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Engine_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.ThermalLoad, -40d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Engine_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 110d),
                    new Pair<>(ItemEffect.Mass, 25d),
                    new Pair<>(ItemEffect.ThermalLoad, -50d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Engine_Tuned_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineOptimalMass, -2d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 8d),
                    new Pair<>(ItemEffect.ThermalLoad, -20d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Engine_Tuned_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -4d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -4d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 13d),
                    new Pair<>(ItemEffect.PowerDraw, 4d),
                    new Pair<>(ItemEffect.ThermalLoad, -30d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Tuned_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -8d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -6d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 18d),
                    new Pair<>(ItemEffect.PowerDraw, 8d),
                    new Pair<>(ItemEffect.ThermalLoad, -40d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Engine_Tuned_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -8d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 23d),
                    new Pair<>(ItemEffect.PowerDraw, 12d),
                    new Pair<>(ItemEffect.ThermalLoad, -50d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Engine_Tuned_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -16d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -10d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 28d),
                    new Pair<>(ItemEffect.PowerDraw, 16d),
                    new Pair<>(ItemEffect.ThermalLoad, -60d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.TIN, 1)),

    FSD_FastBoot_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -20d),
                    new Pair<>(ItemEffect.Integrity, -3d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 3d),
                    new Pair<>(ItemEffect.ThermalLoad, 4d)
            ),
            new CostData(Material.GRIDRESISTORS, 1)),

    FSD_FastBoot_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -35d),
                    new Pair<>(ItemEffect.Integrity, -6d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 6d),
                    new Pair<>(ItemEffect.ThermalLoad, 8d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    FSD_FastBoot_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -50d),
                    new Pair<>(ItemEffect.Integrity, -9d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 9d),
                    new Pair<>(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.SELENIUM, 1)),

    FSD_FastBoot_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -65d),
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 12d),
                    new Pair<>(ItemEffect.ThermalLoad, 16d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    FSD_FastBoot_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -80d),
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 15d),
                    new Pair<>(ItemEffect.ThermalLoad, 20d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TELLURIUM, 1)),

    FSD_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -3d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 15d),
                    new Pair<>(ItemEffect.PowerDraw, 3d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1)),

    FSD_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -6d),
                    new Pair<>(ItemEffect.Mass, 15d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 25d),
                    new Pair<>(ItemEffect.PowerDraw, 6d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1),
            new CostData(Material.CHEMICALPROCESSORS, 1)),

    FSD_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -9d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 35d),
                    new Pair<>(ItemEffect.PowerDraw, 9d)
            ),
            new CostData(Material.CHEMICALPROCESSORS, 1),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.WAKESOLUTIONS, 1)),

    FSD_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -12d),
                    new Pair<>(ItemEffect.Mass, 25d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 45d),
                    new Pair<>(ItemEffect.PowerDraw, 12d)
            ),
            new CostData(Material.CHEMICALDISTILLERY, 1),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1),
            new CostData(Material.MANGANESE, 1)),

    FSD_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.Mass, 30d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 55d),
                    new Pair<>(ItemEffect.PowerDraw, 15d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.DATAMINEDWAKE, 1)),

    FSD_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 25d),
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 3d),
                    new Pair<>(ItemEffect.ThermalLoad, -10d)
            ),
            new CostData(Material.NICKEL, 1)),

    FSD_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 50d),
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 6d),
                    new Pair<>(ItemEffect.ThermalLoad, -15d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FSD_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 75d),
                    new Pair<>(ItemEffect.Mass, 12d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 9d),
                    new Pair<>(ItemEffect.ThermalLoad, -20d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.ZINC, 1)),

    FSD_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 100d),
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 12d),
                    new Pair<>(ItemEffect.ThermalLoad, -25d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.VANADIUM, 1)),

    FSD_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 125d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 15d),
                    new Pair<>(ItemEffect.ThermalLoad, -30d)
            ),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    FSDinterdictor_Expanded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.Range, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    FSDinterdictor_Expanded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.Range, -15d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.ENCRYPTEDFILES, 1)),

    FSDinterdictor_Expanded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.Range, -20d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.ENCRYPTIONCODES, 1)),

    FSDinterdictor_Expanded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 100d),
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.Range, -25d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.WAKESOLUTIONS, 1)),

    FSDinterdictor_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -10d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.Range, 20d)
            ),
            new CostData(Material.ENCRYPTEDFILES, 1)),

    FSDinterdictor_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -15d),
                    new Pair<>(ItemEffect.Mass, 15d),
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.Range, 30d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1),
            new CostData(Material.ENCRYPTIONCODES, 1)),

    FSDinterdictor_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -20d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.Range, 40d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.FSDTELEMETRY, 1),
            new CostData(Material.SYMMETRICKEYS, 1)),

    FSDinterdictor_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -25d),
                    new Pair<>(ItemEffect.Mass, 25d),
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.Range, 50d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.WAKESOLUTIONS, 1),
            new CostData(Material.ENCRYPTIONARCHIVES, 1)),

    FuelScoop_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    FuelScoop_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelScoop_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelScoop_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    FuelTransferLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    FuelTransferLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    FuelTransferLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    FuelTransferLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    FuelTransferLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    FuelTransferLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    FuelTransferLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    FuelTransferLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    FuelTransferLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    FuelTransferLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    FuelTransferLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HatchBreakerLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    HatchBreakerLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    HatchBreakerLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    HatchBreakerLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HatchBreakerLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    HatchBreakerLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    HatchBreakerLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HatchBreakerLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HeatSinkLauncher_HeatSinkCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 50d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.ReloadTime, 50d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    HeatSinkLauncher_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    HeatSinkLauncher_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HeatSinkLauncher_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HeatSinkLauncher_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    HeatSinkLauncher_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    HeatSinkLauncher_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    HeatSinkLauncher_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HeatSinkLauncher_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    HeatSinkLauncher_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    HeatSinkLauncher_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HeatSinkLauncher_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Advanced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -4d),
                    new Pair<>(ItemEffect.Mass, -8d)
            ),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -8d),
                    new Pair<>(ItemEffect.Mass, -12d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -12d),
                    new Pair<>(ItemEffect.Mass, -16d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -16d),
                    new Pair<>(ItemEffect.Mass, -20d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    HullReinforcement_Advanced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -20d),
                    new Pair<>(ItemEffect.Mass, -24d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1)),

    HullReinforcement_Explosive_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 11.7d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 3d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d)
            ),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Explosive_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 18.5d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 6d),
                    new Pair<>(ItemEffect.KineticResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1)),

    HullReinforcement_Explosive_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 25.4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 9d),
                    new Pair<>(ItemEffect.KineticResistance, -6d),
                    new Pair<>(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    HullReinforcement_Explosive_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 32.2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 12d),
                    new Pair<>(ItemEffect.KineticResistance, -8d),
                    new Pair<>(ItemEffect.ThermicResistance, -8d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.MERCURY, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Explosive_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 39d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 15d),
                    new Pair<>(ItemEffect.KineticResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, -10d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.RUTHENIUM, 1)),

    HullReinforcement_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 2.9d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 24d),
                    new Pair<>(ItemEffect.KineticResistance, 2.9d),
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ThermicResistance, 2.9d)
            ),
            new CostData(Material.CARBON, 1)),

    HullReinforcement_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 5.9d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 36d),
                    new Pair<>(ItemEffect.KineticResistance, 5.9d),
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.ThermicResistance, 5.9d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HullReinforcement_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 8.8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 48d),
                    new Pair<>(ItemEffect.KineticResistance, 8.8d),
                    new Pair<>(ItemEffect.Mass, 24d),
                    new Pair<>(ItemEffect.ThermicResistance, 8.8d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HullReinforcement_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 11.7d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 60d),
                    new Pair<>(ItemEffect.KineticResistance, 11.7d),
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.ThermicResistance, 11.7d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 14.6d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 72d),
                    new Pair<>(ItemEffect.KineticResistance, 14.6d),
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.ThermicResistance, 14.6d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Kinetic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 3d),
                    new Pair<>(ItemEffect.KineticResistance, 11.7d),
                    new Pair<>(ItemEffect.ThermicResistance, -2d)
            ),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Kinetic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 6d),
                    new Pair<>(ItemEffect.KineticResistance, 18.5d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Kinetic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -6d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 9d),
                    new Pair<>(ItemEffect.KineticResistance, 25.4d),
                    new Pair<>(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Kinetic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 12d),
                    new Pair<>(ItemEffect.KineticResistance, 32.2d),
                    new Pair<>(ItemEffect.ThermicResistance, -8d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Kinetic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -10d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 15d),
                    new Pair<>(ItemEffect.KineticResistance, 29d),
                    new Pair<>(ItemEffect.ThermicResistance, -10d)
            ),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    HullReinforcement_Thermic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 3d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, 11.7d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    HullReinforcement_Thermic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 6d),
                    new Pair<>(ItemEffect.KineticResistance, -4d),
                    new Pair<>(ItemEffect.ThermicResistance, 18.5d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Thermic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -6d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 9d),
                    new Pair<>(ItemEffect.KineticResistance, -6d),
                    new Pair<>(ItemEffect.ThermicResistance, 25.4d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Thermic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 12d),
                    new Pair<>(ItemEffect.KineticResistance, -8d),
                    new Pair<>(ItemEffect.ThermicResistance, 32.2d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Thermic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -10d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 15d),
                    new Pair<>(ItemEffect.KineticResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, 39d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),

    KillWarrantScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    KillWarrantScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    KillWarrantScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    KillWarrantScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    KillWarrantScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    KillWarrantScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -10d),
                    new Pair<>(ItemEffect.Range, 24d)
            ),
            new CostData(Material.IRON, 1)),

    KillWarrantScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -15d),
                    new Pair<>(ItemEffect.Range, 48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    KillWarrantScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -20d),
                    new Pair<>(ItemEffect.Range, 72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    KillWarrantScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -25d),
                    new Pair<>(ItemEffect.Range, 96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    KillWarrantScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 50d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -30d),
                    new Pair<>(ItemEffect.Range, 120d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    KillWarrantScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    KillWarrantScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    KillWarrantScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    KillWarrantScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    KillWarrantScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    KillWarrantScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    LifeSupport_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    LifeSupport_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    LifeSupport_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    LifeSupport_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    LifeSupport_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    LifeSupport_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    LifeSupport_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    LifeSupport_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    LifeSupport_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    LifeSupport_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    PointDefence_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    PointDefence_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    PointDefence_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    PointDefence_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    PointDefence_PointDefenseCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 50d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.ReloadTime, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    PointDefence_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PointDefence_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    PointDefence_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    PointDefence_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PointDefence_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerDistributor_HighCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 10d),
                    new Pair<>(ItemEffect.EnginesRecharge, -2d),
                    new Pair<>(ItemEffect.Integrity, 10d),
                    new Pair<>(ItemEffect.SystemsCapacity, 10d),
                    new Pair<>(ItemEffect.SystemsRecharge, -2d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 10d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -2d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_HighCapacity_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 18d),
                    new Pair<>(ItemEffect.EnginesRecharge, -6d),
                    new Pair<>(ItemEffect.Integrity, 15d),
                    new Pair<>(ItemEffect.SystemsCapacity, 18d),
                    new Pair<>(ItemEffect.SystemsRecharge, -6d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 18d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -6d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighCapacity_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 26d),
                    new Pair<>(ItemEffect.EnginesRecharge, -10d),
                    new Pair<>(ItemEffect.Integrity, 20d),
                    new Pair<>(ItemEffect.SystemsCapacity, 26d),
                    new Pair<>(ItemEffect.SystemsRecharge, -10d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 26d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -10d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighCapacity_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 34d),
                    new Pair<>(ItemEffect.EnginesRecharge, -14d),
                    new Pair<>(ItemEffect.Integrity, 25d),
                    new Pair<>(ItemEffect.SystemsCapacity, 34d),
                    new Pair<>(ItemEffect.SystemsRecharge, -14d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 34d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -14d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SELENIUM, 1)),

    PowerDistributor_HighCapacity_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 42d),
                    new Pair<>(ItemEffect.EnginesRecharge, -18d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.SystemsCapacity, 42d),
                    new Pair<>(ItemEffect.SystemsRecharge, -18d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 42d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -18d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    PowerDistributor_HighFrequency_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -1d),
                    new Pair<>(ItemEffect.EnginesRecharge, 9d),
                    new Pair<>(ItemEffect.SystemsCapacity, -1d),
                    new Pair<>(ItemEffect.SystemsRecharge, 9d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -1d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 9d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighFrequency_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -2d),
                    new Pair<>(ItemEffect.EnginesRecharge, 18d),
                    new Pair<>(ItemEffect.SystemsCapacity, -2d),
                    new Pair<>(ItemEffect.SystemsRecharge, 18d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -2d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 18d)
            ),
            new CostData(Material.CHEMICALPROCESSORS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighFrequency_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -3d),
                    new Pair<>(ItemEffect.EnginesRecharge, 27d),
                    new Pair<>(ItemEffect.SystemsCapacity, -3d),
                    new Pair<>(ItemEffect.SystemsRecharge, 27d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -3d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 27d)
            ),
            new CostData(Material.CHEMICALDISTILLERY, 1),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    PowerDistributor_HighFrequency_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -4d),
                    new Pair<>(ItemEffect.EnginesRecharge, 36d),
                    new Pair<>(ItemEffect.SystemsCapacity, -4d),
                    new Pair<>(ItemEffect.SystemsRecharge, 36d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -4d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 36d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    PowerDistributor_HighFrequency_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -5d),
                    new Pair<>(ItemEffect.EnginesRecharge, 45d),
                    new Pair<>(ItemEffect.SystemsCapacity, -5d),
                    new Pair<>(ItemEffect.SystemsRecharge, 45d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -5d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 45d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),

    PowerDistributor_PriorityEngines_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 20d),
                    new Pair<>(ItemEffect.EnginesRecharge, 16d),
                    new Pair<>(ItemEffect.SystemsCapacity, -3d),
                    new Pair<>(ItemEffect.SystemsRecharge, -3d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -3d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -1d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityEngines_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 30d),
                    new Pair<>(ItemEffect.EnginesRecharge, 23d),
                    new Pair<>(ItemEffect.SystemsCapacity, -6d),
                    new Pair<>(ItemEffect.SystemsRecharge, -6d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -6d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -2d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityEngines_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 40d),
                    new Pair<>(ItemEffect.EnginesRecharge, 30d),
                    new Pair<>(ItemEffect.SystemsCapacity, -9d),
                    new Pair<>(ItemEffect.SystemsRecharge, -9d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -9d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -3d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PriorityEngines_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 50d),
                    new Pair<>(ItemEffect.EnginesRecharge, 37d),
                    new Pair<>(ItemEffect.SystemsCapacity, -12d),
                    new Pair<>(ItemEffect.SystemsRecharge, -12d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -4d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PriorityEngines_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 60d),
                    new Pair<>(ItemEffect.EnginesRecharge, 44d),
                    new Pair<>(ItemEffect.SystemsCapacity, -15d),
                    new Pair<>(ItemEffect.SystemsRecharge, -15d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -15d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -5d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_PrioritySystems_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -3d),
                    new Pair<>(ItemEffect.EnginesRecharge, -1d),
                    new Pair<>(ItemEffect.SystemsCapacity, 20d),
                    new Pair<>(ItemEffect.SystemsRecharge, 16d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -3d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -3d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PrioritySystems_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -6d),
                    new Pair<>(ItemEffect.EnginesRecharge, -2d),
                    new Pair<>(ItemEffect.SystemsCapacity, 30d),
                    new Pair<>(ItemEffect.SystemsRecharge, 23d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -6d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -6d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PrioritySystems_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -9d),
                    new Pair<>(ItemEffect.EnginesRecharge, -3d),
                    new Pair<>(ItemEffect.SystemsCapacity, 40d),
                    new Pair<>(ItemEffect.SystemsRecharge, 30d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -9d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -9d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PrioritySystems_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -12d),
                    new Pair<>(ItemEffect.EnginesRecharge, -4d),
                    new Pair<>(ItemEffect.SystemsCapacity, 50d),
                    new Pair<>(ItemEffect.SystemsRecharge, 37d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -12d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PrioritySystems_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -15d),
                    new Pair<>(ItemEffect.EnginesRecharge, -5d),
                    new Pair<>(ItemEffect.SystemsCapacity, 60d),
                    new Pair<>(ItemEffect.SystemsRecharge, 44d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -15d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -15d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_PriorityWeapons_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -3d),
                    new Pair<>(ItemEffect.EnginesRecharge, -3d),
                    new Pair<>(ItemEffect.SystemsCapacity, -3d),
                    new Pair<>(ItemEffect.SystemsRecharge, -1d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 20d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 16d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityWeapons_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -6d),
                    new Pair<>(ItemEffect.EnginesRecharge, -6d),
                    new Pair<>(ItemEffect.SystemsCapacity, -6d),
                    new Pair<>(ItemEffect.SystemsRecharge, -2d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 30d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 23d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityWeapons_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -9d),
                    new Pair<>(ItemEffect.EnginesRecharge, -9d),
                    new Pair<>(ItemEffect.SystemsCapacity, -9d),
                    new Pair<>(ItemEffect.SystemsRecharge, -3d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 40d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 30d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PriorityWeapons_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -12d),
                    new Pair<>(ItemEffect.EnginesRecharge, -12d),
                    new Pair<>(ItemEffect.SystemsCapacity, -12d),
                    new Pair<>(ItemEffect.SystemsRecharge, -4d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 50d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 37d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PriorityWeapons_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -15d),
                    new Pair<>(ItemEffect.EnginesRecharge, -15d),
                    new Pair<>(ItemEffect.SystemsCapacity, -15d),
                    new Pair<>(ItemEffect.SystemsRecharge, -5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 60d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 44d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.Mass, 3d),
                    new Pair<>(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.Mass, 6d),
                    new Pair<>(ItemEffect.PowerDraw, -15d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 9d),
                    new Pair<>(ItemEffect.PowerDraw, -20d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 160d),
                    new Pair<>(ItemEffect.Mass, 12d),
                    new Pair<>(ItemEffect.PowerDraw, -25d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PowerDistributor_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 200d),
                    new Pair<>(ItemEffect.Mass, 15d),
                    new Pair<>(ItemEffect.PowerDraw, -30d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerPlant_Armoured_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -4d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerCapacity, 4d),
                    new Pair<>(ItemEffect.Mass, 4d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PowerPlant_Armoured_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -6d),
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerCapacity, 6d),
                    new Pair<>(ItemEffect.Mass, 8d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerPlant_Armoured_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -8d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerCapacity, 8d),
                    new Pair<>(ItemEffect.Mass, 12d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerPlant_Armoured_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -10d),
                    new Pair<>(ItemEffect.Integrity, 100d),
                    new Pair<>(ItemEffect.PowerCapacity, 10d),
                    new Pair<>(ItemEffect.Mass, 16d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PowerPlant_Armoured_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -12d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerCapacity, 12d),
                    new Pair<>(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerPlant_Boosted_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 5d),
                    new Pair<>(ItemEffect.Integrity, -5d),
                    new Pair<>(ItemEffect.PowerCapacity, 12d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerPlant_Boosted_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 10d),
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.PowerCapacity, 19d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    PowerPlant_Boosted_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 15d),
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.PowerCapacity, 26d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.SELENIUM, 1)),

    PowerPlant_Boosted_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 20d),
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.PowerCapacity, 33d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    PowerPlant_Boosted_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 25d),
                    new Pair<>(ItemEffect.Integrity, -25d),
                    new Pair<>(ItemEffect.PowerCapacity, 40d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.TELLURIUM, 1)),

    PowerPlant_Stealth_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -25d),
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.PowerCapacity, -3d)
            ),
            new CostData(Material.IRON, 1)),

    PowerPlant_Stealth_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -35d),
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.PowerCapacity, -6d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1)),

    PowerPlant_Stealth_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -45d),
                    new Pair<>(ItemEffect.Mass, 12d),
                    new Pair<>(ItemEffect.PowerCapacity, -9d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1)),

    PowerPlant_Stealth_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -55d),
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.PowerCapacity, -12d)
            ),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    PowerPlant_Stealth_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -65d),
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.PowerCapacity, -15d)
            ),
            new CostData(Material.PROTOHEATRADIATORS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    ProspectingLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ProspectingLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ProspectingLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ProspectingLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ProspectingLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ProspectingLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    ProspectingLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ProspectingLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ProspectingLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ProspectingLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ProspectingLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Refineries_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    Refineries_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Refineries_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Refineries_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Sensor_CargoScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Range, -5d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Range, -10d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Range, -15d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -50d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Range, -20d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_CargoScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Range, -25d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -80d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_CargoScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -10d),
                    new Pair<>(ItemEffect.Range, 24d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_CargoScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -15d),
                    new Pair<>(ItemEffect.Range, 48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_CargoScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -20d),
                    new Pair<>(ItemEffect.Range, 72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_CargoScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -25d),
                    new Pair<>(ItemEffect.Range, 96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_CargoScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 50d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -30d),
                    new Pair<>(ItemEffect.Range, 120d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_CargoScanner_WideAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 40d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 80d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 20d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 120d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 30d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 160d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 40d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_CargoScanner_WideAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 200d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 50d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_KillWarrantScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Range, -5d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Range, -10d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Range, -15d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -50d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Range, -20d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_KillWarrantScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Range, -25d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -80d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_KillWarrantScanner_WideAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 40d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 80d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 20d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 120d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 30d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 160d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 40d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_KillWarrantScanner_WideAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 200d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 50d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_Sensor_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -5d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_Sensor_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -35d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -10d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Sensor_Sensor_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -50d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -15d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Sensor_Sensor_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -65d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -20d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Sensor_Sensor_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -80d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -25d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    Sensor_Sensor_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -10d),
                    new Pair<>(ItemEffect.Range, 15d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_Sensor_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -15d),
                    new Pair<>(ItemEffect.Range, 30d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_Sensor_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -20d),
                    new Pair<>(ItemEffect.Range, 45d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_Sensor_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -25d),
                    new Pair<>(ItemEffect.Range, 60d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_Sensor_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -30d),
                    new Pair<>(ItemEffect.Range, 75d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_Sensor_WideAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 40d),
                    new Pair<>(ItemEffect.Range, -4d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Sensor_WideAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 80d),
                    new Pair<>(ItemEffect.Range, -8d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Sensor_WideAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 120d),
                    new Pair<>(ItemEffect.Range, -12d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Sensor_WideAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 160d),
                    new Pair<>(ItemEffect.Range, -16d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_Sensor_WideAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 50d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 200d),
                    new Pair<>(ItemEffect.Range, -20d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_SurfaceScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.DSS_RateMult, 20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_SurfaceScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.DSS_RateMult, 35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_SurfaceScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.DSS_RateMult, 50d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_SurfaceScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.DSS_RateMult, 65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_SurfaceScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.DSS_RateMult, 80d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_SurfaceScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Range, 40d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_SurfaceScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Range, 80d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_SurfaceScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.Range, 120d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_SurfaceScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Range, 160d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_SurfaceScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.Range, 200d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_SurfaceScanner_WideAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 40d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 80d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 120d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 160d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_SurfaceScanner_WideAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 200d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_WakeScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Range, -5d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Range, -10d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Range, -15d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -50d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Range, -20d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_WakeScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Range, -25d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -80d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_WakeScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -10d),
                    new Pair<>(ItemEffect.Range, 24d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_WakeScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -15d),
                    new Pair<>(ItemEffect.Range, 48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_WakeScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 30d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -20d),
                    new Pair<>(ItemEffect.Range, 72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_WakeScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -25d),
                    new Pair<>(ItemEffect.Range, 96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_WakeScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 50d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -30d),
                    new Pair<>(ItemEffect.Range, 120d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_WakeScanner_WideAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 40d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 80d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 20d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 120d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 30d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 160d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 40d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_WakeScanner_WideAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 200d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 50d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    ShieldCellBank_Rapid_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.ShieldBankDuration, -6d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 5d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -10d)
            ),
            new CostData(Material.SULPHUR, 1)),

    ShieldCellBank_Rapid_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.ShieldBankDuration, -12d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 10d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -20d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    ShieldCellBank_Rapid_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, 20d),
                    new Pair<>(ItemEffect.ShieldBankDuration, -18d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 15d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -30d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.SULPHUR, 1)),

    ShieldCellBank_Specialised_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -8d),
                    new Pair<>(ItemEffect.Integrity, -5d),
                    new Pair<>(ItemEffect.PowerDraw, 10d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 4d),
                    new Pair<>(ItemEffect.ThermalLoad, -6d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    ShieldCellBank_Specialised_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -16d),
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.PowerDraw, 15d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 6d),
                    new Pair<>(ItemEffect.ThermalLoad, -12d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    ShieldCellBank_Specialised_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -24d),
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.PowerDraw, 20d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 8d),
                    new Pair<>(ItemEffect.ThermalLoad, -18d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 1)),

    ShieldGenerator_Kinetic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 6d),
                    new Pair<>(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Kinetic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 25d),
                    new Pair<>(ItemEffect.KineticResistance, 12d),
                    new Pair<>(ItemEffect.ThermicResistance, -7d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    ShieldGenerator_Kinetic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.KineticResistance, 18d),
                    new Pair<>(ItemEffect.ThermicResistance, -11d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1)),

    ShieldGenerator_Kinetic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 35d),
                    new Pair<>(ItemEffect.KineticResistance, 24d),
                    new Pair<>(ItemEffect.ThermicResistance, -14d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.MERCURY, 1)),

    ShieldGenerator_Kinetic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.KineticResistance, 30d),
                    new Pair<>(ItemEffect.ThermicResistance, -18d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.RUTHENIUM, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldGenerator_Optimised_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -5d),
                    new Pair<>(ItemEffect.Mass, -18d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -2d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 4.5d),
                    new Pair<>(ItemEffect.PowerDraw, -20d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Optimised_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -26d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -3d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 9d),
                    new Pair<>(ItemEffect.PowerDraw, -25d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1)),

    ShieldGenerator_Optimised_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -15d),
                    new Pair<>(ItemEffect.Mass, -34d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -4d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 13.5d),
                    new Pair<>(ItemEffect.PowerDraw, -30d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1)),

    ShieldGenerator_Optimised_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -42d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -5d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 18d),
                    new Pair<>(ItemEffect.PowerDraw, -35d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    ShieldGenerator_Optimised_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -25d),
                    new Pair<>(ItemEffect.Mass, -50d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -6d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 22.5d),
                    new Pair<>(ItemEffect.PowerDraw, -40d)
            ),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldGenerator_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.DistributorDraw, 4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 22.5d),
                    new Pair<>(ItemEffect.KineticResistance, 2.7d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 14d),
                    new Pair<>(ItemEffect.ThermicResistance, 5.4d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.DistributorDraw, 6d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 37.5d),
                    new Pair<>(ItemEffect.KineticResistance, 4.5d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 20d),
                    new Pair<>(ItemEffect.ThermicResistance, 9d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.DistributorDraw, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 52.5d),
                    new Pair<>(ItemEffect.KineticResistance, 6.3d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 26d),
                    new Pair<>(ItemEffect.ThermicResistance, 12.6d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.DistributorDraw, 10d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 67.5d),
                    new Pair<>(ItemEffect.KineticResistance, 8.1d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 32d),
                    new Pair<>(ItemEffect.ThermicResistance, 16.2d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.MANGANESE, 1)),

    ShieldGenerator_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -10d),
                    new Pair<>(ItemEffect.DistributorDraw, 12d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 82.5d),
                    new Pair<>(ItemEffect.KineticResistance, 9.9d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 38d),
                    new Pair<>(ItemEffect.ThermicResistance, 19.8d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.IMPROVISEDCOMPONENTS, 1)),

    ShieldGenerator_Thermic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 20d),
                    new Pair<>(ItemEffect.KineticResistance, -2d),
                    new Pair<>(ItemEffect.ThermicResistance, 12d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Thermic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 25d),
                    new Pair<>(ItemEffect.KineticResistance, -5d),
                    new Pair<>(ItemEffect.ThermicResistance, 24d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1)),

    ShieldGenerator_Thermic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.KineticResistance, -7d),
                    new Pair<>(ItemEffect.ThermicResistance, 36d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.SELENIUM, 1)),

    ShieldGenerator_Thermic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 35d),
                    new Pair<>(ItemEffect.KineticResistance, -10d),
                    new Pair<>(ItemEffect.ThermicResistance, 48d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.MERCURY, 1)),

    ShieldGenerator_Thermic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.KineticResistance, -12d),
                    new Pair<>(ItemEffect.ThermicResistance, 60d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.RUTHENIUM, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    WakeScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -10d),
                    new Pair<>(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    WakeScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -20d),
                    new Pair<>(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    WakeScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -30d),
                    new Pair<>(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    WakeScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -40d),
                    new Pair<>(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    WakeScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -50d),
                    new Pair<>(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    WakeScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    WakeScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    WakeScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    WakeScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    WakeScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    WakeScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 240d),
                    new Pair<>(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    WakeScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 300d),
                    new Pair<>(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ;

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

    @Override
    public String getShortLabel()
    {
        String grade = Arrays.stream(name().split("_")).reduce((a, b) -> b).orElse("?");
        return "Grade " + grade;
    }

    @Override
    public String getDisplayLabel()
    {
        String name = name().replace("_"," ").substring(0,name().length()-1);
        return name + getShortLabel();
    }

    @Override
    public String getName()
    {
        return name();
    }
}
