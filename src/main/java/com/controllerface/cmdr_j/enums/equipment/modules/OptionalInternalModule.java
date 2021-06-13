package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size1.*;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.size2.*;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.size4.*;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.size6.*;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.size8.*;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size1.CargoRack_1E;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size1.CargoRack_1E_CorrosiveResist;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size1.CargoRack_1F_CorrosiveResist;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size2.CargoRack_2E;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size3.CargoRack_3E;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size4.CargoRack_4E;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size4.CargoRack_4E_CorrosiveResist;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size5.CargoRack_5E;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size6.CargoRack_6E;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size7.CargoRack_7E;
import com.controllerface.cmdr_j.classes.modules.optional.cargorack.size8.CargoRack_8E;
import com.controllerface.cmdr_j.classes.modules.optional.dockingcomputer.advanced.DockingComputer_1E_Advanced;
import com.controllerface.cmdr_j.classes.modules.optional.dockingcomputer.standard.DockingComputer_1E_Standard;
import com.controllerface.cmdr_j.classes.modules.optional.fighterbay.size5.FighterBay_5E;
import com.controllerface.cmdr_j.classes.modules.optional.fighterbay.size6.FighterBay_6E;
import com.controllerface.cmdr_j.classes.modules.optional.fighterbay.size7.FighterBay_7E;
import com.controllerface.cmdr_j.classes.modules.optional.fsdbooster.size1.GuardianFSDBooster_1H;
import com.controllerface.cmdr_j.classes.modules.optional.fsdbooster.size2.GuardianFSDBooster_2H;
import com.controllerface.cmdr_j.classes.modules.optional.fsdbooster.size3.GuardianFSDBooster_3H;
import com.controllerface.cmdr_j.classes.modules.optional.fsdbooster.size4.GuardianFSDBooster_4H;
import com.controllerface.cmdr_j.classes.modules.optional.fsdbooster.size5.GuardianFSDBooster_5H;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size2.*;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size4.*;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size2.*;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size4.*;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size6.*;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.fuelscoop.size8.*;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size2.*;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size4.*;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.collectorlimpet.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.decontamination.size1.DecontaminationLimpet_1E;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.decontamination.size3.DecontaminationLimpet_3E;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.decontamination.size5.DecontaminationLimpet_5E;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.decontamination.size7.DecontaminationLimpet_7E;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.fueltransfer.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.hatchbreaker.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size1.ReconLimpet_1E;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size3.ReconLimpet_3E;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size5.ReconLimpet_5E;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size7.ReconLimpet_7E;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.repair.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.repair.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.repair.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.repair.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.research.size1.ResearchLimpet_1E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size1.GuardianMRP_1D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size1.GuardianMRP_1E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size1.MRP_1D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size1.MRP_1E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size2.GuardianMRP_2D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size2.GuardianMRP_2E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size2.MRP_2D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size2.MRP_2E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size3.GuardianMRP_3D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size3.GuardianMRP_3E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size3.MRP_3D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size3.MRP_3E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size4.GuardianMRP_4D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size4.GuardianMRP_4E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size4.MRP_4D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size4.MRP_4E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size5.GuardianMRP_5D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size5.GuardianMRP_5E;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size5.MRP_5D;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size5.MRP_5E;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size2.Cabin_2E;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size3.Cabin_3D;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size3.Cabin_3E;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size4.Cabin_4C;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size4.Cabin_4D;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size4.Cabin_4E;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size5.Cabin_5B;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size5.Cabin_5C;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size5.Cabin_5D;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size5.Cabin_5E;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size6.Cabin_6B;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size6.Cabin_6C;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size6.Cabin_6D;
import com.controllerface.cmdr_j.classes.modules.optional.passengercabin.size6.Cabin_6E;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.size2.*;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.refinery.size4.*;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size1.GuardianShieldReinforcementPackage_1D;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size1.GuardianShieldReinforcementPackage_1E;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size2.GuardianShieldReinforcementPackage_2D;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size2.GuardianShieldReinforcementPackage_2E;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size3.GuardianShieldReinforcementPackage_3D;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size3.GuardianShieldReinforcementPackage_3E;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size4.GuardianShieldReinforcementPackage_4D;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size4.GuardianShieldReinforcementPackage_4E;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size5.GuardianShieldReinforcementPackage_5D;
import com.controllerface.cmdr_j.classes.modules.optional.shieldreinforcement.size5.GuardianShieldReinforcementPackage_5E;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size2.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size4.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size6.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size8.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size1.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size2.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size3.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size4.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size5.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size6.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size7.*;
import com.controllerface.cmdr_j.classes.modules.optional.shields.shieldcells.size8.*;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.size2.SRVBay_2G;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.size2.SRVBay_2H;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.size4.SRVBay_4G;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.size4.SRVBay_4H;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.size6.SRVBay_6G;
import com.controllerface.cmdr_j.classes.modules.optional.srvbay.size6.SRVBay_6H;
import com.controllerface.cmdr_j.classes.modules.optional.supercruiseassist.SuperCruiseAssist_1E;
import com.controllerface.cmdr_j.classes.modules.utility.surfacescanner.DetailedSurfaceScanner_1I;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implementation note:
 *
 * The enum values in this class must match a defined Module name in the game
 *
 * Created by Controllerface on 4/25/2018.
 */
public enum OptionalInternalModule implements OwnableModule
{
    /**
     * Automated Field Maintenance Unit
     */

    int_repairer_size1_class1                       (128667598L, new AFMU_1E()),
    int_repairer_size1_class2                       (128667606L, new AFMU_1D()),
    int_repairer_size1_class3                       (128667614L, new AFMU_1C()),
    int_repairer_size1_class4                       (128667622L, new AFMU_1B()),
    int_repairer_size1_class5                       (128667630L, new AFMU_1A()),

    int_repairer_size2_class1                       (128667599L, new AFMU_2E()),
    int_repairer_size2_class2                       (128667607L, new AFMU_2D()),
    int_repairer_size2_class3                       (128667615L, new AFMU_2C()),
    int_repairer_size2_class4                       (128667623L, new AFMU_2B()),
    int_repairer_size2_class5                       (128667631L, new AFMU_2A()),

