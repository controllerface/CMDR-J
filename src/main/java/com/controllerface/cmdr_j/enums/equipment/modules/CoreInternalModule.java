package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.planetarysuite.size1.AdvancedPlanetarySuite_1I;
import com.controllerface.cmdr_j.interfaces.commander.ShipModule;
import com.controllerface.cmdr_j.classes.modules.core.bulkheads.*;
import com.controllerface.cmdr_j.classes.modules.core.cargobay.GenericCargoBay;
import com.controllerface.cmdr_j.classes.modules.core.cockpit.GenericCockpit;
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
import com.controllerface.cmdr_j.classes.modules.core.fsd.size8.*;
import com.controllerface.cmdr_j.classes.modules.core.fueltank.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size1.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size2.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size3.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size4.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size5.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size6.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size7.*;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.size8.*;
import com.controllerface.cmdr_j.classes.modules.core.planetarysuite.size1.PlanetarySuite_1I;
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
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/25/2018.
 */
public enum CoreInternalModule implements ShipModule
{
    /**
     * Generic Cargo Bay
     */
    modularcargobaydoor(new GenericCargoBay()),

    /**
     * Ship Cockpits
     */
    dolphin_cockpit                             (new GenericCockpit("Dolphin")),
    ferdelance_cockpit                          (new GenericCockpit("Fer-de-Lance")),
    mamba_cockpit                               (new GenericCockpit("Mamba")),
    krait_mkii_cockpit                          (new GenericCockpit("Krait Mk II")),
    krait_light_cockpit                         (new GenericCockpit("Krait Phantom")),
    python_cockpit                              (new GenericCockpit("Python")),
    belugaliner_cockpit                         (new GenericCockpit("Beluga")),
    orca_cockpit                                (new GenericCockpit("Orca")),
    asp_scout_cockpit                           (new GenericCockpit("Asp Scout")),
    asp_cockpit                                 (new GenericCockpit("Asp Explorer")),
    independant_trader_cockpit                  (new GenericCockpit("Keelback")),
    vulture_cockpit                             (new GenericCockpit("Vulture")),
    viper_cockpit                               (new GenericCockpit("Viper MkIII")),
    diamondbackxl_cockpit                       (new GenericCockpit("Diamondback Explorer")),
    adder_cockpit                               (new GenericCockpit("Adder")),
    diamondback_cockpit                         (new GenericCockpit("Diamondback Scout")),
    viper_mkiv_cockpit                          (new GenericCockpit("Viper MkIV")),
    anaconda_cockpit                            (new GenericCockpit("Anaconda")),
    cobramkiii_cockpit                          (new GenericCockpit("Cobra MkIII")),
    type9_cockpit                               (new GenericCockpit("Type-9 Heavy")),
    type7_cockpit                               (new GenericCockpit("Type-7 Transporter")),
    cobramkiv_cockpit                           (new GenericCockpit("Cobra MkIV")),
    eagle_cockpit                               (new GenericCockpit("Eagle")),
    hauler_cockpit                              (new GenericCockpit("Hauler")),
    sidewinder_cockpit                          (new GenericCockpit("Sidewinder")),
    type6_cockpit                               (new GenericCockpit("Type-6 Transporter")),
    empire_trader_cockpit                       (new GenericCockpit("Imperial Clipper")),
    federation_dropship_cockpit                 (new GenericCockpit("Federal Dropship")),
    cutter_cockpit                              (new GenericCockpit("Imperial Cutter")),
    empire_eagle_cockpit                        (new GenericCockpit("Imperial Eagle")),
    typex_cockpit                               (new GenericCockpit("Alliance Chieftain")),
    typex_2_cockpit                             (new GenericCockpit("Alliance Crusader")),
    typex_3_cockpit                             (new GenericCockpit("Alliance Challenger")),
    federation_corvette_cockpit                 (new GenericCockpit("Federal Corvette")),
    empire_courier_cockpit                      (new GenericCockpit("Imperial Courier")),
    federation_gunship_cockpit                  (new GenericCockpit("Federal Gunship")),
    type9_military_cockpit                      (new GenericCockpit("Type-10 Defender")),
    federation_dropship_mkii_cockpit            (new GenericCockpit("Federal Assault Ship")),

    /**
     * Ship Armor
     */

    dolphin_armour_grade1                       (128049292L, new LightweightArmour("Dolphin",0)),
    dolphin_armour_grade2                       (128049293L, new ReinforcedArmour("Dolphin",534_940)),
    dolphin_armour_grade3                       (128049294L, new MilitaryGradeArmour("Dolphin",1_203_600)),
    dolphin_armour_mirrored                     (128049295L, new MirroredArmour("Dolphin",2_808_390)),
    dolphin_armour_reactive                     (128049296L, new ReactiveArmour("Dolphin",3_152_080)),

    ferdelance_armour_grade1                    (128049352L, new LightweightArmour("Fer-de-Lance",0)),
    ferdelance_armour_grade2                    (128049353L, new ReinforcedArmour("Fer-de-Lance",20_626_820)),
    ferdelance_armour_grade3                    (128049354L, new MilitaryGradeArmour("Fer-de-Lance",46_410_340)),
    ferdelance_armour_mirrored                  (128049355L, new MirroredArmour("Fer-de-Lance",109_683_090)),
    ferdelance_armour_reactive                  (128049356L, new ReactiveArmour("Fer-de-Lance",121_543_510)),

    mamba_armour_grade1                         (128915981L, new LightweightArmour("Mamba",0)),
    mamba_armour_grade2                         (128915982L, new ReinforcedArmour("Mamba",20_626_820)),
    mamba_armour_grade3                         (128915983L, new MilitaryGradeArmour("Mamba",46_410_340)),
    mamba_armour_mirrored                       (128915984L, new MirroredArmour("Mamba",109_683_090)),
    mamba_armour_reactive                       (128915985L, new ReactiveArmour("Mamba",121_543_510)),

