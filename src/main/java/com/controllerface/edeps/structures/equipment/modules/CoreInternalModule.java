package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.data.ItemEffects;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.edeps.structures.craftable.modifications.ModificationType;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import javafx.util.Pair;

import java.util.Arrays;

/**
 * Created by Stephen on 4/25/2018.
 */
@SuppressWarnings("unchecked")
public enum CoreInternalModule implements ShipModule
{
    /**
     * Cargo Bay Door
     */
    //ModularCargoBayDoor(text),

    /**
     * Cockpits
     */

//    Vulture_Cockpit(text),
//    Python_Cockpit(text),
//    TypeX_Cockpit(text),


    /**
     * Ship Armor
     */

    /*
    Dolphin
     */

    dolphin_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    dolphin_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    dolphin_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 63d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    dolphin_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 63d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    dolphin_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 63d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Fer-de-Lance
     */

    ferdelance_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),


    ferdelance_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 19d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    ferdelance_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 38d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    ferdelance_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 38d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    ferdelance_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 38d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Python
     */

    python_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    python_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 26d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    python_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 53d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    python_armour_reactive("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 53d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    python_armour_mirrored("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 53d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Beluga
     */

    belugaliner_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    belugaliner_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 83d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    belugaliner_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 165d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    belugaliner_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 165d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    belugaliner_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 165d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Orca
     */

    orca_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    orca_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 21d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    orca_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    orca_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    orca_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Asp Scout
     */

    asp_scout_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    asp_scout_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 21d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    asp_scout_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 42d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    asp_scout_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 42d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    asp_scout_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 42d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Asp Explorer
     */

    asp_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    asp_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 21d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    asp_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 42d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    asp_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 42d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    asp_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 42d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Keelback
     */

    independant_trader_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    independant_trader_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 12d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    independant_trader_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 23d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    independant_trader_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 23d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    independant_trader_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 23d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Vulture
     */

    vulture_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    vulture_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 17d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    vulture_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 35d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    vulture_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 35d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    vulture_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 35d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Viper MK III
     */

    viper_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    viper_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    viper_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 9d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    viper_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 9d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    viper_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 9d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Diamondback Explorer
     */

    diamondbackxl_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    diamondbackxl_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 23d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    diamondbackxl_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 47d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    diamondbackxl_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 47d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    diamondbackxl_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 47d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    /*
    Adder
     */

    adder_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    adder_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 3d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    adder_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    adder_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    adder_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Diamondback Scout
     */

    diamondback_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    diamondback_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 13d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    diamondback_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 26d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    diamondback_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 26d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    diamondback_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 26d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Viper MK IV
     */

    viper_mkiv_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    viper_mkiv_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    viper_mkiv_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 9d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    viper_mkiv_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 9d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    viper_mkiv_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 9d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Anaconda
     */

    anaconda_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    anaconda_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 30d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    anaconda_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    anaconda_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    anaconda_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Cobra MK III
     */

    cobramkiii_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    cobramkiii_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 14d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    cobramkiii_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 27d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    cobramkiii_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 27d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    cobramkiii_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 27d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Type 9
     */

    type9_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    type9_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 75d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    type9_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 150d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    type9_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 150d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    type9_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 150d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Type 7
     */

    type7_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    type7_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    type7_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 63d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    type7_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 63d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    type7_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 63d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Cobra MK IV
     */

    cobramkiv_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    cobramkiv_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 14d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    cobramkiv_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 27d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    cobramkiv_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 27d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    cobramkiv_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 27d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Eagle
     */

    eagle_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    eagle_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    eagle_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    eagle_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    eagle_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Hauler
     */

    hauler_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    hauler_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    hauler_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    hauler_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    hauler_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Sidewinder
     */

    sidewinder_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    sidewinder_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    sidewinder_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    sidewinder_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    sidewinder_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Type 6
     */

    type6_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    type6_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 12d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    type6_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 23d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    type6_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 23d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    type6_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 23d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Imperial Clipper
     */

    empire_trader_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    empire_trader_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 30d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    empire_trader_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    empire_trader_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    empire_trader_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Federal Dropship
     */

    federation_dropship_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    federation_dropship_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 44d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    federation_dropship_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    federation_dropship_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    federation_dropship_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Imperial Cutter
     */

    cutter_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    cutter_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 30d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    cutter_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    cutter_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    cutter_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Imperial Eagle
     */

    empire_eagle_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    empire_eagle_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    empire_eagle_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    empire_eagle_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    empire_eagle_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Chieftain
     */

    typex_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    typex_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    typex_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 78d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    typex_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 78d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    typex_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 78d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Federal Corvette
     */

    federation_corvette_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    federation_corvette_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 30d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    federation_corvette_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    federation_corvette_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    federation_corvette_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Imperial Courier
     */

    empire_courier_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    empire_courier_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    empire_courier_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    empire_courier_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    empire_courier_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Federal Gunship
     */

    federation_gunship_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    federation_gunship_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 44d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    federation_gunship_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    federation_gunship_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    federation_gunship_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Type 10
     */

    type9_military_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    type9_military_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 75d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    type9_military_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 150d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    type9_military_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 150d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    type9_military_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 150d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /*
    Federal Assault Ship
     */

    federation_dropship_mkii_armour_grade1("Lightweight",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 80d)
            )),

    federation_dropship_mkii_armour_grade2("Reinforced",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 44d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 152d)
            )),

    federation_dropship_mkii_armour_grade3("Military Grade",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -40d),
                    new Pair<>(ItemEffect.KineticResistance, -20d),
                    new Pair<>(ItemEffect.ThermicResistance, 0d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    federation_dropship_mkii_armour_mirrored("Mirrored",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, -50d),
                    new Pair<>(ItemEffect.KineticResistance, -75d),
                    new Pair<>(ItemEffect.ThermicResistance, 50d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),

    federation_dropship_mkii_armour_reactive("Reactive",
            ModificationType.Bulkheads,
            ExperimentalType.Bulkheads,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 87d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 20d),
                    new Pair<>(ItemEffect.KineticResistance, 25d),
                    new Pair<>(ItemEffect.ThermicResistance, -40d),
                    new Pair<>(ItemEffect.DefenceModifierHealthMultiplier, 250d)
            )),


    /**
     * Power Plants
     */

    int_powerplant_size2_class1("2E Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 46d),
                    new Pair<>(ItemEffect.PowerCapacity, 6.4d),
                    new Pair<>(ItemEffect.HeatEfficiency, 1d)
            )),

    int_powerplant_size2_class2("2D Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerCapacity, 7.2d),
                    new Pair<>(ItemEffect.HeatEfficiency, .75d)
            )),

    int_powerplant_size2_class3("2C Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerCapacity, 8d),
                    new Pair<>(ItemEffect.HeatEfficiency, .5d)
            )),


    int_powerplant_size2_class4("2B Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 61d),
                    new Pair<>(ItemEffect.PowerCapacity, 8.8d),
                    new Pair<>(ItemEffect.HeatEfficiency, .45d)
            )),

    int_powerplant_size2_class5("2A Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerCapacity, 9.6d),
                    new Pair<>(ItemEffect.HeatEfficiency, .4d)
            )),

    int_powerplant_size3_class1("3E Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerCapacity, 8d),
                    new Pair<>(ItemEffect.HeatEfficiency, 1d)
            )),

    int_powerplant_size3_class2("3D Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerCapacity, 9d),
                    new Pair<>(ItemEffect.HeatEfficiency, .75d)
            )),

    int_powerplant_size3_class3("3C Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerCapacity, 10d),
                    new Pair<>(ItemEffect.HeatEfficiency, .5d)
            )),

    int_powerplant_size3_class4("3B Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerCapacity, 11d),
                    new Pair<>(ItemEffect.HeatEfficiency, .45d)
            )),

    int_powerplant_size3_class5("3A Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.PowerCapacity, 12d),
                    new Pair<>(ItemEffect.HeatEfficiency, .4d)
            )),

    int_powerplant_size4_class1("4E Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 72d),
                    new Pair<>(ItemEffect.PowerCapacity, 10.4d),
                    new Pair<>(ItemEffect.HeatEfficiency, 1d)
            )),

    int_powerplant_size4_class2("4D Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerCapacity, 11.7d),
                    new Pair<>(ItemEffect.HeatEfficiency, .75d)
            )),

    int_powerplant_size4_class3("4C Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerCapacity, 13d),
                    new Pair<>(ItemEffect.HeatEfficiency, .5d)
            )),

    int_powerplant_size4_class4("4B Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerCapacity, 14.3d),
                    new Pair<>(ItemEffect.HeatEfficiency, .45d)
            )),

    int_powerplant_size4_class5("4A Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 88d),
                    new Pair<>(ItemEffect.PowerCapacity, 15.6d),
                    new Pair<>(ItemEffect.HeatEfficiency, .4d)
            )),

    int_powerplant_size5_class1("5E Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 86d),
                    new Pair<>(ItemEffect.PowerCapacity, 13.6d),
                    new Pair<>(ItemEffect.HeatEfficiency, 1d)
            )),

    int_powerplant_size5_class2("5D Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerCapacity, 15.3d),
                    new Pair<>(ItemEffect.HeatEfficiency, .75d)
            )),

    int_powerplant_size5_class3("5C Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerCapacity, 17d),
                    new Pair<>(ItemEffect.HeatEfficiency, .5d)
            )),

    int_powerplant_size5_class4("5B Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.PowerCapacity, 18.7d),
                    new Pair<>(ItemEffect.HeatEfficiency, .45d)
            )),

    int_powerplant_size5_class5("5A Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 106d),
                    new Pair<>(ItemEffect.PowerCapacity, 20.4d),
                    new Pair<>(ItemEffect.HeatEfficiency, .4d)
            )),

    int_powerplant_size6_class1("6E Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 102d),
                    new Pair<>(ItemEffect.PowerCapacity, 16.8d),
                    new Pair<>(ItemEffect.HeatEfficiency, 1d)
            )),

    int_powerplant_size6_class2("6D Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerCapacity, 18.9d),
                    new Pair<>(ItemEffect.HeatEfficiency, .75d)
            )),

    int_powerplant_size6_class3("6C Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 113d),
                    new Pair<>(ItemEffect.PowerCapacity, 2.1d),
                    new Pair<>(ItemEffect.HeatEfficiency, .5d)
            )),

    int_powerplant_size6_class4("6B Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 136d),
                    new Pair<>(ItemEffect.PowerCapacity, 23.1d),
                    new Pair<>(ItemEffect.HeatEfficiency, .45d)
            )),

    int_powerplant_size6_class5("6A Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 124d),
                    new Pair<>(ItemEffect.PowerCapacity, 25.2d),
                    new Pair<>(ItemEffect.HeatEfficiency, .4d)
            )),

    int_powerplant_size7_class1("7E Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 118d),
                    new Pair<>(ItemEffect.PowerCapacity, 20d),
                    new Pair<>(ItemEffect.HeatEfficiency, 1d)
            )),

    int_powerplant_size7_class2("7D Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerCapacity, 22.5d),
                    new Pair<>(ItemEffect.HeatEfficiency, .75d)
            )),

    int_powerplant_size7_class3("7C Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerCapacity, 25d),
                    new Pair<>(ItemEffect.HeatEfficiency, .5d)
            )),

    int_powerplant_size7_class4("7B Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerCapacity, 27.5d),
                    new Pair<>(ItemEffect.HeatEfficiency, .45d)
            )),

    int_powerplant_size7_class5("7A Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 144d),
                    new Pair<>(ItemEffect.PowerCapacity, 30d),
                    new Pair<>(ItemEffect.HeatEfficiency, .4d)
            )),

    int_powerplant_size8_class1("8E Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 135d),
                    new Pair<>(ItemEffect.PowerCapacity, 24d),
                    new Pair<>(ItemEffect.HeatEfficiency, 1d)
            )),

    int_powerplant_size8_class2("8D Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerCapacity, 27d),
                    new Pair<>(ItemEffect.HeatEfficiency, .75d)
            )),

    int_powerplant_size8_class3("8C Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.PowerCapacity, 30d),
                    new Pair<>(ItemEffect.HeatEfficiency, .5d)
            )),

    int_powerplant_size8_class4("8B Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerCapacity, 33d),
                    new Pair<>(ItemEffect.HeatEfficiency, .45d)
            )),

    int_powerplant_size8_class5("8A Standard",
            ModificationType.Power_Plant,
            ExperimentalType.Power_Plant,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 165d),
                    new Pair<>(ItemEffect.PowerCapacity, 36d),
                    new Pair<>(ItemEffect.HeatEfficiency, .4d)
            )),


    /**
     * Thrusters
     */

    int_engine_size2_class1("2E Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 46d),
                    new Pair<>(ItemEffect.PowerDraw, 2d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 24d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 48d),
                    new Pair<>(ItemEffect.MaximumMass, 72d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 83d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 103d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),

    int_engine_size2_class2("2D Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, 2.25d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 27d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 54d),
                    new Pair<>(ItemEffect.MaximumMass, 81d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 86d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 106d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size2_class3("2C Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 2.5d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 30d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 60d),
                    new Pair<>(ItemEffect.MaximumMass, 90d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 110d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size2_class4("2B Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 61d),
                    new Pair<>(ItemEffect.PowerDraw, 2.75d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 33d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 66d),
                    new Pair<>(ItemEffect.MaximumMass, 99d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 113d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size2_class5("2A Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 3d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 36d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 72d),
                    new Pair<>(ItemEffect.MaximumMass, 108d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 96d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 116d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),

    int_engine_size2_class5_fast("2A Enhanced Performance",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 4d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 50d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 60d),
                    new Pair<>(ItemEffect.MaximumMass, 120d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 115d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 136.67d),

                    // TODO: maybe add special effects for these thrusters. May need to acquire and test

                    new Pair<>(ItemEffect.EngineHeatRate, 2d)
            )),


    int_engine_size3_class1("3E Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 2.48d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 40d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 80d),
                    new Pair<>(ItemEffect.MaximumMass, 120d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 83d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 103d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size3_class2("3D Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 2.79d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 45d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 90d),
                    new Pair<>(ItemEffect.MaximumMass, 135d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 86d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 106d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size3_class3("3C Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 3.1d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 50d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 100d),
                    new Pair<>(ItemEffect.MaximumMass, 150d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 110d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size3_class4("3B Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 3.41d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 55d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 110d),
                    new Pair<>(ItemEffect.MaximumMass, 165d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 93d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 113d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size3_class5("3A Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.PowerDraw, 3.72d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 60d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 120d),
                    new Pair<>(ItemEffect.MaximumMass, 180d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 96d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 16d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size3_class5_fast("3A Enhanced Performance",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 55d),
                    new Pair<>(ItemEffect.PowerDraw, 5d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 70d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 90d),
                    new Pair<>(ItemEffect.MaximumMass, 200d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 115d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 136.67d),

                    // TODO: maybe add special effects for these thrusters. May need to acquire and test

                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size4_class1("4E Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 72d),
                    new Pair<>(ItemEffect.PowerDraw, 3.28d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 140d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 280d),
                    new Pair<>(ItemEffect.MaximumMass, 420d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 83d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 103d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size4_class2("4D Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 3.69d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 158d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 315d),
                    new Pair<>(ItemEffect.MaximumMass, 473d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 86d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 106d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size4_class3("4C Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 4.1d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 175d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 350d),
                    new Pair<>(ItemEffect.MaximumMass, 525d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 110d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size4_class4("4B Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 4.51d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 193d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 385d),
                    new Pair<>(ItemEffect.MaximumMass, 578d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 93d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 113d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size4_class5("4A Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 88d),
                    new Pair<>(ItemEffect.PowerDraw, 4.92d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 210d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 420d),
                    new Pair<>(ItemEffect.MaximumMass, 630d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 96d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 116d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size5_class1("5E Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 86d),
                    new Pair<>(ItemEffect.PowerDraw, 4.08d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 280d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 560d),
                    new Pair<>(ItemEffect.MaximumMass, 840d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 83d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 103d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size5_class2("5D Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 4.59d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 315d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 630d),
                    new Pair<>(ItemEffect.MaximumMass, 945d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 86d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 106d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size5_class3("5C Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 5.1d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 350d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 700d),
                    new Pair<>(ItemEffect.MaximumMass, 1050d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 110d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size5_class4("5B Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.PowerDraw, 5.61d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 385d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 770d),
                    new Pair<>(ItemEffect.MaximumMass, 1155d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 93d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 113d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size5_class5("5A Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 106d),
                    new Pair<>(ItemEffect.PowerDraw, 6.12d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 420d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 840d),
                    new Pair<>(ItemEffect.MaximumMass, 1260d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 96d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 116d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size6_class1("6E Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 102d),
                    new Pair<>(ItemEffect.PowerDraw, 5.04d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 480d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 960d),
                    new Pair<>(ItemEffect.MaximumMass, 1440d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 83d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 103d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size6_class2("6D Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 5.67d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 540d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 1080d),
                    new Pair<>(ItemEffect.MaximumMass, 1620d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 86d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 106d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size6_class3("6C Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 113d),
                    new Pair<>(ItemEffect.PowerDraw, 6.3d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 600d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 1200d),
                    new Pair<>(ItemEffect.MaximumMass, 1800d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 110d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size6_class4("6B Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 136d),
                    new Pair<>(ItemEffect.PowerDraw, 6.93d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 660d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 1320d),
                    new Pair<>(ItemEffect.MaximumMass, 1980d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 93d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 113d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size6_class5("6A Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 124d),
                    new Pair<>(ItemEffect.PowerDraw, 7.56d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 720d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 1440d),
                    new Pair<>(ItemEffect.MaximumMass, 2160d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 96d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 116d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size7_class1("7E Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 118d),
                    new Pair<>(ItemEffect.PowerDraw, 6.08d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 720d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 1440d),
                    new Pair<>(ItemEffect.MaximumMass, 2160d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 83d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 103d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size7_class2("7D Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 6.84d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 810d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 1620d),
                    new Pair<>(ItemEffect.MaximumMass, 2430d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 86d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 106d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size7_class3("7C Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 7.6d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 900d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 1800d),
                    new Pair<>(ItemEffect.MaximumMass, 2700d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 110d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size7_class4("7B Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 126d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 8.36d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 990d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 1980d),
                    new Pair<>(ItemEffect.MaximumMass, 2970d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 93d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 113d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size7_class5("7A Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 144d),
                    new Pair<>(ItemEffect.PowerDraw, 9.12d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 1080d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 2160d),
                    new Pair<>(ItemEffect.MaximumMass, 3240d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 96d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 116d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size8_class1("8E Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 135d),
                    new Pair<>(ItemEffect.PowerDraw, 7.2d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 1120d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 2240d),
                    new Pair<>(ItemEffect.MaximumMass, 3360d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 83d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 103d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size8_class2("8D Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 8.1d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 1260d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 2520d),
                    new Pair<>(ItemEffect.MaximumMass, 3780d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 86d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 106d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size8_class3("8C Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.PowerDraw, 9d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 1400d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 2800d),
                    new Pair<>(ItemEffect.MaximumMass, 4200d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 90d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 110d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size8_class4("8B Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 256d),
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 9.9d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 1540d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 3080d),
                    new Pair<>(ItemEffect.MaximumMass, 4620d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 93d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 113d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),


    int_engine_size8_class5("8A Standard",
            ModificationType.Thrusters,
            ExperimentalType.Thrusters,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 165d),
                    new Pair<>(ItemEffect.PowerDraw, 10.8d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.EngineMinimumMass, 1680d),
                    new Pair<>(ItemEffect.EngineOptimalMass, 3360d),
                    new Pair<>(ItemEffect.MaximumMass, 5040d),
                    new Pair<>(ItemEffect.EngineMinPerformance, 96d),
                    new Pair<>(ItemEffect.EngineOptPerformance, 100d),
                    new Pair<>(ItemEffect.EngineMaxPerformance, 116d),
                    new Pair<>(ItemEffect.EngineHeatRate, 1.3d)
            )),



    /**
     * Frame Shift Drives
     */

    int_hyperdrive_size2_class1("2E Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 46d),
                    new Pair<>(ItemEffect.PowerDraw, .16d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 48d),
                    new Pair<>(ItemEffect.ThermalLoad, 10d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, .6d)
            )),

    int_hyperdrive_size2_class2("2D Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, .18d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 54d),
                    new Pair<>(ItemEffect.ThermalLoad, 10d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, .6d)
            )),

    int_hyperdrive_size2_class3("2C Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, .2d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 60d),
                    new Pair<>(ItemEffect.ThermalLoad, 10d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, .6d)
            )),


    int_hyperdrive_size2_class4("2B Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, .25d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 75d),
                    new Pair<>(ItemEffect.ThermalLoad, 10d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, .8d)
            )),


    int_hyperdrive_size2_class5("2A Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, .3d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 90d),
                    new Pair<>(ItemEffect.ThermalLoad, 10d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, .9d)
            )),


    int_hyperdrive_size3_class1("3E Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, .24d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 80d),
                    new Pair<>(ItemEffect.ThermalLoad, 14d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 1.2d)
            )),


    int_hyperdrive_size3_class2("3D Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, .27d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 90d),
                    new Pair<>(ItemEffect.ThermalLoad, 14d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 1.2d)
            )),


    int_hyperdrive_size3_class3("3C Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, .3d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 100d),
                    new Pair<>(ItemEffect.ThermalLoad, 14d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 1.2d)
            )),


    int_hyperdrive_size3_class4("3B Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, .38d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 125d),
                    new Pair<>(ItemEffect.ThermalLoad, 14d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 1.5d)
            )),


    int_hyperdrive_size3_class5("3A Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, .45d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 150d),
                    new Pair<>(ItemEffect.ThermalLoad, 14d),
                    new Pair<>(ItemEffect.MaxFuelPerJump,1.8d)
            )),


    int_hyperdrive_size4_class1("4E Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 72d),
                    new Pair<>(ItemEffect.PowerDraw, 0.24d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 280d),
                    new Pair<>(ItemEffect.ThermalLoad, 18d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 2d)
            )),


    int_hyperdrive_size4_class2("4D Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 315d),
                    new Pair<>(ItemEffect.ThermalLoad, 18d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 2d)
            )),


    int_hyperdrive_size4_class3("4C Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 350d),
                    new Pair<>(ItemEffect.ThermalLoad, 18d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 2d)
            )),


    int_hyperdrive_size4_class4("4B Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 0.38d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 438d),
                    new Pair<>(ItemEffect.ThermalLoad, 18d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 2.5d)
            )),


    int_hyperdrive_size4_class5("4A Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 100d),
                    new Pair<>(ItemEffect.PowerDraw, 0.45d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 525d),
                    new Pair<>(ItemEffect.ThermalLoad, 18d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 3d)
            )),



    int_hyperdrive_size5_class1("5E Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 86d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 560d),
                    new Pair<>(ItemEffect.ThermalLoad, 27d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 3.3d)
            )),


    int_hyperdrive_size5_class2("5D Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.36d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 630d),
                    new Pair<>(ItemEffect.ThermalLoad, 27d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 3.3d)
            )),


    int_hyperdrive_size5_class3("5C Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 700d),
                    new Pair<>(ItemEffect.ThermalLoad, 27d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 3.3d)
            )),


    int_hyperdrive_size5_class4("5B Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 144d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 875d),
                    new Pair<>(ItemEffect.ThermalLoad, 27d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 4.1d)
            )),


    int_hyperdrive_size5_class5("5A Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 1050d),
                    new Pair<>(ItemEffect.ThermalLoad, 27d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 5d)
            )),


    int_hyperdrive_size6_class1("6E Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 102d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 960d),
                    new Pair<>(ItemEffect.ThermalLoad, 37d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 5.3d)
            )),


    int_hyperdrive_size6_class2("6D Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.45d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 1080d),
                    new Pair<>(ItemEffect.ThermalLoad, 37d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 5.3d)
            )),


    int_hyperdrive_size6_class3("6C Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 113d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 1200d),
                    new Pair<>(ItemEffect.ThermalLoad, 37d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 5.3d)
            )),


    int_hyperdrive_size6_class4("6B Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 170d),
                    new Pair<>(ItemEffect.PowerDraw, 0.63d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 1500d),
                    new Pair<>(ItemEffect.ThermalLoad, 37d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 6.6d)
            )),


    int_hyperdrive_size6_class5("6A Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 141d),
                    new Pair<>(ItemEffect.PowerDraw, 0.75d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 1800d),
                    new Pair<>(ItemEffect.ThermalLoad, 37d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 8d)
            )),


    int_hyperdrive_size7_class1("7E Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 118d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 1440d),
                    new Pair<>(ItemEffect.ThermalLoad, 43d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 8.5d)
            )),


    int_hyperdrive_size7_class2("7D Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                                new Pair<>(ItemEffect.Mass, 32d),
                                new Pair<>(ItemEffect.Integrity, 105d),
                                new Pair<>(ItemEffect.PowerDraw, 0.54d),
                                new Pair<>(ItemEffect.BootTime, 10d),
                                new Pair<>(ItemEffect.FSDOptimalMass, 1620d),
                                new Pair<>(ItemEffect.ThermalLoad, 43d),
                                new Pair<>(ItemEffect.MaxFuelPerJump, 8.5d)
            )),


    int_hyperdrive_size7_class3("7C Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 1800d),
                    new Pair<>(ItemEffect.ThermalLoad, 43d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 8.5d)
            )),


    int_hyperdrive_size7_class4("7B Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 197d),
                    new Pair<>(ItemEffect.PowerDraw, 0.75d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 2250d),
                    new Pair<>(ItemEffect.ThermalLoad, 43d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 10.6d)
            )),


    int_hyperdrive_size7_class5("7A Standard",
            ModificationType.Frame_Shift_Drive,
            ExperimentalType.Frame_Shift_Drive,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 164d),
                    new Pair<>(ItemEffect.PowerDraw, 0.9d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.FSDOptimalMass, 2700d),
                    new Pair<>(ItemEffect.ThermalLoad, 43d),
                    new Pair<>(ItemEffect.MaxFuelPerJump, 12.8d)
            )),


    /**
     * Life-Support Systems
     */

    int_lifesupport_size1_class1("1E Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 300d)
            )),

    int_lifesupport_size1_class2("1D Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 36d),
                    new Pair<>(ItemEffect.PowerDraw, 0.36d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 450d)
            )),

    int_lifesupport_size1_class3("1C Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 600d)
            )),

    int_lifesupport_size1_class4("1B Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 44d),
                    new Pair<>(ItemEffect.PowerDraw, 0.44d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 900d)
            )),

    int_lifesupport_size1_class5("1A Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 1500d)
            )),

    int_lifesupport_size2_class1("2E Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, 0.37d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 300d)
            )),

    int_lifesupport_size2_class2("2D Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Integrity, 46d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 450d)
            )),

    int_lifesupport_size2_class3("2C Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.46d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 600d)
            )),

    int_lifesupport_size2_class4("2B Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.51d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 900d)
            )),

    int_lifesupport_size2_class5("2A Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 61d),
                    new Pair<>(ItemEffect.PowerDraw, 0.55d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 1500d)
            )),

    int_lifesupport_size3_class1("3E Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.42d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 300d)
            )),

    int_lifesupport_size3_class2("3D Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 450d)
            )),

    int_lifesupport_size3_class3("3C Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.53d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 600d)
            )),

    int_lifesupport_size3_class4("3B Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.PowerDraw, 0.58d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 900d)
            )),

    int_lifesupport_size3_class5("3A Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.64d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 1500d)
            )),

    int_lifesupport_size4_class1("4E Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 300d)
            )),

    int_lifesupport_size4_class2("4D Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 72d),
                    new Pair<>(ItemEffect.PowerDraw, 0.56d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 450d)
            )),

    int_lifesupport_size4_class3("4C Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 0.62d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 600d)
            )),

    int_lifesupport_size4_class4("4B Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 88d),
                    new Pair<>(ItemEffect.PowerDraw, 0.68d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 900d)
            )),

    int_lifesupport_size4_class5("4A Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.74d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 1500d)
            )),

    int_lifesupport_size5_class1("5E Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.57d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 300d)
            )),

    int_lifesupport_size5_class2("5D Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 86d),
                    new Pair<>(ItemEffect.PowerDraw, 0.64d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 450d)
            )),

    int_lifesupport_size5_class3("5C Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.71d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 600d)
            )),

    int_lifesupport_size5_class4("5B Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 106d),
                    new Pair<>(ItemEffect.PowerDraw, 0.78d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 900d)
            )),

    int_lifesupport_size5_class5("5A Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.PowerDraw, 0.85d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 1500d)
            )),

    int_lifesupport_size6_class1("6E Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.64d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 300d)
            )),

    int_lifesupport_size6_class2("6D Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 102d),
                    new Pair<>(ItemEffect.PowerDraw, 0.72d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 450d)
            )),

    int_lifesupport_size6_class3("6C Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 113d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 600d)
            )),

    int_lifesupport_size6_class4("6B Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 124d),
                    new Pair<>(ItemEffect.PowerDraw, 0.88d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 900d)
            )),

    int_lifesupport_size6_class5("6A Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 136d),
                    new Pair<>(ItemEffect.PowerDraw, 0.96d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 1500d)
            )),

    int_lifesupport_size7_class1("7E Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.72d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 300d)
            )),

    int_lifesupport_size7_class2("7D Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 118d),
                    new Pair<>(ItemEffect.PowerDraw, 0.81d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 450d)
            )),

    int_lifesupport_size7_class3("7C Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.9d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 600d)
            )),

    int_lifesupport_size7_class4("7B Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 144d),
                    new Pair<>(ItemEffect.PowerDraw, 0.99d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 900d)
            )),

    int_lifesupport_size7_class5("7A Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 1.08d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 1500d)
            )),

    int_lifesupport_size8_class1("8E Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 300d)
            )),

    int_lifesupport_size8_class2("8D Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 135d),
                    new Pair<>(ItemEffect.PowerDraw, 0.9d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 450d)
            )),

    int_lifesupport_size8_class3("8C Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.PowerDraw, 1d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 600d)
            )),

    int_lifesupport_size8_class4("8B Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 256d),
                    new Pair<>(ItemEffect.Integrity, 165d),
                    new Pair<>(ItemEffect.PowerDraw, 1.1d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 900d)
            )),
    int_lifesupport_size8_class5("8A Standard",
            ModificationType.Life_Support,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 1.2d),
                    new Pair<>(ItemEffect.BootTime, 1d),
                    new Pair<>(ItemEffect.OxygenTimeCapacity, 1500d)
            )),

    /**
     * Power Distributors
     */

    int_powerdistributor_size1_class1("1E Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 36d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 10d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.2d),
                    new Pair<>(ItemEffect.EnginesCapacity, 8d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.4d),
                    new Pair<>(ItemEffect.SystemsCapacity, 8d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.4d)
            )),

    int_powerdistributor_size1_class2("1D Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.36d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 11d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.4d),
                    new Pair<>(ItemEffect.EnginesCapacity, 9d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.5d),
                    new Pair<>(ItemEffect.SystemsCapacity, 9d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.5d)
            )),

    int_powerdistributor_size1_class3("1C Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.5d),
                    new Pair<>(ItemEffect.EnginesCapacity, 10d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.5d),
                    new Pair<>(ItemEffect.SystemsCapacity, 10d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.5d)
            )),

    int_powerdistributor_size1_class4("1B Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.44d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 13d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.7d),
                    new Pair<>(ItemEffect.EnginesCapacity, 11d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.6d),
                    new Pair<>(ItemEffect.SystemsCapacity, 11d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.6d)
            )),

    int_powerdistributor_size1_class5("1A Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 44d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 14d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.8d),
                    new Pair<>(ItemEffect.EnginesCapacity, 12d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.6d),
                    new Pair<>(ItemEffect.SystemsCapacity, 12d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.6d)
            )),

    int_powerdistributor_size2_class1("2E Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 46d),
                    new Pair<>(ItemEffect.PowerDraw, 0.36d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 12d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.4d),
                    new Pair<>(ItemEffect.EnginesCapacity, 10d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.6d),
                    new Pair<>(ItemEffect.SystemsCapacity, 10d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.6d)
            )),

    int_powerdistributor_size2_class2("2D Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 14d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 11d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.6d),
                    new Pair<>(ItemEffect.SystemsCapacity, 11d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.6d)
            )),

    int_powerdistributor_size2_class3("2C Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.45d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 15d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.8d),
                    new Pair<>(ItemEffect.EnginesCapacity, 12d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.7d),
                    new Pair<>(ItemEffect.SystemsCapacity, 12d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.7d)
            )),

    int_powerdistributor_size2_class4("2B Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 61d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 17d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2d),
                    new Pair<>(ItemEffect.EnginesCapacity, 13d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.8d),
                    new Pair<>(ItemEffect.SystemsCapacity, 13d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.8d)
            )),

    int_powerdistributor_size2_class5("2A Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.54d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 18d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.2d),
                    new Pair<>(ItemEffect.EnginesCapacity, 14d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.8d),
                    new Pair<>(ItemEffect.SystemsCapacity, 14d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.8d)
            )),

    int_powerdistributor_size3_class1("3E Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 16d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 1.8d),
                    new Pair<>(ItemEffect.EnginesCapacity, 12d),
                    new Pair<>(ItemEffect.EnginesRecharge, 0.9d),
                    new Pair<>(ItemEffect.SystemsCapacity, 12d),
                    new Pair<>(ItemEffect.SystemsRecharge, 0.9d)
            )),

    int_powerdistributor_size3_class2("3D Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.45d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 18d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.1d),
                    new Pair<>(ItemEffect.EnginesCapacity, 14d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1d),
                    new Pair<>(ItemEffect.SystemsCapacity, 14d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1d)
            )),

    int_powerdistributor_size3_class3("3C Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 20d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.3d),
                    new Pair<>(ItemEffect.EnginesCapacity, 15d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.1d),
                    new Pair<>(ItemEffect.SystemsCapacity, 15d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.1d)
            )),

    int_powerdistributor_size3_class4("3B Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.55d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 22d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.5d),
                    new Pair<>(ItemEffect.EnginesCapacity, 17d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.2d),
                    new Pair<>(ItemEffect.SystemsCapacity, 17d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.2d)
            )),

    int_powerdistributor_size3_class5("3A Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 24d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.8d),
                    new Pair<>(ItemEffect.EnginesCapacity, 18d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.3d),
                    new Pair<>(ItemEffect.SystemsCapacity, 18d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.3d)
            )),

    int_powerdistributor_size4_class1("4E Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 72d),
                    new Pair<>(ItemEffect.PowerDraw, 0.45d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 22d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.3d),
                    new Pair<>(ItemEffect.EnginesCapacity, 15d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.3d),
                    new Pair<>(ItemEffect.SystemsCapacity, 15d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.3d)
            )),

    int_powerdistributor_size4_class2("4D Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 24d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 17d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.4d),
                    new Pair<>(ItemEffect.SystemsCapacity, 17d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.4d)
            )),

    int_powerdistributor_size4_class3("4C Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 0.56d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 27d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.9d),
                    new Pair<>(ItemEffect.EnginesCapacity, 19d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.6d),
                    new Pair<>(ItemEffect.SystemsCapacity, 19d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.6d)
            )),

    int_powerdistributor_size4_class4("4B Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.62d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 30d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 3.2d),
                    new Pair<>(ItemEffect.EnginesCapacity, 21d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.8d),
                    new Pair<>(ItemEffect.SystemsCapacity, 21d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.8d)
            )),

    int_powerdistributor_size4_class5("4A Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 88d),
                    new Pair<>(ItemEffect.PowerDraw, 0.67d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 32d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 3.5d),
                    new Pair<>(ItemEffect.EnginesCapacity, 23d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.9d),
                    new Pair<>(ItemEffect.SystemsCapacity, 23d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.9d)
            )),

    int_powerdistributor_size5_class1("5E Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 86d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 27d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 2.9d),
                    new Pair<>(ItemEffect.EnginesCapacity, 19d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.7d),
                    new Pair<>(ItemEffect.SystemsCapacity, 19d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.7d)
            )),

    int_powerdistributor_size5_class2("5D Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.56d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 31d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 3.2d),
                    new Pair<>(ItemEffect.EnginesCapacity, 22d),
                    new Pair<>(ItemEffect.EnginesRecharge, 1.9d),
                    new Pair<>(ItemEffect.SystemsCapacity, 22d),
                    new Pair<>(ItemEffect.SystemsRecharge, 1.9d)
            )),

    int_powerdistributor_size5_class3("5C Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.62d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 34d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 3.6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 24d),
                    new Pair<>(ItemEffect.EnginesRecharge, 2.1d),
                    new Pair<>(ItemEffect.SystemsCapacity, 24d),
                    new Pair<>(ItemEffect.SystemsRecharge, 2.1d)
            )),

    int_powerdistributor_size5_class4("5B Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.PowerDraw, 0.68d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 37d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 4d),
                    new Pair<>(ItemEffect.EnginesCapacity, 26d),
                    new Pair<>(ItemEffect.EnginesRecharge, 2.3d),
                    new Pair<>(ItemEffect.SystemsCapacity, 26d),
                    new Pair<>(ItemEffect.SystemsRecharge, 2.3d)
            )),

    int_powerdistributor_size5_class5("5A Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 106d),
                    new Pair<>(ItemEffect.PowerDraw, 0.74d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 41d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 4.3d),
                    new Pair<>(ItemEffect.EnginesCapacity, 29d),
                    new Pair<>(ItemEffect.EnginesRecharge, 2.5d),
                    new Pair<>(ItemEffect.SystemsCapacity, 29d),
                    new Pair<>(ItemEffect.SystemsRecharge, 2.5d)
            )),

    int_powerdistributor_size6_class1("6E Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 102d),
                    new Pair<>(ItemEffect.PowerDraw, 0.54d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 34d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 3.4d),
                    new Pair<>(ItemEffect.EnginesCapacity, 23d),
                    new Pair<>(ItemEffect.EnginesRecharge, 2.2d),
                    new Pair<>(ItemEffect.SystemsCapacity, 23d),
                    new Pair<>(ItemEffect.SystemsRecharge, 2.2d)
            )),

    int_powerdistributor_size6_class2("6D Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.61d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 38d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 3.9d),
                    new Pair<>(ItemEffect.EnginesCapacity, 26d),
                    new Pair<>(ItemEffect.EnginesRecharge, 2.4d),
                    new Pair<>(ItemEffect.SystemsCapacity, 26d),
                    new Pair<>(ItemEffect.SystemsRecharge, 2.4d)
            )),

    int_powerdistributor_size6_class3("6C Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 113d),
                    new Pair<>(ItemEffect.PowerDraw, 0.68d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 42d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 4.3d),
                    new Pair<>(ItemEffect.EnginesCapacity, 29d),
                    new Pair<>(ItemEffect.EnginesRecharge, 2.7d),
                    new Pair<>(ItemEffect.SystemsCapacity, 29d),
                    new Pair<>(ItemEffect.SystemsRecharge, 2.7d)
            )),

    int_powerdistributor_size6_class4("6B Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 136d),
                    new Pair<>(ItemEffect.PowerDraw, 0.75d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 46d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 4.7d),
                    new Pair<>(ItemEffect.EnginesCapacity, 32d),
                    new Pair<>(ItemEffect.EnginesRecharge, 3d),
                    new Pair<>(ItemEffect.SystemsCapacity, 32d),
                    new Pair<>(ItemEffect.SystemsRecharge, 3d)
            )),

    int_powerdistributor_size6_class5("6A Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 124d),
                    new Pair<>(ItemEffect.PowerDraw, 0.82d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 50d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 5.2d),
                    new Pair<>(ItemEffect.EnginesCapacity, 35d),
                    new Pair<>(ItemEffect.EnginesRecharge, 3.2d),
                    new Pair<>(ItemEffect.SystemsCapacity, 35d),
                    new Pair<>(ItemEffect.SystemsRecharge, 3.2d)
            )),

    int_powerdistributor_size7_class1("7E Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 118d),
                    new Pair<>(ItemEffect.PowerDraw, 0.59d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 41d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 4.1d),
                    new Pair<>(ItemEffect.EnginesCapacity, 27d),
                    new Pair<>(ItemEffect.EnginesRecharge, 2.6d),
                    new Pair<>(ItemEffect.SystemsCapacity, 27d),
                    new Pair<>(ItemEffect.SystemsRecharge, 2.6d)
            )),

    int_powerdistributor_size7_class2("7D Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.67d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 46d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 4.6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 31d),
                    new Pair<>(ItemEffect.EnginesRecharge, 3d),
                    new Pair<>(ItemEffect.SystemsCapacity, 31d),
                    new Pair<>(ItemEffect.SystemsRecharge, 3d)
            )),

    int_powerdistributor_size7_class3("7C Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.74d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 51d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 5.1d),
                    new Pair<>(ItemEffect.EnginesCapacity, 34d),
                    new Pair<>(ItemEffect.EnginesRecharge, 3.3d),
                    new Pair<>(ItemEffect.SystemsCapacity, 34d),
                    new Pair<>(ItemEffect.SystemsRecharge, 3.3d)
            )),

    int_powerdistributor_size7_class4("7B Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.81d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 56d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 5.6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 37d),
                    new Pair<>(ItemEffect.EnginesRecharge, 3.6d),
                    new Pair<>(ItemEffect.SystemsCapacity, 37d),
                    new Pair<>(ItemEffect.SystemsRecharge, 3.6d)
            )),

    int_powerdistributor_size7_class5("7A Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 144d),
                    new Pair<>(ItemEffect.PowerDraw, 0.89d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 61d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 6.1d),
                    new Pair<>(ItemEffect.EnginesCapacity, 41d),
                    new Pair<>(ItemEffect.EnginesRecharge, 4d),
                    new Pair<>(ItemEffect.SystemsCapacity, 41d),
                    new Pair<>(ItemEffect.SystemsRecharge, 4d)
            )),

    int_powerdistributor_size8_class1("8E Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 135d),
                    new Pair<>(ItemEffect.PowerDraw, 0.64d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 48d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 4.8d),
                    new Pair<>(ItemEffect.EnginesCapacity, 32d),
                    new Pair<>(ItemEffect.EnginesRecharge, 3.2d),
                    new Pair<>(ItemEffect.SystemsCapacity, 32d),
                    new Pair<>(ItemEffect.SystemsRecharge, 3.2d)
            )),

    int_powerdistributor_size8_class2("8D Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 0.72d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 54d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 5.4d),
                    new Pair<>(ItemEffect.EnginesCapacity, 36d),
                    new Pair<>(ItemEffect.EnginesRecharge, 3.6d),
                    new Pair<>(ItemEffect.SystemsCapacity, 36d),
                    new Pair<>(ItemEffect.SystemsRecharge, 3.6d)
            )),

    int_powerdistributor_size8_class3("8C Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 60d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 40d),
                    new Pair<>(ItemEffect.EnginesRecharge, 4d),
                    new Pair<>(ItemEffect.SystemsCapacity, 40d),
                    new Pair<>(ItemEffect.SystemsRecharge, 4d)
            )),

    int_powerdistributor_size8_class4("8B Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 256d),
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 0.88d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 66d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 6.6d),
                    new Pair<>(ItemEffect.EnginesCapacity, 44d),
                    new Pair<>(ItemEffect.EnginesRecharge, 4.4d),
                    new Pair<>(ItemEffect.SystemsCapacity, 44d),
                    new Pair<>(ItemEffect.SystemsRecharge, 4.4d)
            )),

    int_powerdistributor_size8_class5("8A Standard",
            ModificationType.Power_Distributor,
            ExperimentalType.Power_Distributor,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 165d),
                    new Pair<>(ItemEffect.PowerDraw, 0.96d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.WeaponsCapacity, 72d),
                    new Pair<>(ItemEffect.WeaponsRecharge, 7.2d),
                    new Pair<>(ItemEffect.EnginesCapacity, 48d),
                    new Pair<>(ItemEffect.EnginesRecharge, 4.8d),
                    new Pair<>(ItemEffect.SystemsCapacity, 48d),
                    new Pair<>(ItemEffect.SystemsRecharge, 4.8d)
            )),


    /**
     * Sensors
     *
     * Note: for this module type, ItemEffect.range is used as the "Typical Emission" value, there doesn't appear to be
     * a known enum value from frontier for typical emission, and range seems to be the most sensible value to use.
     *
     * todo: acquire some relevant mods and check what they appears as in the journal logs
     */

    int_sensors_size1_class1("1E Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 36d),
                    new Pair<>(ItemEffect.PowerDraw, 0.16d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4000d)
            )),

    int_sensors_size1_class2("1D Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4500d)
            )),

    int_sensors_size1_class3("1C Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5000d)
            )),

    int_sensors_size1_class4("1B Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.33d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5500d)
            )),

    int_sensors_size1_class5("1A Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 44d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6000d)
            )),

    int_sensors_size2_class1("2E Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 46d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4160d)
            )),

    int_sensors_size2_class2("2D Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, 0.21d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4680d)
            )),

    int_sensors_size2_class3("2C Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.23d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5200d)
            )),

    int_sensors_size2_class4("2B Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 61d),
                    new Pair<>(ItemEffect.PowerDraw, 0.38d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5720d)
            )),

    int_sensors_size2_class5("2A Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.69d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6240d)
            )),

    int_sensors_size3_class1("3E Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.22d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4320d)
            )),

    int_sensors_size3_class2("3D Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.25d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4860d)
            )),

    int_sensors_size3_class3("3C Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5400d)
            )),

    int_sensors_size3_class4("3B Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.46d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5940d)
            )),

    int_sensors_size3_class5("3A Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.PowerDraw, 0.84d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6480d)
            )),

    int_sensors_size4_class1("4E Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 72d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4480d)
            )),

    int_sensors_size4_class2("4D Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.31d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5040d)
            )),

    int_sensors_size4_class3("4C Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5600d)
            )),

    int_sensors_size4_class4("4B Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.56d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6160d)
            )),

    int_sensors_size4_class5("4A Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 88d),
                    new Pair<>(ItemEffect.PowerDraw, 1.02d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6720d)
            )),

    int_sensors_size5_class1("5E Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 86d),
                    new Pair<>(ItemEffect.PowerDraw, 0.33d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4640d)
            )),

    int_sensors_size5_class2("5D Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.37d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5220d)
            )),

    int_sensors_size5_class3("5C Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5800d)
            )),

    int_sensors_size5_class4("5B Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.PowerDraw, 0.68d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6380d)
            )),

    int_sensors_size5_class5("5A Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 106d),
                    new Pair<>(ItemEffect.PowerDraw, 1.23d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6960d)
            )),

    int_sensors_size6_class1("6E Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 102d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4800d)
            )),

    int_sensors_size6_class2("6D Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.45d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5400d)
            )),

    int_sensors_size6_class3("6C Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 113d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6000d)
            )),

    int_sensors_size6_class4("6B Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 136d),
                    new Pair<>(ItemEffect.PowerDraw, 0.83d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6600d)
            )),

    int_sensors_size6_class5("6A Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 124d),
                    new Pair<>(ItemEffect.PowerDraw, 1.5d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 7200d)
            )),

    int_sensors_size7_class1("7E Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 118d),
                    new Pair<>(ItemEffect.PowerDraw, 0.47d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 4960d)
            )),

    int_sensors_size7_class2("7D Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.53d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5580d)
            )),

    int_sensors_size7_class3("7C Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.59d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6200d)
            )),

    int_sensors_size7_class4("7B Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6820d)
            )),

    int_sensors_size7_class5("7A Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 144d),
                    new Pair<>(ItemEffect.PowerDraw, 1.77d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 7440d)
            )),

    int_sensors_size8_class1("8E Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 135d),
                    new Pair<>(ItemEffect.PowerDraw, 0.55d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5120d)
            )),

    int_sensors_size8_class2("8D Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 64d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 0.62d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 5760d)
            )),

    int_sensors_size8_class3("8C Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.PowerDraw, 0.69d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 6400d)
            )),

    int_sensors_size8_class4("8B Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 256d),
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 1.14d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 7040d)
            )),

    int_sensors_size8_class5("8A Standard",
            ModificationType.Sensors,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 160d),
                    new Pair<>(ItemEffect.Integrity, 165d),
                    new Pair<>(ItemEffect.PowerDraw, 2.07d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.SensorTargetScanAngle, 30d),
                    new Pair<>(ItemEffect.MaxRange, 8000d),
                    new Pair<>(ItemEffect.Range, 7680d)
            )),


    /**
     * Fuel Tanks
     */

    int_fueltank_size1_class3("1C Standard",
            null,
            null,
            new ItemEffects(new Pair<>(ItemEffect.FuelCapacity, 2d))),

    int_fueltank_size2_class3("2C Standard",
            null,
            null,
            new ItemEffects(new Pair<>(ItemEffect.FuelCapacity, 4d))),

    int_fueltank_size3_class3("3C Standard",
            null,
            null,
            new ItemEffects(new Pair<>(ItemEffect.FuelCapacity, 8d))),

    int_fueltank_size4_class3("4C Standard",
            null,
            null,
            new ItemEffects(new Pair<>(ItemEffect.FuelCapacity, 16d))),

    int_fueltank_size5_class3("5C Standard",
            null,
            null,
            new ItemEffects(new Pair<>(ItemEffect.FuelCapacity, 32d))),

    int_fueltank_size6_class3("6C Standard",
            null,
            null,
            new ItemEffects(new Pair<>(ItemEffect.FuelCapacity, 64d))),

    int_fueltank_size7_class3("7C Standard",
            null,
            null,
            new ItemEffects(new Pair<>(ItemEffect.FuelCapacity, 128d))),

    int_fueltank_size8_class3("8C Standard",
            null,
            null,
            new ItemEffects(new Pair<>(ItemEffect.FuelCapacity, 256d))),


    /**
     * Guardian Equipment
     */

    // todo: find ENUM value for this
    // Guardian Hybrid Power Distributor

    int_guardianpowerplant_size2("2A Hybrid",
            null,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 1.5d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerCapacity, 12.7d),
                    new Pair<>(ItemEffect.HeatEfficiency, 0.5d)
            )),

    int_guardianpowerplant_size3("3A Hybrid",
            null,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 2.9d),
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.PowerCapacity, 15.8d),
                    new Pair<>(ItemEffect.HeatEfficiency, 0.5d)
            )),

    int_guardianpowerplant_size4("4A Hybrid",
            null,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 5.9d),
                    new Pair<>(ItemEffect.Integrity, 88d),
                    new Pair<>(ItemEffect.PowerCapacity, 20.6d),
                    new Pair<>(ItemEffect.HeatEfficiency, 0.5d)
            )),

    int_guardianpowerplant_size5("5A Hybrid",
            null,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 11.7d),
                    new Pair<>(ItemEffect.Integrity, 106d),
                    new Pair<>(ItemEffect.PowerCapacity, 26.9d),
                    new Pair<>(ItemEffect.HeatEfficiency, 0.5d)
            )),

    int_guardianpowerplant_size6("6A Hybrid",
            null,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 23.4d),
                    new Pair<>(ItemEffect.Integrity, 124d),
                    new Pair<>(ItemEffect.PowerCapacity, 33.3d),
                    new Pair<>(ItemEffect.HeatEfficiency, 0.5d)
            )),

    int_guardianpowerplant_size7("7A Hybrid",
            null,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 46.8d),
                    new Pair<>(ItemEffect.Integrity, 144d),
                    new Pair<>(ItemEffect.PowerCapacity, 39.6d),
                    new Pair<>(ItemEffect.HeatEfficiency, 0.5d)
            )),

    int_guardianpowerplant_size8("8A Hybrid",
            null,
            null,
            new ItemEffects(
                    new Pair<>(ItemEffect.Mass, 93.6d),
                    new Pair<>(ItemEffect.Integrity, 165d),
                    new Pair<>(ItemEffect.PowerCapacity, 47.5d),
                    new Pair<>(ItemEffect.HeatEfficiency, 0.5d)
            )),

    ;

    private final String text;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;
    private final ItemEffects itemEffects;

    CoreInternalModule(String text, ProcurementType modificationType, ProcurementType experimentalType, ItemEffects itemEffects)
    {
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.text = text;
        this.itemEffects = itemEffects;
    }

    public ProcurementType modificationType()
    {
        return modificationType;
    }

    public ProcurementType experimentalType()
    {
        return experimentalType;
    }

    @Override
    public ItemEffects itemEffects()
    {
        return itemEffects;
    }

    @Override
    public String displayText()
    {
        return text;
    }

    public static ShipModule findModule(String moduleName) throws Exception
    {
        final Exception exception;
        try
        {
            return valueOf(moduleName);
        }
        catch (Exception e)
        {
            exception = e;
            if (moduleName == null || moduleName.isEmpty()) throw e;
        }

        return Arrays.stream(CoreInternalModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(()->exception);
    }
}
