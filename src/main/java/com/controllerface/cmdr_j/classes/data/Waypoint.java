package com.controllerface.cmdr_j.classes.data;

public class Waypoint
{
    public final String name;
    public final double latitude;
    public final double longitude;

    public Waypoint(String name, double latitude, double longitude)
    {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
