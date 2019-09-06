package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.modules.core.bulkheads.*;
import com.controllerface.cmdr_j.classes.modules.core.distributor.size1.*;
import com.controllerface.cmdr_j.classes.modules.core.distributor.size2.*;
import com.controllerface.cmdr_j.classes.modules.core.distributor.size3.*;
import com.controllerface.cmdr_j.classes.modules.core.distributor.size4.*;
import com.controllerface.cmdr_j.classes.modules.core.distributor.size5.*;
import com.controllerface.cmdr_j.classes.modules.core.distributor.size6.*;
import com.controllerface.cmdr_j.classes.modules.core.distributor.size7.*;
import com.controllerface.cmdr_j.classes.modules.core.distributor.size8.*;
import com.controllerface.cmdr_j.classes.modules.core.fsd.size2.*;
import com.controllerface.cmdr_j.classes.modules.core.fsd.size3.*;
import com.controllerface.cmdr_j.classes.modules.core.fsd.size4.*;
import com.controllerface.cmdr_j.classes.modules.core.fsd.size5.*;
import com.controllerface.cmdr_j.classes.modules.core.fsd.size6.*;
import com.controllerface.cmdr_j.classes.modules.core.fsd.size7.*;
import com.controllerface.cmdr_j.classes.modules.core.fueltank.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size1.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size2.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size3.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size4.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size5.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size6.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size7.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size8.*;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.size2.*;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.size3.*;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.size4.*;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.size5.*;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.size6.*;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.size7.*;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.size8.*;
import com.controllerface.cmdr_j.classes.modules.core.sensors.size1.*;
import com.controllerface.cmdr_j.classes.modules.core.sensors.size2.*;
import com.controllerface.cmdr_j.classes.modules.core.sensors.size3.*;
import com.controllerface.cmdr_j.classes.modules.core.sensors.size4.*;
import com.controllerface.cmdr_j.classes.modules.core.sensors.size5.*;
import com.controllerface.cmdr_j.classes.modules.core.sensors.size6.*;
import com.controllerface.cmdr_j.classes.modules.core.sensors.size7.*;
import com.controllerface.cmdr_j.classes.modules.core.sensors.size8.*;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.size2.*;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.size3.*;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.size4.*;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.size5.*;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.size6.*;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.size7.*;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.size8.*;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/25/2018.
 */
@SuppressWarnings("unchecked")
public enum CoreInternalModule implements ShipModule
{
    /**
     * Ship Armor
     */

    dolphin_armour_grade1(new LightweightArmour()),
    dolphin_armour_grade2(new ReinforcedArmour()),
    dolphin_armour_grade3(new MilitaryGradeArmour()),
    dolphin_armour_mirrored(new MirroredArmour()),
    dolphin_armour_reactive(new ReactiveArmour()),

    ferdelance_armour_grade1(new LightweightArmour()),
    ferdelance_armour_grade2(new ReinforcedArmour()),
    ferdelance_armour_grade3(new MilitaryGradeArmour()),
    ferdelance_armour_mirrored(new MirroredArmour()),
    ferdelance_armour_reactive(new ReactiveArmour()),

    krait_mkii_armour_grade1(new LightweightArmour()),
    krait_mkii_armour_grade2(new ReinforcedArmour()),
    krait_mkii_armour_grade3(new MilitaryGradeArmour()),
    krait_mkii_armour_reactive(new MirroredArmour()),
    krait_mkii_armour_mirrored(new ReactiveArmour()),

    python_armour_grade1(new LightweightArmour()),
    python_armour_grade2(new ReinforcedArmour()),
    python_armour_grade3(new MilitaryGradeArmour()),
    python_armour_reactive(new MirroredArmour()),
    python_armour_mirrored(new ReactiveArmour()),

    belugaliner_armour_grade3(new MilitaryGradeArmour()),
    belugaliner_armour_grade1(new LightweightArmour()),
    belugaliner_armour_grade2(new ReinforcedArmour()),
    belugaliner_armour_mirrored(new MirroredArmour()),
    belugaliner_armour_reactive(new ReactiveArmour()),

