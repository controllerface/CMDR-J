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

public class CobraMK4 extends AbstractShip
{
    public CobraMK4()
    {
        super(

            BaseShipStats.builder()
                .setDisplayName("Cobra MKIV")
                .setShipSize(ShipSize.Small)
                .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                .setAgility(130)
                .setHullMass(210)
                .setHullHardness(35)
                .setSpeed(200)
                .setMaxSpeed(228)
                .setBoostSpeed(300)
                .setMaxBoostSpeed(342)
                .setArmorRating(120)
                .setShield(120)
                .setBaseCost(746_660)
                .setMassLockFactor(8)
                .setCrewSeats(2)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_4)
                .setThrusters(ModuleSize.SIZE_4)
                .setFrameShiftDrive(ModuleSize.SIZE_4)
                .setLifeSupport(ModuleSize.SIZE_3)
                .setPowerDistributor(ModuleSize.SIZE_3)
                .setSensors(ModuleSize.SIZE_3)
                .setFuelTank(ModuleSize.SIZE_4)
                .build(),

            HardPointLayoutData.builder()
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Small)
                .addHardPoint(HardPointSize.Medium)
                .addHardPoint(HardPointSize.Medium)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_4)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.cobramkiv_armour_grade1,
            CoreInternalModule.cobramkiv_armour_grade2,
            CoreInternalModule.cobramkiv_armour_grade3,
            CoreInternalModule.cobramkiv_armour_mirrored,
            CoreInternalModule.cobramkiv_armour_reactive);
    }
}
