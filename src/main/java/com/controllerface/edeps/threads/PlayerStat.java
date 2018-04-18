package com.controllerface.edeps.threads;

import java.text.NumberFormat;
import java.util.function.Function;

/**
 * Created by Stephen on 4/17/2018.
 */
public enum PlayerStat
{
    Rank_Combat("Combat", "Combat Rank", (o) -> String.valueOf((int) o)),
    Rank_Trade("Trade", "Trade Rank", (o)-> String.valueOf((int) o)),
    Rank_Explore("Explore", "Exploration Rank", (o)-> String.valueOf((int) o)),
    Rank_Empire("Empire", "Imperial Rank", (o)-> String.valueOf((int) o)),
    Rank_Federation("Federation", "Federal Rank", (o)-> String.valueOf((int) o)),
    Rank_CQC("CQC", "CQC Rank", (o)-> String.valueOf((int) o)),

    Progress_Combat("Combat", "Combat Rank Progress", (o)-> String.valueOf((int) o)),
    Progress_Trade("Trade", "Trade Rank Progress", (o)-> String.valueOf((int) o)),
    Progress_Explore("Explore", "Exploration Rank Progress", (o)-> String.valueOf((int) o)),
    Progress_Empire("Empire", "Imperial Rank Progress", (o)-> String.valueOf((int) o)),
    Progress_Federation("Federation", "Federal Rank Progress", (o)-> String.valueOf((int) o)),
    Progress_CQC("CQC", "CQC Rank Progress", (o)-> String.valueOf((int) o)),

    Reputation_Empire("Empire", "Empire Reputation", (o)-> String.valueOf((double) o)),
    Reputation_Federation("Federation", "Federation Reputation", (o)-> String.valueOf((double) o)),
    Reputation_Alliance("Alliance", "Alliance Reputation", (o)-> String.valueOf((double) o)),
    Reputation_Indpendent("Independent", "Independent Reputation", (o)-> String.valueOf((double) o)),

    Commander("Commander", "Commander", (o) -> ((String) o)),
    Credits("Credits", "Credits", (o) -> NumberFormat.getInstance().format(((int) o))),
    Game_Mode("GameMode", "Game Mode", (o) -> ((String) o)),
    Private_Group("Group","Private Group", (o) -> ((String) o)),
    Loan("Loan", "Loan", (o) -> NumberFormat.getInstance().format(o)),

    Ship("Ship", "Ship", (o) -> ((String) o)),
    Ship_ID("ShipIdent","Ship ID", (o) -> ((String) o).toUpperCase()),
    Ship_Name("ShipName","Ship Name", (o) -> ((String) o).toUpperCase()),
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
