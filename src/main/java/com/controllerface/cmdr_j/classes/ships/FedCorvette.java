package com.controllerface.cmdr_j.classes.ships;

import com.controllerface.cmdr_j.classes.BaseShipStats;
import com.controllerface.cmdr_j.classes.data.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.data.HardPointLayoutData;
import com.controllerface.cmdr_j.classes.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.HardPointSize;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ModuleSize;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipSize;

public class FedCorvette extends AbstractShip
{
    public FedCorvette()
    {
        super(
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
                .setBaseCost(187_968_450)
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
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.federation_corvette_armour_grade1,
            CoreInternalModule.federation_corvette_armour_grade2,
            CoreInternalModule.federation_corvette_armour_grade3,
            CoreInternalModule.federation_corvette_armour_mirrored,
            CoreInternalModule.federation_corvette_armour_reactive);
    }
}
