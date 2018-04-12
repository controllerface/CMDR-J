package com.controllerface.edeps.enums.procurements.technologies;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.CostData;
import com.controllerface.edeps.data.ModificationEffectData;
import com.controllerface.edeps.enums.common.ItemEffect;
import com.controllerface.edeps.enums.costs.commodities.Commodity;
import com.controllerface.edeps.enums.costs.materials.Material;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/12/2018.
 */
public enum TechnologyRecipe implements ProcurementRecipe
{
    // Human

    Corrosion_Resistant_Cargo_Rack("4E Cargo Rack", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Corrosion_Resistance, 0d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 18),
            new CostData(Material.IRON, 30),
            new CostData(Commodity.METAALLOYS, 28),
            new CostData(Commodity.RADIATIONBAFFLE, 30),
            new CostData(Commodity.NEOFABRICINSULATION, 12)),

    Enzyme_Missile_Rack_Fixed("Fixed", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Enzyme_Munitions, 0d)
            ),
            new CostData(Material.TUNGSTEN, 35),
            new CostData(Material.Thargoid_Energy_Cell, 30),
            new CostData(Material.Thargoid_Organic_Circuitry, 36),
            new CostData(Material.MOLYBDENUM, 34),
            new CostData(Commodity.RADIATIONBAFFLE, 6)),

    Meta_Alloy_Hull_Reinforcement("Hull Reinforcement Package", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Meta_Alloy_Reinforcement, 0d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 30),
            new CostData(Material.SHIELDPATTERNANALYSIS, 26),
            new CostData(Material.CONFIGURABLECOMPONENTS, 20),
            new CostData(Commodity.METAALLOYS, 28),
            new CostData(Commodity.REINFORCEDMOUNTINGPLATE, 12)),

    Remote_Release_Flechette_Launcher_Fixed("Fixed", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Remote_Release_Shell, 0d)
            ),
            new CostData(Material.RHENIUM, 28),
            new CostData(Material.IRON, 40),
            new CostData(Material.MOLYBDENUM, 36),
            new CostData(Material.GERMANIUM, 32),
            new CostData(Commodity.CMMCOMPOSITE, 8)),

    Remote_Release_Flechette_Launcher_Turreted("Turreted", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Remote_Release_Shell, 0d)
            ),
            new CostData(Material.RHENIUM, 28),
            new CostData(Material.IRON, 36),
            new CostData(Material.MOLYBDENUM, 32),
            new CostData(Material.GERMANIUM, 34),
            new CostData(Commodity.ARTICULATIONMOTORS, 10)),

    Shock_Cannon_Fixed("Fixed", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Shock_Shell, 0d)
            ),
            new CostData(Material.VANADIUM, 30),
            new CostData(Material.TUNGSTEN, 30),
            new CostData(Material.RHENIUM, 36),
            new CostData(Material.TECHNETIUM, 30),
            new CostData(Commodity.IONDISTRIBUTOR, 6)),

    Shock_Cannon_Gimballed("Gimbaled", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Shock_Shell, 0d)
            ),
            new CostData(Material.TUNGSTEN, 32),
            new CostData(Material.RHENIUM, 30),
            new CostData(Material.TECHNETIUM, 28),
            new CostData(Material.VANADIUM, 36),
            new CostData(Commodity.POWERCONVERTER, 10)),

    Shock_Cannon_Turreted("Turreted", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Shock_Shell, 0d)
            ),
            new CostData(Material.VANADIUM, 30),
            new CostData(Material.TUNGSTEN, 32),
            new CostData(Material.RHENIUM, 30),
            new CostData(Material.TECHNETIUM, 28),
            new CostData(Commodity.POWERTRANSFERBUS, 8)),


    // Guardian

    Guardian_FSD_Booster("FSD Boost Module", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.FSD_Boost, 0d)
            ),
            new CostData(Material.Guardian_Module_Blueprint_Segment, 8),
            new CostData(Material.Guardian_Power_Cell, 42),
            new CostData(Material.Guardian_Technology_Component, 42),
            new CostData(Material.FOCUSCRYSTALS, 24),
            new CostData(Commodity.HNSHOCKMOUNT, 8)),

    Guardian_Gauss_Cannon_Fixed("Fixed", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Gauss_Shell, 0d)
            ),
            new CostData(Material.Guardian_Weapon_Blueprint_Segment, 4),
            new CostData(Material.Guardian_Power_Cell, 36),
            new CostData(Material.Guardian_Technology_Component, 42),
            new CostData(Material.MANGANESE, 30),
            new CostData(Commodity.MAGNETICEMITTERCOIL, 10)),

    Guardian_Hybrid_Power_Distributor("Power Distributor", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Hybrid_Power, 0d)
            ),
            new CostData(Material.Guardian_Module_Blueprint_Segment, 4),
            new CostData(Material.Pattern_Alpha_Obelisk_Data, 27),
            new CostData(Material.Guardian_Power_Cell, 45),
            new CostData(Material.PHASEALLOYS, 36),
            new CostData(Commodity.HEATSINKINTERLINK, 6)),

    Guardian_Hybrid_Power_Plant("Power Plant", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Hybrid_Power, 0d)
            ),
            new CostData(Material.Guardian_Module_Blueprint_Segment, 4),
            new CostData(Material.Guardian_Power_Conduit, 36),
            new CostData(Material.Pattern_Epsilon_Obelisk_Data, 42),
            new CostData(Material.HEATRESISTANTCERAMICS, 30),
            new CostData(Commodity.ENERGYGRIDASSEMBLY, 10)),

    Guardian_Plasma_Charger_Fixed("Fixed", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Plasma_Weapon, 0d)
            ),
            new CostData(Material.Guardian_Weapon_Blueprint_Segment, 8),
            new CostData(Material.Guardian_Power_Conduit, 38),
            new CostData(Material.Guardian_Sentinel_Weapon_Parts, 34),
            new CostData(Material.CHROMIUM, 28),
            new CostData(Commodity.MICROWEAVECOOLINGHOSES, 12)),

    Guardian_Plasma_Charger_Turreted("Turreted", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Plasma_Weapon, 0d)
            ),
            new CostData(Material.Guardian_Weapon_Blueprint_Segment, 10),
            new CostData(Material.Guardian_Power_Conduit, 42),
            new CostData(Material.Guardian_Sentinel_Weapon_Parts, 42),
            new CostData(Material.CHROMIUM, 33),
            new CostData(Commodity.ARTICULATIONMOTORS, 10)),

    Guardian_Shard_Cannon_Fixed("Fixed", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Shard_Shell, 0d)
            ),
            new CostData(Material.Guardian_Weapon_Blueprint_Segment, 8),
            new CostData(Material.Guardian_Sentinel_Wreckage_Components, 40),
            new CostData(Material.Guardian_Technology_Component, 36),
            new CostData(Material.CARBON, 35),
            new CostData(Commodity.POWERTRANSFERBUS, 12)),

    Guardian_Shard_Cannon_Turreted("Turreted", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Shard_Shell, 0d)
            ),
            new CostData(Material.Guardian_Weapon_Blueprint_Segment, 10),
            new CostData(Material.Guardian_Sentinel_Wreckage_Components, 28),
            new CostData(Material.Guardian_Technology_Component, 40),
            new CostData(Material.CARBON, 30),
            new CostData(Commodity.MICROCONTROLLERS, 12));


    private final CostData[] cost;
    private final ModificationEffectData effects;
    private final String label;

    TechnologyRecipe(String label, ModificationEffectData effects, CostData... cost)
    {
        this.label = label;
        this.effects = effects;
        this.cost = cost;
    }

    public Stream<CostData> costStream()
    {
        return Arrays.stream(cost);
    }

    public ModificationEffectData effects()
    {
        return effects;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }

    public String getLabel()
    {
        return label;
    }
}
