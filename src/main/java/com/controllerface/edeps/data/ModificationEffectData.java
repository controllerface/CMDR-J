package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.common.ItemEffect;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/6/2018.
 */
public class ModificationEffectData
{
    private final Pair<ItemEffect, Double>[] effects;

    public ModificationEffectData(Pair<ItemEffect, Double> ... effectPairs)
    {
        this.effects = effectPairs;
    }

    public Stream<Pair<ItemEffect, Double>> pairStream()
    {
        return Arrays.stream(effects);
    }
}
