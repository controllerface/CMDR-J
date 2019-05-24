package com.controllerface.cmdr_j.enums.craftable.modifications;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.advanced.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.explosive.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.heavyduty.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.kinetic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.armour.thermic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.chafflauncher.capacity.ChaffLauncher_ChaffCapacity_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.fsd.fastboot.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.fsd.longrange.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.fsd.shielded.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.heatsink.capacity.HeatSinkLauncher_HeatSinkCapacity_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded.FSDinterdictor_Expanded_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded.FSDinterdictor_Expanded_2;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded.FSDinterdictor_Expanded_3;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded.FSDinterdictor_Expanded_4;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange.FSDinterdictor_LongRange_1;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange.FSDinterdictor_LongRange_2;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange.FSDinterdictor_LongRange_3;
import com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange.FSDinterdictor_LongRange_4;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.lightweight.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.reinforced.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.misc.shielded.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.explosive.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.heavyduty.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.kinetic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.resistive.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.thermic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.kinetic.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.optimised.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.clean.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.dirty.*;
import com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.reinforced.*;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
public enum ModificationRecipe implements ProcurementRecipe
{
    /*
    Miscellaneous/Common Effects: Used on several different modules
     */

    Misc_LightWeight_1(new Misc_LightWeight_1()),
    Misc_LightWeight_2(new Misc_LightWeight_2()),
    Misc_LightWeight_3(new Misc_LightWeight_3()),
    Misc_LightWeight_4(new Misc_LightWeight_4()),
    Misc_LightWeight_5(new Misc_LightWeight_5()),

    Misc_Reinforced_1(new Misc_Reinforced_1()),
    Misc_Reinforced_2(new Misc_Reinforced_2()),
    Misc_Reinforced_3(new Misc_Reinforced_3()),
    Misc_Reinforced_4(new Misc_Reinforced_4()),
    Misc_Reinforced_5(new Misc_Reinforced_5()),

    Misc_Shielded_1(new Misc_Shielded_1()),
    Misc_Shielded_2(new Misc_Shielded_2()),
    Misc_Shielded_3(new Misc_Shielded_3()),
    Misc_Shielded_4(new Misc_Shielded_4()),
    Misc_Shielded_5(new Misc_Shielded_5()),


    /*
    Armour
     */

    Armour_Advanced_1(new Armour_Advanced_1()),
    Armour_Advanced_2(new Armour_Advanced_2()),
    Armour_Advanced_3(new Armour_Advanced_3()),
    Armour_Advanced_4(new Armour_Advanced_4()),
    Armour_Advanced_5(new Armour_Advanced_5()),

    Armour_Explosive_1(new Armour_Explosive_1()),
    Armour_Explosive_2(new Armour_Explosive_2()),
    Armour_Explosive_3(new Armour_Explosive_3()),
    Armour_Explosive_4(new Armour_Explosive_4()),
    Armour_Explosive_5(new Armour_Explosive_5()),

    Armour_HeavyDuty_1(new Armour_HeavyDuty_1()),
    Armour_HeavyDuty_2(new Armour_HeavyDuty_2()),
    Armour_HeavyDuty_3(new Armour_HeavyDuty_3()),
    Armour_HeavyDuty_4(new Armour_HeavyDuty_4()),
    Armour_HeavyDuty_5(new Armour_HeavyDuty_5()),

    Armour_Kinetic_1(new Armour_Kinetic_1()),
    Armour_Kinetic_2(new Armour_Kinetic_2()),
    Armour_Kinetic_3(new Armour_Kinetic_3()),
    Armour_Kinetic_4(new Armour_Kinetic_4()),
    Armour_Kinetic_5(new Armour_Kinetic_5()),

    Armour_Thermic_1(new Armour_Thermic_1()),
    Armour_Thermic_2(new Armour_Thermic_2()),
    Armour_Thermic_3(new Armour_Thermic_3()),
    Armour_Thermic_4(new Armour_Thermic_4()),
    Armour_Thermic_5(new Armour_Thermic_5()),


    /*
    Chaff Launcher
     */

    ChaffLauncher_ChaffCapacity_1(new ChaffLauncher_ChaffCapacity_1()),


    /*
    Shield Booster
     */

    ShieldBooster_Explosive_1(new ShieldBooster_Explosive_1()),
    ShieldBooster_Explosive_2(new ShieldBooster_Explosive_2()),
    ShieldBooster_Explosive_3(new ShieldBooster_Explosive_3()),
    ShieldBooster_Explosive_4(new ShieldBooster_Explosive_4()),
    ShieldBooster_Explosive_5(new ShieldBooster_Explosive_5()),

