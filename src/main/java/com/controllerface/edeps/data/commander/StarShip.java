package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.equipment.ships.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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

    private ObservableList<ShipStatisticData> statistics = FXCollections.observableArrayList();
    private ObservableList<ShipModuleData> coreInternals = FXCollections.observableArrayList();
    private ObservableList<ShipModuleData> optionalInternals = FXCollections.observableArrayList();
    private ObservableList<ShipModuleData> hardpoints = FXCollections.observableArrayList();

    public StarShip()
    {

    }

    public void setShip(Ship ship)
    {
        this.ship = ship;
        updateStats();
    }

    private void updateStats()
    {
        shipDisplayName.set(ship.getBaseShipStats().getDisplayName());

        statistics.add(new ShipStatisticData(ship.getBaseShipStats().getShipSize()));
        statistics.add(new ShipStatisticData(ship.getBaseShipStats().getManufacturer()));

        statistics.add(new ShipStatisticData(ShipStat.Mass_Lock_Factor, ship.getBaseShipStats().getMassLockFactor()));
        statistics.add(new ShipStatisticData(ShipStat.Crew_Seats, ship.getBaseShipStats().getCrewSeats()));
        statistics.add(new ShipStatisticData(ShipStat.SLF_Capable, ship.getBaseShipStats().isSlfCapable()));

        statistics.add(new ShipStatisticData(ShipStat.Agility, ship.getBaseShipStats().getAgility()));
        statistics.add(new ShipStatisticData(ShipStat.Hull_Mass, ship.getBaseShipStats().getHullMass()));
        statistics.add(new ShipStatisticData(ShipStat.Hull_Hardness, ship.getBaseShipStats().getHullHardness()));

        statistics.add(new ShipStatisticData(ShipStat.Speed, ship.getBaseShipStats().getSpeed()));
        statistics.add(new ShipStatisticData(ShipStat.Boost_Speed, ship.getBaseShipStats().getBoostSpeed()));

        statistics.add(new ShipStatisticData(ShipStat.Max_Speed, ship.getBaseShipStats().getMaxSpeed()));
        statistics.add(new ShipStatisticData(ShipStat.Max_Boost_Speed, ship.getBaseShipStats().getMaxBoostSpeed()));

        statistics.add(new ShipStatisticData(ShipStat.Armor_Rating, ship.getBaseShipStats().getArmorRating()));
        statistics.add(new ShipStatisticData(ShipStat.Base_Shield, ship.getBaseShipStats().getBaseShield()));
    }

    public ObservableList<ShipStatisticData> getStatistics()
    {
        return statistics;
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
