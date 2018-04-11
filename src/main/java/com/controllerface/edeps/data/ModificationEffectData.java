package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.effects.ModificationEffect;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/6/2018.
 */
public class ModificationEffectData
{
    private final Pair<ModificationEffect, Double>[] effects;

    public ModificationEffectData(Pair<ModificationEffect, Double> ... effectPairs)
    {
        this.effects = effectPairs;
    }

    public Stream<Pair<ModificationEffect, Double>> pairStream()
    {
        return Arrays.stream(effects);
    }
}
