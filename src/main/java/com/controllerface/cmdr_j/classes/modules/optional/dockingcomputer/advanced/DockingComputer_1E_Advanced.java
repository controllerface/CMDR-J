package com.controllerface.cmdr_j.classes.modules.optional.dockingcomputer.advanced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.dockingcomputer.AbstractDockingComputer;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DockingComputer_1E_Advanced extends AbstractDockingComputer
{
    public DockingComputer_1E_Advanced()
    {
        super("Advanced Docking Computer",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Integrity, 10d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.39d),
                        new ItemEffectData(ItemEffect.BootTime, 3d)
                ));
    }

    @Override
    public long price()
    {
        return 13_509;
    }
}
