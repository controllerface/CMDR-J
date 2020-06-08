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

public class Beluga extends AbstractShip
{
    public Beluga()
    {
        super(BaseShipStats.builder()
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
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.belugaliner_armour_grade1,
                CoreInternalModule.belugaliner_armour_grade2,
                CoreInternalModule.belugaliner_armour_grade3,
                CoreInternalModule.belugaliner_armour_mirrored,
                CoreInternalModule.belugaliner_armour_reactive);
    }
}
