package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.utilities.database.EntityKeys;
import jetbrains.exodus.entitystore.Entity;

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
