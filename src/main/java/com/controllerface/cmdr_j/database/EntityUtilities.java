package com.controllerface.cmdr_j.database;

import jetbrains.exodus.entitystore.Entity;
import jetbrains.exodus.entitystore.EntityIterable;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class EntityUtilities
{
    public static Stream<Entity> entityStream(@Nullable EntityIterable iterable)
    {
        if (iterable == null) return Stream.empty();
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
