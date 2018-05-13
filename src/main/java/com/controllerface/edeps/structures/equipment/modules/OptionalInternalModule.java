package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.edeps.structures.craftable.modifications.ModificationType;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import javafx.util.Pair;

import java.util.Arrays;

/**
 * Created by Stephen on 4/25/2018.
 */
@SuppressWarnings("unchecked")
public enum OptionalInternalModule implements ShipModule
{

    /**
     * Automated Field Maintenance Unit
     */

    int_repairer_size1_class1("1E Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.54d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 1000d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.012d)
            )),

    int_repairer_size1_class2("1D Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.72d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 900d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.016d)
            )),

    int_repairer_size1_class3("1C Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.9d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 1000d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.02d)
            )),

    int_repairer_size1_class4("1B Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 1.04d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 1200d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.023d)
            )),

    int_repairer_size1_class5("1A Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 46d),
                    new Pair<>(ItemEffect.PowerDraw, 1.26d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 1100d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.028d)
            )),


    int_repairer_size2_class1("2E Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, 0.68d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 2300d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.012d)
            )),

    int_repairer_size2_class2("2D Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 31d),
                    new Pair<>(ItemEffect.PowerDraw, 0.9d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 2100d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.016d)
            )),

    int_repairer_size2_class3("2C Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 1.13d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 2300d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.02d)
            )),

    int_repairer_size2_class4("2B Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 71d),
                    new Pair<>(ItemEffect.PowerDraw, 1.29d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 2800d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.023d)
            )),

    int_repairer_size2_class5("2A Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 59d),
                    new Pair<>(ItemEffect.PowerDraw, 1.58d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 2500d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.028d)
            )),


    int_repairer_size3_class1("3E Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.81d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 3600d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.012d)
            )),

    int_repairer_size3_class2("3D Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 1.08d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 3200d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.016d)
            )),

    int_repairer_size3_class3("3C Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 1.35d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 3600d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.02d)
            )),

    int_repairer_size3_class4("3B Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 1.55d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 4300d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.023d)
            )),

    int_repairer_size3_class5("3A Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 74d),
                    new Pair<>(ItemEffect.PowerDraw, 1.89d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 4000d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.028d)
            )),


    int_repairer_size4_class1("4E Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.99d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 4900d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.012d)
            )),

    int_repairer_size4_class2("4D Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 1.32d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 4400d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.016d)
            )),

    int_repairer_size4_class3("4C Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 1.65d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 4900d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.02d)
            )),

    int_repairer_size4_class4("4B Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 112d),
                    new Pair<>(ItemEffect.PowerDraw, 1.9d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 5900d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.023d)
            )),

    int_repairer_size4_class5("4A Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 92d),
                    new Pair<>(ItemEffect.PowerDraw, 2.31d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 5400d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.028d)
            )),


    int_repairer_size5_class1("5E Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 1.17d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 6100d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.012d)
            )),

    int_repairer_size5_class2("5D Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 1.56d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 5500d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.016d)
            )),

    int_repairer_size5_class3("5C Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 1.95d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 6100d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.02d)
            )),

    int_repairer_size5_class4("5B Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 134d),
                    new Pair<>(ItemEffect.PowerDraw, 2.24d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 7300d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.023d)
            )),

    int_repairer_size5_class5("5A Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 110d),
                    new Pair<>(ItemEffect.PowerDraw, 2.73d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 6700d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.028d)
            )),


    int_repairer_size6_class1("6E Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 1.4d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 7400d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.012d)
            )),

    int_repairer_size6_class2("6D Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 68d),
                    new Pair<>(ItemEffect.PowerDraw, 1.86d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 6700d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.016d)
            )),

    int_repairer_size6_class3("6C Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 113d),
                    new Pair<>(ItemEffect.PowerDraw, 2.33d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 7400d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.02d)
            )),

    int_repairer_size6_class4("6B Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 158d),
                    new Pair<>(ItemEffect.PowerDraw, 2.67d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 8900d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.023d)
            )),

    int_repairer_size6_class5("6A Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 130d),
                    new Pair<>(ItemEffect.PowerDraw, 3.26d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 8100d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.028d)
            )),


    int_repairer_size7_class1("7E Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 1.58d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 8700d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.012d)
            )),

    int_repairer_size7_class2("7D Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 79d),
                    new Pair<>(ItemEffect.PowerDraw, 2.1d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 7800d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.016d)
            )),

    int_repairer_size7_class3("7C Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 2.63d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 8700d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.02d)
            )),

    int_repairer_size7_class4("7B Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 183d),
                    new Pair<>(ItemEffect.PowerDraw, 3.02d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 10400d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.023d)
            )),

    int_repairer_size7_class5("7A Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 151d),
                    new Pair<>(ItemEffect.PowerDraw, 3.68d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 9600d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.028d)
            )),


    int_repairer_size8_class1("8E Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 1.8d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 10000d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.012d)
            )),

    int_repairer_size8_class2("8D Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 2.4d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 9000d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.016d)
            )),

    int_repairer_size8_class3("8C Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.PowerDraw, 3d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 10000d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.02d)
            )),

    int_repairer_size8_class4("8B Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 210d),
                    new Pair<>(ItemEffect.PowerDraw, 3.45d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 12000d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.023d)
            )),

    int_repairer_size8_class5("8A Automated Field Maintenance Unit",
            ModificationType.Auto_Field_Maintenence_Unit,
            null,
                    new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 173d),
                    new Pair<>(ItemEffect.PowerDraw, 4.2d),
                    new Pair<>(ItemEffect.BootTime, 9d),
                    new Pair<>(ItemEffect.AFMRepairCapacity, 11000d),
                    new Pair<>(ItemEffect.AFMRepairConsumption, 10d),
                    new Pair<>(ItemEffect.AFMRepairPerAmmo, 0.028d)
            )),



    /**
     * Hull Reinforcement Packages
     */

    int_hullreinforcement_size1_class1("1E Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 80d),
                    new Pair<>(ItemEffect.KineticResistance, 0.5d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.5d)
            )),


    int_hullreinforcement_size1_class2("1D Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 110d),
                    new Pair<>(ItemEffect.KineticResistance, 0.5d),
                    new Pair<>(ItemEffect.ThermicResistance, 0.5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 0.5d)
            )),


    int_hullreinforcement_size2_class1("2E Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 150d),
                    new Pair<>(ItemEffect.KineticResistance, 1d),
                    new Pair<>(ItemEffect.ThermicResistance, 1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 1d)
            )),

    int_hullreinforcement_size2_class2("2D Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 190d),
                    new Pair<>(ItemEffect.KineticResistance, 1d),
                    new Pair<>(ItemEffect.ThermicResistance, 1d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 1d)
            )),


    int_hullreinforcement_size3_class1("3E Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 230d),
                    new Pair<>(ItemEffect.KineticResistance, 1.5d),
                    new Pair<>(ItemEffect.ThermicResistance, 1.5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 1.5d)
            )),

    int_hullreinforcement_size3_class2("3D Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 260d),
                    new Pair<>(ItemEffect.KineticResistance, 1.5d),
                    new Pair<>(ItemEffect.ThermicResistance, 1.5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 1.5d)
            )),


    int_hullreinforcement_size4_class1("4E Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 300d),
                    new Pair<>(ItemEffect.KineticResistance, 2d),
                    new Pair<>(ItemEffect.ThermicResistance, 2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 2d)
            )),

    int_hullreinforcement_size4_class2("4D Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 330d),
                    new Pair<>(ItemEffect.KineticResistance, 2d),
                    new Pair<>(ItemEffect.ThermicResistance, 2d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 2d)
            )),


    int_hullreinforcement_size5_class1("5E Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 360d),
                    new Pair<>(ItemEffect.KineticResistance, 2.5d),
                    new Pair<>(ItemEffect.ThermicResistance, 2.5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 2.5d)
            )),

    int_hullreinforcement_size5_class2("5D Hull Reinforcement Package",
            ModificationType.Hull_Reinforcement_Package,
            ExperimentalType.Hull_Reinforcement_Package,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 390d),
                    new Pair<>(ItemEffect.KineticResistance, 2.5d),
                    new Pair<>(ItemEffect.ThermicResistance, 2.5d),
                    new Pair<>(ItemEffect.ExplosiveResistance, 2.5d)
            )),


    /**
     * Module Reinforcement Packages
     */

    int_modulereinforcement_size1_class1("1E Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_modulereinforcement_size1_class2("1D Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    int_modulereinforcement_size2_class1("2E Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_modulereinforcement_size2_class2("2D Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    int_modulereinforcement_size3_class1("3E Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 170d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_modulereinforcement_size3_class2("3D Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 155d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    int_modulereinforcement_size4_class1("4E Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 260d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_modulereinforcement_size4_class2("4D Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 235d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    int_modulereinforcement_size5_class1("5E Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 385d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_modulereinforcement_size5_class2("5D Module Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 350d),
                    new Pair<>(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    /**
     * Fuel Scoops
     */

    int_fuelscoop_size1_class1("1E Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.14d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.018d)
            )),

    int_fuelscoop_size1_class2("1D Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.024d)
            )),

    int_fuelscoop_size1_class3("1C Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.23d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.03d)
            )),

    int_fuelscoop_size1_class4("1B Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.036d)
            )),

    int_fuelscoop_size1_class5("1A Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.042d)
            )),


    int_fuelscoop_size2_class1("2E Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, 0.17d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.032d)
            )),

    int_fuelscoop_size2_class2("2D Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 31d),
                    new Pair<>(ItemEffect.PowerDraw, 0.22d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.043d)
            )),

    int_fuelscoop_size2_class3("2C Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.054d)
            )),

    int_fuelscoop_size2_class4("2B Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 70d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.065d)
            )),

    int_fuelscoop_size2_class5("2A Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 61d),
                    new Pair<>(ItemEffect.PowerDraw, 0.39d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.075d)
            )),


    int_fuelscoop_size3_class1("3E Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.075d)
            )),

    int_fuelscoop_size3_class2("3D Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.1d)
            )),

    int_fuelscoop_size3_class3("3C Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.126d)
            )),

    int_fuelscoop_size3_class4("3B Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.151d)
            )),

    int_fuelscoop_size3_class5("3A Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.176d)
            )),


    int_fuelscoop_size4_class1("4E Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.25d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.147d)
            )),

    int_fuelscoop_size4_class2("4D Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.33d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.196d)
            )),

    int_fuelscoop_size4_class3("4C Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.245d)
            )),

    int_fuelscoop_size4_class4("4B Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 112d),
                    new Pair<>(ItemEffect.PowerDraw, 0.49d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.294d)
            )),

    int_fuelscoop_size4_class5("4A Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.57d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.342d)
            )),


    int_fuelscoop_size5_class1("5E Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.247d)
            )),

    int_fuelscoop_size5_class2("5D Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.33d)
            )),

    int_fuelscoop_size5_class3("5C Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.412d)
            )),

    int_fuelscoop_size5_class4("5B Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 134d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.494d)
            )),

    int_fuelscoop_size5_class5("5A Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.PowerDraw, 0.7d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.577d)
            )),


    int_fuelscoop_size6_class1("6E Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.35d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.376d)
            )),

    int_fuelscoop_size6_class2("6D Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 68d),
                    new Pair<>(ItemEffect.PowerDraw, 0.47d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.502d)
            )),

    int_fuelscoop_size6_class3("6C Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 113d),
                    new Pair<>(ItemEffect.PowerDraw, 0.59d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.627d)
            )),

    int_fuelscoop_size6_class4("6B Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 158d),
                    new Pair<>(ItemEffect.PowerDraw, 0.71d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.752d)
            )),

    int_fuelscoop_size6_class5("6A Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 136d),
                    new Pair<>(ItemEffect.PowerDraw, 0.83d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.878d)
            )),


    int_fuelscoop_size7_class1("7E Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.534d)
            )),

    int_fuelscoop_size7_class2("7D Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 79d),
                    new Pair<>(ItemEffect.PowerDraw, 0.55d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.712d)
            )),

    int_fuelscoop_size7_class3("7C Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.69d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.89d)
            )),

    int_fuelscoop_size7_class4("7B Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 183d),
                    new Pair<>(ItemEffect.PowerDraw, 0.83d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 1.068d)
            )),

    int_fuelscoop_size7_class5("7A Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 1.245d)
            )),


    int_fuelscoop_size8_class1("8E Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.72d)
            )),

    int_fuelscoop_size8_class2("8D Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.64d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 0.96d)
            )),

    int_fuelscoop_size8_class3("8C Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 150d),
                    new Pair<>(ItemEffect.PowerDraw, 0.8d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 1.2d)
            )),

    int_fuelscoop_size8_class4("8B Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 210d),
                    new Pair<>(ItemEffect.PowerDraw, 0.96d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 1.44d)
            )),

    int_fuelscoop_size8_class5("8A Fuel Scoop",
            ModificationType.Fuel_Scoop,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 180d),
                    new Pair<>(ItemEffect.PowerDraw, 1.12d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.FuelScoopRate, 1.68d)
            )),



    /**
     * Refineries
     */

    int_refinery_size1_class1("1E Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.14d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 1d)
            )),

    int_refinery_size1_class2("1D Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 1d)
            )),

    int_refinery_size1_class3("1C Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.23d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 2d)
            )),

    int_refinery_size1_class4("1B Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 3d)
            )),

    int_refinery_size1_class5("1A Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 4d)
            )),


    int_refinery_size2_class1("2E Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, 0.17d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 2d)
            )),

    int_refinery_size2_class2("2D Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 31d),
                    new Pair<>(ItemEffect.PowerDraw, 0.22d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 3d)
            )),

    int_refinery_size2_class3("2C Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 4d)
            )),

    int_refinery_size2_class4("2B Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 71d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 5d)
            )),

    int_refinery_size2_class5("2A Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 61d),
                    new Pair<>(ItemEffect.PowerDraw, 0.39d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 6d)
            )),


    int_refinery_size3_class1("3E Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 3d)
            )),

    int_refinery_size3_class2("3D Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 4d)
            )),

    int_refinery_size3_class3("3C Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 6d)
            )),

    int_refinery_size3_class4("3B Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 7d)
            )),

    int_refinery_size3_class5("3A Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 8d)
            )),


    int_refinery_size4_class1("4E Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.25d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 4d)
            )),

    int_refinery_size4_class2("4D Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.33d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 5d)
            )),

    int_refinery_size4_class3("4C Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 7d)
            )),

    int_refinery_size4_class4("4B Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 112d),
                    new Pair<>(ItemEffect.PowerDraw, 0.49d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 9d)
            )),

    int_refinery_size4_class5("4A Refinery",
            ModificationType.Refinery,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.57d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.RefineryBins, 10d)
            )),



    /**
     * FSD Interdictors
     */

    int_fsdinterdictor_size1_class1("1E Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.14d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 3d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size1_class2("1D Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 4d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size1_class3("1C Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.23d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 5d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size1_class4("1B Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 6d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size1_class5("1A Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 7d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),


    int_fsdinterdictor_size2_class1("2E Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 41d),
                    new Pair<>(ItemEffect.PowerDraw, 0.17d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 6d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size2_class2("2D Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Integrity, 31d),
                    new Pair<>(ItemEffect.PowerDraw, 0.22d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 7d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size2_class3("2C Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 8d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size2_class4("2B Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 71d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 9d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size2_class5("2A Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.Integrity, 61d),
                    new Pair<>(ItemEffect.PowerDraw, 0.39d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 10d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),


    int_fsdinterdictor_size3_class1("3E Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 9d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size3_class2("3D Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 10d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size3_class3("3C Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 11d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size3_class4("3B Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 12d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size3_class5("3A Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 13d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),


    int_fsdinterdictor_size4_class1("4E Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.25d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 12d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size4_class2("4D Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.33d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 13d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size4_class3("4C Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 14d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size4_class4("4B Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.Integrity, 112d),
                    new Pair<>(ItemEffect.PowerDraw, 0.49d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),

    int_fsdinterdictor_size4_class5("4A Frame Shift Drive Interdictor",
            ModificationType.Frame_Shift_Drive_Interdictor,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.57d),
                    new Pair<>(ItemEffect.BootTime, 15d),
                    new Pair<>(ItemEffect.FSDInterdictorRange, 16d),
                    new Pair<>(ItemEffect.FSDInterdictorFacingLimit, 50d)
            )),



    /**
     * Cargo Racks
     *
     * Includes Corrosion resistant cargo racks
     */



    int_corrosionproofcargorack_size1_class1("1E Corrosion Resistant Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 1d))),

    int_cargorack_size1_class1("1E Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 2d))),

    int_corrosionproofcargorack_size1_class2("1F Corrosion Resistant Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 2d))),

    int_cargorack_size2_class1("2E Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 4d))),

    int_cargorack_size3_class1("3E Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 8d))),

    int_cargorack_size4_class1("4E Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 16d))),

    int_corrosionproofcargorack_size4_class1("4E Corrosion Resistant Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 16d))),

    int_cargorack_size5_class1("5E Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 32d))),

    int_cargorack_size6_class1("6E Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 64d))),

    int_cargorack_size7_class1("7E Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 128d))),

    int_cargorack_size8_class1("8E Cargo Rack",
            null,
            null,
            new ItemEffectData(new Pair<>(ItemEffect.CargoCapacity, 256d))),



    /**
     * Passenger Cabins
     */

    int_passengercabin_size2_class1("2E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2.5d),
                    new Pair<>(ItemEffect.CabinCapacity, 2d),
                    new Pair<>(ItemEffect.CabinClass, 1d)
            )),

    int_passengercabin_size3_class1("3E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.CabinCapacity, 4d),
                    new Pair<>(ItemEffect.CabinClass, 1d)
            )),

    int_passengercabin_size3_class2("3D Business Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.CabinCapacity, 3d),
                    new Pair<>(ItemEffect.CabinClass, 2d)
            )),

    int_passengercabin_size4_class1("4E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.CabinCapacity, 8d),
                    new Pair<>(ItemEffect.CabinClass, 1d)
            )),

    int_passengercabin_size4_class2("4D Business Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.CabinCapacity, 6d),
                    new Pair<>(ItemEffect.CabinClass, 2d)
            )),

    int_passengercabin_size4_class3("4C First Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.CabinCapacity, 3d),
                    new Pair<>(ItemEffect.CabinClass, 3d)
            )),

    int_passengercabin_size5_class1("5E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.CabinCapacity, 16d),
                    new Pair<>(ItemEffect.CabinClass, 1d)
            )),

    int_passengercabin_size5_class2("5D Business Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.CabinCapacity, 10d),
                    new Pair<>(ItemEffect.CabinClass, 2d)
            )),

    int_passengercabin_size5_class3("5C First Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.CabinCapacity, 6d),
                    new Pair<>(ItemEffect.CabinClass, 3d)
            )),

    int_passengercabin_size5_class4("5B Luxury Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.CabinCapacity, 4d),
                    new Pair<>(ItemEffect.CabinClass, 4d)
            )),

    int_passengercabin_size6_class1("6E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.CabinCapacity, 32d),
                    new Pair<>(ItemEffect.CabinClass, 1d)
            )),

    int_passengercabin_size6_class2("6D Business Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.CabinCapacity, 18d),
                    new Pair<>(ItemEffect.CabinClass, 2d)
            )),

    int_passengercabin_size6_class3("6C First Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.CabinCapacity, 12d),
                    new Pair<>(ItemEffect.CabinClass, 3d)
            )),

    int_passengercabin_size6_class4("6B Luxury Class Passenger Cabin",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.CabinCapacity, 8d),
                    new Pair<>(ItemEffect.CabinClass, 4d)
            )),


    /**
     * Collector Limpet Controllers
     */

    int_dronecontrol_collection_size1_class1("1E Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.14d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 800d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size1_class2("1D Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 600d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size1_class3("1C Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.23d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1000d),
                    new Pair<>(ItemEffect.DroneLifeTime, 510d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size1_class4("1B Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1400d),
                    new Pair<>(ItemEffect.DroneLifeTime, 420d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size1_class5("1A Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1200d),
                    new Pair<>(ItemEffect.DroneLifeTime, 720d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),


    int_dronecontrol_collection_size3_class1("3E Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 880d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size3_class2("3D Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 660d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size3_class3("3C Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1100d),
                    new Pair<>(ItemEffect.DroneLifeTime, 510d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size3_class4("3B Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1540d),
                    new Pair<>(ItemEffect.DroneLifeTime, 420d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size3_class5("3A Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1320d),
                    new Pair<>(ItemEffect.DroneLifeTime, 720d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),


    int_dronecontrol_collection_size5_class1("5E Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1040d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size5_class2("5D Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 780d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size5_class3("5C Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1300d),
                    new Pair<>(ItemEffect.DroneLifeTime, 510d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size5_class4("5B Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1820d),
                    new Pair<>(ItemEffect.DroneLifeTime, 420d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size5_class5("5A Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 134d),
                    new Pair<>(ItemEffect.PowerDraw, 0.7d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1560d),
                    new Pair<>(ItemEffect.DroneLifeTime, 720d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),


    int_dronecontrol_collection_size7_class1("7E Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 79d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1360d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size7_class2("7D Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.55d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1020d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size7_class3("7C Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.69d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1700d),
                    new Pair<>(ItemEffect.DroneLifeTime, 510d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size7_class4("7B Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.83d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2380d),
                    new Pair<>(ItemEffect.DroneLifeTime, 420d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size7_class5("7A Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 183d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 6d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2040d),
                    new Pair<>(ItemEffect.DroneLifeTime, 720d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),



    /**
     * Prospector Limpet Controllers
     */

    int_dronecontrol_prospector_size1_class1("1E Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size1_class2("1D Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.14d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size1_class3("1C Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.23d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size1_class4("1B Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size1_class5("1A Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_prospector_size3_class1("3E Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size3_class2("3D Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size3_class3("3C Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size3_class4("3B Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size3_class5("3A Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_prospector_size5_class1("5E Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size5_class2("5D Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size5_class3("5C Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size5_class4("5B Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size5_class5("5A Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 134d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_prospector_size7_class1("7E Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 79d),
                    new Pair<>(ItemEffect.PowerDraw, 0.55d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size7_class2("7D Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size7_class3("7C Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.69d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size7_class4("7B Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size7_class5("7A Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 183d),
                    new Pair<>(ItemEffect.PowerDraw, 0.83d),
                    new Pair<>(ItemEffect.BootTime, 4d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneLifeTime, 600d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),



    /**
     * Fuel Transfer Limpet Controllers
     */

    int_dronecontrol_fueltransfer_size1_class1("1E Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 600d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size1_class2("1D Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.14d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 800d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size1_class3("1C Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.23d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1000d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size1_class4("1B Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1200d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size1_class5("1A Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1400d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),


    int_dronecontrol_fueltransfer_size3_class1("3E Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 660d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size3_class2("3D Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 880d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size3_class3("3C Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1100d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size3_class4("3B Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1320d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size3_class5("3A Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1540d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),


    int_dronecontrol_fueltransfer_size5_class1("5E Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 780d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size5_class2("5D Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1040d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size5_class3("5C Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1300d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size5_class4("5B Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1560d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size5_class5("5A Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 134d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1820d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),


    int_dronecontrol_fueltransfer_size7_class1("7E Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 79d),
                    new Pair<>(ItemEffect.PowerDraw, 0.55d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1020d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size7_class2("7D Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1360d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size7_class3("7C Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.69d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1700d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size7_class4("7B Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2040d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size7_class5("7A Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 183d),
                    new Pair<>(ItemEffect.PowerDraw, 0.83d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 8d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2380d),
                    new Pair<>(ItemEffect.DroneLifeTime, 60d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d),
                    new Pair<>(ItemEffect.DroneFuelCapacity, 1d)
            )),



    /**
     * Repair Limpet Controllers
     */

    int_dronecontrol_repair_size1_class1("1E Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 60d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 600d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size1_class2("1D Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.14d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 60d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 800d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size1_class3("1C Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.23d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 60d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1000d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size1_class4("1B Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.32d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 60d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1200d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size1_class5("1A Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 60d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1400d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_repair_size3_class1("3E Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 0.27d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 180d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 660d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size3_class2("3D Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 180d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 880d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size3_class3("3C Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.34d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 180d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1100d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size3_class4("3B Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.48d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 180d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1320d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size3_class5("3A Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 180d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1540d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_repair_size5_class1("5E Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 310d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 780d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size5_class2("5D Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 310d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1040d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size5_class3("5C Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 310d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1300d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size5_class4("5B Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 310d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1560d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size5_class5("5A Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 134d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 310d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1820d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_repair_size7_class1("7E Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 79d),
                    new Pair<>(ItemEffect.PowerDraw, 0.55d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 450d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1020d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size7_class2("7D Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.41d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 450d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1360d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size7_class3("7C Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.69d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 450d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1700d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size7_class4("7B Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 450d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2040d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size7_class5("7A Repair Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 183d),
                    new Pair<>(ItemEffect.PowerDraw, 0.83d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 450d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2380d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),



    /**
     * Hatch Breaker Limpet Controllers
     */

    int_dronecontrol_resourcesiphon_size1_class1("1E Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 32d),
                    new Pair<>(ItemEffect.PowerDraw, 0.12d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1500d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 22d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 1d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 6d)
            )),

    int_dronecontrol_resourcesiphon_size1_class2("1D Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.16d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2000d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 19d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 2d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 7d)
            )),

    int_dronecontrol_resourcesiphon_size1_class3("1C Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2500d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 16d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 3d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 8d)
            )),

    int_dronecontrol_resourcesiphon_size1_class4("1B Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.24d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 3000d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 13d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 4d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 9d)
            )),

    int_dronecontrol_resourcesiphon_size1_class5("1A Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 48d),
                    new Pair<>(ItemEffect.PowerDraw, 0.28d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 3500d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 10d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 5d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 10d)
            )),


    int_dronecontrol_resourcesiphon_size3_class1("3E Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1620d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 17d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 1d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 6d)
            )),

    int_dronecontrol_resourcesiphon_size3_class2("3D Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 38d),
                    new Pair<>(ItemEffect.PowerDraw, 0.24d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2160d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 14d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 2d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 7d)
            )),

    int_dronecontrol_resourcesiphon_size3_class3("3C Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 64d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2700d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 12d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 3d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 8d)
            )),

    int_dronecontrol_resourcesiphon_size3_class4("3B Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 90d),
                    new Pair<>(ItemEffect.PowerDraw, 0.36d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 3240d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 10d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 4d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 9d)
            )),

    int_dronecontrol_resourcesiphon_size3_class5("3A Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 5d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.42d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 3780d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 7d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 5d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 10d)
            )),


    int_dronecontrol_resourcesiphon_size5_class1("5E Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 77d),
                    new Pair<>(ItemEffect.PowerDraw, 0.3d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 9d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1980d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 11d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 1d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 6d)
            )),

    int_dronecontrol_resourcesiphon_size5_class2("5D Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.Integrity, 58d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 6d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2640d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 10d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 2d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 7d)
            )),

    int_dronecontrol_resourcesiphon_size5_class3("5C Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 7d),
                    new Pair<>(ItemEffect.DroneTargetRange, 3300d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 8d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 3d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 8d)
            )),

    int_dronecontrol_resourcesiphon_size5_class4("5B Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 134d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 9d),
                    new Pair<>(ItemEffect.DroneTargetRange, 3960d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 6d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 4d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 9d)
            )),

    int_dronecontrol_resourcesiphon_size5_class5("5A Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 115d),
                    new Pair<>(ItemEffect.PowerDraw, 0.7d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 6d),
                    new Pair<>(ItemEffect.DroneTargetRange, 4620d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 5d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 5d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 10d)
            )),


    int_dronecontrol_resourcesiphon_size7_class1("7E Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 105d),
                    new Pair<>(ItemEffect.PowerDraw, 0.42d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 18d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2580d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 6d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 1d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 6d)
            )),

    int_dronecontrol_resourcesiphon_size7_class2("7D Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.Integrity, 79d),
                    new Pair<>(ItemEffect.PowerDraw, 0.56d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 12d),
                    new Pair<>(ItemEffect.DroneTargetRange, 3440d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 5d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 2d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 7d)
            )),

    int_dronecontrol_resourcesiphon_size7_class3("7C Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 131d),
                    new Pair<>(ItemEffect.PowerDraw, 0.7d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 15d),
                    new Pair<>(ItemEffect.DroneTargetRange, 4300d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 4d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 3d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 8d)
            )),

    int_dronecontrol_resourcesiphon_size7_class4("7B Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 183d),
                    new Pair<>(ItemEffect.PowerDraw, 0.84d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 18d),
                    new Pair<>(ItemEffect.DroneTargetRange, 5160d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 3d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 4d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 9d)
            )),

    int_dronecontrol_resourcesiphon_size7_class5("7A Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 80d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.98d),
                    new Pair<>(ItemEffect.BootTime, 3d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 12d),
                    new Pair<>(ItemEffect.DroneTargetRange, 6020d),
                    new Pair<>(ItemEffect.DroneLifeTime, 120d),
                    new Pair<>(ItemEffect.DroneSpeed, 500d),
                    new Pair<>(ItemEffect.DroneHackingTime, 2d),
                    new Pair<>(ItemEffect.DroneMinJettisonedCargo, 5d),
                    new Pair<>(ItemEffect.DroneMaxJettisonedCargo, 10d)
            )),



    /**
     * Decontamination Limpet Controllers
     */

    int_dronecontrol_decontamination_size1_class1("1E Decontamination Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 24d),
                    new Pair<>(ItemEffect.PowerDraw, 0.18d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 30d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 600d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_decontamination_size3_class1("3E Decontamination Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 51d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 70d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 2d),
                    new Pair<>(ItemEffect.DroneTargetRange, 880d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_decontamination_size5_class1("5E Decontamination Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 96d),
                    new Pair<>(ItemEffect.PowerDraw, 0.5d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 120d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 3d),
                    new Pair<>(ItemEffect.DroneTargetRange, 1300d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_decontamination_size7_class1("7E Decontamination Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Integrity, 157d),
                    new Pair<>(ItemEffect.PowerDraw, 0.97d),
                    new Pair<>(ItemEffect.BootTime, 10d),
                    new Pair<>(ItemEffect.DroneRepairCapacity, 180d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 4d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2040d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),


    /**
     * Recon Limpet Controller
     */

    int_dronecontrol_recon_size1_class1("1E Recon Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Mass, 24d),
                    new Pair<>(ItemEffect.Mass, 0.18d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Mass, 1200d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.Mass, 22d)
            )),

    int_dronecontrol_recon_size3_class1("3E Recon Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Mass, 51d),
                    new Pair<>(ItemEffect.Mass, 0.2d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Mass, 1400d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.Mass, 17d)
            )),

    int_dronecontrol_recon_size5_class1("5E Recon Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Mass, 96d),
                    new Pair<>(ItemEffect.Mass, 0.5d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Mass, 1700d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.Mass, 13d)
            )),

    int_dronecontrol_recon_size7_class1("7E Recon Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 128d),
                    new Pair<>(ItemEffect.Mass, 157d),
                    new Pair<>(ItemEffect.Mass, 0.97d),
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Mass, 1d),
                    new Pair<>(ItemEffect.Mass, 2000d),
                    new Pair<>(ItemEffect.Mass, 100d),
                    new Pair<>(ItemEffect.Mass, 10d)
            )),


    /**
     * Research Limpet Controller
     */

    int_dronecontrol_unkvesselresearch("Research Limpet Controller",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 20d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.MaxActiveDrones, 1d),
                    new Pair<>(ItemEffect.DroneTargetRange, 2000d),
                    new Pair<>(ItemEffect.DroneLifeTime, 300d),
                    new Pair<>(ItemEffect.DroneSpeed, 200d)
            )),


    /**
     * SRV Bays
     *
     * todo: determine if ammo clip size is the right stat for the vehicle count
     */

    int_buggybay_size2_class1("2H Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 12d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.PowerDraw, 0.25d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 1d),
                    new Pair<>(ItemEffect.AmmoClipSize, 1d)
            )),

    int_buggybay_size2_class2("2G Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 6d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.PowerDraw, 0.75d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 1d),
                    new Pair<>(ItemEffect.AmmoClipSize, 1d)
            )),


    int_buggybay_size4_class1("4H Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.PowerDraw, 0.4d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 1d)
            )),

    int_buggybay_size4_class2("4G Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 10d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.PowerDraw, 1.2d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 1d)
            )),


    int_buggybay_size6_class1("6H Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 34d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.PowerDraw, 0.6d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 4d),
                    new Pair<>(ItemEffect.AmmoClipSize, 1d)
            )),

    int_buggybay_size6_class2("6G Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 17d),
                    new Pair<>(ItemEffect.Integrity, 30d),
                    new Pair<>(ItemEffect.PowerDraw, 1.8d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 4d),
                    new Pair<>(ItemEffect.AmmoClipSize, 1d)
            )),



    /**
     * Fighter Bays
     *
     * todo: determine if buggy bay slots is the right stat for the vehicle slots
     * todo: determine if ammo clip size is the right stat for the vehicle count
     */

    int_fighterbay_size5_class1("5E Fighter Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 20d),
                    new Pair<>(ItemEffect.Integrity, 60d),
                    new Pair<>(ItemEffect.PowerDraw, 0.25d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 1d),
                    new Pair<>(ItemEffect.AmmoClipSize, 6d)
            )),

    int_fighterbay_size6_class1("6E Fighter Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 40d),
                    new Pair<>(ItemEffect.Integrity, 80d),
                    new Pair<>(ItemEffect.PowerDraw, 0.35d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 8d)
            )),

    int_fighterbay_size7_class1("7E Fighter Hangar",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 60d),
                    new Pair<>(ItemEffect.Integrity, 120d),
                    new Pair<>(ItemEffect.PowerDraw, 0.35d),
                    new Pair<>(ItemEffect.BootTime, 5d),
                    new Pair<>(ItemEffect.NumBuggySlots, 2d),
                    new Pair<>(ItemEffect.AmmoClipSize, 15d)
            )),


    /**
     * Discovery Scanners
     */

    int_stellarbodydiscoveryscanner_standard("Basic Discovery Scanner",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.DiscoveryScannerRange, 500d),
                    new Pair<>(ItemEffect.DiscoveryScannerPassiveRange, 0.33d),
                    new Pair<>(ItemEffect.MaxAngle, 10d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 5d)
            )),

    int_stellarbodydiscoveryscanner_intermediate("Intermediate Discovery Scanner",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.DiscoveryScannerRange, 1000d),
                    new Pair<>(ItemEffect.DiscoveryScannerPassiveRange, 3.34d),
                    new Pair<>(ItemEffect.MaxAngle, 10d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 5d)
            )),

    int_stellarbodydiscoveryscanner_advanced("Advanced Discovery Scanner",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.Integrity, 40d),
                    new Pair<>(ItemEffect.DiscoveryScannerRange, Double.MAX_VALUE),
                    new Pair<>(ItemEffect.DiscoveryScannerPassiveRange, 33.36d),
                    new Pair<>(ItemEffect.MaxAngle, 10d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 5d)
            )),


    /**
     * Detailed Surface Scanner
     */

    int_detailedsurfacescanner_tiny("Detailed Surface Scanner",
            ModificationType.Detailed_Surface_Scanner,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.PowerDraw, 0d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.DSS_RangeMult, 0d),
                    new Pair<>(ItemEffect.DSS_AngleMult, 0d),
                    new Pair<>(ItemEffect.DSS_RateMult, 0d)
            )),


    /**
     * Docking Computer
     */

    int_dockingcomputer_standard("Standard Docking Computer",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Integrity, 10d),
                    new Pair<>(ItemEffect.PowerDraw, 0.39d),
                    new Pair<>(ItemEffect.BootTime, 3d)
            )),


    /**
     * Planetary Approach Suite
     */

    int_planetapproachsuite("Planetary Approach Suite", null, null,
            new ItemEffectData()),


    /**
     * Experimental (AEGIS, Anti-Thargoid) Modules
     *
     * todo: determine if ECMCooldown is the correct effect for this item's cooldown stat
     */

    hpt_antiunknownshutdown_tiny("Shutdown Field Neutraliser",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 35d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 0d),
                    new Pair<>(ItemEffect.Range, 3000d),
                    new Pair<>(ItemEffect.DistributorDraw, 0.25d),
                    new Pair<>(ItemEffect.ECMCooldown, 10d),
                    new Pair<>(ItemEffect.Mass, 1d)
            )),

    hpt_xenoscanner_basic_tiny("Xeno Scanner", null, null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 1.3d),
                    new Pair<>(ItemEffect.Integrity, 56d),
                    new Pair<>(ItemEffect.PowerDraw, 0.2d),
                    new Pair<>(ItemEffect.BootTime, 2d),
                    new Pair<>(ItemEffect.Range, 500d),
                    new Pair<>(ItemEffect.MaxAngle, 23d),
                    new Pair<>(ItemEffect.ScannerTimeToScan, 10d)
            )),



    /**
     * Guardian Internal Modules
     */

    // todo: find ENUM values for this
    // Guardian FSD Booster (currently disabled in game, may be a while before its back)

    /**
     * Human Tech Broker Internal Modules
     */

    // todo: verify ENUM values for these, they may be guessed

    int_metaalloyhullreinforcement_size1_class1("1E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 72d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size1_class2("1D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 99d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size2_class1("2E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 135d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size2_class2("2D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 2d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 171d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size3_class1("3E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 207d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size3_class2("3D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 4d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 234d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size4_class1("4E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 270d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size4_class2("4D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 8d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 297d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size5_class1("5E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 32d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 324d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size5_class2("5D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffectData(
                    new Pair<>(ItemEffect.Mass, 16d),
                    new Pair<>(ItemEffect.DefenceModifierHealthAddition, 351d),
                    new Pair<>(ItemEffect.CausticResistance, 3d)
            )),

    ;

    private final String displayText;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;
    private final ItemEffectData itemEffects;

    OptionalInternalModule(String displayText, ProcurementType modificationType, ProcurementType experimentalType, ItemEffectData itemEffects)
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
    public ItemEffectData itemEffects()
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

        return Arrays.stream(OptionalInternalModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(()->exception);
    }
}
