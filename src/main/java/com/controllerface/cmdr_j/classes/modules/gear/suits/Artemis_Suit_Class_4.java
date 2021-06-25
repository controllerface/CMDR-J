package com.controllerface.cmdr_j.classes.modules.gear.suits;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.AbstractGear;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Artemis_Suit_Class_4 extends AbstractGear
{
    // todo: add data
    public Artemis_Suit_Class_4()
    {
        super("Artemis Suit - Class 4",
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