    krait_mkii_armour_grade1                    (128816569L, new LightweightArmour("Krait Mk II",0)),
    krait_mkii_armour_grade2                    (128816570L, new ReinforcedArmour("Krait Mk II",22_791_270)),
    krait_mkii_armour_grade3                    (128816571L, new MilitaryGradeArmour("Krait Mk II",51_280_360)),
    krait_mkii_armour_mirrored                  (128816572L, new MirroredArmour("Krait Mk II",121_192_590)),
    krait_mkii_armour_reactive                  (128816573L, new ReactiveArmour("Krait Mk II",134_297_570)),

    krait_light_armour_grade1                   (128839283L, new LightweightArmour("Krait Phantom",0)),
    krait_light_armour_grade2                   (128839284L, new ReinforcedArmour("Krait Phantom",22_791_270 )),
    krait_light_armour_grade3                   (128839285L, new MilitaryGradeArmour("Krait Phantom",51_280_360 )),
    krait_light_armour_mirrored                 (128839286L, new MirroredArmour("Krait Phantom",121_192_590 )),
    krait_light_armour_reactive                 (128839287L, new ReactiveArmour("Krait Phantom",134_297_570 )),

    python_armour_grade1                        (128049340L, new LightweightArmour("Python",0)),
    python_armour_grade2                        (128049341L, new ReinforcedArmour("Python",22_791_270)),
    python_armour_grade3                        (128049342L, new MilitaryGradeArmour("Python",51_280_360)),
    python_armour_mirrored                      (128049343L, new MirroredArmour("Python",121_192_590)),
    python_armour_reactive                      (128049344L, new ReactiveArmour("Python",134_297_570)),

    belugaliner_armour_grade1                   (128049346L, new LightweightArmour("Beluga",0)),
    belugaliner_armour_grade2                   (128049347L, new ReinforcedArmour("Beluga",33_813_120)),
    belugaliner_armour_grade3                   (128049348L, new MilitaryGradeArmour("Beluga",76_079_500)),
    belugaliner_armour_mirrored                 (128049349L, new MirroredArmour("Beluga",179_801_200)),
    belugaliner_armour_reactive                 (128049350L, new ReactiveArmour("Beluga",199_243_730)),

    orca_armour_grade1                          (128049328L, new LightweightArmour("Orca",0)),
    orca_armour_grade2                          (128049329L, new ReinforcedArmour("Orca",19_415_950)),
    orca_armour_grade3                          (128049330L, new MilitaryGradeArmour("Orca",43_685_900)),
    orca_armour_mirrored                        (128049331L, new MirroredArmour("Orca",103_244_340)),
    orca_armour_reactive                        (128049332L, new ReactiveArmour("Orca",114_408_510)),

    asp_scout_armour_grade1                     (128672278L, new LightweightArmour("Asp Scout",0)),
    asp_scout_armour_grade2                     (128672279L, new ReinforcedArmour("Asp Scout",1_584_460)),
    asp_scout_armour_grade3                     (128672280L, new MilitaryGradeArmour("Asp Scout",3_565_040)),
    asp_scout_armour_mirrored                   (128672281L, new MirroredArmour("Asp Scout",8_425_380)),
    asp_scout_armour_reactive                   (128672282L, new ReactiveArmour("Asp Scout",9_336_440)),

    asp_armour_grade1                           (128049304L, new LightweightArmour("Asp Explorer",0)),
    asp_armour_grade2                           (128049305L, new ReinforcedArmour("Asp Explorer",2_664_460)),
    asp_armour_grade3                           (128049306L, new MilitaryGradeArmour("Asp Explorer",5_995_040)),
    asp_armour_mirrored                         (128049307L, new MirroredArmour("Asp Explorer",14_168_270)),
    asp_armour_reactive                         (128049308L, new ReactiveArmour("Asp Explorer",15_700_340)),

    independant_trader_armour_grade1            (128672271L, new LightweightArmour("Keelback",0)),
    independant_trader_armour_grade2            (128672272L, new ReinforcedArmour("Keelback",1_250_460)),
    independant_trader_armour_grade3            (128672273L, new MilitaryGradeArmour("Keelback",2_813_540)),
    independant_trader_armour_mirrored          (128672274L, new MirroredArmour("Keelback",6_649_330)),
    independant_trader_armour_reactive          (128672275L, new ReactiveArmour("Keelback",7_368_340)),

    vulture_armour_grade1                       (128049310L, new LightweightArmour("Vulture",0)),
    vulture_armour_grade2                       (128049311L, new ReinforcedArmour("Vulture",1_970_250)),
    vulture_armour_grade3                       (128049312L, new MilitaryGradeArmour("Vulture",4_433_050)),
    vulture_armour_mirrored                     (128049313L, new MirroredArmour("Vulture",10_476_780)),
    vulture_armour_reactive                     (128049314L, new ReactiveArmour("Vulture",11_609_670)),

    viper_armour_grade1                         (128049274L, new LightweightArmour("Viper MkIII",0)),
    viper_armour_grade2                         (128049275L, new ReinforcedArmour("Viper MkIII",57_170)),
    viper_armour_grade3                         (128049276L, new MilitaryGradeArmour("Viper MkIII",128_640)),
    viper_armour_mirrored                       (128049277L, new MirroredArmour("Viper MkIII",304_010)),
    viper_armour_reactive                       (128049278L, new ReactiveArmour("Viper MkIII",336_890)),

    diamondbackxl_armour_grade1                 (128671832L, new LightweightArmour("Diamondback Explorer",0)),
    diamondbackxl_armour_grade2                 (128671833L, new ReinforcedArmour("Diamondback Explorer",800_000)),
    diamondbackxl_armour_grade3                 (128671834L, new MilitaryGradeArmour("Diamondback Explorer",1_800_000)),
    diamondbackxl_armour_mirrored               (128671835L, new MirroredArmour("Diamondback Explorer",4_200_000)),
    diamondbackxl_armour_reactive               (128671836L, new ReactiveArmour("Diamondback Explorer",4_714_000)),

    adder_armour_grade1                         (128049268L, new LightweightArmour("Adder",0)),
    adder_armour_grade2                         (128049269L, new ReinforcedArmour("Adder",35_120)),
    adder_armour_grade3                         (128049270L, new MilitaryGradeArmour("Adder",79_030)),
    adder_armour_mirrored                       (128049271L, new MirroredArmour("Adder",186_770)),
    adder_armour_reactive                       (128049272L, new ReactiveArmour("Adder",206_960)),

