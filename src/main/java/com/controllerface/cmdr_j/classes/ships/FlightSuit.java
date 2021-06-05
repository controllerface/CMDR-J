package com.controllerface.cmdr_j.classes.ships;

import com.controllerface.cmdr_j.classes.data.BaseShipStats;
import com.controllerface.cmdr_j.classes.data.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.data.HardPointLayoutData;
import com.controllerface.cmdr_j.classes.data.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.HardPointSize;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ModuleSize;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipSize;

public class FlightSuit extends AbstractShip
{
    public FlightSuit()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Flight Suit")
                .setShipSize(ShipSize.Small)
                .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                .setAgility(0)
                .setHullMass(0)
                .setHullHardness(0)
                .setSpeed(0)
                .setMaxSpeed(0)
                .setBoostSpeed(0)
                .setMaxBoostSpeed(0)
                .setArmorRating(0)
                .setShield(0)
                .setBaseCost(0)
                .setMassLockFactor(0)
                .setCrewSeats(0)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_1)
                .setThrusters(ModuleSize.SIZE_1)
                .setFrameShiftDrive(ModuleSize.SIZE_1)
                .setLifeSupport(ModuleSize.SIZE_1)
                .setPowerDistributor(ModuleSize.SIZE_1)
                .setSensors(ModuleSize.SIZE_1)
                .setFuelTank(ModuleSize.SIZE_1)
                .build(),

            HardPointLayoutData.builder()
                .addHardPoint(HardPointSize.Tiny)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.sidewinder_armour_grade1,
            CoreInternalModule.sidewinder_armour_grade2,
            CoreInternalModule.sidewinder_armour_grade3,
            CoreInternalModule.sidewinder_armour_mirrored,
            CoreInternalModule.sidewinder_armour_reactive);
    }
}
