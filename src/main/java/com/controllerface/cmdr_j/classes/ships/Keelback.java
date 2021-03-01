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

public class Keelback extends AbstractShip
{
    public Keelback()
    {
        super(BaseShipStats.builder()
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
                .setBaseCost(3_125_150)
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
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.independant_trader_armour_grade1,
            CoreInternalModule.independant_trader_armour_grade2,
            CoreInternalModule.independant_trader_armour_grade3,
            CoreInternalModule.independant_trader_armour_mirrored,
            CoreInternalModule.independant_trader_armour_reactive);
    }
}
