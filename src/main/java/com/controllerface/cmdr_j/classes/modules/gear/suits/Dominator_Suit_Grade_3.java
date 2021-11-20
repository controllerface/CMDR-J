package com.controllerface.cmdr_j.classes.modules.gear.suits;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.AbstractGear;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Dominator_Suit_Grade_3 extends AbstractGear
{
    public Dominator_Suit_Grade_3()
    {
        super("Dominator Suit - Grade 3",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Suit_Shield_Regen, 1.65),
                    new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 22.5),
                    new ItemEffectData(ItemEffect.Suit_Mod_Slots, 2.0),
                    new ItemEffectData(ItemEffect.Suit_Dual_Primary_Slots, "Suit Standard")
                ));
    }

    @Override
    public long price()
    {
        return 100;
    }
}