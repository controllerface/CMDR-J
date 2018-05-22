package com.controllerface.edeps.structures.commander;

import com.controllerface.edeps.Statistic;

import java.text.NumberFormat;
import java.util.function.Function;

/**
 * Created by Controllerface on 4/17/2018.
 */
public enum PlayerStat implements Statistic
{
    Commander("Commander", "Commander", (o) -> ((String) o)),
    Credits("Credits", "Credits", (o) -> NumberFormat.getInstance().format(((int) o))),
    Game_Mode("GameMode", "Game Mode", (o) -> ((String) o)),
    Private_Group("Group","Private Group", (o) -> ((String) o)),
    Loan("Loan", "Loan", (o) -> NumberFormat.getInstance().format(o)),

    Ship("Ship", "Ship Type", (o) -> ((String) o)),
    Ship_Ident("ShipIdent","Ship ID", (o) -> ((String) o)),
    Ship_Name("ShipName","Ship Name", (o) -> ((String) o)),
    Fuel_Level("FuelLevel","Fuel Level", (o) -> String.valueOf((double) o)),
    Fuel_Capacity("FuelCapacity","Fuel Capacity", (o) -> String.valueOf((double) o)),

    ;

    private final String key;
    private final String text;
    private final Function<Object, String> formatFunction;

    PlayerStat(String key, String text, Function<Object, String> formatFunction)
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

    public String format(Object raw)
    {
        return formatFunction.apply(raw);
    }
}
