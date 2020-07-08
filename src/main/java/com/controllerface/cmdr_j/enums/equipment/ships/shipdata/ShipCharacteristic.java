package com.controllerface.cmdr_j.enums.equipment.ships.shipdata;

/**
 * Created by Controllerface on 4/30/2018.
 */
public enum ShipCharacteristic
{
    Landing_Pad_Size,

    Armor_Rating,
    Base_Shield,

    Shield_Recharge,
    Shield_Strength,
    Hull_Strength,
    Shield_Explosive,
    Shield_Kinetic,
    Shield_Thermal,
    Armour_Explosive,
    Armour_Kinetic,
    Armour_Thermal,
    Armour_Caustic,


    Mass_Lock_Factor,
    Crew_Seats,
    SLF_Capable,
    Manufacturer,
    Base_Cost,

    Maximum_DPS,

    Agility,
    Speed,
    Max_Speed,
    Boost_Speed,
    Max_Boost_Speed,

    Base_Hull_Mass,
    Hull_Hardness,
    Current_Mass,
    Unladen_Mass,
    Current_Jump_Range,

    Total_Power_Draw,

    ;

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
