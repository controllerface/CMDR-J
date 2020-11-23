package com.controllerface.cmdr_j.enums.commander;

import com.controllerface.cmdr_j.classes.commander.Statistic;

import java.text.NumberFormat;
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
