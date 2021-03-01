package com.controllerface.cmdr_j.classes.ships;

import com.controllerface.cmdr_j.classes.data.BaseShipStats;
import com.controllerface.cmdr_j.classes.data.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.classes.data.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.data.HardPointLayoutData;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.HardPointSize;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ModuleSize;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipSize;

public class Dolphin extends AbstractShip
{
    public Dolphin()
    {
        super(
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
                .setBaseCost(1_336_330)
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
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.dolphin_armour_grade1,
            CoreInternalModule.dolphin_armour_grade2,
            CoreInternalModule.dolphin_armour_grade3,
            CoreInternalModule.dolphin_armour_mirrored,
            CoreInternalModule.dolphin_armour_reactive);
    }
}
