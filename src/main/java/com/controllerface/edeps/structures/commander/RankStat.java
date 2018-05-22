package com.controllerface.edeps.structures.commander;

import com.controllerface.edeps.Statistic;

import java.util.function.Function;

/**
 * Created by Controllerface on 4/17/2018.
 */
public enum RankStat implements Statistic
{
    Rank_Combat("Combat", "Combat Rank"),
    Rank_Trade("Trade", "Trade Rank"),
    Rank_Explore("Explore", "Exploration Rank"),
    Rank_Empire("Empire", "Imperial Rank"),
    Rank_Federation("Federation", "Federal Rank"),
    Rank_CQC("CQC", "CQC Rank"),

    Progress_Combat("Combat", "Combat Rank Progress"),
    Progress_Trade("Trade", "Trade Rank Progress"),
    Progress_Explore("Explore", "Exploration Rank Progress"),
    Progress_Empire("Empire", "Imperial Rank Progress"),
    Progress_Federation("Federation", "Federal Rank Progress"),
    Progress_CQC("CQC", "CQC Rank Progress"),

    Reputation_Empire("Empire", "Empire Reputation"),
    Reputation_Federation("Federation", "Federation Reputation"),
    Reputation_Alliance("Alliance", "Alliance Reputation"),
    Reputation_Independent("Independent", "Independent Reputation"),

    ;

    private static final Function<Object, String> formatFunction =
            (object) ->
            {
                String formatted = "Nan";
                if (object instanceof Integer) formatted = String.valueOf((int) object);
                if (object instanceof Double) formatted = String.valueOf((double) object);
                if (object instanceof String) formatted = (String) object;
                return formatted;
            };

    private final String key;
    private final String text;

    RankStat(String key, String text)
    {
        this.key = key;
        this.text = text;
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
