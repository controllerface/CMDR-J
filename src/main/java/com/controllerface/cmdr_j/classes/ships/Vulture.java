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

public class Vulture extends AbstractShip
{
    public Vulture()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Vulture")
                .setShipSize(ShipSize.Small)
                .setManufacturer(ShipManufacturer.Core_Dynamics)
                .setAgility(169)
                .setHullMass(230)
                .setHullHardness(55)
                .setSpeed(210)
                .setMaxSpeed(244)
                .setBoostSpeed(340)
                .setMaxBoostSpeed(394)
                .setArmorRating(160)
                .setShield(240)
                .setBaseCost(4_924_620)
                .setMassLockFactor(10)
                .setCrewSeats(2)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_4)
                .setThrusters(ModuleSize.SIZE_5)
                .setFrameShiftDrive(ModuleSize.SIZE_4)
                .setLifeSupport(ModuleSize.SIZE_3)
                .setPowerDistributor(ModuleSize.SIZE_5)
                .setSensors(ModuleSize.SIZE_4)
                .setFuelTank(ModuleSize.SIZE_3)
                .build(),

            HardPointLayoutData.builder()
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Large)
                .addHardPoint(HardPointSize.Large)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5_MILITARY)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.vulture_armour_grade1,
            CoreInternalModule.vulture_armour_grade2,
            CoreInternalModule.vulture_armour_grade3,
            CoreInternalModule.vulture_armour_mirrored,
            CoreInternalModule.vulture_armour_reactive);
    }
}
