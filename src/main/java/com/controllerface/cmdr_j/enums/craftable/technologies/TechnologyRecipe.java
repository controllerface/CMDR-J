package com.controllerface.cmdr_j.enums.craftable.technologies;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.recipes.techunlocks.*;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.HardpointModule;
import com.controllerface.cmdr_j.enums.equipment.modules.OptionalInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
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
    Corrosion_Resistant_Cargo_Rack(new Corrosion_Resistant_Cargo_Rack(),
            OptionalInternalModule.int_corrosionproofcargorack_size1_class1,
            OptionalInternalModule.int_corrosionproofcargorack_size1_class2,
            OptionalInternalModule.int_corrosionproofcargorack_size4_class1),

    Enzyme_Missile_Rack_Fixed_Medium(new Enzyme_Missile_Rack_Fixed_Medium(),
            HardpointModule.hpt_causticmissile_fixed_medium),

    Meta_Alloy_Hull_Reinforcement(new Meta_Alloy_Hull_Reinforcement(),
            OptionalInternalModule.int_metaalloyhullreinforcement_size1_class1,
            OptionalInternalModule.int_metaalloyhullreinforcement_size1_class2,
            OptionalInternalModule.int_metaalloyhullreinforcement_size2_class1,
            OptionalInternalModule.int_metaalloyhullreinforcement_size2_class2,
            OptionalInternalModule.int_metaalloyhullreinforcement_size3_class1,
            OptionalInternalModule.int_metaalloyhullreinforcement_size3_class2,
            OptionalInternalModule.int_metaalloyhullreinforcement_size4_class1,
            OptionalInternalModule.int_metaalloyhullreinforcement_size4_class2,
            OptionalInternalModule.int_metaalloyhullreinforcement_size5_class1,
            OptionalInternalModule.int_metaalloyhullreinforcement_size5_class2),

    Remote_Release_Flechette_Launcher_Fixed_Medium(new Remote_Release_Flechette_Launcher_Fixed_Medium(),
            HardpointModule.hpt_flechettelauncher_fixed_medium),

    Remote_Release_Flechette_Launcher_Turreted_Medium(new Remote_Release_Flechette_Launcher_Turreted_Medium(),
            HardpointModule.hpt_flechettelauncher_turret_medium),

    Shock_Cannon_Fixed_Large(new Shock_Cannon_Fixed_Large(),
            HardpointModule.hpt_plasmashockcannon_fixed_large),

    Shock_Cannon_Fixed_Medium(new Shock_Cannon_Fixed_Medium(),
            HardpointModule.hpt_plasmashockcannon_fixed_medium),

    Shock_Cannon_Gimballed_Large(new Shock_Cannon_Gimballed_Large(),
            HardpointModule.hpt_plasmashockcannon_gimbal_large),

    Shock_Cannon_Gimballed_Medium(new Shock_Cannon_Gimballed_Medium(),
            HardpointModule.hpt_plasmashockcannon_gimbal_medium),

    Shock_Cannon_Turreted_Large(new Shock_Cannon_Turreted_Large(),
            HardpointModule.hpt_plasmashockcannon_turret_large),

    Shock_Cannon_Turreted_Medium(new Shock_Cannon_Turreted_Medium(),
            HardpointModule.hpt_plasmashockcannon_turret_medium),

    Guardian_FSD_Booster(new Guardian_FSD_Booster(),
            OptionalInternalModule.int_guardianfsdbooster_size1,
            OptionalInternalModule.int_guardianfsdbooster_size2,
            OptionalInternalModule.int_guardianfsdbooster_size3,
            OptionalInternalModule.int_guardianfsdbooster_size4,
            OptionalInternalModule.int_guardianfsdbooster_size5),

    Guardian_Shield_Booster(new Guardian_Shield_Booster(),
            OptionalInternalModule.int_guardianshieldreinforcement_size1_class1,
            OptionalInternalModule.int_guardianshieldreinforcement_size1_class2,
            OptionalInternalModule.int_guardianshieldreinforcement_size2_class1,
            OptionalInternalModule.int_guardianshieldreinforcement_size2_class2,
            OptionalInternalModule.int_guardianshieldreinforcement_size3_class1,
            OptionalInternalModule.int_guardianshieldreinforcement_size3_class2,
            OptionalInternalModule.int_guardianshieldreinforcement_size4_class1,
            OptionalInternalModule.int_guardianshieldreinforcement_size4_class2,
            OptionalInternalModule.int_guardianshieldreinforcement_size5_class1,
            OptionalInternalModule.int_guardianshieldreinforcement_size5_class2),

    Guardian_Hull_Reinforcement(new Guardian_Hull_Reinforcement(),
            OptionalInternalModule.int_guardianhullreinforcement_size1_class1,
            OptionalInternalModule.int_guardianhullreinforcement_size1_class2,
            OptionalInternalModule.int_guardianhullreinforcement_size2_class1,
            OptionalInternalModule.int_guardianhullreinforcement_size2_class2,
            OptionalInternalModule.int_guardianhullreinforcement_size3_class1,
            OptionalInternalModule.int_guardianhullreinforcement_size3_class2,
            OptionalInternalModule.int_guardianhullreinforcement_size4_class1,
            OptionalInternalModule.int_guardianhullreinforcement_size4_class2,
            OptionalInternalModule.int_guardianhullreinforcement_size5_class1,
            OptionalInternalModule.int_guardianhullreinforcement_size5_class2),

    Guardian_Module_Reinforcement(new Guardian_Module_Reinforcement(),
            OptionalInternalModule.int_guardianmodulereinforcement_size1_class1,
            OptionalInternalModule.int_guardianmodulereinforcement_size1_class2,
            OptionalInternalModule.int_guardianmodulereinforcement_size2_class1,
            OptionalInternalModule.int_guardianmodulereinforcement_size2_class2,
            OptionalInternalModule.int_guardianmodulereinforcement_size3_class1,
            OptionalInternalModule.int_guardianmodulereinforcement_size3_class2,
            OptionalInternalModule.int_guardianmodulereinforcement_size4_class1,
            OptionalInternalModule.int_guardianmodulereinforcement_size4_class2,
            OptionalInternalModule.int_guardianmodulereinforcement_size5_class1,
            OptionalInternalModule.int_guardianmodulereinforcement_size5_class2),

    Guardian_Gauss_Cannon_Fixed_Medium(new Guardian_Gauss_Cannon_Fixed_Medium(),
            HardpointModule.hpt_plasmashockcannon_fixed_medium),

    Guardian_Hybrid_Power_Distributor(new Guardian_Hybrid_Power_Distributor(),
            CoreInternalModule.int_guardianpowerdistributor_size1,
            CoreInternalModule.int_guardianpowerdistributor_size2,
            CoreInternalModule.int_guardianpowerdistributor_size3,
            CoreInternalModule.int_guardianpowerdistributor_size4,
            CoreInternalModule.int_guardianpowerdistributor_size5,
            CoreInternalModule.int_guardianpowerdistributor_size6,
            CoreInternalModule.int_guardianpowerdistributor_size7,
            CoreInternalModule.int_guardianpowerdistributor_size8),

    Guardian_Hybrid_Power_Plant(new Guardian_Hybrid_Power_Plant(),
            CoreInternalModule.int_guardianpowerplant_size2,
            CoreInternalModule.int_guardianpowerplant_size3,
            CoreInternalModule.int_guardianpowerplant_size4,
            CoreInternalModule.int_guardianpowerplant_size5,
            CoreInternalModule.int_guardianpowerplant_size6,
            CoreInternalModule.int_guardianpowerplant_size7,
            CoreInternalModule.int_guardianpowerplant_size8),

    Guardian_Plasma_Charger_Fixed_Large(new Guardian_Plasma_Charger_Fixed_Large(),
            HardpointModule.hpt_guardian_plasmalauncher_fixed_large),

    Guardian_Plasma_Charger_Fixed_Medium(new Guardian_Plasma_Charger_Fixed_Medium(),
            HardpointModule.hpt_guardian_plasmalauncher_fixed_medium),

    Guardian_Plasma_Charger_Turreted_Large(new Guardian_Plasma_Charger_Turreted_Large(),
            HardpointModule.hpt_guardian_plasmalauncher_turret_large),

    Guardian_Plasma_Charger_Turreted_Medium(new Guardian_Plasma_Charger_Turreted_Medium(),
            HardpointModule.hpt_guardian_plasmalauncher_turret_medium),

    Guardian_Shard_Cannon_Fixed_Large(new Guardian_Shard_Cannon_Fixed_Large(),
            HardpointModule.hpt_guardian_shardcannon_fixed_large),

    Guardian_Shard_Cannon_Fixed_Medium(new Guardian_Shard_Cannon_Fixed_Medium(),
            HardpointModule.hpt_guardian_shardcannon_fixed_medium),

    Guardian_Shard_Cannon_Turreted_Large(new Guardian_Shard_Cannon_Turreted_Large(),
            HardpointModule.hpt_guardian_shardcannon_turret_large),

    Guardian_Shard_Cannon_Turreted_Medium(new Guardian_Shard_Cannon_Turreted_Medium(),
            HardpointModule.hpt_guardian_shardcannon_turret_medium),

    ;

    private final ProcurementRecipe delegate;
    private final ShipModule[] modules;

    private static Icon icon = new Icon(UIFunctions.Icons.techBroker, 25, 25);

    TechnologyRecipe(ProcurementRecipe delegate, ShipModule ... modules)
    {
        this.delegate = delegate;
        this.modules = modules;
        delegate.costStream().forEach(c->c.getCost().associate(this));
    }

    public static Optional<TechnologyRecipe> findRecipeForModule(ShipModule module)
    {
        return Stream.of(TechnologyRecipe.values())
                .filter(recipe -> Stream.of(recipe.modules).anyMatch(mod -> mod == module))
                .findFirst();
    }

    public ShipModule[] getModules()
    {
        return modules;
    }

    @Override
    public ItemGrade getGrade()
    {
        return delegate.getGrade();
    }

    public Stream<CostData> costStream()
    {
        return delegate.costStream();
    }

    public ItemEffects effects()
    {
        return delegate.effects();
    }

    @Override
    public void setParentBlueprintName(String blueprintName)
    {
        delegate.setParentBlueprintName(blueprintName);
    }

    @Override
    public String getParentBlueprintName()
    {
        return delegate.getParentBlueprintName();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }

    @Override
    public String getShortLabel()
    {
        return delegate.getShortLabel();
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
        return delegate.getIcon();
    }
}
