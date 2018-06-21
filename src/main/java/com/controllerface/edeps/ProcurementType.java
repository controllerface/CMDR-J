package com.controllerface.edeps;


/**
 * Procurement tasks fall under a number of overarching "types" and this interface defines that relationship. Mostly
 * a marker interface, a single string returning name function is used to create descriptions for different UI elements.
 *
 * Created by Controllerface on 4/10/2018.
 */
public interface ProcurementType
{
    String getName();
}
