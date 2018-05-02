package com.controllerface.edeps.structures.equipment.ships;

/**
 * Created by Stephen on 4/30/2018.
 */
public enum ShipManufacturer
{
    Core_Dynamics,
    Faulcon_DeLacy,
    Gutamaya,
    Lakon,
    Saud_Kruger,
    Zorgon_Peterson,

    ;

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}