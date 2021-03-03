package com.controllerface.cmdr_j.classes.modules.optional.shields.generators.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.shields.generators.AbstractShieldGenerator;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldGenerator_1E extends AbstractShieldGenerator
{
    public ShieldGenerator_1E()
    {
        super(new ItemEffects(
                new ItemEffectData(ItemEffect.Size, 1.0),
                new ItemEffectData(ItemEffect.Class, "E")
        ));
    }

    @Override
    public long price()
    {
        return 0;
    }
}
