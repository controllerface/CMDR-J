package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.database.EntityKeys;
import jetbrains.exodus.entitystore.Entity;

import java.util.HashMap;
import java.util.Map;

public class GenericBody extends StellarBody
{
    public GenericBody(BodyType type, String name, int id, long address)
    {
        super(type, name, id, address);
    }

    @Override
    public void storeBodyData(Entity bodyEntity)
    {
        bodyEntity.setProperty(EntityKeys.STELLAR_BODY_ID, id);
        bodyEntity.setProperty(EntityKeys.STELLAR_BODY_NAME, name);
        bodyEntity.setProperty(EntityKeys.STELLAR_BODY_TYPE, type.name());
    }
}
