package com.controllerface.cmdr_j.classes.modules.optional.supercruiseassist;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.dockingcomputer.AbstractDockingComputer;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SuperCruiseAssist_0E extends AbstractDockingComputer
{
    public SuperCruiseAssist_0E()
    {
        // todo: update with actual stats, copied from docking computer
        super("Supercruise Assist",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 10d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.39d),
                        new ItemEffectData(ItemEffect.BootTime, 3d)
                ));
    }

    @Override
    public long price()
    {
        return 9_121;
    }
}