    diamondback_armour_grade1                   (128671218L, new LightweightArmour("Diamondback Scout",0)),
    diamondback_armour_grade2                   (128671219L, new ReinforcedArmour("Diamondback Scout",225_700)),
    diamondback_armour_grade3                   (128671220L, new MilitaryGradeArmour("Diamondback Scout",507_900)),
    diamondback_armour_mirrored                 (128671221L, new MirroredArmour("Diamondback Scout",1_185_100)),
    diamondback_armour_reactive                 (128671222L, new ReactiveArmour("Diamondback Scout",1_330_100)),

    viper_mkiv_armour_grade1                    (128672257L, new LightweightArmour("Viper MkIV",0)),
    viper_mkiv_armour_grade2                    (128672258L, new ReinforcedArmour("Viper MkIV",175_180)),
    viper_mkiv_armour_grade3                    (128672259L, new MilitaryGradeArmour("Viper MkIV",394_140)),
    viper_mkiv_armour_mirrored                  (128672260L, new MirroredArmour("Viper MkIV",931_490)),
    viper_mkiv_armour_reactive                  (128672261L, new ReactiveArmour("Viper MkIV",1_033_210)),

    anaconda_armour_grade1                      (128049364L, new LightweightArmour("Anaconda",0)),
    anaconda_armour_grade2                      (128049365L, new ReinforcedArmour("Anaconda",58_787_780)),
    anaconda_armour_grade3                      (128049366L, new MilitaryGradeArmour("Anaconda",132_272_510)),
    anaconda_armour_mirrored                    (128049367L, new MirroredArmour("Anaconda",312_604_020)),
    anaconda_armour_reactive                    (128049368L, new ReactiveArmour("Anaconda",346_407_000)),

    cobramkiii_armour_grade1                    (128049280L, new LightweightArmour("Cobra MkIII",0)),
    cobramkiii_armour_grade2                    (128049281L, new ReinforcedArmour("Cobra MkIII",151_890)),
    cobramkiii_armour_grade3                    (128049282L, new MilitaryGradeArmour("Cobra MkIII",341_750)),
    cobramkiii_armour_mirrored                  (128049283L, new MirroredArmour("Cobra MkIII",797_410)),
    cobramkiii_armour_reactive                  (128049284L, new ReactiveArmour("Cobra MkIII",895_000)),

    type9_armour_grade1                         (128049334L, new LightweightArmour("Type-9 Heavy",0)),
    type9_armour_grade2                         (128049335L, new ReinforcedArmour("Type-9 Heavy",30_622_340)),
    type9_armour_grade3                         (128049336L, new MilitaryGradeArmour("Type-9 Heavy",68_900_260)),
    type9_armour_mirrored                       (128049337L, new MirroredArmour("Type-9 Heavy",162_834_280)),
    type9_armour_reactive                       (128049338L, new ReactiveArmour("Type-9 Heavy",180_442_120)),

    type7_armour_grade1                         (128049298L, new LightweightArmour("Type-7 Transporter",0)),
    type7_armour_grade2                         (128049299L, new ReinforcedArmour("Type-7 Transporter",6_988_900)),
    type7_armour_grade3                         (128049300L, new MilitaryGradeArmour("Type-7 Transporter",15_725_030)),
    type7_armour_mirrored                       (128049301L, new MirroredArmour("Type-7 Transporter",37_163_480)),
    type7_armour_reactive                       (128049302L, new ReactiveArmour("Type-7 Transporter",41_182_100)),

    cobramkiv_armour_grade1                     (128672264L, new LightweightArmour("Cobra MkIV",0)),
    cobramkiv_armour_grade2                     (128672265L, new ReinforcedArmour("Cobra MkIV",305_890)),
    cobramkiv_armour_grade3                     (128672266L, new MilitaryGradeArmour("Cobra MkIV",688_250)),
    cobramkiv_armour_mirrored                   (128672267L, new MirroredArmour("Cobra MkIV",1_605_910)),
    cobramkiv_armour_reactive                   (128672268L, new ReactiveArmour("Cobra MkIV",1_802_440)),

    eagle_armour_grade1                         (128049256L, new LightweightArmour("Eagle",0)),
    eagle_armour_grade2                         (128049257L, new ReinforcedArmour("Eagle",26_880)),
    eagle_armour_grade3                         (128049258L, new MilitaryGradeArmour("Eagle",90_050)),
    eagle_armour_mirrored                       (128049259L, new MirroredArmour("Eagle",140_090)),
    eagle_armour_reactive                       (128049260L, new ReactiveArmour("Eagle",150_390)),

    hauler_armour_grade1                        (128049262L, new LightweightArmour("Hauler",0)),
    hauler_armour_grade2                        (128049263L, new ReinforcedArmour("Hauler",42_180)),
    hauler_armour_grade3                        (128049264L, new MilitaryGradeArmour("Hauler",185_050)),
    hauler_armour_mirrored                      (128049265L, new MirroredArmour("Hauler",270_300)),
    hauler_armour_reactive                      (128049266L, new ReactiveArmour("Hauler",282_420)),

    sidewinder_armour_grade1                    (128049250L, new LightweightArmour("Sidewinder",0)),
    sidewinder_armour_grade2                    (128049251L, new ReinforcedArmour("Sidewinder",25_600)),
    sidewinder_armour_grade3                    (128049252L, new MilitaryGradeArmour("Sidewinder",80_320)),
    sidewinder_armour_mirrored                  (128049253L, new MirroredArmour("Sidewinder",132_060)),
    sidewinder_armour_reactive                  (128049254L, new ReactiveArmour("Sidewinder",139_420)),

    type6_armour_grade1                         (128049286L, new LightweightArmour("Type-6 Transporter",0)),
    type6_armour_grade2                         (128049287L, new ReinforcedArmour("Type-6 Transporter",418_380)),
    type6_armour_grade3                         (128049288L, new MilitaryGradeArmour("Type-6 Transporter",941_350)),
    type6_armour_mirrored                       (128049289L, new MirroredArmour("Type-6 Transporter",2_224_730)),
    type6_armour_reactive                       (128049290L, new ReactiveArmour("Type-6 Transporter",2_465_290)),

