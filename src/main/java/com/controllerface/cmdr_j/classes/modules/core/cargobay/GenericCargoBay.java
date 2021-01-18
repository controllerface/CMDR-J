package com.controllerface.cmdr_j.classes.modules.core.cargobay;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GenericCargoBay extends AbstractCargoBay
{
    public GenericCargoBay()
    {
        super("",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.cargo_door, "Installed")
                ));
    }

    @Override
    public long price()
    {
        return 0;
    }
}