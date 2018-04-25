package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.structures.equipment.ships.Ship;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stephen on 4/24/2018.
 *
 * Storage object used to manage a commander's ship
 *
 * NOTE: Mutable state data object
 *
 */
public class StarShip
{
    private Ship ship;

    private Map<Statistic, ShipModule> hardpoints = new HashMap<>();

    public StarShip()
    {
    }

    public void setShip(Ship ship)
    {
        this.ship = ship;
    }

    public void setShipModule(Statistic statistic, ShipModule module)
    {
        // todo: perform checking for support in the Ship object
        hardpoints.put(statistic, module);
    }
}
