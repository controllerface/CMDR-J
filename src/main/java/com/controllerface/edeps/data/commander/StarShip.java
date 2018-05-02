package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.structures.equipment.ships.CoreInternalSlot;
import com.controllerface.edeps.structures.equipment.ships.HardpointSlot;
import com.controllerface.edeps.structures.equipment.ships.OptionalInternalSlot;
import com.controllerface.edeps.structures.equipment.ships.Ship;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
    private SimpleStringProperty shipDisplayName = new SimpleStringProperty("None");
    private ObservableList<ShipModuleData> coreInternals = FXCollections.observableArrayList();
    private ObservableList<ShipModuleData> optionalInternals = FXCollections.observableArrayList();
    private ObservableList<ShipModuleData> hardpoints = FXCollections.observableArrayList();


    public StarShip()
    {
    }

    public void setShip(Ship ship)
    {
        this.ship = ship;
        shipDisplayName.set(ship.getBaseShipStats().getDisplayName());
    }

    public ObservableStringValue getShipDisplayName()
    {
        return shipDisplayName;
    }

    public ObservableList<ShipModuleData> getCoreInternals()
    {
        return coreInternals;
    }

    public ObservableList<ShipModuleData> getOptionalInternals()
    {
        return optionalInternals;
    }

    public ObservableList<ShipModuleData> getHardpoints()
    {
        return hardpoints;
    }

    public void setShipModule(ShipModuleData shipModuleData)
    {
        // todo: perform checking for support in the Ship object

        if (CoreInternalSlot.typeMatches(shipModuleData.getModuleName()))
        {
            coreInternals.add(shipModuleData);
        }

        if (OptionalInternalSlot.typeMatches(shipModuleData.getModuleName()))
        {
            optionalInternals.add(shipModuleData);
        }

        if (HardpointSlot.typeMatches(shipModuleData.getModuleName()))
        {
            hardpoints.add(shipModuleData);
        }
    }
}
