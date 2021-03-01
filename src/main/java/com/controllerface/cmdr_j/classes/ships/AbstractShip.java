package com.controllerface.cmdr_j.classes.ships;

import com.controllerface.cmdr_j.utilities.JSONSupport;
import com.controllerface.cmdr_j.classes.data.BaseShipStats;
import com.controllerface.cmdr_j.classes.data.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.interfaces.commander.ShipModule;
import com.controllerface.cmdr_j.classes.data.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.data.HardPointLayoutData;

import java.util.Arrays;
import java.util.HashMap;

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
                 ShipModule... armorModules)
    {
        this.baseShipStats = baseShipStats;
        this.coreModules = coreModules;
        this.hardpoints = hardpoints;
        this.internals = internals;
        this.armorModules = armorModules;
    }

    public String toJson()
    {
        var statMap = new HashMap<String, Object>();

        var baseStats = new HashMap<String, Object>();
        baseStats.put("displayName", baseShipStats.displayName);
        baseStats.put("shipSize", baseShipStats.shipSize);
        baseStats.put("manufacturer", baseShipStats.manufacturer.toString());
        baseStats.put("agility", baseShipStats.agility);
        baseStats.put("hullMass", baseShipStats.hullMass);
        baseStats.put("hullHardness", baseShipStats.hullHardness);
        baseStats.put("speed", baseShipStats.speed);
        baseStats.put("maxSpeed", baseShipStats.maxSpeed);
        baseStats.put("boostSpeed", baseShipStats.boostSpeed);
        baseStats.put("maxBoostSpeed", baseShipStats.maxBoostSpeed);
        baseStats.put("armorRating", baseShipStats.armorRating);
        baseStats.put("shield", baseShipStats.shield);
        baseStats.put("baseCost", baseShipStats.baseCost);
        baseStats.put("massLockFactor", baseShipStats.massLockFactor);
        baseStats.put("crewSeats", baseShipStats.crewSeats);
        baseStats.put("slfCapable", baseShipStats.slfCapable);

        var coreSlots = new HashMap<String, Object>();
        coreSlots.put("powerPlant", coreModules.powerPlant.intValue);
        coreSlots.put("thrusters", coreModules.thrusters.intValue);
        coreSlots.put("frameShiftDrive", coreModules.frameShiftDrive.intValue);
        coreSlots.put("lifeSupport", coreModules.lifeSupport.intValue);
        coreSlots.put("powerDistributor", coreModules.powerDistributor.intValue);
        coreSlots.put("sensors", coreModules.sensors.intValue);
        coreSlots.put("fuelTank", coreModules.fuelTank.intValue);

        var optionalSlots = new HashMap<String, Integer>();
        Arrays.stream(internals.getSlots())
            .forEach(moduleSize ->
            {
                var count = optionalSlots
                    .computeIfAbsent(moduleSize.name(), (_k) -> 0) + 1;
                optionalSlots.put(moduleSize.name(), count);
            });

        var hardpointSlots = new HashMap<String, Integer>();
        Arrays.stream(hardpoints.getSlots())
            .forEach(moduleSize ->
            {
                var count = hardpointSlots
                    .computeIfAbsent(moduleSize.name(), (_k) -> 0) + 1;
                hardpointSlots.put(moduleSize.name(), count);
            });

        statMap.put("baseStats", baseStats);
        statMap.put("coreSlots", coreSlots);
        statMap.put("optionalSlots", optionalSlots);
        statMap.put("hardpointSlots", hardpointSlots);

        return JSONSupport.Write.jsonToString.apply(statMap);
    }
}