    int_repairer_size3_class1                       (128667600L, new AFMU_3E()),
    int_repairer_size3_class2                       (128667608L, new AFMU_3D()),
    int_repairer_size3_class3                       (128667616L, new AFMU_3C()),
    int_repairer_size3_class4                       (128667624L, new AFMU_3B()),
    int_repairer_size3_class5                       (128667632L, new AFMU_3A()),

    int_repairer_size4_class1                       (128667601L, new AFMU_4E()),
    int_repairer_size4_class2                       (128667609L, new AFMU_4D()),
    int_repairer_size4_class3                       (128667617L, new AFMU_4C()),
    int_repairer_size4_class4                       (128667625L, new AFMU_4B()),
    int_repairer_size4_class5                       (128667633L, new AFMU_4A()),

    int_repairer_size5_class1                       (128667602L, new AFMU_5E()),
    int_repairer_size5_class2                       (128667610L, new AFMU_5D()),
    int_repairer_size5_class3                       (128667618L, new AFMU_5C()),
    int_repairer_size5_class4                       (128667626L, new AFMU_5B()),
    int_repairer_size5_class5                       (128667634L, new AFMU_5A()),

    int_repairer_size6_class1                       (128667603L, new AFMU_6E()),
    int_repairer_size6_class2                       (128667611L, new AFMU_6D()),
    int_repairer_size6_class3                       (128667619L, new AFMU_6C()),
    int_repairer_size6_class4                       (128667627L, new AFMU_6B()),
    int_repairer_size6_class5                       (128667635L, new AFMU_6A()),

    int_repairer_size7_class1                       (128667604L, new AFMU_7E()),
    int_repairer_size7_class2                       (128667612L, new AFMU_7D()),
    int_repairer_size7_class3                       (128667620L, new AFMU_7C()),
    int_repairer_size7_class4                       (128667628L, new AFMU_7B()),
    int_repairer_size7_class5                       (128667636L, new AFMU_7A()),

    int_repairer_size8_class1                       (128667605L, new AFMU_8E()),
    int_repairer_size8_class2                       (128667613L, new AFMU_8D()),
    int_repairer_size8_class3                       (128667621L, new AFMU_8C()),
    int_repairer_size8_class4                       (128667629L, new AFMU_8B()),
    int_repairer_size8_class5                       (128667637L, new AFMU_8A()),


    /**
     * Hull Reinforcement Package
     */

    int_hullreinforcement_size1_class1              (128668537L, new HRP_1E()),
    int_hullreinforcement_size1_class2              (128668538L, new HRP_1D()),
    int_guardianhullreinforcement_size1_class1      (128833945L, new GuardianHRP_1E()),
    int_guardianhullreinforcement_size1_class2      (128833946L, new GuardianHRP_1D()),
    int_metaalloyhullreinforcement_size1_class1     (128793117L, new MetaAlloyHRP_1E()),
    int_metaalloyhullreinforcement_size1_class2     (128793118L, new MetaAlloyHRP_1D()),

    int_hullreinforcement_size2_class1              (128668539L, new HRP_2E()),
    int_hullreinforcement_size2_class2              (128668540L, new HRP_2D()),
    int_guardianhullreinforcement_size2_class1      (128833947L, new GuardianHRP_2E()),
    int_guardianhullreinforcement_size2_class2      (128833948L, new GuardianHRP_2D()),
    int_metaalloyhullreinforcement_size2_class1     (128793119L, new MetaAlloyHRP_2E()),
    int_metaalloyhullreinforcement_size2_class2     (128793120L, new MetaAlloyHRP_2D()),

    int_hullreinforcement_size3_class1              (128668541L, new HRP_3E()),
    int_hullreinforcement_size3_class2              (128668542L, new HRP_3D()),
    int_guardianhullreinforcement_size3_class1      (128833949L, new GuardianHRP_3E()),
    int_guardianhullreinforcement_size3_class2      (128833950L, new GuardianHRP_3D()),
    int_metaalloyhullreinforcement_size3_class1     (128793121L, new MetaAlloyHRP_3E()),
    int_metaalloyhullreinforcement_size3_class2     (128793122L, new MetaAlloyHRP_3D()),

    int_hullreinforcement_size4_class1              (128668543L, new HRP_4E()),
    int_hullreinforcement_size4_class2              (128668544L, new HRP_4D()),
    int_guardianhullreinforcement_size4_class1      (128833951L, new GuardianHRP_4E()),
    int_guardianhullreinforcement_size4_class2      (128833952L, new GuardianHRP_4D()),
    int_metaalloyhullreinforcement_size4_class1     (128793123L, new MetaAlloyHRP_4E()),
    int_metaalloyhullreinforcement_size4_class2     (128793124L, new MetaAlloyHRP_4D()),

    int_hullreinforcement_size5_class1              (128668545L, new HRP_5E()),
    int_hullreinforcement_size5_class2              (128668546L, new HRP_5D()),
    int_guardianhullreinforcement_size5_class1      (128833953L, new GuardianHRP_5E()),
    int_guardianhullreinforcement_size5_class2      (128833954L, new GuardianHRP_5D()),
    int_metaalloyhullreinforcement_size5_class1     (128793125L, new MetaAlloyHRP_5E()),
    int_metaalloyhullreinforcement_size5_class2     (128793126L, new MetaAlloyHRP_5D()),

    /**
     * Module Reinforcement Package
     */

    int_modulereinforcement_size1_class1            (128737270L, new MRP_1E()),
    int_modulereinforcement_size1_class2            (128737271L, new MRP_1D()),
    int_guardianmodulereinforcement_size1_class1    (128833955L, new GuardianMRP_1E()),
    int_guardianmodulereinforcement_size1_class2    (128833956L, new GuardianMRP_1D()),

    int_modulereinforcement_size2_class1            (128737272L, new MRP_2E()),
    int_modulereinforcement_size2_class2            (128737273L, new MRP_2D()),
    int_guardianmodulereinforcement_size2_class1    (128833957L, new GuardianMRP_2E()),
    int_guardianmodulereinforcement_size2_class2    (128833958L, new GuardianMRP_2D()),

    int_modulereinforcement_size3_class1            (128737274L, new MRP_3E()),
    int_modulereinforcement_size3_class2            (128737275L, new MRP_3D()),
    int_guardianmodulereinforcement_size3_class1    (128833959L, new GuardianMRP_3E()),
    int_guardianmodulereinforcement_size3_class2    (128833960L, new GuardianMRP_3D()),