    empire_trader_armour_grade1                 (128049316L, new LightweightArmour("Imperial Clipper",0)),
    empire_trader_armour_grade2                 (128049317L, new ReinforcedArmour("Imperial Clipper",8_918_340)),
    empire_trader_armour_grade3                 (128049318L, new MilitaryGradeArmour("Imperial Clipper",20_066_270)),
    empire_trader_armour_mirrored               (128049319L, new MirroredArmour("Imperial Clipper",47_423_290)),
    empire_trader_armour_reactive               (128049320L, new ReactiveArmour("Imperial Clipper",52_551_340)),

    federation_dropship_armour_grade1           (128049322L, new LightweightArmour("Federal Dropship",0)),
    federation_dropship_armour_grade2           (128049323L, new ReinforcedArmour("Federal Dropship",5_725_680)),
    federation_dropship_armour_grade3           (128049324L, new MilitaryGradeArmour("Federal Dropship",12_882_780)),
    federation_dropship_armour_mirrored         (128049325L, new MirroredArmour("Federal Dropship",30_446_310)),
    federation_dropship_armour_reactive         (128049326L, new ReactiveArmour("Federal Dropship",33_738_580)),

    cutter_armour_grade1                        (128049376L, new LightweightArmour("Imperial Cutter",0)),
    cutter_armour_grade2                        (128049377L, new ReinforcedArmour("Imperial Cutter",83_587_790)),
    cutter_armour_grade3                        (128049378L, new MilitaryGradeArmour("Imperial Cutter",188_072_510)),
    cutter_armour_mirrored                      (128049379L, new MirroredArmour("Imperial Cutter",444_478_020)),
    cutter_armour_reactive                      (128049380L, new ReactiveArmour("Imperial Cutter",492_541_000)),

    empire_eagle_armour_grade1                  (128672140L, new LightweightArmour("Imperial Eagle",0)),
    empire_eagle_armour_grade2                  (128672141L, new ReinforcedArmour("Imperial Eagle",26_880)),
    empire_eagle_armour_grade3                  (128672142L, new MilitaryGradeArmour("Imperial Eagle",222_760)),
    empire_eagle_armour_mirrored                (128672143L, new MirroredArmour("Imperial Eagle",346_550)),
    empire_eagle_armour_reactive                (128672144L, new ReactiveArmour("Imperial Eagle",372_040)),

    typex_armour_grade1                         (128816576L, new LightweightArmour("Alliance Chieftain",0)),
    typex_armour_grade2                         (128816577L, new ReinforcedArmour("Alliance Chieftain",6_803_170)),
    typex_armour_grade3                         (128816578L, new MilitaryGradeArmour("Alliance Chieftain",15_307_134)),
    typex_armour_mirrored                       (128816579L, new MirroredArmour("Alliance Chieftain",36_175_859)),
    typex_armour_reactive                       (128816580L, new ReactiveArmour("Alliance Chieftain",40_087_682)),

    typex_2_armour_grade1                       (128816583L, new LightweightArmour("Alliance Crusader",0)),
    typex_2_armour_grade2                       (128816584L, new ReinforcedArmour("Alliance Crusader",6_803_170)),
    typex_2_armour_grade3                       (128816585L, new MilitaryGradeArmour("Alliance Crusader",15_307_134)),
    typex_2_armour_mirrored                     (128816586L, new MirroredArmour("Alliance Crusader",36_175_859)),
    typex_2_armour_reactive                     (128816587L, new ReactiveArmour("Alliance Crusader",40_087_682)),

    typex_3_armour_grade1                       (128816590L, new LightweightArmour("Alliance Challenger",0)),
    typex_3_armour_grade2                       (128816591L, new ReinforcedArmour("Alliance Challenger",6_803_170)),
    typex_3_armour_grade3                       (128816592L, new MilitaryGradeArmour("Alliance Challenger",15_307_134)),
    typex_3_armour_mirrored                     (128816593L, new MirroredArmour("Alliance Challenger",36_175_859)),
    typex_3_armour_reactive                     (128816594L, new ReactiveArmour("Alliance Challenger",40_087_682)),

    federation_corvette_armour_grade1           (128049370L, new LightweightArmour("Federal Corvette",0)),
    federation_corvette_armour_grade2           (128049371L, new ReinforcedArmour("Federal Corvette",75_187_790)),
    federation_corvette_armour_grade3           (128049372L, new MilitaryGradeArmour("Federal Corvette",169_172_510)),
    federation_corvette_armour_mirrored         (128049373L, new MirroredArmour("Federal Corvette",399_811_020)),
    federation_corvette_armour_reactive         (128049374L, new ReactiveArmour("Federal Corvette",443_044_000)),

    empire_courier_armour_grade1                (128671224L, new LightweightArmour("Imperial Courier",0)),
    empire_courier_armour_grade2                (128671225L, new ReinforcedArmour("Imperial Courier",1_017_200)),
    empire_courier_armour_grade3                (128671226L, new MilitaryGradeArmour("Imperial Courier",2_288_600)),
    empire_courier_armour_mirrored              (128671227L, new MirroredArmour("Imperial Courier",5_408_800)),
    empire_courier_armour_reactive              (128671228L, new ReactiveArmour("Imperial Courier",5_993_700)),

    federation_gunship_armour_grade1            (128672154L, new LightweightArmour("Federal Gunship",0)),
    federation_gunship_armour_grade2            (128672155L, new ReinforcedArmour("Federal Gunship",14_325_690)),
    federation_gunship_armour_grade3            (128672156L, new MilitaryGradeArmour("Federal Gunship",32_232_790)),
    federation_gunship_armour_mirrored          (128672157L, new MirroredArmour("Federal Gunship",76_176_810)),
    federation_gunship_armour_reactive          (128672158L, new ReactiveArmour("Federal Gunship",84_414_090)),

