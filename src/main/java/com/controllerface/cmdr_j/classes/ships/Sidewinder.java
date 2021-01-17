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

public class Sidewinder extends AbstractShip
{
    public Sidewinder()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Sidewinder")
                .setShipSize(ShipSize.Small)
                .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                .setAgility(168)
                .setHullMass(25)
                .setHullHardness(20)
                .setSpeed(220)
                .setMaxSpeed(352)
                .setBoostSpeed(320)
                .setMaxBoostSpeed(512)
                .setArmorRating(60)
                .setShield(40)
                .setBaseCost(31_000)
                .setMassLockFactor(6)
                .setCrewSeats(1)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_2)
                .setThrusters(ModuleSize.SIZE_2)
                .setFrameShiftDrive(ModuleSize.SIZE_2)
                .setLifeSupport(ModuleSize.SIZE_1)
                .setPowerDistributor(ModuleSize.SIZE_1)
                .setSensors(ModuleSize.SIZE_1)
                .setFuelTank(ModuleSize.SIZE_1)
                .build(),

            HardPointLayoutData.builder()
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Small)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.sidewinder_armour_grade1,
            CoreInternalModule.sidewinder_armour_grade2,
            CoreInternalModule.sidewinder_armour_grade3,
            CoreInternalModule.sidewinder_armour_mirrored,
            CoreInternalModule.sidewinder_armour_reactive);
    }
}