    int_modulereinforcement_size4_class1            (128737276L, new MRP_4E()),
    int_modulereinforcement_size4_class2            (128737277L, new MRP_4D()),
    int_guardianmodulereinforcement_size4_class1    (128833961L, new GuardianMRP_4E()),
    int_guardianmodulereinforcement_size4_class2    (128833962L, new GuardianMRP_4D()),

    int_modulereinforcement_size5_class1            (128737278L, new MRP_5E()),
    int_modulereinforcement_size5_class2            (128737279L, new MRP_5D()),
    int_guardianmodulereinforcement_size5_class1    (128833963L, new GuardianMRP_5E()),
    int_guardianmodulereinforcement_size5_class2    (128833964L, new GuardianMRP_5D()),


    /**
     * Fuel Scoop
     */

    int_fuelscoop_size1_class1                      (128666644L, new FuelScoop_1E()),
    int_fuelscoop_size1_class2                      (128666652L, new FuelScoop_1D()),
    int_fuelscoop_size1_class3                      (128666660L, new FuelScoop_1C()),
    int_fuelscoop_size1_class4                      (128666668L, new FuelScoop_1B()),
    int_fuelscoop_size1_class5                      (128666676L, new FuelScoop_1A()),

    int_fuelscoop_size2_class1                      (128666645L, new FuelScoop_2E()),
    int_fuelscoop_size2_class2                      (128666653L, new FuelScoop_2D()),
    int_fuelscoop_size2_class3                      (128666661L, new FuelScoop_2C()),
    int_fuelscoop_size2_class4                      (128666669L, new FuelScoop_2B()),
    int_fuelscoop_size2_class5                      (128666677L, new FuelScoop_2A()),

    int_fuelscoop_size3_class1                      (128666646L, new FuelScoop_3E()),
    int_fuelscoop_size3_class2                      (128666654L, new FuelScoop_3D()),
    int_fuelscoop_size3_class3                      (128666662L, new FuelScoop_3C()),
    int_fuelscoop_size3_class4                      (128666670L, new FuelScoop_3B()),
    int_fuelscoop_size3_class5                      (128666678L, new FuelScoop_3A()),

    int_fuelscoop_size4_class1                      (128666647L, new FuelScoop_4E()),
    int_fuelscoop_size4_class2                      (128666655L, new FuelScoop_4D()),
    int_fuelscoop_size4_class3                      (128666663L, new FuelScoop_4C()),
    int_fuelscoop_size4_class4                      (128666671L, new FuelScoop_4B()),
    int_fuelscoop_size4_class5                      (128666679L, new FuelScoop_4A()),

    int_fuelscoop_size5_class1                      (128666648L, new FuelScoop_5E()),
    int_fuelscoop_size5_class2                      (128666656L, new FuelScoop_5D()),
    int_fuelscoop_size5_class3                      (128666664L, new FuelScoop_5C()),
    int_fuelscoop_size5_class4                      (128666672L, new FuelScoop_5B()),
    int_fuelscoop_size5_class5                      (128666680L, new FuelScoop_5A()),

    int_fuelscoop_size6_class1                      (128666649L, new FuelScoop_6E()),
    int_fuelscoop_size6_class2                      (128666657L, new FuelScoop_6D()),
    int_fuelscoop_size6_class3                      (128666665L, new FuelScoop_6C()),
    int_fuelscoop_size6_class4                      (128666673L, new FuelScoop_6B()),
    int_fuelscoop_size6_class5                      (128666681L, new FuelScoop_6A()),

    int_fuelscoop_size7_class1                      (128666650L, new FuelScoop_7E()),
    int_fuelscoop_size7_class2                      (128666658L, new FuelScoop_7D()),
    int_fuelscoop_size7_class3                      (128666666L, new FuelScoop_7C()),
    int_fuelscoop_size7_class4                      (128666674L, new FuelScoop_7B()),
    int_fuelscoop_size7_class5                      (128666682L, new FuelScoop_7A()),

    int_fuelscoop_size8_class1                      (128666651L, new FuelScoop_8E()),
    int_fuelscoop_size8_class2                      (128666659L, new FuelScoop_8D()),
    int_fuelscoop_size8_class3                      (128666667L, new FuelScoop_8C()),
    int_fuelscoop_size8_class4                      (128666675L, new FuelScoop_8B()),
    int_fuelscoop_size8_class5                      (128666683L, new FuelScoop_8A()),


    /**
     * Refinery
     */

    int_refinery_size1_class1                       (128666684L, new Refinery_1E()),
    int_refinery_size1_class2                       (128666688L, new Refinery_1D()),
    int_refinery_size1_class3                       (128666692L, new Refinery_1C()),
    int_refinery_size1_class4                       (128666696L, new Refinery_1B()),
    int_refinery_size1_class5                       (128666700L, new Refinery_1A()),

    int_refinery_size2_class1                       (128666685L, new Refinery_2E()),
    int_refinery_size2_class2                       (128666689L, new Refinery_2D()),
    int_refinery_size2_class3                       (128666693L, new Refinery_2C()),
    int_refinery_size2_class4                       (128666697L, new Refinery_2B()),
    int_refinery_size2_class5                       (128666701L, new Refinery_2A()),

    int_refinery_size3_class1                       (128666686L, new Refinery_3E()),
    int_refinery_size3_class2                       (128666690L, new Refinery_3D()),
    int_refinery_size3_class3                       (128666694L, new Refinery_3C()),
    int_refinery_size3_class4                       (128666698L, new Refinery_3B()),
    int_refinery_size3_class5                       (128666702L, new Refinery_3A()),

    int_refinery_size4_class1                       (128666687L, new Refinery_4E()),
    int_refinery_size4_class2                       (128666691L, new Refinery_4D()),
    int_refinery_size4_class3                       (128666695L, new Refinery_4C()),
    int_refinery_size4_class4                       (128666699L, new Refinery_4B()),
    int_refinery_size4_class5                       (128666703L, new Refinery_4A()),


    /**
     * FSD Interdictor
     */

    int_fsdinterdictor_size1_class1                 (128666704L, new FSDInterdictor_1E()),
    int_fsdinterdictor_size1_class2                 (128666708L, new FSDInterdictor_1D()),
    int_fsdinterdictor_size1_class3                 (128666712L, new FSDInterdictor_1C()),
    int_fsdinterdictor_size1_class4                 (128666716L, new FSDInterdictor_1B()),
    int_fsdinterdictor_size1_class5                 (128666720L, new FSDInterdictor_1A()),

