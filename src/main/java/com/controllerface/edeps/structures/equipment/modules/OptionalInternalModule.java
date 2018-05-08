package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.edeps.structures.craftable.modifications.ModificationType;

import java.util.Arrays;

/**
 * Created by Stephen on 4/25/2018.
 */
public enum OptionalInternalModule implements ShipModule
{
    /**
     * Shield Generators
     */

    int_shieldgenerator_size2_class1(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "2E Shield Generator"),
    int_shieldgenerator_size2_class2(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "2D Shield Generator"),
    int_shieldgenerator_size2_class3(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "2C Shield Generator"),
    int_shieldgenerator_size2_class4(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "2B Shield Generator"),
    int_shieldgenerator_size2_class5(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "2A Shield Generator"),

    int_shieldgenerator_size3_class1(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "3E Shield Generator"),
    int_shieldgenerator_size3_class2(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "3D Shield Generator"),
    int_shieldgenerator_size3_class3(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "3C Shield Generator"),
    int_shieldgenerator_size3_class4(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "3B Shield Generator"),
    int_shieldgenerator_size3_class5(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "3A Shield Generator"),

    int_shieldgenerator_size4_class1(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "4E Shield Generator"),
    int_shieldgenerator_size4_class2(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "4D Shield Generator"),
    int_shieldgenerator_size4_class3(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "4C Shield Generator"),
    int_shieldgenerator_size4_class4(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "4B Shield Generator"),
    int_shieldgenerator_size4_class5(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "4A Shield Generator"),

    int_shieldgenerator_size5_class1(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "5E Shield Generator"),
    int_shieldgenerator_size5_class2(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "5D Shield Generator"),
    int_shieldgenerator_size5_class3(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "5C Shield Generator"),
    int_shieldgenerator_size5_class4(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "5B Shield Generator"),
    int_shieldgenerator_size5_class5(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "5A Shield Generator"),

    int_shieldgenerator_size6_class1(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "6E Shield Generator"),
    int_shieldgenerator_size6_class2(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "6D Shield Generator"),
    int_shieldgenerator_size6_class3(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "6C Shield Generator"),
    int_shieldgenerator_size6_class4(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "6B Shield Generator"),
    int_shieldgenerator_size6_class5(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "6A Shield Generator"),

    int_shieldgenerator_size7_class1(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "7E Shield Generator"),
    int_shieldgenerator_size7_class2(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "7D Shield Generator"),
    int_shieldgenerator_size7_class3(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "7C Shield Generator"),
    int_shieldgenerator_size7_class4(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "7B Shield Generator"),
    int_shieldgenerator_size7_class5(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "7A Shield Generator"),

    int_shieldgenerator_size8_class1(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "8E Shield Generator"),
    int_shieldgenerator_size8_class2(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "8D Shield Generator"),
    int_shieldgenerator_size8_class3(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "8C Shield Generator"),
    int_shieldgenerator_size8_class4(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "8B Shield Generator"),
    int_shieldgenerator_size8_class5(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "8A Shield Generator"),


    /**
     * Bi-Weave Shield Generators
     */

    int_shieldgenerator_size1_class3_fast(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "1C Bi-Weave Shield Generator"),
    int_shieldgenerator_size2_class3_fast(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "2C Bi-Weave Shield Generator"),
    int_shieldgenerator_size3_class3_fast(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "3C Bi-Weave Shield Generator"),
    int_shieldgenerator_size4_class3_fast(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "4C Bi-Weave Shield Generator"),
    int_shieldgenerator_size5_class3_fast(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "5C Bi-Weave Shield Generator"),
    int_shieldgenerator_size6_class3_fast(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "6C Bi-Weave Shield Generator"),
    int_shieldgenerator_size7_class3_fast(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "7C Bi-Weave Shield Generator"),
    int_shieldgenerator_size8_class3_fast(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "8c Bi-Weave Shield Generator"),


    /**
     * Shield Cell Bank
     */

    int_shieldcellbank_size1_class1(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "1E Shield Cell Bank"),
    int_shieldcellbank_size1_class2(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "1D Shield Cell Bank"),
    int_shieldcellbank_size1_class3(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "1C Shield Cell Bank"),
    int_shieldcellbank_size1_class4(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "1B Shield Cell Bank"),
    int_shieldcellbank_size1_class5(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "1A Shield Cell Bank"),

    int_shieldcellbank_size2_class1(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "2E Shield Cell Bank"),
    int_shieldcellbank_size2_class2(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "2D Shield Cell Bank"),
    int_shieldcellbank_size2_class3(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "2C Shield Cell Bank"),
    int_shieldcellbank_size2_class4(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "2B Shield Cell Bank"),
    int_shieldcellbank_size2_class5(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "2A Shield Cell Bank"),

    int_shieldcellbank_size3_class1(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "3E Shield Cell Bank"),
    int_shieldcellbank_size3_class2(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "3D Shield Cell Bank"),
    int_shieldcellbank_size3_class3(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "3C Shield Cell Bank"),
    int_shieldcellbank_size3_class4(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "3B Shield Cell Bank"),
    int_shieldcellbank_size3_class5(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "3A Shield Cell Bank"),