    type9_military_armour_grade1                (128785621L, new LightweightArmour("Type-10 Defender",0)),
    type9_military_armour_grade2                (128785622L, new ReinforcedArmour("Type-10 Defender",49_902_136 )),
    type9_military_armour_grade3                (128785623L, new MilitaryGradeArmour("Type-10 Defender",112_279_807 )),
    type9_military_armour_mirrored              (128785624L, new MirroredArmour("Type-10 Defender",265_354_612 )),
    type9_military_armour_reactive              (128785625L, new ReactiveArmour("Type-10 Defender",294_048_341 )),

    federation_dropship_mkii_armour_grade1      (128672147L, new LightweightArmour("Federal Assault Ship",0)),
    federation_dropship_mkii_armour_grade2      (128672148L, new ReinforcedArmour("Federal Assault Ship",7_925_680)),
    federation_dropship_mkii_armour_grade3      (128672149L, new MilitaryGradeArmour("Federal Assault Ship",17_832_780)),
    federation_dropship_mkii_armour_mirrored    (128672150L, new MirroredArmour("Federal Assault Ship",42_144_810)),
    federation_dropship_mkii_armour_reactive    (128672151L, new ReactiveArmour("Federal Assault Ship",46_702_080)),


    /**
     * PowerPlant
     */

    int_powerplant_size2_class1                 (128064033L, new PowerPlant_2E()),
    int_powerplant_size2_class2                 (128064034L, new PowerPlant_2D()),
    int_powerplant_size2_class3                 (128064035L, new PowerPlant_2C()),
    int_powerplant_size2_class4                 (128064036L, new PowerPlant_2B()),
    int_powerplant_size2_class5                 (128064037L, new PowerPlant_2A()),
    int_powerplant_size2_class1_free            (128666635L,new PowerPlant_2E()),
    int_guardianpowerplant_size2                (128833988L, new GuardianHybridPowerPlant_2A()),

    int_powerplant_size3_class1                 (128064038L, new PowerPlant_3E()),
    int_powerplant_size3_class2                 (128064039L, new PowerPlant_3D()),
    int_powerplant_size3_class3                 (128064040L, new PowerPlant_3C()),
    int_powerplant_size3_class4                 (128064041L, new PowerPlant_3B()),
    int_powerplant_size3_class5                 (128064042L, new PowerPlant_3A()),
    int_guardianpowerplant_size3                (128833989L, new GuardianHybridPowerPlant_3A()),

    int_powerplant_size4_class1                 (128064043L, new PowerPlant_4E()),
    int_powerplant_size4_class2                 (128064044L, new PowerPlant_4D()),
    int_powerplant_size4_class3                 (128064045L, new PowerPlant_4C()),
    int_powerplant_size4_class4                 (128064046L, new PowerPlant_4B()),
    int_powerplant_size4_class5                 (128064047L, new PowerPlant_4A()),
    int_guardianpowerplant_size4                (128833990L, new GuardianHybridPowerPlant_4A()),

    int_powerplant_size5_class1                 (128064048L, new PowerPlant_5E()),
    int_powerplant_size5_class2                 (128064049L, new PowerPlant_5D()),
    int_powerplant_size5_class3                 (128064050L, new PowerPlant_5C()),
    int_powerplant_size5_class4                 (128064051L, new PowerPlant_5B()),
    int_powerplant_size5_class5                 (128064052L, new PowerPlant_5A()),
    int_guardianpowerplant_size5                (128833991L, new GuardianHybridPowerPlant_5A()),

    int_powerplant_size6_class1                 (128064053L, new PowerPlant_6E()),
    int_powerplant_size6_class2                 (128064054L, new PowerPlant_6D()),
    int_powerplant_size6_class3                 (128064055L, new PowerPlant_6C()),
    int_powerplant_size6_class4                 (128064056L, new PowerPlant_6B()),
    int_powerplant_size6_class5                 (128064057L, new PowerPlant_6A()),
    int_guardianpowerplant_size6                (128833992L, new GuardianHybridPowerPlant_6A()),

    int_powerplant_size7_class1                 (128064058L, new PowerPlant_7E()),
    int_powerplant_size7_class2                 (128064059L, new PowerPlant_7D()),
    int_powerplant_size7_class3                 (128064060L, new PowerPlant_7C()),
    int_powerplant_size7_class4                 (128064061L, new PowerPlant_7B()),
    int_powerplant_size7_class5                 (128064062L, new PowerPlant_7A()),
    int_guardianpowerplant_size7                (128833993L, new GuardianHybridPowerPlant_7A()),

    int_powerplant_size8_class1                 (128064063L, new PowerPlant_8E()),
    int_powerplant_size8_class2                 (128064064L, new PowerPlant_8D()),
    int_powerplant_size8_class3                 (128064065L, new PowerPlant_8C()),
    int_powerplant_size8_class4                 (128064066L, new PowerPlant_8B()),
    int_powerplant_size8_class5                 (128064067L, new PowerPlant_8A()),
    int_guardianpowerplant_size8                (128833994L, new GuardianHybridPowerPlant_8A()),


    /**
     * Thrusters
     */

    int_engine_size2_class1                     (128064068L, new Thrusters_2E()),
    int_engine_size2_class2                     (128064069L, new Thrusters_2D()),
    int_engine_size2_class3                     (128064070L, new Thrusters_2C()),
    int_engine_size2_class4                     (128064071L, new Thrusters_2B()),
    int_engine_size2_class5                     (128064072L, new Thrusters_2A()),
    int_engine_size2_class1_free                (128666636L, new Thrusters_2E()),
    int_engine_size2_class5_fast                (128682014L, new EnhancedPerformanceThrusters_2A()),

    int_engine_size3_class1                     (128064073L, new Thrusters_3E()),
    int_engine_size3_class2                     (128064074L, new Thrusters_3D()),
    int_engine_size3_class3                     (128064075L, new Thrusters_3C()),
    int_engine_size3_class4                     (128064076L, new Thrusters_3B()),
    int_engine_size3_class5                     (128064077L, new Thrusters_3A()),
    int_engine_size3_class5_fast                (128682013L, new EnhancedPerformanceThrusters_3A()),

