package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/25/2018.
 */
@SuppressWarnings("unchecked")
public enum OptionalInternalShieldModule implements ShipModule
{
    /**
     * Shield Generators:
     *
     * Includes Standard, Bi-Weave, and Prismatic
     */

//    int_shieldgenerator_size1_class1("1A Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 1.3d),
//                    new ItemEffectData(ItemEffect.Integrity, 48d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 1.68d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 13d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 25d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 63d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),

//    int_shieldgenerator_size1_class3_fast("1C Bi-Weave Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 1.3d),
//                    new ItemEffectData(ItemEffect.Integrity, 40d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 1.2d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 13d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 25d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 63d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.4d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),

//    int_shieldgenerator_size1_class5_strong("1A Prismatic Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 2.6d),
//                    new ItemEffectData(ItemEffect.Integrity, 48d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 2.52d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 13d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 25d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 63d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.2d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),

//    int_shieldgenerator_size2_class1("2E Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 2.5d),
//                    new ItemEffectData(ItemEffect.Integrity, 41d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 0.9d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 80d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),

//    int_shieldgenerator_size2_class2("2D Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 1d),
//                    new ItemEffectData(ItemEffect.Integrity, 31d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 1.2d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),
//
//    int_shieldgenerator_size2_class3("2C Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 2.5d),
//                    new ItemEffectData(ItemEffect.Integrity, 51d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 1.5d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 100d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),
//
//    int_shieldgenerator_size2_class4("2B Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 4d),
//                    new ItemEffectData(ItemEffect.Integrity, 71d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 1.8d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 110d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),
//
//    int_shieldgenerator_size2_class5("2A Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 2.5d),
//                    new ItemEffectData(ItemEffect.Integrity, 61d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 2.1d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),
//
//    int_shieldgenerator_size2_class3_fast("2C Bi-Weave Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 2.5d),
//                    new ItemEffectData(ItemEffect.Integrity, 51d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 1.5d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.4d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),
//
//    int_shieldgenerator_size2_class5_strong("2A Prismatic Shield Generator",
//            ModificationType.Shield_Generator,
//            ExperimentalType.Shield_Generator,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 5d),
//                    new ItemEffectData(ItemEffect.Integrity, 61d),
//                    new ItemEffectData(ItemEffect.PowerDraw, 3.15d),
//                    new ItemEffectData(ItemEffect.BootTime, 1d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 28d),
//                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 55d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 138d),
//                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
//                    new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
//                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
//                    new ItemEffectData(ItemEffect.RegenRate, 1d),
//                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.2d),
//                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
//                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
//                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
//                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
//                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
//            )),


