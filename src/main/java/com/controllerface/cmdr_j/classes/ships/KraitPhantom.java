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

public class KraitPhantom extends AbstractShip
{
    public KraitPhantom()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Krait Phantom")
                .setShipSize(ShipSize.Medium)
                .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                .setAgility(126)
                .setHullMass(270)
                .setHullHardness(60)
                .setSpeed(250)
                .setMaxSpeed(290)
                .setBoostSpeed(350)
                .setMaxBoostSpeed(406)
                .setArmorRating(180)
                .setShield(200)
                .setBaseCost(37_472_254)
                .setMassLockFactor(17)
                .setCrewSeats(2)
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
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .addHardPoint(HardPointSize.Tiny)
                .build(),

            OptionalModuleLayoutData.builder()
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_5)
                .addModule(ModuleSize.SIZE_6)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.krait_light_armour_grade1,
            CoreInternalModule.krait_light_armour_grade2,
            CoreInternalModule.krait_light_armour_grade3,
            CoreInternalModule.krait_light_armour_mirrored,
            CoreInternalModule.krait_light_armour_reactive);
    }
}
