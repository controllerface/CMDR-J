package com.controllerface.edeps.structures.equipment.ships;

import com.controllerface.edeps.Statistic;

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
    PowerPlant("Power Plant"),
    MainEngines("Thrusters"),
    FrameShiftDrive("Frame Shift Drive"),
    LifeSupport("Life Support System"),
    PowerDistributor("Power Distributor"),
    Radar("Sensors"),
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
