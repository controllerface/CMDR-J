package com.controllerface.cmdr_j.classes.modules.core.cargobay;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GenericCargoBay extends AbstractCargoBay
{
    public GenericCargoBay()
    {
        super("",
                new ItemEffects(
                    new ItemEffectData(ItemEffect.cargo_door, "Installed"),
                    new ItemEffectData(ItemEffect.PowerDraw, 0.6d)
                ));
    }

    @Override
    public long price()
    {
        return 0;
    }
}