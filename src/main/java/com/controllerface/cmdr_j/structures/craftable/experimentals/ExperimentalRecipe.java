package com.controllerface.cmdr_j.structures.craftable.experimentals;

import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.scene.shape.SVGPath;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/10/2018.
 */
@SuppressWarnings("unchecked")
public enum ExperimentalRecipe implements ProcurementRecipe
{
    //todo: find info on these possible effects. They were found in some coriolis data, but I was unable to find them
    // listed anywhere else. Could just be some kind of hold over or mistake, but worth investigating:
    //
    //   - special_choke_canister
    //      unknown
    //
    //   - special_distortion_field
    //      unknown
    //
    //   - special_deep_cut_payload
    //      possible alias of Penetrator Payload mod
    //
    //   - special_mass_lock
    //      possible alias of Mass Lock Munition mod
    //


    special_armour_kinetic("Angled Plating", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -3d),
                    new ItemEffectData(ItemEffect.KineticResistance, 8d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.ZIRCONIUM,3)),

    special_hullreinforcement_kinetic("Angled Plating", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -5d),
                    new ItemEffectData(ItemEffect.KineticResistance, 2d)
            ),
            new CostData(Material.TEMPEREDALLOYS, 5),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.CARBON, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3)),

    special_auto_loader("Auto Loader", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Auto_Reload_While_Firing, 0d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 4),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 4)),

    special_shieldbooster_explosive("Blast Block", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -1d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 2d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.SELENIUM, 2)),

    special_shieldcell_oversized("Boss Cells", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ShieldBankSpinUp, 20d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement, 5d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    special_powerdistributor_capacity("Cluster Capacitors", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.WeaponsCapacity, 8d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, -2d),
                    new ItemEffectData(ItemEffect.EnginesCapacity, 8d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, -2d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, 8d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, -2d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CADMIUM, 1)),

    special_concordant_sequence("Concordant Sequence", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Wing_Shield_Regeneration_Increased, 0d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 50d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.EMBEDDEDFIRMWARE, 3),
            new CostData(Material.ZIRCONIUM, 1)),

    special_corrosive_shell("Corrosive Shell", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Armor_Hardness_Reduced, 0d),
                    new ItemEffectData(ItemEffect.AmmoMaximum, -20d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.PRECIPITATEDALLOYS, 4),
            new CostData(Material.ARSENIC, 3)),

    special_blinding_shell("Dazzle Shell", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Sensor_Acuity_Reduced, 0d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.MANGANESE, 4),
            new CostData(Material.HYBRIDCAPACITORS, 5)),

    special_fsd_fuelcapacity("Deep Charge", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 5d),
                    new ItemEffectData(ItemEffect.MaxFuelPerJump, 10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1)),

    special_armour_chunky("Deep Plating", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 8d),
                    new ItemEffectData(ItemEffect.KineticResistance, -3d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -3d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -3d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.MECHANICALEQUIPMENT, 3),
            new CostData(Material.MOLYBDENUM, 2)),

    special_hullreinforcement_chunky("Deep Plating", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 10d),
                    new ItemEffectData(ItemEffect.KineticResistance, -2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -2d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -2d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.MOLYBDENUM, 3),
            new CostData(Material.RUTHENIUM, 2)),

    special_dispersal_field("Dispersal Field", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Tracking_Reduced, 0d)
            ),
            new CostData(Material.CONDUCTIVECOMPONENTS, 5),
            new CostData(Material.HYBRIDCAPACITORS, 5),
            new CostData(Material.ARCHIVEDEMISSIONDATA, 5),
            new CostData(Material.WORNSHIELDEMITTERS, 5)),

    special_shield_toughened("Double Braced", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    special_engine_toughened("Double Braced", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    special_fsd_toughened("Double Braced", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    special_powerplant_toughened("Double Braced", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    special_powerdistributor_toughened("Double Braced", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    special_shieldcell_toughened("Double Braced", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.YTTRIUM, 1)),

    special_weapon_toughened("Double Braced", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.COMPACTCOMPOSITES, 3),
            new CostData(Material.VANADIUM, 1)),

    special_shieldbooster_toughened("Double Braced", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, 15d)
            ),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.SHIELDEMITTERS, 1)),

    special_engine_overloaded("Drag Drives", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EngineOptPerformance, 4d),
                    new ItemEffectData(ItemEffect.EngineHeatRate, 10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    special_drag_munitions("Drag Munitions", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Speed_Reduced, 0d)
            ),
            new CostData(Material.CARBON, 5),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.MOLYBDENUM, 2)),

    special_engine_haulage("Drive Distributors", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.EngineOptimalMass, 10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    special_emissive_munitions("Emissive Munitions", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Signature_Increased, 0d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 100d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.EMISSIONDATA, 3),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.MANGANESE, 1)),

    special_shield_regenerative("Fast Charge", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.RegenRate, 15d),
                    new ItemEffectData(ItemEffect.BrokenRegenRate, 15d),
                    new ItemEffectData(ItemEffect.KineticResistance, -1d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -1d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -1d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.COMPOUNDSHIELDING, 1)),

    // todo: this is a legacy mod, so should not be craftable, but may appear in journal files.
    // figure out how to handle this
    special_feedback_cascade("Feedback Cascade (Legacy)", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Shield_Cell_Disrupted, 0d),
                    new ItemEffectData(ItemEffect.Damage, -20d)
            ),
            new CostData(Material.SYMMETRICKEYS, 5),
            new CostData(Material.SHIELDEMITTERS, 5),
            new CostData(Material.FILAMENTCOMPOSITES, 5)),


    special_feedback_cascade_cooled("Feedback Cascade", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Shield_Cell_Disrupted, 0d),
                    new ItemEffectData(ItemEffect.Damage, -20d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -40d)
            ),
            new CostData(Material.SYMMETRICKEYS, 5),
            new CostData(Material.SHIELDEMITTERS, 5),
            new CostData(Material.FILAMENTCOMPOSITES, 5)),

    special_powerdistributor_efficient("Flow Control", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    special_shieldcell_efficient("Flow Control", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    special_weapon_efficient("Flow Control", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 1)),

    special_shieldbooster_efficient("Flow Control", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, -10d)
            ),
            new CostData(Material.SHIELDSOAKANALYSIS, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.FOCUSCRYSTALS, 3),
            new CostData(Material.NIOBIUM, 3)),

    special_shield_kinetic("Force Block", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -3d),
                    new ItemEffectData(ItemEffect.KineticResistance, 8d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.DECODEDEMISSIONDATA, 1)),

    special_shieldbooster_kinetic("Force Block", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -1d),
                    new ItemEffectData(ItemEffect.KineticResistance, 2d)
            ),
            new CostData(Material.SCANARCHIVES, 5),
            new CostData(Material.SHIELDINGSENSORS, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 2)),

    special_force_shell("Force Shell", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Pushed_Off_Course, 0d),
                    new ItemEffectData(ItemEffect.ShotSpeed, -16.67d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.ZINC, 5),
            new CostData(Material.PHASEALLOYS, 3),
            new CostData(Material.HEATCONDUCTIONWIRING, 3)),

    special_fsd_interrupt("FSD Interrupt", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_FSD_Reboot, 0d),
                    new ItemEffectData(ItemEffect.Damage, -30d),
                    new ItemEffectData(ItemEffect.RateOfFire, -50d)
            ),
            new CostData(Material.WAKESOLUTIONS, 3),
            new CostData(Material.FSDTELEMETRY, 5),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.CONFIGURABLECOMPONENTS, 3)),

    special_shield_health("Hi-Cap", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 6d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 25d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    special_high_yield_shell("High Yield Shell", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage_Partially_Explosive, 0d),
                    new ItemEffectData(ItemEffect.RateOfFire, -11.11d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.CHEMICALMANIPULATORS, 3),
            new CostData(Material.NICKEL, 5)),

    special_incendiary_rounds("Incendiary Rounds", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage_Partially_Thermal, 0d),
                    new ItemEffectData(ItemEffect.RateOfFire, -5.26d),
                    new ItemEffectData(ItemEffect.ThermalLoad, 200d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.PHASEALLOYS, 3)),

    special_inertial_impact("Inertial Impact", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage_Partially_Kinetic, 0d),
                    new ItemEffectData(ItemEffect.Damage, 50d),
                    new ItemEffectData(ItemEffect.Jitter, 3d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5)),

    special_ion_disruptor("Ion Disruptor", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Thrusters_Reboot, 0d)
            ),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.CHEMICALDISTILLERY, 3),
            new CostData(Material.ELECTROCHEMICALARRAYS, 3)),

    special_armour_explosive("Layered Plating", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -3d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 8d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.NIOBIUM, 1)),

    special_hullreinforcement_explosive("Layered Plating", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -5d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 2d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.SHIELDINGSENSORS, 3),
            new CostData(Material.TUNGSTEN, 3)),

    special_shield_efficient("Lo-Draw", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, -20d),
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -2d),
                    new ItemEffectData(ItemEffect.DistributorDraw, -20d),
                    new ItemEffectData(ItemEffect.KineticResistance, -1d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -1d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -1d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.CONDUCTIVEPOLYMERS, 1)),

    special_mass_lock_munition("Mass Lock Munition", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_FSD_Inhibited, 0d)
            ),
            new CostData(Material.MECHANICALEQUIPMENT, 5),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 3)),

    special_fsd_heavy("Mass Manager", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Integrity, -8d),
                    new ItemEffectData(ItemEffect.FSDOptimalMass, 4d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HYPERSPACETRAJECTORIES, 1)),

    special_powerplant_highcharge("Monstered", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 10d),
                    new ItemEffectData(ItemEffect.PowerCapacity, 5d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.POLYMERCAPACITORS, 1)),

    special_weapon_rateoffire("Multi-Servos", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 5d),
                    new ItemEffectData(ItemEffect.RateOfFire, 3d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.FOCUSCRYSTALS, 4),
            new CostData(Material.CONDUCTIVEPOLYMERS, 2),
            new CostData(Material.CONFIGURABLECOMPONENTS, 2)),

    special_shield_resistive("Multi-Weave", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 10d),
                    new ItemEffectData(ItemEffect.DistributorDraw, 25d),
                    new ItemEffectData(ItemEffect.KineticResistance, 3d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 3d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, 3d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.SHIELDPATTERNANALYSIS, 1)),

    special_overload_munitions("Overload Munitions", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage_Partially_Thermal, 0d)
            ),
            new CostData(Material.FILAMENTCOMPOSITES, 5),
            new CostData(Material.ENCRYPTIONCODES, 4),
            new CostData(Material.SHIELDPATTERNANALYSIS, 2),
            new CostData(Material.GERMANIUM, 3)),

    special_weapon_damage("Oversized", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.PowerDraw, 5d),
                    new ItemEffectData(ItemEffect.Damage, 3d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.RUTHENIUM, 1)),

    special_penetrator_munitions("Penetrator Munitions", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Module_Damage, 0d)
            ),
            new CostData(Material.GALVANISINGALLOYS, 5),
            new CostData(Material.ELECTROCHEMICALARRAYS, 3),
            new CostData(Material.ZIRCONIUM, 3)),

    special_penetrator_payload("Penetrator Payload", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Module_Damage, 0d)
            ),
            new CostData(Material.MECHANICALCOMPONENTS, 3),
            new CostData(Material.TUNGSTEN, 3),
            new CostData(Material.BULKSCANDATA, 5),
            new CostData(Material.SELENIUM, 3)),

    special_phasing_sequence("Phasing Sequence", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Part_of_Damage_Through_Shields, 0d),
                    new ItemEffectData(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.SHIELDPATTERNANALYSIS, 3),
            new CostData(Material.NIOBIUM, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 3)),

    // todo: this is a legacy mod, so should not be craftable, but may appear in journal files.
    // figure out how to handle this
