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

public class CobraMK3 extends AbstractShip
{
    public CobraMK3()
    {
        super(
                BaseShipStats.builder()
                        .setDisplayName("Cobra MKIII")
                        .setShipSize(ShipSize.Small)
                        .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                        .setAgility(150)
                        .setHullMass(180)
                        .setHullHardness(35)
                        .setSpeed(280)
                        .setMaxSpeed(325)
                        .setBoostSpeed(400)
                        .setMaxBoostSpeed(464)
                        .setArmorRating(120)
                        .setShield(80)
                        .setBaseCost(349_720)
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
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.cobramkiii_armour_grade1,
                CoreInternalModule.cobramkiii_armour_grade2,
                CoreInternalModule.cobramkiii_armour_grade3,
                CoreInternalModule.cobramkiii_armour_mirrored,
                CoreInternalModule.cobramkiii_armour_reactive);
    }
}