    orca_armour_grade1(new LightweightArmour()),
    orca_armour_grade2(new ReinforcedArmour()),
    orca_armour_grade3(new MilitaryGradeArmour()),
    orca_armour_mirrored(new MirroredArmour()),
    orca_armour_reactive(new ReactiveArmour()),

    asp_scout_armour_grade1(new LightweightArmour()),
    asp_scout_armour_grade2(new ReinforcedArmour()),
    asp_scout_armour_grade3(new MilitaryGradeArmour()),
    asp_scout_armour_mirrored(new MirroredArmour()),
    asp_scout_armour_reactive(new ReactiveArmour()),

    asp_armour_grade1(new LightweightArmour()),
    asp_armour_grade2(new ReinforcedArmour()),
    asp_armour_grade3(new MilitaryGradeArmour()),
    asp_armour_mirrored(new MirroredArmour()),
    asp_armour_reactive(new ReactiveArmour()),

    independant_trader_armour_grade1(new LightweightArmour()),
    independant_trader_armour_grade2(new ReinforcedArmour()),
    independant_trader_armour_grade3(new MilitaryGradeArmour()),
    independant_trader_armour_mirrored(new MirroredArmour()),
    independant_trader_armour_reactive(new ReactiveArmour()),

    vulture_armour_grade1(new LightweightArmour()),
    vulture_armour_grade2(new ReinforcedArmour()),
    vulture_armour_grade3(new MilitaryGradeArmour()),
    vulture_armour_mirrored(new MirroredArmour()),
    vulture_armour_reactive(new ReactiveArmour()),

    viper_armour_grade1(new LightweightArmour()),
    viper_armour_grade2(new ReinforcedArmour()),
    viper_armour_grade3(new MilitaryGradeArmour()),
    viper_armour_mirrored(new MirroredArmour()),
    viper_armour_reactive(new ReactiveArmour()),

    diamondbackxl_armour_grade1(new LightweightArmour()),
    diamondbackxl_armour_grade2(new ReinforcedArmour()),
    diamondbackxl_armour_grade3(new MilitaryGradeArmour()),
    diamondbackxl_armour_mirrored(new MirroredArmour()),
    diamondbackxl_armour_reactive(new ReactiveArmour()),

    adder_armour_grade1(new LightweightArmour()),
    adder_armour_grade2(new ReinforcedArmour()),
    adder_armour_grade3(new MilitaryGradeArmour()),
    adder_armour_mirrored(new MirroredArmour()),
    adder_armour_reactive(new ReactiveArmour()),

    diamondback_armour_grade1(new LightweightArmour()),
    diamondback_armour_grade2(new ReinforcedArmour()),
    diamondback_armour_grade3(new MilitaryGradeArmour()),
    diamondback_armour_mirrored(new MirroredArmour()),
    diamondback_armour_reactive(new ReactiveArmour()),

    viper_mkiv_armour_grade1(new LightweightArmour()),
    viper_mkiv_armour_grade2(new ReinforcedArmour()),
    viper_mkiv_armour_grade3(new MilitaryGradeArmour()),
    viper_mkiv_armour_mirrored(new MirroredArmour()),
    viper_mkiv_armour_reactive(new ReactiveArmour()),

    anaconda_armour_grade1(new LightweightArmour()),
    anaconda_armour_grade2(new ReinforcedArmour()),
    anaconda_armour_grade3(new MilitaryGradeArmour()),
    anaconda_armour_mirrored(new MirroredArmour()),
    anaconda_armour_reactive(new ReactiveArmour()),

    cobramkiii_armour_grade1(new LightweightArmour()),
    cobramkiii_armour_grade2(new ReinforcedArmour()),
    cobramkiii_armour_grade3(new MilitaryGradeArmour()),
    cobramkiii_armour_mirrored(new MirroredArmour()),
    cobramkiii_armour_reactive(new ReactiveArmour()),

