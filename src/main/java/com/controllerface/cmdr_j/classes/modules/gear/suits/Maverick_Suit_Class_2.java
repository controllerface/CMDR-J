package com.controllerface.cmdr_j.classes.modules.gear.suits;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.AbstractGear;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Maverick_Suit_Class_2 extends AbstractGear
{
    // todo: add data
    public Maverick_Suit_Class_2()
    {
        super("Maverick Suit - Class 2",
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