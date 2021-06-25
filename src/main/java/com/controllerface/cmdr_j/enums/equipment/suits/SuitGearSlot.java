package com.controllerface.cmdr_j.enums.equipment.suits;

import com.controllerface.cmdr_j.interfaces.commander.Statistic;

import java.util.Arrays;

/**
 * Suit Gear Slots
 */
public enum SuitGearSlot implements Statistic
{
    SpaceSuit("Size 1", 1),

    PrimaryWeapon1("Size 1", 1),
    PrimaryWeapon2("Size 2", 2),
    SecondaryWeapon("Size 3", 3),

    ;

    private final String text;
    private final int size;

    SuitGearSlot(String text, int size)
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
    public String getName()
    {
        return name();
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
        if (statistic instanceof SuitGearSlot)
        {
            return Arrays.asList(SuitGearSlot.values()).contains(statistic);
        }
        return false;
    }
}