    int_engine_size4_class1                     (128064078L, new Thrusters_4E()),
    int_engine_size4_class2                     (128064079L, new Thrusters_4D()),
    int_engine_size4_class3                     (128064080L, new Thrusters_4C()),
    int_engine_size4_class4                     (128064081L, new Thrusters_4B()),
    int_engine_size4_class5                     (128064082L, new Thrusters_4A()),

    int_engine_size5_class1                     (128064083L, new Thrusters_5E()),
    int_engine_size5_class2                     (128064084L, new Thrusters_5D()),
    int_engine_size5_class3                     (128064085L, new Thrusters_5C()),
    int_engine_size5_class4                     (128064086L, new Thrusters_5B()),
    int_engine_size5_class5                     (128064087L, new Thrusters_5A()),

    int_engine_size6_class1                     (128064088L, new Thrusters_6E()),
    int_engine_size6_class2                     (128064089L, new Thrusters_6D()),
    int_engine_size6_class3                     (128064090L, new Thrusters_6C()),
    int_engine_size6_class4                     (128064091L, new Thrusters_6B()),
    int_engine_size6_class5                     (128064092L, new Thrusters_6A()),

    int_engine_size7_class1                     (128064093L, new Thrusters_7E()),
    int_engine_size7_class2                     (128064094L, new Thrusters_7D()),
    int_engine_size7_class3                     (128064095L, new Thrusters_7C()),
    int_engine_size7_class4                     (128064096L, new Thrusters_7B()),
    int_engine_size7_class5                     (128064097L, new Thrusters_7A()),

    int_engine_size8_class1                     (128064098L, new Thrusters_8E()),
    int_engine_size8_class2                     (128064099L, new Thrusters_8D()),
    int_engine_size8_class3                     (128064100L, new Thrusters_8C()),
    int_engine_size8_class4                     (128064101L, new Thrusters_8B()),
    int_engine_size8_class5                     (128064102L, new Thrusters_8A()),


    /**
     * Frame Shift Drive
     */
    int_hyperdrive_size2_class1                 (128064103L, new FrameShiftDrive_2E()),
    int_hyperdrive_size2_class2                 (128064104L, new FrameShiftDrive_2D()),
    int_hyperdrive_size2_class3                 (128064105L, new FrameShiftDrive_2C()),
    int_hyperdrive_size2_class4                 (128064106L, new FrameShiftDrive_2B()),
    int_hyperdrive_size2_class5                 (128064107L, new FrameShiftDrive_2A()),
    int_hyperdrive_size2_class1_free            (128666637L, new FrameShiftDrive_2E()),

    int_hyperdrive_size3_class1                 (128064108L, new FrameShiftDrive_3E()),
    int_hyperdrive_size3_class2                 (128064109L, new FrameShiftDrive_3D()),
    int_hyperdrive_size3_class3                 (128064110L, new FrameShiftDrive_3C()),
    int_hyperdrive_size3_class4                 (128064111L, new FrameShiftDrive_3B()),
    int_hyperdrive_size3_class5                 (128064112L, new FrameShiftDrive_3A()),

    int_hyperdrive_size4_class1                 (128064113L, new FrameShiftDrive_4E()),
    int_hyperdrive_size4_class2                 (128064114L, new FrameShiftDrive_4D()),
    int_hyperdrive_size4_class3                 (128064115L, new FrameShiftDrive_4C()),
    int_hyperdrive_size4_class4                 (128064116L, new FrameShiftDrive_4B()),
    int_hyperdrive_size4_class5                 (128064117L, new FrameShiftDrive_4A()),

    int_hyperdrive_size5_class1                 (128064118L, new FrameShiftDrive_5E()),
    int_hyperdrive_size5_class2                 (128064119L, new FrameShiftDrive_5D()),
    int_hyperdrive_size5_class3                 (128064120L, new FrameShiftDrive_5C()),
    int_hyperdrive_size5_class4                 (128064121L, new FrameShiftDrive_5B()),
    int_hyperdrive_size5_class5                 (128064122L, new FrameShiftDrive_5A()),

    int_hyperdrive_size6_class1                 (128064123L, new FrameShiftDrive_6E()),
    int_hyperdrive_size6_class2                 (128064124L, new FrameShiftDrive_6D()),
    int_hyperdrive_size6_class3                 (128064125L, new FrameShiftDrive_6C()),
    int_hyperdrive_size6_class4                 (128064126L, new FrameShiftDrive_6B()),
    int_hyperdrive_size6_class5                 (128064127L, new FrameShiftDrive_6A()),

    int_hyperdrive_size7_class1                 (128064128L, new FrameShiftDrive_7E()),
    int_hyperdrive_size7_class2                 (128064129L, new FrameShiftDrive_7D()),
    int_hyperdrive_size7_class3                 (128064130L, new FrameShiftDrive_7C()),
    int_hyperdrive_size7_class4                 (128064131L, new FrameShiftDrive_7B()),
    int_hyperdrive_size7_class5                 (128064132L, new FrameShiftDrive_7A()),

    // Size 8 FSD are "sold" at some station, but are unattainable
    int_hyperdrive_size8_class1                 (128064133L, new FrameShiftDrive_8E()),
    int_hyperdrive_size8_class2                 (128064134L, new FrameShiftDrive_8D()),
    int_hyperdrive_size8_class3                 (128064135L, new FrameShiftDrive_8C()),
    int_hyperdrive_size8_class4                 (128064136L, new FrameShiftDrive_8B()),
    int_hyperdrive_size8_class5                 (128064137L, new FrameShiftDrive_8A()),


    /**
     * Life Support
     */

    int_lifesupport_size1_class1                (128064138L, new LifeSupport_1E()),
    int_lifesupport_size1_class2                (128064139L, new LifeSupport_1D()),
    int_lifesupport_size1_class3                (128064140L, new LifeSupport_1C()),
    int_lifesupport_size1_class4                (128064141L, new LifeSupport_1B()),
    int_lifesupport_size1_class5                (128064142L, new LifeSupport_1A()),
    int_lifesupport_size1_class1_free           (128666638L, new LifeSupport_1E()),

    int_lifesupport_size2_class1                (128064143L, new LifeSupport_2E()),
    int_lifesupport_size2_class2                (128064144L, new LifeSupport_2D()),
    int_lifesupport_size2_class3                (128064145L, new LifeSupport_2C()),
    int_lifesupport_size2_class4                (128064146L, new LifeSupport_2B()),
    int_lifesupport_size2_class5                (128064147L, new LifeSupport_2A()),