    ShieldBooster_HeavyDuty_1(new ShieldBooster_HeavyDuty_1()),
    ShieldBooster_HeavyDuty_2(new ShieldBooster_HeavyDuty_2()),
    ShieldBooster_HeavyDuty_3(new ShieldBooster_HeavyDuty_3()),
    ShieldBooster_HeavyDuty_4(new ShieldBooster_HeavyDuty_4()),
    ShieldBooster_HeavyDuty_5(new ShieldBooster_HeavyDuty_5()),

    ShieldBooster_Kinetic_1(new ShieldBooster_Kinetic_1()),
    ShieldBooster_Kinetic_2(new ShieldBooster_Kinetic_2()),
    ShieldBooster_Kinetic_3(new ShieldBooster_Kinetic_3()),
    ShieldBooster_Kinetic_4(new ShieldBooster_Kinetic_4()),
    ShieldBooster_Kinetic_5(new ShieldBooster_Kinetic_5()),

    ShieldBooster_Resistive_1(new ShieldBooster_Resistive_1()),
    ShieldBooster_Resistive_2(new ShieldBooster_Resistive_2()),
    ShieldBooster_Resistive_3(new ShieldBooster_Resistive_3()),
    ShieldBooster_Resistive_4(new ShieldBooster_Resistive_4()),
    ShieldBooster_Resistive_5(new ShieldBooster_Resistive_5()),

    ShieldBooster_Thermic_1(new ShieldBooster_Thermic_1()),
    ShieldBooster_Thermic_2(new ShieldBooster_Thermic_2()),
    ShieldBooster_Thermic_3(new ShieldBooster_Thermic_3()),
    ShieldBooster_Thermic_4(new ShieldBooster_Thermic_4()),
    ShieldBooster_Thermic_5(new ShieldBooster_Thermic_5()),


    /*
    Thrusters
     */

    Engine_Dirty_1(new Engine_Dirty_1()),
    Engine_Dirty_2(new Engine_Dirty_2()),
    Engine_Dirty_3(new Engine_Dirty_3()),
    Engine_Dirty_4(new Engine_Dirty_4()),
    Engine_Dirty_5(new Engine_Dirty_5()),

    Engine_Reinforced_1(new Engine_Reinforced_1()),
    Engine_Reinforced_2(new Engine_Reinforced_2()),
    Engine_Reinforced_3(new Engine_Reinforced_3()),
    Engine_Reinforced_4(new Engine_Reinforced_4()),
    Engine_Reinforced_5(new Engine_Reinforced_5()),

    Engine_Tuned_1(new Engine_Tuned_1()),
    Engine_Tuned_2(new Engine_Tuned_2()),
    Engine_Tuned_3(new Engine_Tuned_3()),
    Engine_Tuned_4(new Engine_Tuned_4()),
    Engine_Tuned_5(new Engine_Tuned_5()),


    /*
    Frame Shift Drive
     */

    FSD_FastBoot_1(new FSD_FastBoot_1()),
    FSD_FastBoot_2(new FSD_FastBoot_2()),
    FSD_FastBoot_3(new FSD_FastBoot_3()),
    FSD_FastBoot_4(new FSD_FastBoot_4()),
    FSD_FastBoot_5(new FSD_FastBoot_5()),

    FSD_LongRange_1(new FSD_LongRange_1()),
    FSD_LongRange_2(new FSD_LongRange_2()),
    FSD_LongRange_3(new FSD_LongRange_3()),
    FSD_LongRange_4(new FSD_LongRange_4()),
    FSD_LongRange_5(new FSD_LongRange_5()),

    FSD_Shielded_1(new FSD_Shielded_1()),
    FSD_Shielded_2(new FSD_Shielded_2()),
    FSD_Shielded_3(new FSD_Shielded_3()),
    FSD_Shielded_4(new FSD_Shielded_4()),
    FSD_Shielded_5(new FSD_Shielded_5()),


    /*
    FSD Interdictor
     */

    FSDinterdictor_Expanded_1(new FSDinterdictor_Expanded_1()),
    FSDinterdictor_Expanded_2(new FSDinterdictor_Expanded_2()),
    FSDinterdictor_Expanded_3(new FSDinterdictor_Expanded_3()),
    FSDinterdictor_Expanded_4(new FSDinterdictor_Expanded_4()),

    FSDinterdictor_LongRange_1(new FSDinterdictor_LongRange_1()),
    FSDinterdictor_LongRange_2(new FSDinterdictor_LongRange_2()),
    FSDinterdictor_LongRange_3(new FSDinterdictor_LongRange_3()),
    FSDinterdictor_LongRange_4(new FSDinterdictor_LongRange_4()),


