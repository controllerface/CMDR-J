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

public class Type10 extends AbstractShip
{
    public Type10()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Type-10 Defender")
                        .setShipSize(ShipSize.Large)
                        .setManufacturer(ShipManufacturer.Lakon)
                        .setAgility(48)
                        .setHullMass(1_200)
                        .setHullHardness(75)
                        .setSpeed(179)
                        .setMaxSpeed(200)
                        .setBoostSpeed(219)
                        .setMaxBoostSpeed(244)
                        .setArmorRating(580)
                        .setShield(320)
                        .setBaseCost(124_915_023)
                        .setMassLockFactor(26)
                        .setCrewSeats(3)
                        .setSlfCapable(true)
                        .build(),

                CoreModuleLayoutData.builder()
                        .setPowerPlant(ModuleSize.SIZE_8)
                        .setThrusters(ModuleSize.SIZE_7)
                        .setFrameShiftDrive(ModuleSize.SIZE_7)
                        .setLifeSupport(ModuleSize.SIZE_5)
                        .setPowerDistributor(ModuleSize.SIZE_7)
                        .setSensors(ModuleSize.SIZE_4)
                        .setFuelTank(ModuleSize.SIZE_6)
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
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Large)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_8)
                        .addModule(ModuleSize.SIZE_7)
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_5_MILITARY)
                        .addModule(ModuleSize.SIZE_5_MILITARY)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.type9_military_armour_grade1,
                CoreInternalModule.type9_military_armour_grade2,
                CoreInternalModule.type9_military_armour_grade3,
                CoreInternalModule.type9_military_armour_mirrored,
                CoreInternalModule.type9_military_armour_reactive);
    }
}