    int_shieldcellbank_size4_class1(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "4E Shield Cell Bank"),
    int_shieldcellbank_size4_class2(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "4D Shield Cell Bank"),
    int_shieldcellbank_size4_class3(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "4C Shield Cell Bank"),
    int_shieldcellbank_size4_class4(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "4B Shield Cell Bank"),
    int_shieldcellbank_size4_class5(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "4A Shield Cell Bank"),

    int_shieldcellbank_size5_class1(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "5E Shield Cell Bank"),
    int_shieldcellbank_size5_class2(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "5D Shield Cell Bank"),
    int_shieldcellbank_size5_class3(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "5C Shield Cell Bank"),
    int_shieldcellbank_size5_class4(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "5B Shield Cell Bank"),
    int_shieldcellbank_size5_class5(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "5A Shield Cell Bank"),

    int_shieldcellbank_size6_class1(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "6E Shield Cell Bank"),
    int_shieldcellbank_size6_class2(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "6D Shield Cell Bank"),
    int_shieldcellbank_size6_class3(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "6C Shield Cell Bank"),
    int_shieldcellbank_size6_class4(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "6B Shield Cell Bank"),
    int_shieldcellbank_size6_class5(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "6A Shield Cell Bank"),

    int_shieldcellbank_size7_class1(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "7E Shield Cell Bank"),
    int_shieldcellbank_size7_class2(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "7D Shield Cell Bank"),
    int_shieldcellbank_size7_class3(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "7C Shield Cell Bank"),
    int_shieldcellbank_size7_class4(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "7B Shield Cell Bank"),
    int_shieldcellbank_size7_class5(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "7A Shield Cell Bank"),

    int_shieldcellbank_size8_class1(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "8E Shield Cell Bank"),
    int_shieldcellbank_size8_class2(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "8D Shield Cell Bank"),
    int_shieldcellbank_size8_class3(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "8C Shield Cell Bank"),
    int_shieldcellbank_size8_class4(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "8B Shield Cell Bank"),
    int_shieldcellbank_size8_class5(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank,
            "8A Shield Cell Bank"),


    /**
     * Automated Field Maintenance Unit
     */

    int_repairer_size1_class1(ModificationType.Auto_Field_Maintenence_Unit, null,
            "1E Automated Field Maintenance Unit"),
    int_repairer_size1_class2(ModificationType.Auto_Field_Maintenence_Unit, null,
            "1D Automated Field Maintenance Unit"),
    int_repairer_size1_class3(ModificationType.Auto_Field_Maintenence_Unit, null,
            "1C Automated Field Maintenance Unit"),
    int_repairer_size1_class4(ModificationType.Auto_Field_Maintenence_Unit, null,
            "1B Automated Field Maintenance Unit"),
    int_repairer_size1_class5(ModificationType.Auto_Field_Maintenence_Unit, null,
            "1A Automated Field Maintenance Unit"),

    int_repairer_size2_class1(ModificationType.Auto_Field_Maintenence_Unit, null,
            "2E Automated Field Maintenance Unit"),
    int_repairer_size2_class2(ModificationType.Auto_Field_Maintenence_Unit, null,
            "2D Automated Field Maintenance Unit"),
    int_repairer_size2_class3(ModificationType.Auto_Field_Maintenence_Unit, null,
            "2C Automated Field Maintenance Unit"),
    int_repairer_size2_class4(ModificationType.Auto_Field_Maintenence_Unit, null,
            "2B Automated Field Maintenance Unit"),
    int_repairer_size2_class5(ModificationType.Auto_Field_Maintenence_Unit, null,
            "2A Automated Field Maintenance Unit"),

    int_repairer_size3_class1(ModificationType.Auto_Field_Maintenence_Unit, null,
            "3E Automated Field Maintenance Unit"),
    int_repairer_size3_class2(ModificationType.Auto_Field_Maintenence_Unit, null,
            "3D Automated Field Maintenance Unit"),
    int_repairer_size3_class3(ModificationType.Auto_Field_Maintenence_Unit, null,
            "3C Automated Field Maintenance Unit"),
    int_repairer_size3_class4(ModificationType.Auto_Field_Maintenence_Unit, null,
            "3B Automated Field Maintenance Unit"),
    int_repairer_size3_class5(ModificationType.Auto_Field_Maintenence_Unit, null,
            "3A Automated Field Maintenance Unit"),

    int_repairer_size4_class1(ModificationType.Auto_Field_Maintenence_Unit, null,
            "4E Automated Field Maintenance Unit"),
    int_repairer_size4_class2(ModificationType.Auto_Field_Maintenence_Unit, null,
            "4D Automated Field Maintenance Unit"),
    int_repairer_size4_class3(ModificationType.Auto_Field_Maintenence_Unit, null,
            "4C Automated Field Maintenance Unit"),
    int_repairer_size4_class4(ModificationType.Auto_Field_Maintenence_Unit, null,
            "4B Automated Field Maintenance Unit"),
    int_repairer_size4_class5(ModificationType.Auto_Field_Maintenence_Unit, null,
            "4A Automated Field Maintenance Unit"),

