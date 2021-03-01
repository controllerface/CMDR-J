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

public class Anaconda extends AbstractShip
{
    public Anaconda()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Anaconda")
                .setShipSize(ShipSize.Large)
                .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                .setAgility(95)
                .setHullMass(400)
                .setHullHardness(65)
                .setSpeed(180)
                .setMaxSpeed(209)
                .setBoostSpeed(240)
                .setMaxBoostSpeed(278)
                .setArmorRating(525)
                .setShield(350)
                .setBaseCost(146_968_450)
                .setMassLockFactor(23)
                .setCrewSeats(3)
                .setSlfCapable(true)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_8)
                .setThrusters(ModuleSize.SIZE_7)
                .setFrameShiftDrive(ModuleSize.SIZE_6)
                .setLifeSupport(ModuleSize.SIZE_5)
                .setPowerDistributor(ModuleSize.SIZE_8)
                .setSensors(ModuleSize.SIZE_8)
                .setFuelTank(ModuleSize.SIZE_5)
                .build(),

            HardPointLayoutData.builder()
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Large)
                .addHardPoint(HardPointSize.Large)
                .addHardPoint(HardPointSize.Large)
                .addHardPoint(HardPointSize.Huge)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_7)
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5_MILITARY)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.anaconda_armour_grade1,
            CoreInternalModule.anaconda_armour_grade2,
            CoreInternalModule.anaconda_armour_grade3,
            CoreInternalModule.anaconda_armour_mirrored,
            CoreInternalModule.anaconda_armour_reactive);
    }
}