    int_fsdinterdictor_size2_class1                 (128666705L, new FSDInterdictor_2E()),
    int_fsdinterdictor_size2_class2                 (128666709L, new FSDInterdictor_2D()),
    int_fsdinterdictor_size2_class3                 (128666713L, new FSDInterdictor_2C()),
    int_fsdinterdictor_size2_class4                 (128666717L, new FSDInterdictor_2B()),
    int_fsdinterdictor_size2_class5                 (128666721L, new FSDInterdictor_2A()),

    int_fsdinterdictor_size3_class1                 (128666706L, new FSDInterdictor_3E()),
    int_fsdinterdictor_size3_class2                 (128666710L, new FSDInterdictor_3D()),
    int_fsdinterdictor_size3_class3                 (128666714L, new FSDInterdictor_3C()),
    int_fsdinterdictor_size3_class4                 (128666718L, new FSDInterdictor_3B()),
    int_fsdinterdictor_size3_class5                 (128666722L, new FSDInterdictor_3A()),

    int_fsdinterdictor_size4_class1                 (128666707L, new FSDInterdictor_4E()),
    int_fsdinterdictor_size4_class2                 (128666711L, new FSDInterdictor_4D()),
    int_fsdinterdictor_size4_class3                 (128666715L, new FSDInterdictor_4C()),
    int_fsdinterdictor_size4_class4                 (128666719L, new FSDInterdictor_4B()),
    int_fsdinterdictor_size4_class5                 (128666723L, new FSDInterdictor_4A()),


    /**
     * Cargo Rack
     */

    int_cargorack_size1_class1                      (128064338L, new CargoRack_1E()),
    int_corrosionproofcargorack_size1_class1        (128681641L, new CargoRack_1E_CorrosiveResist()),
    int_corrosionproofcargorack_size1_class2        (128681992L, new CargoRack_1F_CorrosiveResist()),
    int_cargorack_size2_class1                      (128064339L, new CargoRack_2E()),
    int_cargorack_size2_class1_free                 (128666643L, new CargoRack_2E()),
    int_cargorack_size3_class1                      (128064340L, new CargoRack_3E()),
    int_cargorack_size4_class1                      (128064341L, new CargoRack_4E()),
    int_corrosionproofcargorack_size4_class1        (128833944L, new CargoRack_4E_CorrosiveResist()),
    int_cargorack_size5_class1                      (128064342L, new CargoRack_5E()),
    int_cargorack_size6_class1                      (128064343L, new CargoRack_6E()),
    int_cargorack_size7_class1                      (128064344L, new CargoRack_7E()),
    int_cargorack_size8_class1                      (128064345L, new CargoRack_8E()),


    /**
     * Passenger Cabin
     */

    int_passengercabin_size2_class1                 (128734690L, new Cabin_2E()),

    int_passengercabin_size3_class1                 (128734691L, new Cabin_3E()),
    int_passengercabin_size3_class2                 (128734692L, new Cabin_3D()),

    int_passengercabin_size4_class1                 (128727922L, new Cabin_4E()),
    int_passengercabin_size4_class2                 (128727923L, new Cabin_4D()),
    int_passengercabin_size4_class3                 (128727924L, new Cabin_4C()),

    int_passengercabin_size5_class1                 (128734693L, new Cabin_5E()),
    int_passengercabin_size5_class2                 (128734694L, new Cabin_5D()),
    int_passengercabin_size5_class3                 (128734695L, new Cabin_5C()),
    int_passengercabin_size5_class4                 (128727925L, new Cabin_5B()),

    int_passengercabin_size6_class1                 (128727926L, new Cabin_6E()),
    int_passengercabin_size6_class2                 (128727927L, new Cabin_6D()),
    int_passengercabin_size6_class3                 (128727928L, new Cabin_6C()),
    int_passengercabin_size6_class4                 (128727929L, new Cabin_6B()),


    /**
     * Collector Limpet Controller
     */

    int_dronecontrol_collection_size1_class1        (128671229L, new CollectorLimpet_1E()),
    int_dronecontrol_collection_size1_class2        (128671230L, new CollectorLimpet_1D()),
    int_dronecontrol_collection_size1_class3        (128671231L, new CollectorLimpet_1C()),
    int_dronecontrol_collection_size1_class4        (128671232L, new CollectorLimpet_1B()),
    int_dronecontrol_collection_size1_class5        (128671233L, new CollectorLimpet_1A()),

    int_dronecontrol_collection_size3_class1        (128671234L, new CollectorLimpet_3E()),
    int_dronecontrol_collection_size3_class2        (128671235L, new CollectorLimpet_3D()),
    int_dronecontrol_collection_size3_class3        (128671236L, new CollectorLimpet_3C()),
    int_dronecontrol_collection_size3_class4        (128671237L, new CollectorLimpet_3B()),
    int_dronecontrol_collection_size3_class5        (128671238L, new CollectorLimpet_3A()),

    int_dronecontrol_collection_size5_class1        (128671239L, new CollectorLimpet_5E()),
    int_dronecontrol_collection_size5_class2        (128671240L, new CollectorLimpet_5D()),
    int_dronecontrol_collection_size5_class3        (128671241L, new CollectorLimpet_5C()),
    int_dronecontrol_collection_size5_class4        (128671242L, new CollectorLimpet_5B()),
    int_dronecontrol_collection_size5_class5        (128671243L, new CollectorLimpet_5A()),

    int_dronecontrol_collection_size7_class1        (128671244L, new CollectorLimpet_7E()),
    int_dronecontrol_collection_size7_class2        (128671245L, new CollectorLimpet_7D()),
    int_dronecontrol_collection_size7_class3        (128671246L, new CollectorLimpet_7C()),
    int_dronecontrol_collection_size7_class4        (128671247L, new CollectorLimpet_7B()),
    int_dronecontrol_collection_size7_class5        (128671248L, new CollectorLimpet_7A()),


    /**
     * Prospector Limpet Controller
     */

