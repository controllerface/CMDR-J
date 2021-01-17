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

public class Chieftain extends AbstractShip
{
    public Chieftain()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Alliance Chieftain")
                .setShipSize(ShipSize.Medium)
                .setManufacturer(ShipManufacturer.Lakon)
                .setAgility(147)
                .setHullMass(400)
                .setHullHardness(65)
                .setSpeed(230)
                .setMaxSpeed(267)
                .setBoostSpeed(330)
                .setMaxBoostSpeed(383)
                .setArmorRating(280)
                .setShield(154)
                .setBaseCost(18_991_773)
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
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Large)
                .addHardPoint(HardPointSize.Large)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4_MILITARY)
                .addModule(ModuleSize.SIZE_4_MILITARY)
                .addModule(ModuleSize.SIZE_4_MILITARY)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.typex_armour_grade1,
            CoreInternalModule.typex_armour_grade2,
            CoreInternalModule.typex_armour_grade3,
            CoreInternalModule.typex_armour_mirrored,
            CoreInternalModule.typex_armour_reactive);
    }
}