//    special_plasma_slug("Plasma Slug (Legacy)", ItemGrade.Experimental, new ItemEffects
//            (
//                    new ItemEffectData(ItemEffect.Reload_from_Ship_Fuel, 0d),
//                    new ItemEffectData(ItemEffect.Damage, -10d),
//                    new ItemEffectData(ItemEffect.AmmoMaximum, -100d)
//            ),
//            new CostData(Material.HEATEXCHANGERS, 3),
//            new CostData(Material.EMBEDDEDFIRMWARE, 2),
//            new CostData(Material.REFINEDFOCUSCRYSTALS, 2),
//            new CostData(Material.MERCURY, 4)),

    special_plasma_slug("Plasma Slug", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Reload_from_Ship_Fuel, 0d),
                    new ItemEffectData(ItemEffect.Damage, -10d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -40d),
                    new ItemEffectData(ItemEffect.AmmoMaximum, -100d)
            ),
            new CostData(Material.HEATEXCHANGERS, 3),
            new CostData(Material.EMBEDDEDFIRMWARE, 2),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 2),
            new CostData(Material.MERCURY, 4)),

    special_radiant_canister("Radiant Canister", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Area_Heat_Increased_Sensors_Disrupted, 0d)
            ),
            new CostData(Material.POLONIUM, 1),
            new CostData(Material.PHASEALLOYS, 3),
            new CostData(Material.HEATDISPERSIONPLATE, 4)),

    special_shieldcell_gradual("Recycling Cell", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ShieldBankDuration, 10d),
                    new ItemEffectData(ItemEffect.ShieldBankReinforcement, -5d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1)),

    special_armour_thermic("Reflective Plating", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -3d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 8d)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.THERMICALLOYS, 2)),

    special_hullreinforcement_thermic("Reflective Plating", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -5d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 2d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.ZINC, 4)),

    special_regeneration_sequence("Regeneration Sequence", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Wing_Shield_Regeneration, 0d),
                    new ItemEffectData(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.SHIELDINGSENSORS, 4),
            new CostData(Material.SHIELDFREQUENCYDATA, 1)),

    special_reverberating_cascade("Reverberating Cascade", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Shield_Generator_Damaged, 0d)
            ),
            new CostData(Material.CONFIGURABLECOMPONENTS, 2),
            new CostData(Material.SCANDATABANKS, 3),
            new CostData(Material.FILAMENTCOMPOSITES, 4),
            new CostData(Material.CHROMIUM, 4)),

    special_scramble_spectrum("Scramble Spectrum", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Module_Malfunction, 0d),
                    new ItemEffectData(ItemEffect.RateOfFire, -11.11d)
            ),
            new CostData(Material.CRYSTALSHARDS, 5),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 5)),

    special_screening_shell("Screening Shell", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Effectiveness_Increase_Against_Munitions, 0d),
                    new ItemEffectData(ItemEffect.ReloadTime, -50d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.SHIELDCYCLERECORDINGS, 5),
            new CostData(Material.CONSUMERFIRMWARE, 5),
            new CostData(Material.NIOBIUM, 3)),

    special_shiftlock_canister("Shift-Lock Canister", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Area_FSD_Reboot, 0d)
            ),
            new CostData(Material.TEMPEREDALLOYS, 5),
            new CostData(Material.WAKESOLUTIONS, 3),
            new CostData(Material.SALVAGEDALLOYS, 5)),

    special_smart_rounds("Smart Rounds", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.No_Damage_to_Untargeted_Ships, 0d)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.DECODEDEMISSIONDATA, 3),
            new CostData(Material.SCANDATABANKS, 3)),

    special_shield_lightweight("Stripped Down", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    special_engine_lightweight("Stripped Down", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    special_fsd_lightweight("Stripped Down", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    special_powerplant_lightweight("Stripped Down", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    special_powerdistributor_lightweight("Stripped Down", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    special_shieldcell_lightweight("Stripped Down", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1)),

    special_weapon_lightweight("Stripped Down", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, -10d)
            ),
            new CostData(Material.SALVAGEDALLOYS, 5),
            new CostData(Material.CARBON, 5),
            new CostData(Material.TIN, 1)),

    special_shieldbooster_chunky("Super Capacitors", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 5d),
                    new ItemEffectData(ItemEffect.KineticResistance, -2d),
                    new ItemEffectData(ItemEffect.ThermicResistance, -2d),
                    new ItemEffectData(ItemEffect.ExplosiveResistance, -2d)
            ),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.CADMIUM, 2)),

    special_powerdistributor_fast("Super Conduits", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.WeaponsCapacity, -4d),
                    new ItemEffectData(ItemEffect.WeaponsRecharge, 4d),
                    new ItemEffectData(ItemEffect.EnginesCapacity, -4d),
                    new ItemEffectData(ItemEffect.EnginesRecharge, 4d),
                    new ItemEffectData(ItemEffect.SystemsCapacity, -4d),
                    new ItemEffectData(ItemEffect.SystemsRecharge, 4d)
            ),
            new CostData(Material.PHOSPHORUS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.SECURITYFIRMWARE, 1)),

    // todo: this is a legacy mod, so should not be craftable, but may appear in journal files.
    // figure out how to handle this
    special_super_penetrator("Super Penetrator (Legacy)", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Module_Damage, 0d),
                    new ItemEffectData(ItemEffect.ReloadTime, 50d)
            ),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.SHIELDDENSITYREPORTS, 5)),

    special_super_penetrator_cooled("Super Penetrator", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Module_Damage, 0d),
                    new ItemEffectData(ItemEffect.ThermalLoad, -40d)
            ),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.REFINEDFOCUSCRYSTALS, 3),
            new CostData(Material.ZIRCONIUM, 3),
            new CostData(Material.SHIELDDENSITYREPORTS, 5)),

    special_lock_breaker("Target Lock Breaker", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Loses_Target_Lock, 0d)
            ),
            new CostData(Material.SELENIUM, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1)),

    special_thermal_cascade("Thermal Cascade", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Shielded_Target_Heat_Increased, 0d)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HYBRIDCAPACITORS, 4),
            new CostData(Material.HIGHDENSITYCOMPOSITES, 3),
            new CostData(Material.PHOSPHORUS, 5)),

    special_thermal_conduit("Thermal Conduit", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Damage_Increases_with_Heat_Level, 0d)
            ),
            new CostData(Material.HEATDISPERSIONPLATE, 5),
            new CostData(Material.SULPHUR, 5),
            new CostData(Material.TEMPEREDALLOYS, 5)),

    special_thermal_shock("Thermal Shock", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Target_Heat_Increased, 0d),
                    new ItemEffectData(ItemEffect.Damage, -10d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.CONDUCTIVECOMPONENTS, 3),
            new CostData(Material.TUNGSTEN, 3)),

    special_engine_cooled("Thermal Spread", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Mass, 15d),
                    new ItemEffectData(ItemEffect.EngineHeatRate, -10d)
            ),
            new CostData(Material.IRON, 5),
            new CostData(Material.HYBRIDCAPACITORS, 3),
            new CostData(Material.HEATVANES, 1)),

    special_fsd_cooled("Thermal Spread", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.FSDHeatRate, -10d)
            ),
            new CostData(Material.DISRUPTEDWAKEECHOES, 5),
            new CostData(Material.GALVANISINGALLOYS, 3),
            new CostData(Material.HEATVANES, 1),
            new CostData(Material.GRIDRESISTORS, 3)),

    special_powerplant_cooled("Thermal Spread", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.ThermalLoad, -10d)
            ),
            new CostData(Material.GRIDRESISTORS, 5),
            new CostData(Material.VANADIUM, 3),
            new CostData(Material.HEATVANES, 1)),

    special_thermal_vent("Thermal Vent", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.Heat_Reduced_when_Striking_Target, 0d)
            ),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 5),
            new CostData(Material.CONDUCTIVEPOLYMERS, 3),
            new CostData(Material.PRECIPITATEDALLOYS, 3)),


    special_shield_thermic("Thermo Block", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -3d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 8d)
            ),
            new CostData(Material.WORNSHIELDEMITTERS, 5),
            new CostData(Material.UNCUTFOCUSCRYSTALS, 3),
            new CostData(Material.HEATVANES, 1)),

    special_shieldbooster_thermic("Thermo Block", ItemGrade.Experimental, new ItemEffects
            (
                    new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, -1d),
                    new ItemEffectData(ItemEffect.ThermicResistance, 2d)
            ),
            new CostData(Material.BULKSCANDATA, 5),
            new CostData(Material.CONDUCTIVECERAMICS, 3),
            new CostData(Material.HEATVANES, 3)),

    Unknown("Unknown", ItemGrade.Experimental,new ItemEffects())

    ;

    private final String displayText;
    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;

    private static Icon icon = new Icon(UIFunctions.Icons.engineering, 25, 30);

    ExperimentalRecipe(String displayText, ItemGrade grade, ItemEffects effects, CostData... cost)
    {
        this.displayText = displayText;
        this.grade = grade;
        this.cost = cost;
        this.effects = effects;
        Arrays.stream(cost).forEach(c->c.getCost().associate(this));
    }

    @Override
    public ItemGrade getGrade()
    {
        return grade;
    }

    public Stream<CostData> costStream()
    {
        return Arrays.stream(cost);
    }

    public ItemEffects effects()
    {
        return effects;
    }

    @Override
    public void setParentBlueprintName(String blueprintName)
    {
        // no-op for experimental effects, text is set in this constructor
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }

    @Override
    public String getShortLabel()
    {
        return displayText;
    }

    @Override
    public String getDisplayLabel()
    {
        return getShortLabel();
    }

    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public Icon getIcon()
    {
        return icon;
    }
}
