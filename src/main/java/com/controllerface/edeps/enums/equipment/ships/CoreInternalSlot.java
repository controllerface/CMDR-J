package com.controllerface.edeps.enums.equipment.ships;

import com.controllerface.edeps.Statistic;

/**
 * Created by Stephen on 4/18/2018.
 */
public enum CoreInternalSlot implements Statistic
{
    Ship("Ship"),
    ShipIdent("Ship ID"),
    ShipName("Ship Name"),
    ShipCockpit("Cockpit"),
    CargoHatch("Cargo Hatch"),
    Armour("Armor"),
    PowerPlant("Power Plant"),
    MainEngines("Thrusters"),
    FrameShiftDrive("Frame Shift Drive"),
    LifeSupport("Life Support"),
    PowerDistributor("Distributor"),
    Radar("Sensors"),
    FuelTank("Fuel tank"),
    PlanetaryApproachSuite("Planetary Approach Suite"),

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
}
