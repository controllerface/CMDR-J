package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Container class intended to hold several individual item effects, to group them together, for example to store all
 * the standard effects of a weapon, or all fo the modifications done to some module.
 *
 * Created by Controllerface on 4/6/2018.
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

    public Optional<ItemEffectData> effectByName(ItemEffect effect)
    {
        return effectStream().filter(e->e.effect == effect)
                .findFirst();
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
