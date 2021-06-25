package com.controllerface.cmdr_j.classes.modules.gear.suits;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.AbstractGear;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Dominator_Suit_Class_5 extends AbstractGear
{
    // todo: add data
    public Dominator_Suit_Class_5()
    {
        super("Dominator Suit - Class 5",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Ground_Gear, "Suit")
                ));
    }

    @Override
    public long price()
    {
        return 100;
    }
}