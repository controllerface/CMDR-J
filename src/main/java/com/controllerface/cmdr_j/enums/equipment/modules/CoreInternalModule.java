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
import com.controllerface.cmdr_j.classes.modules.core.planetarysuite.size1.PlanetarySuite_1I;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.enums.equipment.ships.Ship;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Controllerface on 4/25/2018.
 */
public enum CoreInternalModule implements ShipModule
{
    /**
     * Ship Armor
     */

    dolphin_armour_grade1(new LightweightArmour("Dolphin",0)),
    dolphin_armour_grade2(new ReinforcedArmour("Dolphin",534_940)),
    dolphin_armour_grade3(new MilitaryGradeArmour("Dolphin",1_203_600)),
    dolphin_armour_mirrored(new MirroredArmour("Dolphin",2_808_390)),
    dolphin_armour_reactive(new ReactiveArmour("Dolphin",3_152_080)),

    ferdelance_armour_grade1(new LightweightArmour("Fer-de-Lance",0)),
    ferdelance_armour_grade2(new ReinforcedArmour("Fer-de-Lance",20_626_820)),
    ferdelance_armour_grade3(new MilitaryGradeArmour("Fer-de-Lance",46_410_340)),
    ferdelance_armour_mirrored(new MirroredArmour("Fer-de-Lance",109_683_090)),
    ferdelance_armour_reactive(new ReactiveArmour("Fer-de-Lance",121_543_510)),

    mamba_armour_grade1(new LightweightArmour("Mamba",0)),
    mamba_armour_grade2(new ReinforcedArmour("Mamba",20_626_820)),
    mamba_armour_grade3(new MilitaryGradeArmour("Mamba",46_410_340)),
    mamba_armour_mirrored(new MirroredArmour("Mamba",109_683_090)),
    mamba_armour_reactive(new ReactiveArmour("Mamba",121_543_510)),

    krait_mkii_armour_grade1(new LightweightArmour("Krait Mk II",0)),
    krait_mkii_armour_grade2(new ReinforcedArmour("Krait Mk II",22_791_270)),
    krait_mkii_armour_grade3(new MilitaryGradeArmour("Krait Mk II",51_280_360)),
    krait_mkii_armour_mirrored(new MirroredArmour("Krait Mk II",121_192_590)),
    krait_mkii_armour_reactive(new ReactiveArmour("Krait Mk II",134_297_570)),

    krait_light_armour_grade1(new LightweightArmour("Krait Phantom",0)),
    krait_light_armour_grade2(new ReinforcedArmour("Krait Phantom",22_791_270 )),
    krait_light_armour_grade3(new MilitaryGradeArmour("Krait Phantom",51_280_360 )),
    krait_light_armour_mirrored(new MirroredArmour("Krait Phantom",121_192_590 )),
    krait_light_armour_reactive(new ReactiveArmour("Krait Phantom",134_297_570 )),

    python_armour_grade1(new LightweightArmour("Python",0)),
    python_armour_grade2(new ReinforcedArmour("Python",22_791_270)),
    python_armour_grade3(new MilitaryGradeArmour("Python",51_280_360)),
    python_armour_mirrored(new MirroredArmour("Python",121_192_590)),
    python_armour_reactive(new ReactiveArmour("Python",134_297_570)),

    belugaliner_armour_grade1(new LightweightArmour("Beluga",0)),
    belugaliner_armour_grade2(new ReinforcedArmour("Beluga",33_813_120)),
    belugaliner_armour_grade3(new MilitaryGradeArmour("Beluga",76_079_500)),
    belugaliner_armour_mirrored(new MirroredArmour("Beluga",179_801_200)),
    belugaliner_armour_reactive(new ReactiveArmour("Beluga",199_243_730)),

    orca_armour_grade1(new LightweightArmour("Orca",0)),
    orca_armour_grade2(new ReinforcedArmour("Orca",19_415_950)),
    orca_armour_grade3(new MilitaryGradeArmour("Orca",43_685_900)),
    orca_armour_mirrored(new MirroredArmour("Orca",103_244_340)),
    orca_armour_reactive(new ReactiveArmour("Orca",114_408_510)),

