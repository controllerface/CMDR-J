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

public class FedGunship extends AbstractShip
{
    public FedGunship()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Federal Gunship")
                        .setShipSize(ShipSize.Medium)
                        .setManufacturer(ShipManufacturer.Core_Dynamics)
                        .setAgility(123)
                        .setHullMass(580)
                        .setHullHardness(60)
                        .setSpeed(170)
                        .setMaxSpeed(197)
                        .setBoostSpeed(280)
                        .setMaxBoostSpeed(325)
                        .setArmorRating(350)
                        .setShield(250)
                        .setBaseCost(35_814_210)
                        .setMassLockFactor(14)
                        .setCrewSeats(2)
                        .setSlfCapable(true)
                        .build(),

                CoreModuleLayoutData.builder()
                        .setPowerPlant(ModuleSize.SIZE_6)
                        .setThrusters(ModuleSize.SIZE_6)
                        .setFrameShiftDrive(ModuleSize.SIZE_5)
                        .setLifeSupport(ModuleSize.SIZE_5)
                        .setPowerDistributor(ModuleSize.SIZE_7)
                        .setSensors(ModuleSize.SIZE_5)
                        .setFuelTank(ModuleSize.SIZE_4)
                        .build(),

                HardPointLayoutData.builder()
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Small)
                        .addHardPoint(HardPointSize.Small)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Large)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_4_MILITARY)
                        .addModule(ModuleSize.SIZE_4_MILITARY)
                        .addModule(ModuleSize.SIZE_4_MILITARY)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.federation_gunship_armour_grade1,
                CoreInternalModule.federation_gunship_armour_grade2,
                CoreInternalModule.federation_gunship_armour_grade3,
                CoreInternalModule.federation_gunship_armour_mirrored,
                CoreInternalModule.federation_gunship_armour_reactive);
    }
}
