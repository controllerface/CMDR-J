package com.controllerface.edeps.data;

import com.controllerface.edeps.Immutable;
import com.controllerface.edeps.structures.common.ItemEffect;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/6/2018.
 */
@Immutable
public class ItemEffectData
{
    private final Pair<ItemEffect, Double>[] effects;

    public ItemEffectData(Pair<ItemEffect, Double> ... effectPairs)
    {
        this.effects = effectPairs;
    }

    public Stream<Pair<ItemEffect, Double>> pairStream()
    {
        return Arrays.stream(effects);
    }
}
