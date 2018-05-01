package com.controllerface.edeps.structures.craftable.synthesis;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/12/2018.
 */
public enum SynthesisCategory
{
    Munitions(SynthesisType.Ammunition,
            SynthesisType.Human_Tech,
            SynthesisType.Anti_Xeno,
            SynthesisType.Guardian_Tech),

    Utility(SynthesisType.SRV,
            SynthesisType.Ship);

    private final SynthesisType[] modificationTypes;

    SynthesisCategory(SynthesisType ... modificationTypes)
    {
        this.modificationTypes = modificationTypes;
    }

    public Stream<SynthesisType> typeStream()
    {
        return Arrays.stream(modificationTypes);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
