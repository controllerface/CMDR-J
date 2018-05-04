package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ShipModule;

import java.util.Arrays;

/**
 * Created by Stephen on 4/25/2018.
 */
public enum OptionalInternalModule implements ShipModule
{
    /**
     * Shield Generators
     */

    int_shieldgenerator_size2_class1("2E Shield Generator"),
    int_shieldgenerator_size2_class2("2D Shield Generator"),
    int_shieldgenerator_size2_class3("2C Shield Generator"),
    int_shieldgenerator_size2_class4("2B Shield Generator"),
    int_shieldgenerator_size2_class5("2A Shield Generator"),

    int_shieldgenerator_size3_class1("3E Shield Generator"),
    int_shieldgenerator_size3_class2("3D Shield Generator"),
    int_shieldgenerator_size3_class3("3C Shield Generator"),
    int_shieldgenerator_size3_class4("3B Shield Generator"),
    int_shieldgenerator_size3_class5("3A Shield Generator"),

    int_shieldgenerator_size4_class1("4E Shield Generator"),
    int_shieldgenerator_size4_class2("4D Shield Generator"),
    int_shieldgenerator_size4_class3("4C Shield Generator"),
    int_shieldgenerator_size4_class4("4B Shield Generator"),
    int_shieldgenerator_size4_class5("4A Shield Generator"),

    int_shieldgenerator_size5_class1("5E Shield Generator"),
    int_shieldgenerator_size5_class2("5D Shield Generator"),
    int_shieldgenerator_size5_class3("5C Shield Generator"),
    int_shieldgenerator_size5_class4("5B Shield Generator"),
    int_shieldgenerator_size5_class5("5A Shield Generator"),

    int_shieldgenerator_size6_class1("6E Shield Generator"),
    int_shieldgenerator_size6_class2("6D Shield Generator"),
    int_shieldgenerator_size6_class3("6C Shield Generator"),
    int_shieldgenerator_size6_class4("6B Shield Generator"),
    int_shieldgenerator_size6_class5("6A Shield Generator"),

    int_shieldgenerator_size7_class1("7E Shield Generator"),
    int_shieldgenerator_size7_class2("7D Shield Generator"),
    int_shieldgenerator_size7_class3("7C Shield Generator"),
    int_shieldgenerator_size7_class4("7B Shield Generator"),
    int_shieldgenerator_size7_class5("7A Shield Generator"),

    int_shieldgenerator_size8_class1("8E Shield Generator"),
    int_shieldgenerator_size8_class2("8D Shield Generator"),
    int_shieldgenerator_size8_class3("8C Shield Generator"),
    int_shieldgenerator_size8_class4("8B Shield Generator"),
    int_shieldgenerator_size8_class5("8A Shield Generator"),


    /**
     * Bi-Weave Shield Generators
     */

    int_shieldgenerator_size1_class3_fast("1C Bi-Weave Shield Generator"),
    int_shieldgenerator_size2_class3_fast("2C Bi-Weave Shield Generator"),
    int_shieldgenerator_size3_class3_fast("3C Bi-Weave Shield Generator"),
    int_shieldgenerator_size4_class3_fast("4C Bi-Weave Shield Generator"),
    int_shieldgenerator_size5_class3_fast("5C Bi-Weave Shield Generator"),
    int_shieldgenerator_size6_class3_fast("6C Bi-Weave Shield Generator"),
    int_shieldgenerator_size7_class3_fast("7C Bi-Weave Shield Generator"),
    int_shieldgenerator_size8_class3_fast("8c Bi-Weave Shield Generator"),


    /**
     * Shield Cell Bank
     */

    int_shieldcellbank_size1_class1("1E Shield Cell Bank"),
    int_shieldcellbank_size1_class2("1D Shield Cell Bank"),
    int_shieldcellbank_size1_class3("1C Shield Cell Bank"),
    int_shieldcellbank_size1_class4("1B Shield Cell Bank"),
    int_shieldcellbank_size1_class5("1A Shield Cell Bank"),

