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

public class Type9 extends AbstractShip
{
    public Type9()
    {
        super(
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
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.type9_armour_grade1,
                CoreInternalModule.type9_armour_grade2,
                CoreInternalModule.type9_armour_grade3,
                CoreInternalModule.type9_armour_mirrored,
                CoreInternalModule.type9_armour_reactive);
    }
}
