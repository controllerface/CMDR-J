package com.controllerface.edeps.enums.experimentals;

import com.controllerface.edeps.data.MaterialInventoryData;
import com.controllerface.edeps.data.ModificationEffectData;
import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.modifications.ModificationEffect;
import javafx.util.Pair;

/**
 * Created by Stephen on 4/10/2018.
 */
public enum ExperimentalBlueprint
{
    Angled_Plating_Armor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Boost, -3d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 8d)
            ),
            new MaterialInventoryData(Material.COMPACTCOMPOSITES, 5),
            new MaterialInventoryData(Material.HIGHDENSITYCOMPOSITES, 3),
            new MaterialInventoryData(Material.ZIRCONIUM,3)),

    Angled_Plating_Hull(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Reinforcement, -5d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, 2d)
            ),
            new MaterialInventoryData(Material.TEMPEREDALLOYS, 5),
            new MaterialInventoryData(Material.ZIRCONIUM, 3),
            new MaterialInventoryData(Material.CARBON, 5),
            new MaterialInventoryData(Material.HIGHDENSITYCOMPOSITES, 3)),


    Auto_Loader(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Auto_Reload_While_Firing, 1d)
            ),
            new MaterialInventoryData(Material.MECHANICALEQUIPMENT, 4),
            new MaterialInventoryData(Material.MECHANICALCOMPONENTS, 3),
            new MaterialInventoryData(Material.HIGHDENSITYCOMPOSITES, 4)),

    Blast_Block(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Strength, -1d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, 2d)
            ),
            new MaterialInventoryData(Material.SHIELDSOAKANALYSIS, 5),
            new MaterialInventoryData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialInventoryData(Material.HEATDISPERSIONPLATE, 3),
            new MaterialInventoryData(Material.SELENIUM, 2)),

    Boss_Cells(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Spin_Up_Time, 20d),
                    new Pair<>(ModificationEffect.Shield_Reinforcement, 5d)
            ),
            new MaterialInventoryData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialInventoryData(Material.CHROMIUM, 3),
            new MaterialInventoryData(Material.POLYMERCAPACITORS, 1)),

    Cluster_Capacitors(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Weapons_Capacity, 8d),
                    new Pair<>(ModificationEffect.Weapons_Recharge, -2d),
                    new Pair<>(ModificationEffect.Engines_Capacity, 8d),
                    new Pair<>(ModificationEffect.Engines_Recharge, -2d),
                    new Pair<>(ModificationEffect.Systems_Capacity, 8d),
                    new Pair<>(ModificationEffect.Systems_Recharge, -2d)
            ),
            new MaterialInventoryData(Material.PHOSPHORUS, 5),
            new MaterialInventoryData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialInventoryData(Material.CADMIUM, 1)),

    Concordant_Sequence(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Wing_Shield_Regeneration, 1d),
                    new Pair<>(ModificationEffect.Thermal_Load, 50d)
            ),
            new MaterialInventoryData(Material.FOCUSCRYSTALS, 5),
            new MaterialInventoryData(Material.EMBEDDEDFIRMWARE, 3),
            new MaterialInventoryData(Material.ZIRCONIUM, 1)),

    Corrosive_Shell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Armor_Hardness_Reduced, 1d),
                    new Pair<>(ModificationEffect.Ammo_Capacity, -20d)
            ),
            new MaterialInventoryData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialInventoryData(Material.PRECIPITATEDALLOYS, 4),
            new MaterialInventoryData(Material.ARSENIC, 3)),

    Dazzle_Shell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Sensor_Acuity_Reduced, 1d)
            ),
            new MaterialInventoryData(Material.MECHANICALSCRAP, 5),
            new MaterialInventoryData(Material.MANGANESE, 4),
            new MaterialInventoryData(Material.HYBRIDCAPACITORS, 5)),

    Deep_Charge(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Power_Draw, 5d),
                    new Pair<>(ModificationEffect.Maximum_Fuel_Per_Jump, 10d)
            ),
            new MaterialInventoryData(Material.DISRUPTEDWAKEECHOES, 5),
            new MaterialInventoryData(Material.GALVANISINGALLOYS, 3),
            new MaterialInventoryData(Material.HYPERSPACETRAJECTORIES, 1)),

    Deep_Plating_Armor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Boost, 8d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -3d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -3d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -3d)
            ),
            new MaterialInventoryData(Material.COMPACTCOMPOSITES, 5),
            new MaterialInventoryData(Material.MECHANICALEQUIPMENT, 3),
            new MaterialInventoryData(Material.MOLYBDENUM, 2)),

    Deep_Plating_Hull(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Hull_Boost, 10d),
                    new Pair<>(ModificationEffect.Kinetic_Resistance, -2d),
                    new Pair<>(ModificationEffect.Thermal_Resistance, -2d),
                    new Pair<>(ModificationEffect.Explosive_Resitance, -2d)
            ),
            new MaterialInventoryData(Material.COMPACTCOMPOSITES, 5),
            new MaterialInventoryData(Material.MOLYBDENUM, 3),
            new MaterialInventoryData(Material.RUTHENIUM, 2)),

    Dispersal_Field(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Tracking_Reduced, 1d)
            ),
            new MaterialInventoryData(Material.CONDUCTIVECOMPONENTS, 5),
            new MaterialInventoryData(Material.HYBRIDCAPACITORS, 5),
            new MaterialInventoryData(Material.ARCHIVEDEMISSIONDATA, 5),
            new MaterialInventoryData(Material.WORNSHIELDEMITTERS, 5)),

    Double_Braced_Shield(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialInventoryData(Material.WORNSHIELDEMITTERS, 5),
            new MaterialInventoryData(Material.UNCUTFOCUSCRYSTALS, 3),
            new MaterialInventoryData(Material.CONFIGURABLECOMPONENTS, 1)),

    Double_Braced_Thrusters(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialInventoryData(Material.IRON, 5),
            new MaterialInventoryData(Material.HYBRIDCAPACITORS, 3),
            new MaterialInventoryData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Double_Braced_FSD(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 25d)
            ),
            new MaterialInventoryData(Material.DISRUPTEDWAKEECHOES, 5),
            new MaterialInventoryData(Material.GALVANISINGALLOYS, 3),
            new MaterialInventoryData(Material.CONFIGURABLECOMPONENTS, 1)),

    Double_Braced_Power_Plant(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialInventoryData(Material.GRIDRESISTORS, 5),
            new MaterialInventoryData(Material.VANADIUM, 3),
            new MaterialInventoryData(Material.FEDPROPRIETARYCOMPOSITES, 1)),


    Double_Braced_Distributor(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialInventoryData(Material.PHOSPHORUS, 5),
            new MaterialInventoryData(Material.HEATRESISTANTCERAMICS, 3),
            new MaterialInventoryData(Material.FEDPROPRIETARYCOMPOSITES, 1)),

    Double_Braced_Shield_Cell(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialInventoryData(Material.CHEMICALSTORAGEUNITS, 5),
            new MaterialInventoryData(Material.CHROMIUM, 3),
            new MaterialInventoryData(Material.YTTRIUM, 1)),

    Double_Braced_Weapon(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialInventoryData(Material.MECHANICALSCRAP, 5),
            new MaterialInventoryData(Material.COMPACTCOMPOSITES, 3),
            new MaterialInventoryData(Material.VANADIUM, 1)),

    Double_Braced_Booster(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Integrity, 15d)
            ),
            new MaterialInventoryData(Material.SHIELDCYCLERECORDINGS, 5),
            new MaterialInventoryData(Material.GALVANISINGALLOYS, 3),
            new MaterialInventoryData(Material.SHIELDEMITTERS, 1)),


    Drag_Drives(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Multiplier, 4d),
                    new Pair<>(ModificationEffect.Thermal_Load, 10d)
            ),
            new MaterialInventoryData(Material.IRON, 5),
            new MaterialInventoryData(Material.HYBRIDCAPACITORS, 3),
            new MaterialInventoryData(Material.SECURITYFIRMWARE, 1)),

    Drag_Munitions(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Speed_Reduced, 1d)
            ),
            new MaterialInventoryData(Material.CARBON, 5),
            new MaterialInventoryData(Material.GRIDRESISTORS, 5),
            new MaterialInventoryData(Material.MOLYBDENUM, 2)),

    Drive_Distributors(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Optimal_Mass, 10d)
            ),
            new MaterialInventoryData(Material.IRON, 5),
            new MaterialInventoryData(Material.HYBRIDCAPACITORS, 3),
            new MaterialInventoryData(Material.SECURITYFIRMWARE, 1)),

    Emissive_Munitions(new ModificationEffectData
            (
                    new Pair<>(ModificationEffect.Target_Signature_Increased, 1d),
                    new Pair<>(ModificationEffect.Thermal_Load, 100d)
            ),
            new MaterialInventoryData(Material.MECHANICALEQUIPMENT, 5),
            new MaterialInventoryData(Material.EMISSIONDATA, 3),
            new MaterialInventoryData(Material.HEATEXCHANGERS, 3),
            new MaterialInventoryData(Material.MANGANESE, 1)),

    Fast_Charge(effects, cost),

    Feedback_Cascade(effects, cost),

    Flow_Control_Distributor(effects, cost),

    Flow_Control_Shield_Cell(effects, cost),

    Flow_Control_Weapon(effects, cost),

    Flow_Control_Booster(effects, cost),

    Force_Block_Shield(effects, cost),

    Force_Block_Booster(effects, cost),

    Force_Shell(effects, cost),

    FSD_Interrupt(effects, cost),

    Hi_Cap(effects, cost),

    High_Yield_Shell(effects, cost),

    Incendiary_Rounds(effects, cost),

    Inertial_Impact(effects, cost),

    Ion_Disruption(effects, cost),

    Layered_Plating_Armor(effects, cost),

    Layered_Plating_Hl(effects, cost),

    Lo_draw(effects, cost),

    Mass_Lock_Munition(effects, cost),

    Mass_Manager(effects, cost),

    Monstered(effects, cost),

    Multi_servos(effects, cost),

    Multi_weave(effects, cost),

    Overload_Munitions(effects, cost),

    Oversized(effects, cost),

    Penetrator_Munitions(effects, cost),

    Penetrator_Payload(effects, cost),

    Phasing_Sequence(effects, cost),

    Plasma_Slug_Plasma_Accelerator(effects, cost),

    Plasma_Slug_Rail_Gun(effects, cost),

    Radiant_Canister(effects, cost),

    Recycling_Cell(effects, cost),

    Reflective_Plating_Armor(effects, cost),

    Reflective_Plating_Hull(effects, cost),

    Regeneration_Sequence(effects, cost),

    Reverberating_Cascade(effects, cost),

    Scramble_Spectrum(effects, cost),

    Screening_Shell(effects, cost),

    Shift_lock_Canister(effects, cost),

    Smart_Rounds(effects, cost),

    Stripped_Down_Shield(effects, cost),

    Stripped_Down_Thrusters(effects, cost),

    Stripped_Down_FSD(effects, cost),

    Stripped_Down_Power_Plant(effects, cost),

    Stripped_Down_Distributor(effects, cost),

    Stripped_Down_Shield_Cell(effects, cost),

    Stripped_Down_Weapon(effects, cost),

    Super_Capacitors(effects, cost),

    Super_Conduits(effects, cost),

    Super_Penetrator(effects, cost),

    Target_Lock_Breaker(effects, cost),

    Thermal_Cascade(effects, cost),

    Thermal_Conduit(effects, cost),

    Thermal_Shock(effects, cost),

    Thermal_Spread_Thrusters(effects, cost),

    Thermal_Spread_FSD(effects, cost),

    Thermal_Spread_Power_Plant(effects, cost),

    Thermal_Vent(effects, cost),

    Thermo_Block_Shield(effects, cost),

    Thermo_Block_Booster(effects, cost);

    private final MaterialInventoryData[] cost;
    private final ModificationEffectData effects;

    ExperimentalBlueprint(ModificationEffectData effects, MaterialInventoryData ... cost)
    {
        this.cost = cost;
        this.effects = effects;
    }
}
