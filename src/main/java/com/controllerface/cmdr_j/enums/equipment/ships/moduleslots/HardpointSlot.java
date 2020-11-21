package com.controllerface.cmdr_j.enums.equipment.ships.moduleslots;

import com.controllerface.cmdr_j.classes.commander.Statistic;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/18/2018.
 */
public enum HardpointSlot implements Statistic
{
    HugeHardpoint1("Huge", 4),
    HugeHardpoint2("Huge", 4),

    LargeHardpoint1("Large", 3),
    LargeHardpoint2("Large", 3),
    LargeHardpoint3("Large", 3),
    LargeHardpoint4("Large", 3),

    MediumHardpoint1("Medium", 2),
    MediumHardpoint2("Medium", 2),
    MediumHardpoint3("Medium", 2),
    MediumHardpoint4("Medium", 2),
    MediumHardpoint5("Medium", 2),

    SmallHardpoint1("Small", 1),
    SmallHardpoint2("Small", 1),
    SmallHardpoint3("Small", 1),
    SmallHardpoint4("Small", 1),

    TinyHardpoint1("Utility", 0),
    TinyHardpoint2("Utility", 0),
    TinyHardpoint3("Utility", 0),
    TinyHardpoint4("Utility", 0),
    TinyHardpoint5("Utility", 0),
    TinyHardpoint6("Utility", 0),
    TinyHardpoint7("Utility", 0),
    TinyHardpoint8("Utility", 0),

    ;

    private final String text;
    private final int size;

    HardpointSlot(String text, int size)
    {
        this.text = text;
        this.size = size;
    }

    @Override
    public String getName()
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