    int_shieldcellbank_size2_class1("2E Shield Cell Bank"),
    int_shieldcellbank_size2_class2("2D Shield Cell Bank"),
    int_shieldcellbank_size2_class3("2C Shield Cell Bank"),
    int_shieldcellbank_size2_class4("2B Shield Cell Bank"),
    int_shieldcellbank_size2_class5("2A Shield Cell Bank"),

    int_shieldcellbank_size3_class1("3E Shield Cell Bank"),
    int_shieldcellbank_size3_class2("3D Shield Cell Bank"),
    int_shieldcellbank_size3_class3("3C Shield Cell Bank"),
    int_shieldcellbank_size3_class4("3B Shield Cell Bank"),
    int_shieldcellbank_size3_class5("3A Shield Cell Bank"),

    int_shieldcellbank_size4_class1("4E Shield Cell Bank"),
    int_shieldcellbank_size4_class2("4D Shield Cell Bank"),
    int_shieldcellbank_size4_class3("4C Shield Cell Bank"),
    int_shieldcellbank_size4_class4("4B Shield Cell Bank"),
    int_shieldcellbank_size4_class5("4A Shield Cell Bank"),

    int_shieldcellbank_size5_class1("5E Shield Cell Bank"),
    int_shieldcellbank_size5_class2("5D Shield Cell Bank"),
    int_shieldcellbank_size5_class3("5C Shield Cell Bank"),
    int_shieldcellbank_size5_class4("5B Shield Cell Bank"),
    int_shieldcellbank_size5_class5("5A Shield Cell Bank"),

    int_shieldcellbank_size6_class1("6E Shield Cell Bank"),
    int_shieldcellbank_size6_class2("6D Shield Cell Bank"),
    int_shieldcellbank_size6_class3("6C Shield Cell Bank"),
    int_shieldcellbank_size6_class4("6B Shield Cell Bank"),
    int_shieldcellbank_size6_class5("6A Shield Cell Bank"),

    int_shieldcellbank_size7_class1("7E Shield Cell Bank"),
    int_shieldcellbank_size7_class2("7D Shield Cell Bank"),
    int_shieldcellbank_size7_class3("7C Shield Cell Bank"),
    int_shieldcellbank_size7_class4("7B Shield Cell Bank"),
    int_shieldcellbank_size7_class5("7A Shield Cell Bank"),

    int_shieldcellbank_size8_class1("8E Shield Cell Bank"),
    int_shieldcellbank_size8_class2("8D Shield Cell Bank"),
    int_shieldcellbank_size8_class3("8C Shield Cell Bank"),
    int_shieldcellbank_size8_class4("8B Shield Cell Bank"),
    int_shieldcellbank_size8_class5("8A Shield Cell Bank"),


    /**
     * Automated Field Maintenance Unit
     */

    int_repairer_size1_class1("1E Automated Field Maintenance Unit"),
    int_repairer_size1_class2("1D Automated Field Maintenance Unit"),
    int_repairer_size1_class3("1C Automated Field Maintenance Unit"),
    int_repairer_size1_class4("1B Automated Field Maintenance Unit"),
    int_repairer_size1_class5("1A Automated Field Maintenance Unit"),

    int_repairer_size2_class1("2E Automated Field Maintenance Unit"),
    int_repairer_size2_class2("2D Automated Field Maintenance Unit"),
    int_repairer_size2_class3("2C Automated Field Maintenance Unit"),
    int_repairer_size2_class4("2B Automated Field Maintenance Unit"),
    int_repairer_size2_class5("2A Automated Field Maintenance Unit"),

    int_repairer_size3_class1("3E Automated Field Maintenance Unit"),
    int_repairer_size3_class2("3D Automated Field Maintenance Unit"),
    int_repairer_size3_class3("3C Automated Field Maintenance Unit"),
    int_repairer_size3_class4("3B Automated Field Maintenance Unit"),
    int_repairer_size3_class5("3A Automated Field Maintenance Unit"),

