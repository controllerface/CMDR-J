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

public class Type6 extends AbstractShip
{
    public Type6()
    {
        super(
            BaseShipStats.builder()
                .setDisplayName("Type-6 Transporter")
                .setShipSize(ShipSize.Medium)
                .setManufacturer(ShipManufacturer.Lakon)
                .setAgility(147)
                .setHullMass(155)
                .setHullHardness(35)
                .setSpeed(220)
                .setMaxSpeed(255)
                .setBoostSpeed(350)
                .setMaxBoostSpeed(406)
                .setArmorRating(180)
                .setShield(90)
                .setBaseCost(1_044_950)
                .setMassLockFactor(8)
                .setCrewSeats(1)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_3)
                .setThrusters(ModuleSize.SIZE_4)
                .setFrameShiftDrive(ModuleSize.SIZE_4)
                .setLifeSupport(ModuleSize.SIZE_2)
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
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.type6_armour_grade1,
            CoreInternalModule.type6_armour_grade2,
            CoreInternalModule.type6_armour_grade3,
            CoreInternalModule.type6_armour_mirrored,
            CoreInternalModule.type6_armour_reactive);
    }
}
