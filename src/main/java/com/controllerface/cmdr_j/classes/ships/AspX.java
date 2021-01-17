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

public class AspX extends AbstractShip
{
    public AspX()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Asp Explorer")
                .setShipSize(ShipSize.Medium)
                .setManufacturer(ShipManufacturer.Lakon)
                .setAgility(148)
                .setHullMass(280)
                .setHullHardness(52)
                .setSpeed(250)
                .setMaxSpeed(290)
                .setBoostSpeed(340)
                .setMaxBoostSpeed(394)
                .setArmorRating(210)
                .setShield(140)
                .setBaseCost(6_660_150)
                .setMassLockFactor(11)
                .setCrewSeats(2)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_5)
                .setThrusters(ModuleSize.SIZE_5)
                .setFrameShiftDrive(ModuleSize.SIZE_5)
                .setLifeSupport(ModuleSize.SIZE_4)
                .setPowerDistributor(ModuleSize.SIZE_4)
                .setSensors(ModuleSize.SIZE_5)
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
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Medium)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.asp_armour_grade1,
            CoreInternalModule.asp_armour_grade2,
            CoreInternalModule.asp_armour_grade3,
            CoreInternalModule.asp_armour_mirrored,
            CoreInternalModule.asp_armour_reactive);
    }
}
