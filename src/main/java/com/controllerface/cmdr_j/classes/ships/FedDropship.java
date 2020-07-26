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

public class FedDropship extends AbstractShip
{
    public FedDropship()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Federal Dropship")
                        .setShipSize(ShipSize.Medium)
                        .setManufacturer(ShipManufacturer.Core_Dynamics)
                        .setAgility(124)
                        .setHullMass(580)
                        .setHullHardness(60)
                        .setSpeed(180)
                        .setMaxSpeed(209)
                        .setBoostSpeed(300)
                        .setMaxBoostSpeed(348)
                        .setArmorRating(300)
                        .setShield(200)
                        .setBaseCost(14_314_210)
                        .setMassLockFactor(14)
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
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Large)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_4_MILITARY)
                        .addModule(ModuleSize.SIZE_4_MILITARY)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.federation_dropship_armour_grade1,
                CoreInternalModule.federation_dropship_armour_grade2,
                CoreInternalModule.federation_dropship_armour_grade3,
                CoreInternalModule.federation_dropship_armour_mirrored,
                CoreInternalModule.federation_dropship_armour_reactive);
    }
}
