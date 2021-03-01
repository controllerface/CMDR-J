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

public class ViperMK3 extends AbstractShip
{
    public ViperMK3()
    {
        super(BaseShipStats.builder()
                .setDisplayName("Viper MkIII")
                .setShipSize(ShipSize.Small)
                .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                .setAgility(140)
                .setHullMass(50)
                .setHullHardness(35)
                .setSpeed(320)
                .setMaxSpeed(512)
                .setBoostSpeed(400)
                .setMaxBoostSpeed(640)
                .setArmorRating(70)
                .setShield(105)
                .setBaseCost(141_930)
                .setMassLockFactor(7)
                .setCrewSeats(1)
                .build(),

            CoreModuleLayoutData.builder()
                .setPowerPlant(ModuleSize.SIZE_3)
                .setThrusters(ModuleSize.SIZE_3)
                .setFrameShiftDrive(ModuleSize.SIZE_3)
                .setLifeSupport(ModuleSize.SIZE_2)
                .setPowerDistributor(ModuleSize.SIZE_3)
                .setSensors(ModuleSize.SIZE_3)
                .setFuelTank(ModuleSize.SIZE_2)
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
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_3)
                .addModule(ModuleSize.SIZE_3_MILITARY)
                .addModule(ModuleSize.SIZE_2)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .addModule(ModuleSize.SIZE_1)
                .build(),

            CoreInternalModule.viper_armour_grade1,
            CoreInternalModule.viper_armour_grade2,
            CoreInternalModule.viper_armour_grade3,
            CoreInternalModule.viper_armour_mirrored,
            CoreInternalModule.viper_armour_reactive);
    }
}
