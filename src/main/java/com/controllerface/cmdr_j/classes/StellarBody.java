package com.controllerface.cmdr_j.classes;

import jetbrains.exodus.entitystore.Entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        BlackHole,
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

    public Map<String, Object> toMap()
    {
        var data = new HashMap<String, Object>();
        data.put("type", type.name());
        data.put("name", name);
        data.put("id", id);
        data.put("address", address);
        return data;
    }
}