    type9_armour_grade1(new LightweightArmour()),
    type9_armour_grade2(new ReinforcedArmour()),
    type9_armour_grade3(new MilitaryGradeArmour()),
    type9_armour_mirrored(new MirroredArmour()),
    type9_armour_reactive(new ReactiveArmour()),

    type7_armour_grade1(new LightweightArmour()),
    type7_armour_grade2(new ReinforcedArmour()),
    type7_armour_grade3(new MilitaryGradeArmour()),
    type7_armour_mirrored(new MirroredArmour()),
    type7_armour_reactive(new ReactiveArmour()),

    cobramkiv_armour_grade1(new LightweightArmour()),
    cobramkiv_armour_grade2(new ReinforcedArmour()),
    cobramkiv_armour_grade3(new MilitaryGradeArmour()),
    cobramkiv_armour_mirrored(new MirroredArmour()),
    cobramkiv_armour_reactive(new ReactiveArmour()),

    eagle_armour_grade1(new LightweightArmour()),
    eagle_armour_grade2(new ReinforcedArmour()),
    eagle_armour_grade3(new MilitaryGradeArmour()),
    eagle_armour_mirrored(new MirroredArmour()),
    eagle_armour_reactive(new ReactiveArmour()),

    hauler_armour_grade1(new LightweightArmour()),
    hauler_armour_grade2(new ReinforcedArmour()),
    hauler_armour_grade3(new MilitaryGradeArmour()),
    hauler_armour_mirrored(new MirroredArmour()),
    hauler_armour_reactive(new ReactiveArmour()),

    sidewinder_armour_grade1(new LightweightArmour()),
    sidewinder_armour_grade2(new ReinforcedArmour()),
    sidewinder_armour_grade3(new MilitaryGradeArmour()),
    sidewinder_armour_mirrored(new MirroredArmour()),
    sidewinder_armour_reactive(new ReactiveArmour()),

    type6_armour_grade1(new LightweightArmour()),
    type6_armour_grade2(new ReinforcedArmour()),
    type6_armour_grade3(new MilitaryGradeArmour()),
    type6_armour_mirrored(new MirroredArmour()),
    type6_armour_reactive(new ReactiveArmour()),

    empire_trader_armour_grade1(new LightweightArmour()),
    empire_trader_armour_grade2(new ReinforcedArmour()),
    empire_trader_armour_grade3(new MilitaryGradeArmour()),
    empire_trader_armour_mirrored(new MirroredArmour()),
    empire_trader_armour_reactive(new ReactiveArmour()),

    federation_dropship_armour_grade1(new LightweightArmour()),
    federation_dropship_armour_grade2(new ReinforcedArmour()),
    federation_dropship_armour_grade3(new MilitaryGradeArmour()),
    federation_dropship_armour_mirrored(new MirroredArmour()),
    federation_dropship_armour_reactive(new ReactiveArmour()),

    cutter_armour_grade1(new LightweightArmour()),
    cutter_armour_grade2(new ReinforcedArmour()),
    cutter_armour_grade3(new MilitaryGradeArmour()),
    cutter_armour_mirrored(new MirroredArmour()),
    cutter_armour_reactive(new ReactiveArmour()),

    empire_eagle_armour_grade1(new LightweightArmour()),
    empire_eagle_armour_grade2(new ReinforcedArmour()),
    empire_eagle_armour_grade3(new MilitaryGradeArmour()),
    empire_eagle_armour_mirrored(new MirroredArmour()),
    empire_eagle_armour_reactive(new ReactiveArmour()),

    typex_armour_grade1(new LightweightArmour()),
    typex_armour_grade2(new ReinforcedArmour()),
    typex_armour_grade3(new MilitaryGradeArmour()),
    typex_armour_mirrored(new MirroredArmour()),
    typex_armour_reactive(new ReactiveArmour()),