    int_shieldgenerator_size3_class1("3E Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 51d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.08d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 80d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.87d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size3_class2("3D Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 38d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.44d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.87d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size3_class3("3C Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 64d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.8d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.87d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size3_class4("3B Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.16d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 110d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.87d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size3_class5("3A Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.52d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.87d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size3_class3_fast("3C Bi-Weave Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 64d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.8d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.805d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size3_class5_strong("3A Prismatic Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.78d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 83d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 165d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 413d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.3d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),




    int_shieldgenerator_size4_class1("4E Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Integrity, 64d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.32d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 80d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.53d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size4_class2("4D Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.Integrity, 48d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.76d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.53d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size4_class3("4C Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Integrity, 80d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.2d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.53d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size4_class4("4B Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.Integrity, 112d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.64d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 110d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.53d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size4_class5("4A Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.08d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.53d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size4_class3_fast("4C Bi-Weave Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Integrity, 80d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.2d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 3.795d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size4_class5_strong("4A Prismatic Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4.62d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 143d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 285d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 713d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 1.66d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),



    int_shieldgenerator_size5_class1("5E Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.56d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 80d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 3.75d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size5_class2("5D Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 58d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.08d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 3.75d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size5_class3("5C Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.6d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 3.75d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size5_class4("5B Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 134d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.12d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 110d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 3.75d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size5_class5("5A Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 115d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.64d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 3.75d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size5_class3_fast("5C Bi-Weave Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.6d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 2.2d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 5.625d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size5_class5_strong("5A Prismatic Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.Integrity, 115d),
                    new ItemEffectData(ItemEffect.PowerDraw, 5.46d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 203d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 405d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1013d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 2.34d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),



    int_shieldgenerator_size6_class1("6E Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.86d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 80d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.3d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 5.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size6_class2("6D Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.Integrity, 68d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.48d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.3d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 5.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size6_class3("6C Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.Integrity, 113d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.1d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.3d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 5.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size6_class4("6B Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 64d),
                    new ItemEffectData(ItemEffect.Integrity, 158d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.72d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 110d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.3d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 5.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size6_class5("6A Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.Integrity, 136d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4.34d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.3d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 5.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size6_class3_fast("6C Bi-Weave Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.Integrity, 113d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.1d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 3.2d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 7.995d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size6_class5_strong("6A Prismatic Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 136d),
                    new ItemEffectData(ItemEffect.PowerDraw, 6.51d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 270d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 540d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 1350d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
                    new ItemEffectData(ItemEffect.RegenRate, 1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 3.2d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),



    int_shieldgenerator_size7_class1("7E Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 105d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.1d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 80d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 7.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size7_class2("7D Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 79d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.8d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 7.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size7_class3("7C Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 131d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.5d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 7.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size7_class4("7B Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Integrity, 183d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4.2d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 110d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 7.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size7_class5("7A Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4.9d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.8d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 7.33d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size7_class3_fast("7C Bi-Weave Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 131d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.5d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 4.4d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 10.995d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size7_class5_strong("7A Prismatic Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 160d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 7.35d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 530d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1060d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 2650d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.1d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 4.25d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),




    int_shieldgenerator_size8_class1("8E Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 160d),
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.4d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 30d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 80d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 130d),
                    new ItemEffectData(ItemEffect.RegenRate, 2.4d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 9.6d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size8_class2("8D Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 64d),
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.PowerDraw, 3.2d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 2.4d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 9.6d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size8_class3("8C Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 160d),
                    new ItemEffectData(ItemEffect.Integrity, 150d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 50d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 150d),
                    new ItemEffectData(ItemEffect.RegenRate, 2.4d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 9.6d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size8_class4("8B Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 256d),
                    new ItemEffectData(ItemEffect.Integrity, 210d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4.8d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 60d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 110d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 160d),
                    new ItemEffectData(ItemEffect.RegenRate, 2.4d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 9.6d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size8_class5("8A Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 160d),
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 5.6d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
                    new ItemEffectData(ItemEffect.RegenRate, 2.4d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 9.6d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size8_class3_fast("8c Bi-Weave Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 160d),
                    new ItemEffectData(ItemEffect.Integrity, 150d),
                    new ItemEffectData(ItemEffect.PowerDraw, 4d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 40d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 90d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 140d),
                    new ItemEffectData(ItemEffect.RegenRate, 5.8d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 14.4d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),

    int_shieldgenerator_size8_class5_strong("8A Prismatic Shield Generator",
            ModificationType.Shield_Generator,
            ExperimentalType.Shield_Generator,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 320d),
                    new ItemEffectData(ItemEffect.Integrity, 180d),
                    new ItemEffectData(ItemEffect.PowerDraw, 8.4d),
                    new ItemEffectData(ItemEffect.BootTime, 1d),
                    new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 900d),
                    new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 1800d),
                    new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 4500d),
                    new ItemEffectData(ItemEffect.ShieldGenMinStrength, 100d),
                    new ItemEffectData(ItemEffect.ShieldGenStrength, 150d),
                    new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 200d),
                    new ItemEffectData(ItemEffect.RegenRate, 1.4d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 5.4d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                    new ItemEffectData(ItemEffect.KineticResistance, 40d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
            )),




    /**
     * Shield Cell Bank
     */

    int_shieldcellbank_size1_class1("1E Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,1.3d),
                    new ItemEffectData(ItemEffect.Integrity,32d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.41d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,12d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,170d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1d)
            )),

    int_shieldcellbank_size1_class2("1D Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,0.5d),
                    new ItemEffectData(ItemEffect.Integrity,24d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.55d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,16d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,170d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,1d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1d)
            )),

    int_shieldcellbank_size1_class3("1C Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,1.3d),
                    new ItemEffectData(ItemEffect.Integrity,40d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.69d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,20d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,170d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,2d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1d)
            )),

    int_shieldcellbank_size1_class4("1B Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,2d),
                    new ItemEffectData(ItemEffect.Integrity,56d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.83d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,24d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,170d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1d)
            )),

    int_shieldcellbank_size1_class5("1A Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,1.3d),
                    new ItemEffectData(ItemEffect.Integrity,48d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.97d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,28d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,170d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,2d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1d)
            )),


    int_shieldcellbank_size2_class1("2E Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,2.5d),
                    new ItemEffectData(ItemEffect.Integrity,41d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.5d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,14d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,240d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1.5d)
            )),

    int_shieldcellbank_size2_class2("2D Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,1d),
                    new ItemEffectData(ItemEffect.Integrity,31d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.67d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,18d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,240d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,2d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1.5d)
            )),

    int_shieldcellbank_size2_class3("2C Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,2.5d),
                    new ItemEffectData(ItemEffect.Integrity,51d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.84d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,23d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,240d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1.5d)
            )),

    int_shieldcellbank_size2_class4("2B Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,4d),
                    new ItemEffectData(ItemEffect.Integrity,71d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.01d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,28d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,240d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1.5d)
            )),

    int_shieldcellbank_size2_class5("2A Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,2.5d),
                    new ItemEffectData(ItemEffect.Integrity,61d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.18d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,32d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,240d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,1.5d)
            )),


    int_shieldcellbank_size3_class1("3E Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,5d),
                    new ItemEffectData(ItemEffect.Integrity,51d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.61d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,17d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,340d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,2.3d)
            )),

    int_shieldcellbank_size3_class2("3D Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,2d),
                    new ItemEffectData(ItemEffect.Integrity,38d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.82d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,23d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,340d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,2d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,2.3d)
            )),

    int_shieldcellbank_size3_class3("3C Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,5d),
                    new ItemEffectData(ItemEffect.Integrity,64d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.02d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,29d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,340d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,2.3d)
            )),

    int_shieldcellbank_size3_class4("3B Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,8d),
                    new ItemEffectData(ItemEffect.Integrity,90d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.22d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,35d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,340d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,2.3d)
            )),

    int_shieldcellbank_size3_class5("3A Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,5d),
                    new ItemEffectData(ItemEffect.Integrity,77d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.43d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,41d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,340d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,2.3d)
            )),


    int_shieldcellbank_size4_class1("4E Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,10d),
                    new ItemEffectData(ItemEffect.Integrity,64d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.74d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,20d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,410d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,3.4d)
            )),

    int_shieldcellbank_size4_class2("4D Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,4d),
                    new ItemEffectData(ItemEffect.Integrity,48d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.98d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,26d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,410d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,2d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,3.4d)
            )),

    int_shieldcellbank_size4_class3("4C Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,10d),
                    new ItemEffectData(ItemEffect.Integrity,80d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.23d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,33d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,410d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,3.4d)
            )),

    int_shieldcellbank_size4_class4("4B Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,16d),
                    new ItemEffectData(ItemEffect.Integrity,112d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.48d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,39d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,410d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,3.4d)
            )),

    int_shieldcellbank_size4_class5("4A Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,10d),
                    new ItemEffectData(ItemEffect.Integrity,96d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.72d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,46d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,410d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,3.4d)
            )),


    int_shieldcellbank_size5_class1("5E Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,20d),
                    new ItemEffectData(ItemEffect.Integrity,77d),
                    new ItemEffectData(ItemEffect.PowerDraw,0.9d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,21d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,540d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,5.1d)
            )),

    int_shieldcellbank_size5_class2("5D Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,8d),
                    new ItemEffectData(ItemEffect.Integrity,58d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.2d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,28d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,540d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,2d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,5.1d)
            )),

    int_shieldcellbank_size5_class3("5C Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,20d),
                    new ItemEffectData(ItemEffect.Integrity,96d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.5d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,35d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,540d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,5.1d)
            )),

    int_shieldcellbank_size5_class4("5B Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,32d),
                    new ItemEffectData(ItemEffect.Integrity,134d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.8d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,41d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,540d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,5.1d)
            )),

    int_shieldcellbank_size5_class5("5A Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,20d),
                    new ItemEffectData(ItemEffect.Integrity,115d),
                    new ItemEffectData(ItemEffect.PowerDraw,2.1d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,48d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,540d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,5.1d)
            )),


    int_shieldcellbank_size6_class1("6E Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,40d),
                    new ItemEffectData(ItemEffect.Integrity,90d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.06d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,20d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,640d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,5d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,7.6d)
            )),

