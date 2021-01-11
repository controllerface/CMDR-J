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

public class Orca extends AbstractShip
{
    public Orca()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Orca")
                        .setShipSize(ShipSize.Large)
                        .setManufacturer(ShipManufacturer.Saud_Kruger)
                        .setAgility(98)
                        .setHullMass(290)
                        .setHullHardness(55)
                        .setSpeed(300)
                        .setMaxSpeed(348)
                        .setBoostSpeed(380)
                        .setMaxBoostSpeed(441)
                        .setArmorRating(220)
                        .setShield(220)
                        .setBaseCost(48_539_900)
                        .setMassLockFactor(16)
                        .setCrewSeats(2)
                        .build(),

                CoreModuleLayoutData.builder()
                        .setPowerPlant(ModuleSize.SIZE_5)
                        .setThrusters(ModuleSize.SIZE_6)
                        .setFrameShiftDrive(ModuleSize.SIZE_5)
                        .setLifeSupport(ModuleSize.SIZE_6)
                        .setPowerDistributor(ModuleSize.SIZE_5)
                        .setSensors(ModuleSize.SIZE_4)
                        .setFuelTank(ModuleSize.SIZE_5)
                        .build(),

                HardPointLayoutData.builder()
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Large)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.orca_armour_grade1,
                CoreInternalModule.orca_armour_grade2,
                CoreInternalModule.orca_armour_grade3,
                CoreInternalModule.orca_armour_mirrored,
                CoreInternalModule.orca_armour_reactive);
    }
}