    typex_3_armour_grade1(new LightweightArmour()),
    typex_3_armour_grade2(new ReinforcedArmour()),
    typex_3_armour_grade3(new MilitaryGradeArmour()),
    typex_3_armour_mirrored(new MirroredArmour()),
    typex_3_armour_reactive(new ReactiveArmour()),

    federation_corvette_armour_grade1(new LightweightArmour()),
    federation_corvette_armour_grade2(new ReinforcedArmour()),
    federation_corvette_armour_grade3(new MilitaryGradeArmour()),
    federation_corvette_armour_mirrored(new MirroredArmour()),
    federation_corvette_armour_reactive(new ReactiveArmour()),

    empire_courier_armour_grade1(new LightweightArmour()),
    empire_courier_armour_grade2(new ReinforcedArmour()),
    empire_courier_armour_grade3(new MilitaryGradeArmour()),
    empire_courier_armour_mirrored(new MirroredArmour()),
    empire_courier_armour_reactive(new ReactiveArmour()),

    federation_gunship_armour_grade1(new LightweightArmour()),
    federation_gunship_armour_grade2(new ReinforcedArmour()),
    federation_gunship_armour_grade3(new MilitaryGradeArmour()),
    federation_gunship_armour_mirrored(new MirroredArmour()),
    federation_gunship_armour_reactive(new ReactiveArmour()),

    type9_military_armour_grade1(new LightweightArmour()),
    type9_military_armour_grade2(new ReinforcedArmour()),
    type9_military_armour_grade3(new MilitaryGradeArmour()),
    type9_military_armour_mirrored(new MirroredArmour()),
    type9_military_armour_reactive(new ReactiveArmour()),

    federation_dropship_mkii_armour_grade1(new LightweightArmour()),
    federation_dropship_mkii_armour_grade2(new ReinforcedArmour()),
    federation_dropship_mkii_armour_grade3(new MilitaryGradeArmour()),
    federation_dropship_mkii_armour_mirrored(new MirroredArmour()),
    federation_dropship_mkii_armour_reactive(new ReactiveArmour()),


    /**
     * PowerPlant
     */

    int_powerplant_size2_class1(new PowerPlant_2E()),
    int_powerplant_size2_class2(new PowerPlant_2D()),
    int_powerplant_size2_class3(new PowerPlant_2C()),
    int_powerplant_size2_class4(new PowerPlant_2B()),
    int_powerplant_size2_class5(new PowerPlant_2A()),
    int_guardianpowerplant_size2(new GuardianHybridPowerPlant_2A()),

    int_powerplant_size3_class1(new PowerPlant_3E()),
    int_powerplant_size3_class2(new PowerPlant_3D()),
    int_powerplant_size3_class3(new PowerPlant_3C()),
    int_powerplant_size3_class4(new PowerPlant_3B()),
    int_powerplant_size3_class5(new PowerPlant_3A()),
    int_guardianpowerplant_size3(new GuardianHybridPowerPlant_3A()),

    int_powerplant_size4_class1(new PowerPlant_4E()),
    int_powerplant_size4_class2(new PowerPlant_4D()),
    int_powerplant_size4_class3(new PowerPlant_4C()),
    int_powerplant_size4_class4(new PowerPlant_4B()),
    int_powerplant_size4_class5(new PowerPlant_4A()),
    int_guardianpowerplant_size4(new GuardianHybridPowerPlant_4A()),

    int_powerplant_size5_class1(new PowerPlant_5E()),
    int_powerplant_size5_class2(new PowerPlant_5D()),
    int_powerplant_size5_class3(new PowerPlant_5C()),
    int_powerplant_size5_class4(new PowerPlant_5B()),
    int_powerplant_size5_class5(new PowerPlant_5A()),
    int_guardianpowerplant_size5(new GuardianHybridPowerPlant_5A()),

