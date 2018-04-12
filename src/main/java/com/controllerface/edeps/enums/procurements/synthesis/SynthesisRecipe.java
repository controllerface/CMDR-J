package com.controllerface.edeps.enums.procurements.synthesis;

import com.controllerface.edeps.data.CostData;
import com.controllerface.edeps.data.ModificationEffectData;
import com.controllerface.edeps.enums.common.ItemEffect;
import com.controllerface.edeps.enums.costs.materials.Material;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/12/2018.
 */

@SuppressWarnings("unchecked")
public enum SynthesisRecipe
{
    AFM_Refill_Basic("", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Refill, 0d)
            ),
            new CostData(Material.NICKEL, 2),
            new CostData(Material.ZINC, 2),
            new CostData(Material.CHROMIUM, 2),
            new CostData(Material.VANADIUM, 3)),

    AFM_Refill_Standard("", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Refill, 0d),
                    new Pair<>(ItemEffect.Repair_Speed, 50d)
            ),
            new CostData(Material.TIN, 1),
            new CostData(Material.MANGANESE, 2),
            new CostData(Material.VANADIUM, 6),
            new CostData(Material.MOLYBDENUM, 1),
            new CostData(Material.ZIRCONIUM, 1)),

    AFM_Refill_Premium("", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Refill, 0d),
                    new Pair<>(ItemEffect.Repair_Speed, 100d)
            ),
            new CostData(Material.ZINC, 2),
            new CostData(Material.CHROMIUM, 4),
            new CostData(Material.VANADIUM, 6),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.TELLURIUM, 1),
            new CostData(Material.RUTHENIUM, 1)),





    AX_Explosive_Munitions_Basic("", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Rearm, 0d)
            ),
            new CostData(Material.IRON, 3),
            new CostData(Material.NICKEL, 3),
            new CostData(Material.CARBON, 4),
            new CostData(Material.Propulsion_Elements, 3)),

    AX_Explosive_Munitions_Standard("", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Rearm, 0d),
                    new Pair<>(ItemEffect.Damage_Boost, 5d)

            ),
            new CostData(Material.SULPHUR, 6),
            new CostData(Material.PHOSPHORUS, 6),
            new CostData(Material.MERCURY, 2),
            new CostData(Material.Thargoid_Organic_Circuitry, 4),
            new CostData(Material.Propulsion_Elements, 4)),

    AX_Explosive_Munitions_Premium("", new ModificationEffectData
            (
                    new Pair<>(ItemEffect.Rearm, 0d),
                    new Pair<>(ItemEffect.Damage_Boost, 10d)

            ),
            new CostData(Material.TUNGSTEN, 5),
            new CostData(Material.MERCURY, 4),
            new CostData(Material.POLONIUM, 2),
            new CostData(Material.Bio_Mechanical_Conduits, 5),
            new CostData(Material.Propulsion_Elements, 5),
            new CostData(Material.Ship_Flight_Data, 6)),






    AX_Remote_Flak_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),
            new CostData(Material.NICKEL, 4),
            new CostData(Material.CARBON, 3),
            new CostData(Material.SULPHUR, 2)),

    AX_Remote_Flak_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d),
                    new Pair<>(ItemEffect.Damage_Boost, 5d)

            ),
            new CostData(Material.TIN, 2),
            new CostData(Material.ZINC, 3),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.Thargoid_Technological_Components, 3),
            new CostData(Material.Wreckage_Components, 2)),

    AX_Remote_Flak_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d),
                    new Pair<>(ItemEffect.Damage_Boost, 10d)

            ),
            new CostData(Material.ZINC, 8),
            new CostData(Material.TUNGSTEN, 2),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.Sensor_Fragment, 3),
            new CostData(Material.Thargoid_Technological_Components, 4),
            new CostData(Material.Weapon_Parts, 1)),





    AX_Small_Calibre_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),
            new CostData(Material.IRON, 2),
            new CostData(Material.NICKEL, 1),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.Weapon_Parts, 2)),

    AX_Small_Calibre_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d),
                    new Pair<>(ItemEffect.Damage_Boost, 5d)
            ),
            new CostData(Material.IRON, 2),
            new CostData(Material.PHOSPHORUS, 2),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.Sensor_Fragment, 3),
            new CostData(Material.Weapon_Parts, 4)),

    AX_Small_Calibre_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d),
                    new Pair<>(ItemEffect.Damage_Boost, 10d)
            ),
            new CostData(Material.IRON, 3),
            new CostData(Material.PHOSPHORUS, 2),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.Sensor_Fragment, 4),
            new CostData(Material.Thargoid_Carapace, 2),
            new CostData(Material.Weapon_Parts, 6)),





    Enzyme_Missile_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Enzyme_Missile_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Enzyme_Missile_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Explosives_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Explosives_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Explosives_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Flechette_Launcher_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Flechette_Launcher_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Flechette_Launcher_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    FSD_Injection_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    FSD_Injection_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    FSD_Injection_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Guardian_Gauss_Cannon_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Guardian_Gauss_Cannon_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Guardian_Gauss_Cannon_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Guardian_Plasma_Charger_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Guardian_Plasma_Charger_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Guardian_Plasma_Charger_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Guardian_Shard_Cannon_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Guardian_Shard_Cannon_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Guardian_Shard_Cannon_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    High_Velocity_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    High_Velocity_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    High_Velocity_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Large_Calibre_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Large_Calibre_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Large_Calibre_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Plasma_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Plasma_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Plasma_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Small_Calibre_Munitions_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Small_Calibre_Munitions_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Small_Calibre_Munitions_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    SRV_Ammo_Restock_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    SRV_Ammo_Restock_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    SRV_Ammo_Restock_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    SRV_Refuel_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    SRV_Refuel_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    SRV_Refuel_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    SRV_Repair_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    SRV_Repair_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    SRV_Repair_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Heat_Sink_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Heat_Sink_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Heat_Sink_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Chaff_Basic("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Chaff_Standard("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    Chaff_Premium("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),





    Life_Support("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),




    Limpets("",new ModificationEffectData
            (
                    new Pair<>(null, 0d)
            ),new CostData(null,0)),

    ;

    private final CostData[] cost;
    private final ModificationEffectData effects;
    private final String label;

    SynthesisRecipe(String label, ModificationEffectData effects, CostData... cost)
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
    }}
