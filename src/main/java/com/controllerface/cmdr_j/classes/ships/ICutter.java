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

public class ICutter extends AbstractShip
{
    public ICutter()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Imperial Cutter")
                .setShipSize(ShipSize.Large)
                .setManufacturer(ShipManufacturer.Gutamaya)
                .setAgility(71)
                .setHullMass(1_100)
                .setHullHardness(70)
                .setSpeed(200)
                .setMaxSpeed(232)
                .setBoostSpeed(320)
                .setMaxBoostSpeed(371)
                .setArmorRating(400)
                .setShield(600)
                .setBaseCost(208_968_450)
                .setMassLockFactor(27)
                .setCrewSeats(3)
                .setSlfCapable(true)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_8)
                .setThrusters(ModuleSize.SIZE_8)
                .setFrameShiftDrive(ModuleSize.SIZE_7)
                .setLifeSupport(ModuleSize.SIZE_7)
                .setPowerDistributor(ModuleSize.SIZE_7)
                .setSensors(ModuleSize.SIZE_7)
                .setFuelTank(ModuleSize.SIZE_6)
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
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Large)
                .addHardPoint(HardPointSize.Large)
                .addHardPoint(HardPointSize.Huge)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_8)
                .addModule(ModuleSize.SIZE_8)
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5_MILITARY)
                .addModule(ModuleSize.SIZE_5_MILITARY)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.cutter_armour_grade1,
            CoreInternalModule.cutter_armour_grade2,
            CoreInternalModule.cutter_armour_grade3,
            CoreInternalModule.cutter_armour_mirrored,
            CoreInternalModule.cutter_armour_reactive);
    }
}
