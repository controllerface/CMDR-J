package com.controllerface.cmdr_j.classes.ships;

import com.controllerface.cmdr_j.classes.BaseShipStats;
import com.controllerface.cmdr_j.classes.data.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.data.HardPointLayoutData;
import com.controllerface.cmdr_j.classes.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.classes.commander.ShipModule;

public abstract class AbstractShip
{
    public final BaseShipStats baseShipStats;
    public final CoreModuleLayoutData coreModules;
    public final HardPointLayoutData hardpoints;
    public final OptionalModuleLayoutData internals;
    public final ShipModule[] armorModules;

    AbstractShip(BaseShipStats baseShipStats,
                 CoreModuleLayoutData coreModules,
                 HardPointLayoutData hardpoints,
                 OptionalModuleLayoutData internals,
                 ShipModule ... armorModules)
    {
        this.baseShipStats = baseShipStats;
        this.coreModules = coreModules;
        this.hardpoints = hardpoints;
        this.internals = internals;
        this.armorModules = armorModules;
    }
}
