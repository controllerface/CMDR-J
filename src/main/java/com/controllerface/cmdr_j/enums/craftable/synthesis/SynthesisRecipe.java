package com.controllerface.cmdr_j.enums.craftable.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.recipes.synthesis.*;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */

public enum SynthesisRecipe implements ProcurementRecipe
{
    AFM_Refill_Basic(new AFM_Refill_Basic()),
    AFM_Refill_Standard(new AFM_Refill_Standard()),
    AFM_Refill_Premium(new AFM_Refill_Premium()),

    AX_Explosive_Munitions_Basic(new AX_Explosive_Munitions_Basic()),
    AX_Explosive_Munitions_Standard(new AX_Explosive_Munitions_Standard()),
    AX_Explosive_Munitions_Premium(new AX_Explosive_Munitions_Premium()),

    AX_Remote_Flak_Munitions_Basic(new AX_Remote_Flak_Munitions_Basic()),
    AX_Remote_Flak_Munitions_Standard(new AX_Remote_Flak_Munitions_Standard()),
    AX_Remote_Flak_Munitions_Premium(new AX_Remote_Flak_Munitions_Premium()),

    AX_Small_Calibre_Munitions_Basic(new AX_Small_Calibre_Munitions_Basic()),
    AX_Small_Calibre_Munitions_Standard(new AX_Small_Calibre_Munitions_Standard()),
    AX_Small_Calibre_Munitions_Premium(new AX_Small_Calibre_Munitions_Premium()),

    Enzyme_Missile_Munitions_Basic(new Enzyme_Missile_Munitions_Basic()),
    Enzyme_Missile_Munitions_Standard(new Enzyme_Missile_Munitions_Standard()),
    Enzyme_Missile_Munitions_Premium(new Enzyme_Missile_Munitions_Premium()),

    Explosives_Munitions_Basic(new Explosives_Munitions_Basic()),
    Explosives_Munitions_Standard(new Explosives_Munitions_Standard()),
    Explosives_Munitions_Premium(new Explosives_Munitions_Premium()),

    Flechette_Launcher_Munitions_Basic(new Flechette_Launcher_Munitions_Basic()),
    Flechette_Launcher_Munitions_Standard(new Flechette_Launcher_Munitions_Standard()),
    Flechette_Launcher_Munitions_Premium(new Flechette_Launcher_Munitions_Premium()),

    FSD_Injection_Basic(new FSD_Injection_Basic()),
    FSD_Injection_Standard(new FSD_Injection_Standard()),
    FSD_Injection_Premium(new FSD_Injection_Premium()),

    Guardian_Gauss_Cannon_Munitions_Basic(new Guardian_Gauss_Cannon_Munitions_Basic()),
    Guardian_Gauss_Cannon_Munitions_Standard(new Guardian_Gauss_Cannon_Munitions_Standard()),
    Guardian_Gauss_Cannon_Munitions_Premium(new Guardian_Gauss_Cannon_Munitions_Premium()),

    Guardian_Plasma_Charger_Munitions_Basic(new Guardian_Plasma_Charger_Munitions_Basic()),
    Guardian_Plasma_Charger_Munitions_Standard(new Guardian_Plasma_Charger_Munitions_Standard()),
    Guardian_Plasma_Charger_Munitions_Premium(new Guardian_Plasma_Charger_Munitions_Premium()),

    Guardian_Shard_Cannon_Munitions_Basic(new Guardian_Shard_Cannon_Munitions_Basic()),
    Guardian_Shard_Cannon_Munitions_Standard(new Guardian_Shard_Cannon_Munitions_Standard()),
    Guardian_Shard_Cannon_Munitions_Premium(new Guardian_Shard_Cannon_Munitions_Premium()),

    High_Velocity_Munitions_Basic(new High_Velocity_Munitions_Basic()),
    High_Velocity_Munitions_Standard(new High_Velocity_Munitions_Standard()),
    High_Velocity_Munitions_Premium(new High_Velocity_Munitions_Premium()),

    Large_Calibre_Munitions_Basic(new Large_Calibre_Munitions_Basic()),
    Large_Calibre_Munitions_Standard(new Large_Calibre_Munitions_Standard()),
    Large_Calibre_Munitions_Premium(new Large_Calibre_Munitions_Premium()),

    Plasma_Munitions_Basic(new Plasma_Munitions_Basic()),
    Plasma_Munitions_Standard(new Plasma_Munitions_Standard()),
    Plasma_Munitions_Premium(new Plasma_Munitions_Premium()),

    Small_Calibre_Munitions_Basic(new Small_Calibre_Munitions_Basic()),
    Small_Calibre_Munitions_Standard(new Small_Calibre_Munitions_Standard()),
    Small_Calibre_Munitions_Premium(new Small_Calibre_Munitions_Premium()),

    SRV_Ammo_Restock_Basic(new SRV_Ammo_Restock_Basic()),
    SRV_Ammo_Restock_Standard(new SRV_Ammo_Restock_Standard()),
    SRV_Ammo_Restock_Premium(new SRV_Ammo_Restock_Premium()),

    SRV_Refuel_Basic(new SRV_Refuel_Basic()),
    SRV_Refuel_Standard(new SRV_Refuel_Standard()),
    SRV_Refuel_Premium(new SRV_Refuel_Premium()),

    SRV_Repair_Basic(new SRV_Repair_Basic()),
    SRV_Repair_Standard(new SRV_Repair_Standard()),
    SRV_Repair_Premium(new SRV_Repair_Premium()),

    Heat_Sink_Basic(new Heat_Sink_Basic()),
    Heat_Sink_Standard(new Heat_Sink_Standard()),
    Heat_Sink_Premium(new Heat_Sink_Premium()),

    Chaff_Basic(new Chaff_Basic()),
    Chaff_Standard(new Chaff_Standard()),
    Chaff_Premium(new Chaff_Premium()),

    Life_Support(new Life_Support()),

    Limpets(new Limpets()),

    ;

    private final ProcurementRecipe delegate;

    SynthesisRecipe(ProcurementRecipe delgate)
    {
        this.delegate = delgate;
        delgate.costStream().forEach(c->c.getCost().associate(this));
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
        //todo: consider implementing this for this category
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
        return delegate.getDisplayLabel();
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

