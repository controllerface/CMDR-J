package com.controllerface.cmdr_j.classes.modules.gear.suits;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.AbstractGear;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Maverick_Suit_Grade_4 extends AbstractGear
{
    public Maverick_Suit_Grade_4()
    {
        super("Maverick Suit - Grade 4",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Suit_Shield_Regen, 1.82),
                    new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 24.9),
                    new ItemEffectData(ItemEffect.Suit_Mod_Slots, 3.0),
                    new ItemEffectData(ItemEffect.Suit_Arc_Cutter, "Suit Standard")
                ));
    }

    @Override
    public long price()
    {
        return 100;
    }
}