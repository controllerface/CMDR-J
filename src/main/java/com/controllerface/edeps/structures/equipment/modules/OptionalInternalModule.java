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

    int_shieldgenerator_size1_class3_fast,

    int_shieldgenerator_size2_class1,
    int_shieldgenerator_size2_class2,
    int_shieldgenerator_size2_class3,
    int_shieldgenerator_size2_class3_fast,
    int_shieldgenerator_size2_class4,
    int_shieldgenerator_size2_class5,

    int_shieldgenerator_size3_class1,
    int_shieldgenerator_size3_class2,
    int_shieldgenerator_size3_class3,
    int_shieldgenerator_size3_class3_fast,
    int_shieldgenerator_size3_class4,
    int_shieldgenerator_size3_class5,

    int_shieldgenerator_size4_class1,
    int_shieldgenerator_size4_class2,
    int_shieldgenerator_size4_class3,
    int_shieldgenerator_size4_class3_fast,
    int_shieldgenerator_size4_class4,
    int_shieldgenerator_size4_class5,

    int_shieldgenerator_size5_class1,
    int_shieldgenerator_size5_class2,
    int_shieldgenerator_size5_class3,
    int_shieldgenerator_size5_class3_fast,
    int_shieldgenerator_size5_class4,
    int_shieldgenerator_size5_class5,

    int_shieldgenerator_size6_class1,
    int_shieldgenerator_size6_class2,
    int_shieldgenerator_size6_class3,
    int_shieldgenerator_size6_class3_fast,
    int_shieldgenerator_size6_class4,
    int_shieldgenerator_size6_class5,

    int_shieldgenerator_size7_class1,
    int_shieldgenerator_size7_class2,
    int_shieldgenerator_size7_class3,
    int_shieldgenerator_size7_class3_fast,
    int_shieldgenerator_size7_class4,
    int_shieldgenerator_size7_class5,

    int_shieldgenerator_size8_class1,
    int_shieldgenerator_size8_class2,
    int_shieldgenerator_size8_class3,
    int_shieldgenerator_size8_class3_fast,
    int_shieldgenerator_size8_class4,
    int_shieldgenerator_size8_class5,


    /**
     * Shield Cell Bank
     */

    int_shieldcellbank_size1_class1,
    int_shieldcellbank_size1_class2,
    int_shieldcellbank_size1_class3,
    int_shieldcellbank_size1_class4,
    int_shieldcellbank_size1_class5,

    int_shieldcellbank_size2_class1,
    int_shieldcellbank_size2_class2,
    int_shieldcellbank_size2_class3,
    int_shieldcellbank_size2_class4,
    int_shieldcellbank_size2_class5,

    int_shieldcellbank_size3_class1,
    int_shieldcellbank_size3_class2,
    int_shieldcellbank_size3_class3,
    int_shieldcellbank_size3_class4,
    int_shieldcellbank_size3_class5,

    int_shieldcellbank_size4_class1,
    int_shieldcellbank_size4_class2,
    int_shieldcellbank_size4_class3,
    int_shieldcellbank_size4_class4,
    int_shieldcellbank_size4_class5,

    int_shieldcellbank_size5_class1,
    int_shieldcellbank_size5_class2,
    int_shieldcellbank_size5_class3,
    int_shieldcellbank_size5_class4,
    int_shieldcellbank_size5_class5,

    int_shieldcellbank_size6_class1,
    int_shieldcellbank_size6_class2,
    int_shieldcellbank_size6_class3,
    int_shieldcellbank_size6_class4,
    int_shieldcellbank_size6_class5,

    int_shieldcellbank_size7_class1,
    int_shieldcellbank_size7_class2,
    int_shieldcellbank_size7_class3,
    int_shieldcellbank_size7_class4,
    int_shieldcellbank_size7_class5,

    int_shieldcellbank_size8_class1,
    int_shieldcellbank_size8_class2,
    int_shieldcellbank_size8_class3,
    int_shieldcellbank_size8_class4,
    int_shieldcellbank_size8_class5,


    /**
     * Automated Field Maintenance Unit
     */

    int_repairer_size1_class1,
    int_repairer_size1_class2,
    int_repairer_size1_class3,
    int_repairer_size1_class4,
    int_repairer_size1_class5,

    int_repairer_size2_class1,
    int_repairer_size2_class2,
    int_repairer_size2_class3,
    int_repairer_size2_class4,
    int_repairer_size2_class5,

    int_repairer_size3_class1,
    int_repairer_size3_class2,
    int_repairer_size3_class3,
    int_repairer_size3_class4,
    int_repairer_size3_class5,

    int_repairer_size4_class1,
    int_repairer_size4_class2,
    int_repairer_size4_class3,
    int_repairer_size4_class4,
    int_repairer_size4_class5,

    int_repairer_size5_class1,
    int_repairer_size5_class2,
    int_repairer_size5_class3,
    int_repairer_size5_class4,
    int_repairer_size5_class5,

    int_repairer_size6_class1,
    int_repairer_size6_class2,
    int_repairer_size6_class3,
    int_repairer_size6_class4,
    int_repairer_size6_class5,

    int_repairer_size7_class1,
    int_repairer_size7_class2,
    int_repairer_size7_class3,
    int_repairer_size7_class4,
    int_repairer_size7_class5,

    int_repairer_size8_class1,
    int_repairer_size8_class2,
    int_repairer_size8_class3,
    int_repairer_size8_class4,
    int_repairer_size8_class5,


    /**
     * Hull Reinforcement Packages
     */

    int_hullreinforcement_size1_class1,
    int_hullreinforcement_size1_class2,

    int_hullreinforcement_size2_class1,
    int_hullreinforcement_size2_class2,

    int_hullreinforcement_size3_class1,
    int_hullreinforcement_size3_class2,

    int_hullreinforcement_size4_class1,
    int_hullreinforcement_size4_class2,

    int_hullreinforcement_size5_class1,
    int_hullreinforcement_size5_class2,

    /**
     * Module Reinforcement Packages
     */

    int_modulereinforcement_size1_class1,
    int_modulereinforcement_size1_class2,

    int_modulereinforcement_size2_class1,
    int_modulereinforcement_size2_class2,

    int_modulereinforcement_size3_class1,
    int_modulereinforcement_size3_class2,

    int_modulereinforcement_size4_class1,
    int_modulereinforcement_size4_class2,

    int_modulereinforcement_size5_class1,
    int_modulereinforcement_size5_class2,

    /**
     * Fuel Scoops
     */

    int_fuelscoop_size1_class1,
    int_fuelscoop_size1_class2,
    int_fuelscoop_size1_class3,
    int_fuelscoop_size1_class4,
    int_fuelscoop_size1_class5,

    int_fuelscoop_size2_class1,
    int_fuelscoop_size2_class2,
    int_fuelscoop_size2_class3,
    int_fuelscoop_size2_class4,
    int_fuelscoop_size2_class5,

    int_fuelscoop_size3_class1,
    int_fuelscoop_size3_class2,
    int_fuelscoop_size3_class3,
    int_fuelscoop_size3_class4,
    int_fuelscoop_size3_class5,

    int_fuelscoop_size4_class1,
    int_fuelscoop_size4_class2,
    int_fuelscoop_size4_class3,
    int_fuelscoop_size4_class4,
    int_fuelscoop_size4_class5,

    int_fuelscoop_size5_class1,
    int_fuelscoop_size5_class2,
    int_fuelscoop_size5_class3,
    int_fuelscoop_size5_class4,
    int_fuelscoop_size5_class5,

    int_fuelscoop_size6_class1,
    int_fuelscoop_size6_class2,
    int_fuelscoop_size6_class3,
    int_fuelscoop_size6_class4,
    int_fuelscoop_size6_class5,

    int_fuelscoop_size7_class1,
    int_fuelscoop_size7_class2,
    int_fuelscoop_size7_class3,
    int_fuelscoop_size7_class4,
    int_fuelscoop_size7_class5,

    int_fuelscoop_size8_class1,
    int_fuelscoop_size8_class2,
    int_fuelscoop_size8_class3,
    int_fuelscoop_size8_class4,
    int_fuelscoop_size8_class5,


    /**
     * Refineries
     */

    int_refinery_size1_class1,
    int_refinery_size1_class2,
    int_refinery_size1_class3,
    int_refinery_size1_class4,
    int_refinery_size1_class5,

    int_refinery_size2_class1,
    int_refinery_size2_class2,
    int_refinery_size2_class3,
    int_refinery_size2_class4,
    int_refinery_size2_class5,

    int_refinery_size3_class1,
    int_refinery_size3_class2,
    int_refinery_size3_class3,
    int_refinery_size3_class4,
    int_refinery_size3_class5,

    int_refinery_size4_class1,
    int_refinery_size4_class2,
    int_refinery_size4_class3,
    int_refinery_size4_class4,
    int_refinery_size4_class5,


    /**
     * FSD Interdictors
     */

    int_fsdinterdictor_size1_class1,
    int_fsdinterdictor_size1_class2,
    int_fsdinterdictor_size1_class3,
    int_fsdinterdictor_size1_class4,
    int_fsdinterdictor_size1_class5,

    int_fsdinterdictor_size2_class1,
    int_fsdinterdictor_size2_class2,
    int_fsdinterdictor_size2_class3,
    int_fsdinterdictor_size2_class4,
    int_fsdinterdictor_size2_class5,

    int_fsdinterdictor_size3_class1,
    int_fsdinterdictor_size3_class2,
    int_fsdinterdictor_size3_class3,
    int_fsdinterdictor_size3_class4,
    int_fsdinterdictor_size3_class5,

    int_fsdinterdictor_size4_class1,
    int_fsdinterdictor_size4_class2,
    int_fsdinterdictor_size4_class3,
    int_fsdinterdictor_size4_class4,
    int_fsdinterdictor_size4_class5,


    /**
     * Cargo Racks
     */

    int_cargorack_size1_class1,
    int_cargorack_size2_class1,
    int_cargorack_size3_class1,
    int_cargorack_size4_class1,
    int_cargorack_size5_class1,
    int_cargorack_size6_class1,
    int_cargorack_size7_class1,
    int_cargorack_size8_class1,


    /**
     * Passenger Cabins
     */

    int_passengercabin_size2_class1,

    int_passengercabin_size3_class1,
    int_passengercabin_size3_class2,

    int_passengercabin_size4_class1,
    int_passengercabin_size4_class2,
    int_passengercabin_size4_class3,

    int_passengercabin_size5_class1,
    int_passengercabin_size5_class2,
    int_passengercabin_size5_class3,
    int_passengercabin_size5_class4,

    int_passengercabin_size6_class1,
    int_passengercabin_size6_class2,
    int_passengercabin_size6_class3,
    int_passengercabin_size6_class4,


    /**
     * Collector Limpet Controllers
     */

    int_dronecontrol_collection_size1_class1,
    int_dronecontrol_collection_size1_class2,
    int_dronecontrol_collection_size1_class3,
    int_dronecontrol_collection_size1_class4,
    int_dronecontrol_collection_size1_class5,

    int_dronecontrol_collection_size3_class1,
    int_dronecontrol_collection_size3_class2,
    int_dronecontrol_collection_size3_class3,
    int_dronecontrol_collection_size3_class4,
    int_dronecontrol_collection_size3_class5,

    int_dronecontrol_collection_size5_class1,
    int_dronecontrol_collection_size5_class2,
    int_dronecontrol_collection_size5_class3,
    int_dronecontrol_collection_size5_class4,
    int_dronecontrol_collection_size5_class5,

    int_dronecontrol_collection_size7_class1,
    int_dronecontrol_collection_size7_class2,
    int_dronecontrol_collection_size7_class3,
    int_dronecontrol_collection_size7_class4,
    int_dronecontrol_collection_size7_class5,


    /**
     * Prospector Limpet Controllers
     */

    int_dronecontrol_prospector_size1_class1,
    int_dronecontrol_prospector_size1_class2,
    int_dronecontrol_prospector_size1_class3,
    int_dronecontrol_prospector_size1_class4,
    int_dronecontrol_prospector_size1_class5,

    int_dronecontrol_prospector_size3_class1,
    int_dronecontrol_prospector_size3_class2,
    int_dronecontrol_prospector_size3_class3,
    int_dronecontrol_prospector_size3_class4,
    int_dronecontrol_prospector_size3_class5,

    int_dronecontrol_prospector_size5_class1,
    int_dronecontrol_prospector_size5_class2,
    int_dronecontrol_prospector_size5_class3,
    int_dronecontrol_prospector_size5_class4,
    int_dronecontrol_prospector_size5_class5,

    int_dronecontrol_prospector_size7_class1,
    int_dronecontrol_prospector_size7_class2,
    int_dronecontrol_prospector_size7_class3,
    int_dronecontrol_prospector_size7_class4,
    int_dronecontrol_prospector_size7_class5,


    /**
     * Fuel Transfer Limpet Controllers
     */

    int_dronecontrol_fueltransfer_size1_class1,
    int_dronecontrol_fueltransfer_size1_class2,
    int_dronecontrol_fueltransfer_size1_class3,
    int_dronecontrol_fueltransfer_size1_class4,
    int_dronecontrol_fueltransfer_size1_class5,

    int_dronecontrol_fueltransfer_size3_class1,
    int_dronecontrol_fueltransfer_size3_class2,
    int_dronecontrol_fueltransfer_size3_class3,
    int_dronecontrol_fueltransfer_size3_class4,
    int_dronecontrol_fueltransfer_size3_class5,

    int_dronecontrol_fueltransfer_size5_class1,
    int_dronecontrol_fueltransfer_size5_class2,
    int_dronecontrol_fueltransfer_size5_class3,
    int_dronecontrol_fueltransfer_size5_class4,
    int_dronecontrol_fueltransfer_size5_class5,

    int_dronecontrol_fueltransfer_size7_class1,
    int_dronecontrol_fueltransfer_size7_class2,
    int_dronecontrol_fueltransfer_size7_class3,
    int_dronecontrol_fueltransfer_size7_class4,
    int_dronecontrol_fueltransfer_size7_class5,


    /**
     * Repair Limpet Controllers
     */

    int_dronecontrol_repair_size1_class1,
    int_dronecontrol_repair_size1_class2,
    int_dronecontrol_repair_size1_class3,
    int_dronecontrol_repair_size1_class4,
    int_dronecontrol_repair_size1_class5,

    int_dronecontrol_repair_size3_class1,
    int_dronecontrol_repair_size3_class2,
    int_dronecontrol_repair_size3_class3,
    int_dronecontrol_repair_size3_class4,
    int_dronecontrol_repair_size3_class5,

    int_dronecontrol_repair_size5_class1,
    int_dronecontrol_repair_size5_class2,
    int_dronecontrol_repair_size5_class3,
    int_dronecontrol_repair_size5_class4,
    int_dronecontrol_repair_size5_class5,

    int_dronecontrol_repair_size7_class1,
    int_dronecontrol_repair_size7_class2,
    int_dronecontrol_repair_size7_class3,
    int_dronecontrol_repair_size7_class4,
    int_dronecontrol_repair_size7_class5,


    /**
     * Hatch Breaker Limpet Controllers
     */

    int_dronecontrol_resourcesiphon_size1_class1,
    int_dronecontrol_resourcesiphon_size1_class2,
    int_dronecontrol_resourcesiphon_size1_class3,
    int_dronecontrol_resourcesiphon_size1_class4,
    int_dronecontrol_resourcesiphon_size1_class5,

    int_dronecontrol_resourcesiphon_size3_class1,
    int_dronecontrol_resourcesiphon_size3_class2,
    int_dronecontrol_resourcesiphon_size3_class3,
    int_dronecontrol_resourcesiphon_size3_class4,
    int_dronecontrol_resourcesiphon_size3_class5,

    int_dronecontrol_resourcesiphon_size5_class1,
    int_dronecontrol_resourcesiphon_size5_class2,
    int_dronecontrol_resourcesiphon_size5_class3,
    int_dronecontrol_resourcesiphon_size5_class4,
    int_dronecontrol_resourcesiphon_size5_class5,

    int_dronecontrol_resourcesiphon_size7_class1,
    int_dronecontrol_resourcesiphon_size7_class2,
    int_dronecontrol_resourcesiphon_size7_class3,
    int_dronecontrol_resourcesiphon_size7_class4,
    int_dronecontrol_resourcesiphon_size7_class5,


    /**
     * Decontamination Limpet Controllers
     */

    int_dronecontrol_decontamination_size1_class1,
    int_dronecontrol_decontamination_size3_class1,
    int_dronecontrol_decontamination_size5_class1,
    int_dronecontrol_decontamination_size7_class1,


    /**
     * Recon Limpet Controller
     */

    int_dronecontrol_recon_size1_class1,
    int_dronecontrol_recon_size3_class1,
    int_dronecontrol_recon_size5_class1,
    int_dronecontrol_recon_size7_class1,


    /**
     * Research Limpet Controller
     */

    int_dronecontrol_unkvesselresearch,


    /**
     * SRV Bays
     */

    int_buggybay_size2_class1,
    int_buggybay_size2_class2,

    int_buggybay_size4_class1,
    int_buggybay_size4_class2,

    int_buggybay_size6_class1,
    int_buggybay_size6_class2,


    /**
     * Fighter Bays
     */

    int_fighterbay_size5_class1,
    int_fighterbay_size6_class1,
    int_fighterbay_size7_class1,


    /**
     * Discovery Scanners
     */

    int_stellarbodydiscoveryscanner_standard,
    int_stellarbodydiscoveryscanner_intermediate,
    int_stellarbodydiscoveryscanner_advanced,

    /**
     * Detailed Surface Scanner
     */

    int_detailedsurfacescanner_tiny,


    /**
     * Docking Computer
     */

    int_dockingcomputer_standard,


    /**
     * Planetary Approach Suite
     */

    int_planetapproachsuite,

    ;

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
