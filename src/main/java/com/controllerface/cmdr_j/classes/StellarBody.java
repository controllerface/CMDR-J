package com.controllerface.cmdr_j.classes;

import jetbrains.exodus.entitystore.Entity;

public abstract class StellarBody
{
    public final BodyType type;
    public final String name;
    public final int id;

    protected StellarBody(BodyType type, String name, int id)
    {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public enum BodyType
    {
        Star,
        Planet,
        Cluster,
        Ring;

        public static StellarBody.BodyType determineType(String type)
        {
            if (type.equalsIgnoreCase("Star"))
            {
                return StellarBody.BodyType.Star;
            }
            else
            {
                // todo: do other types if necessary
                return StellarBody.BodyType.Planet;
            }
        }
    }

    public abstract void storeBodyData(Entity entity);
}
