package com.controllerface.edeps.structures.equipment.ships;

import com.controllerface.edeps.data.CoreModuleLayoutData;
import com.controllerface.edeps.data.HardPointLayoutData;
import com.controllerface.edeps.data.OptionalModuleLayoutData;
import com.controllerface.edeps.structures.equipment.modules.HardPointSize;
import com.controllerface.edeps.structures.equipment.modules.ModuleSize;

import java.util.Arrays;

/**
 * Created by Stephen on 4/16/2018.
 */
public enum Ship
{
    ADDER(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_3)
                    .setThrusters(ModuleSize.SIZE_3)
                    .setFrameShiftDrive(ModuleSize.SIZE_3)
                    .setLifeSupport(ModuleSize.SIZE_1)
                    .setPowerDistributor(ModuleSize.SIZE_2)
                    .setSensors(ModuleSize.SIZE_3)
                    .setFuelTank(ModuleSize.SIZE_3)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    COBRA_MKIII(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_4)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_3)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_3)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .build()),

    COBRA_MKIV(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_4)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_3)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_3)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .build()),

    DIAMONDBACK_EXPLORER(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_4)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_3)
                    .setPowerDistributor(ModuleSize.SIZE_4)
                    .setSensors(ModuleSize.SIZE_3)
                    .setFuelTank(ModuleSize.SIZE_5)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .build()),

    DIAMONDBACK_SCOUT(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_4)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_2)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_2)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    DOLPHIN(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_5)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_4)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_3)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .build()),

    EAGLE_MK_II(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_2)
                    .setThrusters(ModuleSize.SIZE_3)
                    .setFrameShiftDrive(ModuleSize.SIZE_3)
                    .setLifeSupport(ModuleSize.SIZE_1)
                    .setPowerDistributor(ModuleSize.SIZE_2)
                    .setSensors(ModuleSize.SIZE_2)
                    .setFuelTank(ModuleSize.SIZE_2)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    HAULER(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_2)
                    .setThrusters(ModuleSize.SIZE_2)
                    .setFrameShiftDrive(ModuleSize.SIZE_2)
                    .setLifeSupport(ModuleSize.SIZE_1)
                    .setPowerDistributor(ModuleSize.SIZE_1)
                    .setSensors(ModuleSize.SIZE_1)
                    .setFuelTank(ModuleSize.SIZE_2)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    EMPIRE_COURIER(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_3)
                    .setFrameShiftDrive(ModuleSize.SIZE_3)
                    .setLifeSupport(ModuleSize.SIZE_1)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_2)
                    .setFuelTank(ModuleSize.SIZE_3)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    EMPIRE_EAGLE(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_3)
                    .setThrusters(ModuleSize.SIZE_3)
                    .setFrameShiftDrive(ModuleSize.SIZE_3)
                    .setLifeSupport(ModuleSize.SIZE_1)
                    .setPowerDistributor(ModuleSize.SIZE_2)
                    .setSensors(ModuleSize.SIZE_2)
                    .setFuelTank(ModuleSize.SIZE_2)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    SIDEWINDER(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_2)
                    .setThrusters(ModuleSize.SIZE_2)
                    .setFrameShiftDrive(ModuleSize.SIZE_2)
                    .setLifeSupport(ModuleSize.SIZE_1)
                    .setPowerDistributor(ModuleSize.SIZE_1)
                    .setSensors(ModuleSize.SIZE_1)
                    .setFuelTank(ModuleSize.SIZE_1)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    VIPER_MKIII(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_3)
                    .setThrusters(ModuleSize.SIZE_3)
                    .setFrameShiftDrive(ModuleSize.SIZE_3)
                    .setLifeSupport(ModuleSize.SIZE_2)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_3)
                    .setFuelTank(ModuleSize.SIZE_2)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    VIPER_MKIV(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_4)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_2)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_3)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .build()),

    VULTURE(ShipSize.Small,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_5)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_3)
                    .setPowerDistributor(ModuleSize.SIZE_5)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_3)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .build()),

    ALLIANCE_CHIEFTAIN(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_6)
                    .setThrusters(ModuleSize.SIZE_6)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_6)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .build()),

    ASP_EXPLORER(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_5)
                    .setThrusters(ModuleSize.SIZE_5)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_4)
                    .setPowerDistributor(ModuleSize.SIZE_4)
                    .setSensors(ModuleSize.SIZE_5)
                    .setFuelTank(ModuleSize.SIZE_5)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .build()),

    ASP_SCOUT(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_4)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_3)
                    .setPowerDistributor(ModuleSize.SIZE_4)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .build()),

    FEDERAL_ASSAULT_SHIP(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_6)
                    .setThrusters(ModuleSize.SIZE_6)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_6)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .build()),

    FEDERAL_DROPSHIP(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_6)
                    .setThrusters(ModuleSize.SIZE_6)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_6)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .build()),

    FEDERAL_GUNSHIP(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_6)
                    .setThrusters(ModuleSize.SIZE_6)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_7)
                    .setSensors(ModuleSize.SIZE_5)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .build()),

    FERDELANCE(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_6)
                    .setThrusters(ModuleSize.SIZE_5)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_4)
                    .setPowerDistributor(ModuleSize.SIZE_6)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_3)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Huge)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .build()),

    KEELBACK(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_4)
                    .setThrusters(ModuleSize.SIZE_4)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_1)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_2)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .build()),

    PYTHON(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_7)
                    .setThrusters(ModuleSize.SIZE_6)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_4)
                    .setPowerDistributor(ModuleSize.SIZE_7)
                    .setSensors(ModuleSize.SIZE_6)
                    .setFuelTank(ModuleSize.SIZE_5)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .build()),

    TYPE6(ShipSize.Medium,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_3)
                    .setThrusters(ModuleSize.SIZE_4)
                    .setFrameShiftDrive(ModuleSize.SIZE_4)
                    .setLifeSupport(ModuleSize.SIZE_2)
                    .setPowerDistributor(ModuleSize.SIZE_3)
                    .setSensors(ModuleSize.SIZE_2)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .build()),

    ANACONDA(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_8)
                    .setThrusters(ModuleSize.SIZE_7)
                    .setFrameShiftDrive(ModuleSize.SIZE_6)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_8)
                    .setSensors(ModuleSize.SIZE_8)
                    .setFuelTank(ModuleSize.SIZE_5)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Huge)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_7)
                    .build()),

    BELUGA_LINER(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_6)
                    .setThrusters(ModuleSize.SIZE_7)
                    .setFrameShiftDrive(ModuleSize.SIZE_7)
                    .setLifeSupport(ModuleSize.SIZE_8)
                    .setPowerDistributor(ModuleSize.SIZE_6)
                    .setSensors(ModuleSize.SIZE_5)
                    .setFuelTank(ModuleSize.SIZE_7)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .build()),

    FEDERAL_CORVETTE(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_8)
                    .setThrusters(ModuleSize.SIZE_7)
                    .setFrameShiftDrive(ModuleSize.SIZE_6)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_8)
                    .setSensors(ModuleSize.SIZE_8)
                    .setFuelTank(ModuleSize.SIZE_5)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Huge)
                    .addHardPoint(HardPointSize.Huge)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_7)
                    .build()),

    EMPIRE_TRADER(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_6)
                    .setThrusters(ModuleSize.SIZE_6)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_6)
                    .setSensors(ModuleSize.SIZE_5)
                    .setFuelTank(ModuleSize.SIZE_4)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_7)
                    .build()),

    IMPERIAL_CUTTER(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_8)
                    .setThrusters(ModuleSize.SIZE_8)
                    .setFrameShiftDrive(ModuleSize.SIZE_7)
                    .setLifeSupport(ModuleSize.SIZE_7)
                    .setPowerDistributor(ModuleSize.SIZE_7)
                    .setSensors(ModuleSize.SIZE_7)
                    .setFuelTank(ModuleSize.SIZE_6)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Huge)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_8)
                    .addModule(ModuleSize.SIZE_8)
                    .build()),

    ORCA(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_5)
                    .setThrusters(ModuleSize.SIZE_6)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_6)
                    .setPowerDistributor(ModuleSize.SIZE_5)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_5)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .build()),

    TYPE10(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_8)
                    .setThrusters(ModuleSize.SIZE_7)
                    .setFrameShiftDrive(ModuleSize.SIZE_7)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_7)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_6)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .addHardPoint(HardPointSize.Large)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_8)
                    .build()),

    TYPE7(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_5)
                    .setThrusters(ModuleSize.SIZE_5)
                    .setFrameShiftDrive(ModuleSize.SIZE_5)
                    .setLifeSupport(ModuleSize.SIZE_4)
                    .setPowerDistributor(ModuleSize.SIZE_4)
                    .setSensors(ModuleSize.SIZE_3)
                    .setFuelTank(ModuleSize.SIZE_5)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .build()),

    TYPE9(ShipSize.Large,

            CoreModuleLayoutData.builder()
                    .setPowerPlant(ModuleSize.SIZE_6)
                    .setThrusters(ModuleSize.SIZE_7)
                    .setFrameShiftDrive(ModuleSize.SIZE_6)
                    .setLifeSupport(ModuleSize.SIZE_5)
                    .setPowerDistributor(ModuleSize.SIZE_6)
                    .setSensors(ModuleSize.SIZE_4)
                    .setFuelTank(ModuleSize.SIZE_6)
                    .build(),

            HardPointLayoutData.builder()
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Tiny)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Small)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .addHardPoint(HardPointSize.Medium)
                    .build(),

            OptionalModuleLayoutData.builder()
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_8)
                    .addModule(ModuleSize.SIZE_8)
                    .build()),

    ;

    private final ShipSize shipSize;
    private final CoreModuleLayoutData coreModules;
    private final HardPointLayoutData hardpoints;
    private final OptionalModuleLayoutData internals;

    Ship(ShipSize shipSize, CoreModuleLayoutData coreModules, HardPointLayoutData hardpoints, OptionalModuleLayoutData internals)
    {
        this.shipSize = shipSize;
        this.coreModules = coreModules;
        this.hardpoints = hardpoints;
        this.internals = internals;
    }

    public static Ship findShip(String shipName) throws Exception
    {
        Exception exception;
        try
        {
            return valueOf(shipName);
        }
        catch (Exception e)
        {
            exception = e;
            if (shipName == null || shipName.isEmpty()) throw e;
        }
        return Arrays.stream(Ship.values())
                .filter(ship -> ship.name().toLowerCase().equals(shipName.toLowerCase()))
                .findFirst().orElseThrow(() -> exception);
    }
}