    int_powerplant_size6_class1(new PowerPlant_6E()),
    int_powerplant_size6_class2(new PowerPlant_6D()),
    int_powerplant_size6_class3(new PowerPlant_6C()),
    int_powerplant_size6_class4(new PowerPlant_6B()),
    int_powerplant_size6_class5(new PowerPlant_6A()),
    int_guardianpowerplant_size6(new GuardianHybridPowerPlant_6A()),

    int_powerplant_size7_class1(new PowerPlant_7E()),
    int_powerplant_size7_class2(new PowerPlant_7D()),
    int_powerplant_size7_class3(new PowerPlant_7C()),
    int_powerplant_size7_class4(new PowerPlant_7B()),
    int_powerplant_size7_class5(new PowerPlant_7A()),
    int_guardianpowerplant_size7(new GuardianHybridPowerPlant_7A()),

    int_powerplant_size8_class1(new PowerPlant_8E()),
    int_powerplant_size8_class2(new PowerPlant_8D()),
    int_powerplant_size8_class3(new PowerPlant_8C()),
    int_powerplant_size8_class4(new PowerPlant_8B()),
    int_powerplant_size8_class5(new PowerPlant_8A()),
    int_guardianpowerplant_size8(new GuardianHybridPowerPlant_8A()),


    /**
     * Thrusters
     */

    int_engine_size2_class1(new Thrusters_2E()),
    int_engine_size2_class2(new Thrusters_2D()),
    int_engine_size2_class3(new Thrusters_2C()),
    int_engine_size2_class4(new Thrusters_2B()),
    int_engine_size2_class5(new Thrusters_2A()),
    int_engine_size2_class5_fast(new EnhancedPerformanceThrusters_2A()),

    int_engine_size3_class1(new Thrusters_3E()),
    int_engine_size3_class2(new Thrusters_3D()),
    int_engine_size3_class3(new Thrusters_3C()),
    int_engine_size3_class4(new Thrusters_3B()),
    int_engine_size3_class5(new Thrusters_3A()),
    int_engine_size3_class5_fast(new EnhancedPerformanceThrusters_3A()),

    int_engine_size4_class1(new Thrusters_4E()),
    int_engine_size4_class2(new Thrusters_4D()),
    int_engine_size4_class3(new Thrusters_4C()),
    int_engine_size4_class4(new Thrusters_4B()),
    int_engine_size4_class5(new Thrusters_4A()),

    int_engine_size5_class1(new Thrusters_5E()),
    int_engine_size5_class2(new Thrusters_5D()),
    int_engine_size5_class3(new Thrusters_5C()),
    int_engine_size5_class4(new Thrusters_5B()),
    int_engine_size5_class5(new Thrusters_5A()),

    int_engine_size6_class1(new Thrusters_6E()),
    int_engine_size6_class2(new Thrusters_6D()),
    int_engine_size6_class3(new Thrusters_6C()),
    int_engine_size6_class4(new Thrusters_6B()),
    int_engine_size6_class5(new Thrusters_6A()),

    int_engine_size7_class1(new Thrusters_7E()),
    int_engine_size7_class2(new Thrusters_7D()),
    int_engine_size7_class3(new Thrusters_7C()),
    int_engine_size7_class4(new Thrusters_7B()),
    int_engine_size7_class5(new Thrusters_7A()),

    int_engine_size8_class1(new Thrusters_8E()),
    int_engine_size8_class2(new Thrusters_8D()),
    int_engine_size8_class3(new Thrusters_8C()),
    int_engine_size8_class4(new Thrusters_8B()),
    int_engine_size8_class5(new Thrusters_8A()),


    /**
     * Frame Shift Drive
     */
    int_hyperdrive_size2_class1(new FrameShiftDrive_2E()),
    int_hyperdrive_size2_class2(new FrameShiftDrive_2D()),
    int_hyperdrive_size2_class3(new FrameShiftDrive_2C()),
    int_hyperdrive_size2_class4(new FrameShiftDrive_2B()),
    int_hyperdrive_size2_class5(new FrameShiftDrive_2A()),

