package com.controllerface.edeps.data;

import com.controllerface.edeps.structures.equipment.ItemEffect;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Container class intended to hold several individual item effects, to group them together, for example to store all
 * the standard effects of a weapon, or all fo the modifications done to some module.
 *
 * Created by Stephen on 4/6/2018.
 */
public class ItemEffects
{
    private final ItemEffectData[] effects;

    public ItemEffects(ItemEffectData ... effectPairs)
    {
        this.effects = effectPairs;
    }

    public Stream<ItemEffectData> effectStream()
    {
        return Arrays.stream(effects);
    }

    public static ItemEffects EMPTY = new ItemEffects()
    {
        @Override
        public Stream<ItemEffectData> effectStream()
        {
            return Stream.empty();
        }
    };
}