    int_lifesupport_size3_class1                (128064148L, new LifeSupport_3E()),
    int_lifesupport_size3_class2                (128064149L, new LifeSupport_3D()),
    int_lifesupport_size3_class3                (128064150L, new LifeSupport_3C()),
    int_lifesupport_size3_class4                (128064151L, new LifeSupport_3B()),
    int_lifesupport_size3_class5                (128064152L, new LifeSupport_3A()),

    int_lifesupport_size4_class1                (128064153L, new LifeSupport_4E()),
    int_lifesupport_size4_class2                (128064154L, new LifeSupport_4D()),
    int_lifesupport_size4_class3                (128064155L, new LifeSupport_4C()),
    int_lifesupport_size4_class4                (128064156L, new LifeSupport_4B()),
    int_lifesupport_size4_class5                (128064157L, new LifeSupport_4A()),

    int_lifesupport_size5_class1                (128064158L, new LifeSupport_5E()),
    int_lifesupport_size5_class2                (128064159L, new LifeSupport_5D()),
    int_lifesupport_size5_class3                (128064160L, new LifeSupport_5C()),
    int_lifesupport_size5_class4                (128064161L, new LifeSupport_5B()),
    int_lifesupport_size5_class5                (128064162L, new LifeSupport_5A()),

    int_lifesupport_size6_class1                (128064163L, new LifeSupport_6E()),
    int_lifesupport_size6_class2                (128064164L, new LifeSupport_6D()),
    int_lifesupport_size6_class3                (128064165L, new LifeSupport_6C()),
    int_lifesupport_size6_class4                (128064166L, new LifeSupport_6B()),
    int_lifesupport_size6_class5                (128064167L, new LifeSupport_6A()),

    int_lifesupport_size7_class1                (128064168L, new LifeSupport_7E()),
    int_lifesupport_size7_class2                (128064169L, new LifeSupport_7D()),
    int_lifesupport_size7_class3                (128064170L, new LifeSupport_7C()),
    int_lifesupport_size7_class4                (128064171L, new LifeSupport_7B()),
    int_lifesupport_size7_class5                (128064172L, new LifeSupport_7A()),

    int_lifesupport_size8_class1                (128064173L, new LifeSupport_8E()),
    int_lifesupport_size8_class2                (128064174L, new LifeSupport_8D()),
    int_lifesupport_size8_class3                (128064175L, new LifeSupport_8C()),
    int_lifesupport_size8_class4                (128064176L, new LifeSupport_8B()),
    int_lifesupport_size8_class5                (128064177L, new LifeSupport_8A()),


    /**
     * Power Distributor
     */

    int_powerdistributor_size1_class1           (128064178L, new PowerDistributor_1E()),
    int_powerdistributor_size1_class2           (128064179L, new PowerDistributor_1D()),
    int_powerdistributor_size1_class3           (128064180L, new PowerDistributor_1C()),
    int_powerdistributor_size1_class4           (128064181L, new PowerDistributor_1B()),
    int_powerdistributor_size1_class5           (128064182L, new PowerDistributor_1A()),
    int_powerdistributor_size1_class1_free      (128666639L, new PowerDistributor_1E()),
    int_guardianpowerdistributor_size1          (128833980L, new HybridPowerDistributor_1A()),

    int_powerdistributor_size2_class1           (128064183L, new PowerDistributor_2E()),
    int_powerdistributor_size2_class2           (128064184L, new PowerDistributor_2D()),
    int_powerdistributor_size2_class3           (128064185L, new PowerDistributor_2C()),
    int_powerdistributor_size2_class4           (128064186L, new PowerDistributor_2B()),
    int_powerdistributor_size2_class5           (128064187L, new PowerDistributor_2A()),
    int_guardianpowerdistributor_size2          (128833981L, new HybridPowerDistributor_2A()),

    int_powerdistributor_size3_class1           (128064188L, new PowerDistributor_3E()),
    int_powerdistributor_size3_class2           (128064189L, new PowerDistributor_3D()),
    int_powerdistributor_size3_class3           (128064190L, new PowerDistributor_3C()),
    int_powerdistributor_size3_class4           (128064191L, new PowerDistributor_3B()),
    int_powerdistributor_size3_class5           (128064192L, new PowerDistributor_3A()),
    int_guardianpowerdistributor_size3          (128833982L, new HybridPowerDistributor_3A()),

    int_powerdistributor_size4_class1           (128064193L, new PowerDistributor_4E()),
    int_powerdistributor_size4_class2           (128064194L, new PowerDistributor_4D()),
    int_powerdistributor_size4_class3           (128064195L, new PowerDistributor_4C()),
    int_powerdistributor_size4_class4           (128064196L, new PowerDistributor_4B()),
    int_powerdistributor_size4_class5           (128064197L, new PowerDistributor_4A()),
    int_guardianpowerdistributor_size4          (128833983L, new HybridPowerDistributor_4A()),

    int_powerdistributor_size5_class1           (128064198L, new PowerDistributor_5E()),
    int_powerdistributor_size5_class2           (128064199L, new PowerDistributor_5D()),
    int_powerdistributor_size5_class3           (128064200L, new PowerDistributor_5C()),
    int_powerdistributor_size5_class4           (128064201L, new PowerDistributor_5B()),
    int_powerdistributor_size5_class5           (128064202L, new PowerDistributor_5A()),
    int_guardianpowerdistributor_size5          (128833984L, new HybridPowerDistributor_5A()),

    int_powerdistributor_size6_class1           (128064203L, new PowerDistributor_6E()),
    int_powerdistributor_size6_class2           (128064204L, new PowerDistributor_6D()),
    int_powerdistributor_size6_class3           (128064205L, new PowerDistributor_6C()),
    int_powerdistributor_size6_class4           (128064206L, new PowerDistributor_6B()),
    int_powerdistributor_size6_class5           (128064207L, new PowerDistributor_6A()),
    int_guardianpowerdistributor_size6          (128833985L, new HybridPowerDistributor_6A()),

