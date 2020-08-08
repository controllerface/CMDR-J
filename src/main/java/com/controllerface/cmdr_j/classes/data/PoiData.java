package com.controllerface.cmdr_j.classes.data;

import jetbrains.exodus.entitystore.EntityId;

public class PoiData
{
    public final EntityId entityId;
    public final String poiText;

    public PoiData(EntityId entityId, String poiText)
    {
        this.entityId = entityId;
        this.poiText = poiText;
    }
}