    asp_scout_armour_grade1(new LightweightArmour("Asp Scout",0)),
    asp_scout_armour_grade2(new ReinforcedArmour("Asp Scout",1_584_460)),
    asp_scout_armour_grade3(new MilitaryGradeArmour("Asp Scout",3_565_040)),
    asp_scout_armour_mirrored(new MirroredArmour("Asp Scout",8_425_380)),
    asp_scout_armour_reactive(new ReactiveArmour("Asp Scout",9_336_440)),

    asp_armour_grade1(new LightweightArmour("Asp Explorer",0)),
    asp_armour_grade2(new ReinforcedArmour("Asp Explorer",2_664_460)),
    asp_armour_grade3(new MilitaryGradeArmour("Asp Explorer",5_995_040)),
    asp_armour_mirrored(new MirroredArmour("Asp Explorer",14_168_270)),
    asp_armour_reactive(new ReactiveArmour("Asp Explorer",15_700_340)),

    independant_trader_armour_grade1(new LightweightArmour("Keelback",0)),
    independant_trader_armour_grade2(new ReinforcedArmour("Keelback",1_250_460)),
    independant_trader_armour_grade3(new MilitaryGradeArmour("Keelback",2_813_540)),
    independant_trader_armour_mirrored(new MirroredArmour("Keelback",6_649_330)),
    independant_trader_armour_reactive(new ReactiveArmour("Keelback",7_368_340)),

    vulture_armour_grade1(new LightweightArmour("Vulture",0)),
    vulture_armour_grade2(new ReinforcedArmour("Vulture",1_970_250)),
    vulture_armour_grade3(new MilitaryGradeArmour("Vulture",4_433_050)),
    vulture_armour_mirrored(new MirroredArmour("Vulture",10_476_780)),
    vulture_armour_reactive(new ReactiveArmour("Vulture",11_609_670)),

    viper_armour_grade1(new LightweightArmour("Viper MkIII",0)),
    viper_armour_grade2(new ReinforcedArmour("Viper MkIII",57_170)),
    viper_armour_grade3(new MilitaryGradeArmour("Viper MkIII",128_640)),
    viper_armour_mirrored(new MirroredArmour("Viper MkIII",304_010)),
    viper_armour_reactive(new ReactiveArmour("Viper MkIII",336_890)),

    diamondbackxl_armour_grade1(new LightweightArmour("Diamondback Explorer",0)),
    diamondbackxl_armour_grade2(new ReinforcedArmour("Diamondback Explorer",800_000)),
    diamondbackxl_armour_grade3(new MilitaryGradeArmour("Diamondback Explorer",1_800_000)),
    diamondbackxl_armour_mirrored(new MirroredArmour("Diamondback Explorer",4_200_000)),
    diamondbackxl_armour_reactive(new ReactiveArmour("Diamondback Explorer",4_714_000)),

    adder_armour_grade1(new LightweightArmour("Adder",0)),
    adder_armour_grade2(new ReinforcedArmour("Adder",35_120)),
    adder_armour_grade3(new MilitaryGradeArmour("Adder",79_030)),
    adder_armour_mirrored(new MirroredArmour("Adder",186_770)),
    adder_armour_reactive(new ReactiveArmour("Adder",206_960)),

    diamondback_armour_grade1(new LightweightArmour("Diamondback Scout",0)),
    diamondback_armour_grade2(new ReinforcedArmour("Diamondback Scout",225_700)),
    diamondback_armour_grade3(new MilitaryGradeArmour("Diamondback Scout",507_900)),
    diamondback_armour_mirrored(new MirroredArmour("Diamondback Scout",1_185_100)),
    diamondback_armour_reactive(new ReactiveArmour("Diamondback Scout",1_330_100)),

    viper_mkiv_armour_grade1(new LightweightArmour("Viper MkIV",0)),
    viper_mkiv_armour_grade2(new ReinforcedArmour("Viper MkIV",175_180)),
    viper_mkiv_armour_grade3(new MilitaryGradeArmour("Viper MkIV",394_140)),
    viper_mkiv_armour_mirrored(new MirroredArmour("Viper MkIV",931_490)),
    viper_mkiv_armour_reactive(new ReactiveArmour("Viper MkIV",1_033_210)),

