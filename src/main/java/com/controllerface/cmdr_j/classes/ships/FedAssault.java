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

public class FedAssault extends AbstractShip
{
    public FedAssault()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Federal Assault Ship")
                .setShipSize(ShipSize.Medium)
                .setManufacturer(ShipManufacturer.Core_Dynamics)
                .setAgility(147)
                .setHullMass(480)
                .setHullHardness(60)
                .setSpeed(210)
                .setMaxSpeed(244)
                .setBoostSpeed(350)
                .setMaxBoostSpeed(406)
                .setArmorRating(300)
                .setShield(200)
                .setBaseCost(19_814_210)
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
                .addHardPoint(HardPointSize.Large)
                .addHardPoint(HardPointSize.Large)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4_MILITARY)
                .addModule(ModuleSize.SIZE_4_MILITARY)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.federation_dropship_mkii_armour_grade1,
            CoreInternalModule.federation_dropship_mkii_armour_grade2,
            CoreInternalModule.federation_dropship_mkii_armour_grade3,
            CoreInternalModule.federation_dropship_mkii_armour_mirrored,
            CoreInternalModule.federation_dropship_mkii_armour_reactive);
    }
}
