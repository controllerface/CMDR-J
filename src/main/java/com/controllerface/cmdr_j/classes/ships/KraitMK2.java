package com.controllerface.cmdr_j.classes.ships;

import com.controllerface.cmdr_j.classes.BaseShipStats;
import com.controllerface.cmdr_j.classes.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.HardPointLayoutData;
import com.controllerface.cmdr_j.classes.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.HardPointSize;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ModuleSize;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipSize;

public class KraitMK2 extends AbstractShip
{
    public KraitMK2()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Krait Mk II")
                        .setShipSize(ShipSize.Medium)
                        .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                        .setAgility(126)
                        .setHullMass(320)
                        .setHullHardness(55)
                        .setSpeed(150)
                        .setMaxSpeed(174)
                        .setBoostSpeed(330)
                        .setMaxBoostSpeed(383)
                        .setArmorRating(396)
                        .setShield(220)
                        .setBaseCost(58_576_160)
                        .setMassLockFactor(17)
                        .setCrewSeats(3)
                        .setSlfCapable(true)
                        .build(),

                CoreModuleLayoutData.builder()
                        .setPowerPlant(ModuleSize.SIZE_7)
                        .setThrusters(ModuleSize.SIZE_6)
                        .setFrameShiftDrive(ModuleSize.SIZE_5)
                        .setLifeSupport(ModuleSize.SIZE_4)
                        .setPowerDistributor(ModuleSize.SIZE_7)
                        .setSensors(ModuleSize.SIZE_6)
                        .setFuelTank(ModuleSize.SIZE_5)
                        .build(),

                HardPointLayoutData.builder()
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Medium)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Large)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .addHardPoint(HardPointSize.Tiny)
                        .build(),

                OptionalModuleLayoutData.builder()
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_4)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_5)
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_6)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.krait_mkii_armour_grade1,
                CoreInternalModule.krait_mkii_armour_grade2,
                CoreInternalModule.krait_mkii_armour_grade3,
                CoreInternalModule.krait_mkii_armour_mirrored,
                CoreInternalModule.krait_mkii_armour_reactive);
    }
}
