package com.controllerface.edeps.structures.equipment.ships;

/**
 * Created by Stephen on 4/30/2018.
 */
public enum ShipStat
{
    Size,
    Agility,
    Base_Hull_Mass,
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

    Unladen_Mass,
    Hull_Strength,
    Shield_Strength,
    Shield_Explosive_Resistance,
    Shield_Kinetic_Resistance,
    Shield_Thermal_Resistance,
    Armour_Caustic_Resistance,
    Armour_Explosive_Resistance,
    Armour_Kinetic_Resistance,
    Armour_Thermal_Resistance,

    ;

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
