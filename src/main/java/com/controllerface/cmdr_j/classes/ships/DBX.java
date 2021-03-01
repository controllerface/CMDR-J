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

public class DBX extends AbstractShip
{
    public DBX()
    {
        super(
            BaseShipStats.builder()
                .setDisplayName("Diamondback Explorer")
                .setShipSize(ShipSize.Small)
                .setManufacturer(ShipManufacturer.Lakon)
                .setAgility(138)
                .setHullMass(260)
                .setHullHardness(42)
                .setSpeed(260)
                .setMaxSpeed(284)
                .setBoostSpeed(340)
                .setMaxBoostSpeed(371)
                .setArmorRating(150)
                .setShield(150)
                .setBaseCost(1_893_760)
                .setMassLockFactor(10)
                .setCrewSeats(1)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_4)
                .setThrusters(ModuleSize.SIZE_4)
                .setFrameShiftDrive(ModuleSize.SIZE_5)
                .setLifeSupport(ModuleSize.SIZE_3)
                .setPowerDistributor(ModuleSize.SIZE_4)
                .setSensors(ModuleSize.SIZE_3)
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
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.diamondbackxl_armour_grade1,
            CoreInternalModule.diamondbackxl_armour_grade2,
            CoreInternalModule.diamondbackxl_armour_grade3,
            CoreInternalModule.diamondbackxl_armour_mirrored,
            CoreInternalModule.diamondbackxl_armour_reactive);
    }
}
