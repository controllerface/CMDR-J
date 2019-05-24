package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.enums.equipment.ships.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.ShipSize;
import com.controllerface.cmdr_j.enums.equipment.ships.ShipStat;

/**
 * Created by Controllerface on 5/4/2018.
 */
public class ShipStatisticData
{
    private final ShipStat shipStat;

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

    public ShipStatisticData(ShipStat shipStat, boolean booleanStat)
    {
        this.shipStat = shipStat;
        this.booleanStat = booleanStat;
        statType = Type.BOOLEAN;
    }

    public ShipStatisticData(ShipStat shipStat, double floatStat)
    {
        this.shipStat = shipStat;
        this.floatStat = floatStat;
        statType = Type.DOUBLE;
    }

    public ShipStatisticData(ShipStat shipStat, int intStat)
    {
        this.shipStat = shipStat;
        this.intStat = intStat;
        statType = Type.INTEGER;
    }

    public ShipStatisticData(ShipSize shipSize)
    {
        this.shipStat = ShipStat.Size;
        this.shipSize = shipSize;
        statType = Type.SIZE;
    }

    public ShipStatisticData(ShipManufacturer manufacturer)
    {
        this.shipStat = ShipStat.Manufacturer;
        this.manufacturer = manufacturer;
        statType = Type.MANUFACTURER;
    }

    public ShipStat stat()
    {
        return shipStat;
    }

    public String statName()
    {
        return shipStat.toString();
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
