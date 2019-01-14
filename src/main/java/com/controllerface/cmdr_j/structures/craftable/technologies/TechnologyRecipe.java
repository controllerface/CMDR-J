package com.controllerface.cmdr_j.structures.craftable.technologies;

import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.ShipModule;
import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;
import com.controllerface.cmdr_j.structures.equipment.modules.HardpointModule;
import com.controllerface.cmdr_j.structures.equipment.modules.OptionalInternalModule;
import com.controllerface.cmdr_j.structures.equipment.modules.OptionalInternalShieldModule;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum TechnologyRecipe implements ProcurementRecipe
{
    // Human

    Corrosion_Resistant_Cargo_Rack(new ShipModule[]{OptionalInternalModule.int_corrosionproofcargorack_size4_class1},
            ItemGrade.Technology, "4E Cargo Rack",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.CausticResistance, 0d)
                    ),
            new CostData(Material.CHEMICALMANIPULATORS, 18),
            new CostData(Material.IRON, 26),
            new CostData(Commodity.METAALLOYS, 16),
            new CostData(Commodity.RADIATIONBAFFLE, 22),
            new CostData(Commodity.NEOFABRICINSULATION, 12)),

    Enzyme_Missile_Rack_Fixed_Medium(new ShipModule[]{HardpointModule.hpt_causticmissile_fixed_medium},
            ItemGrade.Technology, "Medium Fixed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Enzyme_Munitions, 0d)
                    ),
            new CostData(Material.TUNGSTEN, 15),
            new CostData(Material.UNKNOWNENERGYCELL, 16),
            new CostData(Material.UNKNOWNORGANICCIRCUITRY, 18),
            new CostData(Material.MOLYBDENUM, 16),
            new CostData(Commodity.RADIATIONBAFFLE, 6)),

    Meta_Alloy_Hull_Reinforcement(new ShipModule[]
            {
                    OptionalInternalModule.int_metaalloyhullreinforcement_size1_class1,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size1_class2,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size2_class1,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size2_class2,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size3_class1,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size3_class2,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size4_class1,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size4_class2,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size5_class1,
                    OptionalInternalModule.int_metaalloyhullreinforcement_size5_class2
            },
            ItemGrade.Technology, "Hull Reinforcement Package",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Meta_Alloy_Reinforcement, 0d)
                    ),
            new CostData(Material.FOCUSCRYSTALS, 15),
            new CostData(Material.SHIELDPATTERNANALYSIS, 22),
            new CostData(Material.CONFIGURABLECOMPONENTS, 20),
            new CostData(Commodity.METAALLOYS, 16),
            new CostData(Commodity.REINFORCEDMOUNTINGPLATE, 12)),

    Remote_Release_Flechette_Launcher_Fixed_Medium(new ShipModule[]{HardpointModule.hpt_flechettelauncher_fixed_medium},
            ItemGrade.Technology, "Medium Fixed",
            new ItemEffects
                    (
                        new ItemEffectData(ItemEffect.Remote_Release_Shell, 0d)
                    ),
            new CostData(Material.RHENIUM, 22),
            new CostData(Material.IRON, 30),
            new CostData(Material.MOLYBDENUM, 24),
            new CostData(Material.GERMANIUM, 26),
            new CostData(Commodity.CMMCOMPOSITE, 8)),

    Remote_Release_Flechette_Launcher_Turreted_Medium(new ShipModule[]{HardpointModule.hpt_flechettelauncher_turret_medium},
            ItemGrade.Technology, "Medium Turreted",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Remote_Release_Shell, 0d)
                    ),
            new CostData(Material.RHENIUM, 20),
            new CostData(Material.IRON, 28),
            new CostData(Material.MOLYBDENUM, 28),
            new CostData(Material.GERMANIUM, 24),
            new CostData(Commodity.ARTICULATIONMOTORS, 10)),


    Shock_Cannon_Fixed_Large(new ShipModule[]{HardpointModule.hpt_plasmashockcannon_fixed_large},
            ItemGrade.Technology, "Large Fixed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shock_Shell, 0d)
                    ),
            new CostData(Material.VANADIUM, 28),
            new CostData(Material.TUNGSTEN, 26),
            new CostData(Material.RHENIUM, 20),
            new CostData(Material.TECHNETIUM, 26),
            new CostData(Commodity.POWERCONVERTER, 8)),


    Shock_Cannon_Fixed_Medium(new ShipModule[]{HardpointModule.hpt_plasmashockcannon_fixed_medium},
            ItemGrade.Technology, "Medium Fixed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shock_Shell, 0d)
                    ),
            new CostData(Material.VANADIUM, 24),
            new CostData(Material.TUNGSTEN, 26),
            new CostData(Material.RHENIUM, 20),
            new CostData(Material.TECHNETIUM, 28),
            new CostData(Commodity.IONDISTRIBUTOR, 6)),

    Shock_Cannon_Gimballed_Large(new ShipModule[]{HardpointModule.hpt_plasmashockcannon_gimbal_large},
            ItemGrade.Technology, "Large Gimballed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shock_Shell, 0d)
                    ),
            new CostData(Material.TUNGSTEN, 24),
            new CostData(Material.RHENIUM, 24),
            new CostData(Material.TECHNETIUM, 22),
            new CostData(Material.VANADIUM, 28),
            new CostData(Commodity.POWERTRANSFERCONDUITS, 12)),

    Shock_Cannon_Gimballed_Medium(new ShipModule[]{HardpointModule.hpt_plasmashockcannon_gimbal_medium},
            ItemGrade.Technology, "Medium Gimballed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shock_Shell, 0d)
                    ),
            new CostData(Material.TUNGSTEN, 22),
            new CostData(Material.RHENIUM, 20),
            new CostData(Material.TECHNETIUM, 28),
            new CostData(Material.VANADIUM, 24),
            new CostData(Commodity.POWERCONVERTER, 10)),

    Shock_Cannon_Turreted_Large(new ShipModule[]{HardpointModule.hpt_plasmashockcannon_turret_large},
            ItemGrade.Technology, "Large Turreted",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shock_Shell, 0d)
                    ),
            new CostData(Material.VANADIUM, 26),
            new CostData(Material.TUNGSTEN, 28),
            new CostData(Material.RHENIUM, 22),
            new CostData(Material.TECHNETIUM, 24),
            new CostData(Commodity.IONDISTRIBUTOR, 10)),

    Shock_Cannon_Turreted_Medium(new ShipModule[]{HardpointModule.hpt_plasmashockcannon_turret_medium},
            ItemGrade.Technology, "Medium Turreted",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shock_Shell, 0d)
                    ),
            new CostData(Material.VANADIUM, 24),
            new CostData(Material.TUNGSTEN, 22),
            new CostData(Material.RHENIUM, 20),
            new CostData(Material.TECHNETIUM, 28),
            new CostData(Commodity.POWERTRANSFERCONDUITS, 8)),


    // Guardian

    Guardian_FSD_Booster(new ShipModule[]{OptionalInternalModule.int_guardianfsdbooster_size1},
            ItemGrade.Technology, "FSD Boost Module",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.FSD_Boost, 0d)
                    ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCELL, 21),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 21),
            new CostData(Material.FOCUSCRYSTALS, 24),
            new CostData(Commodity.HNSHOCKMOUNT, 8)),

    Guardian_Shield_Booster(new ShipModule[]{OptionalInternalShieldModule.int_guardianshieldreinforcement_size1_class1},
            ItemGrade.Technology, "Shield Boost",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 0d)
                    ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCELL, 17),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 20),
            new CostData(Material.ANCIENTLANGUAGEDATA, 24),
            new CostData(Commodity.DIAGNOSTICSENSOR, 8)),

    Guardian_Hull_Reinforcement(new ShipModule[]{OptionalInternalModule.int_guardianhullreinforcement_size1_class1},
            ItemGrade.Technology, "Hull Reinforcement Package",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 0d)
                    ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 21),
            new CostData(Material.ANCIENTCULTURALDATA, 16),
            new CostData(Material.ANCIENTHISTORICALDATA, 16),
            new CostData(Commodity.REINFORCEDMOUNTINGPLATE, 12)),

    Guardian_Module_Reinforcement(new ShipModule[]{OptionalInternalModule.int_guardianmodulereinforcement_size1_class1},
            ItemGrade.Technology, "Module Reinforcement Package",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 0d)
                    ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 18),
            new CostData(Material.ANCIENTTECHNOLOGICALDATA, 15),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 20),
            new CostData(Commodity.REINFORCEDMOUNTINGPLATE, 9)),

    Guardian_Gauss_Cannon_Fixed_Medium(new ShipModule[]{HardpointModule.hpt_plasmashockcannon_fixed_medium},
            ItemGrade.Technology, "Medium Fixed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Gauss_Shell, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCELL, 18),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 20),
            new CostData(Material.MANGANESE, 15),
            new CostData(Commodity.MAGNETICEMITTERCOIL, 6)),

    Guardian_Hybrid_Power_Distributor(new ShipModule[]{OptionalInternalModule.int_guardianpowerdistributor_size1},
            ItemGrade.Technology, "Power Distributor",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Hybrid_Power, 0d)
                    ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.ANCIENTBIOLOGICALDATA, 20),
            new CostData(Material.GUARDIAN_POWERCELL, 24),
            new CostData(Material.PHASEALLOYS, 18),
            new CostData(Commodity.HEATSINKINTERLINK, 6)),

    Guardian_Hybrid_Power_Plant(new ShipModule[]{OptionalInternalModule.int_guardianpowerplant_size2},
            ItemGrade.Technology, "Power Plant",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Hybrid_Power, 0d)
                    ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 18),
            new CostData(Material.ANCIENTTECHNOLOGICALDATA, 21),
            new CostData(Material.HEATRESISTANTCERAMICS, 15),
            new CostData(Commodity.POWERGRIDASSEMBLY, 10)),

    Guardian_Plasma_Charger_Fixed_Large(new ShipModule[]{HardpointModule.hpt_guardian_plasmalauncher_fixed_large},
            ItemGrade.Technology, "Large Fixed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Plasma_Weapon, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 28),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 20),
            new CostData(Material.CHROMIUM, 28),
            new CostData(Commodity.COOLINGHOSES, 10)),

    Guardian_Plasma_Charger_Fixed_Medium(new ShipModule[]{HardpointModule.hpt_guardian_plasmalauncher_fixed_medium},
            ItemGrade.Technology, "Medium Fixed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Plasma_Weapon, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 19),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 16),
            new CostData(Material.CHROMIUM, 14),
            new CostData(Commodity.COOLINGHOSES, 8)),

    Guardian_Plasma_Charger_Turreted_Large(new ShipModule[]{HardpointModule.hpt_guardian_plasmalauncher_turret_large},
            ItemGrade.Technology, "Large Turreted",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Plasma_Weapon, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 2),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 26),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 24),
            new CostData(Material.CHROMIUM, 26),
            new CostData(Commodity.ARTICULATIONMOTORS, 10)),

    Guardian_Plasma_Charger_Turreted_Medium(new ShipModule[]{HardpointModule.hpt_guardian_plasmalauncher_turret_medium},
            ItemGrade.Technology, "Medium Turreted",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Plasma_Weapon, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 2),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 21),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 20),
            new CostData(Material.CHROMIUM, 16),
            new CostData(Commodity.ARTICULATIONMOTORS, 8)),

    Guardian_Shard_Cannon_Fixed_Large(new ShipModule[]{HardpointModule.hpt_guardian_shardcannon_fixed_large},
            ItemGrade.Technology, "Large Fixed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shard_Shell, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 20),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 28),
            new CostData(Material.CARBON, 20),
            new CostData(Commodity.MICROCONTROLLERS, 18)),

    Guardian_Shard_Cannon_Fixed_Medium(new ShipModule[]{HardpointModule.hpt_guardian_shardcannon_fixed_medium},
            ItemGrade.Technology, "Medium Fixed",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shard_Shell, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 20),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 18),
            new CostData(Material.CARBON, 14),
            new CostData(Commodity.POWERTRANSFERCONDUITS, 12)),

    Guardian_Shard_Cannon_Turreted_Large(new ShipModule[]{HardpointModule.hpt_guardian_shardcannon_turret_large},
            ItemGrade.Technology, "Large Turreted",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shard_Shell, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 2),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 20),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 26),
            new CostData(Material.CARBON, 28),
            new CostData(Commodity.MICROCONTROLLERS, 12)),

    Guardian_Shard_Cannon_Turreted_Medium(new ShipModule[]{HardpointModule.hpt_guardian_shardcannon_turret_medium},
            ItemGrade.Technology, "Medium Turreted",
            new ItemEffects
                    (
                            new ItemEffectData(ItemEffect.Shard_Shell, 0d)
                    ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 2),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 16),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 20),
            new CostData(Material.CARBON, 15),
            new CostData(Commodity.MICROCONTROLLERS, 12));


    private final ItemGrade grade;
    private final CostData[] cost;
    private final ItemEffects effects;
    private final String label;
    private final ShipModule[] modules;

    private static Icon icon = new Icon(UIFunctions.Icons.techBroker, 25, 25);

    TechnologyRecipe(ShipModule[] modules, ItemGrade grade, String label, ItemEffects effects, CostData... cost)
    {
        this.modules = modules;
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

    public ShipModule[] getModules()
    {
        return modules;
    }

    public static Optional<TechnologyRecipe> findRecipeForModule(ShipModule module)
    {
        return Stream.of(TechnologyRecipe.values())
                .filter(recipe -> Stream.of(recipe.modules).anyMatch(mod -> mod == module))
                .findFirst();
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

    @Override
    public Icon getIcon()
    {
        return icon;
    }
}
