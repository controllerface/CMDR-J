package com.controllerface.cmdr_j.classes.data;

import jetbrains.exodus.entitystore.Entity;
import jetbrains.exodus.entitystore.EntityIterable;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class EntityKeys
{
    public static final String COMMANDER = "commander";
    public static final String STAR_SYSTEM = "star_system";
    public static final String POI_NOTES = "poi_notes";

    public static final String NAME = "name";

    public static Stream<Entity> entityStream(EntityIterable iterable)
    {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