    int_hyperdrive_size3_class1(new FrameShiftDrive_3E()),
    int_hyperdrive_size3_class2(new FrameShiftDrive_3D()),
    int_hyperdrive_size3_class3(new FrameShiftDrive_3C()),
    int_hyperdrive_size3_class4(new FrameShiftDrive_3B()),
    int_hyperdrive_size3_class5(new FrameShiftDrive_3A()),

    int_hyperdrive_size4_class1(new FrameShiftDrive_4E()),
    int_hyperdrive_size4_class2(new FrameShiftDrive_4D()),
    int_hyperdrive_size4_class3(new FrameShiftDrive_4C()),
    int_hyperdrive_size4_class4(new FrameShiftDrive_4B()),
    int_hyperdrive_size4_class5(new FrameShiftDrive_4A()),

    int_hyperdrive_size5_class1(new FrameShiftDrive_5E()),
    int_hyperdrive_size5_class2(new FrameShiftDrive_5D()),
    int_hyperdrive_size5_class3(new FrameShiftDrive_5C()),
    int_hyperdrive_size5_class4(new FrameShiftDrive_5B()),
    int_hyperdrive_size5_class5(new FrameShiftDrive_5A()),

    int_hyperdrive_size6_class1(new FrameShiftDrive_6E()),
    int_hyperdrive_size6_class2(new FrameShiftDrive_6D()),
    int_hyperdrive_size6_class3(new FrameShiftDrive_6C()),
    int_hyperdrive_size6_class4(new FrameShiftDrive_6B()),
    int_hyperdrive_size6_class5(new FrameShiftDrive_6A()),

    int_hyperdrive_size7_class1(new FrameShiftDrive_7E()),
    int_hyperdrive_size7_class2(new FrameShiftDrive_7D()),
    int_hyperdrive_size7_class3(new FrameShiftDrive_7C()),
    int_hyperdrive_size7_class4(new FrameShiftDrive_7B()),
    int_hyperdrive_size7_class5(new FrameShiftDrive_7A()),


    /**
     * Life Support
     */

    int_lifesupport_size1_class1(new LifeSupport_1E()),
    int_lifesupport_size1_class2(new LifeSupport_1D()),
    int_lifesupport_size1_class3(new LifeSupport_1C()),
    int_lifesupport_size1_class4(new LifeSupport_1B()),
    int_lifesupport_size1_class5(new LifeSupport_1A()),

    int_lifesupport_size2_class1(new LifeSupport_2E()),
    int_lifesupport_size2_class2(new LifeSupport_2D()),
    int_lifesupport_size2_class3(new LifeSupport_2C()),
    int_lifesupport_size2_class4(new LifeSupport_2B()),
    int_lifesupport_size2_class5(new LifeSupport_2A()),

    int_lifesupport_size3_class1(new LifeSupport_3E()),
    int_lifesupport_size3_class2(new LifeSupport_3D()),
    int_lifesupport_size3_class3(new LifeSupport_3C()),
    int_lifesupport_size3_class4(new LifeSupport_3B()),
    int_lifesupport_size3_class5(new LifeSupport_3A()),

    int_lifesupport_size4_class1(new LifeSupport_4E()),
    int_lifesupport_size4_class2(new LifeSupport_4D()),
    int_lifesupport_size4_class3(new LifeSupport_4C()),
    int_lifesupport_size4_class4(new LifeSupport_4B()),
    int_lifesupport_size4_class5(new LifeSupport_4A()),

    int_lifesupport_size5_class1(new LifeSupport_5E()),
    int_lifesupport_size5_class2(new LifeSupport_5D()),
    int_lifesupport_size5_class3(new LifeSupport_5C()),
    int_lifesupport_size5_class4(new LifeSupport_5B()),
    int_lifesupport_size5_class5(new LifeSupport_5A()),

