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

public class Hauler extends AbstractShip
{
    public Hauler()
    {
        super(BaseShipStats.builder()
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
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),
            CoreInternalModule.hauler_armour_grade1,
            CoreInternalModule.hauler_armour_grade2,
            CoreInternalModule.hauler_armour_grade3,
            CoreInternalModule.hauler_armour_mirrored,
            CoreInternalModule.hauler_armour_reactive);
    }
}
