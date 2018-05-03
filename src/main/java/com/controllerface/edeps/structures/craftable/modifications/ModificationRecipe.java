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
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    AFM_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    AFM_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    AFM_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Advanced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.042d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -0.01d),
                    new Pair<>(ItemEffect.KineticResistance, 0.036d),
                    new Pair<>(ItemEffect.Mass, -0.15d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.03d)
            ),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.084d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -0.02d),
                    new Pair<>(ItemEffect.KineticResistance, 0.072d),
                    new Pair<>(ItemEffect.Mass, -0.25d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.06d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.126d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -0.03d),
                    new Pair<>(ItemEffect.KineticResistance, 0.108d),
                    new Pair<>(ItemEffect.Mass, -0.35d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.09d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.IRON, 1)),

    Armour_Advanced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.168d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -0.04d),
                    new Pair<>(ItemEffect.KineticResistance, 0.144d),
                    new Pair<>(ItemEffect.Mass, -0.45d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.12d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Armour_Advanced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.21d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, -0.05d),
                    new Pair<>(ItemEffect.KineticResistance, 0.18d),
                    new Pair<>(ItemEffect.Mass, -0.55d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.15d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1)),

    Armour_Explosive_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.168d),
                    new Pair<>(ItemEffect.KineticResistance, -0.05d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.04d)
            ),
            new CostData(Material.NICKEL, 1)),

    Armour_Explosive_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.266d),
                    new Pair<>(ItemEffect.KineticResistance, -0.07d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.06d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1)),

    Armour_Explosive_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.364d),
                    new Pair<>(ItemEffect.KineticResistance, -0.1d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.08d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Explosive_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.462d),
                    new Pair<>(ItemEffect.KineticResistance, -0.12d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.1d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.MERCURY, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Explosive_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.56d),
                    new Pair<>(ItemEffect.KineticResistance, -0.14d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.12d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.RUTHENIUM, 1)),

    Armour_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.014d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 0.12d),
                    new Pair<>(ItemEffect.KineticResistance, 0.012d),
                    new Pair<>(ItemEffect.Mass, 0.1d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.01d)
            ),
            new CostData(Material.CARBON, 1)),

    Armour_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.028d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 0.17d),
                    new Pair<>(ItemEffect.KineticResistance, 0.024d),
                    new Pair<>(ItemEffect.Mass, 0.15d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.02d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Armour_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.042d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 0.22d),
                    new Pair<>(ItemEffect.KineticResistance, 0.036d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.03d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Armour_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.056d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 0.27d),
                    new Pair<>(ItemEffect.KineticResistance, 0.048d),
                    new Pair<>(ItemEffect.Mass, 0.25d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.04d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.07d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 0.32d),
                    new Pair<>(ItemEffect.KineticResistance, 0.06d),
                    new Pair<>(ItemEffect.Mass, 0.3d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.05d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Kinetic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.06d),
                    new Pair<>(ItemEffect.KineticResistance, 0.144d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.04d)
            ),
            new CostData(Material.NICKEL, 1)),

    Armour_Kinetic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.08d),
                    new Pair<>(ItemEffect.KineticResistance, 0.228d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.06d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Kinetic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.11d),
                    new Pair<>(ItemEffect.KineticResistance, 0.312d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.08d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Kinetic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.14d),
                    new Pair<>(ItemEffect.KineticResistance, 0.396d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.1d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Kinetic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.17d),
                    new Pair<>(ItemEffect.KineticResistance, 0.48d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.12d)
            ),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    Armour_Thermic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.06d),
                    new Pair<>(ItemEffect.KineticResistance, -0.05d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.12d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    Armour_Thermic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.08d),
                    new Pair<>(ItemEffect.KineticResistance, -0.07d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.19d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.NICKEL, 1)),

    Armour_Thermic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.11d),
                    new Pair<>(ItemEffect.KineticResistance, -0.1d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.26d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    Armour_Thermic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.14d),
                    new Pair<>(ItemEffect.KineticResistance, -0.12d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.33d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Armour_Thermic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.17d),
                    new Pair<>(ItemEffect.KineticResistance, -0.14d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.4d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),

    CargoScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    CargoScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CargoScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CargoScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    CargoScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    CargoScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    CargoScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CargoScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    CargoScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    CargoScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    CargoScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CargoScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    CargoScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ChaffLauncher_ChaffCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 0.5d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.ReloadTime, 0.1d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    ChaffLauncher_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ChaffLauncher_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ChaffLauncher_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ChaffLauncher_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ChaffLauncher_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ChaffLauncher_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    ChaffLauncher_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ChaffLauncher_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ChaffLauncher_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ChaffLauncher_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ChaffLauncher_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ChaffLauncher_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CollectionLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    CollectionLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CollectionLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    CollectionLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    CollectionLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    CollectionLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    CollectionLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    CollectionLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    CollectionLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    CollectionLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    CollectionLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    CollectionLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    DefenceModifierShieldAdditioner_Explosive_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.07d),
                    new Pair<>(ItemEffect.KineticResistance, -0.01d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.01d)
            ),
            new CostData(Material.IRON, 1)),

    DefenceModifierShieldAdditioner_Explosive_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.12d),
                    new Pair<>(ItemEffect.KineticResistance, -0.02d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.02d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    DefenceModifierShieldAdditioner_Explosive_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.17d),
                    new Pair<>(ItemEffect.KineticResistance, -0.03d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.03d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.IRON, 1)),

    DefenceModifierShieldAdditioner_Explosive_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.22d),
                    new Pair<>(ItemEffect.KineticResistance, -0.04d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.04d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    DefenceModifierShieldAdditioner_Explosive_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.27d),
                    new Pair<>(ItemEffect.KineticResistance, -0.05d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.05d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.NIOBIUM, 1)),

    DefenceModifierShieldAdditioner_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.03d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.PowerDraw, 0.05d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 0.12d)
            ),
            new CostData(Material.GRIDRESISTORS, 1)),

    DefenceModifierShieldAdditioner_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.06d),
                    new Pair<>(ItemEffect.Mass, 1.5d),
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 0.204d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    DefenceModifierShieldAdditioner_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.09d),
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.15d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 0.288d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.NIOBIUM, 1)),

    DefenceModifierShieldAdditioner_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.12d),
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 0.372d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.TIN, 1)),

    DefenceModifierShieldAdditioner_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.15d),
                    new Pair<>(ItemEffect.Mass, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 0.25d),
                    new Pair<>(ItemEffect.DefenceModifierShieldAddition, 0.456d)
            ),
            new CostData(Material.ANTIMONY, 1),
            new CostData(Material.POLYMERCAPACITORS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    DefenceModifierShieldAdditioner_Kinetic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.01d),
                    new Pair<>(ItemEffect.KineticResistance, 0.07d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.01d)
            ),
            new CostData(Material.IRON, 1)),

    DefenceModifierShieldAdditioner_Kinetic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.02d),
                    new Pair<>(ItemEffect.KineticResistance, 0.12d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.02d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    DefenceModifierShieldAdditioner_Kinetic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.03d),
                    new Pair<>(ItemEffect.KineticResistance, 0.17d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.03d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    DefenceModifierShieldAdditioner_Kinetic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.04d),
                    new Pair<>(ItemEffect.KineticResistance, 0.22d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.04d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    DefenceModifierShieldAdditioner_Kinetic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.05d),
                    new Pair<>(ItemEffect.KineticResistance, 0.27d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.05d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    DefenceModifierShieldAdditioner_Resistive_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.05d),
                    new Pair<>(ItemEffect.Integrity, -0.04d),
                    new Pair<>(ItemEffect.KineticResistance, 0.05d),
                    new Pair<>(ItemEffect.PowerDraw, 0.05d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.05d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    DefenceModifierShieldAdditioner_Resistive_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.08d),
                    new Pair<>(ItemEffect.Integrity, -0.06d),
                    new Pair<>(ItemEffect.KineticResistance, 0.08d),
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.08d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    DefenceModifierShieldAdditioner_Resistive_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.11d),
                    new Pair<>(ItemEffect.Integrity, -0.08d),
                    new Pair<>(ItemEffect.KineticResistance, 0.11d),
                    new Pair<>(ItemEffect.PowerDraw, 0.15d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.11d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    DefenceModifierShieldAdditioner_Resistive_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.14d),
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.KineticResistance, 0.14d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.14d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    DefenceModifierShieldAdditioner_Resistive_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.17d),
                    new Pair<>(ItemEffect.Integrity, -0.12d),
                    new Pair<>(ItemEffect.KineticResistance, 0.17d),
                    new Pair<>(ItemEffect.PowerDraw, 0.25d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.17d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    DefenceModifierShieldAdditioner_Thermic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.01d),
                    new Pair<>(ItemEffect.KineticResistance, -0.01d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.07d)
            ),
            new CostData(Material.IRON, 1)),

    DefenceModifierShieldAdditioner_Thermic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.02d),
                    new Pair<>(ItemEffect.KineticResistance, -0.02d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.12d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    DefenceModifierShieldAdditioner_Thermic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.03d),
                    new Pair<>(ItemEffect.KineticResistance, -0.03d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.17d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    DefenceModifierShieldAdditioner_Thermic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.04d),
                    new Pair<>(ItemEffect.KineticResistance, -0.04d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.22d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    DefenceModifierShieldAdditioner_Thermic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.05d),
                    new Pair<>(ItemEffect.KineticResistance, -0.05d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.27d)
            ),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
            new CostData(Material.HEATEXCHANGERS, 1)),

    ECM_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ECM_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ECM_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ECM_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ECM_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ECM_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    ECM_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ECM_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ECM_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ECM_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ECM_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ECM_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ECM_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Engine_Dirty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.03d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.03d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.12d),
                    new Pair<>(ItemEffect.PowerDraw, 0.04d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.2d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.06d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.05d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.19d),
                    new Pair<>(ItemEffect.PowerDraw, 0.06d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.3d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.09d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.08d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.26d),
                    new Pair<>(ItemEffect.PowerDraw, 0.08d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.4d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Dirty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.12d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.1d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.33d),
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.5d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1)),

    Engine_Dirty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.15d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.13d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.12d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.6d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.PHARMACEUTICALISOLATORS, 1)),

    Engine_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.3d),
                    new Pair<>(ItemEffect.Mass, 0.05d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.1d)
            ),
            new CostData(Material.CARBON, 1)),

    Engine_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.5d),
                    new Pair<>(ItemEffect.Mass, 0.1d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.2d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.VANADIUM, 1)),

    Engine_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.7d),
                    new Pair<>(ItemEffect.Mass, 0.15d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.3d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Engine_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.9d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.4d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1)),

    Engine_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.1d),
                    new Pair<>(ItemEffect.Mass, 0.25d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.5d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Engine_Tuned_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.02d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.08d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.2d)
            ),
            new CostData(Material.SULPHUR, 1)),

    Engine_Tuned_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.04d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.04d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.13d),
                    new Pair<>(ItemEffect.PowerDraw, 0.04d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.3d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    Engine_Tuned_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.08d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.06d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.18d),
                    new Pair<>(ItemEffect.PowerDraw, 0.08d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.4d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Engine_Tuned_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.12d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.08d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.23d),
                    new Pair<>(ItemEffect.PowerDraw, 0.12d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.5d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    Engine_Tuned_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.16d),
                    new Pair<>(ItemEffect.EngineOptimalMass, -0.1d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 0.28d),
                    new Pair<>(ItemEffect.PowerDraw, 0.16d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.6d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.TIN, 1)),

    FSD_FastBoot_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -0.2d),
                    new Pair<>(ItemEffect.Integrity, -0.03d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.03d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.04d)
            ),
            new CostData(Material.GRIDRESISTORS, 1)),

    FSD_FastBoot_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -0.35d),
                    new Pair<>(ItemEffect.Integrity, -0.06d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.06d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.08d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    FSD_FastBoot_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -0.5d),
                    new Pair<>(ItemEffect.Integrity, -0.09d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.09d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.12d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.SELENIUM, 1)),

    FSD_FastBoot_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -0.65d),
                    new Pair<>(ItemEffect.Integrity, -0.12d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.12d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.16d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    FSD_FastBoot_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -0.8d),
                    new Pair<>(ItemEffect.Integrity, -0.15d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.15d),
                    new Pair<>(ItemEffect.ThermalLoad, 0.2d)
            ),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TELLURIUM, 1)),

    FSD_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.03d),
                    new Pair<>(ItemEffect.Mass, 0.1d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.15d),
                    new Pair<>(ItemEffect.PowerDraw, 0.03d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1)),

    FSD_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.06d),
                    new Pair<>(ItemEffect.Mass, 0.15d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.25d),
                    new Pair<>(ItemEffect.PowerDraw, 0.06d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1),
            new CostData(Material.CHEMICALPROCESSORS, 1)),

    FSD_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.09d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.35d),
                    new Pair<>(ItemEffect.PowerDraw, 0.09d)
            ),
            new CostData(Material.CHEMICALPROCESSORS, 1),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.WAKESOLUTIONS, 1)),

    FSD_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.12d),
                    new Pair<>(ItemEffect.Mass, 0.25d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.45d),
                    new Pair<>(ItemEffect.PowerDraw, 0.12d)
            ),
            new CostData(Material.CHEMICALDISTILLERY, 1),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1),
            new CostData(Material.MANGANESE, 1)),

    FSD_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.15d),
                    new Pair<>(ItemEffect.Mass, 0.3d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.55d),
                    new Pair<>(ItemEffect.PowerDraw, 0.15d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.DATAMINEDWAKE, 1)),

    FSD_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.25d),
                    new Pair<>(ItemEffect.Mass, 0.04d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.03d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.1d)
            ),
            new CostData(Material.NICKEL, 1)),

    FSD_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.5d),
                    new Pair<>(ItemEffect.Mass, 0.08d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.06d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.15d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FSD_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.75d),
                    new Pair<>(ItemEffect.Mass, 0.12d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.09d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.2d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.ZINC, 1)),

    FSD_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1d),
                    new Pair<>(ItemEffect.Mass, 0.16d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.12d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.25d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.VANADIUM, 1)),

    FSD_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.25d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 0.15d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.3d)
            ),
            new CostData(Material.IMPERIALSHIELDING, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    FSDinterdictor_Expanded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 0.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.Range, 0.1d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    FSDinterdictor_Expanded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.Range, -0.15d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.ENCRYPTEDFILES, 1)),

    FSDinterdictor_Expanded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 0.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.Range, -0.2d)
            ),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.ENCRYPTIONCODES, 1)),

    FSDinterdictor_Expanded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 1d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.Range, -0.25d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.WAKESOLUTIONS, 1)),

    FSDinterdictor_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -0.01d),
                    new Pair<>(ItemEffect.Mass, 0.1d),
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.Range, 0.2d)
            ),
            new CostData(Material.ENCRYPTEDFILES, 1)),

    FSDinterdictor_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -0.15d),
                    new Pair<>(ItemEffect.Mass, 0.15d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.Range, 0.3d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 1),
            new CostData(Material.ENCRYPTIONCODES, 1)),

    FSDinterdictor_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -0.2d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.Range, 0.4d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.FSDTELEMETRY, 1),
            new CostData(Material.SYMMETRICKEYS, 1)),

    FSDinterdictor_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, -0.25d),
                    new Pair<>(ItemEffect.Mass, 0.25d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.Range, 0.5d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.WAKESOLUTIONS, 1),
            new CostData(Material.ENCRYPTIONARCHIVES, 1)),

    FuelScoop_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    FuelScoop_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelScoop_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelScoop_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    FuelTransferLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    FuelTransferLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    FuelTransferLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    FuelTransferLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    FuelTransferLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    FuelTransferLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    FuelTransferLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    FuelTransferLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    FuelTransferLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    FuelTransferLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    FuelTransferLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    FuelTransferLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HatchBreakerLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    HatchBreakerLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    HatchBreakerLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    HatchBreakerLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    HatchBreakerLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HatchBreakerLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    HatchBreakerLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    HatchBreakerLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HatchBreakerLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HatchBreakerLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HeatSinkLauncher_HeatSinkCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 0.5d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.ReloadTime, 0.5d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    HeatSinkLauncher_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    HeatSinkLauncher_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HeatSinkLauncher_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    HeatSinkLauncher_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    HeatSinkLauncher_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    HeatSinkLauncher_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    HeatSinkLauncher_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HeatSinkLauncher_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    HeatSinkLauncher_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    HeatSinkLauncher_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HeatSinkLauncher_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HeatSinkLauncher_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Advanced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -0.04d),
                    new Pair<>(ItemEffect.Mass, -0.08d)
            ),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -0.08d),
                    new Pair<>(ItemEffect.Mass, -0.12d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -0.12d),
                    new Pair<>(ItemEffect.Mass, -0.16d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.IRON, 1)),

    HullReinforcement_Advanced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -0.16d),
                    new Pair<>(ItemEffect.Mass, -0.2d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    HullReinforcement_Advanced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.24d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1)),

    HullReinforcement_Explosive_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.117d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.03d),
                    new Pair<>(ItemEffect.KineticResistance, -0.02d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.02d)
            ),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Explosive_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.185d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.06d),
                    new Pair<>(ItemEffect.KineticResistance, -0.04d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.04d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.ZINC, 1)),

    HullReinforcement_Explosive_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.254d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.09d),
                    new Pair<>(ItemEffect.KineticResistance, -0.06d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.06d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    HullReinforcement_Explosive_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.322d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.12d),
                    new Pair<>(ItemEffect.KineticResistance, -0.08d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.08d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.MERCURY, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Explosive_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.39d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.15d),
                    new Pair<>(ItemEffect.KineticResistance, -0.1d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.1d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.RUTHENIUM, 1)),

    HullReinforcement_HeavyDuty_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.029d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.24d),
                    new Pair<>(ItemEffect.KineticResistance, 0.029d),
                    new Pair<>(ItemEffect.Mass, 0.08d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.029d)
            ),
            new CostData(Material.CARBON, 1)),

    HullReinforcement_HeavyDuty_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.059d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.36d),
                    new Pair<>(ItemEffect.KineticResistance, 0.059d),
                    new Pair<>(ItemEffect.Mass, 0.16d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.059d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HullReinforcement_HeavyDuty_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.088d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.48d),
                    new Pair<>(ItemEffect.KineticResistance, 0.088d),
                    new Pair<>(ItemEffect.Mass, 0.24d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.088d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    HullReinforcement_HeavyDuty_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.117d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.6d),
                    new Pair<>(ItemEffect.KineticResistance, 0.117d),
                    new Pair<>(ItemEffect.Mass, 0.32d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.117d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_HeavyDuty_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.146d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.72d),
                    new Pair<>(ItemEffect.KineticResistance, 0.146d),
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.146d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Kinetic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.02d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.03d),
                    new Pair<>(ItemEffect.KineticResistance, 0.117d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.02d)
            ),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Kinetic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.04d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.06d),
                    new Pair<>(ItemEffect.KineticResistance, 0.185d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.04d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Kinetic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.06d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.09d),
                    new Pair<>(ItemEffect.KineticResistance, 0.254d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.06d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Kinetic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.08d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.12d),
                    new Pair<>(ItemEffect.KineticResistance, 0.322d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.08d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Kinetic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.1d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.15d),
                    new Pair<>(ItemEffect.KineticResistance, 0.29d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.1d)
            ),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1)),

    HullReinforcement_Thermic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.02d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.03d),
                    new Pair<>(ItemEffect.KineticResistance, -0.02d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.117d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    HullReinforcement_Thermic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.04d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.06d),
                    new Pair<>(ItemEffect.KineticResistance, -0.04d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.185d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 1),
            new CostData(Material.NICKEL, 1)),

    HullReinforcement_Thermic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.06d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.09d),
                    new Pair<>(ItemEffect.KineticResistance, -0.06d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.254d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.SALVAGEDALLOYS, 1),
            new CostData(Material.VANADIUM, 1)),

    HullReinforcement_Thermic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.08d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.12d),
                    new Pair<>(ItemEffect.KineticResistance, -0.08d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.322d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 1),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    HullReinforcement_Thermic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.ExplosiveResistance, -0.1d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 0.15d),
                    new Pair<>(ItemEffect.KineticResistance, -0.1d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.39d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOHEATRADIATORS, 1)),

    KillWarrantScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    KillWarrantScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    KillWarrantScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    KillWarrantScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    KillWarrantScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    KillWarrantScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.1d),
                    new Pair<>(ItemEffect.Range, 0.24d)
            ),
            new CostData(Material.IRON, 1)),

    KillWarrantScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.15d),
                    new Pair<>(ItemEffect.Range, 0.48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    KillWarrantScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.2d),
                    new Pair<>(ItemEffect.Range, 0.72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    KillWarrantScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.25d),
                    new Pair<>(ItemEffect.Range, 0.96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    KillWarrantScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.3d),
                    new Pair<>(ItemEffect.Range, 1.2d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    KillWarrantScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    KillWarrantScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    KillWarrantScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    KillWarrantScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    KillWarrantScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    KillWarrantScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    KillWarrantScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    LifeSupport_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    LifeSupport_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    LifeSupport_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    LifeSupport_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    LifeSupport_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    LifeSupport_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    LifeSupport_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    LifeSupport_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    LifeSupport_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    LifeSupport_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    LifeSupport_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    PointDefence_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    PointDefence_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    PointDefence_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    PointDefence_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    PointDefence_PointDefenseCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.AmmoMaximum, 0.5d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.ReloadTime, 0.1d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    PointDefence_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PointDefence_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    PointDefence_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    PointDefence_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PointDefence_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PointDefence_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PointDefence_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerDistributor_HighCapacity_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.1d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.02d),
                    new Pair<>(ItemEffect.Integrity, 0.1d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.1d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.02d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.1d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.02d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_HighCapacity_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.18d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.06d),
                    new Pair<>(ItemEffect.Integrity, 0.18d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.1d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.06d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.18d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.06d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighCapacity_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.26d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.1d),
                    new Pair<>(ItemEffect.Integrity, 0.2d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.26d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.1d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.26d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.1d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighCapacity_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.34d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.14d),
                    new Pair<>(ItemEffect.Integrity, 0.25d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.34d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.14d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.34d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.14d)
            ),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SELENIUM, 1)),

    PowerDistributor_HighCapacity_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.42d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.18d),
                    new Pair<>(ItemEffect.Integrity, 0.3d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.42d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.18d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.42d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.18d)
            ),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    PowerDistributor_HighFrequency_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.01d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.09d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.01d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.09d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.01d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.09d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighFrequency_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.02d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.18d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.02d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.18d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.02d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.18d)
            ),
            new CostData(Material.CHEMICALPROCESSORS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    PowerDistributor_HighFrequency_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.03d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.27d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.03d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.27d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.03d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.27d)
            ),
            new CostData(Material.CHEMICALDISTILLERY, 1),
            new CostData(Material.GRIDRESISTORS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    PowerDistributor_HighFrequency_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.04d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.36d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.04d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.36d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.04d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.36d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.HYBRIDCAPACITORS, 1)),

    PowerDistributor_HighFrequency_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.05d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.45d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.05d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.45d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.05d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.45d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1)),

    PowerDistributor_PriorityEngines_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.2d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.16d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.03d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.03d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.03d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.01d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityEngines_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.3d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.23d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.06d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.06d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.06d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.02d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityEngines_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.4d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.3d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.09d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.09d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.09d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.03d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PriorityEngines_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.5d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.37d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.12d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.12d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.04d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PriorityEngines_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, 0.6d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.44d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.15d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.15d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.15d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.05d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_PrioritySystems_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.03d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.01d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.2d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.16d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.03d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.03d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PrioritySystems_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.06d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.02d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.3d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.23d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.06d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.06d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PrioritySystems_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.09d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.03d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.4d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.3d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.09d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.09d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PrioritySystems_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.12d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.04d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.5d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.37d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.12d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PrioritySystems_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.15d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.05d),
                    new Pair<>(ItemEffect.SystemsCapacity, 0.6d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.44d),
                    new Pair<>(ItemEffect.WeaponsCapacity, -0.15d),
                    new Pair<>(ItemEffect.WeaponsRecharge, -0.15d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_PriorityWeapons_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.03d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.03d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.03d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.01d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.2d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.16d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityWeapons_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.06d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.06d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.06d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.02d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.3d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.23d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.SULPHUR, 1)),

    PowerDistributor_PriorityWeapons_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.09d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.09d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.09d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.03d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.4d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.3d)
            ),
            new CostData(Material.BULKSCANDATA, 1),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1)),

    PowerDistributor_PriorityWeapons_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.12d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.12d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.12d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.04d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.5d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.37d)
            ),
            new CostData(Material.SCANARCHIVES, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    PowerDistributor_PriorityWeapons_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.EnginesCapacity, -0.15d),
                    new Pair<>(ItemEffect.EnginesRecharge, -0.15d),
                    new Pair<>(ItemEffect.SystemsCapacity, -0.15d),
                    new Pair<>(ItemEffect.SystemsRecharge, -0.05d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 0.6d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 0.44d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.MILITARYSUPERCAPACITORS, 1)),

    PowerDistributor_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.4d),
                    new Pair<>(ItemEffect.Mass, 0.03d),
                    new Pair<>(ItemEffect.PowerDraw, -0.1d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.8d),
                    new Pair<>(ItemEffect.Mass, 0.06d),
                    new Pair<>(ItemEffect.PowerDraw, -0.15d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.09d),
                    new Pair<>(ItemEffect.PowerDraw, -0.2d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerDistributor_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.6d),
                    new Pair<>(ItemEffect.Mass, 0.12d),
                    new Pair<>(ItemEffect.PowerDraw, -0.25d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PowerDistributor_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2d),
                    new Pair<>(ItemEffect.Mass, 0.15d),
                    new Pair<>(ItemEffect.PowerDraw, -0.3d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerPlant_Armoured_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.04d),
                    new Pair<>(ItemEffect.Integrity, 0.4d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.04d),
                    new Pair<>(ItemEffect.Mass, 0.04d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    PowerPlant_Armoured_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.06d),
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.06d),
                    new Pair<>(ItemEffect.Mass, 0.08d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerPlant_Armoured_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.08d),
                    new Pair<>(ItemEffect.Integrity, 0.8d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.08d),
                    new Pair<>(ItemEffect.Mass, 0.12d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    PowerPlant_Armoured_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.1d),
                    new Pair<>(ItemEffect.Integrity, 1d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.1d),
                    new Pair<>(ItemEffect.Mass, 0.16d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    PowerPlant_Armoured_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.12d),
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.12d),
                    new Pair<>(ItemEffect.Mass, 0.2d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    PowerPlant_Boosted_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 0.05d),
                    new Pair<>(ItemEffect.Integrity, -0.05d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.12d)
            ),
            new CostData(Material.SULPHUR, 1)),

    PowerPlant_Boosted_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 0.1d),
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.19d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1)),

    PowerPlant_Boosted_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 0.15d),
                    new Pair<>(ItemEffect.Integrity, -0.15d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.19d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.HEATCONDUCTIONWIRING, 1),
            new CostData(Material.SELENIUM, 1)),

    PowerPlant_Boosted_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 0.2d),
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.33d)
            ),
            new CostData(Material.CADMIUM, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.HEATDISPERSIONPLATE, 1)),

    PowerPlant_Boosted_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, 0.25d),
                    new Pair<>(ItemEffect.Integrity, -0.25d),
                    new Pair<>(ItemEffect.PowerCapacity, 0.4d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 1),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.TELLURIUM, 1)),

    PowerPlant_Stealth_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.25d),
                    new Pair<>(ItemEffect.Mass, 0.04d),
                    new Pair<>(ItemEffect.PowerCapacity, -0.03d)
            ),
            new CostData(Material.IRON, 1)),

    PowerPlant_Stealth_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.35d),
                    new Pair<>(ItemEffect.Mass, 0.08d),
                    new Pair<>(ItemEffect.PowerCapacity, -0.06d)
            ),
            new CostData(Material.IRON, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1)),

    PowerPlant_Stealth_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.45d),
                    new Pair<>(ItemEffect.Mass, 0.12d),
                    new Pair<>(ItemEffect.PowerCapacity, -0.09d)
            ),
            new CostData(Material.HEATEXCHANGERS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 1)),

    PowerPlant_Stealth_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.55d),
                    new Pair<>(ItemEffect.Mass, 0.16d),
                    new Pair<>(ItemEffect.PowerCapacity, -0.12d)
            ),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    PowerPlant_Stealth_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.HeatEfficiency, -0.65d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.PowerCapacity, -0.15d)
            ),
            new CostData(Material.PROTOHEATRADIATORS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    ProspectingLimpet_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ProspectingLimpet_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ProspectingLimpet_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    ProspectingLimpet_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    ProspectingLimpet_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    ProspectingLimpet_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    ProspectingLimpet_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    ProspectingLimpet_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    ProspectingLimpet_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    ProspectingLimpet_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    ProspectingLimpet_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    ProspectingLimpet_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
            ),
            new CostData(Material.COMPOUNDSHIELDING, 1),
            new CostData(Material.FEDCORECOMPOSITES, 1),
            new CostData(Material.TUNGSTEN, 1)),

    Refineries_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    Refineries_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Refineries_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    Refineries_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    Sensor_CargoScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Range, -0.05d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.2d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Range, -0.1d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Range, -0.15d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.5d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_CargoScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Range, -0.2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_CargoScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Range, -0.25d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.8d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_CargoScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.1d),
                    new Pair<>(ItemEffect.Range, 0.24d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_CargoScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.15d),
                    new Pair<>(ItemEffect.Range, 0.48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_CargoScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.2d),
                    new Pair<>(ItemEffect.Range, 0.72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_CargoScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.25d),
                    new Pair<>(ItemEffect.Range, 0.96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_CargoScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.3d),
                    new Pair<>(ItemEffect.Range, 1.2d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_CargoScanner_WideSensorTargetScanAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.4d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.1d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideSensorTargetScanAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.8d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.2d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideSensorTargetScanAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.3d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_CargoScanner_WideSensorTargetScanAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.8d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.6d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.4d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_CargoScanner_WideSensorTargetScanAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.5d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_KillWarrantScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Range, -0.05d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.2d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Range, -0.1d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Range, -0.15d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.5d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_KillWarrantScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Range, -0.2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_KillWarrantScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Range, -0.25d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.8d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_KillWarrantScanner_WideSensorTargetScanAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.4d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.1d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideSensorTargetScanAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.8d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.2d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideSensorTargetScanAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.3d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_KillWarrantScanner_WideSensorTargetScanAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.8d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.6d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.4d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_KillWarrantScanner_WideSensorTargetScanAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.5d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_Sensor_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.05d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_Sensor_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.35d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.1d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Sensor_Sensor_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.15d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    Sensor_Sensor_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.65d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.2d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    Sensor_Sensor_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.8d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.25d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    Sensor_Sensor_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.1d),
                    new Pair<>(ItemEffect.Range, 0.15d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_Sensor_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.15d),
                    new Pair<>(ItemEffect.Range, 0.3d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_Sensor_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.2d),
                    new Pair<>(ItemEffect.Range, 0.45d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_Sensor_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.8d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.25d),
                    new Pair<>(ItemEffect.Range, 0.6d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_Sensor_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.3d),
                    new Pair<>(ItemEffect.Range, 0.75d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_Sensor_WideSensorTargetScanAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.4d),
                    new Pair<>(ItemEffect.Range, -0.04d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Sensor_WideSensorTargetScanAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.8d),
                    new Pair<>(ItemEffect.Range, -0.08d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Sensor_WideSensorTargetScanAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.2d),
                    new Pair<>(ItemEffect.Range, -0.12d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Sensor_WideSensorTargetScanAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.6d),
                    new Pair<>(ItemEffect.Range, -0.16d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_Sensor_WideSensorTargetScanAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 2d),
                    new Pair<>(ItemEffect.Range, -0.2d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_SurfaceScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.DSS_RateMult, 0.2d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_SurfaceScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.DSS_RateMult, 0.35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_SurfaceScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.DSS_RateMult, 0.5d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_SurfaceScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.8d),
                    new Pair<>(ItemEffect.DSS_RateMult, 0.65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_SurfaceScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.DSS_RateMult, 0.8d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_SurfaceScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.Range, 0.4d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_SurfaceScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.Range, 0.8d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_SurfaceScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.Range, 1.2d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_SurfaceScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.8d),
                    new Pair<>(ItemEffect.Range, 1.6d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_SurfaceScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Range, 2d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_SurfaceScanner_WideSensorTargetScanAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.4d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideSensorTargetScanAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.8d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideSensorTargetScanAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.2d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_SurfaceScanner_WideSensorTargetScanAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.8d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.6d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_SurfaceScanner_WideSensorTargetScanAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 2d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    Sensor_WakeScanner_FastScan_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Range, -0.05d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.2d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Range, -0.1d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.35d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Range, -0.15d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.5d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 1),
            new CostData(Material.SYMMETRICKEYS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    Sensor_WakeScanner_FastScan_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Range, -0.2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.65d)
            ),
            new CostData(Material.ENCRYPTIONARCHIVES, 1),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.MANGANESE, 1)),

    Sensor_WakeScanner_FastScan_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Range, -0.25d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, -0.8d)
            ),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1)),

    Sensor_WakeScanner_LongRange_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.1d),
                    new Pair<>(ItemEffect.Range, 0.24d)
            ),
            new CostData(Material.IRON, 1)),

    Sensor_WakeScanner_LongRange_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.15d),
                    new Pair<>(ItemEffect.Range, 0.48d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1)),

    Sensor_WakeScanner_LongRange_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.2d),
                    new Pair<>(ItemEffect.Range, 0.72d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.IRON, 1),
            new CostData(Material.EMISSIONDATA, 1)),

    Sensor_WakeScanner_LongRange_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.25d),
                    new Pair<>(ItemEffect.Range, 0.96d)
            ),
            new CostData(Material.DECODEDEMISSIONDATA, 1),
            new CostData(Material.ELECTROCHEMICALARRAYS, 1),
            new CostData(Material.GERMANIUM, 1)),

    Sensor_WakeScanner_LongRange_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, -0.3d),
                    new Pair<>(ItemEffect.Range, 1.2d)
            ),
            new CostData(Material.COMPACTEMISSIONSDATA, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    Sensor_WakeScanner_WideSensorTargetScanAngle_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.4d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.1d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideSensorTargetScanAngle_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.4d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 0.8d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.2d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideSensorTargetScanAngle_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.6d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.3d)
            ),
            new CostData(Material.SCANDATABANKS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_WakeScanner_WideSensorTargetScanAngle_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 0.8d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 1.6d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.4d)
            ),
            new CostData(Material.ENCODEDSCANDATA, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_WakeScanner_WideSensorTargetScanAngle_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 2d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 0.5d)
            ),
            new CostData(Material.CLASSIFIEDSCANDATA, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),

    ShieldCellBank_Rapid_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, 0.1d),
                    new Pair<>(ItemEffect.ShieldBankDuration, -0.06d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 0.05d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -0.1d)
            ),
            new CostData(Material.SULPHUR, 1)),

    ShieldCellBank_Rapid_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, 0.15d),
                    new Pair<>(ItemEffect.ShieldBankDuration, -0.12d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 0.1d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -0.2d)
            ),
            new CostData(Material.CHROMIUM, 1),
            new CostData(Material.GRIDRESISTORS, 1)),

    ShieldCellBank_Rapid_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, 0.2d),
                    new Pair<>(ItemEffect.ShieldBankDuration, -0.18d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 0.15d),
                    new Pair<>(ItemEffect.ShieldBankSpinUp, -0.3d)
            ),
            new CostData(Material.HYBRIDCAPACITORS, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1),
            new CostData(Material.SULPHUR, 1)),

    ShieldCellBank_Specialised_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -0.08d),
                    new Pair<>(ItemEffect.Integrity, -0.05d),
                    new Pair<>(ItemEffect.PowerDraw, 0.1d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 0.04d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.06d)
            ),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    ShieldCellBank_Specialised_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -0.16d),
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.PowerDraw, 0.15d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 0.06d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.12d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.LEGACYFIRMWARE, 1)),

    ShieldCellBank_Specialised_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BootTime, -0.24d),
                    new Pair<>(ItemEffect.Integrity, -0.15d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.ShieldBankReinforcement, 0.08d),
                    new Pair<>(ItemEffect.ThermalLoad, -0.18d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.INDUSTRIALFIRMWARE, 1),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 1)),

    ShieldGenerator_Kinetic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.2d),
                    new Pair<>(ItemEffect.KineticResistance, 0.06d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.04d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Kinetic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.25d),
                    new Pair<>(ItemEffect.KineticResistance, 0.12d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.07d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1)),

    ShieldGenerator_Kinetic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.3d),
                    new Pair<>(ItemEffect.KineticResistance, 0.18d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.11d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.CONSUMERFIRMWARE, 1),
            new CostData(Material.SELENIUM, 1)),

    ShieldGenerator_Kinetic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.35d),
                    new Pair<>(ItemEffect.KineticResistance, 0.24d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.14d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.MERCURY, 1)),

    ShieldGenerator_Kinetic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.4d),
                    new Pair<>(ItemEffect.KineticResistance, 0.3d),
                    new Pair<>(ItemEffect.ThermicResistance, -0.18d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.RUTHENIUM, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldGenerator_Optimised_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.05d),
                    new Pair<>(ItemEffect.Mass, -0.18d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -0.02d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.045d),
                    new Pair<>(ItemEffect.PowerDraw, -0.2d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Optimised_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.26d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -0.03d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.09d),
                    new Pair<>(ItemEffect.PowerDraw, -0.25d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1)),

    ShieldGenerator_Optimised_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.15d),
                    new Pair<>(ItemEffect.Mass, -0.34d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -0.04d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.135d),
                    new Pair<>(ItemEffect.PowerDraw, -0.3d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.PRECIPITATEDALLOYS, 1)),

    ShieldGenerator_Optimised_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.42d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -0.05d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.18d),
                    new Pair<>(ItemEffect.PowerDraw, -0.35d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.THERMICALLOYS, 1)),

    ShieldGenerator_Optimised_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.25d),
                    new Pair<>(ItemEffect.Mass, -0.5d),
                    new Pair<>(ItemEffect.ShieldGenOptimalMass, -0.06d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.225d),
                    new Pair<>(ItemEffect.PowerDraw, -0.4d)
            ),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    ShieldGenerator_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -0.1d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.04d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.0225d),
                    new Pair<>(ItemEffect.KineticResistance, 0.027d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.14d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.054d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -0.1d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.06d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.0375d),
                    new Pair<>(ItemEffect.KineticResistance, 0.045d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.2d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.09d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -0.1d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.08d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.0525d),
                    new Pair<>(ItemEffect.KineticResistance, 0.063d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.26d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.126d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.PHOSPHORUS, 1)),

    ShieldGenerator_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -0.1d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.0675d),
                    new Pair<>(ItemEffect.KineticResistance, 0.081d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.32d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.162d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1),
            new CostData(Material.MANGANESE, 1)),

    ShieldGenerator_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.BrokenRegenRate, -0.1d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.12d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.0825d),
                    new Pair<>(ItemEffect.KineticResistance, 0.099d),
                    new Pair<>(ItemEffect.DefenceModifierShieldMultiplier, 0.38d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.198d)
            ),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1),
            new CostData(Material.IMPROVISEDCOMPONENTS, 1)),

    ShieldGenerator_Thermic_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.2d),
                    new Pair<>(ItemEffect.KineticResistance, -0.02d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.12d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1)),

    ShieldGenerator_Thermic_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.25d),
                    new Pair<>(ItemEffect.KineticResistance, -0.05d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.24d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1)),

    ShieldGenerator_Thermic_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.3d),
                    new Pair<>(ItemEffect.KineticResistance, -0.07d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.36d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.SELENIUM, 1)),

    ShieldGenerator_Thermic_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.35d),
                    new Pair<>(ItemEffect.KineticResistance, -0.1d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.48d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 1),
            new CostData(Material.SHIELDSOAKANALYSIS, 1),
            new CostData(Material.MERCURY, 1)),

    ShieldGenerator_Thermic_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.4d),
                    new Pair<>(ItemEffect.KineticResistance, -0.12d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.6d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
            new CostData(Material.RUTHENIUM, 1),
            new CostData(Material.SHIELDDENSITYREPORTS, 1)),

    WakeScanner_LightWeight_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.1d),
                    new Pair<>(ItemEffect.Mass, -0.45d)
            ),
            new CostData(Material.PHOSPHORUS, 1)),

    WakeScanner_LightWeight_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.2d),
                    new Pair<>(ItemEffect.Mass, -0.55d)
            ),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    WakeScanner_LightWeight_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.3d),
                    new Pair<>(ItemEffect.Mass, -0.65d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SALVAGEDALLOYS, 1)),

    WakeScanner_LightWeight_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.4d),
                    new Pair<>(ItemEffect.Mass, -0.75d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 1),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    WakeScanner_LightWeight_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, -0.5d),
                    new Pair<>(ItemEffect.Mass, -0.85d)
            ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.PROTORADIOLICALLOYS, 1)),

    WakeScanner_Reinforced_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.Mass, 0.3d)
            ),
            new CostData(Material.NICKEL, 1)),

    WakeScanner_Reinforced_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.Mass, 0.6d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Reinforced_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.Mass, 0.9d)
            ),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SHIELDEMITTERS, 1),
            new CostData(Material.TUNGSTEN, 1)),

    WakeScanner_Reinforced_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.Mass, 1.2d)
            ),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TUNGSTEN, 1),
            new CostData(Material.ZINC, 1)),

    WakeScanner_Reinforced_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.Mass, 1.5d)
            ),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.TECHNETIUM, 1)),

    WakeScanner_Shielded_1(ItemGrade.GRADE_1, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 0.6d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 1)),

    WakeScanner_Shielded_2(ItemGrade.GRADE_2, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.2d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Shielded_3(ItemGrade.GRADE_3, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 1.8d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
            new CostData(Material.SHIELDEMITTERS, 1)),

    WakeScanner_Shielded_4(ItemGrade.GRADE_4, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 2.4d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d)
            ),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
            new CostData(Material.SHIELDINGSENSORS, 1),
            new CostData(Material.VANADIUM, 1)),

    WakeScanner_Shielded_5(ItemGrade.GRADE_5, new ItemEffectData
            (
                    new Pair<>(ItemEffect.Integrity, 3d),
                    new Pair<>(ItemEffect.PowerDraw, 1d)
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

    public String getLabel()
    {
        //String name = name().replace("_"," ").substring(0,name().length()-1);
        String grade = Arrays.stream(name().split("_")).reduce((a, b) -> b).orElse("?");
        return  //name +
                "Grade " + grade;
    }

    @Override
    public String getName()
    {
        return name();
    }
}
