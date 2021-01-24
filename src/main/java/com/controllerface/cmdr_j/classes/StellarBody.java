package com.controllerface.cmdr_j.classes;

import jetbrains.exodus.entitystore.Entity;

import java.util.Arrays;

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
        PlanetaryRing,
        StellarRing,
        Station,
        AsteroidCluster,
        Unknown;

        public static StellarBody.BodyType determineType(String type)
        {
            return Arrays.stream(BodyType.values())
                .filter(bodyType->bodyType.toString().equalsIgnoreCase(type))
                .findFirst().orElse(Unknown);
        }
    }

    public abstract void storeBodyData(Entity entity);
}
