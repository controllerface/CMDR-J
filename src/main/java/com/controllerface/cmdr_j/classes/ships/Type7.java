package com.controllerface.cmdr_j.classes.ships;

import com.controllerface.cmdr_j.classes.BaseShipStats;
import com.controllerface.cmdr_j.classes.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.HardPointLayoutData;
import com.controllerface.cmdr_j.classes.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.HardPointSize;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ModuleSize;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipSize;

public class Type7 extends AbstractShip
{
    public Type7()
    {
        super(
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
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.type7_armour_grade1,
                CoreInternalModule.type7_armour_grade2,
                CoreInternalModule.type7_armour_grade3,
                CoreInternalModule.type7_armour_mirrored,
                CoreInternalModule.type7_armour_reactive);
    }
}
