package com.controllerface.cmdr_j.classes.modules.core.cockpit;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fueltank.AbstractFuelTank;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class GenericCockpit extends AbstractCockpit
{
    public GenericCockpit(String displayText)
    {
        super(displayText,
                new ItemEffects(
                        new ItemEffectData(ItemEffect.cockpit, "Installed")
                ));
    }

    @Override
    public long price()
    {
        return 0;
    }
}