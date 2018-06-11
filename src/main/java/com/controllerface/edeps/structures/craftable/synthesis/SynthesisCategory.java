package com.controllerface.edeps.structures.craftable.synthesis;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum SynthesisCategory
{
    Munitions(EnumSet.of(SynthesisType.Ammunition,
            SynthesisType.Human_Tech,
            SynthesisType.Anti_Xeno,
            SynthesisType.Guardian_Tech)),

    Utility(EnumSet.of(SynthesisType.SRV,
            SynthesisType.Ship));

    private final EnumSet<SynthesisType> modificationTypes;

    SynthesisCategory(EnumSet<SynthesisType> modificationTypes)
    {
        this.modificationTypes = modificationTypes;
    }

    public Stream<SynthesisType> typeStream()
    {
        return modificationTypes.stream();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
