package com.controllerface.cmdr_j.structures.craftable.technologies;

import com.controllerface.cmdr_j.ProcurementBlueprint;
import com.controllerface.cmdr_j.ProcurementType;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum TechnologyType implements ProcurementType
{
    Human_Weapons(EnumSet.of(TechnologyBlueprint.Enzyme_Missile_Rack_Fixed,
            TechnologyBlueprint.Remote_Release_Flechette_Launcher_Turreted,
            TechnologyBlueprint.Shock_Cannon)),

    Human_Optional_Internal(EnumSet.of(TechnologyBlueprint.Corrosion_Resistant_Cargo_Rack,
            TechnologyBlueprint.Meta_Alloy_Hull_Reinforcement)),

    Guardian_Weapons(EnumSet.of(TechnologyBlueprint.Guardian_Gauss_Cannon,
            TechnologyBlueprint.Guardian_Plasma_Charger,
            TechnologyBlueprint.Guardian_Shard_Cannon)),

    Guardian_Optional_Internal(EnumSet.of(TechnologyBlueprint.Guardian_FSD_Booster,
            TechnologyBlueprint.Guardian_Shield_Booster,
            TechnologyBlueprint.Guardian_Hull_Reinforcement,
            TechnologyBlueprint.Guardian_Module_Reinforcement)),

    Guardian_Core_Internal(EnumSet.of(TechnologyBlueprint.Guardian_Power_Plant,
            TechnologyBlueprint.Guardian_Hybrid_Power_Distributor));

    private final EnumSet<TechnologyBlueprint> blueprints;

    TechnologyType(EnumSet<TechnologyBlueprint> blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<TechnologyBlueprint> blueprintStream()
    {
        return blueprints.stream();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }

    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public List<ProcurementBlueprint> getBluePrints()
    {
        return new ArrayList<>(blueprints);
    }
}