    int_repairer_size4_class1("4E Automated Field Maintenance Unit"),
    int_repairer_size4_class2("4D Automated Field Maintenance Unit"),
    int_repairer_size4_class3("4C Automated Field Maintenance Unit"),
    int_repairer_size4_class4("4B Automated Field Maintenance Unit"),
    int_repairer_size4_class5("4A Automated Field Maintenance Unit"),

    int_repairer_size5_class1("5E Automated Field Maintenance Unit"),
    int_repairer_size5_class2("5D Automated Field Maintenance Unit"),
    int_repairer_size5_class3("5C Automated Field Maintenance Unit"),
    int_repairer_size5_class4("5B Automated Field Maintenance Unit"),
    int_repairer_size5_class5("5A Automated Field Maintenance Unit"),

    int_repairer_size6_class1("6E Automated Field Maintenance Unit"),
    int_repairer_size6_class2("6D Automated Field Maintenance Unit"),
    int_repairer_size6_class3("6C Automated Field Maintenance Unit"),
    int_repairer_size6_class4("6B Automated Field Maintenance Unit"),
    int_repairer_size6_class5("6A Automated Field Maintenance Unit"),

    int_repairer_size7_class1("7E Automated Field Maintenance Unit"),
    int_repairer_size7_class2("7D Automated Field Maintenance Unit"),
    int_repairer_size7_class3("7C Automated Field Maintenance Unit"),
    int_repairer_size7_class4("7B Automated Field Maintenance Unit"),
    int_repairer_size7_class5("7A Automated Field Maintenance Unit"),

    int_repairer_size8_class1("8E Automated Field Maintenance Unit"),
    int_repairer_size8_class2("8D Automated Field Maintenance Unit"),
    int_repairer_size8_class3("8C Automated Field Maintenance Unit"),
    int_repairer_size8_class4("8B Automated Field Maintenance Unit"),
    int_repairer_size8_class5("8A Automated Field Maintenance Unit"),


    /**
     * Hull Reinforcement Packages
     */

    int_hullreinforcement_size1_class1("1E Hull Reinforcement Package"),
    int_hullreinforcement_size1_class2("1D Hull Reinforcement Package"),

    int_hullreinforcement_size2_class1("2E Hull Reinforcement Package"),
    int_hullreinforcement_size2_class2("2D Hull Reinforcement Package"),

    int_hullreinforcement_size3_class1("3E Hull Reinforcement Package"),
    int_hullreinforcement_size3_class2("3D Hull Reinforcement Package"),

    int_hullreinforcement_size4_class1("4E Hull Reinforcement Package"),
    int_hullreinforcement_size4_class2("4D Hull Reinforcement Package"),

    int_hullreinforcement_size5_class1("5E Hull Reinforcement Package"),
    int_hullreinforcement_size5_class2("5D Hull Reinforcement Package"),

    /**
     * Module Reinforcement Packages
     */

    int_modulereinforcement_size1_class1("1E Module Reinforcement Package"),
    int_modulereinforcement_size1_class2("1D Module Reinforcement Package"),

    int_modulereinforcement_size2_class1("2E Module Reinforcement Package"),
    int_modulereinforcement_size2_class2("2D Module Reinforcement Package"),

    int_modulereinforcement_size3_class1("3E Module Reinforcement Package"),
    int_modulereinforcement_size3_class2("3D Module Reinforcement Package"),

    int_modulereinforcement_size4_class1("4E Module Reinforcement Package"),
    int_modulereinforcement_size4_class2("4D Module Reinforcement Package"),

    int_modulereinforcement_size5_class1("5E Module Reinforcement Package"),
    int_modulereinforcement_size5_class2("5D Module Reinforcement Package"),

    /**
     * Fuel Scoops
     */

    int_fuelscoop_size1_class1("1E Fuel Scoop"),
    int_fuelscoop_size1_class2("1D Fuel Scoop"),
    int_fuelscoop_size1_class3("1C Fuel Scoop"),
    int_fuelscoop_size1_class4("1B Fuel Scoop"),
    int_fuelscoop_size1_class5("1A Fuel Scoop"),