    anaconda_armour_grade1(new LightweightArmour("Anaconda",0)),
    anaconda_armour_grade2(new ReinforcedArmour("Anaconda",58_787_780)),
    anaconda_armour_grade3(new MilitaryGradeArmour("Anaconda",132_272_510)),
    anaconda_armour_mirrored(new MirroredArmour("Anaconda",312_604_020)),
    anaconda_armour_reactive(new ReactiveArmour("Anaconda",346_407_000)),

    cobramkiii_armour_grade1(new LightweightArmour("Cobra MkIII",0)),
    cobramkiii_armour_grade2(new ReinforcedArmour("Cobra MkIII",151_890)),
    cobramkiii_armour_grade3(new MilitaryGradeArmour("Cobra MkIII",341_750)),
    cobramkiii_armour_mirrored(new MirroredArmour("Cobra MkIII",797_410)),
    cobramkiii_armour_reactive(new ReactiveArmour("Cobra MkIII",895_000)),

    type9_armour_grade1(new LightweightArmour("Type-9 Heavy",0)),
    type9_armour_grade2(new ReinforcedArmour("Type-9 Heavy",30_622_340)),
    type9_armour_grade3(new MilitaryGradeArmour("Type-9 Heavy",68_900_260)),
    type9_armour_mirrored(new MirroredArmour("Type-9 Heavy",162_834_280)),
    type9_armour_reactive(new ReactiveArmour("Type-9 Heavy",180_442_120)),

    type7_armour_grade1(new LightweightArmour("Type-7 Transporter",0)),
    type7_armour_grade2(new ReinforcedArmour("Type-7 Transporter",6_988_900)),
    type7_armour_grade3(new MilitaryGradeArmour("Type-7 Transporter",15_725_030)),
    type7_armour_mirrored(new MirroredArmour("Type-7 Transporter",37_163_480)),
    type7_armour_reactive(new ReactiveArmour("Type-7 Transporter",41_182_100)),

    cobramkiv_armour_grade1(new LightweightArmour("Cobra MkIV",0)),
    cobramkiv_armour_grade2(new ReinforcedArmour("Cobra MkIV",305_890)),
    cobramkiv_armour_grade3(new MilitaryGradeArmour("Cobra MkIV",688_250)),
    cobramkiv_armour_mirrored(new MirroredArmour("Cobra MkIV",1_605_910)),
    cobramkiv_armour_reactive(new ReactiveArmour("Cobra MkIV",1_802_440)),

    eagle_armour_grade1(new LightweightArmour("Eagle",0)),
    eagle_armour_grade2(new ReinforcedArmour("Eagle",26_880)),
    eagle_armour_grade3(new MilitaryGradeArmour("Eagle",90_050)),
    eagle_armour_mirrored(new MirroredArmour("Eagle",140_090)),
    eagle_armour_reactive(new ReactiveArmour("Eagle",150_390)),

    hauler_armour_grade1(new LightweightArmour("Hauler",0)),
    hauler_armour_grade2(new ReinforcedArmour("Hauler",42_180)),
    hauler_armour_grade3(new MilitaryGradeArmour("Hauler",185_050)),
    hauler_armour_mirrored(new MirroredArmour("Hauler",270_300)),
    hauler_armour_reactive(new ReactiveArmour("Hauler",282_420)),

    sidewinder_armour_grade1(new LightweightArmour("Sidewinder",0)),
    sidewinder_armour_grade2(new ReinforcedArmour("Sidewinder",25_600)),
    sidewinder_armour_grade3(new MilitaryGradeArmour("Sidewinder",80_320)),
    sidewinder_armour_mirrored(new MirroredArmour("Sidewinder",132_060)),
    sidewinder_armour_reactive(new ReactiveArmour("Sidewinder",139_420)),