    int_shieldcellbank_size6_class2("6D Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,16d),
                    new ItemEffectData(ItemEffect.Integrity,68d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.42d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,26d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,640d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,7.6d)
            )),

    int_shieldcellbank_size6_class3("6C Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,40d),
                    new ItemEffectData(ItemEffect.Integrity,113d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.77d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,33d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,640d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,7.6d)
            )),

    int_shieldcellbank_size6_class4("6B Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,64d),
                    new ItemEffectData(ItemEffect.Integrity,158d),
                    new ItemEffectData(ItemEffect.PowerDraw,2.12d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,39d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,640d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,5d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,7.6d)
            )),

    int_shieldcellbank_size6_class5("6A Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,40d),
                    new ItemEffectData(ItemEffect.Integrity,136d),
                    new ItemEffectData(ItemEffect.PowerDraw,2.48d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,46d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,640d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,7.6d)
            )),


    int_shieldcellbank_size7_class1("7E Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,80d),
                    new ItemEffectData(ItemEffect.Integrity,105d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.24d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,24d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,720d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,5d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,11.4d)
            )),

    int_shieldcellbank_size7_class2("7D Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,32d),
                    new ItemEffectData(ItemEffect.Integrity,79d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.66d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,32d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,720d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,11.4d)
            )),

    int_shieldcellbank_size7_class3("7C Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,80d),
                    new ItemEffectData(ItemEffect.Integrity,131d),
                    new ItemEffectData(ItemEffect.PowerDraw,2.07d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,41d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,720d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,11.4d)
            )),

    int_shieldcellbank_size7_class4("7B Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,128d),
                    new ItemEffectData(ItemEffect.Integrity,183d),
                    new ItemEffectData(ItemEffect.PowerDraw,2.48d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,49d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,720d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,5d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,11.4d)
            )),

    int_shieldcellbank_size7_class5("7A Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,80d),
                    new ItemEffectData(ItemEffect.Integrity,157d),
                    new ItemEffectData(ItemEffect.PowerDraw,2.9d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,57d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,720d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,11.4d)
            )),


    int_shieldcellbank_size8_class1("8E Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,160d),
                    new ItemEffectData(ItemEffect.Integrity,120d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.44d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,28d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,800d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,5d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,17.1d)
            )),

    int_shieldcellbank_size8_class2("8D Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,64d),
                    new ItemEffectData(ItemEffect.Integrity,90d),
                    new ItemEffectData(ItemEffect.PowerDraw,1.92d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,37d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,800d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,3d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,17.1d)
            )),

    int_shieldcellbank_size8_class3("8C Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,160d),
                    new ItemEffectData(ItemEffect.Integrity,150d),
                    new ItemEffectData(ItemEffect.PowerDraw,2.4d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,47d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,800d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,17.1d)
            )),

    int_shieldcellbank_size8_class4("8B Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,256d),
                    new ItemEffectData(ItemEffect.Integrity,210d),
                    new ItemEffectData(ItemEffect.PowerDraw,2.88d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,56d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,800d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,5d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,17.1d)
            )),

    int_shieldcellbank_size8_class5("8A Shield Cell Bank",
            ModificationType.Shield_Cell_Bank,
            ExperimentalType.Shield_Cell_Bank,
                        new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass,160d),
                    new ItemEffectData(ItemEffect.Integrity,180d),
                    new ItemEffectData(ItemEffect.PowerDraw,3.36d),
                    new ItemEffectData(ItemEffect.BootTime,25d),
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp,5d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement,65d),
                    new ItemEffectData(ItemEffect.ShieldBankHeat,800d),
                    new ItemEffectData(ItemEffect.AmmoClipSize,1d),
                    new ItemEffectData(ItemEffect.AmmoMaximum,4d),
                    new ItemEffectData(ItemEffect.ShieldBankDuration,17.1d)
            )),




    /*
    gUARDIAN bOOSTERSD
     */

    int_guardianshieldreinforcement_size1_class1("1E Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 44d)
            )),

    int_guardianshieldreinforcement_size1_class2("1D Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.46d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 61d)
            )),

    int_guardianshieldreinforcement_size2_class1("2E Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.56d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 83d)
            )),

    int_guardianshieldreinforcement_size2_class2("2D Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.67d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 105d)
            )),


    int_guardianshieldreinforcement_size3_class1("3E Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.74d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 127d)
            )),

    int_guardianshieldreinforcement_size3_class2("3D Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.84d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 143d)
            )),

    int_guardianshieldreinforcement_size4_class1("4E Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.95d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 165d)
            )),

    int_guardianshieldreinforcement_size4_class2("4D Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.05d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 182d)
            )),

    int_guardianshieldreinforcement_size5_class1("5E Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.16d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 198d)
            )),

    int_guardianshieldreinforcement_size5_class2("5D Guardian Shield Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.26d),
                    new ItemEffectData(ItemEffect.Integrity, 36d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldAddition, 215d)
            )),

    ;

    private final String displayText;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;
    private final ItemEffects itemEffects;

    OptionalInternalShieldModule(String displayText, ProcurementType modificationType, ProcurementType experimentalType, ItemEffects itemEffects)
    {
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.displayText = displayText;
        this.itemEffects = itemEffects;
    }

    @Override
    public ProcurementType modificationType()
    {
        return modificationType;
    }

    @Override
    public ProcurementType experimentalType()
    {
        return experimentalType;
    }

    @Override
    public String displayText()
    {
        return displayText;
    }


    @Override
    public ItemEffects itemEffects()
    {
        return itemEffects;
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

        return Arrays.stream(OptionalInternalShieldModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(()->exception);
    }
}
