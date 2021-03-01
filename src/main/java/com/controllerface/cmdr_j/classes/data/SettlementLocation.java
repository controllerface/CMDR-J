package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.utilities.JSONSupport;
import com.controllerface.cmdr_j.utilities.database.EntityKeys;
import jetbrains.exodus.entitystore.Entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SettlementLocation
{
    public final double latitude;
    public final double longitude;
    public final long marketId;
    public final String name;
    public final String bodyName;
    public final Map<String, Object> details;

    public SettlementLocation(double latitude,
                              double longitude,
                              long marketId,
                              String name,
                              String bodyName,
                              Map<String, Object> details)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.marketId = marketId;
        this.name = name;
        this.bodyName = bodyName;
        this.details = details;
    }

    public SettlementLocation(double latitude,
                              double longitude,
                              long marketId,
                              String name,
                              String bodyName)
    {
        this(latitude, longitude, marketId, name, bodyName, Collections.emptyMap());
    }

    public SettlementLocation cloneWithDetails(Map<String, Object> details)
    {
        return new SettlementLocation(latitude, longitude, marketId, name, bodyName, details);
    }

    public Map<String, Object> toMap()
    {
        var dataMap = new HashMap<String, Object>();
        dataMap.put("latitude", latitude);
        dataMap.put("longitude", longitude);
        dataMap.put("marketId", marketId);
        dataMap.put("name", name);
        return dataMap;
    }

    @SuppressWarnings("rawtypes")
    public void storeSettlementData(Entity bodyEntity)
    {
        bodyEntity.setProperty(EntityKeys.PLANETARY_SETTLEMENT_NAME, name);
        bodyEntity.setProperty(EntityKeys.STELLAR_BODY_NAME, bodyName);
        bodyEntity.setProperty(EntityKeys.MARKET_ID, marketId);
        bodyEntity.setProperty(EntityKeys.LATITUDE, latitude);
        bodyEntity.setProperty(EntityKeys.LONGITUDE, longitude);

        details.forEach((name, value)->
        {
            if (value instanceof List)
            {
                var json = new HashMap<String, Object>();
                json.put("json", value);
                bodyEntity.setBlobString(name, JSONSupport.Write.jsonToString.apply(json));
                return;
            }
            if (value instanceof Map)
            {
                var json = new HashMap<String, Object>();
                json.put("json", value);
                bodyEntity.setBlobString(name, JSONSupport.Write.jsonToString.apply(json));
                return;
            }
            if (value instanceof String)
            {
                if (((String) value).isEmpty())
                {
                    return;
                }
            }
            if (value instanceof Comparable)
            {
                bodyEntity.setProperty(name, ((Comparable) value));
            }
        });
    }
}