    /*
    Heat Sink Launcher
     */

    HeatSinkLauncher_HeatSinkCapacity_1(new HeatSinkLauncher_HeatSinkCapacity_1()),


    /*
    Hull Reinforcements
     */

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


    /*
    Life Support
     */

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


    /*
    Point Defense Turret
     */

    PointDefence_PointDefenseCapacity_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.AmmoMaximum, 50d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.ReloadTime, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.VANADIUM, 1)),


    /*
    Power Distributor
     */

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


    /*
    Power Plant
     */

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


    /*
    Refinery
     */

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

    /*
    Manifest Scanner
     */

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



        /*
    Kill Warrant Scanner
     */

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


    /*
    Ship Sensors
     */

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


    Sensor_Expanded_1(ItemGrade.GRADE_1, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Expanded_2(ItemGrade.GRADE_2, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 20d)
            ),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Expanded_3(ItemGrade.GRADE_3, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 30d)
            ),
            new CostData(Material.PHASEALLOYS, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.MECHANICALSCRAP, 1)),

    Sensor_Expanded_4(ItemGrade.GRADE_4, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 40d)
            ),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.MECHANICALEQUIPMENT, 1),
            new CostData(Material.NIOBIUM, 1)),

    Sensor_Expanded_5(ItemGrade.GRADE_5, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 50d)
            ),
            new CostData(Material.PROTORADIOLICALLOYS, 1),
            new CostData(Material.MECHANICALCOMPONENTS, 1),
            new CostData(Material.TIN, 1)),


    /*
    FSD Wake Scanner
     */

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


    /*
    Shield Cell Bank
     */

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


    /*
    Shield Generator
     */

    ShieldGenerator_Kinetic_1(new ShieldGenerator_Kinetic_1()),
    ShieldGenerator_Kinetic_2(new ShieldGenerator_Kinetic_2()),
    ShieldGenerator_Kinetic_3(new ShieldGenerator_Kinetic_3()),
    ShieldGenerator_Kinetic_4(new ShieldGenerator_Kinetic_4()),
    ShieldGenerator_Kinetic_5(new ShieldGenerator_Kinetic_5()),

    ShieldGenerator_Optimised_1(new ShieldGenerator_Optimised_1()),
    ShieldGenerator_Optimised_2(new ShieldGenerator_Optimised_2()),
    ShieldGenerator_Optimised_3(new ShieldGenerator_Optimised_3()),
    ShieldGenerator_Optimised_4(new ShieldGenerator_Optimised_4()),
    ShieldGenerator_Optimised_5(new ShieldGenerator_Optimised_5()),

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

    ;

    private final ProcurementRecipe delegate;

    private String parentBlueprintName;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;

    public static Icon icon = new Icon(UIFunctions.Icons.engineering, 25, 30);

    ModificationRecipe(@NotNull ProcurementRecipe delegate)
    {
        this.delegate = delegate;

        this.grade = null;
        this.cost = null;
        this.effects = null;
    }

    ModificationRecipe(ItemGrade grade, ItemEffects effects, CostData... cost)
    {
        this.delegate = null;

        this.grade = grade;
        this.effects = effects;
        this.cost = cost;
        Arrays.stream(cost).forEach(c->c.getCost().associate(this));
    }

    @Override
    public ItemGrade getGrade()
    {
        if (delegate == null) return grade;
        else return delegate.getGrade();
    }

    public Stream<CostData> costStream()
    {
        if (delegate ==null) return Arrays.stream(cost);
        else return delegate.costStream();
    }

    public ItemEffects effects()
    {
        if (delegate == null) return effects;
        else return delegate.effects();
    }

    @Override
    public void setParentBlueprintName(String parentBlueprintName)
    {
        if (delegate == null) this.parentBlueprintName = parentBlueprintName;
        else delegate.setParentBlueprintName(parentBlueprintName);
    }

    @Override
    public String toString()
    {
        if (delegate == null) return super.toString().replace("_"," ");
        else return delegate.toString();
    }

    @Override
    public String getShortLabel()
    {
        if (delegate == null) return grade.toString();
        else return delegate.getShortLabel();
    }

    @Override
    public String getDisplayLabel()
    {
        if (delegate == null) return getShortLabel() + " :: " +  parentBlueprintName;
        return delegate.getDisplayLabel();
    }

    @Override
    public String getName()
    {
        if (delegate == null) return name();
        else return delegate.getName();
    }

    @Override
    public Icon getIcon()
    {
        if (delegate == null) return icon;
        else return delegate.getIcon();
    }
}
