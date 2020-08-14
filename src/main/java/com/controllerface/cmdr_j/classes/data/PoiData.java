package com.controllerface.cmdr_j.classes.data;

import jetbrains.exodus.entitystore.EntityId;

public class PoiData
{
    public final EntityId entityId;
    public final String systemName;
    public final String poiText;

    public PoiData(EntityId entityId, String systemName, String poiText)
    {
        this.entityId = entityId;
        this.systemName = systemName;
        this.poiText = poiText;
    }
}
