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

public class Mamba extends AbstractShip
{
    public Mamba()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Mamba")
                        .setShipSize(ShipSize.Medium)
                        .setManufacturer(ShipManufacturer.Zorgon_Peterson)
                        .setAgility(117)
                        .setHullMass(250)
                        .setHullHardness(65)
                        .setSpeed(310)
                        .setMaxSpeed(360)
                        .setBoostSpeed(380)
                        .setMaxBoostSpeed(441)
                        .setArmorRating(230)
                        .setShield(270)
                        .setBaseCost(56_289_969)
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
                        .addHardPoint(HardPointSize.Small)
                        .addHardPoint(HardPointSize.Small)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Huge)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.mamba_armour_grade1,
                CoreInternalModule.mamba_armour_grade2,
                CoreInternalModule.mamba_armour_grade3,
                CoreInternalModule.mamba_armour_mirrored,
                CoreInternalModule.mamba_armour_reactive);
    }
}
