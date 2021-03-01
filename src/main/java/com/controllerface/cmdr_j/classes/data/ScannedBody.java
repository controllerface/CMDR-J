package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.utilities.JSONSupport;
import com.controllerface.cmdr_j.utilities.database.EntityKeys;
import jetbrains.exodus.entitystore.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScannedBody extends StellarBody
{
    private final Map<String, Object> scanData;
    public ScannedBody(BodyType type,
                       String name,
                       int id,
                       long address,
                       Map<String, Object> scanData)
    {
        super(type, name, id, address);
        this.scanData = scanData;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void storeBodyData(Entity bodyEntity)
    {
        bodyEntity.setProperty(EntityKeys.STELLAR_BODY_ID, id);
        bodyEntity.setProperty(EntityKeys.STELLAR_BODY_NAME, name);
        bodyEntity.setProperty(EntityKeys.STELLAR_BODY_TYPE, type.name());

        scanData.forEach((name, value)->
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