    int_dronecontrol_prospector_size1_class1        (128671269L, new ProspectorLimpet_1E()),
    int_dronecontrol_prospector_size1_class2        (128671270L, new ProspectorLimpet_1D()),
    int_dronecontrol_prospector_size1_class3        (128671271L, new ProspectorLimpet_1C()),
    int_dronecontrol_prospector_size1_class4        (128671272L, new ProspectorLimpet_1B()),
    int_dronecontrol_prospector_size1_class5        (128671273L, new ProspectorLimpet_1A()),

    int_dronecontrol_prospector_size3_class1        (128671274L, new ProspectorLimpet_3E()),
    int_dronecontrol_prospector_size3_class2        (128671275L, new ProspectorLimpet_3D()),
    int_dronecontrol_prospector_size3_class3        (128671276L, new ProspectorLimpet_3C()),
    int_dronecontrol_prospector_size3_class4        (128671277L, new ProspectorLimpet_3B()),
    int_dronecontrol_prospector_size3_class5        (128671278L, new ProspectorLimpet_3A()),

    int_dronecontrol_prospector_size5_class1        (128671279L, new ProspectorLimpet_5E()),
    int_dronecontrol_prospector_size5_class2        (128671280L, new ProspectorLimpet_5D()),
    int_dronecontrol_prospector_size5_class3        (128671281L, new ProspectorLimpet_5C()),
    int_dronecontrol_prospector_size5_class4        (128671282L, new ProspectorLimpet_5B()),
    int_dronecontrol_prospector_size5_class5        (128671283L, new ProspectorLimpet_5A()),

    int_dronecontrol_prospector_size7_class1        (128671284L, new ProspectorLimpet_7E()),
    int_dronecontrol_prospector_size7_class2        (128671285L, new ProspectorLimpet_7D()),
    int_dronecontrol_prospector_size7_class3        (128671286L, new ProspectorLimpet_7C()),
    int_dronecontrol_prospector_size7_class4        (128671287L, new ProspectorLimpet_7B()),
    int_dronecontrol_prospector_size7_class5        (128671288L, new ProspectorLimpet_7A()),


    /**
     * Fuel Transfer Limpet Controller
     */

    int_dronecontrol_fueltransfer_size1_class1      (128671249L, new FuelTransferLimpet_1E()),
    int_dronecontrol_fueltransfer_size1_class2      (128671250L, new FuelTransferLimpet_1D()),
    int_dronecontrol_fueltransfer_size1_class3      (128671251L, new FuelTransferLimpet_1C()),
    int_dronecontrol_fueltransfer_size1_class4      (128671252L, new FuelTransferLimpet_1B()),
    int_dronecontrol_fueltransfer_size1_class5      (128671253L, new FuelTransferLimpet_1A()),

    int_dronecontrol_fueltransfer_size3_class1      (128671254L, new FuelTransferLimpet_3E()),
    int_dronecontrol_fueltransfer_size3_class2      (128671255L, new FuelTransferLimpet_3D()),
    int_dronecontrol_fueltransfer_size3_class3      (128671256L, new FuelTransferLimpet_3C()),
    int_dronecontrol_fueltransfer_size3_class4      (128671257L, new FuelTransferLimpet_3B()),
    int_dronecontrol_fueltransfer_size3_class5      (128671258L, new FuelTransferLimpet_3A()),

    int_dronecontrol_fueltransfer_size5_class1      (128671259L, new FuelTransferLimpet_5E()),
    int_dronecontrol_fueltransfer_size5_class2      (128671260L, new FuelTransferLimpet_5D()),
    int_dronecontrol_fueltransfer_size5_class3      (128671261L, new FuelTransferLimpet_5C()),
    int_dronecontrol_fueltransfer_size5_class4      (128671262L, new FuelTransferLimpet_5B()),
    int_dronecontrol_fueltransfer_size5_class5      (128671263L, new FuelTransferLimpet_5A()),

    int_dronecontrol_fueltransfer_size7_class1      (128671264L, new FuelTransferLimpet_7E()),
    int_dronecontrol_fueltransfer_size7_class2      (128671265L, new FuelTransferLimpet_7D()),
    int_dronecontrol_fueltransfer_size7_class3      (128671266L, new FuelTransferLimpet_7C()),
    int_dronecontrol_fueltransfer_size7_class4      (128671267L, new FuelTransferLimpet_7B()),
    int_dronecontrol_fueltransfer_size7_class5      (128671268L, new FuelTransferLimpet_7A()),


    /**
     * Repair Limpet Controller
     */

    int_dronecontrol_repair_size1_class1            (128777327L, new RepairLimpet_1E()),
    int_dronecontrol_repair_size1_class2            (128777328L, new RepairLimpet_1D()),
    int_dronecontrol_repair_size1_class3            (128777329L, new RepairLimpet_1C()),
    int_dronecontrol_repair_size1_class4            (128777330L, new RepairLimpet_1B()),
    int_dronecontrol_repair_size1_class5            (128777331L, new RepairLimpet_1A()),

    int_dronecontrol_repair_size3_class1            (128777332L, new RepairLimpet_3E()),
    int_dronecontrol_repair_size3_class2            (128777333L, new RepairLimpet_3D()),
    int_dronecontrol_repair_size3_class3            (128777334L, new RepairLimpet_3C()),
    int_dronecontrol_repair_size3_class4            (128777335L, new RepairLimpet_3B()),
    int_dronecontrol_repair_size3_class5            (128777336L, new RepairLimpet_3A()),

    int_dronecontrol_repair_size5_class1            (128777337L, new RepairLimpet_5E()),
    int_dronecontrol_repair_size5_class2            (128777338L, new RepairLimpet_5D()),
    int_dronecontrol_repair_size5_class3            (128777339L, new RepairLimpet_5C()),
    int_dronecontrol_repair_size5_class4            (128777340L, new RepairLimpet_5B()),
    int_dronecontrol_repair_size5_class5            (128777341L, new RepairLimpet_5A()),

    int_dronecontrol_repair_size7_class1            (128777342L, new RepairLimpet_7E()),
    int_dronecontrol_repair_size7_class2            (128777343L, new RepairLimpet_7D()),
    int_dronecontrol_repair_size7_class3            (128777344L, new RepairLimpet_7C()),
    int_dronecontrol_repair_size7_class4            (128777345L, new RepairLimpet_7B()),
    int_dronecontrol_repair_size7_class5            (128777346L, new RepairLimpet_7A()),


    /**
     * Hatch Breaker Limpet Controller
     */

