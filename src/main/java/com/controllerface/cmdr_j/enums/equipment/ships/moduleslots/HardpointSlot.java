package com.controllerface.cmdr_j.enums.equipment.ships.moduleslots;

import com.controllerface.cmdr_j.classes.commander.Statistic;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/18/2018.
 */
public enum HardpointSlot implements Statistic
{
    HugeHardpoint1("Huge Hardpoint", 4),
    HugeHardpoint2("Huge Hardpoint", 4),

    LargeHardpoint1("Large Hardpoint", 3),
    LargeHardpoint2("Large Hardpoint", 3),
    LargeHardpoint3("Large Hardpoint", 3),
    LargeHardpoint4("Large Hardpoint", 3),

    MediumHardpoint1("Medium Hardpoint", 2),
    MediumHardpoint2("Medium Hardpoint", 2),
    MediumHardpoint3("Medium Hardpoint", 2),
    MediumHardpoint4("Medium Hardpoint", 2),
    MediumHardpoint5("Medium Hardpoint", 2),

    SmallHardpoint1("Small Hardpoint", 1),
    SmallHardpoint2("Small Hardpoint", 1),
    SmallHardpoint3("Small Hardpoint", 1),
    SmallHardpoint4("Small Hardpoint", 1),

    TinyHardpoint1("Utility Mount", 0),
    TinyHardpoint2("Utility Mount", 0),
    TinyHardpoint3("Utility Mount", 0),
    TinyHardpoint4("Utility Mount", 0),
    TinyHardpoint5("Utility Mount", 0),
    TinyHardpoint6("Utility Mount", 0),
    TinyHardpoint7("Utility Mount", 0),
    TinyHardpoint8("Utility Mount", 0),

    ;

    private final String text;
    private final int size;

    HardpointSlot(String text, int size)
    {
        this.text = text;
        this.size = size;
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

    public int getSize()
    {
        return size;
    }

    public static boolean typeMatches(Statistic statistic)
    {
        return Arrays.stream(HardpointSlot.values()).anyMatch(v->v.equals(statistic));
    }
}
