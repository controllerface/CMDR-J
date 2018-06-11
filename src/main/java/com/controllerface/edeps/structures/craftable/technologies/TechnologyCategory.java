package com.controllerface.edeps.structures.craftable.technologies;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum TechnologyCategory
{
    Human(EnumSet.of(TechnologyType.Human_Weapons,
            TechnologyType.Human_Optional_Internal)),

    Guardian(EnumSet.of(TechnologyType.Guardian_Weapons,
            TechnologyType.Guardian_Optional_Internal,
            TechnologyType.Guardian_Core_Internal));


    private final EnumSet<TechnologyType> modificationTypes;

    TechnologyCategory(EnumSet<TechnologyType> modificationTypes)
    {
        this.modificationTypes = modificationTypes;
    }

    public Stream<TechnologyType> typeStream()
    {
        return modificationTypes.stream();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
