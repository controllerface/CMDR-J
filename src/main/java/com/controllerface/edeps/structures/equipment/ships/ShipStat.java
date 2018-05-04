package com.controllerface.edeps.structures.equipment.ships;

/**
 * Created by Stephen on 4/30/2018.
 */
public enum ShipStat
{
    Size,
    Agility,
    Hull_Mass,
    Hull_Hardness,
    Speed,
    Max_Speed,
    Boost_Speed,
    Max_Boost_Speed,
    Armor_Rating,
    Base_Shield,
    Manufacturer,
    Base_Cost,
    Mass_Lock_Factor,
    Crew_Seats,
    SLF_Capable,

    ;

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
