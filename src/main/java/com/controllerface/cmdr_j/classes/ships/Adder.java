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

public class Adder extends AbstractShip
{
    public Adder()
    {
        super(BaseShipStats.builder()
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
                .setBaseCost(86_810)
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
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.adder_armour_grade1,
            CoreInternalModule.adder_armour_grade2,
            CoreInternalModule.adder_armour_grade3,
            CoreInternalModule.adder_armour_mirrored,
            CoreInternalModule.adder_armour_reactive);
    }
}
