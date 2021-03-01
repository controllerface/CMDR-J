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

public class IEagle extends AbstractShip
{
    public IEagle()
    {
        super(
            BaseShipStats.builder()
                .setDisplayName("Imperial Eagle")
                .setShipSize(ShipSize.Small)
                .setManufacturer(ShipManufacturer.Core_Dynamics)
                .setAgility(155)
                .setHullMass(50)
                .setHullHardness(28)
                .setSpeed(300)
                .setMaxSpeed(480)
                .setBoostSpeed(400)
                .setMaxBoostSpeed(640)
                .setArmorRating(60)
                .setShield(80)
                .setBaseCost(109_830)
                .setMassLockFactor(6)
                .setCrewSeats(1)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_3)
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
                .addHardPoint(HardPointSize.Medium)
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

            CoreInternalModule.empire_eagle_armour_grade1,
            CoreInternalModule.empire_eagle_armour_grade2,
            CoreInternalModule.empire_eagle_armour_grade3,
            CoreInternalModule.empire_eagle_armour_mirrored,
            CoreInternalModule.empire_eagle_armour_reactive);
    }
}