    int_repairer_size5_class1(ModificationType.Auto_Field_Maintenence_Unit, null,
            "5E Automated Field Maintenance Unit"),
    int_repairer_size5_class2(ModificationType.Auto_Field_Maintenence_Unit, null,
            "5D Automated Field Maintenance Unit"),
    int_repairer_size5_class3(ModificationType.Auto_Field_Maintenence_Unit, null,
            "5C Automated Field Maintenance Unit"),
    int_repairer_size5_class4(ModificationType.Auto_Field_Maintenence_Unit, null,
            "5B Automated Field Maintenance Unit"),
    int_repairer_size5_class5(ModificationType.Auto_Field_Maintenence_Unit, null,
            "5A Automated Field Maintenance Unit"),

    int_repairer_size6_class1(ModificationType.Auto_Field_Maintenence_Unit, null,
            "6E Automated Field Maintenance Unit"),
    int_repairer_size6_class2(ModificationType.Auto_Field_Maintenence_Unit, null,
            "6D Automated Field Maintenance Unit"),
    int_repairer_size6_class3(ModificationType.Auto_Field_Maintenence_Unit, null,
            "6C Automated Field Maintenance Unit"),
    int_repairer_size6_class4(ModificationType.Auto_Field_Maintenence_Unit, null,
            "6B Automated Field Maintenance Unit"),
    int_repairer_size6_class5(ModificationType.Auto_Field_Maintenence_Unit, null,
            "6A Automated Field Maintenance Unit"),

    int_repairer_size7_class1(ModificationType.Auto_Field_Maintenence_Unit, null,
            "7E Automated Field Maintenance Unit"),
    int_repairer_size7_class2(ModificationType.Auto_Field_Maintenence_Unit, null,
            "7D Automated Field Maintenance Unit"),
    int_repairer_size7_class3(ModificationType.Auto_Field_Maintenence_Unit, null,
            "7C Automated Field Maintenance Unit"),
    int_repairer_size7_class4(ModificationType.Auto_Field_Maintenence_Unit, null,
            "7B Automated Field Maintenance Unit"),
    int_repairer_size7_class5(ModificationType.Auto_Field_Maintenence_Unit, null,
            "7A Automated Field Maintenance Unit"),

    int_repairer_size8_class1(ModificationType.Auto_Field_Maintenence_Unit, null,
            "8E Automated Field Maintenance Unit"),
    int_repairer_size8_class2(ModificationType.Auto_Field_Maintenence_Unit, null,
            "8D Automated Field Maintenance Unit"),
    int_repairer_size8_class3(ModificationType.Auto_Field_Maintenence_Unit, null,
            "8C Automated Field Maintenance Unit"),
    int_repairer_size8_class4(ModificationType.Auto_Field_Maintenence_Unit, null,
            "8B Automated Field Maintenance Unit"),
    int_repairer_size8_class5(ModificationType.Auto_Field_Maintenence_Unit, null,
            "8A Automated Field Maintenance Unit"),


    /**
     * Hull Reinforcement Packages
     */

    int_hullreinforcement_size1_class1(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "1E Hull Reinforcement Package"),
    int_hullreinforcement_size1_class2(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "1D Hull Reinforcement Package"),

    int_hullreinforcement_size2_class1(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "2E Hull Reinforcement Package"),
    int_hullreinforcement_size2_class2(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "2D Hull Reinforcement Package"),

    int_hullreinforcement_size3_class1(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "3E Hull Reinforcement Package"),
    int_hullreinforcement_size3_class2(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "3D Hull Reinforcement Package"),

    int_hullreinforcement_size4_class1(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "4E Hull Reinforcement Package"),
    int_hullreinforcement_size4_class2(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "4D Hull Reinforcement Package"),

    int_hullreinforcement_size5_class1(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "5E Hull Reinforcement Package"),
    int_hullreinforcement_size5_class2(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package,
            "5D Hull Reinforcement Package"),

    /**
     * Module Reinforcement Packages
     */

    int_modulereinforcement_size1_class1(null, null,
            "1E Module Reinforcement Package"),
    int_modulereinforcement_size1_class2(null, null,
            "1D Module Reinforcement Package"),

    int_modulereinforcement_size2_class1(null, null,
            "2E Module Reinforcement Package"),
    int_modulereinforcement_size2_class2(null, null,
            "2D Module Reinforcement Package"),

    int_modulereinforcement_size3_class1(null, null,
            "3E Module Reinforcement Package"),
    int_modulereinforcement_size3_class2(null, null,
            "3D Module Reinforcement Package"),

    int_modulereinforcement_size4_class1(null, null,
            "4E Module Reinforcement Package"),
    int_modulereinforcement_size4_class2(null, null,
            "4D Module Reinforcement Package"),

    int_modulereinforcement_size5_class1(null, null,
            "5E Module Reinforcement Package"),
    int_modulereinforcement_size5_class2(null, null,
            "5D Module Reinforcement Package"),

    /**
     * Fuel Scoops
     */

    int_fuelscoop_size1_class1(ModificationType.Fuel_Scoop, null,
            "1E Fuel Scoop"),
    int_fuelscoop_size1_class2(ModificationType.Fuel_Scoop, null,
            "1D Fuel Scoop"),
    int_fuelscoop_size1_class3(ModificationType.Fuel_Scoop, null,
            "1C Fuel Scoop"),
    int_fuelscoop_size1_class4(ModificationType.Fuel_Scoop, null,
            "1B Fuel Scoop"),
    int_fuelscoop_size1_class5(ModificationType.Fuel_Scoop, null,
            "1A Fuel Scoop"),

