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

public class Challenger extends AbstractShip
{
    public Challenger()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Alliance Challenger")
                        .setShipSize(ShipSize.Medium)
                        .setManufacturer(ShipManufacturer.Lakon)
                        .setAgility(138)
                        .setHullMass(450)
                        .setHullHardness(65)
                        .setSpeed(204)
                        .setMaxSpeed(237)
                        .setBoostSpeed(310)
                        .setMaxBoostSpeed(360)
                        .setArmorRating(540)
                        .setShield(220)
                        .setBaseCost(28_982_605)
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
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.typex_3_armour_grade1,
                CoreInternalModule.typex_3_armour_grade2,
                CoreInternalModule.typex_3_armour_grade3,
                CoreInternalModule.typex_3_armour_mirrored,
                CoreInternalModule.typex_3_armour_reactive);
    }
}