    int_lifesupport_size6_class1(new LifeSupport_6E()),
    int_lifesupport_size6_class2(new LifeSupport_6D()),
    int_lifesupport_size6_class3(new LifeSupport_6C()),
    int_lifesupport_size6_class4(new LifeSupport_6B()),
    int_lifesupport_size6_class5(new LifeSupport_6A()),

    int_lifesupport_size7_class1(new LifeSupport_7E()),
    int_lifesupport_size7_class2(new LifeSupport_7D()),
    int_lifesupport_size7_class3(new LifeSupport_7C()),
    int_lifesupport_size7_class4(new LifeSupport_7B()),
    int_lifesupport_size7_class5(new LifeSupport_7A()),

    int_lifesupport_size8_class1(new LifeSupport_8E()),
    int_lifesupport_size8_class2(new LifeSupport_8D()),
    int_lifesupport_size8_class3(new LifeSupport_8C()),
    int_lifesupport_size8_class4(new LifeSupport_8B()),
    int_lifesupport_size8_class5(new LifeSupport_8A()),


    /**
     * Power Distributor
     */

    int_powerdistributor_size1_class1(new PowerDistributor_1E()),
    int_powerdistributor_size1_class2(new PowerDistributor_1D()),
    int_powerdistributor_size1_class3(new PowerDistributor_1C()),
    int_powerdistributor_size1_class4(new PowerDistributor_1B()),
    int_powerdistributor_size1_class5(new PowerDistributor_1A()),

    int_powerdistributor_size2_class1(new PowerDistributor_2E()),
    int_powerdistributor_size2_class2(new PowerDistributor_2D()),
    int_powerdistributor_size2_class3(new PowerDistributor_2C()),
    int_powerdistributor_size2_class4(new PowerDistributor_2B()),
    int_powerdistributor_size2_class5(new PowerDistributor_2A()),

    int_powerdistributor_size3_class1(new PowerDistributor_3E()),
    int_powerdistributor_size3_class2(new PowerDistributor_3D()),
    int_powerdistributor_size3_class3(new PowerDistributor_3C()),
    int_powerdistributor_size3_class4(new PowerDistributor_3B()),
    int_powerdistributor_size3_class5(new PowerDistributor_3A()),

    int_powerdistributor_size4_class1(new PowerDistributor_4E()),
    int_powerdistributor_size4_class2(new PowerDistributor_4D()),
    int_powerdistributor_size4_class3(new PowerDistributor_4C()),
    int_powerdistributor_size4_class4(new PowerDistributor_4B()),
    int_powerdistributor_size4_class5(new PowerDistributor_4A()),

    int_powerdistributor_size5_class1(new PowerDistributor_5E()),
    int_powerdistributor_size5_class2(new PowerDistributor_5D()),
    int_powerdistributor_size5_class3(new PowerDistributor_5C()),
    int_powerdistributor_size5_class4(new PowerDistributor_5B()),
    int_powerdistributor_size5_class5(new PowerDistributor_5A()),

    int_powerdistributor_size6_class1(new PowerDistributor_6E()),
    int_powerdistributor_size6_class2(new PowerDistributor_6D()),
    int_powerdistributor_size6_class3(new PowerDistributor_6C()),
    int_powerdistributor_size6_class4(new PowerDistributor_6B()),
    int_powerdistributor_size6_class5(new PowerDistributor_6A()),

    int_powerdistributor_size7_class1(new PowerDistributor_7E()),
    int_powerdistributor_size7_class2(new PowerDistributor_7D()),
    int_powerdistributor_size7_class3(new PowerDistributor_7C()),
    int_powerdistributor_size7_class4(new PowerDistributor_7B()),
    int_powerdistributor_size7_class5(new PowerDistributor_7A()),

    int_powerdistributor_size8_class1(new PowerDistributor_8E()),
    int_powerdistributor_size8_class2(new PowerDistributor_8D()),
    int_powerdistributor_size8_class3(new PowerDistributor_8C()),
    int_powerdistributor_size8_class4(new PowerDistributor_8B()),
    int_powerdistributor_size8_class5(new PowerDistributor_8A()),