    int_powerdistributor_size7_class1           (128064208L, new PowerDistributor_7E()),
    int_powerdistributor_size7_class2           (128064209L, new PowerDistributor_7D()),
    int_powerdistributor_size7_class3           (128064210L, new PowerDistributor_7C()),
    int_powerdistributor_size7_class4           (128064211L, new PowerDistributor_7B()),
    int_powerdistributor_size7_class5           (128064212L, new PowerDistributor_7A()),
    int_guardianpowerdistributor_size7          (128833986L, new HybridPowerDistributor_7A()),

    int_powerdistributor_size8_class1           (128064213L, new PowerDistributor_8E()),
    int_powerdistributor_size8_class2           (128064214L, new PowerDistributor_8D()),
    int_powerdistributor_size8_class3           (128064215L, new PowerDistributor_8C()),
    int_powerdistributor_size8_class4           (128064216L, new PowerDistributor_8B()),
    int_powerdistributor_size8_class5           (128064217L, new PowerDistributor_8A()),
    int_guardianpowerdistributor_size8          (128833987L, new HybridPowerDistributor_8A()),


    /**
     * Sensors
     */

    int_sensors_size1_class1                    (128064218L, new Sensors_1E()),
    int_sensors_size1_class2                    (128064219L, new Sensors_1D()),
    int_sensors_size1_class3                    (128064220L, new Sensors_1C()),
    int_sensors_size1_class4                    (128064221L, new Sensors_1B()),
    int_sensors_size1_class5                    (128064222L, new Sensors_1A()),
    int_sensors_size1_class1_free               (128666640L, new Sensors_1E()),

    int_sensors_size2_class1                    (128064223L, new Sensors_2E()),
    int_sensors_size2_class2                    (128064224L, new Sensors_2D()),
    int_sensors_size2_class3                    (128064225L, new Sensors_2C()),
    int_sensors_size2_class4                    (128064226L, new Sensors_2B()),
    int_sensors_size2_class5                    (128064227L, new Sensors_2A()),

    int_sensors_size3_class1                    (128064228L, new Sensors_3E()),
    int_sensors_size3_class2                    (128064229L, new Sensors_3D()),
    int_sensors_size3_class3                    (128064230L, new Sensors_3C()),
    int_sensors_size3_class4                    (128064231L, new Sensors_3B()),
    int_sensors_size3_class5                    (128064232L, new Sensors_3A()),

    int_sensors_size4_class1                    (128064233L, new Sensors_4E()),
    int_sensors_size4_class2                    (128064234L, new Sensors_4D()),
    int_sensors_size4_class3                    (128064235L, new Sensors_4C()),
    int_sensors_size4_class4                    (128064236L, new Sensors_4B()),
    int_sensors_size4_class5                    (128064237L, new Sensors_4A()),

    int_sensors_size5_class1                    (128064238L, new Sensors_5E()),
    int_sensors_size5_class2                    (128064239L, new Sensors_5D()),
    int_sensors_size5_class3                    (128064240L, new Sensors_5C()),
    int_sensors_size5_class4                    (128064241L, new Sensors_5B()),
    int_sensors_size5_class5                    (128064242L, new Sensors_5A()),

    int_sensors_size6_class1                    (128064243L, new Sensors_6E()),
    int_sensors_size6_class2                    (128064244L, new Sensors_6D()),
    int_sensors_size6_class3                    (128064245L, new Sensors_6C()),
    int_sensors_size6_class4                    (128064246L, new Sensors_6B()),
    int_sensors_size6_class5                    (128064247L, new Sensors_6A()),

    int_sensors_size7_class1                    (128064248L, new Sensors_7E()),
    int_sensors_size7_class2                    (128064249L, new Sensors_7D()),
    int_sensors_size7_class3                    (128064250L, new Sensors_7C()),
    int_sensors_size7_class4                    (128064251L, new Sensors_7B()),
    int_sensors_size7_class5                    (128064252L, new Sensors_7A()),

    int_sensors_size8_class1                    (128064253L, new Sensors_8E()),
    int_sensors_size8_class2                    (128064254L, new Sensors_8D()),
    int_sensors_size8_class3                    (128064255L, new Sensors_8C()),
    int_sensors_size8_class4                    (128064256L, new Sensors_8B()),
    int_sensors_size8_class5                    (128064257L, new Sensors_8A()),


    /**
     * Fuel Tank
     */

    int_fueltank_size1_class3                   (128064346L, new FuelTank_1C()),
    int_fueltank_size1_class3_free              (128667018L, new FuelTank_1C()),
    int_fueltank_size2_class3                   (128064347L, new FuelTank_2C()),
    int_fueltank_size3_class3                   (128064348L, new FuelTank_3C()),
    int_fueltank_size4_class3                   (128064349L, new FuelTank_4C()),
    int_fueltank_size5_class3                   (128064350L, new FuelTank_5C()),
    int_fueltank_size6_class3                   (128064351L, new FuelTank_6C()),
    int_fueltank_size7_class3                   (128064352L, new FuelTank_7C()),
    int_fueltank_size8_class3                   (128064353L, new FuelTank_8C()),

    /**
     * Planetary Approach Suite (Horizons)
     */

    int_planetapproachsuite                     (128672317L, new PlanetarySuite_1I()),
    int_planetapproachsuite_advanced            (0L, new AdvancedPlanetarySuite_1I()),

    ;

    public final long id;
    private final ShipModule delegate;

    CoreInternalModule(ShipModule delegate)
    {
        this.id = -1;
        this.delegate = delegate;
    }

    CoreInternalModule(long id, ShipModule delegate)
    {
        this.id = id;
        this.delegate = delegate;
    }

    public TaskType modificationType()
    {
        return delegate.modificationType();
    }

    public TaskType experimentalType()
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
    public List<TaskRecipe> getAssociated()
    {
        return null;
    }

    @Override
    public void associate(TaskRecipe recipe)
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
    public long price()
    {
        return delegate.price();
    }

    public static ShipModule findById(long itemId)
    {
        return Stream.of(values())
            .filter(item -> item.id == itemId)
            .findFirst()
            .orElse(null);
    }
}
