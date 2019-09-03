package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size1.*;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size2.*;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size3.AFMU_3A;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size3.AFMU_3C;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size3.AFMU_3D;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size3.AFMU_3E;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size4.*;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size5.*;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size6.*;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size7.*;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.size8.*;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size1.CargoRack_1E;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size1.CargoRack_1E_CorrosiveResist;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size1.CargoRack_1F_CorrosiveResist;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size2.CargoRack_2E;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size3.CargoRack_3E;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size4.CargoRack_4E;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size4.CargoRack_4E_CorrosiveResist;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size5.CargoRack_5E;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size6.CargoRack_6E;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size7.CargoRack_7E;
import com.controllerface.cmdr_j.classes.procurements.modules.cargorack.size8.CargoRack_8E;
import com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor.size1.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor.size2.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor.size3.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor.size4.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size1.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size2.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size3.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size4.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size5.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size6.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size7.*;
import com.controllerface.cmdr_j.classes.procurements.modules.fuelscoop.size8.*;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size1.HRP_1D;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size1.HRP_1E;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size2.HRP_2D;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size2.HRP_2E;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size3.HRP_3D;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size3.HRP_3E;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size4.HRP_4D;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size4.HRP_4E;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size5.HRP_5D;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size5.HRP_5E;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size1.MRP_1D;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size1.MRP_1E;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size2.MRP_2D;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size2.MRP_2E;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size3.MRP_3D;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size3.MRP_3E;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size4.MRP_4D;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size4.MRP_4E;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size5.MRP_5D;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size5.MRP_5E;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.size1.*;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.size2.*;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.size3.*;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.size4.*;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

import java.util.Arrays;

/**
 * Implementation note:
 *
 * The enum values in this class must match a defined Module name in the game
 *
 * Created by Controllerface on 4/25/2018.
 */
@SuppressWarnings("unchecked")
public enum OptionalInternalModule implements ShipModule
{
    /**
     * Automated Field Maintenance Unit
     */

    int_repairer_size1_class1(new AFMU_1E()),
    int_repairer_size1_class2(new AFMU_1D()),
    int_repairer_size1_class3(new AFMU_1C()),
    int_repairer_size1_class4(new AFMU_1B()),
    int_repairer_size1_class5(new AFMU_1A()),

    int_repairer_size2_class1(new AFMU_2E()),
    int_repairer_size2_class2(new AFMU_2D()),
    int_repairer_size2_class3(new AFMU_2C()),
    int_repairer_size2_class4(new AFMU_2B()),
    int_repairer_size2_class5(new AFMU_2A()),

    int_repairer_size3_class1(new AFMU_3E()),
    int_repairer_size3_class2(new AFMU_3D()),
    int_repairer_size3_class3(new AFMU_3C()),
    int_repairer_size3_class4(new AFMU_3D()),
    int_repairer_size3_class5(new AFMU_3A()),

    int_repairer_size4_class1(new AFMU_4E()),
    int_repairer_size4_class2(new AFMU_4D()),
    int_repairer_size4_class3(new AFMU_4C()),
    int_repairer_size4_class4(new AFMU_4B()),
    int_repairer_size4_class5(new AFMU_4A()),

    int_repairer_size5_class1(new AFMU_5E()),
    int_repairer_size5_class2(new AFMU_5D()),
    int_repairer_size5_class3(new AFMU_5C()),
    int_repairer_size5_class4(new AFMU_5B()),
    int_repairer_size5_class5(new AFMU_5A()),

    int_repairer_size6_class1(new AFMU_6E()),
    int_repairer_size6_class2(new AFMU_6D()),
    int_repairer_size6_class3(new AFMU_6C()),
    int_repairer_size6_class4(new AFMU_6B()),
    int_repairer_size6_class5(new AFMU_6A()),

    int_repairer_size7_class1(new AFMU_7E()),
    int_repairer_size7_class2(new AFMU_7D()),
    int_repairer_size7_class3(new AFMU_7C()),
    int_repairer_size7_class4(new AFMU_7B()),
    int_repairer_size7_class5(new AFMU_7A()),

    int_repairer_size8_class1(new AFMU_8E()),
    int_repairer_size8_class2(new AFMU_8D()),
    int_repairer_size8_class3(new AFMU_8C()),
    int_repairer_size8_class4(new AFMU_8B()),
    int_repairer_size8_class5(new AFMU_8A()),


    /**
     * Hull Reinforcement Packages
     */