    int_fuelscoop_size2_class1("2E Fuel Scoop"),
    int_fuelscoop_size2_class2("2D Fuel Scoop"),
    int_fuelscoop_size2_class3("2C Fuel Scoop"),
    int_fuelscoop_size2_class4("2B Fuel Scoop"),
    int_fuelscoop_size2_class5("2A Fuel Scoop"),

    int_fuelscoop_size3_class1("3E Fuel Scoop"),
    int_fuelscoop_size3_class2("3D Fuel Scoop"),
    int_fuelscoop_size3_class3("3C Fuel Scoop"),
    int_fuelscoop_size3_class4("3B Fuel Scoop"),
    int_fuelscoop_size3_class5("3A Fuel Scoop"),

    int_fuelscoop_size4_class1("4E Fuel Scoop"),
    int_fuelscoop_size4_class2("4D Fuel Scoop"),
    int_fuelscoop_size4_class3("4C Fuel Scoop"),
    int_fuelscoop_size4_class4("4B Fuel Scoop"),
    int_fuelscoop_size4_class5("4A Fuel Scoop"),

    int_fuelscoop_size5_class1("5E Fuel Scoop"),
    int_fuelscoop_size5_class2("5D Fuel Scoop"),
    int_fuelscoop_size5_class3("5C Fuel Scoop"),
    int_fuelscoop_size5_class4("5B Fuel Scoop"),
    int_fuelscoop_size5_class5("5A Fuel Scoop"),

    int_fuelscoop_size6_class1("6E Fuel Scoop"),
    int_fuelscoop_size6_class2("6D Fuel Scoop"),
    int_fuelscoop_size6_class3("6C Fuel Scoop"),
    int_fuelscoop_size6_class4("6B Fuel Scoop"),
    int_fuelscoop_size6_class5("6A Fuel Scoop"),

    int_fuelscoop_size7_class1("7E Fuel Scoop"),
    int_fuelscoop_size7_class2("7D Fuel Scoop"),
    int_fuelscoop_size7_class3("7C Fuel Scoop"),
    int_fuelscoop_size7_class4("7BFuel Scoop"),
    int_fuelscoop_size7_class5("7A Fuel Scoop"),

    int_fuelscoop_size8_class1("8E Fuel Scoop"),
    int_fuelscoop_size8_class2("8D Fuel Scoop"),
    int_fuelscoop_size8_class3("8C Fuel Scoop"),
    int_fuelscoop_size8_class4("8B Fuel Scoop"),
    int_fuelscoop_size8_class5("8A Fuel Scoop"),


    /**
     * Refineries
     */

    int_refinery_size1_class1("1E Refinery"),
    int_refinery_size1_class2("1D Refinery"),
    int_refinery_size1_class3("1C Refinery"),
    int_refinery_size1_class4("1B Refinery"),
    int_refinery_size1_class5("1A Refinery"),

    int_refinery_size2_class1("2E Refinery"),
    int_refinery_size2_class2("2D Refinery"),
    int_refinery_size2_class3("2C Refinery"),
    int_refinery_size2_class4("2B Refinery"),
    int_refinery_size2_class5("2A Refinery"),

    int_refinery_size3_class1("3E Refinery"),
    int_refinery_size3_class2("3D Refinery"),
    int_refinery_size3_class3("3C Refinery"),
    int_refinery_size3_class4("3B Refinery"),
    int_refinery_size3_class5("3A Refinery"),

    int_refinery_size4_class1("4E Refinery"),
    int_refinery_size4_class2("4D Refinery"),
    int_refinery_size4_class3("4C Refinery"),
    int_refinery_size4_class4("4B Refinery"),
    int_refinery_size4_class5("4A Refinery"),


    /**
     * FSD Interdictors
     */