    int_fuelscoop_size2_class1(ModificationType.Fuel_Scoop, null,
            "2E Fuel Scoop"),
    int_fuelscoop_size2_class2(ModificationType.Fuel_Scoop, null,
            "2D Fuel Scoop"),
    int_fuelscoop_size2_class3(ModificationType.Fuel_Scoop, null,
            "2C Fuel Scoop"),
    int_fuelscoop_size2_class4(ModificationType.Fuel_Scoop, null,
            "2B Fuel Scoop"),
    int_fuelscoop_size2_class5(ModificationType.Fuel_Scoop, null,
            "2A Fuel Scoop"),

    int_fuelscoop_size3_class1(ModificationType.Fuel_Scoop, null,
            "3E Fuel Scoop"),
    int_fuelscoop_size3_class2(ModificationType.Fuel_Scoop, null,
            "3D Fuel Scoop"),
    int_fuelscoop_size3_class3(ModificationType.Fuel_Scoop, null,
            "3C Fuel Scoop"),
    int_fuelscoop_size3_class4(ModificationType.Fuel_Scoop, null,
            "3B Fuel Scoop"),
    int_fuelscoop_size3_class5(ModificationType.Fuel_Scoop, null,
            "3A Fuel Scoop"),

    int_fuelscoop_size4_class1(ModificationType.Fuel_Scoop, null,
            "4E Fuel Scoop"),
    int_fuelscoop_size4_class2(ModificationType.Fuel_Scoop, null,
            "4D Fuel Scoop"),
    int_fuelscoop_size4_class3(ModificationType.Fuel_Scoop, null,
            "4C Fuel Scoop"),
    int_fuelscoop_size4_class4(ModificationType.Fuel_Scoop, null,
            "4B Fuel Scoop"),
    int_fuelscoop_size4_class5(ModificationType.Fuel_Scoop, null,
            "4A Fuel Scoop"),

    int_fuelscoop_size5_class1(ModificationType.Fuel_Scoop, null,
            "5E Fuel Scoop"),
    int_fuelscoop_size5_class2(ModificationType.Fuel_Scoop, null,
            "5D Fuel Scoop"),
    int_fuelscoop_size5_class3(ModificationType.Fuel_Scoop, null,
            "5C Fuel Scoop"),
    int_fuelscoop_size5_class4(ModificationType.Fuel_Scoop, null,
            "5B Fuel Scoop"),
    int_fuelscoop_size5_class5(ModificationType.Fuel_Scoop, null,
            "5A Fuel Scoop"),

    int_fuelscoop_size6_class1(ModificationType.Fuel_Scoop, null,
            "6E Fuel Scoop"),
    int_fuelscoop_size6_class2(ModificationType.Fuel_Scoop, null,
            "6D Fuel Scoop"),
    int_fuelscoop_size6_class3(ModificationType.Fuel_Scoop, null,
            "6C Fuel Scoop"),
    int_fuelscoop_size6_class4(ModificationType.Fuel_Scoop, null,
            "6B Fuel Scoop"),
    int_fuelscoop_size6_class5(ModificationType.Fuel_Scoop, null,
            "6A Fuel Scoop"),

    int_fuelscoop_size7_class1(ModificationType.Fuel_Scoop, null,
            "7E Fuel Scoop"),
    int_fuelscoop_size7_class2(ModificationType.Fuel_Scoop, null,
            "7D Fuel Scoop"),
    int_fuelscoop_size7_class3(ModificationType.Fuel_Scoop, null,
            "7C Fuel Scoop"),
    int_fuelscoop_size7_class4(ModificationType.Fuel_Scoop, null,
            "7B Fuel Scoop"),
    int_fuelscoop_size7_class5(ModificationType.Fuel_Scoop, null,
            "7A Fuel Scoop"),

    int_fuelscoop_size8_class1(ModificationType.Fuel_Scoop, null,
            "8E Fuel Scoop"),
    int_fuelscoop_size8_class2(ModificationType.Fuel_Scoop, null,
            "8D Fuel Scoop"),
    int_fuelscoop_size8_class3(ModificationType.Fuel_Scoop, null,
            "8C Fuel Scoop"),
    int_fuelscoop_size8_class4(ModificationType.Fuel_Scoop, null,
            "8B Fuel Scoop"),
    int_fuelscoop_size8_class5(ModificationType.Fuel_Scoop, null,
            "8A Fuel Scoop"),


    /**
     * Refineries
     */

    int_refinery_size1_class1(ModificationType.Refinery, null,
            "1E Refinery"),
    int_refinery_size1_class2(ModificationType.Refinery, null,
            "1D Refinery"),
    int_refinery_size1_class3(ModificationType.Refinery, null,
            "1C Refinery"),
    int_refinery_size1_class4(ModificationType.Refinery, null,
            "1B Refinery"),
    int_refinery_size1_class5(ModificationType.Refinery, null,
            "1A Refinery"),