    // todo: is this obtainable?
    int_dronecontrol_resourcesiphon                 (128066402L, new HatchBreakerLimpet_1E()),

    int_dronecontrol_resourcesiphon_size1_class1    (128066532L, new HatchBreakerLimpet_1E()),
    int_dronecontrol_resourcesiphon_size1_class2    (128066533L, new HatchBreakerLimpet_1D()),
    int_dronecontrol_resourcesiphon_size1_class3    (128066534L, new HatchBreakerLimpet_1C()),
    int_dronecontrol_resourcesiphon_size1_class4    (128066535L, new HatchBreakerLimpet_1B()),
    int_dronecontrol_resourcesiphon_size1_class5    (128066536L, new HatchBreakerLimpet_1A()),

    int_dronecontrol_resourcesiphon_size3_class1    (128066537L, new HatchBreakerLimpet_3E()),
    int_dronecontrol_resourcesiphon_size3_class2    (128066538L, new HatchBreakerLimpet_3D()),
    int_dronecontrol_resourcesiphon_size3_class3    (128066539L, new HatchBreakerLimpet_3C()),
    int_dronecontrol_resourcesiphon_size3_class4    (128066540L, new HatchBreakerLimpet_3B()),
    int_dronecontrol_resourcesiphon_size3_class5    (128066541L, new HatchBreakerLimpet_3A()),

    int_dronecontrol_resourcesiphon_size5_class1    (128066542L, new HatchBreakerLimpet_5E()),
    int_dronecontrol_resourcesiphon_size5_class2    (128066543L, new HatchBreakerLimpet_5D()),
    int_dronecontrol_resourcesiphon_size5_class3    (128066544L, new HatchBreakerLimpet_5C()),
    int_dronecontrol_resourcesiphon_size5_class4    (128066545L, new HatchBreakerLimpet_5B()),
    int_dronecontrol_resourcesiphon_size5_class5    (128066546L, new HatchBreakerLimpet_5A()),

    int_dronecontrol_resourcesiphon_size7_class1    (128066547L, new HatchBreakerLimpet_7E()),
    int_dronecontrol_resourcesiphon_size7_class2    (128066548L, new HatchBreakerLimpet_7D()),
    int_dronecontrol_resourcesiphon_size7_class3    (128066549L, new HatchBreakerLimpet_7C()),
    int_dronecontrol_resourcesiphon_size7_class4    (128066550L, new HatchBreakerLimpet_7B()),
    int_dronecontrol_resourcesiphon_size7_class5    (128066551L, new HatchBreakerLimpet_7A()),


    /**
     * Decontamination Limpet Controller
     */

    int_dronecontrol_decontamination_size1_class1   (128793941L, new DecontaminationLimpet_1E()),
    int_dronecontrol_decontamination_size3_class1   (128793942L, new DecontaminationLimpet_3E()),
    int_dronecontrol_decontamination_size5_class1   (128793943L, new DecontaminationLimpet_5E()),
    int_dronecontrol_decontamination_size7_class1   (128793944L, new DecontaminationLimpet_7E()),


    /**
     * Recon Limpet Controller
     */

    int_dronecontrol_recon_size1_class1             (128837858L, new ReconLimpet_1E()),
    int_dronecontrol_recon_size3_class1             (128841592L, new ReconLimpet_3E()),
    int_dronecontrol_recon_size5_class1             (128841593L, new ReconLimpet_5E()),
    int_dronecontrol_recon_size7_class1             (128841594L, new ReconLimpet_7E()),


    /**
     * Research Limpet Controller
     */

    int_dronecontrol_unkvesselresearch              (128793116L, new ResearchLimpet_1E()),


    /**
     * SRV Bay
     *
     * todo: determine if ammo clip size is the right stat for the vehicle count
     */

    int_buggybay_size2_class1                       (128672288L, new SRVBay_2H()),
    int_buggybay_size2_class2                       (128672289L, new SRVBay_2G()),
    int_buggybay_size4_class1                       (128672290L, new SRVBay_4H()),
    int_buggybay_size4_class2                       (128672291L, new SRVBay_4G()),
    int_buggybay_size6_class1                       (128672292L, new SRVBay_6H()),
    int_buggybay_size6_class2                       (128672293L, new SRVBay_6G()),


    /**
     * Fighter Bay
     *
     * todo: determine if buggy bay slots is the right stat for the vehicle slots
     * todo: determine if ammo clip size is the right stat for the vehicle count
     */

    int_fighterbay_size5_class1                     (128727930L, new FighterBay_5E()),
    int_fighterbay_size6_class1                     (128727931L, new FighterBay_6E()),
    int_fighterbay_size7_class1                     (128727932L, new FighterBay_7E()),


    /**
     * Detailed Surface Scanner
     */

    int_detailedsurfacescanner_tiny                 (128666634L, new DetailedSurfaceScanner_1I()),


    /**
     * Docking Computer
     */

    int_dockingcomputer_advanced                    (128935155L, new DockingComputer_1E_Advanced()),
    int_dockingcomputer_standard                    (128049549L, new DockingComputer_1E_Standard()),

    /**
     * Supercurise Assist
     */
    int_supercruiseassist                           (128932273L,new SuperCruiseAssist_1E()),

    /**
     * Guardian FSD Booster
     */
    int_guardianfsdbooster_size1                    (128833975L, new GuardianFSDBooster_1H()),
    int_guardianfsdbooster_size2                    (128833976L, new GuardianFSDBooster_2H()),
    int_guardianfsdbooster_size3                    (128833977L, new GuardianFSDBooster_3H()),
    int_guardianfsdbooster_size4                    (128833978L, new GuardianFSDBooster_4H()),
    int_guardianfsdbooster_size5                    (128833979L, new GuardianFSDBooster_5H()),


    /**
     * Shield Generator
     */

    // Size 1C, 1D, and 1E shield generators apparently may exist in
    // some markets so need to be listed here, but they do not appear
    // to be Obtainable
    int_shieldgenerator_size1_class1                (128064258L, new ShieldGenerator_1E()),
    int_shieldgenerator_size1_class2                (128064259L, new ShieldGenerator_1D()),
    int_shieldgenerator_size1_class3                (128064260L, new ShieldGenerator_1C()),

