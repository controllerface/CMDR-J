package com.controllerface.cmdr_j.structures.craftable.technologies;

import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum TechnologyRecipe implements ProcurementRecipe
{
    // Human

    Corrosion_Resistant_Cargo_Rack(ItemGrade.Technology, "4E Cargo Rack", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.CausticResistance, 0d)
            ),
            new CostData(Material.CHEMICALMANIPULATORS, 18),
            new CostData(Material.IRON, 30),
            new CostData(Commodity.METAALLOYS, 28),
            new CostData(Commodity.RADIATIONBAFFLE, 30),
            new CostData(Commodity.NEOFABRICINSULATION, 12)),

    Enzyme_Missile_Rack_Fixed(ItemGrade.Technology, "Fixed", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.enzyme_munitions, 0d)
            ),
            new CostData(Material.TUNGSTEN, 35),
            new CostData(Material.UNKNOWNENERGYCELL, 30),
            new CostData(Material.UNKNOWNORGANICCIRCUITRY, 36),
            new CostData(Material.MOLYBDENUM, 34),
            new CostData(Commodity.RADIATIONBAFFLE, 6)),

    Meta_Alloy_Hull_Reinforcement(ItemGrade.Technology, "Hull Reinforcement Package", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.meta_alloy_reinforcement, 0d)
            ),
            new CostData(Material.FOCUSCRYSTALS, 30),
            new CostData(Material.SHIELDPATTERNANALYSIS, 26),
            new CostData(Material.CONFIGURABLECOMPONENTS, 20),
            new CostData(Commodity.METAALLOYS, 28),
            new CostData(Commodity.REINFORCEDMOUNTINGPLATE, 12)),

    Remote_Release_Flechette_Launcher_Fixed(ItemGrade.Technology, "Fixed", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.remote_release_shell, 0d)
            ),
            new CostData(Material.RHENIUM, 28),
            new CostData(Material.IRON, 40),
            new CostData(Material.MOLYBDENUM, 36),
            new CostData(Material.GERMANIUM, 32),
            new CostData(Commodity.CMMCOMPOSITE, 8)),

    Remote_Release_Flechette_Launcher_Turreted(ItemGrade.Technology, "Turreted", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.remote_release_shell, 0d)
            ),
            new CostData(Material.RHENIUM, 28),
            new CostData(Material.IRON, 36),
            new CostData(Material.MOLYBDENUM, 32),
            new CostData(Material.GERMANIUM, 34),
            new CostData(Commodity.ARTICULATIONMOTORS, 10)),

    Shock_Cannon_Fixed(ItemGrade.Technology, "Fixed", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.shock_shell, 0d)
            ),
            new CostData(Material.VANADIUM, 30),
            new CostData(Material.TUNGSTEN, 30),
            new CostData(Material.RHENIUM, 36),
            new CostData(Material.TECHNETIUM, 30),
            new CostData(Commodity.IONDISTRIBUTOR, 6)),

    Shock_Cannon_Gimballed(ItemGrade.Technology, "Gimbaled", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.shock_shell, 0d)
            ),
            new CostData(Material.TUNGSTEN, 32),
            new CostData(Material.RHENIUM, 30),
            new CostData(Material.TECHNETIUM, 28),
            new CostData(Material.VANADIUM, 36),
            new CostData(Commodity.POWERCONVERTER, 10)),

    Shock_Cannon_Turreted(ItemGrade.Technology, "Turreted", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.shock_shell, 0d)
            ),
            new CostData(Material.VANADIUM, 30),
            new CostData(Material.TUNGSTEN, 32),
            new CostData(Material.RHENIUM, 30),
            new CostData(Material.TECHNETIUM, 28),
            new CostData(Commodity.POWERTRANSFERBUS, 8)),


    // Guardian

    Guardian_FSD_Booster(ItemGrade.Technology, "FSD Boost Module", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.fsd_boost, 0d)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 8),
            new CostData(Material.GUARDIAN_POWERCELL, 42),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 42),
            new CostData(Material.FOCUSCRYSTALS, 24),
            new CostData(Commodity.HNSHOCKMOUNT, 8)),

    Guardian_Gauss_Cannon_Fixed(ItemGrade.Technology, "Fixed", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.gauss_shell, 0d)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 4),
            new CostData(Material.GUARDIAN_POWERCELL, 36),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 42),
            new CostData(Material.MANGANESE, 30),
            new CostData(Commodity.MAGNETICEMITTERCOIL, 10)),

    Guardian_Hybrid_Power_Distributor(ItemGrade.Technology, "Power Distributor", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.hybrid_power, 0d)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 4),
            new CostData(Material.ANCIENTBIOLOGICALDATA, 27),
            new CostData(Material.GUARDIAN_POWERCELL, 45),
            new CostData(Material.PHASEALLOYS, 36),
            new CostData(Commodity.HEATSINKINTERLINK, 6)),

    Guardian_Hybrid_Power_Plant(ItemGrade.Technology, "Power Plant", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.hybrid_power, 0d)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 4),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 36),
            new CostData(Material.ANCIENTTECHNOLOGICALDATA, 42),
            new CostData(Material.HEATRESISTANTCERAMICS, 30),
            new CostData(Commodity.POWERGRIDASSEMBLY, 10)),

    Guardian_Plasma_Charger_Fixed(ItemGrade.Technology, "Fixed", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.plasma_weapon, 0d)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 8),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 38),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 34),
            new CostData(Material.CHROMIUM, 28),
            new CostData(Commodity.COOLINGHOSES, 12)),

    Guardian_Plasma_Charger_Turreted(ItemGrade.Technology, "Turreted", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.plasma_weapon, 0d)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 10),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 42),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 42),
            new CostData(Material.CHROMIUM, 33),
            new CostData(Commodity.ARTICULATIONMOTORS, 10)),

    Guardian_Shard_Cannon_Fixed(ItemGrade.Technology, "Fixed", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.shard_shell, 0d)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 8),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 40),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 36),
            new CostData(Material.CARBON, 35),
            new CostData(Commodity.POWERTRANSFERBUS, 12)),

    Guardian_Shard_Cannon_Turreted(ItemGrade.Technology, "Turreted", new ItemEffects
            (
                    new ItemEffectData(ItemEffect.shard_shell, 0d)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 10),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 28),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 40),
            new CostData(Material.CARBON, 30),
            new CostData(Commodity.MICROCONTROLLERS, 12));


    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;
    private final String label;

    TechnologyRecipe(ItemGrade grade, String label, ItemEffects effects, CostData... cost)
    {
        this.grade = grade;
        this.label = label;
        this.effects = effects;
        this.cost = cost;
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
        // no-op for tech broker unlocks, text is set in this constructor
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }

    @Override
    public String getShortLabel()
    {
        return label;
    }

    @Override
    public String getDisplayLabel()
    {
        return toString();
    }

    @Override
    public String getName()
    {
        return name();
    }
}