    int_refinery_size2_class1(ModificationType.Refinery, null,
            "2E Refinery"),
    int_refinery_size2_class2(ModificationType.Refinery, null,
            "2D Refinery"),
    int_refinery_size2_class3(ModificationType.Refinery, null,
            "2C Refinery"),
    int_refinery_size2_class4(ModificationType.Refinery, null,
            "2B Refinery"),
    int_refinery_size2_class5(ModificationType.Refinery, null,
            "2A Refinery"),

    int_refinery_size3_class1(ModificationType.Refinery, null,
            "3E Refinery"),
    int_refinery_size3_class2(ModificationType.Refinery, null,
            "3D Refinery"),
    int_refinery_size3_class3(ModificationType.Refinery, null,
            "3C Refinery"),
    int_refinery_size3_class4(ModificationType.Refinery, null,
            "3B Refinery"),
    int_refinery_size3_class5(ModificationType.Refinery, null,
            "3A Refinery"),

    int_refinery_size4_class1(ModificationType.Refinery, null,
            "4E Refinery"),
    int_refinery_size4_class2(ModificationType.Refinery, null,
            "4D Refinery"),
    int_refinery_size4_class3(ModificationType.Refinery, null,
            "4C Refinery"),
    int_refinery_size4_class4(ModificationType.Refinery, null,
            "4B Refinery"),
    int_refinery_size4_class5(ModificationType.Refinery, null,
            "4A Refinery"),


    /**
     * FSD Interdictors
     */

