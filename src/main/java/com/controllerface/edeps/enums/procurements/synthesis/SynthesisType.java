package com.controllerface.edeps.enums.procurements.synthesis;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.enums.procurements.technologies.TechnologyBlueprint;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/12/2018.
 */
public enum SynthesisType implements ProcurementType
{
    Standard(SynthesisBlueprint.Small_Calibre_Munitions,
            SynthesisBlueprint.Large_Calibre_Munitions,
            SynthesisBlueprint.High_Velocity_Munitions,
            SynthesisBlueprint.Explosives_Munitions,
            SynthesisBlueprint.Plasma_Munitions),

    Human_Tech(SynthesisBlueprint.Flechette_Launcher_Munitions,
            SynthesisBlueprint.Enzyme_Missile_Munitions),

    Anti_Xeno(SynthesisBlueprint.AX_Explosive_Munitions,
            SynthesisBlueprint.AX_Remote_Flak_Munitions,
            SynthesisBlueprint.AX_Small_Calibre_Munitions),

    Guardian_Tech(SynthesisBlueprint.Guardian_Gauss_Cannon_Munitions,
            SynthesisBlueprint.Guardian_Plasma_Charger_Munitions,
            SynthesisBlueprint.Guardian_Shard_Cannon_Munitions),

    SRV(SynthesisBlueprint.SRV_Refuel,
            SynthesisBlueprint.SRV_Repair,
            SynthesisBlueprint.SRV_Ammo_Restock),

    Ship(SynthesisBlueprint.Chaff,
            SynthesisBlueprint.Limpets,
            SynthesisBlueprint.Heat_Sink,
            SynthesisBlueprint.AFM_Refill,
            SynthesisBlueprint.Life_Support,
            SynthesisBlueprint.FSD_Injection);

    private final SynthesisBlueprint[] blueprints;

    SynthesisType(SynthesisBlueprint ... blueprints)
    {
        this.blueprints = blueprints;
    }

    public Stream<SynthesisBlueprint> blueprintStream()
    {
        return Arrays.stream(blueprints);
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
}
