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

public class Eagle extends AbstractShip
{
    public Eagle()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Eagle")
                .setShipSize(ShipSize.Small)
                .setManufacturer(ShipManufacturer.Core_Dynamics)
                .setAgility(188)
                .setHullMass(50)
                .setHullHardness(28)
                .setSpeed(240)
                .setMaxSpeed(384)
                .setBoostSpeed(350)
                .setMaxBoostSpeed(560)
                .setArmorRating(40)
                .setShield(60)
                .setBaseCost(43_800)
                .setMassLockFactor(6)
                .setCrewSeats(1)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_2)
                .setThrusters(ModuleSize.SIZE_3)
                .setFrameShiftDrive(ModuleSize.SIZE_3)
                .setLifeSupport(ModuleSize.SIZE_1)
                .setPowerDistributor(ModuleSize.SIZE_2)
                .setSensors(ModuleSize.SIZE_2)
                .setFuelTank(ModuleSize.SIZE_2)
                .build(),

            HardPointLayoutData.builder()
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Small)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2_MILITARY)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.eagle_armour_grade1,
            CoreInternalModule.eagle_armour_grade2,
            CoreInternalModule.eagle_armour_grade3,
            CoreInternalModule.eagle_armour_mirrored,
            CoreInternalModule.eagle_armour_reactive);
    }
}
