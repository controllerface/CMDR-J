package com.controllerface.cmdr_j.classes.data;

import jetbrains.exodus.entitystore.Entity;
import jetbrains.exodus.entitystore.EntityIterable;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class EntityKeys
{
    public static final String COMMANDER = "commander";
    public static final String STAR_SYSTEM = "star_system";
    public static final String STAR_SYSTEM_ADDRESS = "system_address";
    public static final String STAR_SYSTEM_X = "system_pos_x";
    public static final String STAR_SYSTEM_Y = "system_pos_y";
    public static final String STAR_SYSTEM_Z = "system_pos_z";
    public static final String STELLAR_BODY = "stellar_body";
    public static final String STELLAR_BODY_ID = "stellar_body_id";
    public static final String STELLAR_BODY_NAME = "stellar_body_name";
    public static final String STELLAR_BODY_TYPE = "stellar_body_type";
    public static final String POI_NOTES = "poi_notes";

    public static final String NAME = "name";

    public static Stream<Entity> entityStream(@Nullable EntityIterable iterable)
    {
        if (iterable == null) return Stream.empty();
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