    int_hullreinforcement_size1_class1(new HRP_1E()),
    int_hullreinforcement_size1_class2(new HRP_1D()),

    int_hullreinforcement_size2_class1(new HRP_2E()),
    int_hullreinforcement_size2_class2(new HRP_2D()),

    int_hullreinforcement_size3_class1(new HRP_3E()),
    int_hullreinforcement_size3_class2(new HRP_3D()),

    int_hullreinforcement_size4_class1(new HRP_4E()),
    int_hullreinforcement_size4_class2(new HRP_4D()),

    int_hullreinforcement_size5_class1(new HRP_5E()),
    int_hullreinforcement_size5_class2(new HRP_5D()),


    /**
     * Module Reinforcement Packages
     */

    int_modulereinforcement_size1_class1(new MRP_1E()),
    int_modulereinforcement_size1_class2(new MRP_1D()),

    int_modulereinforcement_size2_class1(new MRP_2E()),
    int_modulereinforcement_size2_class2(new MRP_2D()),

    int_modulereinforcement_size3_class1(new MRP_3E()),
    int_modulereinforcement_size3_class2(new MRP_3D()),

    int_modulereinforcement_size4_class1(new MRP_4E()),
    int_modulereinforcement_size4_class2(new MRP_4D()),

    int_modulereinforcement_size5_class1(new MRP_5E()),
    int_modulereinforcement_size5_class2(new MRP_5D()),


    /**
     * Fuel Scoops
     */

    int_fuelscoop_size1_class1(new FuelScoop_1E()),
    int_fuelscoop_size1_class2(new FuelScoop_1D()),
    int_fuelscoop_size1_class3(new FuelScoop_1C()),
    int_fuelscoop_size1_class4(new FuelScoop_1B()),
    int_fuelscoop_size1_class5(new FuelScoop_1A()),

    int_fuelscoop_size2_class1(new FuelScoop_2E()),
    int_fuelscoop_size2_class2(new FuelScoop_2D()),
    int_fuelscoop_size2_class3(new FuelScoop_2C()),
    int_fuelscoop_size2_class4(new FuelScoop_2B()),
    int_fuelscoop_size2_class5(new FuelScoop_2A()),

    int_fuelscoop_size3_class1(new FuelScoop_3E()),
    int_fuelscoop_size3_class2(new FuelScoop_3D()),
    int_fuelscoop_size3_class3(new FuelScoop_3C()),
    int_fuelscoop_size3_class4(new FuelScoop_3B()),
    int_fuelscoop_size3_class5(new FuelScoop_3A()),

    int_fuelscoop_size4_class1(new FuelScoop_4E()),
    int_fuelscoop_size4_class2(new FuelScoop_4D()),
    int_fuelscoop_size4_class3(new FuelScoop_4C()),
    int_fuelscoop_size4_class4(new FuelScoop_4B()),
    int_fuelscoop_size4_class5(new FuelScoop_4A()),

    int_fuelscoop_size5_class1(new FuelScoop_5E()),
    int_fuelscoop_size5_class2(new FuelScoop_5D()),
    int_fuelscoop_size5_class3(new FuelScoop_5C()),
    int_fuelscoop_size5_class4(new FuelScoop_5B()),
    int_fuelscoop_size5_class5(new FuelScoop_5A()),

    int_fuelscoop_size6_class1(new FuelScoop_6E()),
    int_fuelscoop_size6_class2(new FuelScoop_6D()),
    int_fuelscoop_size6_class3(new FuelScoop_6C()),
    int_fuelscoop_size6_class4(new FuelScoop_6B()),
    int_fuelscoop_size6_class5(new FuelScoop_6A()),

    int_fuelscoop_size7_class1(new FuelScoop_7E()),
    int_fuelscoop_size7_class2(new FuelScoop_7D()),
    int_fuelscoop_size7_class3(new FuelScoop_7C()),
    int_fuelscoop_size7_class4(new FuelScoop_7B()),
    int_fuelscoop_size7_class5(new FuelScoop_7A()),

    int_fuelscoop_size8_class1(new FuelScoop_8E()),
    int_fuelscoop_size8_class2(new FuelScoop_8D()),
    int_fuelscoop_size8_class3(new FuelScoop_8C()),
    int_fuelscoop_size8_class4(new FuelScoop_8B()),
    int_fuelscoop_size8_class5(new FuelScoop_8A()),


    /**
     * Refineries
     */