    /**
     * Sensors
     */

    int_sensors_size1_class1(new Sensors_1E()),
    int_sensors_size1_class2(new Sensors_1D()),
    int_sensors_size1_class3(new Sensors_1C()),
    int_sensors_size1_class4(new Sensors_1B()),
    int_sensors_size1_class5(new Sensors_1A()),

    int_sensors_size2_class1(new Sensors_2E()),
    int_sensors_size2_class2(new Sensors_2D()),
    int_sensors_size2_class3(new Sensors_2C()),
    int_sensors_size2_class4(new Sensors_2B()),
    int_sensors_size2_class5(new Sensors_2A()),

    int_sensors_size3_class1(new Sensors_3E()),
    int_sensors_size3_class2(new Sensors_3D()),
    int_sensors_size3_class3(new Sensors_3C()),
    int_sensors_size3_class4(new Sensors_3B()),
    int_sensors_size3_class5(new Sensors_3A()),

    int_sensors_size4_class1(new Sensors_4E()),
    int_sensors_size4_class2(new Sensors_4D()),
    int_sensors_size4_class3(new Sensors_4C()),
    int_sensors_size4_class4(new Sensors_4B()),
    int_sensors_size4_class5(new Sensors_4A()),

    int_sensors_size5_class1(new Sensors_5E()),
    int_sensors_size5_class2(new Sensors_5D()),
    int_sensors_size5_class3(new Sensors_5C()),
    int_sensors_size5_class4(new Sensors_5B()),
    int_sensors_size5_class5(new Sensors_5A()),

    int_sensors_size6_class1(new Sensors_6E()),
    int_sensors_size6_class2(new Sensors_6D()),
    int_sensors_size6_class3(new Sensors_6C()),
    int_sensors_size6_class4(new Sensors_6B()),
    int_sensors_size6_class5(new Sensors_6A()),

    int_sensors_size7_class1(new Sensors_7E()),
    int_sensors_size7_class2(new Sensors_7D()),
    int_sensors_size7_class3(new Sensors_7C()),
    int_sensors_size7_class4(new Sensors_7B()),
    int_sensors_size7_class5(new Sensors_7A()),

    int_sensors_size8_class1(new Sensors_8E()),
    int_sensors_size8_class2(new Sensors_8D()),
    int_sensors_size8_class3(new Sensors_8C()),
    int_sensors_size8_class4(new Sensors_8B()),
    int_sensors_size8_class5(new Sensors_8A()),


    /**
     * Fuel Tank
     */

    int_fueltank_size1_class3(new FuelTank_1C()),

    int_fueltank_size2_class3(new FuelTank_2C()),

    int_fueltank_size3_class3(new FuelTank_3C()),

    int_fueltank_size4_class3(new FuelTank_4C()),

    int_fueltank_size5_class3(new FuelTank_5C()),

    int_fueltank_size6_class3(new FuelTank_6C()),

    int_fueltank_size7_class3(new FuelTank_7C()),

    int_fueltank_size8_class3(new FuelTank_8C()),

    ;

    private final ShipModule delegate;

    CoreInternalModule(ShipModule delegate)
    {
        this.delegate = delegate;
    }

    public ProcurementType modificationType()
    {
        return delegate.modificationType();
    }

    public ProcurementType experimentalType()
    {
        return delegate.experimentalType();
    }

    @Override
    public ItemEffects itemEffects()
    {
        return delegate.itemEffects();
    }

    @Override
    public String displayText()
    {
        return delegate.displayText();
    }

    public static ShipModule findModule(String moduleName) throws Exception
    {
        final Exception exception;
        try
        {
            return valueOf(moduleName);
        }
        catch (Exception e)
        {
            exception = e;
            if (moduleName == null || moduleName.isEmpty()) throw e;
        }

        return Arrays.stream(CoreInternalModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(()->exception);
    }
}
