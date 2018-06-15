package com.controllerface.edeps.structures.craftable.modifications;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.data.ItemEffects;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.equipment.ItemGrade;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
@SuppressWarnings("unchecked")
public enum ModificationRecipe implements ProcurementRecipe
{
    AFM_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    AFM_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    AFM_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    AFM_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Advanced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 4.2d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -1d),
                    new ItemEffectData(ItemEffect.KineticResistance, 3.6d),
                    new ItemEffectData(ItemEffect.Mass, -15d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 3d)
            ),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 8.4d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 7.2d),
                    new ItemEffectData(ItemEffect.Mass, -25d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 6d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 12.6d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -3d),
                    new ItemEffectData(ItemEffect.KineticResistance, 10.8d),
                    new ItemEffectData(ItemEffect.Mass, -35d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 9d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 16.8d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -4d),
                    new ItemEffectData(ItemEffect.KineticResistance, 14.4d),
                    new ItemEffectData(ItemEffect.Mass, -45d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 12d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Armour_Advanced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 21d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -5d),
                    new ItemEffectData(ItemEffect.KineticResistance, 18d),
                    new ItemEffectData(ItemEffect.Mass, -55d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 15d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1)),

    Armour_Explosive_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 16.8d),
                    new ItemEffectData(ItemEffect.KineticResistance, -5d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.NICKEL, 1)),

    Armour_Explosive_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 26.6d),
                    new ItemEffectData(ItemEffect.KineticResistance, -7d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1)),

    Armour_Explosive_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 36.4d),
                    new ItemEffectData(ItemEffect.KineticResistance, -10d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -8d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Explosive_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 46.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, -12d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -10d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.MERCURY, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Explosive_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 56d),
                    new ItemEffectData(ItemEffect.KineticResistance, -14d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -12d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.RUTHENIUM, 1)),

    Armour_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 1.4d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 12d),
                    new ItemEffectData(ItemEffect.KineticResistance, 1.2d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 1d)
            ),
            new CostData(Material.CARBON, 1)),

    Armour_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 2.8d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 17d),
                    new ItemEffectData(ItemEffect.KineticResistance, 2.4d),
                    new ItemEffectData(ItemEffect.Mass, 15d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 2d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Armour_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 4.2d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 22d),
                    new ItemEffectData(ItemEffect.KineticResistance, 3.6d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 3d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Armour_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 5.6d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 27d),
                    new ItemEffectData(ItemEffect.KineticResistance, 4.8d),
                    new ItemEffectData(ItemEffect.Mass, 25d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 4d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 7d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 32d),
                    new ItemEffectData(ItemEffect.KineticResistance, 6d),
                    new ItemEffectData(ItemEffect.Mass, 30d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 5d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Kinetic_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                    new ItemEffectData(ItemEffect.KineticResistance, 14.4d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.NICKEL, 1)),

    Armour_Kinetic_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -8d),
                    new ItemEffectData(ItemEffect.KineticResistance, 22.8d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Kinetic_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -11d),
                    new ItemEffectData(ItemEffect.KineticResistance, 31.2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -8d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Kinetic_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -14d),
                    new ItemEffectData(ItemEffect.KineticResistance, 39.6d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -10d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Kinetic_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -17d),
                    new ItemEffectData(ItemEffect.KineticResistance, 48d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -12d)
            ),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    Armour_Thermic_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                    new ItemEffectData(ItemEffect.KineticResistance, -5d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 12d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    Armour_Thermic_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -8d),
                    new ItemEffectData(ItemEffect.KineticResistance, -7d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 19d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.NICKEL, 1)),

    Armour_Thermic_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -11d),
                    new ItemEffectData(ItemEffect.KineticResistance, -10d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 26d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Thermic_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -14d),
                    new ItemEffectData(ItemEffect.KineticResistance, -12d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 33d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Thermic_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -17d),
                    new ItemEffectData(ItemEffect.KineticResistance, -14d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 40d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),

    CargoScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    CargoScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CargoScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CargoScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    CargoScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    CargoScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    CargoScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CargoScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    CargoScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    CargoScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    CargoScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    CargoScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ChaffLauncher_ChaffCapacity_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 50d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.ReloadTime, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    ChaffLauncher_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ChaffLauncher_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ChaffLauncher_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ChaffLauncher_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ChaffLauncher_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ChaffLauncher_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    ChaffLauncher_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ChaffLauncher_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ChaffLauncher_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ChaffLauncher_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ChaffLauncher_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CollectionLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    CollectionLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CollectionLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CollectionLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    CollectionLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    CollectionLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    CollectionLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CollectionLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    CollectionLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    CollectionLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    CollectionLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ShieldBooster_Explosive_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 7d),
                    new ItemEffectData(ItemEffect.KineticResistance, -1d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -1d)
            ),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Explosive_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 12d),
                    new ItemEffectData(ItemEffect.KineticResistance, -2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -2d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Explosive_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 17d),
                    new ItemEffectData(ItemEffect.KineticResistance, -3d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -3d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Explosive_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 22d),
                    new ItemEffectData(ItemEffect.KineticResistance, -4d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldBooster_Explosive_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 27d),
                    new ItemEffectData(ItemEffect.KineticResistance, -5d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -5d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.NIOBIUM, 1)),

    ShieldBooster_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 3d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.PowerDraw, 5d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 12d)
            ),
            new CostData(Material.GRIDRESISTORS, 1)),

    ShieldBooster_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 6d),
                    new ItemEffectData(ItemEffect.Mass, 150d),
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 20.4d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    ShieldBooster_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 9d),
                    new ItemEffectData(ItemEffect.Mass, 200d),
                    new ItemEffectData(ItemEffect.PowerDraw, 15d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 28.8d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.NIOBIUM, 1)),

    ShieldBooster_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 12d),
                    new ItemEffectData(ItemEffect.Mass, 250d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 37.2d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.TIN, 1)),

    ShieldBooster_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d),
                    new ItemEffectData(ItemEffect.Mass, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 25d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 45.6d)
            ),
            new CostData(Material.ANTIMONY, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldBooster_Kinetic_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -1d),
                    new ItemEffectData(ItemEffect.KineticResistance, 7d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -1d)
            ),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Kinetic_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 12d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -2d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    ShieldBooster_Kinetic_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -3d),
                    new ItemEffectData(ItemEffect.KineticResistance, 17d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -3d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ShieldBooster_Kinetic_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -4d),
                    new ItemEffectData(ItemEffect.KineticResistance, 22d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldBooster_Kinetic_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -5d),
                    new ItemEffectData(ItemEffect.KineticResistance, 27d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -5d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    ShieldBooster_Resistive_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 5d),
                    new ItemEffectData(ItemEffect.Integrity, -4d),
                    new ItemEffectData(ItemEffect.KineticResistance, 5d),
                    new ItemEffectData(ItemEffect.PowerDraw, 5d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 5d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldBooster_Resistive_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 8d),
                    new ItemEffectData(ItemEffect.Integrity, -6d),
                    new ItemEffectData(ItemEffect.KineticResistance, 8d),
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 8d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldBooster_Resistive_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 11d),
                    new ItemEffectData(ItemEffect.Integrity, -8d),
                    new ItemEffectData(ItemEffect.KineticResistance, 11d),
                    new ItemEffectData(ItemEffect.PowerDraw, 15d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 11d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldBooster_Resistive_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 14d),
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.KineticResistance, 14d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 14d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    ShieldBooster_Resistive_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 17d),
                    new ItemEffectData(ItemEffect.Integrity, -12d),
                    new ItemEffectData(ItemEffect.KineticResistance, 17d),
                    new ItemEffectData(ItemEffect.PowerDraw, 25d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 17d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    ShieldBooster_Thermic_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -1d),
                    new ItemEffectData(ItemEffect.KineticResistance, -1d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 7d)
            ),
            new CostData(Material.IRON, 1)),

    ShieldBooster_Thermic_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -2d),
                    new ItemEffectData(ItemEffect.KineticResistance, -2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 12d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    ShieldBooster_Thermic_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -3d),
                    new ItemEffectData(ItemEffect.KineticResistance, -3d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 17d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    ShieldBooster_Thermic_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -4d),
                    new ItemEffectData(ItemEffect.KineticResistance, -4d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 22d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldBooster_Thermic_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -5d),
                    new ItemEffectData(ItemEffect.KineticResistance, -5d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 27d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    ECM_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ECM_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ECM_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ECM_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ECM_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ECM_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    ECM_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ECM_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ECM_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ECM_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ECM_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ECM_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Engine_Dirty_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -3d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -3d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 12d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 20d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -6d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -5d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 19d),
                    new ItemEffectData(ItemEffect.PowerDraw, 6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 30d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -9d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -8d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 26d),
                    new ItemEffectData(ItemEffect.PowerDraw, 8d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 40d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -12d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -10d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 33d),
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 50d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1)),

    Engine_Dirty_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -15d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -13d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 40d),
                    new ItemEffectData(ItemEffect.PowerDraw, 12d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 60d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.PHARMACEUTICALISOLATORS, 1)),

    Engine_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -10d)
            ),
            new CostData(Material.CARBON, 1)),

    Engine_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 50d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -20d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.VANADIUM, 1)),

    Engine_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 70d),
                    new ItemEffectData(ItemEffect.Mass, 15d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -30d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Engine_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -40d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Engine_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 110d),
                    new ItemEffectData(ItemEffect.Mass, 25d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -50d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Engine_Tuned_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -2d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 8d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -20d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Engine_Tuned_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -4d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -4d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 13d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -30d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Tuned_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -8d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -6d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 18d),
                    new ItemEffectData(ItemEffect.PowerDraw, 8d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -40d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Engine_Tuned_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -12d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -8d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 23d),
                    new ItemEffectData(ItemEffect.PowerDraw, 12d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -50d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Engine_Tuned_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -16d),
                    new ItemEffectData(ItemEffect.EngineOptimalMass, -10d),
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 28d),
                    new ItemEffectData(ItemEffect.PowerDraw, 16d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -60d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.TIN, 1)),

    FSD_FastBoot_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, -20d),
                    new ItemEffectData(ItemEffect.Integrity, -3d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 3d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 4d)
            ),
            new CostData(Material.GRIDRESISTORS, 1)),

    FSD_FastBoot_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, -35d),
                    new ItemEffectData(ItemEffect.Integrity, -6d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 8d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    FSD_FastBoot_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, -50d),
                    new ItemEffectData(ItemEffect.Integrity, -9d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 9d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 12d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.SELENIUM, 1)),

    FSD_FastBoot_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, -65d),
                    new ItemEffectData(ItemEffect.Integrity, -12d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 12d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 16d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    FSD_FastBoot_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.BootTime, -80d),
                    new ItemEffectData(ItemEffect.Integrity, -15d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 15d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 20d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TELLURIUM, 1)),

    FSD_LongRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -3d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 15d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1)),

    FSD_LongRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -6d),
                    new ItemEffectData(ItemEffect.Mass, 15d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 25d),
                    new ItemEffectData(ItemEffect.PowerDraw, 6d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1),
            new CostData(Material.CHEMICALPROCESSORS, 1)),

    FSD_LongRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -9d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 35d),
                    new ItemEffectData(ItemEffect.PowerDraw, 9d)
            ),
            new CostData(Material.CHEMICALPROCESSORS, 1),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.WAKESOLUTIONS, 1)),

    FSD_LongRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -12d),
                    new ItemEffectData(ItemEffect.Mass, 25d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 45d),
                    new ItemEffectData(ItemEffect.PowerDraw, 12d)
            ),
            new CostData(Material.CHEMICALDISTILLERY, 1),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1),
            new CostData(Material.MANGANESE, 1)),

    FSD_LongRange_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -15d),
                    new ItemEffectData(ItemEffect.Mass, 30d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 55d),
                    new ItemEffectData(ItemEffect.PowerDraw, 15d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.DATAMINEDWAKE, 1)),

    FSD_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 25d),
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 3d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -10d)
            ),
            new CostData(Material.NICKEL, 1)),

    FSD_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 50d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -15d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FSD_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 75d),
                    new ItemEffectData(ItemEffect.Mass, 12d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 9d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -20d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.ZINC, 1)),

    FSD_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 100d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 12d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -25d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.VANADIUM, 1)),

    FSD_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 125d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 15d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -30d)
            ),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    FSDinterdictor_Expanded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 40d),
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.Range, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    FSDinterdictor_Expanded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.Range, -15d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.ENCRYPTEDFILES, 1)),

    FSDinterdictor_Expanded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 80d),
                    new ItemEffectData(ItemEffect.PowerDraw, 30d),
                    new ItemEffectData(ItemEffect.Range, -20d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.ENCRYPTIONCODES, 1)),

    FSDinterdictor_Expanded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 100d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d),
                    new ItemEffectData(ItemEffect.Range, -25d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.WAKESOLUTIONS, 1)),

    FSDinterdictor_LongRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, -10d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.Range, 20d)
            ),
            new CostData(Material.ENCRYPTEDFILES, 1)),

    FSDinterdictor_LongRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, -15d),
                    new ItemEffectData(ItemEffect.Mass, 15d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.Range, 30d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1),
            new CostData(Material.ENCRYPTIONCODES, 1)),

    FSDinterdictor_LongRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, -20d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.PowerDraw, 30d),
                    new ItemEffectData(ItemEffect.Range, 40d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.FSDTELEMETRY, 1),
            new CostData(Material.SYMMETRICKEYS, 1)),

    FSDinterdictor_LongRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, -25d),
                    new ItemEffectData(ItemEffect.Mass, 25d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d),
                    new ItemEffectData(ItemEffect.Range, 50d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.WAKESOLUTIONS, 1),
            new CostData(Material.ENCRYPTIONARCHIVES, 1)),

    FuelScoop_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    FuelScoop_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelScoop_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelScoop_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    FuelTransferLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    FuelTransferLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    FuelTransferLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    FuelTransferLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    FuelTransferLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    FuelTransferLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    FuelTransferLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    FuelTransferLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    FuelTransferLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    FuelTransferLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    FuelTransferLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HatchBreakerLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    HatchBreakerLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    HatchBreakerLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    HatchBreakerLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HatchBreakerLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    HatchBreakerLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    HatchBreakerLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HatchBreakerLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HeatSinkLauncher_HeatSinkCapacity_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 50d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.ReloadTime, 50d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    HeatSinkLauncher_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    HeatSinkLauncher_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HeatSinkLauncher_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HeatSinkLauncher_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    HeatSinkLauncher_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    HeatSinkLauncher_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    HeatSinkLauncher_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HeatSinkLauncher_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    HeatSinkLauncher_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    HeatSinkLauncher_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HeatSinkLauncher_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Advanced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -4d),
                    new ItemEffectData(ItemEffect.Mass, -8d)
            ),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -8d),
                    new ItemEffectData(ItemEffect.Mass, -12d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -12d),
                    new ItemEffectData(ItemEffect.Mass, -16d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -16d),
                    new ItemEffectData(ItemEffect.Mass, -20d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    HullReinforcement_Advanced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -20d),
                    new ItemEffectData(ItemEffect.Mass, -24d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1)),

    HullReinforcement_Explosive_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 11.7d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 3d),
                    new ItemEffectData(ItemEffect.KineticResistance, -2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -2d)
            ),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Explosive_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 18.5d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 6d),
                    new ItemEffectData(ItemEffect.KineticResistance, -4d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1)),

    HullReinforcement_Explosive_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 25.4d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 9d),
                    new ItemEffectData(ItemEffect.KineticResistance, -6d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    HullReinforcement_Explosive_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 32.2d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 12d),
                    new ItemEffectData(ItemEffect.KineticResistance, -8d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -8d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.MERCURY, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Explosive_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 39d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 15d),
                    new ItemEffectData(ItemEffect.KineticResistance, -10d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -10d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.RUTHENIUM, 1)),

    HullReinforcement_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 2.9d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 24d),
                    new ItemEffectData(ItemEffect.KineticResistance, 2.9d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 2.9d)
            ),
            new CostData(Material.CARBON, 1)),

    HullReinforcement_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 5.9d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 36d),
                    new ItemEffectData(ItemEffect.KineticResistance, 5.9d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 5.9d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HullReinforcement_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 8.8d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 48d),
                    new ItemEffectData(ItemEffect.KineticResistance, 8.8d),
                    new ItemEffectData(ItemEffect.Mass, 24d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 8.8d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HullReinforcement_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 11.7d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 60d),
                    new ItemEffectData(ItemEffect.KineticResistance, 11.7d),
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 11.7d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 14.6d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 72d),
                    new ItemEffectData(ItemEffect.KineticResistance, 14.6d),
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 14.6d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Kinetic_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -2d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 3d),
                    new ItemEffectData(ItemEffect.KineticResistance, 11.7d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -2d)
            ),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Kinetic_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -4d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 6d),
                    new ItemEffectData(ItemEffect.KineticResistance, 18.5d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Kinetic_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 9d),
                    new ItemEffectData(ItemEffect.KineticResistance, 25.4d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -6d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Kinetic_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -8d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 12d),
                    new ItemEffectData(ItemEffect.KineticResistance, 32.2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -8d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Kinetic_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -10d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 15d),
                    new ItemEffectData(ItemEffect.KineticResistance, 29d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -10d)
            ),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    HullReinforcement_Thermic_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -2d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 3d),
                    new ItemEffectData(ItemEffect.KineticResistance, -2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 11.7d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    HullReinforcement_Thermic_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -4d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 6d),
                    new ItemEffectData(ItemEffect.KineticResistance, -4d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 18.5d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Thermic_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 9d),
                    new ItemEffectData(ItemEffect.KineticResistance, -6d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 25.4d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Thermic_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -8d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 12d),
                    new ItemEffectData(ItemEffect.KineticResistance, -8d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 32.2d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Thermic_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -10d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 15d),
                    new ItemEffectData(ItemEffect.KineticResistance, -10d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 39d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),

    KillWarrantScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    KillWarrantScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    KillWarrantScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    KillWarrantScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    KillWarrantScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    KillWarrantScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -10d),
                    new ItemEffectData(ItemEffect.Range, 24d)
            ),
            new CostData(Material.IRON, 1)),

    KillWarrantScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -15d),
                    new ItemEffectData(ItemEffect.Range, 48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    KillWarrantScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 30d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -20d),
                    new ItemEffectData(ItemEffect.Range, 72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    KillWarrantScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 40d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -25d),
                    new ItemEffectData(ItemEffect.Range, 96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    KillWarrantScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 50d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -30d),
                    new ItemEffectData(ItemEffect.Range, 120d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    KillWarrantScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    KillWarrantScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    KillWarrantScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    KillWarrantScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    KillWarrantScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    KillWarrantScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    LifeSupport_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    LifeSupport_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    LifeSupport_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    LifeSupport_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    LifeSupport_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    LifeSupport_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    LifeSupport_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    LifeSupport_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    LifeSupport_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    LifeSupport_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    PointDefence_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    PointDefence_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    PointDefence_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    PointDefence_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    PointDefence_PointDefenseCapacity_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 50d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.ReloadTime, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    PointDefence_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PointDefence_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    PointDefence_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    PointDefence_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PointDefence_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerDistributor_HighCapacity_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 10d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -2d),
                    new ItemEffectData(ItemEffect.Integrity, 10d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 10d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -2d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 10d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -2d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_HighCapacity_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 18d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -6d),
                    new ItemEffectData(ItemEffect.Integrity, 15d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 18d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -6d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 18d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -6d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighCapacity_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 26d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -10d),
                    new ItemEffectData(ItemEffect.Integrity, 20d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 26d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -10d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 26d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -10d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighCapacity_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 34d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -14d),
                    new ItemEffectData(ItemEffect.Integrity, 25d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 34d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -14d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 34d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -14d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SELENIUM, 1)),

    PowerDistributor_HighCapacity_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 42d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -18d),
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 42d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -18d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 42d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -18d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    PowerDistributor_HighFrequency_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -1d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 9d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -1d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 9d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -1d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 9d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighFrequency_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -2d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 18d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -2d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 18d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -2d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 18d)
            ),
            new CostData(Material.CHEMICALPROCESSORS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighFrequency_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -3d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 27d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -3d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 27d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -3d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 27d)
            ),
            new CostData(Material.CHEMICALDISTILLERY, 1),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    PowerDistributor_HighFrequency_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -4d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 36d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -4d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 36d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -4d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 36d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    PowerDistributor_HighFrequency_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -5d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 45d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -5d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 45d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -5d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 45d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),

    PowerDistributor_PriorityEngines_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 20d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 16d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -3d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -3d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -3d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -1d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityEngines_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 30d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 23d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -6d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -6d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -6d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -2d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityEngines_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 40d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 30d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -9d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -9d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -9d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -3d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PriorityEngines_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 50d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 37d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -12d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -12d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -12d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -4d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PriorityEngines_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, 60d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 44d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -15d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -15d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -15d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -5d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_PrioritySystems_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -3d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -1d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 20d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 16d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -3d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -3d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PrioritySystems_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -6d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -2d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 30d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 23d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -6d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -6d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PrioritySystems_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -9d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -3d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 40d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 30d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -9d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -9d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PrioritySystems_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -12d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -4d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 50d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 37d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -12d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -12d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PrioritySystems_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -15d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -5d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 60d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 44d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -15d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -15d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_PriorityWeapons_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -3d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -3d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -3d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -1d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 20d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 16d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityWeapons_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -6d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -6d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -6d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -2d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 30d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 23d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityWeapons_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -9d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -9d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -9d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -3d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 40d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 30d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PriorityWeapons_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -12d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -12d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -12d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -4d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 50d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 37d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PriorityWeapons_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EnginesCapacity, -15d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -15d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -15d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -5d),
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 60d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 44d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.Mass, 3d),
                    new ItemEffectData(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 80d),
                    new ItemEffectData(ItemEffect.Mass, 6d),
                    new ItemEffectData(ItemEffect.PowerDraw, -15d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 9d),
                    new ItemEffectData(ItemEffect.PowerDraw, -20d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 160d),
                    new ItemEffectData(ItemEffect.Mass, 12d),
                    new ItemEffectData(ItemEffect.PowerDraw, -25d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PowerDistributor_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 200d),
                    new ItemEffectData(ItemEffect.Mass, 15d),
                    new ItemEffectData(ItemEffect.PowerDraw, -30d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerPlant_Armoured_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -4d),
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 4d),
                    new ItemEffectData(ItemEffect.Mass, 4d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PowerPlant_Armoured_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -6d),
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 6d),
                    new ItemEffectData(ItemEffect.Mass, 8d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerPlant_Armoured_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -8d),
                    new ItemEffectData(ItemEffect.Integrity, 80d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 8d),
                    new ItemEffectData(ItemEffect.Mass, 12d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerPlant_Armoured_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -10d),
                    new ItemEffectData(ItemEffect.Integrity, 100d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 10d),
                    new ItemEffectData(ItemEffect.Mass, 16d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PowerPlant_Armoured_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -12d),
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 12d),
                    new ItemEffectData(ItemEffect.Mass, 20d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerPlant_Boosted_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, 5d),
                    new ItemEffectData(ItemEffect.Integrity, -5d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 12d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerPlant_Boosted_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, 10d),
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 19d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    PowerPlant_Boosted_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, 15d),
                    new ItemEffectData(ItemEffect.Integrity, -15d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 26d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.SELENIUM, 1)),

    PowerPlant_Boosted_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, 20d),
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 33d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    PowerPlant_Boosted_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, 25d),
                    new ItemEffectData(ItemEffect.Integrity, -25d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 40d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.TELLURIUM, 1)),

    PowerPlant_Stealth_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -25d),
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.PowerCapacity, -3d)
            ),
            new CostData(Material.IRON, 1)),

    PowerPlant_Stealth_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -35d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.PowerCapacity, -6d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1)),

    PowerPlant_Stealth_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -45d),
                    new ItemEffectData(ItemEffect.Mass, 12d),
                    new ItemEffectData(ItemEffect.PowerCapacity, -9d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1)),

    PowerPlant_Stealth_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -55d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.PowerCapacity, -12d)
            ),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    PowerPlant_Stealth_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.HeatEfficiency, -65d),
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.PowerCapacity, -15d)
            ),
            new CostData(Material.PROTOHEATRADIATORS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    ProspectingLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ProspectingLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ProspectingLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ProspectingLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ProspectingLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ProspectingLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    ProspectingLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ProspectingLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ProspectingLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ProspectingLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ProspectingLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Refineries_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    Refineries_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Refineries_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Refineries_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Sensor_CargoScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Range, -5d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Range, -10d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Range, -15d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -50d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Range, -20d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_CargoScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Range, -25d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -80d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_CargoScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -10d),
                    new ItemEffectData(ItemEffect.Range, 24d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_CargoScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -15d),
                    new ItemEffectData(ItemEffect.Range, 48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_CargoScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 30d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -20d),
                    new ItemEffectData(ItemEffect.Range, 72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_CargoScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 40d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -25d),
                    new ItemEffectData(ItemEffect.Range, 96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_CargoScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 50d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -30d),
                    new ItemEffectData(ItemEffect.Range, 120d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_CargoScanner_WideAngle_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 40d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideAngle_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 80d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 20d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideAngle_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 120d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 30d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideAngle_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 160d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 40d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_CargoScanner_WideAngle_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 200d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 50d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_KillWarrantScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Range, -5d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Range, -10d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Range, -15d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -50d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Range, -20d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_KillWarrantScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Range, -25d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -80d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_KillWarrantScanner_WideAngle_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 40d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideAngle_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 80d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 20d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideAngle_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 120d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 30d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideAngle_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 160d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 40d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_KillWarrantScanner_WideAngle_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 200d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 50d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -20d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -5d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -35d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -10d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Sensor_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -50d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -15d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Sensor_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -65d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -20d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Sensor_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -80d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -25d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    Sensor_LongRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -10d),
                    new ItemEffectData(ItemEffect.Range, 15d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_LongRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -15d),
                    new ItemEffectData(ItemEffect.Range, 30d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_LongRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -20d),
                    new ItemEffectData(ItemEffect.Range, 45d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_LongRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -25d),
                    new ItemEffectData(ItemEffect.Range, 60d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_LongRange_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, -30d),
                    new ItemEffectData(ItemEffect.Range, 75d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_WideAngle_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 40d),
                    new ItemEffectData(ItemEffect.Range, -4d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WideAngle_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 80d),
                    new ItemEffectData(ItemEffect.Range, -8d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WideAngle_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 30d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 120d),
                    new ItemEffectData(ItemEffect.Range, -12d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WideAngle_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 40d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 160d),
                    new ItemEffectData(ItemEffect.Range, -16d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_WideAngle_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 50d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 200d),
                    new ItemEffectData(ItemEffect.Range, -20d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_FastScan_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.DSS_RateMult, 20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_FastScan_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.DSS_RateMult, 35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_FastScan_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.DSS_RateMult, 50d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_FastScan_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.DSS_RateMult, 65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_FastScan_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.DSS_RateMult, 80d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_SurfaceScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Range, 40d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_SurfaceScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.Range, 80d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_SurfaceScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.Range, 120d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_SurfaceScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Range, 160d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_SurfaceScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.Range, 200d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_SurfaceScanner_WideAngle_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 40d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideAngle_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 80d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideAngle_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 120d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideAngle_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 160d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_SurfaceScanner_WideAngle_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.SensorTargetScanAngle, 200d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_WakeScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.ScannerRange, -5d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -20d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.ScannerRange, -10d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.ScannerRange, -15d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -50d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.ScannerRange, -20d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_WakeScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.ScannerRange, -25d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, -80d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_WakeScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.MaxAngle, -10d),
                    new ItemEffectData(ItemEffect.ScannerRange, 24d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_WakeScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 20d),
                    new ItemEffectData(ItemEffect.MaxAngle, -15d),
                    new ItemEffectData(ItemEffect.ScannerRange, 48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_WakeScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 30d),
                    new ItemEffectData(ItemEffect.MaxAngle, -20d),
                    new ItemEffectData(ItemEffect.ScannerRange, 72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_WakeScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 40d),
                    new ItemEffectData(ItemEffect.MaxAngle, -25d),
                    new ItemEffectData(ItemEffect.ScannerRange, 96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_WakeScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 50d),
                    new ItemEffectData(ItemEffect.MaxAngle, -30d),
                    new ItemEffectData(ItemEffect.ScannerRange, 120d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_WakeScanner_WideAngle_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.MaxAngle, 40d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideAngle_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.MaxAngle, 80d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 20d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideAngle_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.MaxAngle, 120d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 30d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideAngle_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.MaxAngle, 160d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 40d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_WakeScanner_WideAngle_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.MaxAngle, 200d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 50d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

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

    ShieldGenerator_Kinetic_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 20d),
                    new ItemEffectData(ItemEffect.KineticResistance, 6d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -4d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Kinetic_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 25d),
                    new ItemEffectData(ItemEffect.KineticResistance, 12d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -7d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    ShieldGenerator_Kinetic_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.KineticResistance, 18d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -11d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1)),

    ShieldGenerator_Kinetic_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 35d),
                    new ItemEffectData(ItemEffect.KineticResistance, 24d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -14d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.MERCURY, 1)),

    ShieldGenerator_Kinetic_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.KineticResistance, 30d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -18d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.RUTHENIUM, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldGenerator_Optimised_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -5d),
                    new ItemEffectData(ItemEffect.Mass, -18d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -2d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 4.5d),
                    new ItemEffectData(ItemEffect.PowerDraw, -20d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Optimised_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -26d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -3d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 9d),
                    new ItemEffectData(ItemEffect.PowerDraw, -25d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1)),

    ShieldGenerator_Optimised_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -15d),
                    new ItemEffectData(ItemEffect.Mass, -34d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -4d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 13.5d),
                    new ItemEffectData(ItemEffect.PowerDraw, -30d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1)),

    ShieldGenerator_Optimised_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -42d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -5d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 18d),
                    new ItemEffectData(ItemEffect.PowerDraw, -35d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    ShieldGenerator_Optimised_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -25d),
                    new ItemEffectData(ItemEffect.Mass, -50d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, -6d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 22.5d),
                    new ItemEffectData(ItemEffect.PowerDraw, -40d)
            ),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

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

    WakeScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -10d),
                    new ItemEffectData(ItemEffect.Mass, -45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    WakeScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -20d),
                    new ItemEffectData(ItemEffect.Mass, -55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    WakeScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -30d),
                    new ItemEffectData(ItemEffect.Mass, -65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    WakeScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -40d),
                    new ItemEffectData(ItemEffect.Mass, -75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    WakeScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -50d),
                    new ItemEffectData(ItemEffect.Mass, -85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    WakeScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.Mass, 30d)
            ),
            new CostData(Material.NICKEL, 1)),

    WakeScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.Mass, 60d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.Mass, 90d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    WakeScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.Mass, 120d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    WakeScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.Mass, 150d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    WakeScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 20d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    WakeScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 40d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 60d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 240d),
                    new ItemEffectData(ItemEffect.PowerDraw, 80d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    WakeScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 300d),
                    new ItemEffectData(ItemEffect.PowerDraw, 100d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ;

    private String parentBlueprintName;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;

    ModificationRecipe(ItemGrade grade, ItemEffects effects, CostData... cost)
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
