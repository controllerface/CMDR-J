package com.controllerface.cmdr_j.classes.modules.gear.suits;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.AbstractGear;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Dominator_Suit_Grade_4 extends AbstractGear
{
    public Dominator_Suit_Grade_4()
    {
        super("Dominator Suit - Grade 4",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Suit_Shield_Regen, 2.02),
                    new ItemEffectData(ItemEffect.Suit_Shield_Capacity, 27.6),
                    new ItemEffectData(ItemEffect.Suit_Mod_Slots, 3.0),
                    new ItemEffectData(ItemEffect.Suit_Dual_Primary_Slots, "Suit Standard")
                ));
    }

    @Override
    public long price()
    {
        return 100;
    }
}