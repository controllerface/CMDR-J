package com.controllerface.cmdr_j.enums.equipment.ships.moduleslots;

import com.controllerface.cmdr_j.interfaces.commander.Statistic;

import java.util.Arrays;

/**
 * Optional Internal Slots
 *
 * Note: The JSON structure of the journal API is somewhat problematic in the way it treats internal slots. For every
 * ship, there is a "slot" number, appended to the compartment size. In essence, the slot number is irrelevant, but it
 * is required to ensure cases where there may be more than one slot of the same size, they can have different keys.
 * Because of this, the only way to ensure that any possible combination is supported, this enum must contain all
 * possible index/size combinations.
 *
 * Since the maximum number of total compartments is 12, and the maximum compartment size is 8, this equates to 96
 * values. This does mean many of these enum values will likely never be used, but also makes it easier to read the
 * JSON data for these compartment slots in the same manner as all of the other JSON objects, and should be somewhat
 * resistant to API changes whereby an index number changes.
 *
 * Created by Controllerface on 4/18/2018.
 */
public enum OptionalInternalSlot implements Statistic
{
    Slot00_Size1("Size 1", 1),
    Slot00_Size2("Size 2", 2),
    Slot00_Size3("Size 3", 3),
    Slot00_Size4("Size 4", 4),
    Slot00_Size5("Size 5", 5),
    Slot00_Size6("Size 6", 6),
    Slot00_Size7("Size 7", 7),
    Slot00_Size8("Size 8", 8),

    Slot01_Size1("Size 1", 1),
    Slot01_Size2("Size 2", 2),
    Slot01_Size3("Size 3", 3),
    Slot01_Size4("Size 4", 4),
    Slot01_Size5("Size 5", 5),
    Slot01_Size6("Size 6", 6),
    Slot01_Size7("Size 7", 7),
    Slot01_Size8("Size 8", 8),

    Slot02_Size1("Size 1", 1),
    Slot02_Size2("Size 2", 2),
    Slot02_Size3("Size 3", 3),
    Slot02_Size4("Size 4", 4),
    Slot02_Size5("Size 5", 5),
    Slot02_Size6("Size 6", 6),
    Slot02_Size7("Size 7", 7),
    Slot02_Size8("Size 8", 8),

    Slot03_Size1("Size 1", 1),
    Slot03_Size2("Size 2", 2),
    Slot03_Size3("Size 3", 3),
    Slot03_Size4("Size 4", 4),
    Slot03_Size5("Size 5", 5),
    Slot03_Size6("Size 6", 6),
    Slot03_Size7("Size 7", 7),
    Slot03_Size8("Size 8", 8),

    Slot04_Size1("Size 1", 1),
    Slot04_Size2("Size 2", 2),
    Slot04_Size3("Size 3", 3),
    Slot04_Size4("Size 4", 4),
    Slot04_Size5("Size 5", 5),
    Slot04_Size6("Size 6", 6),
    Slot04_Size7("Size 7", 7),
    Slot04_Size8("Size 8", 8),

    Slot05_Size1("Size 1", 1),
    Slot05_Size2("Size 2", 2),
    Slot05_Size3("Size 3", 3),
    Slot05_Size4("Size 4", 4),
    Slot05_Size5("Size 5", 5),
    Slot05_Size6("Size 6", 6),
    Slot05_Size7("Size 7", 7),
    Slot05_Size8("Size 8", 8),

    Slot06_Size1("Size 1", 1),
    Slot06_Size2("Size 2", 2),
    Slot06_Size3("Size 3", 3),
    Slot06_Size4("Size 4", 4),
    Slot06_Size5("Size 5", 5),
    Slot06_Size6("Size 6", 6),
    Slot06_Size7("Size 7", 7),
    Slot06_Size8("Size 8", 8),

    Slot07_Size1("Size 1", 1),
    Slot07_Size2("Size 2", 2),
    Slot07_Size3("Size 3", 3),
    Slot07_Size4("Size 4", 4),
    Slot07_Size5("Size 5", 5),
    Slot07_Size6("Size 6", 6),
    Slot07_Size7("Size 7", 7),
    Slot07_Size8("Size 8", 8),

    Slot08_Size1("Size 1", 1),
    Slot08_Size2("Size 2", 2),
    Slot08_Size3("Size 3", 3),
    Slot08_Size4("Size 4", 4),
    Slot08_Size5("Size 5", 5),
    Slot08_Size6("Size 6", 6),
    Slot08_Size7("Size 7", 7),
    Slot08_Size8("Size 8", 8),

    Slot09_Size1("Size 1", 1),
    Slot09_Size2("Size 2", 2),
    Slot09_Size3("Size 3", 3),
    Slot09_Size4("Size 4", 4),
    Slot09_Size5("Size 5", 5),
    Slot09_Size6("Size 6", 6),
    Slot09_Size7("Size 7", 7),
    Slot09_Size8("Size 8", 8),

    Slot10_Size1("Size 1", 1),
    Slot10_Size2("Size 2", 2),
    Slot10_Size3("Size 3", 3),
    Slot10_Size4("Size 4", 4),
    Slot10_Size5("Size 5", 5),
    Slot10_Size6("Size 6", 6),
    Slot10_Size7("Size 7", 7),
    Slot10_Size8("Size 8", 8),

    Slot11_Size1("Size 1", 1),
    Slot11_Size2("Size 2", 2),
    Slot11_Size3("Size 3", 3),
    Slot11_Size4("Size 4", 4),
    Slot11_Size5("Size 5", 5),
    Slot11_Size6("Size 6", 6),
    Slot11_Size7("Size 7", 7),
    Slot11_Size8("Size 8", 8),

    Slot12_Size1("Size 1", 1),
    Slot12_Size2("Size 2", 2),
    Slot12_Size3("Size 3", 3),
    Slot12_Size4("Size 4", 4),
    Slot12_Size5("Size 5", 5),
    Slot12_Size6("Size 6", 6),
    Slot12_Size7("Size 7", 7),
    Slot12_Size8("Size 8", 8),

    Military01("Military", 0),
    Military02("Military", 0),
    Military03("Military", 0),

    PlanetaryApproachSuite("Planetary", -1),

    ;

    private final String text;
    private final int size;

    OptionalInternalSlot(String text, int size)
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
        return Arrays.stream(OptionalInternalSlot.values()).anyMatch(v->v.equals(statistic));
    }
}