    type6_armour_grade1(new LightweightArmour("Type-6 Transporter",0)),
    type6_armour_grade2(new ReinforcedArmour("Type-6 Transporter",418_380)),
    type6_armour_grade3(new MilitaryGradeArmour("Type-6 Transporter",941_350)),
    type6_armour_mirrored(new MirroredArmour("Type-6 Transporter",2_224_730)),
    type6_armour_reactive(new ReactiveArmour("Type-6 Transporter",2_465_290)),

    empire_trader_armour_grade1(new LightweightArmour("Imperial Clipper",0)),
    empire_trader_armour_grade2(new ReinforcedArmour("Imperial Clipper",8_918_340)),
    empire_trader_armour_grade3(new MilitaryGradeArmour("Imperial Clipper",20_066_270)),
    empire_trader_armour_mirrored(new MirroredArmour("Imperial Clipper",47_423_290)),
    empire_trader_armour_reactive(new ReactiveArmour("Imperial Clipper",52_551_340)),

    federation_dropship_armour_grade1(new LightweightArmour("Federal Dropship",0)),
    federation_dropship_armour_grade2(new ReinforcedArmour("Federal Dropship",5_725_680)),
    federation_dropship_armour_grade3(new MilitaryGradeArmour("Federal Dropship",12_882_780)),
    federation_dropship_armour_mirrored(new MirroredArmour("Federal Dropship",30_446_310)),
    federation_dropship_armour_reactive(new ReactiveArmour("Federal Dropship",33_738_580)),

    cutter_armour_grade1(new LightweightArmour("Imperial Cutter",0)),
    cutter_armour_grade2(new ReinforcedArmour("Imperial Cutter",83_587_790)),
    cutter_armour_grade3(new MilitaryGradeArmour("Imperial Cutter",188_072_510)),
    cutter_armour_mirrored(new MirroredArmour("Imperial Cutter",444_478_020)),
    cutter_armour_reactive(new ReactiveArmour("Imperial Cutter",492_541_000)),

    empire_eagle_armour_grade1(new LightweightArmour("Imperial Eagle",0)),
    empire_eagle_armour_grade2(new ReinforcedArmour("Imperial Eagle",26_880)),
    empire_eagle_armour_grade3(new MilitaryGradeArmour("Imperial Eagle",222_760)),
    empire_eagle_armour_mirrored(new MirroredArmour("Imperial Eagle",346_550)),
    empire_eagle_armour_reactive(new ReactiveArmour("Imperial Eagle",372_040)),

    typex_armour_grade1(new LightweightArmour("Alliance Chieftain",0)),
    typex_armour_grade2(new ReinforcedArmour("Alliance Chieftain",6_803_170)),
    typex_armour_grade3(new MilitaryGradeArmour("Alliance Chieftain",15_307_134)),
    typex_armour_mirrored(new MirroredArmour("Alliance Chieftain",36_175_859)),
    typex_armour_reactive(new ReactiveArmour("Alliance Chieftain",40_087_682)),

    typex_2_armour_grade1(new LightweightArmour("Alliance Crusader",0)),
    typex_2_armour_grade2(new ReinforcedArmour("Alliance Crusader",6_803_170)),
    typex_2_armour_grade3(new MilitaryGradeArmour("Alliance Crusader",15_307_134)),
    typex_2_armour_mirrored(new MirroredArmour("Alliance Crusader",36_175_859)),
    typex_2_armour_reactive(new ReactiveArmour("Alliance Crusader",40_087_682)),

    typex_3_armour_grade1(new LightweightArmour("Alliance Challenger",0)),
    typex_3_armour_grade2(new ReinforcedArmour("Alliance Challenger",6_803_170)),
    typex_3_armour_grade3(new MilitaryGradeArmour("Alliance Challenger",15_307_134)),
    typex_3_armour_mirrored(new MirroredArmour("Alliance Challenger",36_175_859)),
    typex_3_armour_reactive(new ReactiveArmour("Alliance Challenger",40_087_682)),