    int_refinery_size1_class1(new Refinery_1E()),
    int_refinery_size1_class2(new Refinery_1D()),
    int_refinery_size1_class3(new Refinery_1C()),
    int_refinery_size1_class4(new Refinery_1B()),
    int_refinery_size1_class5(new Refinery_1A()),

    int_refinery_size2_class1(new Refinery_2E()),
    int_refinery_size2_class2(new Refinery_2D()),
    int_refinery_size2_class3(new Refinery_2C()),
    int_refinery_size2_class4(new Refinery_2B()),
    int_refinery_size2_class5(new Refinery_2A()),

    int_refinery_size3_class1(new Refinery_3E()),
    int_refinery_size3_class2(new Refinery_3D()),
    int_refinery_size3_class3(new Refinery_3C()),
    int_refinery_size3_class4(new Refinery_3B()),
    int_refinery_size3_class5(new Refinery_3A()),

    int_refinery_size4_class1(new Refinery_4E()),
    int_refinery_size4_class2(new Refinery_4D()),
    int_refinery_size4_class3(new Refinery_4C()),
    int_refinery_size4_class4(new Refinery_4B()),
    int_refinery_size4_class5(new Refinery_4A()),


    /**
     * FSD Interdictors
     */

    int_fsdinterdictor_size1_class1(new FSDInterdictor_1E()),
    int_fsdinterdictor_size1_class2(new FSDInterdictor_1D()),
    int_fsdinterdictor_size1_class3(new FSDInterdictor_1C()),
    int_fsdinterdictor_size1_class4(new FSDInterdictor_1B()),
    int_fsdinterdictor_size1_class5(new FSDInterdictor_1A()),

    int_fsdinterdictor_size2_class1(new FSDInterdictor_2E()),
    int_fsdinterdictor_size2_class2(new FSDInterdictor_2D()),
    int_fsdinterdictor_size2_class3(new FSDInterdictor_2C()),
    int_fsdinterdictor_size2_class4(new FSDInterdictor_2B()),
    int_fsdinterdictor_size2_class5(new FSDInterdictor_2A()),

    int_fsdinterdictor_size3_class1(new FSDInterdictor_3E()),
    int_fsdinterdictor_size3_class2(new FSDInterdictor_3D()),
    int_fsdinterdictor_size3_class3(new FSDInterdictor_3C()),
    int_fsdinterdictor_size3_class4(new FSDInterdictor_3B()),
    int_fsdinterdictor_size3_class5(new FSDInterdictor_3A()),

    int_fsdinterdictor_size4_class1(new FSDInterdictor_4E()),
    int_fsdinterdictor_size4_class2(new FSDInterdictor_4D()),
    int_fsdinterdictor_size4_class3(new FSDInterdictor_4C()),
    int_fsdinterdictor_size4_class4(new FSDInterdictor_4B()),
    int_fsdinterdictor_size4_class5(new FSDInterdictor_4A()),


    /**
     * Cargo Racks
     */

    int_cargorack_size1_class1(new CargoRack_1E()),
    int_corrosionproofcargorack_size1_class1(new CargoRack_1E_CorrosiveResist()),
    int_corrosionproofcargorack_size1_class2(new CargoRack_1F_CorrosiveResist()),

    int_cargorack_size2_class1(new CargoRack_2E()),

    int_cargorack_size3_class1(new CargoRack_3E()),

    int_cargorack_size4_class1(new CargoRack_4E()),
    int_corrosionproofcargorack_size4_class1(new CargoRack_4E_CorrosiveResist()),

    int_cargorack_size5_class1(new CargoRack_5E()),

    int_cargorack_size6_class1(new CargoRack_6E()),

    int_cargorack_size7_class1(new CargoRack_7E()),

    int_cargorack_size8_class1(new CargoRack_8E()),


    /**
     * Passenger Cabins
     */

