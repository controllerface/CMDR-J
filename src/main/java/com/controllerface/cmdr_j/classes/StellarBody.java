package com.controllerface.cmdr_j.classes;

import jetbrains.exodus.entitystore.Entity;

import java.util.Arrays;

public abstract class StellarBody
{
    public final BodyType type;
    public final String name;
    public final int id;
    public final long address;

    protected StellarBody(BodyType type, String name, int id, long address)
    {
        this.name = name;
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public enum BodyType
    {
        Star,
        Planet,
        Moon,
        RoguePlanet,
        PlanetaryRing,
        StellarRing,
        Station,
        AsteroidCluster,
        Null, // barycentre
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
