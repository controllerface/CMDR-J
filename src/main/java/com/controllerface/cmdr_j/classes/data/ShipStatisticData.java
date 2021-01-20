package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipSize;
import javafx.util.Pair;

/**
 * Created by Controllerface on 5/4/2018.
 */
public class ShipStatisticData
{
    public final ShipCharacteristic shipCharacteristic;

    public final Type statType;

    public final Boolean booleanStat;
    public final Integer intStat;
    public final Double floatStat;
    public final Double rawFloat;
    public final ShipSize shipSize;
    public final StatGroup statGroup;

    private enum Type
    {
        DOUBLE,
        INTEGER,
        BOOLEAN,
        SIZE,
        GROUP
    }

    public static class StatGroup
    {
        public Double floatStat;
        public Double rawFloat;
        public Double diminishCap;
        public Double baseValue;
        public Double boostValue;
        public Double baseMultiplier;
        public Double boostMultiplier;

        @Override
        public String toString()
        {
            return "StatGroup{" +
                "floatStat=" + floatStat +
                ", rawFloat=" + rawFloat +
                ", diminishCap=" + diminishCap +
                ", baseValue=" + baseValue +
                ", boostValue=" + boostValue +
                ", baseMultiplier=" + baseMultiplier +
                ", boostMultiplier=" + boostMultiplier +
                '}';
        }
    }

    public ShipStatisticData(ShipCharacteristic shipCharacteristic, boolean booleanStat)
    {
        this.shipCharacteristic = shipCharacteristic;
        this.booleanStat = booleanStat;
        this.statType = Type.BOOLEAN;

        this.shipSize = null;
        this.floatStat = null;
        this.rawFloat = null;
        this.intStat = null;
        this.statGroup = null;
    }

    public ShipStatisticData(ShipCharacteristic shipCharacteristic, double floatStat)
    {
        this.shipCharacteristic = shipCharacteristic;
        this.floatStat = floatStat;
        statType = Type.DOUBLE;

        this.shipSize = null;
        this.booleanStat = null;
        this.rawFloat = null;
        this.intStat = null;
        this.statGroup = null;
    }

    public ShipStatisticData(ShipCharacteristic shipCharacteristic,StatGroup statGroup)
    {
        this.shipCharacteristic = shipCharacteristic;
        this.statGroup = statGroup;
        statType = Type.GROUP;

        this.floatStat = statGroup.floatStat;
        this.rawFloat = statGroup.rawFloat;
        this.shipSize = null;
        this.booleanStat = null;
        this.intStat = null;

    }

    public ShipStatisticData(ShipCharacteristic shipCharacteristic, int intStat)
    {
        this.shipCharacteristic = shipCharacteristic;
        this.intStat = intStat;
        statType = Type.INTEGER;

        this.shipSize = null;
        this.floatStat = null;
        this.rawFloat = null;
        this.booleanStat = null;
        this.statGroup = null;
    }

    public ShipStatisticData(ShipSize shipSize)
    {
        this.shipCharacteristic = ShipCharacteristic.Landing_Pad_Size;
        this.shipSize = shipSize;
        statType = Type.SIZE;

        this.booleanStat = null;
        this.floatStat = null;
        this.rawFloat = null;
        this.intStat = null;
        this.statGroup = null;
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
            default: return "unknown";
        }
    }

    public String rawStatDisplayValue()
    {
        if (rawFloat != null)
        {
            return String.valueOf(rawFloat);
        }
        return "";
    }
}
