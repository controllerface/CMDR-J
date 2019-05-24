package com.controllerface.cmdr_j.enums.equipment.ships;

import com.controllerface.cmdr_j.classes.commander.Statistic;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/18/2018.
 */
public enum HardpointSlot implements Statistic
{
    HugeHardpoint1("Huge Hardpoint"),
    HugeHardpoint2("Huge Hardpoint"),

    LargeHardpoint1("Large Hardpoint"),
    LargeHardpoint2("Large Hardpoint"),
    LargeHardpoint3("Large Hardpoint"),
    LargeHardpoint4("Large Hardpoint"),

    MediumHardpoint1("Medium Hardpoint"),
    MediumHardpoint2("Medium Hardpoint"),
    MediumHardpoint3("Medium Hardpoint"),
    MediumHardpoint4("Medium Hardpoint"),
    MediumHardpoint5("Medium Hardpoint"),

    SmallHardpoint1("Small Hardpoint"),
    SmallHardpoint2("Small Hardpoint"),
    SmallHardpoint3("Small Hardpoint"),
    SmallHardpoint4("Small Hardpoint"),

    TinyHardpoint1("Utility Mount"),
    TinyHardpoint2("Utility Mount"),
    TinyHardpoint3("Utility Mount"),
    TinyHardpoint4("Utility Mount"),
    TinyHardpoint5("Utility Mount"),
    TinyHardpoint6("Utility Mount"),
    TinyHardpoint7("Utility Mount"),
    TinyHardpoint8("Utility Mount"),

    ;

    private final String text;

    HardpointSlot(String text)
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
        return Arrays.stream(HardpointSlot.values()).anyMatch(v->v.equals(statistic));
    }
}
