package com.controllerface.edeps.enums.equipment.ships;

import com.controllerface.edeps.Statistic;

/**
 * Created by Stephen on 4/18/2018.
 */
public enum OptionalInternalSlot implements Statistic
{
    Slot01_Size1("Size 1 Compartment"),
    Slot01_Size2("Size 2 Compartment"),
    Slot01_Size3("Size 3 Compartment"),
    Slot01_Size4("Size 4 Compartment"),
    Slot01_Size5("Size 5 Compartment"),
    Slot01_Size6("Size 6 Compartment"),
    Slot01_Size7("Size 7 Compartment"),
    Slot01_Size8("Size 8 Compartment"),

    Slot02_Size1("Size 1 Compartment"),
    Slot02_Size2("Size 2 Compartment"),
    Slot02_Size3("Size 3 Compartment"),
    Slot02_Size4("Size 4 Compartment"),
    Slot02_Size5("Size 5 Compartment"),
    Slot02_Size6("Size 6 Compartment"),
    Slot02_Size7("Size 7 Compartment"),
    Slot02_Size8("Size 8 Compartment"),

    Slot03_Size1("Size 1 Compartment"),
    Slot03_Size2("Size 2 Compartment"),
    Slot03_Size3("Size 3 Compartment"),
    Slot03_Size4("Size 4 Compartment"),
    Slot03_Size5("Size 5 Compartment"),
    Slot03_Size6("Size 6 Compartment"),
    Slot03_Size7("Size 7 Compartment"),
    Slot03_Size8("Size 8 Compartment"),

    Slot04_Size1("Size 1 Compartment"),
    Slot04_Size2("Size 2 Compartment"),
    Slot04_Size3("Size 3 Compartment"),
    Slot04_Size4("Size 4 Compartment"),
    Slot04_Size5("Size 5 Compartment"),
    Slot04_Size6("Size 6 Compartment"),
    Slot04_Size7("Size 7 Compartment"),
    Slot04_Size8("Size 8 Compartment"),

    Slot05_Size1("Size 1 Compartment"),
    Slot05_Size2("Size 2 Compartment"),
    Slot05_Size3("Size 3 Compartment"),
    Slot05_Size4("Size 4 Compartment"),
    Slot05_Size5("Size 5 Compartment"),
    Slot05_Size6("Size 6 Compartment"),
    Slot05_Size7("Size 7 Compartment"),
    Slot05_Size8("Size 8 Compartment"),

    Slot06_Size1("Size 1 Compartment"),
    Slot06_Size2("Size 2 Compartment"),
    Slot06_Size3("Size 3 Compartment"),
    Slot06_Size4("Size 4 Compartment"),
    Slot06_Size5("Size 5 Compartment"),
    Slot06_Size6("Size 6 Compartment"),
    Slot06_Size7("Size 7 Compartment"),
    Slot06_Size8("Size 8 Compartment"),

    Slot07_Size1("Size 1 Compartment"),
    Slot07_Size2("Size 2 Compartment"),
    Slot07_Size3("Size 3 Compartment"),
    Slot07_Size4("Size 4 Compartment"),
    Slot07_Size5("Size 5 Compartment"),
    Slot07_Size6("Size 6 Compartment"),
    Slot07_Size7("Size 7 Compartment"),
    Slot07_Size8("Size 8 Compartment"),

    Slot08_Size1("Size 1 Compartment"),
    Slot08_Size2("Size 2 Compartment"),
    Slot08_Size3("Size 3 Compartment"),
    Slot08_Size4("Size 4 Compartment"),
    Slot08_Size5("Size 5 Compartment"),
    Slot08_Size6("Size 6 Compartment"),
    Slot08_Size7("Size 7 Compartment"),
    Slot08_Size8("Size 8 Compartment"),

    Slot09_Size1("Size 1 Compartment"),
    Slot09_Size2("Size 2 Compartment"),
    Slot09_Size3("Size 3 Compartment"),
    Slot09_Size4("Size 4 Compartment"),
    Slot09_Size5("Size 5 Compartment"),
    Slot09_Size6("Size 6 Compartment"),
    Slot09_Size7("Size 7 Compartment"),
    Slot09_Size8("Size 8 Compartment"),

    Slot10_Size1("Size 1 Compartment"),
    Slot10_Size2("Size 2 Compartment"),
    Slot10_Size3("Size 3 Compartment"),
    Slot10_Size4("Size 4 Compartment"),
    Slot10_Size5("Size 5 Compartment"),
    Slot10_Size6("Size 6 Compartment"),
    Slot10_Size7("Size 7 Compartment"),
    Slot10_Size8("Size 8 Compartment"),

    Slot11_Size1("Size 1 Compartment"),
    Slot11_Size2("Size 2 Compartment"),
    Slot11_Size3("Size 3 Compartment"),
    Slot11_Size4("Size 4 Compartment"),
    Slot11_Size5("Size 5 Compartment"),
    Slot11_Size6("Size 6 Compartment"),
    Slot11_Size7("Size 7 Compartment"),
    Slot11_Size8("Size 8 Compartment"),

    Slot12_Size1("Size 1 Compartment"),
    Slot12_Size2("Size 2 Compartment"),
    Slot12_Size3("Size 3 Compartment"),
    Slot12_Size4("Size 4 Compartment"),
    Slot12_Size5("Size 5 Compartment"),
    Slot12_Size6("Size 6 Compartment"),
    Slot12_Size7("Size 7 Compartment"),
    Slot12_Size8("Size 8 Compartment"),

    Military01("Military Compartment"),
    Military02("Military Compartment"),
    Military03("Military Compartment"),

    ;

    private final String text;

    OptionalInternalSlot(String text)
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
}
