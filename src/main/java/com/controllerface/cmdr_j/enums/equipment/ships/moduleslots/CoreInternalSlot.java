package com.controllerface.cmdr_j.enums.equipment.ships.moduleslots;

import com.controllerface.cmdr_j.classes.commander.Statistic;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/18/2018.
 */
public enum CoreInternalSlot implements Statistic
{
    Ship("Ship"),
    ShipIdent("Ship ID"),
    ShipName("Ship Name"),
    ShipCockpit("Cockpit"),
    CargoHatch("Cargo Hatch"),
    Armour("Bulkheads"),
    PowerPlant("Reactor Bay"),
    MainEngines("Main Engines"),
    FrameShiftDrive("Hyper Drive"),
    LifeSupport("Life Support"),
    PowerDistributor("Power Coupling"),
    Radar("Sensor Suite"),
    FuelTank("Fuel Tank"),

    ;

    private final String text;

    CoreInternalSlot(String text)
    {
        this.text = text;
    }

    @Override
    public String getKey()
    {
        return name();
    }

    @Override
    public String getText()
    {
        return text;
    }

    @Override
    public String format(Object raw)
    {
        return raw.toString();
    }

    public static boolean typeMatches(Statistic statistic)
    {
        return Arrays.stream(CoreInternalSlot.values()).anyMatch(v->v.equals(statistic));
    }
}
