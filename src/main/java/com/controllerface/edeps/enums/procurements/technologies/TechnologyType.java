package com.controllerface.edeps.enums.procurements.technologies;

import com.controllerface.edeps.ProcurementType;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/12/2018.
 */
public enum TechnologyType implements ProcurementType
{
    Human_Weapons(TechnologyBlueprint.Enzyme_Missile_Rack_Fixed,
            TechnologyBlueprint.Remote_Release_Flechette_Launcher_Turreted,
            TechnologyBlueprint.Shock_Cannon),

    Human_Optional_Internal(TechnologyBlueprint.Corrosion_Resistant_Cargo_Rack,
            TechnologyBlueprint.Meta_Alloy_Hull_Reinforcement),

    Guardian_Weapons(TechnologyBlueprint.Guardian_Gauss_Cannon,
            TechnologyBlueprint.Guardian_Plasma_Charger,
            TechnologyBlueprint.Guardian_Shard_Cannon),

    Guardian_Optional_Internal(TechnologyBlueprint.Guardian_FSD_Booster),

    Guardian_Core_Internal(TechnologyBlueprint.Guardian_Power_Plant,
            TechnologyBlueprint.Guardian_Hybrid_Power_Distributor);

    private final TechnologyBlueprint[] blueprints;

    TechnologyType(TechnologyBlueprint ... blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<TechnologyBlueprint> blueprintStream()
    {
        return Arrays.stream(blueprints);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