    int_shieldgenerator_size1_class3_fast           (128671331L, new ShieldGenerator_1C_BiWeave()),
    int_shieldgenerator_size1_class5                (128064262L, new ShieldGenerator_1A()),
    int_shieldgenerator_size1_class5_strong         (128671323L, new ShieldGenerator_1A_Prismatic()),

    int_shieldgenerator_size2_class1                (128064263L, new ShieldGenerator_2E()),
    int_shieldgenerator_size2_class1_free           (128666641L, new ShieldGenerator_2E()),
    int_shieldgenerator_size2_class2                (128064264L, new ShieldGenerator_2D()),
    int_shieldgenerator_size2_class3                (128064265L, new ShieldGenerator_2C()),
    int_shieldgenerator_size2_class3_fast           (128671332L, new ShieldGenerator_2C_BiWeave()),
    int_shieldgenerator_size2_class4                (128064266L, new ShieldGenerator_2B()),
    int_shieldgenerator_size2_class5                (128064267L, new ShieldGenerator_2A()),
    int_shieldgenerator_size2_class5_strong         (128671324L, new ShieldGenerator_2A_Prismatic()),

    int_shieldgenerator_size3_class1                (128064268L, new ShieldGenerator_3E()),
    int_shieldgenerator_size3_class2                (128064269L, new ShieldGenerator_3D()),
    int_shieldgenerator_size3_class3                (128064270L, new ShieldGenerator_3C()),
    int_shieldgenerator_size3_class3_fast           (128671333L, new ShieldGenerator_3C_BiWeave()),
    int_shieldgenerator_size3_class4                (128064271L, new ShieldGenerator_3B()),
    int_shieldgenerator_size3_class5                (128064272L, new ShieldGenerator_3A()),
    int_shieldgenerator_size3_class5_strong         (128671325L, new ShieldGenerator_3A_Prismatic()),

    int_shieldgenerator_size4_class1                (128064273L, new ShieldGenerator_4E()),
    int_shieldgenerator_size4_class2                (128064274L, new ShieldGenerator_4D()),
    int_shieldgenerator_size4_class3                (128064275L, new ShieldGenerator_4C()),
    int_shieldgenerator_size4_class3_fast           (128671334L, new ShieldGenerator_4C_BiWeave()),
    int_shieldgenerator_size4_class4                (128064276L, new ShieldGenerator_4B()),
    int_shieldgenerator_size4_class5                (128064277L, new ShieldGenerator_4A()),
    int_shieldgenerator_size4_class5_strong         (128671326L, new ShieldGenerator_4A_Prismatic()),

    int_shieldgenerator_size5_class1                (128064278L, new ShieldGenerator_5E()),
    int_shieldgenerator_size5_class2                (128064279L, new ShieldGenerator_5D()),
    int_shieldgenerator_size5_class3                (128064280L, new ShieldGenerator_5C()),
    int_shieldgenerator_size5_class3_fast           (128671335L, new ShieldGenerator_5C_BiWeave()),
    int_shieldgenerator_size5_class4                (128064281L, new ShieldGenerator_5B()),
    int_shieldgenerator_size5_class5                (128064282L, new ShieldGenerator_5A()),
    int_shieldgenerator_size5_class5_strong         (128671327L, new ShieldGenerator_5A_Prismatic()),

    int_shieldgenerator_size6_class1                (128064283L, new ShieldGenerator_6E()),
    int_shieldgenerator_size6_class2                (128064284L, new ShieldGenerator_6D()),
    int_shieldgenerator_size6_class3                (128064285L, new ShieldGenerator_6C()),
    int_shieldgenerator_size6_class3_fast           (128671336L, new ShieldGenerator_6C_BiWeave()),
    int_shieldgenerator_size6_class4                (128064286L, new ShieldGenerator_6B()),
    int_shieldgenerator_size6_class5                (128064287L, new ShieldGenerator_6A()),
    int_shieldgenerator_size6_class5_strong         (128671328L, new ShieldGenerator_6A_Prismatic()),

    int_shieldgenerator_size7_class1                (128064288L, new ShieldGenerator_7E()),
    int_shieldgenerator_size7_class2                (128064289L, new ShieldGenerator_7D()),
    int_shieldgenerator_size7_class3                (128064290L, new ShieldGenerator_7C()),
    int_shieldgenerator_size7_class3_fast           (128671337L, new ShieldGenerator_7C_BiWeave()),
    int_shieldgenerator_size7_class4                (128064291L, new ShieldGenerator_7B()),
    int_shieldgenerator_size7_class5                (128064292L, new ShieldGenerator_7A()),
    int_shieldgenerator_size7_class5_strong         (128671329L, new ShieldGenerator_7A_Prismatic()),

    int_shieldgenerator_size8_class1                (128064293L, new ShieldGenerator_8E()),
    int_shieldgenerator_size8_class2                (128064294L, new ShieldGenerator_8D()),
    int_shieldgenerator_size8_class3                (128064295L, new ShieldGenerator_8C()),
    int_shieldgenerator_size8_class3_fast           (128671338L, new ShieldGenerator_8C_BiWeave()),
    int_shieldgenerator_size8_class4                (128064296L, new ShieldGenerator_8B()),
    int_shieldgenerator_size8_class5                (128064297L, new ShieldGenerator_8A()),
    int_shieldgenerator_size8_class5_strong         (128671330L, new ShieldGenerator_8A_Prismatic()),


    /**
     * Shield Cell Bank
     */

    int_shieldcellbank_size1_class1                 (128064298L, new ShieldCellBank_1E()),
    int_shieldcellbank_size1_class2                 (128064299L, new ShieldCellBank_1D()),
    int_shieldcellbank_size1_class3                 (128064300L, new ShieldCellBank_1C()),
    int_shieldcellbank_size1_class4                 (128064301L, new ShieldCellBank_1B()),
    int_shieldcellbank_size1_class5                 (128064302L, new ShieldCellBank_1A()),

    int_shieldcellbank_size2_class1                 (128064303L, new ShieldCellBank_2E()),
    int_shieldcellbank_size2_class2                 (128064304L, new ShieldCellBank_2D()),
    int_shieldcellbank_size2_class3                 (128064305L, new ShieldCellBank_2C()),
    int_shieldcellbank_size2_class4                 (128064306L, new ShieldCellBank_2B()),
    int_shieldcellbank_size2_class5                 (128064307L, new ShieldCellBank_2A()),