    federation_corvette_armour_grade1(new LightweightArmour("Federal Corvette",0)),
    federation_corvette_armour_grade2(new ReinforcedArmour("Federal Corvette",75_187_790)),
    federation_corvette_armour_grade3(new MilitaryGradeArmour("Federal Corvette",169_172_510)),
    federation_corvette_armour_mirrored(new MirroredArmour("Federal Corvette",399_811_020)),
    federation_corvette_armour_reactive(new ReactiveArmour("Federal Corvette",443_044_000)),

    empire_courier_armour_grade1(new LightweightArmour("Imperial Courier",0)),
    empire_courier_armour_grade2(new ReinforcedArmour("Imperial Courier",1_017_200)),
    empire_courier_armour_grade3(new MilitaryGradeArmour("Imperial Courier",2_288_600)),
    empire_courier_armour_mirrored(new MirroredArmour("Imperial Courier",5_408_800)),
    empire_courier_armour_reactive(new ReactiveArmour("Imperial Courier",5_993_700)),

    federation_gunship_armour_grade1(new LightweightArmour("Federal Gunship",0)),
    federation_gunship_armour_grade2(new ReinforcedArmour("Federal Gunship",14_325_690)),
    federation_gunship_armour_grade3(new MilitaryGradeArmour("Federal Gunship",32_232_790)),
    federation_gunship_armour_mirrored(new MirroredArmour("Federal Gunship",76_176_810)),
    federation_gunship_armour_reactive(new ReactiveArmour("Federal Gunship",84_414_090)),

    type9_military_armour_grade1(new LightweightArmour("Type-10 Defender",0)),
    type9_military_armour_grade2(new ReinforcedArmour("Type-10 Defender",49_902_136 )),
    type9_military_armour_grade3(new MilitaryGradeArmour("Type-10 Defender",112_279_807 )),
    type9_military_armour_mirrored(new MirroredArmour("Type-10 Defender",265_354_612 )),
    type9_military_armour_reactive(new ReactiveArmour("Type-10 Defender",294_048_341 )),

    federation_dropship_mkii_armour_grade1(new LightweightArmour("Federal Assault Ship",0)),
    federation_dropship_mkii_armour_grade2(new ReinforcedArmour("Federal Assault Ship",7_925_680)),
    federation_dropship_mkii_armour_grade3(new MilitaryGradeArmour("Federal Assault Ship",17_832_780)),
    federation_dropship_mkii_armour_mirrored(new MirroredArmour("Federal Assault Ship",42_144_810)),
    federation_dropship_mkii_armour_reactive(new ReactiveArmour("Federal Assault Ship",46_702_080)),


    /**
     * PowerPlant
     */

    int_powerplant_size2_class1(new PowerPlant_2E()),
    int_powerplant_size2_class1_free(new PowerPlant_2E()),
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
    int_engine_size2_class1_free(new Thrusters_2E()),
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
    int_hyperdrive_size2_class1_free(new FrameShiftDrive_2E()),
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
    int_lifesupport_size1_class1_free(new LifeSupport_1E()),
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
    int_powerdistributor_size1_class1_free(new PowerDistributor_1E()),
    int_powerdistributor_size1_class2(new PowerDistributor_1D()),
    int_powerdistributor_size1_class3(new PowerDistributor_1C()),
    int_powerdistributor_size1_class4(new PowerDistributor_1B()),
    int_powerdistributor_size1_class5(new PowerDistributor_1A()),
    int_guardianpowerdistributor_size1(new HybridPowerDistributor_1A()),

    int_powerdistributor_size2_class1(new PowerDistributor_2E()),
    int_powerdistributor_size2_class2(new PowerDistributor_2D()),
    int_powerdistributor_size2_class3(new PowerDistributor_2C()),
    int_powerdistributor_size2_class4(new PowerDistributor_2B()),
    int_powerdistributor_size2_class5(new PowerDistributor_2A()),
    int_guardianpowerdistributor_size2(new HybridPowerDistributor_2A()),

    int_powerdistributor_size3_class1(new PowerDistributor_3E()),
    int_powerdistributor_size3_class2(new PowerDistributor_3D()),
    int_powerdistributor_size3_class3(new PowerDistributor_3C()),
    int_powerdistributor_size3_class4(new PowerDistributor_3B()),
    int_powerdistributor_size3_class5(new PowerDistributor_3A()),
    int_guardianpowerdistributor_size3(new HybridPowerDistributor_3A()),

