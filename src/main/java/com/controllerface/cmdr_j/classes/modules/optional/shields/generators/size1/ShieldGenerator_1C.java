package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_1C extends AbstractShieldGenerator
{
    public ShieldGenerator_1C()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "C")
        ));
    }

    @Override
    public long price()
    {
        return 0;
    }
}
