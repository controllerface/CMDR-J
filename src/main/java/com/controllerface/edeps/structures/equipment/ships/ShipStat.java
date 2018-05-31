package com.controllerface.edeps.structures.equipment.ships;

/**
 * Created by Controllerface on 4/30/2018.
 */
public enum ShipStat
{
    Size,
    Mass_Lock_Factor,
    Crew_Seats,
    SLF_Capable,
    Manufacturer,
    Base_Cost,

    Agility,
    Speed,
    Max_Speed,
    Boost_Speed,
    Max_Boost_Speed,

    Base_Hull_Mass,
    Hull_Hardness,

    Armor_Rating,
    Base_Shield,

    Unladen_Mass,

    Shield_Strength,
    Shield_Explosive_Resistance,
    Shield_Kinetic_Resistance,
    Shield_Thermal_Resistance,

    Hull_Strength,
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
