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

public class ICourier extends AbstractShip
{
    public ICourier()
    {
        super(
                BaseShipStats.builder()
                        .setDisplayName("Imperial Courier")
                        .setShipSize(ShipSize.Small)
                        .setManufacturer(ShipManufacturer.Gutamaya)
                        .setAgility(144)
                        .setHullMass(35)
                        .setHullHardness(30)
                        .setSpeed(280)
                        .setMaxSpeed(448)
                        .setBoostSpeed(380)
                        .setMaxBoostSpeed(608)
                        .setArmorRating(80)
                        .setShield(200)
                        .setBaseCost(2_542_930)
                        .setMassLockFactor(7)
                        .setCrewSeats(1)
                        .build(),

                CoreModuleLayoutData.builder()
                        .setPowerPlant(ModuleSize.SIZE_4)
                        .setThrusters(ModuleSize.SIZE_3)
                        .setFrameShiftDrive(ModuleSize.SIZE_3)
                        .setLifeSupport(ModuleSize.SIZE_1)
                        .setPowerDistributor(ModuleSize.SIZE_3)
                        .setSensors(ModuleSize.SIZE_2)
                        .setFuelTank(ModuleSize.SIZE_3)
                        .build(),

                HardPointLayoutData.builder()
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .addModule(ModuleSize.SIZE_1)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),
                CoreInternalModule.empire_courier_armour_grade1,
                CoreInternalModule.empire_courier_armour_grade2,
                CoreInternalModule.empire_courier_armour_grade3,
                CoreInternalModule.empire_courier_armour_mirrored,
                CoreInternalModule.empire_courier_armour_reactive);
    }
}
