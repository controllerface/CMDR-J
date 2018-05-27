package com.controllerface.edeps.structures.equipment.ships;

import com.controllerface.edeps.data.BaseShipStats;
import com.controllerface.edeps.data.CoreModuleLayoutData;
import com.controllerface.edeps.data.HardPointLayoutData;
import com.controllerface.edeps.data.OptionalModuleLayoutData;
import com.controllerface.edeps.structures.equipment.modules.HardPointSize;
import com.controllerface.edeps.structures.equipment.modules.ModuleSize;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/16/2018.
 */
public enum Ship
{
    adder(
            BaseShipStats.builder()
                    .setDisplayName("Adder")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Zorgon_Peterson)
                    .setAgility(152)
                    .setHullMass(35)
                    .setHullHardness(35)
                    .setSpeed(220)
                    .setMaxSpeed(352)
                    .setBoostSpeed(320)
                    .setMaxBoostSpeed(512)
                    .setArmorRating(90)
                    .setShield(60)
                    .setBaseCost(87_810)
                    .setMassLockFactor(7)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    cobramkiii(
            BaseShipStats.builder()
                    .setDisplayName("Cobra MKIII")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                    .setAgility(150)
                    .setHullMass(180)
                    .setHullHardness(35)
                    .setSpeed(280)
                    .setMaxSpeed(325)
                    .setBoostSpeed(400)
                    .setMaxBoostSpeed(464)
                    .setArmorRating(120)
                    .setShield(80)
                    .setBaseCost(349_720)
                    .setMassLockFactor(8)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    cobramkiv(
            BaseShipStats.builder()
                    .setDisplayName("Cobra MKIV")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                    .setAgility(130)
                    .setHullMass(210)
                    .setHullHardness(35)
                    .setSpeed(200)
                    .setMaxSpeed(228)
                    .setBoostSpeed(300)
                    .setMaxBoostSpeed(342)
                    .setArmorRating(120)
                    .setShield(120)
                    .setBaseCost(747_660)
                    .setMassLockFactor(8)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    diamondbackxl(
            BaseShipStats.builder()
                    .setDisplayName("Diamondback Explorer")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(138)
                    .setHullMass(260)
                    .setHullHardness(42)
                    .setSpeed(260)
                    .setMaxSpeed(284)
                    .setBoostSpeed(340)
                    .setMaxBoostSpeed(371)
                    .setArmorRating(150)
                    .setShield(150)
                    .setBaseCost(1_894_760)
                    .setMassLockFactor(10)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    diamondback(
            BaseShipStats.builder()
                    .setDisplayName("Diamondback Scout")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(157)
                    .setHullMass(170)
                    .setHullHardness(40)
                    .setSpeed(280)
                    .setMaxSpeed(325)
                    .setBoostSpeed(380)
                    .setMaxBoostSpeed(441)
                    .setArmorRating(120)
                    .setShield(120)
                    .setBaseCost(564_330)
                    .setMassLockFactor(8)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    dolphin(
            BaseShipStats.builder()
                    .setDisplayName("Dolphin")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Saud_Kruger)
                    .setAgility(150)
                    .setHullMass(140)
                    .setHullHardness(35)
                    .setSpeed(250)
                    .setMaxSpeed(290)
                    .setBoostSpeed(350)
                    .setMaxBoostSpeed(406)
                    .setArmorRating(110)
                    .setShield(110)
                    .setBaseCost(1_337_330)
                    .setMassLockFactor(9)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_5_RESERVED)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    eagle(
            BaseShipStats.builder()
                    .setDisplayName("Eagle")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Core_Dynamics)
                    .setAgility(188)
                    .setHullMass(50)
                    .setHullHardness(28)
                    .setSpeed(240)
                    .setMaxSpeed(384)
                    .setBoostSpeed(350)
                    .setMaxBoostSpeed(560)
                    .setArmorRating(40)
                    .setShield(60)
                    .setBaseCost(44_800)
                    .setMassLockFactor(6)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2_MILITARY)
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    hauler(
            BaseShipStats.builder()
                    .setDisplayName("Hauler")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Zorgon_Peterson)
                    .setAgility(150)
                    .setHullMass(14)
                    .setHullHardness(20)
                    .setSpeed(200)
                    .setMaxSpeed(320)
                    .setBoostSpeed(300)
                    .setMaxBoostSpeed(480)
                    .setArmorRating(100)
                    .setShield(50)
                    .setBaseCost(52_720)
                    .setMassLockFactor(6)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    empire_courier(
            BaseShipStats.builder()
                    .setDisplayName("Imperial Courier")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Gutamaya)
                    .setAgility(144)
                    .setHullMass(35)
                    .setHullHardness(30)
                    .setSpeed(280)
                    .setMaxSpeed(448)
                    .setBoostSpeed(380)
                    .setMaxBoostSpeed(608)
                    .setArmorRating(80)
                    .setShield(200)
                    .setBaseCost(2_542_930)
                    .setMassLockFactor(7)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    empire_eagle(
            BaseShipStats.builder()
                    .setDisplayName("Imperial Eagle")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Core_Dynamics)
                    .setAgility(155)
                    .setHullMass(50)
                    .setHullHardness(28)
                    .setSpeed(300)
                    .setMaxSpeed(480)
                    .setBoostSpeed(400)
                    .setMaxBoostSpeed(640)
                    .setArmorRating(60)
                    .setShield(80)
                    .setBaseCost(110_830)
                    .setMassLockFactor(6)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2_MILITARY)
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    sidewinder(
            BaseShipStats.builder()
                    .setDisplayName("Sidewinder")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                    .setAgility(168)
                    .setHullMass(25)
                    .setHullHardness(20)
                    .setSpeed(220)
                    .setMaxSpeed(352)
                    .setBoostSpeed(320)
                    .setMaxBoostSpeed(512)
                    .setArmorRating(60)
                    .setShield(40)
                    .setBaseCost(32_000)
                    .setMassLockFactor(6)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    viper(
            BaseShipStats.builder()
                    .setDisplayName("Viper MkIII")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                    .setAgility(140)
                    .setHullMass(50)
                    .setHullHardness(35)
                    .setSpeed(320)
                    .setMaxSpeed(512)
                    .setBoostSpeed(400)
                    .setMaxBoostSpeed(640)
                    .setArmorRating(70)
                    .setShield(105)
                    .setBaseCost(142_930)
                    .setMassLockFactor(7)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3_MILITARY)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    viper_mkiv(
            BaseShipStats.builder()
                    .setDisplayName("Viper MkIV")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                    .setAgility(132)
                    .setHullMass(190)
                    .setHullHardness(35)
                    .setSpeed(270)
                    .setMaxSpeed(313)
                    .setBoostSpeed(340)
                    .setMaxBoostSpeed(394)
                    .setArmorRating(150)
                    .setShield(150)
                    .setBaseCost(437_930)
                    .setMassLockFactor(7)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3_MILITARY)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    vulture(
            BaseShipStats.builder()
                    .setDisplayName("Vulture")
                    .setShipSize(ShipSize.Small)
                    .setManufacturer(ShipManufacturer.Core_Dynamics)
                    .setAgility(169)
                    .setHullMass(230)
                    .setHullHardness(55)
                    .setSpeed(210)
                    .setMaxSpeed(244)
                    .setBoostSpeed(340)
                    .setMaxBoostSpeed(394)
                    .setArmorRating(160)
                    .setShield(240)
                    .setBaseCost(4_925_620)
                    .setMassLockFactor(10)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5_MILITARY)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_1)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    typex(
            BaseShipStats.builder()
                    .setDisplayName("Alliance Chieftain")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(147)
                    .setHullMass(400)
                    .setHullHardness(65)
                    .setSpeed(230)
                    .setMaxSpeed(267)
                    .setBoostSpeed(330)
                    .setMaxBoostSpeed(383)
                    .setArmorRating(280)
                    .setShield(154)
                    .setBaseCost(18_992_773)
                    .setMassLockFactor(13)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    asp(
            BaseShipStats.builder()
                    .setDisplayName("Asp Explorer")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(148)
                    .setHullMass(280)
                    .setHullHardness(52)
                    .setSpeed(250)
                    .setMaxSpeed(290)
                    .setBoostSpeed(340)
                    .setMaxBoostSpeed(394)
                    .setArmorRating(210)
                    .setShield(140)
                    .setBaseCost(6_661_150)
                    .setMassLockFactor(11)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    asp_scout(
            BaseShipStats.builder()
                    .setDisplayName("Asp Scout")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(165)
                    .setHullMass(150)
                    .setHullHardness(52)
                    .setSpeed(220)
                    .setMaxSpeed(255)
                    .setBoostSpeed(300)
                    .setMaxBoostSpeed(348)
                    .setArmorRating(180)
                    .setShield(120)
                    .setBaseCost(3_961_150)
                    .setMassLockFactor(8)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    federation_dropship_mkii(
            BaseShipStats.builder()
                    .setDisplayName("Federal Assault Ship")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Core_Dynamics)
                    .setAgility(147)
                    .setHullMass(480)
                    .setHullHardness(60)
                    .setSpeed(210)
                    .setMaxSpeed(244)
                    .setBoostSpeed(350)
                    .setMaxBoostSpeed(406)
                    .setArmorRating(300)
                    .setShield(200)
                    .setBaseCost(19_814_210)
                    .setMassLockFactor(14)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    federation_dropship(
            BaseShipStats.builder()
                    .setDisplayName("Federal Dropship")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Core_Dynamics)
                    .setAgility(124)
                    .setHullMass(580)
                    .setHullHardness(60)
                    .setSpeed(180)
                    .setMaxSpeed(209)
                    .setBoostSpeed(300)
                    .setMaxBoostSpeed(348)
                    .setArmorRating(300)
                    .setShield(200)
                    .setBaseCost(14_314_210)
                    .setMassLockFactor(14)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    federation_gunship(
            BaseShipStats.builder()
                    .setDisplayName("Federal Gunship")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Core_Dynamics)
                    .setAgility(123)
                    .setHullMass(580)
                    .setHullHardness(60)
                    .setSpeed(170)
                    .setMaxSpeed(197)
                    .setBoostSpeed(280)
                    .setMaxBoostSpeed(325)
                    .setArmorRating(350)
                    .setShield(250)
                    .setBaseCost(35_814_210)
                    .setMassLockFactor(14)
                    .setCrewSeats(2)
                    .setSlfCapable(true)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_4_MILITARY)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    ferdelance(
            BaseShipStats.builder()
                    .setDisplayName("Fer-de-Lance")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Zorgon_Peterson)
                    .setAgility(140)
                    .setHullMass(250)
                    .setHullHardness(70)
                    .setSpeed(260)
                    .setMaxSpeed(302)
                    .setBoostSpeed(350)
                    .setMaxBoostSpeed(406)
                    .setArmorRating(225)
                    .setShield(300)
                    .setBaseCost(51_567_040)
                    .setMassLockFactor(12)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_1)
                    .build()),

    independant_trader(
            BaseShipStats.builder()
                    .setDisplayName("Keelback")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(142)
                    .setHullMass(180)
                    .setHullHardness(45)
                    .setSpeed(200)
                    .setMaxSpeed(232)
                    .setBoostSpeed(300)
                    .setMaxBoostSpeed(348)
                    .setArmorRating(270)
                    .setShield(135)
                    .setBaseCost(3_126_150)
                    .setMassLockFactor(8)
                    .setCrewSeats(2)
                    .setSlfCapable(true)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    python(
            BaseShipStats.builder()
                    .setDisplayName("Python")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                    .setAgility(129)
                    .setHullMass(350)
                    .setHullHardness(65)
                    .setSpeed(230)
                    .setMaxSpeed(267)
                    .setBoostSpeed(300)
                    .setMaxBoostSpeed(348)
                    .setArmorRating(260)
                    .setShield(260)
                    .setBaseCost(56_978_180)
                    .setMassLockFactor(17)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    type6(
            BaseShipStats.builder()
                    .setDisplayName("Type-6 Transporter")
                    .setShipSize(ShipSize.Medium)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(147)
                    .setHullMass(155)
                    .setHullHardness(35)
                    .setSpeed(220)
                    .setMaxSpeed(255)
                    .setBoostSpeed(350)
                    .setMaxBoostSpeed(406)
                    .setArmorRating(180)
                    .setShield(90)
                    .setBaseCost(1_045_950)
                    .setMassLockFactor(8)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    anaconda(
            BaseShipStats.builder()
                    .setDisplayName("Anaconda")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                    .setAgility(95)
                    .setHullMass(400)
                    .setHullHardness(65)
                    .setSpeed(180)
                    .setMaxSpeed(209)
                    .setBoostSpeed(240)
                    .setMaxBoostSpeed(278)
                    .setArmorRating(525)
                    .setShield(350)
                    .setBaseCost(146_969_450)
                    .setMassLockFactor(23)
                    .setCrewSeats(3)
                    .setSlfCapable(true)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5_MILITARY)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    belugaliner(
            BaseShipStats.builder()
                    .setDisplayName("Beluga Liner")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Saud_Kruger)
                    .setAgility(102)
                    .setHullMass(950)
                    .setHullHardness(60)
                    .setSpeed(200)
                    .setMaxSpeed(231)
                    .setBoostSpeed(280)
                    .setMaxBoostSpeed(323)
                    .setArmorRating(280)
                    .setShield(280)
                    .setBaseCost(84_532_770)
                    .setMassLockFactor(18)
                    .setCrewSeats(3)
                    .setSlfCapable(true)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6_RESERVED)
                    .addModule(ModuleSize.SIZE_6_RESERVED)
                    .addModule(ModuleSize.SIZE_5_RESERVED)
                    .addModule(ModuleSize.SIZE_5_RESERVED)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    federation_corvette(
            BaseShipStats.builder()
                    .setDisplayName("Federal Corvette")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Core_Dynamics)
                    .setAgility(111)
                    .setHullMass(900)
                    .setHullHardness(70)
                    .setSpeed(200)
                    .setMaxSpeed(232)
                    .setBoostSpeed(260)
                    .setMaxBoostSpeed(302)
                    .setArmorRating(370)
                    .setShield(555)
                    .setBaseCost(187_969_450)
                    .setMassLockFactor(24)
                    .setCrewSeats(3)
                    .setSlfCapable(true)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5_MILITARY)
                    .addModule(ModuleSize.SIZE_5_MILITARY)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    empire_trader(
            BaseShipStats.builder()
                    .setDisplayName("Imperial Clipper")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Gutamaya)
                    .setAgility(138)
                    .setHullMass(400)
                    .setHullHardness(60)
                    .setSpeed(300)
                    .setMaxSpeed(348)
                    .setBoostSpeed(380)
                    .setMaxBoostSpeed(441)
                    .setArmorRating(270)
                    .setShield(180)
                    .setBaseCost(22_296_860)
                    .setMassLockFactor(12)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    cutter(
            BaseShipStats.builder()
                    .setDisplayName("Imperial Cutter")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Gutamaya)
                    .setAgility(71)
                    .setHullMass(1_100)
                    .setHullHardness(70)
                    .setSpeed(200)
                    .setMaxSpeed(232)
                    .setBoostSpeed(320)
                    .setMaxBoostSpeed(371)
                    .setArmorRating(400)
                    .setShield(600)
                    .setBaseCost(208_969_450)
                    .setMassLockFactor(27)
                    .setCrewSeats(3)
                    .setSlfCapable(true)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_8)
                    .addModule(ModuleSize.SIZE_8)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5_MILITARY)
                    .addModule(ModuleSize.SIZE_5_MILITARY)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .build()),

    orca(
            BaseShipStats.builder()
                    .setDisplayName("Orca")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Saud_Kruger)
                    .setAgility(98)
                    .setHullMass(290)
                    .setHullHardness(55)
                    .setSpeed(300)
                    .setMaxSpeed(348)
                    .setBoostSpeed(380)
                    .setMaxBoostSpeed(441)
                    .setArmorRating(220)
                    .setShield(220)
                    .setBaseCost(48_539_900)
                    .setMassLockFactor(16)
                    .setCrewSeats(2)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_6_RESERVED)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5_RESERVED)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    type9_military(
            BaseShipStats.builder()
                    .setDisplayName("Type-10 Defender")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(48)
                    .setHullMass(1_200)
                    .setHullHardness(75)
                    .setSpeed(179)
                    .setMaxSpeed(200)
                    .setBoostSpeed(219)
                    .setMaxBoostSpeed(244)
                    .setArmorRating(580)
                    .setShield(320)
                    .setBaseCost(124_915_023)
                    .setMassLockFactor(26)
                    .setCrewSeats(3)
                    .setSlfCapable(true)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_8)
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5_MILITARY)
                    .addModule(ModuleSize.SIZE_5_MILITARY)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    type7(
            BaseShipStats.builder()
                    .setDisplayName("Type-7 Transporter")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(104)
                    .setHullMass(350)
                    .setHullHardness(54)
                    .setSpeed(180)
                    .setMaxSpeed(209)
                    .setBoostSpeed(300)
                    .setMaxBoostSpeed(348)
                    .setArmorRating(340)
                    .setShield(155)
                    .setBaseCost(17_472_260)
                    .setMassLockFactor(10)
                    .setCrewSeats(1)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    type9(
            BaseShipStats.builder()
                    .setDisplayName("Type-9 Heavy")
                    .setShipSize(ShipSize.Large)
                    .setManufacturer(ShipManufacturer.Lakon)
                    .setAgility(48)
                    .setHullMass(850)
                    .setHullHardness(65)
                    .setSpeed(130)
                    .setMaxSpeed(151)
                    .setBoostSpeed(200)
                    .setMaxBoostSpeed(232)
                    .setArmorRating(480)
                    .setShield(240)
                    .setBaseCost(77_734_260)
                    .setMassLockFactor(16)
                    .setCrewSeats(3)
                    .setSlfCapable(true)
                    .build(),

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
                    .addModule(ModuleSize.SIZE_8)
                    .addModule(ModuleSize.SIZE_8)
                    .addModule(ModuleSize.SIZE_7)
                    .addModule(ModuleSize.SIZE_6)
                    .addModule(ModuleSize.SIZE_5)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_4)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_3)
                    .addModule(ModuleSize.SIZE_2)
                    .build()),

    ;

    private final BaseShipStats baseShipStats;
    private final CoreModuleLayoutData coreModules;
    private final HardPointLayoutData hardpoints;
    private final OptionalModuleLayoutData internals;

    Ship(BaseShipStats baseShipStats, CoreModuleLayoutData coreModules, HardPointLayoutData hardpoints, OptionalModuleLayoutData internals)
    {
        this.baseShipStats = baseShipStats;
        this.coreModules = coreModules;
        this.hardpoints = hardpoints;
        this.internals = internals;
    }

    public BaseShipStats getBaseShipStats()
    {
        return baseShipStats;
    }

    public CoreModuleLayoutData getCoreModules()
    {
        return coreModules;
    }

    public HardPointLayoutData getHardpoints()
    {
        return hardpoints;
    }

    public OptionalModuleLayoutData getInternals()
    {
        return internals;
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