    int_shieldcellbank_size3_class1                 (128064308L, new ShieldCellBank_3E()),
    int_shieldcellbank_size3_class2                 (128064309L, new ShieldCellBank_3D()),
    int_shieldcellbank_size3_class3                 (128064310L, new ShieldCellBank_3C()),
    int_shieldcellbank_size3_class4                 (128064311L, new ShieldCellBank_3B()),
    int_shieldcellbank_size3_class5                 (128064312L, new ShieldCellBank_3A()),

    int_shieldcellbank_size4_class1                 (128064313L, new ShieldCellBank_4E()),
    int_shieldcellbank_size4_class2                 (128064314L, new ShieldCellBank_4D()),
    int_shieldcellbank_size4_class3                 (128064315L, new ShieldCellBank_4C()),
    int_shieldcellbank_size4_class4                 (128064316L, new ShieldCellBank_4B()),
    int_shieldcellbank_size4_class5                 (128064317L, new ShieldCellBank_4A()),

    int_shieldcellbank_size5_class1                 (128064318L, new ShieldCellBank_5E()),
    int_shieldcellbank_size5_class2                 (128064319L, new ShieldCellBank_5D()),
    int_shieldcellbank_size5_class3                 (128064320L, new ShieldCellBank_5C()),
    int_shieldcellbank_size5_class4                 (128064321L, new ShieldCellBank_5B()),
    int_shieldcellbank_size5_class5                 (128064322L, new ShieldCellBank_5A()),

    int_shieldcellbank_size6_class1                 (128064323L, new ShieldCellBank_6E()),
    int_shieldcellbank_size6_class2                 (128064324L, new ShieldCellBank_6D()),
    int_shieldcellbank_size6_class3                 (128064325L, new ShieldCellBank_6C()),
    int_shieldcellbank_size6_class4                 (128064326L, new ShieldCellBank_6B()),
    int_shieldcellbank_size6_class5                 (128064327L, new ShieldCellBank_6A()),

    int_shieldcellbank_size7_class1                 (128064328L, new ShieldCellBank_7E()),
    int_shieldcellbank_size7_class2                 (128064329L, new ShieldCellBank_7D()),
    int_shieldcellbank_size7_class3                 (128064330L, new ShieldCellBank_7C()),
    int_shieldcellbank_size7_class4                 (128064331L, new ShieldCellBank_7B()),
    int_shieldcellbank_size7_class5                 (128064332L, new ShieldCellBank_7A()),

    int_shieldcellbank_size8_class1                 (128064333L, new ShieldCellBank_8E()),
    int_shieldcellbank_size8_class2                 (128064334L, new ShieldCellBank_8D()),
    int_shieldcellbank_size8_class3                 (128064335L, new ShieldCellBank_8C()),
    int_shieldcellbank_size8_class4                 (128064336L, new ShieldCellBank_8B()),
    int_shieldcellbank_size8_class5                 (128064337L, new ShieldCellBank_8A()),


    /**
     * Shield Reinforcement
     */

    int_guardianshieldreinforcement_size1_class1    (128833965L, new GuardianShieldReinforcementPackage_1E()),
    int_guardianshieldreinforcement_size1_class2    (128833966L, new GuardianShieldReinforcementPackage_1D()),

    int_guardianshieldreinforcement_size2_class1    (128833967L, new GuardianShieldReinforcementPackage_2E()),
    int_guardianshieldreinforcement_size2_class2    (128833968L, new GuardianShieldReinforcementPackage_2D()),

    int_guardianshieldreinforcement_size3_class1    (128833969L, new GuardianShieldReinforcementPackage_3E()),
    int_guardianshieldreinforcement_size3_class2    (128833970L, new GuardianShieldReinforcementPackage_3D()),

    int_guardianshieldreinforcement_size4_class1    (128833971L, new GuardianShieldReinforcementPackage_4E()),
    int_guardianshieldreinforcement_size4_class2    (128833972L, new GuardianShieldReinforcementPackage_4D()),

    int_guardianshieldreinforcement_size5_class1    (128833973L, new GuardianShieldReinforcementPackage_5E()),
    int_guardianshieldreinforcement_size5_class2    (128833974L, new GuardianShieldReinforcementPackage_5D()),


    /**
     * Discovery Scanners:
     *
     * TODO: should no longer be present in new games, disabling them breaks compatibility but I want to keep
     *   any "legacy" stuff clearly separate. At some point should figure out best way to handle this that keeps
     *   this class as clean as possible, and old stuff clearly marked as such.
     */
//    int_stellarbodydiscoveryscanner_advanced      (128663561L, new AdvancedDiscoveryScanner()),
//    int_stellarbodydiscoveryscanner_intermediate  (128663560L, new AdvancedDiscoveryScanner()),
//    int_stellarbodydiscoveryscanner_standard      (128662535L, new AdvancedDiscoveryScanner()),
//    int_stellarbodydiscoveryscanner_standard_free (128666642L, new AdvancedDiscoveryScanner()),
    ;

    public final long id;
    private final OwnableModule delegate;

    OptionalInternalModule(long id, OwnableModule delegate)
    {
        this.id = id;
        this.delegate = delegate;
    }

    @Override
    public TaskType modificationType()
    {
        return delegate.modificationType();
    }

    @Override
    public TaskType experimentalType()
    {
        return delegate.experimentalType();
    }

    @Override
    public String displayText()
    {
        return delegate.displayText();
    }


    @Override
    public ItemEffects itemEffects()
    {
        return delegate.itemEffects();
    }

    public static List<OwnableModule> findModulesBySize(int size)
    {
        return Stream.of(values())
                .filter(module -> module.itemEffects().effectByName(ItemEffect.Size)
                        .map(ItemEffectData::getDoubleValue)
                        .map(Double::intValue)
                        .filter(x -> x <= size)
                        .isPresent())
                .sorted(Comparator.comparingDouble(a -> a.itemEffects().effectByName(ItemEffect.Size)
                        .map(ItemEffectData::getDoubleValue)
                        .orElse(-1.0)))
                .collect(Collectors.toList());
    }

    public static OwnableModule findModule(String moduleName) throws Exception
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

        return Arrays.stream(OptionalInternalModule.values())
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

    public static OwnableModule findById(long itemId)
    {
        return Stream.of(values())
            .filter(item -> item.id == itemId)
            .findFirst()
            .orElse(null);
    }
}
