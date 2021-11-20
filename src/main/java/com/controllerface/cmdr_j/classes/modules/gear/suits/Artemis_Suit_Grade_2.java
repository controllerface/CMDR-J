package com.controllerface.cmdr_j.classes.modules.gear.suits;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.AbstractGear;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Artemis_Suit_Grade_2 extends AbstractGear
{
    public Artemis_Suit_Grade_2()
    {
        super("Artemis Suit - Grade 2",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Suit_Shield_Regen, 1.07),
                    new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 14.7),
                    new ItemEffectData(ItemEffect.Suit_Mod_Slots, 1.0),
                    new ItemEffectData(ItemEffect.Suit_Exobiology_Scanner, "Suit Standard")
                ));
    }

    @Override
    public long price()
    {
        return 100;
    }
}