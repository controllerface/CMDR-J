package com.controllerface.cmdr_j.enums.commander;

import com.controllerface.cmdr_j.interfaces.commander.Statistic;

import java.util.function.Function;

/**
 * Created by Controllerface on 4/17/2018.
 */
public enum ShipStat implements Statistic
{
    UserShipName("UserShipName", "Ship Name", Object::toString),
    UserShipId("UserShipId", "Ship ID", Object::toString),
    Ship("Ship", "Ship Type", Object::toString),
    Ship_Ident("ShipIdent","Ship ID", Object::toString),
    Ship_Name("ShipName","Ship Name", Object::toString),
    Rebuy("Rebuy","Rebuy", Object::toString),
    UnladenMass("UnladenMass","Unladen Mass", Object::toString),
    MaxJumpRange("MaxJumpRange","Max Jump Range", Object::toString),
    CargoCapacity("CargoCapacity","Cargo Capacity", Object::toString),
    HullValue("HullValue","Hull Value", Object::toString),
    ModulesValue("ModulesValue","Modules Value", Object::toString),
    ReserveCapacity("Reserve","Fuel Reserve Capacity", Object::toString),
    ReserveLevel("ReserveLevel","Fuel Reserve Level", Object::toString),
    MainFuelCapacity("Main","Fuel Capacity", Object::toString),

    Fuel_Level("FuelLevel","Fuel Level", (o) ->
    {
        if (o instanceof String)
        {
            return ((String) o);
        }
        return String.valueOf((double) o);
    }),

    Fuel_Capacity("FuelCapacity","Fuel Capacity", (o) ->
    {
        if (o instanceof String)
        {
            return ((String) o);
        }
        return String.valueOf((double) o);
    }),

    ;

    private final String key;
    private final String text;
    private final Function<Object, String> formatFunction;

    ShipStat(String key, String text, Function<Object, String> formatFunction)
    {
        this.key = key;
        this.text = text;
        this.formatFunction = formatFunction;
    }

    public String getKey()
    {
        return key;
    }

    public String getText()
    {
        return text;
    }

    @Override
    public String getName()
    {
        return name();
    }

    public String format(Object raw)
    {
        return formatFunction.apply(raw);
    }
}