    int_passengercabin_size2_class1("2E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2.5d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 2d),
                    new ItemEffectData(ItemEffect.CabinClass, "Economy")
            )),

    int_passengercabin_size3_class1("3E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 4d),
                    new ItemEffectData(ItemEffect.CabinClass, "Economy")
            )),

    int_passengercabin_size3_class2("3D Business Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 3d),
                    new ItemEffectData(ItemEffect.CabinClass, "Business")
            )),

    int_passengercabin_size4_class1("4E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 8d),
                    new ItemEffectData(ItemEffect.CabinClass, "Economy")
            )),

    int_passengercabin_size4_class2("4D Business Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 6d),
                    new ItemEffectData(ItemEffect.CabinClass, "Business")
            )),

    int_passengercabin_size4_class3("4C First Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 3d),
                    new ItemEffectData(ItemEffect.CabinClass, "First")
            )),

    int_passengercabin_size5_class1("5E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 16d),
                    new ItemEffectData(ItemEffect.CabinClass, "Economy")
            )),

    int_passengercabin_size5_class2("5D Business Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 10d),
                    new ItemEffectData(ItemEffect.CabinClass, "Business")
            )),

    int_passengercabin_size5_class3("5C First Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 6d),
                    new ItemEffectData(ItemEffect.CabinClass, "First")
            )),

    int_passengercabin_size5_class4("5B Luxury Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 4d),
                    new ItemEffectData(ItemEffect.CabinClass, "Luxury")
            )),

    int_passengercabin_size6_class1("6E Economy Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 32d),
                    new ItemEffectData(ItemEffect.CabinClass, "Economy")
            )),

    int_passengercabin_size6_class2("6D Business Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 18d),
                    new ItemEffectData(ItemEffect.CabinClass, "Business")
            )),

    int_passengercabin_size6_class3("6C First Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 12d),
                    new ItemEffectData(ItemEffect.CabinClass, "First")
            )),

    int_passengercabin_size6_class4("6B Luxury Class Passenger Cabin",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.CabinCapacity, 8d),
                    new ItemEffectData(ItemEffect.CabinClass, "Luxury")
            )),


    /**
     * Collector Limpet Controllers
     */

    int_dronecontrol_collection_size1_class1("1E Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 0.5d),
                    new ItemEffectData(ItemEffect.Integrity, 24d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.14d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 800d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size1_class2("1D Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 0.5d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 600d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size1_class3("1C Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.23d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1000d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 510d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size1_class4("1B Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 48d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.28d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1400d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 420d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size1_class5("1A Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 56d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.32d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1200d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 720d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),


    int_dronecontrol_collection_size3_class1("3E Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 38d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 880d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size3_class2("3D Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 51d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.27d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 660d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size3_class3("3C Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 64d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1100d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 510d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size3_class4("3B Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1540d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 420d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size3_class5("3A Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.48d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1320d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 720d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),


    int_dronecontrol_collection_size5_class1("5E Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 58d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1040d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size5_class2("5D Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 780d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size5_class3("5C Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1300d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 510d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size5_class4("5B Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 115d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1820d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 420d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size5_class5("5A Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 134d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.7d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1560d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 720d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),


    int_dronecontrol_collection_size7_class1("7E Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 79d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1360d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size7_class2("7D Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 105d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.55d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1020d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size7_class3("7C Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 131d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.69d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1700d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 510d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size7_class4("7B Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.83d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2380d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 420d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),

    int_dronecontrol_collection_size7_class5("7A Collector Limpet Controller",
            ModificationType.Collector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Integrity, 183d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                    new ItemEffectData(ItemEffect.BootTime, 6d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2040d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 720d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneMultiTargetSpeed, 60d)
            )),


    /**
     * Prospector Limpet Controllers
     */

    int_dronecontrol_prospector_size1_class1("1E Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 24d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size1_class2("1D Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 0.5d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.14d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size1_class3("1C Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.23d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size1_class4("1B Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 48d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.32d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size1_class5("1A Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 56d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.28d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_prospector_size3_class1("3E Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 38d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.27d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size3_class2("3D Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 51d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size3_class3("3C Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 64d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size3_class4("3B Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.48d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size3_class5("3A Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_prospector_size5_class1("5E Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 58d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size5_class2("5D Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size5_class3("5C Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size5_class4("5B Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size5_class5("5A Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 134d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_prospector_size7_class1("7E Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 79d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.55d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size7_class2("7D Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 105d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size7_class3("7C Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 131d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.69d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size7_class4("7B Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_prospector_size7_class5("7A Prospector Limpet Controller",
            ModificationType.Prospector_Limpet_Controller,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 183d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.83d),
                    new ItemEffectData(ItemEffect.BootTime, 4d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    /**
     * Fuel Transfer Limpet Controllers
     */

    int_dronecontrol_fueltransfer_size1_class1("1E Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 24d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 600d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size1_class2("1D Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 0.5d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.14d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 800d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size1_class3("1C Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.23d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1000d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size1_class4("1B Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 48d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.32d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1200d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size1_class5("1A Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 56d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.28d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1400d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),


    int_dronecontrol_fueltransfer_size3_class1("3E Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 38d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.27d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 660d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size3_class2("3D Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 51d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 880d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size3_class3("3C Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 64d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1100d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size3_class4("3B Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.48d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1320d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size3_class5("3A Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1540d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),


    int_dronecontrol_fueltransfer_size5_class1("5E Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 58d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 780d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size5_class2("5D Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1040d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size5_class3("5C Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1300d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size5_class4("5B Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1560d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size5_class5("5A Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 134d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1820d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),


    int_dronecontrol_fueltransfer_size7_class1("7E Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 79d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.55d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1020d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size7_class2("7D Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 105d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1360d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size7_class3("7C Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 131d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.69d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1700d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size7_class4("7B Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2040d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),

    int_dronecontrol_fueltransfer_size7_class5("7A Fuel Transfer Limpet Controller",
            ModificationType.Fuel_Transfer_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 183d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.83d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2380d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 60d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d),
                    new ItemEffectData(ItemEffect.DroneFuelCapacity, 1d)
            )),


    /**
     * Repair Limpet Controllers
     */

    int_dronecontrol_repair_size1_class1("1E Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 24d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 60d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 600d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size1_class2("1D Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 0.5d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.14d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 60d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 800d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size1_class3("1C Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.23d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 60d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1000d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size1_class4("1B Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 48d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.32d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 60d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1200d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size1_class5("1A Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 56d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.28d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 60d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1400d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_repair_size3_class1("3E Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 38d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.27d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 180d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 660d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size3_class2("3D Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 51d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 180d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 880d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size3_class3("3C Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 64d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 180d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1100d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size3_class4("3B Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.48d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 180d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1320d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size3_class5("3A Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 180d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1540d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_repair_size5_class1("5E Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 58d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 310d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 780d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size5_class2("5D Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 310d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1040d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size5_class3("5C Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 310d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1300d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size5_class4("5B Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 310d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1560d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size5_class5("5A Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 134d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 310d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1820d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    int_dronecontrol_repair_size7_class1("7E Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 79d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.55d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 450d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1020d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size7_class2("7D Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 105d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 450d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1360d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size7_class3("7C Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 131d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.69d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 450d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1700d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size7_class4("7B Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 450d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2040d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_repair_size7_class5("7A Repair Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 183d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.83d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 450d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2380d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    /**
     * Hatch Breaker Limpet Controllers
     */

    int_dronecontrol_resourcesiphon_size1_class1("1E Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.12d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1500d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 22d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 1d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 6d)
            )),

    int_dronecontrol_resourcesiphon_size1_class2("1D Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 0.5d),
                    new ItemEffectData(ItemEffect.Integrity, 24d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.16d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2000d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 19d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
            )),

    int_dronecontrol_resourcesiphon_size1_class3("1C Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 40d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2500d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 16d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
            )),

    int_dronecontrol_resourcesiphon_size1_class4("1B Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 56d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.24d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 3000d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 13d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 4d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 9d)
            )),

    int_dronecontrol_resourcesiphon_size1_class5("1A Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 48d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.28d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 3500d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 10d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 5d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 10d)
            )),


    int_dronecontrol_resourcesiphon_size3_class1("3E Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 51d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1620d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 17d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 1d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 6d)
            )),

    int_dronecontrol_resourcesiphon_size3_class2("3D Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 38d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.24d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2160d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 14d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
            )),

    int_dronecontrol_resourcesiphon_size3_class3("3C Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 64d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2700d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 12d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
            )),

    int_dronecontrol_resourcesiphon_size3_class4("3B Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 90d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.36d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 3240d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 10d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 4d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 9d)
            )),

    int_dronecontrol_resourcesiphon_size3_class5("3A Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 5d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.42d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 3780d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 7d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 5d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 10d)
            )),


    int_dronecontrol_resourcesiphon_size5_class1("5E Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.3d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 9d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1980d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 11d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 1d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 6d)
            )),

    int_dronecontrol_resourcesiphon_size5_class2("5D Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 58d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 6d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2640d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 10d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
            )),

    int_dronecontrol_resourcesiphon_size5_class3("5C Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 7d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 3300d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 8d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
            )),

    int_dronecontrol_resourcesiphon_size5_class4("5B Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 134d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 9d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 3960d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 6d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 4d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 9d)
            )),

    int_dronecontrol_resourcesiphon_size5_class5("5A Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 115d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.7d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 6d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 4620d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 5d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 5d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 10d)
            )),


    int_dronecontrol_resourcesiphon_size7_class1("7E Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 105d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.42d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 18d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2580d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 6d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 1d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 6d)
            )),

    int_dronecontrol_resourcesiphon_size7_class2("7D Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 79d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.56d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 12d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 3440d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 5d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 2d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 7d)
            )),

    int_dronecontrol_resourcesiphon_size7_class3("7C Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 131d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.7d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 15d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 4300d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 4d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 3d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 8d)
            )),

    int_dronecontrol_resourcesiphon_size7_class4("7B Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Integrity, 183d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.84d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 18d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 5160d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 3d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 4d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 9d)
            )),

    int_dronecontrol_resourcesiphon_size7_class5("7A Hatch Breaker Limpet Controller",
            ModificationType.Hatch_Breaker_Limpet,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 80d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.98d),
                    new ItemEffectData(ItemEffect.BootTime, 3d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 12d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 6020d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 120d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 500d),
                    new ItemEffectData(ItemEffect.DroneHackingTime, 2d),
                    new ItemEffectData(ItemEffect.DroneMinJettisonedCargo, 5d),
                    new ItemEffectData(ItemEffect.DroneMaxJettisonedCargo, 10d)
            )),


    /**
     * Decontamination Limpet Controllers
     */

    int_dronecontrol_decontamination_size1_class1("1E Decontamination Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 24d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 30d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 600d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_decontamination_size3_class1("3E Decontamination Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 51d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 70d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 2d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 880d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_decontamination_size5_class1("5E Decontamination Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 96d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 120d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 3d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 1300d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),

    int_dronecontrol_decontamination_size7_class1("7E Decontamination Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Integrity, 157d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.97d),
                    new ItemEffectData(ItemEffect.BootTime, 10d),
                    new ItemEffectData(ItemEffect.DroneRepairCapacity, 180d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 4d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2040d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    /**
     * Recon Limpet Controller
     */

    int_dronecontrol_recon_size1_class1("1E Recon Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Mass, 24d),
                    new ItemEffectData(ItemEffect.Mass, 0.18d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Mass, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1200d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.Mass, 22d)
            )),

    int_dronecontrol_recon_size3_class1("3E Recon Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Mass, 51d),
                    new ItemEffectData(ItemEffect.Mass, 0.2d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Mass, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1400d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.Mass, 17d)
            )),

    int_dronecontrol_recon_size5_class1("5E Recon Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Mass, 96d),
                    new ItemEffectData(ItemEffect.Mass, 0.5d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Mass, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1700d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.Mass, 13d)
            )),

    int_dronecontrol_recon_size7_class1("7E Recon Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 128d),
                    new ItemEffectData(ItemEffect.Mass, 157d),
                    new ItemEffectData(ItemEffect.Mass, 0.97d),
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Mass, 1d),
                    new ItemEffectData(ItemEffect.Mass, 2000d),
                    new ItemEffectData(ItemEffect.Mass, 100d),
                    new ItemEffectData(ItemEffect.Mass, 10d)
            )),


    /**
     * Research Limpet Controller
     */

    int_dronecontrol_unkvesselresearch("Research Limpet Controller",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 20d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                    new ItemEffectData(ItemEffect.BootTime, 0d),
                    new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                    new ItemEffectData(ItemEffect.DroneTargetRange, 2000d),
                    new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                    new ItemEffectData(ItemEffect.DroneSpeed, 200d)
            )),


    /**
     * SRV Bays
     *
     * todo: determine if ammo clip size is the right stat for the vehicle count
     */

    int_buggybay_size2_class1("2H Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 12d),
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.25d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 1d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
            )),

    int_buggybay_size2_class2("2G Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 6d),
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.75d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 1d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
            )),


    int_buggybay_size4_class1("4H Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
            )),

    int_buggybay_size4_class2("4G Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.2d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
            )),


    int_buggybay_size6_class1("6H Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 34d),
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 4d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
            )),

    int_buggybay_size6_class2("6G Planetary Vehicle Hangar",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 17d),
                    new ItemEffectData(ItemEffect.Integrity, 30d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.8d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 4d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 1d)
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
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 20d),
                    new ItemEffectData(ItemEffect.Integrity, 60d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.25d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 1d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 6d)
            )),

    int_fighterbay_size6_class1("6E Fighter Hangar",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 40d),
                    new ItemEffectData(ItemEffect.Integrity, 80d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 8d)
            )),

    int_fighterbay_size7_class1("7E Fighter Hangar",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 60d),
                    new ItemEffectData(ItemEffect.Integrity, 120d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                    new ItemEffectData(ItemEffect.BootTime, 5d),
                    new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 15d)
            )),


    /**
     * Discovery Scanners:
     *
     * TODO: should no longer be present in new games, disabling them breaks compatibility but I want to keep
     *   any "legacy" stuff clearly separate. At some point should figure out best way to handle this that keeps
     *   this class as clean as possible, and old stuff clearly marked as such.
     */

//    int_stellarbodydiscoveryscanner_standard("Basic Discovery Scanner",
//            null,
//            null,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 2d),
//                    new ItemEffectData(ItemEffect.Integrity, 40d),
//                    new ItemEffectData(ItemEffect.DiscoveryScannerRange, 500d),
//                    new ItemEffectData(ItemEffect.DiscoveryScannerPassiveRange, 0.33d),
//                    new ItemEffectData(ItemEffect.MaxAngle, 10d),
//                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 5d)
//            )),
//
//    int_stellarbodydiscoveryscanner_intermediate("Intermediate Discovery Scanner",
//            null,
//            null,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 2d),
//                    new ItemEffectData(ItemEffect.Integrity, 40d),
//                    new ItemEffectData(ItemEffect.DiscoveryScannerRange, 1000d),
//                    new ItemEffectData(ItemEffect.DiscoveryScannerPassiveRange, 3.34d),
//                    new ItemEffectData(ItemEffect.MaxAngle, 10d),
//                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 5d)
//            )),
//
//    int_stellarbodydiscoveryscanner_advanced("Advanced Discovery Scanner",
//            null,
//            null,
//            new ItemEffects(
//                    new ItemEffectData(ItemEffect.Mass, 2d),
//                    new ItemEffectData(ItemEffect.Integrity, 40d),
//                    new ItemEffectData(ItemEffect.DiscoveryScannerRange, Double.MAX_VALUE),
//                    new ItemEffectData(ItemEffect.DiscoveryScannerPassiveRange, 33.36d),
//                    new ItemEffectData(ItemEffect.MaxAngle, 10d),
//                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 5d)
//            )),


    /**
     * Detailed Surface Scanner
     */

    int_detailedsurfacescanner_tiny("Detailed Surface Scanner",
            ModificationType.Detailed_Surface_Scanner,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0d),
                    new ItemEffectData(ItemEffect.BootTime, 0d),
                    new ItemEffectData(ItemEffect.DSS_PatchRadius, 0d)
            )),


    /**
     * Docking Computer
     */

    int_dockingcomputer_standard("Standard Docking Computer",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Integrity, 10d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.39d),
                    new ItemEffectData(ItemEffect.BootTime, 3d)
            )),


    /**
     * Planetary Approach Suite
     */

    int_planetapproachsuite("Planetary Approach Suite",
            null,
            null,
            new ItemEffects(new ItemEffectData(ItemEffect.planetary_approach, "Installed"))),


    /**
     * Experimental (AEGIS, Anti-Thargoid) Modules
     *
     * todo: determine if ECMCooldown is the correct effect for this item's cooldown stat
     */

    hpt_antiunknownshutdown_tiny("Shutdown Field Neutraliser",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 35d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                    new ItemEffectData(ItemEffect.BootTime, 0d),
                    new ItemEffectData(ItemEffect.Range, 3000d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 0.25d),
                    new ItemEffectData(ItemEffect.ECMCooldown, 10d),
                    new ItemEffectData(ItemEffect.Mass, 1d)
            )),

    hpt_xenoscanner_basic_tiny("Xeno Scanner",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.Integrity, 56d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                    new ItemEffectData(ItemEffect.BootTime, 2d),
                    new ItemEffectData(ItemEffect.Range, 500d),
                    new ItemEffectData(ItemEffect.MaxAngle, 23d),
                    new ItemEffectData(ItemEffect.ScannerTimeToScan, 10d)
            )),


    /**
     * Guardian Internal Modules
     */

    // todo: add the stats for power distributors

    int_guardianpowerdistributor_size1("1A Guardian Hybrid Power Distributor", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),

    int_guardianpowerdistributor_size2("2A Guardian Hybrid Power Distributor", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),

    int_guardianpowerdistributor_size3("3A Guardian Hybrid Power Distributor", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),

    int_guardianpowerdistributor_size4("4A Guardian Hybrid Power Distributor", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),

    int_guardianpowerdistributor_size5("5A Guardian Hybrid Power Distributor", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),

    int_guardianpowerdistributor_size6("6A Guardian Hybrid Power Distributor", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),

    int_guardianpowerdistributor_size7("7A Guardian Hybrid Power Distributor", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),

    int_guardianpowerdistributor_size8("8A Guardian Hybrid Power Distributor", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),


    // todo: add all of these
    int_guardianhullreinforcement_size1_class1("1E Guardian Hull Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d)
            )),


    int_guardianmodulereinforcement_size1_class1("1E Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 85d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.27d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_guardianmodulereinforcement_size1_class2("1D Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1d),
                    new ItemEffectData(ItemEffect.Integrity, 77d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    int_guardianmodulereinforcement_size2_class1("2E Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.Integrity, 127d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.41d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_guardianmodulereinforcement_size2_class2("2D Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.Integrity, 116d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.47d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    int_guardianmodulereinforcement_size3_class1("3E Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 187d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.54d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_guardianmodulereinforcement_size3_class2("3D Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.Integrity, 171d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.61d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    int_guardianmodulereinforcement_size4_class1("4E Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.Integrity, 286d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.68d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_guardianmodulereinforcement_size4_class2("4D Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.Integrity, 259d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.74d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),

    int_guardianmodulereinforcement_size5_class1("5E Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.Integrity, 424d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.81d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
            )),

    int_guardianmodulereinforcement_size5_class2("5D Guardian Module Reinforcement Package", null, null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.Integrity, 385d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.88d),
                    new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
            )),


    int_guardianfsdbooster_size1("1H Guardian FSD Booster",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.75d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.BootTime, 15d),
                    new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 4d)
            )),

    int_guardianfsdbooster_size2("2H Guardian FSD Booster",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.98d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.BootTime, 15d),
                    new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 6d)
            )),

    int_guardianfsdbooster_size3("3H Guardian FSD Booster",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.27d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.BootTime, 15d),
                    new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 7.75d)
            )),

    int_guardianfsdbooster_size4("4H Guardian FSD Booster",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.PowerDraw, 1.65d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.BootTime, 15d),
                    new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 9.25d)
            )),

    int_guardianfsdbooster_size5("5H Guardian FSD Booster",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.guardian, 1d),
                    new ItemEffectData(ItemEffect.Mass, 1.3d),
                    new ItemEffectData(ItemEffect.PowerDraw, 2.14d),
                    new ItemEffectData(ItemEffect.Integrity, 32d),
                    new ItemEffectData(ItemEffect.BootTime, 15d),
                    new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 10.5d)
            )),

    /**
     * Human Tech Broker Internal Modules
     */

    int_metaalloyhullreinforcement_size1_class1("1E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 72d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size1_class2("1D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 99d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size2_class1("2E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 135d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size2_class2("2D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 2d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 171d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size3_class1("3E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 207d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size3_class2("3D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 4d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 234d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size4_class1("4E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 270d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size4_class2("4D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 8d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 297d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size5_class1("5E Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 32d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 324d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),
    int_metaalloyhullreinforcement_size5_class2("5D Meta-Alloy Hull Reinforcement Package",
            null,
            null,
            new ItemEffects(
                    new ItemEffectData(ItemEffect.experimental, 1d),
                    new ItemEffectData(ItemEffect.Mass, 16d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 351d),
                    new ItemEffectData(ItemEffect.CausticResistance, 3d)
            )),

    ;

    private final String displayText;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;
    private final ItemEffects itemEffects;

    private final ShipModule delegate;

    OptionalInternalModule(String displayText, ProcurementType modificationType, ProcurementType experimentalType, ItemEffects itemEffects)
    {
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.displayText = displayText;
        this.itemEffects = itemEffects;
        this.delegate = null;
    }

    OptionalInternalModule(ShipModule delegate)
    {
        this.delegate = delegate;
        this.modificationType = null;
        this.experimentalType = null;
        this.displayText = null;
        this.itemEffects = null;
    }

    @Override
    public ProcurementType modificationType()
    {
        if (delegate == null) return modificationType;
        return delegate.modificationType();
    }

    @Override
    public ProcurementType experimentalType()
    {
        if (delegate == null) return experimentalType;
        return delegate.experimentalType();
    }

    @Override
    public String displayText()
    {
        if (delegate == null) return displayText;
        return delegate.displayText();
    }


    @Override
    public ItemEffects itemEffects()
    {
        if (delegate == null) return itemEffects;
        return delegate.itemEffects();
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
