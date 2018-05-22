package com.controllerface.edeps.structures.craftable.technologies;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum TechnologyCategory
{
    Human(TechnologyType.Human_Weapons,
            TechnologyType.Human_Optional_Internal),

    Guardian(TechnologyType.Guardian_Weapons,
            TechnologyType.Guardian_Optional_Internal,
            TechnologyType.Guardian_Core_Internal);


    private final TechnologyType[] modificationTypes;

    TechnologyCategory(TechnologyType ... modificationTypes)
    {
        this.modificationTypes = modificationTypes;
    }

    public Stream<TechnologyType> typeStream()
    {
        return Arrays.stream(modificationTypes);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