    int_fsdinterdictor_size1_class1("1E Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size1_class2("1D Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size1_class3("1C Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size1_class4("1B Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size1_class5("1A Frame Shift Drive Interdictor"),

    int_fsdinterdictor_size2_class1("2E Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size2_class2("2D Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size2_class3("2C Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size2_class4("2B Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size2_class5("2A Frame Shift Drive Interdictor"),

    int_fsdinterdictor_size3_class1("3E Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size3_class2("3D Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size3_class3("3C Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size3_class4("3B Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size3_class5("3A Frame Shift Drive Interdictor"),

    int_fsdinterdictor_size4_class1("4E Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size4_class2("4D Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size4_class3("4C Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size4_class4("4B Frame Shift Drive Interdictor"),
    int_fsdinterdictor_size4_class5("4A Frame Shift Drive Interdictor"),


    /**
     * Cargo Racks
     */

    int_cargorack_size1_class1("1E Cargo Rack"),
    int_cargorack_size2_class1("2E Cargo Rack"),
    int_cargorack_size3_class1("3E Cargo Rack"),
    int_cargorack_size4_class1("4E Cargo Rack"),
    int_cargorack_size5_class1("5E Cargo Rack"),
    int_cargorack_size6_class1("6E Cargo Rack"),
    int_cargorack_size7_class1("7E Cargo Rack"),
    int_cargorack_size8_class1("8E Cargo Rack"),


    /**
     * Passenger Cabins
     */

    int_passengercabin_size2_class1("2E Passenger Cabin"),

    int_passengercabin_size3_class1("3E Passenger Cabin"),
    int_passengercabin_size3_class2("3D Passenger Cabin"),

    int_passengercabin_size4_class1("4E Passenger Cabin"),
    int_passengercabin_size4_class2("4D Passenger Cabin"),
    int_passengercabin_size4_class3("4C Passenger Cabin"),

    int_passengercabin_size5_class1("5E Passenger Cabin"),
    int_passengercabin_size5_class2("5D Passenger Cabin"),
    int_passengercabin_size5_class3("5C Passenger Cabin"),
    int_passengercabin_size5_class4("5B Passenger Cabin"),

    int_passengercabin_size6_class1("6E Passenger Cabin"),
    int_passengercabin_size6_class2("6D Passenger Cabin"),
    int_passengercabin_size6_class3("6C Passenger Cabin"),
    int_passengercabin_size6_class4("6B Passenger Cabin"),


    /**
     * Collector Limpet Controllers
     */

    int_dronecontrol_collection_size1_class1("1E Collector Limpet Controller"),
    int_dronecontrol_collection_size1_class2("1D Collector Limpet Controller"),
    int_dronecontrol_collection_size1_class3("1C Collector Limpet Controller"),
    int_dronecontrol_collection_size1_class4("1B Collector Limpet Controller"),
    int_dronecontrol_collection_size1_class5("1A Collector Limpet Controller"),

    int_dronecontrol_collection_size3_class1("3E Collector Limpet Controller"),
    int_dronecontrol_collection_size3_class2("3D Collector Limpet Controller"),
    int_dronecontrol_collection_size3_class3("3C Collector Limpet Controller"),
    int_dronecontrol_collection_size3_class4("3B Collector Limpet Controller"),
    int_dronecontrol_collection_size3_class5("3A Collector Limpet Controller"),

    int_dronecontrol_collection_size5_class1("5E Collector Limpet Controller"),
    int_dronecontrol_collection_size5_class2("5D Collector Limpet Controller"),
    int_dronecontrol_collection_size5_class3("5C Collector Limpet Controller"),
    int_dronecontrol_collection_size5_class4("5B Collector Limpet Controller"),
    int_dronecontrol_collection_size5_class5("5A Collector Limpet Controller"),

    int_dronecontrol_collection_size7_class1("7E Collector Limpet Controller"),
    int_dronecontrol_collection_size7_class2("7D Collector Limpet Controller"),
    int_dronecontrol_collection_size7_class3("7C Collector Limpet Controller"),
    int_dronecontrol_collection_size7_class4("7B Collector Limpet Controller"),
    int_dronecontrol_collection_size7_class5("7A Collector Limpet Controller"),


    /**
     * Prospector Limpet Controllers
     */

    int_dronecontrol_prospector_size1_class1("1E Prospector Limpet Controller"),
    int_dronecontrol_prospector_size1_class2("1D Prospector Limpet Controller"),
    int_dronecontrol_prospector_size1_class3("1C Prospector Limpet Controller"),
    int_dronecontrol_prospector_size1_class4("1B Prospector Limpet Controller"),
    int_dronecontrol_prospector_size1_class5("1A Prospector Limpet Controller"),

    int_dronecontrol_prospector_size3_class1("3E Prospector Limpet Controller"),
    int_dronecontrol_prospector_size3_class2("3D Prospector Limpet Controller"),
    int_dronecontrol_prospector_size3_class3("3C Prospector Limpet Controller"),
    int_dronecontrol_prospector_size3_class4("3B Prospector Limpet Controller"),
    int_dronecontrol_prospector_size3_class5("3A Prospector Limpet Controller"),

    int_dronecontrol_prospector_size5_class1("5E Prospector Limpet Controller"),
    int_dronecontrol_prospector_size5_class2("5D Prospector Limpet Controller"),
    int_dronecontrol_prospector_size5_class3("5C Prospector Limpet Controller"),
    int_dronecontrol_prospector_size5_class4("5B Prospector Limpet Controller"),
    int_dronecontrol_prospector_size5_class5("5A Prospector Limpet Controller"),

    int_dronecontrol_prospector_size7_class1("7E Prospector Limpet Controller"),
    int_dronecontrol_prospector_size7_class2("7D Prospector Limpet Controller"),
    int_dronecontrol_prospector_size7_class3("7C Prospector Limpet Controller"),
    int_dronecontrol_prospector_size7_class4("7B Prospector Limpet Controller"),
    int_dronecontrol_prospector_size7_class5("7A Prospector Limpet Controller"),


    /**
     * Fuel Transfer Limpet Controllers
     */

    int_dronecontrol_fueltransfer_size1_class1("1E Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size1_class2("1D Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size1_class3("1C Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size1_class4("1B Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size1_class5("1A Fuel Transfer Limpet Controller"),

    int_dronecontrol_fueltransfer_size3_class1("3E Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size3_class2("3D Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size3_class3("3C Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size3_class4("3B Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size3_class5("3A Fuel Transfer Limpet Controller"),

    int_dronecontrol_fueltransfer_size5_class1("5E Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size5_class2("5D Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size5_class3("5C Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size5_class4("5B Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size5_class5("5A Fuel Transfer Limpet Controller"),

    int_dronecontrol_fueltransfer_size7_class1("7E Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size7_class2("7D Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size7_class3("7C Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size7_class4("7B Fuel Transfer Limpet Controller"),
    int_dronecontrol_fueltransfer_size7_class5("7A Fuel Transfer Limpet Controller"),


    /**
     * Repair Limpet Controllers
     */

    int_dronecontrol_repair_size1_class1("1E Repair Limpet Controller"),
    int_dronecontrol_repair_size1_class2("1D Repair Limpet Controller"),
    int_dronecontrol_repair_size1_class3("1C Repair Limpet Controller"),
    int_dronecontrol_repair_size1_class4("1B Repair Limpet Controller"),
    int_dronecontrol_repair_size1_class5("1A Repair Limpet Controller"),

    int_dronecontrol_repair_size3_class1("3E Repair Limpet Controller"),
    int_dronecontrol_repair_size3_class2("3D Repair Limpet Controller"),
    int_dronecontrol_repair_size3_class3("3C Repair Limpet Controller"),
    int_dronecontrol_repair_size3_class4("3B Repair Limpet Controller"),
    int_dronecontrol_repair_size3_class5("3A Repair Limpet Controller"),

    int_dronecontrol_repair_size5_class1("5E Repair Limpet Controller"),
    int_dronecontrol_repair_size5_class2("5D Repair Limpet Controller"),
    int_dronecontrol_repair_size5_class3("5C Repair Limpet Controller"),
    int_dronecontrol_repair_size5_class4("5B Repair Limpet Controller"),
    int_dronecontrol_repair_size5_class5("5A Repair Limpet Controller"),

    int_dronecontrol_repair_size7_class1("7E Repair Limpet Controller"),
    int_dronecontrol_repair_size7_class2("7D Repair Limpet Controller"),
    int_dronecontrol_repair_size7_class3("7C Repair Limpet Controller"),
    int_dronecontrol_repair_size7_class4("7B Repair Limpet Controller"),
    int_dronecontrol_repair_size7_class5("7A Repair Limpet Controller"),


    /**
     * Hatch Breaker Limpet Controllers
     */

    int_dronecontrol_resourcesiphon_size1_class1("1E Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size1_class2("1D Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size1_class3("1C Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size1_class4("1B Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size1_class5("1A Hatch Breaker Limpet Controller"),

    int_dronecontrol_resourcesiphon_size3_class1("3E Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size3_class2("3D Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size3_class3("3C Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size3_class4("3B Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size3_class5("3A Hatch Breaker Limpet Controller"),

    int_dronecontrol_resourcesiphon_size5_class1("5E Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size5_class2("5D Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size5_class3("5C Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size5_class4("5B Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size5_class5("5A Hatch Breaker Limpet Controller"),

    int_dronecontrol_resourcesiphon_size7_class1("7E Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size7_class2("7D Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size7_class3("7C Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size7_class4("7B Hatch Breaker Limpet Controller"),
    int_dronecontrol_resourcesiphon_size7_class5("7A Hatch Breaker Limpet Controller"),


    /**
     * Decontamination Limpet Controllers
     */

    int_dronecontrol_decontamination_size1_class1("1E Decontamination Limpet Controller"),
    int_dronecontrol_decontamination_size3_class1("3E Decontamination Limpet Controller"),
    int_dronecontrol_decontamination_size5_class1("5E Decontamination Limpet Controller"),
    int_dronecontrol_decontamination_size7_class1("7E Decontamination Limpet Controller"),


    /**
     * Recon Limpet Controller
     */

    int_dronecontrol_recon_size1_class1("1E Recon Limpet Controller"),
    int_dronecontrol_recon_size3_class1("3E Recon Limpet Controller"),
    int_dronecontrol_recon_size5_class1("5E Recon Limpet Controller"),
    int_dronecontrol_recon_size7_class1("7E Recon Limpet Controller"),


    /**
     * Research Limpet Controller
     */

    int_dronecontrol_unkvesselresearch("Research Limpet Controller"),


    /**
     * SRV Bays
     */

    int_buggybay_size2_class1("2E Planetary Vehicle Hangar"),
    int_buggybay_size2_class2("2D Planetary Vehicle Hangar"),

    int_buggybay_size4_class1("4E Planetary Vehicle Hangar"),
    int_buggybay_size4_class2("4D Planetary Vehicle Hangar"),

    int_buggybay_size6_class1("6E Planetary Vehicle Hangar"),
    int_buggybay_size6_class2("6D Planetary Vehicle Hangar"),


    /**
     * Fighter Bays
     */

    int_fighterbay_size5_class1("5E Fighter Hangar"),
    int_fighterbay_size6_class1("6E Fighter Hangar"),
    int_fighterbay_size7_class1("7E Fighter Hangar"),


    /**
     * Discovery Scanners
     */

    int_stellarbodydiscoveryscanner_standard("Basic Discovery Scanner"),
    int_stellarbodydiscoveryscanner_intermediate("Intermediate Discovery Scanner"),
    int_stellarbodydiscoveryscanner_advanced("Advanced Discovery Scanner"),

    /**
     * Detailed Surface Scanner
     */

    int_detailedsurfacescanner_tiny("Detailed Surface Scanner"),


    /**
     * Docking Computer
     */

    int_dockingcomputer_standard("Standard Docking Computer"),


    /**
     * Planetary Approach Suite
     */

    int_planetapproachsuite("Planetary Approach Suite"),

    ;

    private final String displayText;

    OptionalInternalModule(String displayText)
    {
        this.displayText = displayText;
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
