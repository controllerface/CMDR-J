package com.controllerface.cmdr_j.classes.modules.gear.suits;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.AbstractGear;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Maverick_Suit_Grade_2 extends AbstractGear
{
    public Maverick_Suit_Grade_2()
    {
        super("Maverick Suit - Grade 2",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Suit_Shield_Regen, 1.21),
                    new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 16.5),
                    new ItemEffectData(ItemEffect.Suit_Mod_Slots, 1.0),
                    new ItemEffectData(ItemEffect.Suit_Arc_Cutter, "Suit Standard")
                ));
    }

    @Override
    public long price()
    {
        return 100;
    }
}