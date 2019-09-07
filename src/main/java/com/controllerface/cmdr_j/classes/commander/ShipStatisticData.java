package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipSize;

/**
 * Created by Controllerface on 5/4/2018.
 */
public class ShipStatisticData
{
    private final ShipCharacteristic shipCharacteristic;

    private ShipSize shipSize;
    private ShipManufacturer manufacturer;
    private Boolean booleanStat;
    private Double floatStat;
    private Integer intStat;

    private final Type statType;

    private enum Type
    {
        DOUBLE,
        INTEGER,
        BOOLEAN,
        SIZE,
        MANUFACTURER
    }

    public ShipStatisticData(ShipCharacteristic shipCharacteristic, boolean booleanStat)
    {
        this.shipCharacteristic = shipCharacteristic;
        this.booleanStat = booleanStat;
        statType = Type.BOOLEAN;
    }

    public ShipStatisticData(ShipCharacteristic shipCharacteristic, double floatStat)
    {
        this.shipCharacteristic = shipCharacteristic;
        this.floatStat = floatStat;
        statType = Type.DOUBLE;
    }

    public ShipStatisticData(ShipCharacteristic shipCharacteristic, int intStat)
    {
        this.shipCharacteristic = shipCharacteristic;
        this.intStat = intStat;
        statType = Type.INTEGER;
    }

    public ShipStatisticData(ShipSize shipSize)
    {
        this.shipCharacteristic = ShipCharacteristic.Size;
        this.shipSize = shipSize;
        statType = Type.SIZE;
    }

    public ShipStatisticData(ShipManufacturer manufacturer)
    {
        this.shipCharacteristic = ShipCharacteristic.Manufacturer;
        this.manufacturer = manufacturer;
        statType = Type.MANUFACTURER;
    }

    public ShipCharacteristic stat()
    {
        return shipCharacteristic;
    }

    public String statName()
    {
        return shipCharacteristic.toString();
    }

    public String statDisplayValue()
    {
        switch (statType)
        {
            case DOUBLE: return String.valueOf(floatStat);
            case BOOLEAN: return String.valueOf(booleanStat);
            case INTEGER: return String.valueOf(intStat);
            case SIZE: return shipSize.name();
            case MANUFACTURER: return manufacturer.toString();
            default: return "unknown";
        }
    }
}
