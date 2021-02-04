package com.controllerface.cmdr_j.server;

import java.util.HashMap;
import java.util.Map;

public class LocalCoordinates
{
    public final boolean nearPlanet;
    public final double latitude;
    public final double longitude;
    public final double altitude;
    public final double heading;
    public final double radius;

    public LocalCoordinates(boolean nearPlanet,
                            double latitude,
                            double longitude,
                            double altitude,
                            double heading,
                            double radius)
    {
        this.nearPlanet = nearPlanet;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.heading = heading;
        this.radius = radius;
    }

    public Map<String, Object> toMap()
    {
        var dataMap = new HashMap<String, Object>();
        dataMap.put("nearPlanet", nearPlanet);
        dataMap.put("latitude", latitude);
        dataMap.put("longitude", longitude);
        dataMap.put("altitude", altitude);
        dataMap.put("heading", heading);
        dataMap.put("radius", radius);

        var xTest = radius * Math.cos(latitude) * Math.cos(longitude);
        var yTest = radius * Math.cos(latitude) * Math.sin(longitude);

        dataMap.put("x", xTest);
        dataMap.put("y", yTest);

        return dataMap;
    }
}
