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

public class Crusader extends AbstractShip
{
    public Crusader()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Alliance Crusader")
                        .setShipSize(ShipSize.Medium)
                        .setManufacturer(ShipManufacturer.Lakon)
                        .setAgility(128)
                        .setHullMass(500)
                        .setHullHardness(65)
                        .setSpeed(180)
                        .setMaxSpeed(209)
                        .setBoostSpeed(300)
                        .setMaxBoostSpeed(348)
                        .setArmorRating(300)
                        .setShield(200)
                        .setBaseCost(23_675_231)
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
                        .addHardPoint(HardPointSize.Small)
                        .addHardPoint(HardPointSize.Small)
                        .addHardPoint(HardPointSize.Small)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_1)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_6)
                        .build(),

                CoreInternalModule.typex_2_armour_grade1,
                CoreInternalModule.typex_2_armour_grade2,
                CoreInternalModule.typex_2_armour_grade3,
                CoreInternalModule.typex_2_armour_mirrored,
                CoreInternalModule.typex_2_armour_reactive);
    }
}
