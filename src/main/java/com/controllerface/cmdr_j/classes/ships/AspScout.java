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

public class AspScout extends AbstractShip
{
    public AspScout()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Asp Scout")
                        .setShipSize(ShipSize.Medium)
                        .setManufacturer(ShipManufacturer.Lakon)
                        .setAgility(165)
                        .setHullMass(150)
                        .setHullHardness(52)
                        .setSpeed(220)
                        .setMaxSpeed(255)
                        .setBoostSpeed(300)
                        .setMaxBoostSpeed(348)
                        .setArmorRating(180)
                        .setShield(120)
                        .setBaseCost(3_961_150)
                        .setMassLockFactor(8)
                        .setCrewSeats(2)
                        .build(),

                CoreModuleLayoutData.builder()
                        .setPowerPlant(ModuleSize.SIZE_4)
                        .setThrusters(ModuleSize.SIZE_4)
                        .setFrameShiftDrive(ModuleSize.SIZE_4)
                        .setLifeSupport(ModuleSize.SIZE_3)
                        .setPowerDistributor(ModuleSize.SIZE_4)
                        .setSensors(ModuleSize.SIZE_4)
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
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.asp_scout_armour_grade1,
                CoreInternalModule.asp_scout_armour_grade2,
                CoreInternalModule.asp_scout_armour_grade3,
                CoreInternalModule.asp_scout_armour_mirrored,
                CoreInternalModule.asp_scout_armour_reactive);
    }
}