    int_fsdinterdictor_size1_class1(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "1E Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size1_class2(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "1D Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size1_class3(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "1C Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size1_class4(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "1B Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size1_class5(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "1A Frame Shift Drive Interdictor"),

    int_fsdinterdictor_size2_class1(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "2E Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size2_class2(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "2D Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size2_class3(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "2C Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size2_class4(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "2B Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size2_class5(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "2A Frame Shift Drive Interdictor"),

    int_fsdinterdictor_size3_class1(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "3E Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size3_class2(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "3D Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size3_class3(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "3C Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size3_class4(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "3B Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size3_class5(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "3A Frame Shift Drive Interdictor"),

    int_fsdinterdictor_size4_class1(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "4E Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size4_class2(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "4D Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size4_class3(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "4C Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size4_class4(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "4B Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size4_class5(ModificationType.Frame_Shift_Drive_Interdictor, null,
            "4A Frame Shift Drive Interdictor"),


    /**
     * Cargo Racks
     */

    int_cargorack_size1_class1(null, null,
            "1E Cargo Rack"),
    int_cargorack_size2_class1(null, null,
            "2E Cargo Rack"),
    int_cargorack_size3_class1(null, null,
            "3E Cargo Rack"),
    int_cargorack_size4_class1(null, null,
            "4E Cargo Rack"),
    int_cargorack_size5_class1(null, null,
            "5E Cargo Rack"),
    int_cargorack_size6_class1(null, null,
            "6E Cargo Rack"),
    int_cargorack_size7_class1(null, null,
            "7E Cargo Rack"),
    int_cargorack_size8_class1(null, null,
            "8E Cargo Rack"),


    /**
     * Passenger Cabins
     */

    int_passengercabin_size2_class1(null, null,
            "2E Passenger Cabin"),

    int_passengercabin_size3_class1(null, null,
            "3E Passenger Cabin"),
    int_passengercabin_size3_class2(null, null,
            "3D Passenger Cabin"),

    int_passengercabin_size4_class1(null, null,
            "4E Passenger Cabin"),
    int_passengercabin_size4_class2(null, null,
            "4D Passenger Cabin"),
    int_passengercabin_size4_class3(null, null,
            "4C Passenger Cabin"),

    int_passengercabin_size5_class1(null, null,
            "5E Passenger Cabin"),
    int_passengercabin_size5_class2(null, null,
            "5D Passenger Cabin"),
    int_passengercabin_size5_class3(null, null,
            "5C Passenger Cabin"),
    int_passengercabin_size5_class4(null, null,
            "5B Passenger Cabin"),

    int_passengercabin_size6_class1(null, null,
            "6E Passenger Cabin"),
    int_passengercabin_size6_class2(null, null,
            "6D Passenger Cabin"),
    int_passengercabin_size6_class3(null, null,
            "6C Passenger Cabin"),
    int_passengercabin_size6_class4(null, null,
            "6B Passenger Cabin"),


    /**
     * Collector Limpet Controllers
     */

    int_dronecontrol_collection_size1_class1(ModificationType.Collector_Limpet_Controller, null,
            "1E Collector Limpet Controller"),
    int_dronecontrol_collection_size1_class2(ModificationType.Collector_Limpet_Controller, null,
            "1D Collector Limpet Controller"),
    int_dronecontrol_collection_size1_class3(ModificationType.Collector_Limpet_Controller, null,
            "1C Collector Limpet Controller"),
    int_dronecontrol_collection_size1_class4(ModificationType.Collector_Limpet_Controller, null,
            "1B Collector Limpet Controller"),
    int_dronecontrol_collection_size1_class5(ModificationType.Collector_Limpet_Controller, null,
            "1A Collector Limpet Controller"),

    int_dronecontrol_collection_size3_class1(ModificationType.Collector_Limpet_Controller, null,
            "3E Collector Limpet Controller"),
    int_dronecontrol_collection_size3_class2(ModificationType.Collector_Limpet_Controller, null,
            "3D Collector Limpet Controller"),
    int_dronecontrol_collection_size3_class3(ModificationType.Collector_Limpet_Controller, null,
            "3C Collector Limpet Controller"),
    int_dronecontrol_collection_size3_class4(ModificationType.Collector_Limpet_Controller, null,
            "3B Collector Limpet Controller"),
    int_dronecontrol_collection_size3_class5(ModificationType.Collector_Limpet_Controller, null,
            "3A Collector Limpet Controller"),

    int_dronecontrol_collection_size5_class1(ModificationType.Collector_Limpet_Controller, null,
            "5E Collector Limpet Controller"),
    int_dronecontrol_collection_size5_class2(ModificationType.Collector_Limpet_Controller, null,
            "5D Collector Limpet Controller"),
    int_dronecontrol_collection_size5_class3(ModificationType.Collector_Limpet_Controller, null,
            "5C Collector Limpet Controller"),
    int_dronecontrol_collection_size5_class4(ModificationType.Collector_Limpet_Controller, null,
            "5B Collector Limpet Controller"),
    int_dronecontrol_collection_size5_class5(ModificationType.Collector_Limpet_Controller, null,
            "5A Collector Limpet Controller"),

    int_dronecontrol_collection_size7_class1(ModificationType.Collector_Limpet_Controller, null,
            "7E Collector Limpet Controller"),
    int_dronecontrol_collection_size7_class2(ModificationType.Collector_Limpet_Controller, null,
            "7D Collector Limpet Controller"),
    int_dronecontrol_collection_size7_class3(ModificationType.Collector_Limpet_Controller, null,
            "7C Collector Limpet Controller"),
    int_dronecontrol_collection_size7_class4(ModificationType.Collector_Limpet_Controller, null,
            "7B Collector Limpet Controller"),
    int_dronecontrol_collection_size7_class5(ModificationType.Collector_Limpet_Controller, null,
            "7A Collector Limpet Controller"),


    /**
     * Prospector Limpet Controllers
     */

    int_dronecontrol_prospector_size1_class1(ModificationType.Prospector_Limpet_Controller, null,
            "1E Prospector Limpet Controller"),
    int_dronecontrol_prospector_size1_class2(ModificationType.Prospector_Limpet_Controller, null,
            "1D Prospector Limpet Controller"),
    int_dronecontrol_prospector_size1_class3(ModificationType.Prospector_Limpet_Controller, null,
            "1C Prospector Limpet Controller"),
    int_dronecontrol_prospector_size1_class4(ModificationType.Prospector_Limpet_Controller, null,
            "1B Prospector Limpet Controller"),
    int_dronecontrol_prospector_size1_class5(ModificationType.Prospector_Limpet_Controller, null,
            "1A Prospector Limpet Controller"),

    int_dronecontrol_prospector_size3_class1(ModificationType.Prospector_Limpet_Controller, null,
            "3E Prospector Limpet Controller"),
    int_dronecontrol_prospector_size3_class2(ModificationType.Prospector_Limpet_Controller, null,
            "3D Prospector Limpet Controller"),
    int_dronecontrol_prospector_size3_class3(ModificationType.Prospector_Limpet_Controller, null,
            "3C Prospector Limpet Controller"),
    int_dronecontrol_prospector_size3_class4(ModificationType.Prospector_Limpet_Controller, null,
            "3B Prospector Limpet Controller"),
    int_dronecontrol_prospector_size3_class5(ModificationType.Prospector_Limpet_Controller, null,
            "3A Prospector Limpet Controller"),

    int_dronecontrol_prospector_size5_class1(ModificationType.Prospector_Limpet_Controller, null,
            "5E Prospector Limpet Controller"),
    int_dronecontrol_prospector_size5_class2(ModificationType.Prospector_Limpet_Controller, null,
            "5D Prospector Limpet Controller"),
    int_dronecontrol_prospector_size5_class3(ModificationType.Prospector_Limpet_Controller, null,
            "5C Prospector Limpet Controller"),
    int_dronecontrol_prospector_size5_class4(ModificationType.Prospector_Limpet_Controller, null,
            "5B Prospector Limpet Controller"),
    int_dronecontrol_prospector_size5_class5(ModificationType.Prospector_Limpet_Controller, null,
            "5A Prospector Limpet Controller"),

    int_dronecontrol_prospector_size7_class1(ModificationType.Prospector_Limpet_Controller, null,
            "7E Prospector Limpet Controller"),
    int_dronecontrol_prospector_size7_class2(ModificationType.Prospector_Limpet_Controller, null,
            "7D Prospector Limpet Controller"),
    int_dronecontrol_prospector_size7_class3(ModificationType.Prospector_Limpet_Controller, null,
            "7C Prospector Limpet Controller"),
    int_dronecontrol_prospector_size7_class4(ModificationType.Prospector_Limpet_Controller, null,
            "7B Prospector Limpet Controller"),
    int_dronecontrol_prospector_size7_class5(ModificationType.Prospector_Limpet_Controller, null,
            "7A Prospector Limpet Controller"),


    /**
     * Fuel Transfer Limpet Controllers
     */

    int_dronecontrol_fueltransfer_size1_class1(ModificationType.Fuel_Transfer_Limpet, null,
            "1E Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size1_class2(ModificationType.Fuel_Transfer_Limpet, null,
            "1D Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size1_class3(ModificationType.Fuel_Transfer_Limpet, null,
            "1C Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size1_class4(ModificationType.Fuel_Transfer_Limpet, null,
            "1B Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size1_class5(ModificationType.Fuel_Transfer_Limpet, null,
            "1A Fuel Transfer Limpet Controller"),

    int_dronecontrol_fueltransfer_size3_class1(ModificationType.Fuel_Transfer_Limpet, null,
            "3E Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size3_class2(ModificationType.Fuel_Transfer_Limpet, null,
            "3D Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size3_class3(ModificationType.Fuel_Transfer_Limpet, null,
            "3C Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size3_class4(ModificationType.Fuel_Transfer_Limpet, null,
            "3B Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size3_class5(ModificationType.Fuel_Transfer_Limpet, null,
            "3A Fuel Transfer Limpet Controller"),

    int_dronecontrol_fueltransfer_size5_class1(ModificationType.Fuel_Transfer_Limpet, null,
            "5E Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size5_class2(ModificationType.Fuel_Transfer_Limpet, null,
            "5D Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size5_class3(ModificationType.Fuel_Transfer_Limpet, null,
            "5C Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size5_class4(ModificationType.Fuel_Transfer_Limpet, null,
            "5B Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size5_class5(ModificationType.Fuel_Transfer_Limpet, null,
            "5A Fuel Transfer Limpet Controller"),

    int_dronecontrol_fueltransfer_size7_class1(ModificationType.Fuel_Transfer_Limpet, null,
            "7E Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size7_class2(ModificationType.Fuel_Transfer_Limpet, null,
            "7D Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size7_class3(ModificationType.Fuel_Transfer_Limpet, null,
            "7C Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size7_class4(ModificationType.Fuel_Transfer_Limpet, null,
            "7B Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size7_class5(ModificationType.Fuel_Transfer_Limpet, null,
            "7A Fuel Transfer Limpet Controller"),


    /**
     * Repair Limpet Controllers
     */

    int_dronecontrol_repair_size1_class1(null, null,
            "1E Repair Limpet Controller"),
    int_dronecontrol_repair_size1_class2(null, null,
            "1D Repair Limpet Controller"),
    int_dronecontrol_repair_size1_class3(null, null,
            "1C Repair Limpet Controller"),
    int_dronecontrol_repair_size1_class4(null, null,
            "1B Repair Limpet Controller"),
    int_dronecontrol_repair_size1_class5(null, null,
            "1A Repair Limpet Controller"),

    int_dronecontrol_repair_size3_class1(null, null,
            "3E Repair Limpet Controller"),
    int_dronecontrol_repair_size3_class2(null, null,
            "3D Repair Limpet Controller"),
    int_dronecontrol_repair_size3_class3(null, null,
            "3C Repair Limpet Controller"),
    int_dronecontrol_repair_size3_class4(null, null,
            "3B Repair Limpet Controller"),
    int_dronecontrol_repair_size3_class5(null, null,
            "3A Repair Limpet Controller"),

    int_dronecontrol_repair_size5_class1(null, null,
            "5E Repair Limpet Controller"),
    int_dronecontrol_repair_size5_class2(null, null,
            "5D Repair Limpet Controller"),
    int_dronecontrol_repair_size5_class3(null, null,
            "5C Repair Limpet Controller"),
    int_dronecontrol_repair_size5_class4(null, null,
            "5B Repair Limpet Controller"),
    int_dronecontrol_repair_size5_class5(null, null,
            "5A Repair Limpet Controller"),

    int_dronecontrol_repair_size7_class1(null, null,
            "7E Repair Limpet Controller"),
    int_dronecontrol_repair_size7_class2(null, null,
            "7D Repair Limpet Controller"),
    int_dronecontrol_repair_size7_class3(null, null,
            "7C Repair Limpet Controller"),
    int_dronecontrol_repair_size7_class4(null, null,
            "7B Repair Limpet Controller"),
    int_dronecontrol_repair_size7_class5(null, null,
            "7A Repair Limpet Controller"),


    /**
     * Hatch Breaker Limpet Controllers
     */

    int_dronecontrol_resourcesiphon_size1_class1(ModificationType.Hatch_Breaker_Limpet, null,
            "1E Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size1_class2(ModificationType.Hatch_Breaker_Limpet, null,
            "1D Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size1_class3(ModificationType.Hatch_Breaker_Limpet, null,
            "1C Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size1_class4(ModificationType.Hatch_Breaker_Limpet, null,
            "1B Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size1_class5(ModificationType.Hatch_Breaker_Limpet, null,
            "1A Hatch Breaker Limpet Controller"),

    int_dronecontrol_resourcesiphon_size3_class1(ModificationType.Hatch_Breaker_Limpet, null,
            "3E Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size3_class2(ModificationType.Hatch_Breaker_Limpet, null,
            "3D Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size3_class3(ModificationType.Hatch_Breaker_Limpet, null,
            "3C Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size3_class4(ModificationType.Hatch_Breaker_Limpet, null,
            "3B Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size3_class5(ModificationType.Hatch_Breaker_Limpet, null,
            "3A Hatch Breaker Limpet Controller"),

    int_dronecontrol_resourcesiphon_size5_class1(ModificationType.Hatch_Breaker_Limpet, null,
            "5E Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size5_class2(ModificationType.Hatch_Breaker_Limpet, null,
            "5D Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size5_class3(ModificationType.Hatch_Breaker_Limpet, null,
            "5C Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size5_class4(ModificationType.Hatch_Breaker_Limpet, null,
            "5B Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size5_class5(ModificationType.Hatch_Breaker_Limpet, null,
            "5A Hatch Breaker Limpet Controller"),

    int_dronecontrol_resourcesiphon_size7_class1(ModificationType.Hatch_Breaker_Limpet, null,
            "7E Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size7_class2(ModificationType.Hatch_Breaker_Limpet, null,
            "7D Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size7_class3(ModificationType.Hatch_Breaker_Limpet, null,
            "7C Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size7_class4(ModificationType.Hatch_Breaker_Limpet, null,
            "7B Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size7_class5(ModificationType.Hatch_Breaker_Limpet, null,
            "7A Hatch Breaker Limpet Controller"),


    /**
     * Decontamination Limpet Controllers
     */

    int_dronecontrol_decontamination_size1_class1(null, null,
            "1E Decontamination Limpet Controller"),
    int_dronecontrol_decontamination_size3_class1(null, null,
            "3E Decontamination Limpet Controller"),
    int_dronecontrol_decontamination_size5_class1(null, null,
            "5E Decontamination Limpet Controller"),
    int_dronecontrol_decontamination_size7_class1(null, null,
            "7E Decontamination Limpet Controller"),


    /**
     * Recon Limpet Controller
     */

    int_dronecontrol_recon_size1_class1(null, null,
            "1E Recon Limpet Controller"),
    int_dronecontrol_recon_size3_class1(null, null,
            "3E Recon Limpet Controller"),
    int_dronecontrol_recon_size5_class1(null, null,
            "5E Recon Limpet Controller"),
    int_dronecontrol_recon_size7_class1(null, null,
            "7E Recon Limpet Controller"),


    /**
     * Research Limpet Controller
     */

    int_dronecontrol_unkvesselresearch(null, null,
            "Research Limpet Controller"),


    /**
     * SRV Bays
     */

    int_buggybay_size2_class1(null, null,
            "2E Planetary Vehicle Hangar"),
    int_buggybay_size2_class2(null, null,
            "2D Planetary Vehicle Hangar"),

    int_buggybay_size4_class1(null, null,
            "4E Planetary Vehicle Hangar"),
    int_buggybay_size4_class2(null, null,
            "4D Planetary Vehicle Hangar"),

    int_buggybay_size6_class1(null, null,
            "6E Planetary Vehicle Hangar"),
    int_buggybay_size6_class2(null, null,
            "6D Planetary Vehicle Hangar"),


    /**
     * Fighter Bays
     */

    int_fighterbay_size5_class1(null, null,
            "5E Fighter Hangar"),
    int_fighterbay_size6_class1(null, null,
            "6E Fighter Hangar"),
    int_fighterbay_size7_class1(null, null,
            "7E Fighter Hangar"),


    /**
     * Discovery Scanners
     */

    int_stellarbodydiscoveryscanner_standard(null, null,
            "Basic Discovery Scanner"),
    int_stellarbodydiscoveryscanner_intermediate(null, null,
            "Intermediate Discovery Scanner"),
    int_stellarbodydiscoveryscanner_advanced(null, null,
            "Advanced Discovery Scanner"),

    /**
     * Detailed Surface Scanner
     */

    int_detailedsurfacescanner_tiny(ModificationType.Detailed_Surface_Scanner, null,
            "Detailed Surface Scanner"),


    /**
     * Docking Computer
     */

    int_dockingcomputer_standard(null, null,
            "Standard Docking Computer"),


    /**
     * Planetary Approach Suite
     */

    int_planetapproachsuite(null, null,
            "Planetary Approach Suite"),


    /**
     * Faction Specific Modules
     */

    // Aisling Duval

    int_shieldgenerator_size1_class5_strong(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "1A Prismatic Shield Generator"),
    int_shieldgenerator_size2_class5_strong(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "2A Prismatic Shield Generator"),
    int_shieldgenerator_size3_class5_strong(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "3A Prismatic Shield Generator"),
    int_shieldgenerator_size4_class5_strong(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "4A Prismatic Shield Generator"),
    int_shieldgenerator_size5_class5_strong(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "5A Prismatic Shield Generator"),
    int_shieldgenerator_size6_class5_strong(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "6A Prismatic Shield Generator"),
    int_shieldgenerator_size7_class5_strong(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "7A Prismatic Shield Generator"),
    int_shieldgenerator_size8_class5_strong(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator,
            "8A Prismatic Shield Generator"),


    /**
     * Guardian Internal Modules
     */

    // todo: find ENUM values for these
    // Guardian FSD Booster (currently disabled in game, may be a while before its back)


    /**
     * Human Tech Broker Internal Modules
     */

    // todo: find ENUM values for these
    // Corrosion Resistant Cargo Rack
    // Meta Alloy Hull Reinforcement


    ;

    private final String displayText;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;

    OptionalInternalModule(ProcurementType modificationType, ProcurementType experimentalType, String displayText)
    {
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.displayText = displayText;
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
