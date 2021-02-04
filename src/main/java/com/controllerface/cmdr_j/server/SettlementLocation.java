package com.controllerface.cmdr_j.server;

import java.util.HashMap;
import java.util.Map;

public class SettlementLocation
{
    public final double latitude;
    public final double longitude;
    public final String name;

    public SettlementLocation(double latitude, double longitude, String name)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public Map<String, Object> toMap()
    {
        var dataMap = new HashMap<String, Object>();
        dataMap.put("latitude", latitude);
        dataMap.put("longitude", longitude);
        dataMap.put("name", name);
        return dataMap;
    }
}
