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

public class ViperMK4 extends AbstractShip
{
    public ViperMK4()
    {
        super(BaseShipStats.builder()
                        .setDisplayName("Viper MkIV")
                        .setShipSize(ShipSize.Small)
                        .setManufacturer(ShipManufacturer.Faulcon_DeLacy)
                        .setAgility(132)
                        .setHullMass(190)
                        .setHullHardness(35)
                        .setSpeed(270)
                        .setMaxSpeed(313)
                        .setBoostSpeed(340)
                        .setMaxBoostSpeed(394)
                        .setArmorRating(150)
                        .setShield(150)
                        .setBaseCost(437_930)
                        .setMassLockFactor(7)
                        .setCrewSeats(1)
                        .build(),

                CoreModuleLayoutData.builder()
                        .setPowerPlant(ModuleSize.SIZE_4)
                        .setThrusters(ModuleSize.SIZE_4)
                        .setFrameShiftDrive(ModuleSize.SIZE_4)
                        .setLifeSupport(ModuleSize.SIZE_2)
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
                        .addModule(ModuleSize.SIZE_3)
                        .addModule(ModuleSize.SIZE_3_MILITARY)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_2)
                        .addModule(ModuleSize.SIZE_1)
                        .addModule(ModuleSize.SIZE_1)
                        .addModule(ModuleSize.SIZE_1)
                        .build(),

                CoreInternalModule.viper_mkiv_armour_grade1,
                CoreInternalModule.viper_mkiv_armour_grade2,
                CoreInternalModule.viper_mkiv_armour_grade3,
                CoreInternalModule.viper_mkiv_armour_mirrored,
                CoreInternalModule.viper_mkiv_armour_reactive);
    }
}
