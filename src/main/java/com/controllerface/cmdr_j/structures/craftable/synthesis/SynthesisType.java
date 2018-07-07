package com.controllerface.cmdr_j.structures.craftable.synthesis;

import com.controllerface.cmdr_j.ProcurementBlueprint;
import com.controllerface.cmdr_j.ProcurementType;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum SynthesisType implements ProcurementType
{
    Ammunition(EnumSet.of(SynthesisBlueprint.Small_Calibre_Munitions,
            SynthesisBlueprint.Large_Calibre_Munitions,
            SynthesisBlueprint.High_Velocity_Munitions,
            SynthesisBlueprint.Explosives_Munitions,
            SynthesisBlueprint.Plasma_Munitions)),

    Human_Tech(EnumSet.of(SynthesisBlueprint.Flechette_Launcher_Munitions,
            SynthesisBlueprint.Enzyme_Missile_Munitions)),

    Anti_Xeno(EnumSet.of(SynthesisBlueprint.AX_Explosive_Munitions,
            SynthesisBlueprint.AX_Remote_Flak_Munitions,
            SynthesisBlueprint.AX_Small_Calibre_Munitions)),

    Guardian_Tech(EnumSet.of(SynthesisBlueprint.Guardian_Gauss_Cannon_Munitions,
            SynthesisBlueprint.Guardian_Plasma_Charger_Munitions,
            SynthesisBlueprint.Guardian_Shard_Cannon_Munitions)),

    SRV(EnumSet.of(SynthesisBlueprint.SRV_Refuel,
            SynthesisBlueprint.SRV_Repair,
            SynthesisBlueprint.SRV_Ammo_Restock)),

    Ship(EnumSet.of(SynthesisBlueprint.Chaff,
            SynthesisBlueprint.Limpets,
            SynthesisBlueprint.Heat_Sink,
            SynthesisBlueprint.AFM_Refill,
            SynthesisBlueprint.Life_Support,
            SynthesisBlueprint.FSD_Injection));

    private final EnumSet<SynthesisBlueprint> blueprints;

    SynthesisType(EnumSet<SynthesisBlueprint> blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<SynthesisBlueprint> blueprintStream()
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
