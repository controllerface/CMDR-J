package com.controllerface.cmdr_j.structures.equipment.ships;

/**
 * Created by Controllerface on 4/30/2018.
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
