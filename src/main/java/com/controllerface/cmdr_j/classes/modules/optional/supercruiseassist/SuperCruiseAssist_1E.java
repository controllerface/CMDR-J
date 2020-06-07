package com.controllerface.cmdr_j.classes.modules.optional.supercruiseassist;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.dockingcomputer.AbstractDockingComputer;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SuperCruiseAssist_1E extends AbstractDockingComputer
{
    public SuperCruiseAssist_1E()
    {
        super("1E Supercruise Assist",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Integrity, 10d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.30d),
                        new ItemEffectData(ItemEffect.Mass, 0d)
                ));
    }

    @Override
    public long price()
    {
        return 9_121;
    }
}
