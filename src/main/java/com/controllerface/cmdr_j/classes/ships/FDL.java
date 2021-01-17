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

public class FDL extends AbstractShip
{
    public FDL()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Fer-de-Lance")
                .setShipSize(ShipSize.Medium)
                .setManufacturer(ShipManufacturer.Zorgon_Peterson)
                .setAgility(140)
                .setHullMass(250)
                .setHullHardness(70)
                .setSpeed(260)
                .setMaxSpeed(302)
                .setBoostSpeed(350)
                .setMaxBoostSpeed(406)
                .setArmorRating(225)
                .setShield(300)
                .setBaseCost(51_566_040)
                .setMassLockFactor(12)
                .setCrewSeats(2)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_6)
                .setThrusters(ModuleSize.SIZE_5)
                .setFrameShiftDrive(ModuleSize.SIZE_4)
                .setLifeSupport(ModuleSize.SIZE_4)
                .setPowerDistributor(ModuleSize.SIZE_6)
                .setSensors(ModuleSize.SIZE_4)
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
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Huge)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.ferdelance_armour_grade1,
            CoreInternalModule.ferdelance_armour_grade2,
            CoreInternalModule.ferdelance_armour_grade3,
            CoreInternalModule.ferdelance_armour_mirrored,
            CoreInternalModule.ferdelance_armour_reactive);
    }
}