    int_powerdistributor_size4_class1(new PowerDistributor_4E()),
    int_powerdistributor_size4_class2(new PowerDistributor_4D()),
    int_powerdistributor_size4_class3(new PowerDistributor_4C()),
    int_powerdistributor_size4_class4(new PowerDistributor_4B()),
    int_powerdistributor_size4_class5(new PowerDistributor_4A()),
    int_guardianpowerdistributor_size4(new HybridPowerDistributor_4A()),

    int_powerdistributor_size5_class1(new PowerDistributor_5E()),
    int_powerdistributor_size5_class2(new PowerDistributor_5D()),
    int_powerdistributor_size5_class3(new PowerDistributor_5C()),
    int_powerdistributor_size5_class4(new PowerDistributor_5B()),
    int_powerdistributor_size5_class5(new PowerDistributor_5A()),
    int_guardianpowerdistributor_size5(new HybridPowerDistributor_5A()),

    int_powerdistributor_size6_class1(new PowerDistributor_6E()),
    int_powerdistributor_size6_class2(new PowerDistributor_6D()),
    int_powerdistributor_size6_class3(new PowerDistributor_6C()),
    int_powerdistributor_size6_class4(new PowerDistributor_6B()),
    int_powerdistributor_size6_class5(new PowerDistributor_6A()),
    int_guardianpowerdistributor_size6(new HybridPowerDistributor_6A()),

    int_powerdistributor_size7_class1(new PowerDistributor_7E()),
    int_powerdistributor_size7_class2(new PowerDistributor_7D()),
    int_powerdistributor_size7_class3(new PowerDistributor_7C()),
    int_powerdistributor_size7_class4(new PowerDistributor_7B()),
    int_powerdistributor_size7_class5(new PowerDistributor_7A()),
    int_guardianpowerdistributor_size7(new HybridPowerDistributor_7A()),

    int_powerdistributor_size8_class1(new PowerDistributor_8E()),
    int_powerdistributor_size8_class2(new PowerDistributor_8D()),
    int_powerdistributor_size8_class3(new PowerDistributor_8C()),
    int_powerdistributor_size8_class4(new PowerDistributor_8B()),
    int_powerdistributor_size8_class5(new PowerDistributor_8A()),
    int_guardianpowerdistributor_size8(new HybridPowerDistributor_8A()),


    /**
     * Sensors
     */

    int_sensors_size1_class1(new Sensors_1E()),
    int_sensors_size1_class1_free(new Sensors_1E()),
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
    int_fueltank_size1_class3_free(new FuelTank_1C()),

    int_fueltank_size2_class3(new FuelTank_2C()),

    int_fueltank_size3_class3(new FuelTank_3C()),

    int_fueltank_size4_class3(new FuelTank_4C()),

    int_fueltank_size5_class3(new FuelTank_5C()),

    int_fueltank_size6_class3(new FuelTank_6C()),

    int_fueltank_size7_class3(new FuelTank_7C()),

    int_fueltank_size8_class3(new FuelTank_8C()),

    /**
     * Planetary Approach Suite (Horizons)
     */

    int_planetapproachsuite(new PlanetarySuite_1I()),

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

    @Override
    public List<ProcurementRecipe> getAssociated()
    {
        return null;
    }

    @Override
    public void associate(ProcurementRecipe recipe)
    {

    }

    @Override
    public String getLocationInformation()
    {
        return null;
    }

    @Override
    public void setLocationInformation(String locationInformation)
    {

    }

    @Override
    public String getLocalizedName()
    {
        return displayText();
    }

    @Override
    public void setLocalizedName(String localizedName)
    {

    }

    @Override
    public ItemGrade getGrade()
    {
        return null;
    }

    @Override
    public List<Icon> icons()
    {
        return delegate.icons();
    }

    @Override
    public long price()
    {
        return delegate.price();
    }
}
