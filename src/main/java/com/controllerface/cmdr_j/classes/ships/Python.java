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

public class Python extends AbstractShip
{
    public Python()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Python")
                        .setShipSize(ShipSize.Medium)
                        .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                        .setAgility(129)
                        .setHullMass(350)
                        .setHullHardness(65)
                        .setSpeed(230)
                        .setMaxSpeed(267)
                        .setBoostSpeed(300)
                        .setMaxBoostSpeed(348)
                        .setArmorRating(260)
                        .setShield(260)
                        .setBaseCost(56_978_180)
                        .setMassLockFactor(17)
                        .setCrewSeats(2)
                        .build(),

                CoreModuleLayoutData.builder()
                        .setPowerPlant(ModuleSize.SIZE_7)
                        .setThrusters(ModuleSize.SIZE_6)
                        .setFrameShiftDrive(ModuleSize.SIZE_5)
                        .setLifeSupport(ModuleSize.SIZE_4)
                        .setPowerDistributor(ModuleSize.SIZE_7)
                        .setSensors(ModuleSize.SIZE_6)
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
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Large)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.python_armour_grade1,
                CoreInternalModule.python_armour_grade2,
                CoreInternalModule.python_armour_grade3,
                CoreInternalModule.python_armour_mirrored,
                CoreInternalModule.python_armour_reactive);
    }
}
