package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.ModulePurchaseBlueprint;
import com.controllerface.cmdr_j.classes.procurements.ProcurementBlueprint;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public enum ModulePurchaseType implements ProcurementType
{
    Hardpoint(EnumSet.allOf(HardpointModule.class)),
    Optional(EnumSet.allOf(OptionalInternalModule.class)),
    Core(EnumSet.allOf(CoreInternalModule.class)),

    ;

    private final EnumSet<? extends ShipModule> x;

    List<ProcurementBlueprint> blueprints;

    ModulePurchaseType(EnumSet<? extends ShipModule> x)
    {
        this.x = x;
        blueprints = Collections.singletonList(new ModulePurchaseBlueprint(name(), x));
    }


    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public List<ProcurementBlueprint> getBluePrints()
    {
        return blueprints;
    }
}
